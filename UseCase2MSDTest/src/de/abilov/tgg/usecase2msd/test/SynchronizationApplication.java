package de.abilov.tgg.usecase2msd.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;

import de.abilov.tgg.usecase2msd.UseCaseToModalSequenceDiagramIntegrationSync;

public class SynchronizationApplication {
	public static void main(String[] args) {
		BasicConfigurator.configure();
        try {
        	UseCaseToModalSequenceDiagramIntegrationSync helper = new UseCaseToModalSequenceDiagramIntegrationSync();
        	Map<String, String> params = new HashMap<String, String>();
        	params.put("direction", args[0]);
        	params.put("corr", args[1]);
        	params.put("protocol", args[2]);
        	params.put("new-source", args[3]);
        	params.put("new-target", args[4]);
        	params.put("new-corr", args[5]);
        	params.put("new-protocol", args[6]);
	        helper.run(params);
	        System.out.println("Completed " + params.get("direction") +  " transformation!");
        } catch(Exception e) {
        	System.err.println(e.getMessage());
        	e.printStackTrace();
        }

	}
}
