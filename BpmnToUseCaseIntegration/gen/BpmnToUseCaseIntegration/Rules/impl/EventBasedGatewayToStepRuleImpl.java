/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.DocRootToUCModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule;
import BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.Event;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.Task;
import bpmn2.UserTask;

import de.upb.tools.sdm.*;

import java.lang.reflect.InvocationTargetException;

import java.util.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayToStepRuleImpl extends AbstractRuleImpl implements
		EventBasedGatewayToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEventBasedGatewayToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __lane_flowNodeRefs_eventBasedGateway = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, inFlow,
					process, eventBasedGateway, lane, laneSet));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_eventBasedGateway
				__lane_flowNodeRefs_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");
				// assign attribute __lane_flowNodeRefs_eventBasedGateway
				__lane_flowNodeRefs_eventBasedGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__process_flowElements_eventBasedGateway
						.setTrg(eventBasedGateway);

				// create link
				__lane_flowNodeRefs_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

				// create link
				__lane_flowNodeRefs_eventBasedGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, inFlow, process,
					eventBasedGateway, lane, laneSet);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Lane lane = null;
		LaneSet laneSet = null;
		Step prevStep = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep normalStep = null;
		FlowNodeToStep ebgToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge __lane_flowNodeRefs_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge ebgToNormalStep__source__eventBasedGateway = null;
		EMoflonEdge ebgToNormalStep__target__normalStep = null;
		EMoflonEdge prevStep__next__normalStep = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge flow__steps__normalStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("eventBasedGateway"));

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object ebgToNormalStep
			ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getValue("normalStep",
					"name"));
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getValue("normalStep",
					"label"));

			// create link
			ebgToNormalStep.setSource(eventBasedGateway);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(prevStep,
					normalStep, "next");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(normalStep,
					actor, "actor");

			// create link
			flow.getSteps().add(normalStep);

			// create link
			ebgToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects ebgToNormalStep and actor 
			JavaSDM.ensure(!ebgToNormalStep.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and actor 
			JavaSDM.ensure(!eventBasedGateway.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects lane and ebgToNormalStep 
			JavaSDM.ensure(!lane.equals(ebgToNormalStep));

			// check isomorphic binding between objects laneSet and ebgToNormalStep 
			JavaSDM.ensure(!laneSet.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects prevStep and ebgToNormalStep 
			JavaSDM.ensure(!prevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToActor and ebgToNormalStep 
			JavaSDM.ensure(!processToActor.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToPrevStep and eventBasedGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects lane and eventBasedGateway 
			JavaSDM.ensure(!lane.equals(eventBasedGateway));

			// check isomorphic binding between objects laneSet and eventBasedGateway 
			JavaSDM.ensure(!laneSet.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects prevStep and eventBasedGateway 
			JavaSDM.ensure(!prevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToActor and eventBasedGateway 
			JavaSDM.ensure(!processToActor.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToPrevStep 
			JavaSDM.ensure(!lane.equals(inFlowToPrevStep));

			// check isomorphic binding between objects laneSet and inFlowToPrevStep 
			JavaSDM.ensure(!laneSet.equals(inFlowToPrevStep));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects prevStep and lane 
			JavaSDM.ensure(!prevStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects prevStep and laneSet 
			JavaSDM.ensure(!prevStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_eventBasedGateway
			__lane_flowNodeRefs_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_eventBasedGateway
			__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object prevStep__next__normalStep
			prevStep__next__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __eventBasedGateway_incoming_inFlow
			__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_eventBasedGateway
			__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EventBasedGatewayToStepRule");
			// assign attribute prevStep__next__normalStep
			prevStep__next__normalStep.setName("next");
			// assign attribute __process_flowElements_eventBasedGateway
			__process_flowElements_eventBasedGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_eventBasedGateway
			__inFlow_targetRef_eventBasedGateway.setName("targetRef");
			// assign attribute __eventBasedGateway_incoming_inFlow
			__eventBasedGateway_incoming_inFlow.setName("incoming");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");
			// assign attribute ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway.setName("source");
			// assign attribute ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep.setName("target");
			// assign attribute __lane_flowNodeRefs_eventBasedGateway
			__lane_flowNodeRefs_eventBasedGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_eventBasedGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__process_flowElements_eventBasedGateway,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__source__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					prevStep__next__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__eventBasedGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_eventBasedGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

			// create link
			__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			prevStep__next__normalStep.setSrc(prevStep);

			// create link
			ebgToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			prevStep__next__normalStep.setTrg(normalStep);

			// create link
			__process_flowElements_eventBasedGateway.setSrc(process);

			// create link
			__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

			// create link
			__lane_flowNodeRefs_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			ebgToNormalStep__source__eventBasedGateway
					.setTrg(eventBasedGateway);

			// create link
			__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			__process_flowElements_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			ebgToNormalStep__source__eventBasedGateway.setSrc(ebgToNormalStep);

			// create link
			ebgToNormalStep__target__normalStep.setSrc(ebgToNormalStep);

			// create link
			__lane_flowNodeRefs_eventBasedGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep,
				lane, laneSet);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __lane_flowNodeRefs_eventBasedGateway = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Step prevStep = null;
		Iterator fujaba__IterInFlowToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("EventBasedGatewayToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("eventBasedGateway"));

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (match.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from inFlow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterInFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							SequenceFlowToUCFlow.class, "source")).iterator();

			while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					flow = inFlowToFlow.getTarget();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// iterate to-many link source from inFlow to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToStep.class, "source"))
							.iterator();

					while (fujaba__IterInFlowToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// bind object
							prevStep = inFlowToPrevStep.getTarget();

							// check object prevStep is really bound
							JavaSDM.ensure(prevStep != null);

							// iterate to-many link source from process to processToActor
							fujaba__Success = false;

							fujaba__IterProcessToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToActor.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToActor
									.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									actor = processToActor.getTarget();

									// check object actor is really bound
									JavaSDM.ensure(actor != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link flowNodeRefs from lane to eventBasedGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(eventBasedGateway));

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_source_process
										__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_laneSets_laneSet
										__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __lane_flowNodeRefs_eventBasedGateway
										__lane_flowNodeRefs_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_target_actor
										__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __laneSet_lanes_lane
										__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __process_laneSets_laneSet
										__process_laneSets_laneSet
												.setName("laneSets");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway
												.setName("targetRef");
										// assign attribute __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow
												.setName("incoming");
										// assign attribute __processToActor_source_process
										__processToActor_source_process
												.setName("source");
										// assign attribute __processToActor_target_actor
										__processToActor_target_actor
												.setName("target");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __lane_flowNodeRefs_eventBasedGateway
										__lane_flowNodeRefs_eventBasedGateway
												.setName("flowNodeRefs");
										// assign attribute __laneSet_lanes_lane
										__laneSet_lanes_lane.setName("lanes");

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setSrc(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__process_flowElements_eventBasedGateway
												.setSrc(process);

										// create link
										__process_laneSets_laneSet
												.setSrc(process);

										// create link
										__lane_flowNodeRefs_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setSrc(eventBasedGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														eventBasedGateway);

										// create link
										__process_flowElements_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														lane);

										// create link
										__laneSet_lanes_lane.setTrg(lane);

										// create link
										__lane_flowNodeRefs_eventBasedGateway
												.setSrc(lane);

										// create link
										__process_laneSets_laneSet
												.setTrg(laneSet);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														laneSet);

										// create link
										__laneSet_lanes_lane.setSrc(laneSet);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlow_targetRef_eventBasedGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_target_prevStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__eventBasedGateway_incoming_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_laneSets_laneSet,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__laneSet_lanes_lane,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_eventBasedGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__lane_flowNodeRefs_eventBasedGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_inFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															inFlow, prevStep,
															inFlowToPrevStep,
															process,
															eventBasedGateway,
															actor,
															processToActor,
															flow, inFlowToFlow,
															lane, laneSet));

											// ensure correct type and really bound of object csp
											JavaSDM.ensure(_TmpObject instanceof CSP);
											csp = (CSP) _TmpObject;
											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										// statement node 'check CSP'
										fujaba__Success = this
												.isApplicable_checkCsp_FWD(csp);
										if (fujaba__Success) {
											// story node 'add match to rule result'
											try {
												fujaba__Success = false;

												// check object isApplicableMatch is really bound
												JavaSDM.ensure(isApplicableMatch != null);
												// check object ruleresult is really bound
												JavaSDM.ensure(ruleresult != null);
												// assign attribute isApplicableMatch
												isApplicableMatch
														.setRuleName("EventBasedGatewayToStepRule");
												// assign attribute ruleresult
												ruleresult.setSuccess(true);

												// create link
												ruleresult
														.getIsApplicableMatch()
														.add(isApplicableMatch);

												fujaba__Success = true;
											} catch (JavaSDMException fujaba__InternalException) {
												fujaba__Success = false;
											}

										} else {

										}
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("eventBasedGateway", eventBasedGateway);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", true, csp);
		var_eventBasedGateway_id.setValue(eventBasedGateway.getId());
		var_eventBasedGateway_id.setType("");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", true, csp);
		var_eventBasedGateway_name.setValue(eventBasedGateway.getName());
		var_eventBasedGateway_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("eventBasedGateway").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEventBasedGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, prevStep,
					normalStep, actor, flow));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create object __prevStep_next_normalStep
				__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __prevStep_next_normalStep
				__prevStep_next_normalStep.setName("next");
				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__prevStep_next_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				__prevStep_next_normalStep.setSrc(prevStep);

				// create link
				__prevStep_next_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setTrg(actor);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						prevStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, prevStep, normalStep, actor,
					flow);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		EventBasedGateway eventBasedGateway = null;
		FlowNodeToStep ebgToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge ebgToNormalStep__target__normalStep = null;
		EMoflonEdge lane__flowNodeRefs__eventBasedGateway = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge eventBasedGateway__incoming__inFlow = null;
		EMoflonEdge inFlow__targetRef__eventBasedGateway = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge process__flowElements__eventBasedGateway = null;
		EMoflonEdge ebgToNormalStep__source__eventBasedGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object eventBasedGateway
			eventBasedGateway = Bpmn2Factory.eINSTANCE
					.createEventBasedGateway();

			// create object ebgToNormalStep
			ebgToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// assign attribute eventBasedGateway
			eventBasedGateway.setId((java.lang.String) csp.getValue(
					"eventBasedGateway", "id"));
			// assign attribute eventBasedGateway
			eventBasedGateway.setName((java.lang.String) csp.getValue(
					"eventBasedGateway", "name"));
			// assign attribute eventBasedGateway
			eventBasedGateway.setGatewayDirection((bpmn2.GatewayDirection) csp
					.getValue("eventBasedGateway", "gatewayDirection"));

			// create link
			eventBasedGateway.getIncoming().add(inFlow);

			// create link
			ebgToNormalStep.setTarget(normalStep);

			// create link
			process.getFlowElements().add(eventBasedGateway); // add link

			// create link
			lane.getFlowNodeRefs().add(eventBasedGateway);

			// create link
			ebgToNormalStep.setSource(eventBasedGateway);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects ebgToNormalStep and actor 
			JavaSDM.ensure(!ebgToNormalStep.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and actor 
			JavaSDM.ensure(!eventBasedGateway.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects lane and ebgToNormalStep 
			JavaSDM.ensure(!lane.equals(ebgToNormalStep));

			// check isomorphic binding between objects laneSet and ebgToNormalStep 
			JavaSDM.ensure(!laneSet.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects prevStep and ebgToNormalStep 
			JavaSDM.ensure(!prevStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToActor and ebgToNormalStep 
			JavaSDM.ensure(!processToActor.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToPrevStep and eventBasedGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects lane and eventBasedGateway 
			JavaSDM.ensure(!lane.equals(eventBasedGateway));

			// check isomorphic binding between objects laneSet and eventBasedGateway 
			JavaSDM.ensure(!laneSet.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects prevStep and eventBasedGateway 
			JavaSDM.ensure(!prevStep.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToActor and eventBasedGateway 
			JavaSDM.ensure(!processToActor.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToPrevStep 
			JavaSDM.ensure(!lane.equals(inFlowToPrevStep));

			// check isomorphic binding between objects laneSet and inFlowToPrevStep 
			JavaSDM.ensure(!laneSet.equals(inFlowToPrevStep));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects prevStep and lane 
			JavaSDM.ensure(!prevStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects prevStep and laneSet 
			JavaSDM.ensure(!prevStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object lane__flowNodeRefs__eventBasedGateway
			lane__flowNodeRefs__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventBasedGateway__incoming__inFlow
			eventBasedGateway__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__eventBasedGateway
			inFlow__targetRef__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __prevStep_next_normalStep
			__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__eventBasedGateway
			process__flowElements__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EventBasedGatewayToStepRule");
			// assign attribute __prevStep_next_normalStep
			__prevStep_next_normalStep.setName("next");
			// assign attribute process__flowElements__eventBasedGateway
			process__flowElements__eventBasedGateway.setName("flowElements");
			// assign attribute inFlow__targetRef__eventBasedGateway
			inFlow__targetRef__eventBasedGateway.setName("targetRef");
			// assign attribute eventBasedGateway__incoming__inFlow
			eventBasedGateway__incoming__inFlow.setName("incoming");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");
			// assign attribute ebgToNormalStep__source__eventBasedGateway
			ebgToNormalStep__source__eventBasedGateway.setName("source");
			// assign attribute ebgToNormalStep__target__normalStep
			ebgToNormalStep__target__normalStep.setName("target");
			// assign attribute lane__flowNodeRefs__eventBasedGateway
			lane__flowNodeRefs__eventBasedGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane__flowNodeRefs__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__prevStep_next_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ebgToNormalStep__source__eventBasedGateway, "createdEdges");

			// create link
			eventBasedGateway__incoming__inFlow.setTrg(inFlow);

			// create link
			inFlow__targetRef__eventBasedGateway.setSrc(inFlow);

			// create link
			__prevStep_next_normalStep.setSrc(prevStep);

			// create link
			__prevStep_next_normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			ebgToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			process__flowElements__eventBasedGateway.setSrc(process);

			// create link
			eventBasedGateway__incoming__inFlow.setSrc(eventBasedGateway);

			// create link
			lane__flowNodeRefs__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			ebgToNormalStep__source__eventBasedGateway
					.setTrg(eventBasedGateway);

			// create link
			process__flowElements__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			inFlow__targetRef__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			ebgToNormalStep__source__eventBasedGateway.setSrc(ebgToNormalStep);

			// create link
			ebgToNormalStep__target__normalStep.setSrc(ebgToNormalStep);

			// create link
			lane__flowNodeRefs__eventBasedGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, process, eventBasedGateway,
				actor, processToActor, flow, inFlowToFlow, ebgToNormalStep,
				lane, laneSet);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		Actor actor = null;
		Flow flow = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterPrevStepToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("EventBasedGatewayToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// iterate to-many link target from flow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							SequenceFlowToUCFlow.class, "target")).iterator();

			while (fujaba__IterFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					inFlow = inFlowToFlow.getSource();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);

					// iterate to-many link target from prevStep to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterPrevStepToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(prevStep,
											SequenceFlowToStep.class, "target"))
							.iterator();

					while (fujaba__IterPrevStepToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterPrevStepToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// check link source from inFlowToPrevStep to inFlow
							JavaSDM.ensure(inFlow.equals(inFlowToPrevStep
									.getSource()));

							// iterate to-many link target from actor to processToActor
							fujaba__Success = false;

							fujaba__IterActorToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(actor,
													ProcessToActor.class,
													"target")).iterator();

							while (fujaba__IterActorToProcessToActor.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterActorToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									process = processToActor.getSource();

									// check object process is really bound
									JavaSDM.ensure(process != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check isomorphic binding between objects prevStep and normalStep 
										JavaSDM.ensure(!prevStep
												.equals(normalStep));

										// check link actor from normalStep to actor
										JavaSDM.ensure(actor.equals(normalStep
												.getActor()));

										// check link next from prevStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(prevStep.getNext()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// iterate to-many link laneSets from process to laneSet
										fujaba__Success = false;

										fujaba__IterProcessToLaneSet = new ArrayList(
												process.getLaneSets())
												.iterator();

										while (fujaba__IterProcessToLaneSet
												.hasNext()) {
											try {
												laneSet = (LaneSet) fujaba__IterProcessToLaneSet
														.next();

												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// iterate to-many link lanes from laneSet to lane
												fujaba__Success = false;

												fujaba__IterLaneSetToLane = new ArrayList(
														laneSet.getLanes())
														.iterator();

												while (fujaba__IterLaneSetToLane
														.hasNext()) {
													try {
														lane = (Lane) fujaba__IterLaneSetToLane
																.next();

														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// create object isApplicableMatch
														isApplicableMatch = TGGRuntimeFactory.eINSTANCE
																.createIsApplicableMatch();

														// create object __inFlowToPrevStep_source_inFlow
														__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_source_inFlow
														__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_inFlow
														__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __prevStep_next_normalStep
														__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToPrevStep_target_prevStep
														__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __normalStep_actor_actor
														__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __flow_steps_normalStep
														__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __processToActor_source_process
														__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_laneSets_laneSet
														__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __processToActor_target_actor
														__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_target_flow
														__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __laneSet_lanes_lane
														__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// assign attribute __prevStep_next_normalStep
														__prevStep_next_normalStep
																.setName("next");
														// assign attribute __inFlowToPrevStep_source_inFlow
														__inFlowToPrevStep_source_inFlow
																.setName("source");
														// assign attribute __inFlowToPrevStep_target_prevStep
														__inFlowToPrevStep_target_prevStep
																.setName("target");
														// assign attribute __process_laneSets_laneSet
														__process_laneSets_laneSet
																.setName("laneSets");
														// assign attribute __process_flowElements_inFlow
														__process_flowElements_inFlow
																.setName("flowElements");
														// assign attribute __processToActor_source_process
														__processToActor_source_process
																.setName("source");
														// assign attribute __processToActor_target_actor
														__processToActor_target_actor
																.setName("target");
														// assign attribute __normalStep_actor_actor
														__normalStep_actor_actor
																.setName("actor");
														// assign attribute __flow_steps_normalStep
														__flow_steps_normalStep
																.setName("steps");
														// assign attribute __inFlowToFlow_source_inFlow
														__inFlowToFlow_source_inFlow
																.setName("source");
														// assign attribute __inFlowToFlow_target_flow
														__inFlowToFlow_target_flow
																.setName("target");
														// assign attribute __laneSet_lanes_lane
														__laneSet_lanes_lane
																.setName("lanes");

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlow);

														// create link
														__inFlowToPrevStep_source_inFlow
																.setTrg(inFlow);

														// create link
														__inFlowToFlow_source_inFlow
																.setTrg(inFlow);

														// create link
														__process_flowElements_inFlow
																.setTrg(inFlow);

														// create link
														__prevStep_next_normalStep
																.setSrc(prevStep);

														// create link
														__inFlowToPrevStep_target_prevStep
																.setTrg(prevStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(prevStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlowToPrevStep);

														// create link
														__inFlowToPrevStep_target_prevStep
																.setSrc(inFlowToPrevStep);

														// create link
														__inFlowToPrevStep_source_inFlow
																.setSrc(inFlowToPrevStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(normalStep);

														// create link
														__prevStep_next_normalStep
																.setTrg(normalStep);

														// create link
														__normalStep_actor_actor
																.setSrc(normalStep);

														// create link
														__flow_steps_normalStep
																.setTrg(normalStep);

														// create link
														__processToActor_source_process
																.setTrg(process);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(process);

														// create link
														__process_laneSets_laneSet
																.setSrc(process);

														// create link
														__process_flowElements_inFlow
																.setSrc(process);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(actor);

														// create link
														__normalStep_actor_actor
																.setTrg(actor);

														// create link
														__processToActor_target_actor
																.setTrg(actor);

														// create link
														__processToActor_source_process
																.setSrc(processToActor);

														// create link
														__processToActor_target_actor
																.setSrc(processToActor);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(processToActor);

														// create link
														__inFlowToFlow_target_flow
																.setTrg(flow);

														// create link
														__flow_steps_normalStep
																.setSrc(flow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(flow);

														// create link
														__inFlowToFlow_source_inFlow
																.setSrc(inFlowToFlow);

														// create link
														__inFlowToFlow_target_flow
																.setSrc(inFlowToFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlowToFlow);

														// create link
														__laneSet_lanes_lane
																.setTrg(lane);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(lane);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(laneSet);

														// create link
														__laneSet_lanes_lane
																.setSrc(laneSet);

														// create link
														__process_laneSets_laneSet
																.setTrg(laneSet);

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__normalStep_actor_actor,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__inFlowToPrevStep_target_prevStep,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__inFlowToFlow_source_inFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__inFlowToPrevStep_source_inFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__prevStep_next_normalStep,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__processToActor_target_actor,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__process_laneSets_laneSet,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__processToActor_source_process,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__laneSet_lanes_lane,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__process_flowElements_inFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__inFlowToFlow_target_flow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__flow_steps_normalStep,
																		"allContextElements");
														// story node 'solve CSP'
														try {
															fujaba__Success = false;

															_TmpObject = (this
																	.isApplicable_solveCsp_BWD(
																			isApplicableMatch,
																			inFlow,
																			prevStep,
																			inFlowToPrevStep,
																			normalStep,
																			process,
																			actor,
																			processToActor,
																			flow,
																			inFlowToFlow,
																			lane,
																			laneSet));

															// ensure correct type and really bound of object csp
															JavaSDM.ensure(_TmpObject instanceof CSP);
															csp = (CSP) _TmpObject;
															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														// statement node 'check CSP'
														fujaba__Success = this
																.isApplicable_checkCsp_BWD(csp);
														if (fujaba__Success) {
															// story node 'add match to rule result'
															try {
																fujaba__Success = false;

																// check object isApplicableMatch is really bound
																JavaSDM.ensure(isApplicableMatch != null);
																// check object ruleresult is really bound
																JavaSDM.ensure(ruleresult != null);
																// assign attribute isApplicableMatch
																isApplicableMatch
																		.setRuleName("EventBasedGatewayToStepRule");
																// assign attribute ruleresult
																ruleresult
																		.setSuccess(true);

																// create link
																ruleresult
																		.getIsApplicableMatch()
																		.add(isApplicableMatch);

																fujaba__Success = true;
															} catch (JavaSDMException fujaba__InternalException) {
																fujaba__Success = false;
															}

														} else {

														}

														fujaba__Success = true;
													} catch (JavaSDMException fujaba__InternalException) {
														fujaba__Success = false;
													}
												}
												JavaSDM.ensure(fujaba__Success);

												fujaba__Success = true;
											} catch (JavaSDMException fujaba__InternalException) {
												fujaba__Success = false;
											}
										}
										JavaSDM.ensure(fujaba__Success);
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("normalStep", normalStep);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep,
			NormalStep normalStep, Actor actor, Flow flow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		var_eventBasedGateway_id.setType("");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		var_eventBasedGateway_name.setType("");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);
		var_eventBasedGateway_gatewayDirection.setType("EObject");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject process, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject flow,
			EObject inFlowToFlow, EObject ebgToNormalStep, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("normalStep").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_34(
			EMoflonEdge _edge_next) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_535460 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_547714 = null;
		Step __DEC_normalStep_next_547714 = null;
		Match match = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Step prevStep = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_next is really bound
			JavaSDM.ensure(_edge_next != null);
			// bind object
			_TmpObject = _edge_next.getSrc();

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;

			// bind object
			_TmpObject = prevStep.getNext();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_next to normalStep
			JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_535460 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_535460 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_535460 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_535460.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_535460 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_535460.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_547714
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_547714 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_547714
									.hasNext()) {
						try {
							__DEC_normalStep_next_547714 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_547714
									.next();

							// check object __DEC_normalStep_next_547714 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_547714 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_547714 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_547714
									.equals(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_next_547714 and prevStep 
							JavaSDM.ensure(!__DEC_normalStep_next_547714
									.equals(prevStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_next is really bound
				JavaSDM.ensure(_edge_next != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link next from prevStep to normalStep
				JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

				// check link src from _edge_next to prevStep
				JavaSDM.ensure(prevStep.equals(_edge_next.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_next to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, prevStep,
						normalStep, actor, flow);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_89(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_514876 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_976944 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_976944 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterEventBasedGatewayToLane = null;
		Lane lane = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// bind object
					_TmpObject = _edge_flowElements.getTrg();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventBasedGateway to process
					JavaSDM.ensure(process.equals(eventBasedGateway
							.eContainer()));

					// iterate to-many link flowNodeRefs from eventBasedGateway to lane
					fujaba__Success = false;

					fujaba__IterEventBasedGatewayToLane = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(eventBasedGateway,
											Lane.class, "flowNodeRefs"))
							.iterator();

					while (fujaba__IterEventBasedGatewayToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterEventBasedGatewayToLane
									.next();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// iterate to-many link targetRef from eventBasedGateway to inFlow
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayToInFlow = new ArrayList(
									eventBasedGateway.getIncoming()).iterator();

							while (fujaba__IterEventBasedGatewayToInFlow
									.hasNext()) {
								try {
									inFlow = (SequenceFlow) fujaba__IterEventBasedGatewayToInFlow
											.next();

									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check link flowElements from inFlow to process
									JavaSDM.ensure(process.equals(inFlow
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_eventBasedGateway_flowElements_514876 = eventBasedGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
													.eContainer() : null;

											// check object __DEC_eventBasedGateway_flowElements_514876 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_514876 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_514876
													.getFlowElements()
													.contains(eventBasedGateway));

											// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_514876 and process 
											JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_514876
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_976944
											fujaba__Success = false;

											fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_976944 = new ArrayList(
													eventBasedGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_976944
															.hasNext()) {
												try {
													__DEC_eventBasedGateway_targetRef_976944 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_976944
															.next();

													// check object __DEC_eventBasedGateway_targetRef_976944 is really bound
													JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_976944 != null);
													// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_976944 and inFlow 
													JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_976944
															.equals(inFlow));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check object _edge_flowElements is really bound
										JavaSDM.ensure(_edge_flowElements != null);
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link trg from _edge_flowElements to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to eventBasedGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(eventBasedGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														inFlow, process,
														eventBasedGateway,
														lane, laneSet);
										if (fujaba__Success) {
											// statement node 'Ensure that the correct types of elements are matched'
											fujaba__Success = this
													.checkTypes_FWD(match);
											if (fujaba__Success) {
												// story node 'Add match to rule result'
												try {
													fujaba__Success = false;

													// check object __performOperation is really bound
													JavaSDM.ensure(__performOperation != null);
													// check object __result is really bound
													JavaSDM.ensure(__result != null);
													// check object match is really bound
													JavaSDM.ensure(match != null);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	match,
																	__performOperation,
																	"isApplicableOperation");

													// create link
													__result.getContents().add(
															match);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

											} else {

											}

										} else {

										}
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_329605 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_961506 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_961506 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterEventBasedGatewayToLane = null;
		Lane lane = null;
		EventBasedGateway eventBasedGateway = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from eventBasedGateway to lane
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterEventBasedGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventBasedGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = _edge_targetRef.getSrc();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;

					// bind object
					_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(inFlow));

					// check link flowElements from eventBasedGateway to process
					JavaSDM.ensure(process.equals(eventBasedGateway
							.eContainer()));

					// check link targetRef from inFlow to eventBasedGateway
					JavaSDM.ensure(eventBasedGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_eventBasedGateway_flowElements_329605 = eventBasedGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
											.eContainer() : null;

									// check object __DEC_eventBasedGateway_flowElements_329605 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_329605 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_329605
											.getFlowElements().contains(
													eventBasedGateway));

									// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_329605 and process 
									JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_329605
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_961506
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_961506 = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_961506
													.hasNext()) {
										try {
											__DEC_eventBasedGateway_targetRef_961506 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_961506
													.next();

											// check object __DEC_eventBasedGateway_targetRef_961506 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_961506 != null);
											// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_961506 and inFlow 
											JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_961506
													.equals(inFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_targetRef is really bound
								JavaSDM.ensure(_edge_targetRef != null);
								// check object eventBasedGateway is really bound
								JavaSDM.ensure(eventBasedGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from eventBasedGateway to process
								JavaSDM.ensure(process.equals(eventBasedGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_targetRef to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_targetRef.getTrg()));

								// check link flowNodeRefs from lane to eventBasedGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										eventBasedGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										inFlow, process, eventBasedGateway,
										lane, laneSet);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
									if (fujaba__Success) {
										// story node 'Add match to rule result'
										try {
											fujaba__Success = false;

											// check object __performOperation is really bound
											JavaSDM.ensure(__performOperation != null);
											// check object __result is really bound
											JavaSDM.ensure(__result != null);
											// check object match is really bound
											JavaSDM.ensure(match != null);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															match,
															__performOperation,
															"isApplicableOperation");

											// create link
											__result.getContents().add(match);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

									} else {

									}

								} else {

								}
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_91(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_129208 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_422399 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_422399 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventBasedGatewayToLane = null;
		Lane lane = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link targetRef from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from eventBasedGateway to lane
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterEventBasedGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventBasedGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// iterate to-many link src from inFlow to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(inFlow,
													EMoflonEdge.class, "src"))
									.iterator();

							while (fujaba__IterInFlowTo_edge_targetRef
									.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
											.next();

									// check object _edge_targetRef is really bound
									JavaSDM.ensure(_edge_targetRef != null);
									// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
									JavaSDM.ensure(!_edge_targetRef
											.equals(_edge_incoming));

									// check link trg from _edge_targetRef to eventBasedGateway
									JavaSDM.ensure(eventBasedGateway
											.equals(_edge_targetRef.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_eventBasedGateway_flowElements_129208 = eventBasedGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
													.eContainer() : null;

											// check object __DEC_eventBasedGateway_flowElements_129208 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_129208 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_129208
													.getFlowElements()
													.contains(eventBasedGateway));

											// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_129208 and process 
											JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_129208
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_422399
											fujaba__Success = false;

											fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_422399 = new ArrayList(
													eventBasedGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_422399
															.hasNext()) {
												try {
													__DEC_eventBasedGateway_targetRef_422399 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_422399
															.next();

													// check object __DEC_eventBasedGateway_targetRef_422399 is really bound
													JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_422399 != null);
													// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_422399 and inFlow 
													JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_422399
															.equals(inFlow));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check object _edge_incoming is really bound
										JavaSDM.ensure(_edge_incoming != null);
										// check object _edge_targetRef is really bound
										JavaSDM.ensure(_edge_targetRef != null);
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
										JavaSDM.ensure(!_edge_targetRef
												.equals(_edge_incoming));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link src from _edge_incoming to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_targetRef
														.getTrg()));

										// check link flowNodeRefs from lane to eventBasedGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(eventBasedGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														inFlow, process,
														eventBasedGateway,
														lane, laneSet);
										if (fujaba__Success) {
											// statement node 'Ensure that the correct types of elements are matched'
											fujaba__Success = this
													.checkTypes_FWD(match);
											if (fujaba__Success) {
												// story node 'Add match to rule result'
												try {
													fujaba__Success = false;

													// check object __performOperation is really bound
													JavaSDM.ensure(__performOperation != null);
													// check object __result is really bound
													JavaSDM.ensure(__result != null);
													// check object match is really bound
													JavaSDM.ensure(match != null);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	match,
																	__performOperation,
																	"isApplicableOperation");

													// create link
													__result.getContents().add(
															match);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

											} else {

											}

										} else {

										}
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_35(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_688389 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_352129 = null;
		Step __DEC_normalStep_next_352129 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_688389 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_688389 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_688389 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_688389
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_688389 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_688389
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link next from normalStep to __DEC_normalStep_next_352129
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_352129 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_352129
											.hasNext()) {
								try {
									__DEC_normalStep_next_352129 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_352129
											.next();

									// check object __DEC_normalStep_next_352129 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_352129 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_352129 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_352129
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_352129 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_352129
											.equals(prevStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_actor is really bound
						JavaSDM.ensure(_edge_actor != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_actor to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_actor.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_actor to actor
						JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, actor, flow);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
							fujaba__Success = this.checkTypes_BWD(match);
							if (fujaba__Success) {
								// story node 'Add match to rule result'
								try {
									fujaba__Success = false;

									// check object __performOperation is really bound
									JavaSDM.ensure(__performOperation != null);
									// check object __result is really bound
									JavaSDM.ensure(__result != null);
									// check object match is really bound
									JavaSDM.ensure(match != null);

									// create link
									org.moflon.util.eMoflonEMFUtil
											.addOppositeReference(match,
													__performOperation,
													"isApplicableOperation");

									// create link
									__result.getContents().add(match);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

							} else {

							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_36(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_179469 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_254551 = null;
		Step __DEC_normalStep_next_254551 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Flow flow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link steps from normalStep to flow
			JavaSDM.ensure(flow.equals(normalStep.eContainer()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_179469 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_179469 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_179469 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_179469
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_179469 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_179469
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link next from normalStep to __DEC_normalStep_next_254551
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_254551 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_254551
											.hasNext()) {
								try {
									__DEC_normalStep_next_254551 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_254551
											.next();

									// check object __DEC_normalStep_next_254551 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_254551 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_254551 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_254551
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_254551 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_254551
											.equals(prevStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_steps is really bound
						JavaSDM.ensure(_edge_steps != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_steps to flow
						JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_steps to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_steps.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, actor, flow);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
							fujaba__Success = this.checkTypes_BWD(match);
							if (fujaba__Success) {
								// story node 'Add match to rule result'
								try {
									fujaba__Success = false;

									// check object __performOperation is really bound
									JavaSDM.ensure(__performOperation != null);
									// check object __result is really bound
									JavaSDM.ensure(__result != null);
									// check object match is really bound
									JavaSDM.ensure(match != null);

									// create link
									org.moflon.util.eMoflonEMFUtil
											.addOppositeReference(match,
													__performOperation,
													"isApplicableOperation");

									// create link
									__result.getContents().add(match);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

							} else {

							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_92(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_832865 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_321475 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_321475 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		EventBasedGateway eventBasedGateway = null;
		Lane lane = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_flowNodeRefs is really bound
			JavaSDM.ensure(_edge_flowNodeRefs != null);
			// bind object
			_TmpObject = _edge_flowNodeRefs.getSrc();

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;

			// bind object
			_TmpObject = _edge_flowNodeRefs.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = eventBasedGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) eventBasedGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements()
					.contains(eventBasedGateway));

			// check link flowNodeRefs from lane to eventBasedGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(eventBasedGateway));

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// check link lanes from lane to laneSet
					JavaSDM.ensure(laneSet.equals(lane.eContainer()));

					// iterate to-many link targetRef from eventBasedGateway to inFlow
					fujaba__Success = false;

					fujaba__IterEventBasedGatewayToInFlow = new ArrayList(
							eventBasedGateway.getIncoming()).iterator();

					while (fujaba__IterEventBasedGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventBasedGatewayToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_eventBasedGateway_flowElements_832865 = eventBasedGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
											.eContainer() : null;

									// check object __DEC_eventBasedGateway_flowElements_832865 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_832865 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_832865
											.getFlowElements().contains(
													eventBasedGateway));

									// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_832865 and process 
									JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_832865
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_321475
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_321475 = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_321475
													.hasNext()) {
										try {
											__DEC_eventBasedGateway_targetRef_321475 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_321475
													.next();

											// check object __DEC_eventBasedGateway_targetRef_321475 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_321475 != null);
											// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_321475 and inFlow 
											JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_321475
													.equals(inFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_flowNodeRefs is really bound
								JavaSDM.ensure(_edge_flowNodeRefs != null);
								// check object eventBasedGateway is really bound
								JavaSDM.ensure(eventBasedGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from eventBasedGateway to process
								JavaSDM.ensure(process.equals(eventBasedGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link src from _edge_flowNodeRefs to lane
								JavaSDM.ensure(lane.equals(_edge_flowNodeRefs
										.getSrc()));

								// check link targetRef from inFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_flowNodeRefs to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_flowNodeRefs.getTrg()));

								// check link flowNodeRefs from lane to eventBasedGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										eventBasedGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										inFlow, process, eventBasedGateway,
										lane, laneSet);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
									if (fujaba__Success) {
										// story node 'Add match to rule result'
										try {
											fujaba__Success = false;

											// check object __performOperation is really bound
											JavaSDM.ensure(__performOperation != null);
											// check object __result is really bound
											JavaSDM.ensure(__result != null);
											// check object match is really bound
											JavaSDM.ensure(match != null);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															match,
															__performOperation,
															"isApplicableOperation");

											// create link
											__result.getContents().add(match);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

									} else {

									}

								} else {

								}
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __lane_flowNodeRefs_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __laneSet_lanes_lane = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, eventBasedGateway, lane, laneSet));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_eventBasedGateway
				__lane_flowNodeRefs_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");
				// assign attribute __lane_flowNodeRefs_eventBasedGateway
				__lane_flowNodeRefs_eventBasedGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_eventBasedGateway
						.setTrg(eventBasedGateway);

				// create link
				__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

				// create link
				__lane_flowNodeRefs_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__lane_flowNodeRefs_eventBasedGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					eventBasedGateway, lane, laneSet);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("eventBasedGateway", eventBasedGateway);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", true, csp);
		var_eventBasedGateway_id.setValue(eventBasedGateway.getId());
		var_eventBasedGateway_id.setType("");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", true, csp);
		var_eventBasedGateway_name.setValue(eventBasedGateway.getName());
		var_eventBasedGateway_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep,
			EObject lane, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, actor,
					normalStep, flow));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				__normalStep_actor_actor.setTrg(actor);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, actor, normalStep, flow);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		match.registerObject("actor", actor);
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Actor actor,
			ProcessToActor processToActor, NormalStep normalStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_eventBasedGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.id", csp);
		var_eventBasedGateway_id.setType("");
		Variable var_eventBasedGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.name", csp);
		var_eventBasedGateway_name.setType("");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", csp);
		var_eventBasedGateway_gatewayDirection.setType("EObject");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eventBasedGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_eventBasedGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject flow, EObject inFlowToFlow, EObject ebgToNormalStep,
			EObject lane, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_665338 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_333168 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_333168 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// bind object
					_TmpObject = _edge_flowElements.getTrg();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventBasedGateway to process
					JavaSDM.ensure(process.equals(eventBasedGateway
							.eContainer()));

					// iterate to-many link flowElements from process to inFlow
					fujaba__Success = false;

					fujaba__IterProcessToInFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToInFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToInFlow.next();

							// ensure correct type and really bound of object inFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							inFlow = (SequenceFlow) _TmpObject;
							// check link targetRef from inFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowNodeRefs from eventBasedGateway to lane
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayToLane = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													eventBasedGateway,
													Lane.class, "flowNodeRefs"))
									.iterator();

							while (fujaba__IterEventBasedGatewayToLane
									.hasNext()) {
								try {
									lane = (Lane) fujaba__IterEventBasedGatewayToLane
											.next();

									// check object lane is really bound
									JavaSDM.ensure(lane != null);
									// check link lanes from lane to laneSet
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_eventBasedGateway_flowElements_665338 = eventBasedGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
													.eContainer() : null;

											// check object __DEC_eventBasedGateway_flowElements_665338 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_665338 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_665338
													.getFlowElements()
													.contains(eventBasedGateway));

											// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_665338 and process 
											JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_665338
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_333168
											fujaba__Success = false;

											fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_333168 = new ArrayList(
													eventBasedGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_333168
															.hasNext()) {
												try {
													__DEC_eventBasedGateway_targetRef_333168 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_333168
															.next();

													// check object __DEC_eventBasedGateway_targetRef_333168 is really bound
													JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_333168 != null);
													// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_333168 and inFlow 
													JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_333168
															.equals(inFlow));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check object _edge_flowElements is really bound
										JavaSDM.ensure(_edge_flowElements != null);
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link trg from _edge_flowElements to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to eventBasedGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(eventBasedGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														eventBasedGateway,
														lane, laneSet);
										if (fujaba__Success) {
											// statement node 'Ensure that the correct types of elements are matched'
											fujaba__Success = this
													.checkTypes_FWD(match);
											if (fujaba__Success) {
												// story node 'Add match to rule result'
												try {
													fujaba__Success = false;

													// check object __performOperation is really bound
													JavaSDM.ensure(__performOperation != null);
													// check object __result is really bound
													JavaSDM.ensure(__result != null);
													// check object match is really bound
													JavaSDM.ensure(match != null);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	match,
																	__performOperation,
																	"isApplicableOperation");

													// create link
													__result.getContents().add(
															match);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

											} else {

											}

										} else {

										}
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_51(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_238283 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_728455 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_728455 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway eventBasedGateway = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link targetRef from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// iterate to-many link lanes from laneSet to lane
					fujaba__Success = false;

					fujaba__IterLaneSetToLane = new ArrayList(
							laneSet.getLanes()).iterator();

					while (fujaba__IterLaneSetToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterLaneSetToLane.next();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);
							// check link flowNodeRefs from lane to eventBasedGateway
							JavaSDM.ensure(lane.getFlowNodeRefs().contains(
									eventBasedGateway));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_eventBasedGateway_flowElements_238283 = eventBasedGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
											.eContainer() : null;

									// check object __DEC_eventBasedGateway_flowElements_238283 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_238283 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_238283
											.getFlowElements().contains(
													eventBasedGateway));

									// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_238283 and process 
									JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_238283
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_728455
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_728455 = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_728455
													.hasNext()) {
										try {
											__DEC_eventBasedGateway_targetRef_728455 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_728455
													.next();

											// check object __DEC_eventBasedGateway_targetRef_728455 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_728455 != null);
											// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_728455 and inFlow 
											JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_728455
													.equals(inFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_targetRef is really bound
								JavaSDM.ensure(_edge_targetRef != null);
								// check object eventBasedGateway is really bound
								JavaSDM.ensure(eventBasedGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from eventBasedGateway to process
								JavaSDM.ensure(process.equals(eventBasedGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_targetRef to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_targetRef.getTrg()));

								// check link flowNodeRefs from lane to eventBasedGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										eventBasedGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, eventBasedGateway,
										lane, laneSet);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
									if (fujaba__Success) {
										// story node 'Add match to rule result'
										try {
											fujaba__Success = false;

											// check object __performOperation is really bound
											JavaSDM.ensure(__performOperation != null);
											// check object __result is really bound
											JavaSDM.ensure(__result != null);
											// check object match is really bound
											JavaSDM.ensure(match != null);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															match,
															__performOperation,
															"isApplicableOperation");

											// create link
											__result.getContents().add(match);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

									} else {

									}

								} else {

								}
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_52(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_1182 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_490802 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_490802 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventBasedGatewayToLane = null;
		Lane lane = null;
		bpmn2.Process process = null;
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow inFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = eventBasedGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) eventBasedGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements()
					.contains(eventBasedGateway));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from eventBasedGateway to lane
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterEventBasedGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventBasedGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link laneSets from process to laneSet
					fujaba__Success = false;

					fujaba__IterProcessToLaneSet = new ArrayList(
							process.getLaneSets()).iterator();

					while (fujaba__IterProcessToLaneSet.hasNext()) {
						try {
							laneSet = (LaneSet) fujaba__IterProcessToLaneSet
									.next();

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);
							// check link lanes from lane to laneSet
							JavaSDM.ensure(laneSet.equals(lane.eContainer()));

							// iterate to-many link trg from eventBasedGateway to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterEventBasedGatewayTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													eventBasedGateway,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterEventBasedGatewayTo_edge_targetRef
									.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterEventBasedGatewayTo_edge_targetRef
											.next();

									// check object _edge_targetRef is really bound
									JavaSDM.ensure(_edge_targetRef != null);
									// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
									JavaSDM.ensure(!_edge_targetRef
											.equals(_edge_incoming));

									// check link src from _edge_targetRef to inFlow
									JavaSDM.ensure(inFlow
											.equals(_edge_targetRef.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_eventBasedGateway_flowElements_1182 = eventBasedGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
													.eContainer() : null;

											// check object __DEC_eventBasedGateway_flowElements_1182 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_1182 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_1182
													.getFlowElements()
													.contains(eventBasedGateway));

											// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_1182 and process 
											JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_1182
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_490802
											fujaba__Success = false;

											fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_490802 = new ArrayList(
													eventBasedGateway
															.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_490802
															.hasNext()) {
												try {
													__DEC_eventBasedGateway_targetRef_490802 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_490802
															.next();

													// check object __DEC_eventBasedGateway_targetRef_490802 is really bound
													JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_490802 != null);
													// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_490802 and inFlow 
													JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_490802
															.equals(inFlow));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}
											}
											JavaSDM.ensure(fujaba__Success);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check object _edge_incoming is really bound
										JavaSDM.ensure(_edge_incoming != null);
										// check object _edge_targetRef is really bound
										JavaSDM.ensure(_edge_targetRef != null);
										// check object eventBasedGateway is really bound
										JavaSDM.ensure(eventBasedGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
										JavaSDM.ensure(!_edge_targetRef
												.equals(_edge_incoming));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link src from _edge_incoming to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(_edge_targetRef
														.getTrg()));

										// check link flowNodeRefs from lane to eventBasedGateway
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(eventBasedGateway));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														eventBasedGateway,
														lane, laneSet);
										if (fujaba__Success) {
											// statement node 'Ensure that the correct types of elements are matched'
											fujaba__Success = this
													.checkTypes_FWD(match);
											if (fujaba__Success) {
												// story node 'Add match to rule result'
												try {
													fujaba__Success = false;

													// check object __performOperation is really bound
													JavaSDM.ensure(__performOperation != null);
													// check object __result is really bound
													JavaSDM.ensure(__result != null);
													// check object match is really bound
													JavaSDM.ensure(match != null);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	match,
																	__performOperation,
																	"isApplicableOperation");

													// create link
													__result.getContents().add(
															match);

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

											} else {

											}

										} else {

										}
										fujaba__Success = true;
									} catch (JavaSDMException fujaba__InternalException) {
										fujaba__Success = false;
									}

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_19(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_827938 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_336453 = null;
		Step __DEC_normalStep_next_336453 = null;
		Match match = null;
		Actor actor = null;
		Flow flow = null;
		NormalStep normalStep = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// bind object
			_TmpObject = _edge_actor.getTrg();

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;

			// check link actor from normalStep to actor
			JavaSDM.ensure(actor.equals(normalStep.getActor()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_827938 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_827938 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_827938 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_827938.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_827938 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_827938.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_336453
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_336453 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_336453
									.hasNext()) {
						try {
							__DEC_normalStep_next_336453 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_336453
									.next();

							// check object __DEC_normalStep_next_336453 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_336453 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_336453 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_336453
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_actor is really bound
				JavaSDM.ensure(_edge_actor != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link src from _edge_actor to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_actor.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_actor to actor
				JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, actor,
						normalStep, flow);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_559204 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_177302 = null;
		Step __DEC_normalStep_next_177302 = null;
		Match match = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Flow flow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link steps from normalStep to flow
			JavaSDM.ensure(flow.equals(normalStep.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_559204 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_559204 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_559204 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_559204.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_559204 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_559204.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_177302
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_177302 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_177302
									.hasNext()) {
						try {
							__DEC_normalStep_next_177302 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_177302
									.next();

							// check object __DEC_normalStep_next_177302 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_177302 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_177302 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_177302
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_steps is really bound
				JavaSDM.ensure(_edge_steps != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link src from _edge_steps to flow
				JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_steps to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_steps.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, actor,
						normalStep, flow);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_eventBasedGateway_flowElements_775728 = null;
		Iterator fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_10372 = null;
		SequenceFlow __DEC_eventBasedGateway_targetRef_10372 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		EventBasedGateway eventBasedGateway = null;
		Lane lane = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_flowNodeRefs is really bound
			JavaSDM.ensure(_edge_flowNodeRefs != null);
			// bind object
			_TmpObject = _edge_flowNodeRefs.getSrc();

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;

			// bind object
			_TmpObject = _edge_flowNodeRefs.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// bind object
			_TmpObject = eventBasedGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) eventBasedGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements()
					.contains(eventBasedGateway));

			// check link flowNodeRefs from lane to eventBasedGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(eventBasedGateway));

			// iterate to-many link laneSets from process to laneSet
			fujaba__Success = false;

			fujaba__IterProcessToLaneSet = new ArrayList(process.getLaneSets())
					.iterator();

			while (fujaba__IterProcessToLaneSet.hasNext()) {
				try {
					laneSet = (LaneSet) fujaba__IterProcessToLaneSet.next();

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);
					// check link lanes from lane to laneSet
					JavaSDM.ensure(laneSet.equals(lane.eContainer()));

					// iterate to-many link targetRef from eventBasedGateway to inFlow
					fujaba__Success = false;

					fujaba__IterEventBasedGatewayToInFlow = new ArrayList(
							eventBasedGateway.getIncoming()).iterator();

					while (fujaba__IterEventBasedGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventBasedGatewayToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_eventBasedGateway_flowElements_775728 = eventBasedGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) eventBasedGateway
											.eContainer() : null;

									// check object __DEC_eventBasedGateway_flowElements_775728 is really bound
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_775728 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_eventBasedGateway_flowElements_775728
											.getFlowElements().contains(
													eventBasedGateway));

									// check isomorphic binding between objects __DEC_eventBasedGateway_flowElements_775728 and process 
									JavaSDM.ensure(!__DEC_eventBasedGateway_flowElements_775728
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from eventBasedGateway to __DEC_eventBasedGateway_targetRef_10372
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_10372 = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_10372
													.hasNext()) {
										try {
											__DEC_eventBasedGateway_targetRef_10372 = (SequenceFlow) fujaba__IterEventBasedGatewayTo__DEC_eventBasedGateway_targetRef_10372
													.next();

											// check object __DEC_eventBasedGateway_targetRef_10372 is really bound
											JavaSDM.ensure(__DEC_eventBasedGateway_targetRef_10372 != null);
											// check isomorphic binding between objects __DEC_eventBasedGateway_targetRef_10372 and inFlow 
											JavaSDM.ensure(!__DEC_eventBasedGateway_targetRef_10372
													.equals(inFlow));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}
									}
									JavaSDM.ensure(fujaba__Success);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_flowNodeRefs is really bound
								JavaSDM.ensure(_edge_flowNodeRefs != null);
								// check object eventBasedGateway is really bound
								JavaSDM.ensure(eventBasedGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from eventBasedGateway to process
								JavaSDM.ensure(process.equals(eventBasedGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link src from _edge_flowNodeRefs to lane
								JavaSDM.ensure(lane.equals(_edge_flowNodeRefs
										.getSrc()));

								// check link targetRef from inFlow to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_flowNodeRefs to eventBasedGateway
								JavaSDM.ensure(eventBasedGateway
										.equals(_edge_flowNodeRefs.getTrg()));

								// check link flowNodeRefs from lane to eventBasedGateway
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										eventBasedGateway));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, eventBasedGateway,
										lane, laneSet);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_FWD(match);
									if (fujaba__Success) {
										// story node 'Add match to rule result'
										try {
											fujaba__Success = false;

											// check object __performOperation is really bound
											JavaSDM.ensure(__performOperation != null);
											// check object __result is really bound
											JavaSDM.ensure(__result != null);
											// check object match is really bound
											JavaSDM.ensure(match != null);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															match,
															__performOperation,
															"isApplicableOperation");

											// create link
											__result.getContents().add(match);

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

									} else {

									}

								} else {

								}
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EventBasedGatewayToStepCoreRule.class) {
			switch (baseOperationID) {
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(EventBasedGateway) arguments.get(5),
					(Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_34((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_89((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_91((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_35((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_36((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_92((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (LaneSet) arguments.get(5));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Actor) arguments.get(4),
					(ProcessToActor) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(Lane) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Actor) arguments.get(3),
					(ProcessToActor) arguments.get(4),
					(NormalStep) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(Lane) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_51((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_52((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_19((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments
					.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EventBasedGatewayToStepRuleImpl
