package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import UseCaseCodeAdapter.UseCaseCodeAdapterPackage;


public class UseCaseCodeAdapterModelGen extends SynchronizationHelper {

	public UseCaseCodeAdapterModelGen() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(UseCaseCodeAdapterPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(UseCaseCodeAdapterPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("(Context_Rule_Name)", 1));

		ModelGenerator gen = new ModelGenerator(UseCaseCodeAdapterPackage.eINSTANCE, controller);
		gen.generate();
	}
}