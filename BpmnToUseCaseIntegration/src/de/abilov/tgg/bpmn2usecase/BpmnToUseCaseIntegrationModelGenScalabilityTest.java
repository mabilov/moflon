package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.moflon.tgg.algorithm.modelgenerator.*;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;


import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;


public class BpmnToUseCaseIntegrationModelGenScalabilityTest extends DebugSynchronizationHelper{

   public BpmnToUseCaseIntegrationModelGenScalabilityTest()
   {
      super(BpmnToUseCaseIntegrationPackage.eINSTANCE, ".");
   }

	private BufferedWriter writer;
	
	public static void main(String[] args) throws IOException
	{
		// Set up logging
		BasicConfigurator.configure();

		BpmnToUseCaseIntegrationModelGenScalabilityTest test = new BpmnToUseCaseIntegrationModelGenScalabilityTest();
      	test.initWriter();

		int[] durations = new int[] { 100, 250, 500, 750, 1000, 2000, 5000, 10000 };
		for (int duration : durations)
		{
			AbstractModelGenerationController controller = new DefaultModelGenController();
			controller.addContinuationController(new TimeoutController(duration));
			controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));
			ModelGenerator gen = new ModelGenerator(BpmnToUseCaseIntegrationPackage.eINSTANCE, controller, false, false);
			GenerationResult result = gen.generate();
			int performs = result.getModelgenStats().getTotalRulePerformCount();
			double ratio = (double) performs / (double) result.getModelgenStats().getTotalDuration();

			test.appendLine(duration, performs, ratio);
		}
		test.closeWriter();
	}

	protected void initWriter() throws IOException
	{
		long timestamp = System.currentTimeMillis();
		File resultFolder = new File("scalability_results/modelgen");
		resultFolder.mkdirs();
		writer = new BufferedWriter(new FileWriter(new File(resultFolder.getPath() + "/" + timestamp + "_results.csv")));
		writer.write("sep=;");
		writer.newLine();
		writer.write("Modelgen duration; Modelgen performs; performs/ms");
		writer.newLine();
	}

	protected void appendLine(int modelgenDuration, int currentPerformCount, double ratio) throws IOException
	{
		writer.append(modelgenDuration + "; " + currentPerformCount + "; " + round(ratio,2));
		writer.newLine();
	}

	protected void closeWriter() throws IOException
	{
		writer.close();
	}

	public static double round(double value, int places)
	{
		if (places < 0)
			throw new IllegalArgumentException();
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}