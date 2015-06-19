package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.eclipse.emf.ecore.EPackage;


import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;


public class BpmnToUseCaseIntegrationModelGen extends DebugSynchronizationHelper{

   public BpmnToUseCaseIntegrationModelGen()
   {
      super(BpmnToUseCaseIntegrationPackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));

		ModelGenerator gen = new ModelGenerator(BpmnToUseCaseIntegrationPackage.eINSTANCE, controller);
		gen.generate();
	}
}