package de.abilov.tgg.usecase2msd;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.eclipse.emf.ecore.EPackage;


import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;


public class UseCaseToModalSequenceDiagramIntegrationModelGen extends DebugSynchronizationHelper{

   public UseCaseToModalSequenceDiagramIntegrationModelGen()
   {
      super(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));

		ModelGenerator gen = new ModelGenerator(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE, controller);
		gen.generate();
	}
}