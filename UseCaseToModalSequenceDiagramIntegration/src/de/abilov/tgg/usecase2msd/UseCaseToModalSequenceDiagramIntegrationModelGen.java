package de.abilov.tgg.usecase2msd;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;


public class UseCaseToModalSequenceDiagramIntegrationModelGen extends SynchronizationHelper {

	public UseCaseToModalSequenceDiagramIntegrationModelGen() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("(Context_Rule_Name)", 1));

		ModelGenerator gen = new ModelGenerator(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE, controller);
		gen.generate();
	}
}