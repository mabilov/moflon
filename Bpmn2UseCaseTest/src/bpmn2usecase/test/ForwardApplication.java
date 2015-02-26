package bpmn2usecase.test;

import org.apache.log4j.BasicConfigurator;

import de.abilov.tgg.bpmn2usecase.BpmnToUseCaseIntegrationTrafo;

public class ForwardApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
        try {
        	BpmnToUseCaseIntegrationTrafo helper = new BpmnToUseCaseIntegrationTrafo();
	        helper.run(args);
	        System.out.println("Completed " + helper.getDirection() +  " transformation!");
        } catch(Exception e) {
        	System.err.println(e.getMessage());
        	e.printStackTrace();
        }

	}

}
