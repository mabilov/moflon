package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;


public class BpmnToUseCaseIntegrationModelGen extends SynchronizationHelper {

	public BpmnToUseCaseIntegrationModelGen() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(BpmnToUseCaseIntegrationPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(BpmnToUseCaseIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		//controller.getDeadlineControllers().add(new MaxRulePerformCounterController(20));
		controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("CHANGE_ME", 1));
		controller.setEObjectSelector(new RandomEObjectSelector());

		ModelGenerator gen = new ModelGenerator(BpmnToUseCaseIntegrationPackage.eINSTANCE, controller);
		gen.generate();
	}
}