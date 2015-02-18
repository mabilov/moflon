package org.moflon.tie;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.eclipse.emf.common.util.URI;

import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowNode;
import bpmn2.GatewayDirection;
import bpmn2.IntermediateCatchEvent;
import bpmn2.Lane;
import bpmn2.ParallelGateway;
import bpmn2.Process;
import bpmn2.Bpmn2Factory;
import bpmn2.SequenceFlow;
import TGGRuntime.CorrespondenceModel;
import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;


public class BpmnToUseCaseIntegrationSync extends SynchronizationHelper {

	public BpmnToUseCaseIntegrationSync() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(BpmnToUseCaseIntegrationPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(BpmnToUseCaseIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

		// Propagate changes made to source
        BpmnToUseCaseIntegrationSync helper = new BpmnToUseCaseIntegrationSync();
		helper.syncForward("instances/fwd.corr.xmi");
		
		// Propagate changes made to target
		//helper = new BpmnToUseCaseIntegrationSync();
		//helper.syncBackward("instances/sync.fwd.corr.xmi");
	}

	public void syncForward(String corr) {
		setChangeSrc(root -> {
			Process process = (Process) ((DocumentRoot) root).getDefinitions()
					.get(0).getRootElements().stream()
					.filter(r -> r instanceof Process).findAny().get();
			Lane lane = process.getLaneSets().get(0).getLanes().stream()
						.filter(l -> l.getId().equals("financing")).findFirst().get();			
			
			EventBasedGateway wait_for_event = Bpmn2Factory.eINSTANCE.createEventBasedGateway();
			wait_for_event.setId("eventGw1");
			wait_for_event.setName("eventGw1");
			wait_for_event.setGatewayDirection(GatewayDirection.DIVERGING);
			process.getFlowElements().add(wait_for_event);
			lane.getFlowNodeRefs().add(wait_for_event);
			
			SequenceFlow seqFlow7 = (SequenceFlow) process.getFlowElements().stream()
					.filter(e -> e instanceof SequenceFlow 
						&& ((SequenceFlow)e).getId().equals("sf7")).findFirst().get();
			IntermediateCatchEvent payment_received = (IntermediateCatchEvent) seqFlow7.getTargetRef();
			seqFlow7.setTargetRef(wait_for_event);
			
			SequenceFlow seqFlow14 = Bpmn2Factory.eINSTANCE.createSequenceFlow();
			seqFlow14.setId("sf14");
			seqFlow14.setName("sf14");
			seqFlow14.setSourceRef(wait_for_event);
			seqFlow14.setTargetRef(payment_received);
			process.getFlowElements().add(seqFlow14);
			
			ExclusiveGateway ecgw2 = Bpmn2Factory.eINSTANCE.createExclusiveGateway();
			ecgw2.setId("ecgw2");
			ecgw2.setName("ecgw2");
			ecgw2.setGatewayDirection(GatewayDirection.CONVERGING);
			process.getFlowElements().add(ecgw2);
			lane.getFlowNodeRefs().add(ecgw2);
			
			SequenceFlow seqFlow15 = Bpmn2Factory.eINSTANCE.createSequenceFlow();
			seqFlow15.setId("sf15");
			seqFlow15.setName("sf15");
			seqFlow15.setSourceRef(ecgw2);
			ParallelGateway pcgw1 = (ParallelGateway) process.getFlowElements().stream()
					.filter(e -> e instanceof ParallelGateway 
							&& ((ParallelGateway)e).getId().equals("pcgw1")).findFirst().get();
			seqFlow15.setTargetRef(pcgw1);
			process.getFlowElements().add(seqFlow15);
			
			SequenceFlow seqFlow9 = (SequenceFlow) process.getFlowElements().stream()
					.filter(e -> e instanceof SequenceFlow 
							&& ((SequenceFlow)e).getId().equals("sf9")).findFirst().get();
			seqFlow9.setTargetRef(ecgw2);
			
			IntermediateCatchEvent delay_5d = Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent();
			delay_5d.setId("delay_5d");
			delay_5d.setName("delay > 5d");
			process.getFlowElements().add(delay_5d);
			lane.getFlowNodeRefs().add(delay_5d);
			
			SequenceFlow seqFlow16 = Bpmn2Factory.eINSTANCE.createSequenceFlow();
			seqFlow16.setId("sf16");
			seqFlow16.setName("sf16");
			seqFlow16.setSourceRef(wait_for_event);
			seqFlow16.setTargetRef(delay_5d);
			process.getFlowElements().add(seqFlow16);
			
			EndEvent cancel_order = Bpmn2Factory.eINSTANCE.createEndEvent();
			cancel_order.setId("cancel_order");
			cancel_order.setName("Cancel order");
			process.getFlowElements().add(cancel_order);
			lane.getFlowNodeRefs().add(cancel_order);
			
			SequenceFlow seqFlow17 = Bpmn2Factory.eINSTANCE.createSequenceFlow();
			seqFlow17.setId("sf17");
			seqFlow17.setName("sf17");
			seqFlow17.setSourceRef(delay_5d);
			seqFlow17.setTargetRef(cancel_order);
			process.getFlowElements().add(seqFlow17);
		});
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateForward();
		saveResult("fwd");
		
		System.out.println("Completed forward synchronization");
	}
	
	public void syncBackward(String corr) {
		setChangeTrg(root -> {});
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateBackward();
		saveResult("bwd");
		
		System.out.println("Completed backward synchronization");
	}
	
	private void loadTriple(String corr){ 
		try {
			loadCorr(corr);
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
			setSrc(corrModel.getSource());
			setTrg(corrModel.getTarget());
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corr
					+ ", " + iae.getMessage());
		}
	}
	
	private void saveResult(String direction){ 
		getSrc().eResource().setURI(URI.createFileURI("sync." + direction + ".src.xmi"));
		getTrg().eResource().setURI(URI.createFileURI("sync." + direction + ".trg.xmi"));
		getCorr().eResource().setURI(URI.createFileURI("sync." + direction + ".corr.xmi"));
		
		saveSrc("instances/sync." + direction + ".src.xmi");
		saveTrg("instances/sync." + direction + ".trg.xmi");
		saveCorr("instances/sync." + direction + ".corr.xmi");
		saveSynchronizationProtocol("instances/sync." + direction + ".protocol.xmi");
	}
}