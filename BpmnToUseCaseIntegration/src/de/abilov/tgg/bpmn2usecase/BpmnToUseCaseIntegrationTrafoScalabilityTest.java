package de.abilov.tgg.bpmn2usecase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.moflon.tgg.algorithm.modelgenerator.GenerationResult;
import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.AbstractModelGenerationController;
//import org.moflon.tie.BpmnToUseCaseIntegrationTrafo;
import org.moflon.tgg.algorithm.modelgenerator.controller.DefaultModelGenController;
import org.moflon.tgg.algorithm.modelgenerator.controller.LimitedRandomRuleSelector;
import org.moflon.tgg.algorithm.modelgenerator.controller.MaxModelSizeController;
import org.moflon.util.eMoflonEMFUtil;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import TGGLanguage.DomainType;


public class BpmnToUseCaseIntegrationTrafoScalabilityTest extends DebugSynchronizationHelper {

	public BpmnToUseCaseIntegrationTrafoScalabilityTest() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(BpmnToUseCaseIntegrationPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(BpmnToUseCaseIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	
	public static void main(String[] args) throws IOException
   {
      // Set up logging
      BasicConfigurator.configure();

      DomainType fwdBwd = parseDomainTypeFromArgs(args);
      int modelElementCount = parseModelElementCountFromArgs(args);
      runTrafoOnGeneratedModel(modelElementCount, fwdBwd);

   }

   private static long runTrafoOnGeneratedModel(int modelElementCount, DomainType domainType) throws IOException
   {
      BpmnToUseCaseIntegrationTrafo helper = new BpmnToUseCaseIntegrationTrafo();

      PrintWriter writer = createWriter(modelElementCount, domainType);

      AbstractModelGenerationController controller = new DefaultModelGenController();
      controller.addContinuationController(new MaxModelSizeController(modelElementCount, domainType));
      controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));
      ModelGenerator gen = new ModelGenerator(BpmnToUseCaseIntegrationPackage.eINSTANCE, controller, false, true);
      GenerationResult result = gen.generate();

      long duration = 0;

      boolean saveModels = false;
      if (domainType == DomainType.SOURCE)
      {
         helper.setSrc(result.getSrcModel());
         long timestamp = System.currentTimeMillis();
         helper.integrateForward();
         if (saveModels)
         {
            helper.saveTrg("instances/fwd.trg.xmi");
            helper.saveCorr("instances/fwd.corr.xmi");
            helper.saveSynchronizationProtocol("instances/fwd.protocol.xmi");
         }
         System.out.println("Completed forward transformation!");
         duration = System.currentTimeMillis() - timestamp;
      } else if (domainType == DomainType.TARGET)
      {
         helper.setTrg(result.getTrgModel());
         long timestamp = System.currentTimeMillis();
         helper.integrateBackward();
         duration = System.currentTimeMillis() - timestamp;
         if(saveModels) {
            helper.saveSrc("instances/bwd.trg.xmi");
            helper.saveCorr("instances/bwd.corr.xmi");
            helper.saveSynchronizationProtocol("instances/bwd.protocol.xmi");
            System.out.println("Completed backward transformation!");
         }
         
      }

      writer.println(duration);
      writer.close();
      return duration;
   }

   private static PrintWriter createWriter(int modelElementCount, DomainType domainType) throws IOException
   {
      String fwdBwd = "FWD";
      if (domainType == DomainType.TARGET)
      {
         fwdBwd = "BWD";
      }

      String folderName = "scalability_results/trafo/";
      File file = new File(folderName);
      file.mkdirs();
      String fileName = folderName + "/BpmnToUseCaseIntegration_" + modelElementCount + "_" + fwdBwd + ".txt";

      PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName), true)));
      return writer;
   }

   private static int parseModelElementCountFromArgs(String[] args)
   {
      if (args.length > 0)
      {
         try
         {
            int modelElementCount = Integer.parseInt(args[0]);
            return modelElementCount;
         } catch (NumberFormatException e)
         {

         }
      }
      return 1000;
   }

   private static DomainType parseDomainTypeFromArgs(String args[])
   {
      if (args.length > 1)
      {

         if (args[1].toLowerCase().equals("bwd"))
         {
            return DomainType.TARGET;
         }
      }
      return DomainType.SOURCE;
   }
}