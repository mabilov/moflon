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

import BpmnToUseCaseIntegration.Rules.EndEventRule;
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
 * An implementation of the model object '<em><b>End Event Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEventRuleImpl extends AbstractRuleImpl implements EndEventRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEventRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __lane_flowNodeRefs_endEvent = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __laneSet_lanes_lane = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
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
					inFlow, endEvent, lane, laneSet));

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

				// check object endEvent is really bound
				JavaSDM.ensure(endEvent != null);
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
				// create object __lane_flowNodeRefs_endEvent
				__lane_flowNodeRefs_endEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_endEvent
				__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_endEvent
				__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __endEvent_incoming_inFlow
				__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_endEvent
				__process_flowElements_endEvent.setName("flowElements");
				// assign attribute __inFlow_targetRef_endEvent
				__inFlow_targetRef_endEvent.setName("targetRef");
				// assign attribute __endEvent_incoming_inFlow
				__endEvent_incoming_inFlow.setName("incoming");
				// assign attribute __lane_flowNodeRefs_endEvent
				__lane_flowNodeRefs_endEvent.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_endEvent, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_endEvent, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_endEvent, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__endEvent_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						endEvent, "toBeTranslatedNodes");

				// create link
				__process_flowElements_endEvent.setSrc(process);

				// create link
				__inFlow_targetRef_endEvent.setSrc(inFlow);

				// create link
				__endEvent_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_endEvent.setTrg(endEvent);

				// create link
				__lane_flowNodeRefs_endEvent.setTrg(endEvent);

				// create link
				__endEvent_incoming_inFlow.setSrc(endEvent);

				// create link
				__inFlow_targetRef_endEvent.setTrg(endEvent);

				// create link
				__lane_flowNodeRefs_endEvent.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object endEvent is really bound
				JavaSDM.ensure(endEvent != null);
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
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

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
			this.registerObjectsToMatch_FWD(match, process, inFlow, endEvent,
					lane, laneSet);
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
		EndEvent endEvent = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		EndEventToFlow endEventToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge endEventToFlow__source__endEvent = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge __lane_flowNodeRefs_endEvent = null;
		EMoflonEdge endEventToFlow__target__flow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("endEvent"));

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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
			// create object endEventToFlow
			endEventToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createEndEventToFlow();

			// create link
			endEventToFlow.setSource(endEvent);

			// create link
			endEventToFlow.setTarget(flow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
			// check object endEventToFlow is really bound
			JavaSDM.ensure(endEventToFlow != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEvent, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object endEvent is really bound
			JavaSDM.ensure(endEvent != null);
			// check object endEventToFlow is really bound
			JavaSDM.ensure(endEventToFlow != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects endEventToFlow and endEvent 
			JavaSDM.ensure(!endEventToFlow.equals(endEvent));

			// check isomorphic binding between objects flow and endEvent 
			JavaSDM.ensure(!flow.equals(endEvent));

			// check isomorphic binding between objects inFlow and endEvent 
			JavaSDM.ensure(!inFlow.equals(endEvent));

			// check isomorphic binding between objects inFlowToFlow and endEvent 
			JavaSDM.ensure(!inFlowToFlow.equals(endEvent));

			// check isomorphic binding between objects lane and endEvent 
			JavaSDM.ensure(!lane.equals(endEvent));

			// check isomorphic binding between objects laneSet and endEvent 
			JavaSDM.ensure(!laneSet.equals(endEvent));

			// check isomorphic binding between objects process and endEvent 
			JavaSDM.ensure(!process.equals(endEvent));

			// check isomorphic binding between objects processToUseCase and endEvent 
			JavaSDM.ensure(!processToUseCase.equals(endEvent));

			// check isomorphic binding between objects useCase and endEvent 
			JavaSDM.ensure(!useCase.equals(endEvent));

			// check isomorphic binding between objects flow and endEventToFlow 
			JavaSDM.ensure(!flow.equals(endEventToFlow));

			// check isomorphic binding between objects inFlow and endEventToFlow 
			JavaSDM.ensure(!inFlow.equals(endEventToFlow));

			// check isomorphic binding between objects inFlowToFlow and endEventToFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(endEventToFlow));

			// check isomorphic binding between objects lane and endEventToFlow 
			JavaSDM.ensure(!lane.equals(endEventToFlow));

			// check isomorphic binding between objects laneSet and endEventToFlow 
			JavaSDM.ensure(!laneSet.equals(endEventToFlow));

			// check isomorphic binding between objects process and endEventToFlow 
			JavaSDM.ensure(!process.equals(endEventToFlow));

			// check isomorphic binding between objects processToUseCase and endEventToFlow 
			JavaSDM.ensure(!processToUseCase.equals(endEventToFlow));

			// check isomorphic binding between objects useCase and endEventToFlow 
			JavaSDM.ensure(!useCase.equals(endEventToFlow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToUseCase and lane 
			JavaSDM.ensure(!processToUseCase.equals(lane));

			// check isomorphic binding between objects useCase and lane 
			JavaSDM.ensure(!useCase.equals(lane));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and laneSet 
			JavaSDM.ensure(!processToUseCase.equals(laneSet));

			// check isomorphic binding between objects useCase and laneSet 
			JavaSDM.ensure(!useCase.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object __endEvent_incoming_inFlow
			__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object endEventToFlow__source__endEvent
			endEventToFlow__source__endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_endEvent
			__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_endEvent
			__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_endEvent
			__lane_flowNodeRefs_endEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object endEventToFlow__target__flow
			endEventToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("EndEventRule");
			// assign attribute __process_flowElements_endEvent
			__process_flowElements_endEvent.setName("flowElements");
			// assign attribute __inFlow_targetRef_endEvent
			__inFlow_targetRef_endEvent.setName("targetRef");
			// assign attribute __endEvent_incoming_inFlow
			__endEvent_incoming_inFlow.setName("incoming");
			// assign attribute endEventToFlow__source__endEvent
			endEventToFlow__source__endEvent.setName("source");
			// assign attribute endEventToFlow__target__flow
			endEventToFlow__target__flow.setName("target");
			// assign attribute __lane_flowNodeRefs_endEvent
			__lane_flowNodeRefs_endEvent.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__endEvent_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow__source__endEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_endEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_endEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_endEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					endEventToFlow__target__flow, "createdEdges");

			// create link
			__process_flowElements_endEvent.setSrc(process);

			// create link
			__endEvent_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_endEvent.setSrc(inFlow);

			// create link
			endEventToFlow__source__endEvent.setTrg(endEvent);

			// create link
			__lane_flowNodeRefs_endEvent.setTrg(endEvent);

			// create link
			__inFlow_targetRef_endEvent.setTrg(endEvent);

			// create link
			__endEvent_incoming_inFlow.setSrc(endEvent);

			// create link
			__process_flowElements_endEvent.setTrg(endEvent);

			// create link
			endEventToFlow__target__flow.setTrg(flow);

			// create link
			endEventToFlow__target__flow.setSrc(endEventToFlow);

			// create link
			endEventToFlow__source__endEvent.setSrc(endEventToFlow);

			// create link
			__lane_flowNodeRefs_endEvent.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, endEventToFlow, useCase, processToUseCase, lane,
				laneSet);
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
		EndEvent endEvent = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		EMoflonEdge __process_flowElements_endEvent = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlow_targetRef_endEvent = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __endEvent_incoming_inFlow = null;
		EMoflonEdge __lane_flowNodeRefs_endEvent = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
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
			ruleresult.setRule("EndEventRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("endEvent"));

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;
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

					// iterate to-many link source from process to processToUseCase
					fujaba__Success = false;

					fujaba__IterProcessToProcessToUseCase = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(process,
											ProcessToUseCase.class, "source"))
							.iterator();

					while (fujaba__IterProcessToProcessToUseCase.hasNext()) {
						try {
							processToUseCase = (ProcessToUseCase) fujaba__IterProcessToProcessToUseCase
									.next();

							// check object processToUseCase is really bound
							JavaSDM.ensure(processToUseCase != null);
							// bind object
							useCase = processToUseCase.getTarget();

							// check object useCase is really bound
							JavaSDM.ensure(useCase != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object endEvent is really bound
								JavaSDM.ensure(endEvent != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToUseCase is really bound
								JavaSDM.ensure(processToUseCase != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link flowElements from endEvent to process
								JavaSDM.ensure(process.equals(endEvent
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from processToUseCase to process
								JavaSDM.ensure(process.equals(processToUseCase
										.getSource()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from processToUseCase to useCase
								JavaSDM.ensure(useCase.equals(processToUseCase
										.getTarget()));

								// check link targetRef from inFlow to endEvent
								JavaSDM.ensure(endEvent.equals(inFlow
										.getTargetRef()));

								// check link flowNodeRefs from lane to endEvent
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										endEvent));

								// create object __process_flowElements_endEvent
								__process_flowElements_endEvent = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToUseCase_source_process
								__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_laneSets_laneSet
								__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __process_flowElements_inFlow
								__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_targetRef_endEvent
								__inFlow_targetRef_endEvent = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __endEvent_incoming_inFlow
								__endEvent_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __lane_flowNodeRefs_endEvent
								__lane_flowNodeRefs_endEvent = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __useCase_flows_flow
								__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToUseCase_target_useCase
								__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __laneSet_lanes_lane
								__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __process_laneSets_laneSet
								__process_laneSets_laneSet.setName("laneSets");
								// assign attribute __process_flowElements_inFlow
								__process_flowElements_inFlow
										.setName("flowElements");
								// assign attribute __process_flowElements_endEvent
								__process_flowElements_endEvent
										.setName("flowElements");
								// assign attribute __inFlow_targetRef_endEvent
								__inFlow_targetRef_endEvent
										.setName("targetRef");
								// assign attribute __endEvent_incoming_inFlow
								__endEvent_incoming_inFlow.setName("incoming");
								// assign attribute __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow.setName("source");
								// assign attribute __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow.setName("target");
								// assign attribute __useCase_flows_flow
								__useCase_flows_flow.setName("flows");
								// assign attribute __processToUseCase_source_process
								__processToUseCase_source_process
										.setName("source");
								// assign attribute __processToUseCase_target_useCase
								__processToUseCase_target_useCase
										.setName("target");
								// assign attribute __lane_flowNodeRefs_endEvent
								__lane_flowNodeRefs_endEvent
										.setName("flowNodeRefs");
								// assign attribute __laneSet_lanes_lane
								__laneSet_lanes_lane.setName("lanes");

								// create link
								__process_flowElements_endEvent.setSrc(process);

								// create link
								__processToUseCase_source_process
										.setTrg(process);

								// create link
								__process_laneSets_laneSet.setSrc(process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										process);

								// create link
								__process_flowElements_inFlow.setSrc(process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlow);

								// create link
								__process_flowElements_inFlow.setTrg(inFlow);

								// create link
								__inFlow_targetRef_endEvent.setSrc(inFlow);

								// create link
								__inFlowToFlow_source_inFlow.setTrg(inFlow);

								// create link
								__endEvent_incoming_inFlow.setTrg(inFlow);

								// create link
								__endEvent_incoming_inFlow.setSrc(endEvent);

								// create link
								__lane_flowNodeRefs_endEvent.setTrg(endEvent);

								// create link
								__inFlow_targetRef_endEvent.setTrg(endEvent);

								// create link
								__process_flowElements_endEvent
										.setTrg(endEvent);

								// create link
								isApplicableMatch.getAllContextElements().add(
										endEvent);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__inFlowToFlow_target_flow.setTrg(flow);

								// create link
								__useCase_flows_flow.setTrg(flow);

								// create link
								__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlowToFlow);

								// create link
								__inFlowToFlow_source_inFlow
										.setSrc(inFlowToFlow);

								// create link
								__useCase_flows_flow.setSrc(useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								__processToUseCase_target_useCase
										.setTrg(useCase);

								// create link
								__processToUseCase_source_process
										.setSrc(processToUseCase);

								// create link
								__processToUseCase_target_useCase
										.setSrc(processToUseCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										processToUseCase);

								// create link
								__lane_flowNodeRefs_endEvent.setSrc(lane);

								// create link
								isApplicableMatch.getAllContextElements().add(
										lane);

								// create link
								__laneSet_lanes_lane.setTrg(lane);

								// create link
								__laneSet_lanes_lane.setSrc(laneSet);

								// create link
								__process_laneSets_laneSet.setTrg(laneSet);

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneSet);

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__processToUseCase_target_useCase,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__process_flowElements_endEvent,
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
												__useCase_flows_flow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__lane_flowNodeRefs_endEvent,
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
												__inFlowToFlow_source_inFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__endEvent_incoming_inFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__inFlow_targetRef_endEvent,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__processToUseCase_source_process,
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
												__process_laneSets_laneSet,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch, process,
													inFlow, endEvent, flow,
													inFlowToFlow, useCase,
													processToUseCase, lane,
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
												.setRuleName("EndEventRule");
										// assign attribute ruleresult
										ruleresult.setSuccess(true);

										// create link
										ruleresult.getIsApplicableMatch().add(
												isApplicableMatch);

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("endEvent", endEvent);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
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
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", true, csp);
		var_endEvent_name.setValue(endEvent.getName());
		var_endEvent_name.setType("String");
		Variable var_flow_finalState = CSPFactoryHelper.eINSTANCE
				.createVariable("flow.finalState", true, csp);
		var_flow_finalState.setValue(flow.getFinalState());
		var_flow_finalState.setType("String");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		SetCheckEqStr setCheckEqStr = new SetCheckEqStr();

		csp.getConstraints().add(setCheckEqStr);

		// Solve CSP
		setCheckEqStr.setRuleName("");
		setCheckEqStr.solve(var_endEvent_name, var_flow_finalState);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("endEvent", endEvent);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
			EObject process, EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject endEventToFlow, EObject useCase,
			EObject processToUseCase, EObject lane, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("endEvent", endEvent);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("endEventToFlow", endEventToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("endEvent").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEndEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_806797 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_985289 = null;
		SequenceFlow __DEC_endEvent_targetRef_985289 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEndEventToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		EndEvent endEvent = null;
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

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// check link flowElements from endEvent to process
			JavaSDM.ensure(process.equals(endEvent.eContainer()));

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
					// check link targetRef from inFlow to endEvent
					JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

					// iterate to-many link flowNodeRefs from endEvent to lane
					fujaba__Success = false;

					fujaba__IterEndEventToLane = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(endEvent, Lane.class,
											"flowNodeRefs")).iterator();

					while (fujaba__IterEndEventToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterEndEventToLane.next();

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
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_endEvent_flowElements_806797 = endEvent
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
													.eContainer() : null;

											// check object __DEC_endEvent_flowElements_806797 is really bound
											JavaSDM.ensure(__DEC_endEvent_flowElements_806797 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_endEvent_flowElements_806797
													.getFlowElements()
													.contains(endEvent));

											// check isomorphic binding between objects __DEC_endEvent_flowElements_806797 and process 
											JavaSDM.ensure(!__DEC_endEvent_flowElements_806797
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

											// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_985289
											fujaba__Success = false;

											fujaba__IterEndEventTo__DEC_endEvent_targetRef_985289 = new ArrayList(
													endEvent.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_985289
															.hasNext()) {
												try {
													__DEC_endEvent_targetRef_985289 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_985289
															.next();

													// check object __DEC_endEvent_targetRef_985289 is really bound
													JavaSDM.ensure(__DEC_endEvent_targetRef_985289 != null);
													// check isomorphic binding between objects __DEC_endEvent_targetRef_985289 and inFlow 
													JavaSDM.ensure(!__DEC_endEvent_targetRef_985289
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
										// check object endEvent is really bound
										JavaSDM.ensure(endEvent != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check link flowElements from endEvent to process
										JavaSDM.ensure(process.equals(endEvent
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

										// check link targetRef from inFlow to endEvent
										JavaSDM.ensure(endEvent.equals(inFlow
												.getTargetRef()));

										// check link trg from _edge_flowElements to endEvent
										JavaSDM.ensure(endEvent
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to endEvent
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(endEvent));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														endEvent, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_430208 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_1835 = null;
		SequenceFlow __DEC_endEvent_targetRef_1835 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterEndEventToLane = null;
		Lane lane = null;
		EndEvent endEvent = null;
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
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// check link targetRef from inFlow to endEvent
			JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from endEvent to lane
			fujaba__Success = false;

			fujaba__IterEndEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							endEvent, Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEndEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEndEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = endEvent.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) endEvent
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(endEvent));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

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
									__DEC_endEvent_flowElements_430208 = endEvent
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
											.eContainer() : null;

									// check object __DEC_endEvent_flowElements_430208 is really bound
									JavaSDM.ensure(__DEC_endEvent_flowElements_430208 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_endEvent_flowElements_430208
											.getFlowElements().contains(
													endEvent));

									// check isomorphic binding between objects __DEC_endEvent_flowElements_430208 and process 
									JavaSDM.ensure(!__DEC_endEvent_flowElements_430208
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

									// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_1835
									fujaba__Success = false;

									fujaba__IterEndEventTo__DEC_endEvent_targetRef_1835 = new ArrayList(
											endEvent.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_1835
													.hasNext()) {
										try {
											__DEC_endEvent_targetRef_1835 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_1835
													.next();

											// check object __DEC_endEvent_targetRef_1835 is really bound
											JavaSDM.ensure(__DEC_endEvent_targetRef_1835 != null);
											// check isomorphic binding between objects __DEC_endEvent_targetRef_1835 and inFlow 
											JavaSDM.ensure(!__DEC_endEvent_targetRef_1835
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
								// check object endEvent is really bound
								JavaSDM.ensure(endEvent != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from endEvent to process
								JavaSDM.ensure(process.equals(endEvent
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

								// check link targetRef from inFlow to endEvent
								JavaSDM.ensure(endEvent.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_targetRef to endEvent
								JavaSDM.ensure(endEvent.equals(_edge_targetRef
										.getTrg()));

								// check link flowNodeRefs from lane to endEvent
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										endEvent));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, endEvent, lane,
										laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_363037 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_210775 = null;
		SequenceFlow __DEC_endEvent_targetRef_210775 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		EndEvent endEvent = null;

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

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

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

			// check link flowElements from endEvent to process
			JavaSDM.ensure(process.equals(endEvent.eContainer()));

			// check link targetRef from inFlow to endEvent
			JavaSDM.ensure(endEvent.equals(inFlow.getTargetRef()));

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
							// check link flowNodeRefs from lane to endEvent
							JavaSDM.ensure(lane.getFlowNodeRefs().contains(
									endEvent));

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

									// check link trg from _edge_targetRef to endEvent
									JavaSDM.ensure(endEvent
											.equals(_edge_targetRef.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_endEvent_flowElements_363037 = endEvent
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
													.eContainer() : null;

											// check object __DEC_endEvent_flowElements_363037 is really bound
											JavaSDM.ensure(__DEC_endEvent_flowElements_363037 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_endEvent_flowElements_363037
													.getFlowElements()
													.contains(endEvent));

											// check isomorphic binding between objects __DEC_endEvent_flowElements_363037 and process 
											JavaSDM.ensure(!__DEC_endEvent_flowElements_363037
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

											// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_210775
											fujaba__Success = false;

											fujaba__IterEndEventTo__DEC_endEvent_targetRef_210775 = new ArrayList(
													endEvent.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_210775
															.hasNext()) {
												try {
													__DEC_endEvent_targetRef_210775 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_210775
															.next();

													// check object __DEC_endEvent_targetRef_210775 is really bound
													JavaSDM.ensure(__DEC_endEvent_targetRef_210775 != null);
													// check isomorphic binding between objects __DEC_endEvent_targetRef_210775 and inFlow 
													JavaSDM.ensure(!__DEC_endEvent_targetRef_210775
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
										// check object endEvent is really bound
										JavaSDM.ensure(endEvent != null);
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

										// check link flowElements from endEvent to process
										JavaSDM.ensure(process.equals(endEvent
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

										// check link src from _edge_incoming to endEvent
										JavaSDM.ensure(endEvent
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link targetRef from inFlow to endEvent
										JavaSDM.ensure(endEvent.equals(inFlow
												.getTargetRef()));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to endEvent
										JavaSDM.ensure(endEvent
												.equals(_edge_targetRef
														.getTrg()));

										// check link flowNodeRefs from lane to endEvent
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(endEvent));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														endEvent, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_endEvent_flowElements_402877 = null;
		Iterator fujaba__IterEndEventTo__DEC_endEvent_targetRef_171711 = null;
		SequenceFlow __DEC_endEvent_targetRef_171711 = null;
		Match match = null;
		Iterator fujaba__IterEndEventToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		EndEvent endEvent = null;
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

			// ensure correct type and really bound of object endEvent
			JavaSDM.ensure(_TmpObject instanceof EndEvent);
			endEvent = (EndEvent) _TmpObject;

			// bind object
			_TmpObject = endEvent.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) endEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(endEvent));

			// check link flowNodeRefs from lane to endEvent
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(endEvent));

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

					// iterate to-many link targetRef from endEvent to inFlow
					fujaba__Success = false;

					fujaba__IterEndEventToInFlow = new ArrayList(
							endEvent.getIncoming()).iterator();

					while (fujaba__IterEndEventToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEndEventToInFlow
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
									__DEC_endEvent_flowElements_402877 = endEvent
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) endEvent
											.eContainer() : null;

									// check object __DEC_endEvent_flowElements_402877 is really bound
									JavaSDM.ensure(__DEC_endEvent_flowElements_402877 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_endEvent_flowElements_402877
											.getFlowElements().contains(
													endEvent));

									// check isomorphic binding between objects __DEC_endEvent_flowElements_402877 and process 
									JavaSDM.ensure(!__DEC_endEvent_flowElements_402877
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

									// iterate to-many link targetRef from endEvent to __DEC_endEvent_targetRef_171711
									fujaba__Success = false;

									fujaba__IterEndEventTo__DEC_endEvent_targetRef_171711 = new ArrayList(
											endEvent.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEndEventTo__DEC_endEvent_targetRef_171711
													.hasNext()) {
										try {
											__DEC_endEvent_targetRef_171711 = (SequenceFlow) fujaba__IterEndEventTo__DEC_endEvent_targetRef_171711
													.next();

											// check object __DEC_endEvent_targetRef_171711 is really bound
											JavaSDM.ensure(__DEC_endEvent_targetRef_171711 != null);
											// check isomorphic binding between objects __DEC_endEvent_targetRef_171711 and inFlow 
											JavaSDM.ensure(!__DEC_endEvent_targetRef_171711
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
								// check object endEvent is really bound
								JavaSDM.ensure(endEvent != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check link flowElements from endEvent to process
								JavaSDM.ensure(process.equals(endEvent
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

								// check link targetRef from inFlow to endEvent
								JavaSDM.ensure(endEvent.equals(inFlow
										.getTargetRef()));

								// check link trg from _edge_flowNodeRefs to endEvent
								JavaSDM.ensure(endEvent
										.equals(_edge_flowNodeRefs.getTrg()));

								// check link flowNodeRefs from lane to endEvent
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										endEvent));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, endEvent, lane,
										laneSet);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
		case RulesPackage.END_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
			return null;
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Lane) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.END_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEventRuleImpl
