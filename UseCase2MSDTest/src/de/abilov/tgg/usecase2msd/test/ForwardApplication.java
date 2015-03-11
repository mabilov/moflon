package de.abilov.tgg.usecase2msd.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;

import de.abilov.tgg.usecase2msd.UseCaseToModalSequenceDiagramIntegrationTrafo;

public class ForwardApplication {
	public static void main(String[] args) {
		BasicConfigurator.configure();
        try {
        	UseCaseToModalSequenceDiagramIntegrationTrafo helper = new UseCaseToModalSequenceDiagramIntegrationTrafo();
        	Map<String, String> params = new HashMap<String, String>();
        	params.put("direction", args[0]);
        	params.put("source", args[1]);
        	params.put("target", args[2]);
        	params.put("corr", args[3]);
        	params.put("protocol", args[4]);
	        helper.run(params);
	        System.out.println("Completed " + params.get("direction") +  " transformation!");
        } catch(Exception e) {
        	System.err.println(e.getMessage());
        	e.printStackTrace();
        }

	}
}
