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

import BpmnToUseCaseIntegration.Rules.FirstInterThrowEventToStepRule;
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
 * An implementation of the model object '<em><b>First Inter Throw Event To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FirstInterThrowEventToStepRuleImpl extends AbstractRuleImpl
		implements FirstInterThrowEventToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstInterThrowEventToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFirstInterThrowEventToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, IntermediateThrowEvent event,
			bpmn2.Process process, SequenceFlow inFlow, SequenceFlow outFlow,
			FlowNode flowNode, Lane lane, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge __event_incoming_inFlow = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_event = null;
		EMoflonEdge __lane_flowNodeRefs_event = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, event,
					process, inFlow, outFlow, flowNode, lane, laneSet));

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

				// check object event is really bound
				JavaSDM.ensure(event != null);
				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects flowNode and event 
				JavaSDM.ensure(!flowNode.equals(event));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_event
				__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_event
				__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __event_incoming_inFlow
				__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __event_outgoing_outFlow
				__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_event
				__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_event
				__lane_flowNodeRefs_event = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_event
				__process_flowElements_event.setName("flowElements");
				// assign attribute __inFlow_targetRef_event
				__inFlow_targetRef_event.setName("targetRef");
				// assign attribute __event_incoming_inFlow
				__event_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_event
				__outFlow_sourceRef_event.setName("sourceRef");
				// assign attribute __event_outgoing_outFlow
				__event_outgoing_outFlow.setName("outgoing");
				// assign attribute __lane_flowNodeRefs_event
				__lane_flowNodeRefs_event.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_event, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_event, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__event_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__event_outgoing_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						event, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_event, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_event, "toBeTranslatedEdges");

				// create link
				__inFlow_targetRef_event.setTrg(event);

				// create link
				__event_outgoing_outFlow.setSrc(event);

				// create link
				__outFlow_sourceRef_event.setTrg(event);

				// create link
				__event_incoming_inFlow.setSrc(event);

				// create link
				__process_flowElements_event.setTrg(event);

				// create link
				__lane_flowNodeRefs_event.setTrg(event);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_event.setSrc(process);

				// create link
				__event_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_event.setSrc(inFlow);

				// create link
				__event_outgoing_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_event.setSrc(outFlow);

				// create link
				__lane_flowNodeRefs_event.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object event is really bound
				JavaSDM.ensure(event != null);
				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects flowNode and event 
				JavaSDM.ensure(!flowNode.equals(event));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_sourceRef_flowNode
				__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flowNode_outgoing_inFlow
				__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __inFlow_sourceRef_flowNode
				__inFlow_sourceRef_flowNode.setName("sourceRef");
				// assign attribute __flowNode_outgoing_inFlow
				__flowNode_outgoing_inFlow.setName("outgoing");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flowNode, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_sourceRef_flowNode, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flowNode_outgoing_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__inFlow_sourceRef_flowNode.setSrc(inFlow);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__flowNode_outgoing_inFlow.setTrg(inFlow);

				// create link
				__inFlow_sourceRef_flowNode.setTrg(flowNode);

				// create link
				__flowNode_outgoing_inFlow.setSrc(flowNode);

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
			this.registerObjectsToMatch_FWD(match, event, process, inFlow,
					outFlow, flowNode, lane, laneSet);
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
		IntermediateThrowEvent event = null;
		Flow flow = null;
		FlowNode flowNode = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep eventToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		NormalStep normalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge eventToNormalStep__target__normalStep = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge __lane_flowNodeRefs_event = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge eventToNormalStep__source__event = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge __event_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge __outFlow_sourceRef_event = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("event"));

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof FlowNode);
			flowNode = (FlowNode) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
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
			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

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
			// create object eventToNormalStep
			eventToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getValue("normalStep",
					"name"));
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getValue("normalStep",
					"label"));

			// create link
			outFlowToFlow.setTarget(flow);

			// create link
			eventToNormalStep.setSource(event);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			normalStep.setActor(actor);

			// create link
			flow.getSteps().add(normalStep);

			// create link
			eventToNormalStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects event and actor 
			JavaSDM.ensure(!event.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and actor 
			JavaSDM.ensure(!eventToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowNode and actor 
			JavaSDM.ensure(!flowNode.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and event 
			JavaSDM.ensure(!eventToNormalStep.equals(event));

			// check isomorphic binding between objects flow and event 
			JavaSDM.ensure(!flow.equals(event));

			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check isomorphic binding between objects inFlow and event 
			JavaSDM.ensure(!inFlow.equals(event));

			// check isomorphic binding between objects inFlowToFlow and event 
			JavaSDM.ensure(!inFlowToFlow.equals(event));

			// check isomorphic binding between objects lane and event 
			JavaSDM.ensure(!lane.equals(event));

			// check isomorphic binding between objects laneSet and event 
			JavaSDM.ensure(!laneSet.equals(event));

			// check isomorphic binding between objects normalStep and event 
			JavaSDM.ensure(!normalStep.equals(event));

			// check isomorphic binding between objects outFlow and event 
			JavaSDM.ensure(!outFlow.equals(event));

			// check isomorphic binding between objects outFlowToFlow and event 
			JavaSDM.ensure(!outFlowToFlow.equals(event));

			// check isomorphic binding between objects outFlowToNormalStep and event 
			JavaSDM.ensure(!outFlowToNormalStep.equals(event));

			// check isomorphic binding between objects process and event 
			JavaSDM.ensure(!process.equals(event));

			// check isomorphic binding between objects processToActor and event 
			JavaSDM.ensure(!processToActor.equals(event));

			// check isomorphic binding between objects flow and eventToNormalStep 
			JavaSDM.ensure(!flow.equals(eventToNormalStep));

			// check isomorphic binding between objects flowNode and eventToNormalStep 
			JavaSDM.ensure(!flowNode.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects lane and eventToNormalStep 
			JavaSDM.ensure(!lane.equals(eventToNormalStep));

			// check isomorphic binding between objects laneSet and eventToNormalStep 
			JavaSDM.ensure(!laneSet.equals(eventToNormalStep));

			// check isomorphic binding between objects normalStep and eventToNormalStep 
			JavaSDM.ensure(!normalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and eventToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects process and eventToNormalStep 
			JavaSDM.ensure(!process.equals(eventToNormalStep));

			// check isomorphic binding between objects processToActor and eventToNormalStep 
			JavaSDM.ensure(!processToActor.equals(eventToNormalStep));

			// check isomorphic binding between objects flowNode and flow 
			JavaSDM.ensure(!flowNode.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlow and flowNode 
			JavaSDM.ensure(!inFlow.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and flowNode 
			JavaSDM.ensure(!inFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects lane and flowNode 
			JavaSDM.ensure(!lane.equals(flowNode));

			// check isomorphic binding between objects laneSet and flowNode 
			JavaSDM.ensure(!laneSet.equals(flowNode));

			// check isomorphic binding between objects normalStep and flowNode 
			JavaSDM.ensure(!normalStep.equals(flowNode));

			// check isomorphic binding between objects outFlow and flowNode 
			JavaSDM.ensure(!outFlow.equals(flowNode));

			// check isomorphic binding between objects outFlowToFlow and flowNode 
			JavaSDM.ensure(!outFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects outFlowToNormalStep and flowNode 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flowNode));

			// check isomorphic binding between objects process and flowNode 
			JavaSDM.ensure(!process.equals(flowNode));

			// check isomorphic binding between objects processToActor and flowNode 
			JavaSDM.ensure(!processToActor.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToFlow and lane 
			JavaSDM.ensure(!outFlowToFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToFlow and laneSet 
			JavaSDM.ensure(!outFlowToFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object __event_outgoing_outFlow
			__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_event
			__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_event
			__lane_flowNodeRefs_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_event
			__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__source__event
			eventToNormalStep__source__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __event_incoming_inFlow
			__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_event
			__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("FirstInterThrowEventToStepRule");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_event
			__process_flowElements_event.setName("flowElements");
			// assign attribute __inFlow_targetRef_event
			__inFlow_targetRef_event.setName("targetRef");
			// assign attribute __event_incoming_inFlow
			__event_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_event
			__outFlow_sourceRef_event.setName("sourceRef");
			// assign attribute __event_outgoing_outFlow
			__event_outgoing_outFlow.setName("outgoing");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute eventToNormalStep__source__event
			eventToNormalStep__source__event.setName("source");
			// assign attribute eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute __lane_flowNodeRefs_event
			__lane_flowNodeRefs_event.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__event_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_event, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__source__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__event_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_event, "translatedEdges");

			// create link
			__event_incoming_inFlow.setSrc(event);

			// create link
			__outFlow_sourceRef_event.setTrg(event);

			// create link
			__process_flowElements_event.setTrg(event);

			// create link
			__event_outgoing_outFlow.setSrc(event);

			// create link
			eventToNormalStep__source__event.setTrg(event);

			// create link
			__lane_flowNodeRefs_event.setTrg(event);

			// create link
			__inFlow_targetRef_event.setTrg(event);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__process_flowElements_event.setSrc(process);

			// create link
			__inFlow_targetRef_event.setSrc(inFlow);

			// create link
			__event_incoming_inFlow.setTrg(inFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			__event_outgoing_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_event.setSrc(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			eventToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			eventToNormalStep__source__event.setSrc(eventToNormalStep);

			// create link
			eventToNormalStep__target__normalStep.setSrc(eventToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			__lane_flowNodeRefs_event.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, event, process, inFlow, outFlow,
				actor, processToActor, normalStep, eventToNormalStep,
				outFlowToNormalStep, flow, inFlowToFlow, outFlowToFlow,
				flowNode, lane, laneSet);
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
		IntermediateThrowEvent event = null;
		FlowNode flowNode = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		EMoflonEdge __event_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_event = null;
		EMoflonEdge __inFlow_targetRef_event = null;
		EMoflonEdge __lane_flowNodeRefs_event = null;
		EMoflonEdge __process_flowElements_event = null;
		EMoflonEdge __event_incoming_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
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
			ruleresult.setRule("FirstInterThrowEventToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("event"));

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;
			_TmpObject = (match.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof FlowNode);
			flowNode = (FlowNode) _TmpObject;
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
			_TmpObject = (match.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

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

					// iterate to-many link source from process to processToActor
					fujaba__Success = false;

					fujaba__IterProcessToProcessToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(process,
											ProcessToActor.class, "source"))
							.iterator();

					while (fujaba__IterProcessToProcessToActor.hasNext()) {
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
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToActor is really bound
								JavaSDM.ensure(processToActor != null);
								// check isomorphic binding between objects flowNode and event 
								JavaSDM.ensure(!flowNode.equals(event));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from processToActor to process
								JavaSDM.ensure(process.equals(processToActor
										.getSource()));

								// check link sourceRef from inFlow to flowNode
								JavaSDM.ensure(flowNode.equals(inFlow
										.getSourceRef()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from processToActor to actor
								JavaSDM.ensure(actor.equals(processToActor
										.getTarget()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link flowNodeRefs from lane to event
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										event));

								// create object __event_outgoing_outFlow
								__event_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __outFlow_sourceRef_event
								__outFlow_sourceRef_event = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_targetRef_event
								__inFlow_targetRef_event = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __lane_flowNodeRefs_event
								__lane_flowNodeRefs_event = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_event
								__process_flowElements_event = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __event_incoming_inFlow
								__event_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __process_flowElements_outFlow
								__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToActor_source_process
								__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_laneSets_laneSet
								__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_inFlow
								__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_sourceRef_flowNode
								__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __flowNode_outgoing_inFlow
								__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
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

								// assign attribute __process_laneSets_laneSet
								__process_laneSets_laneSet.setName("laneSets");
								// assign attribute __process_flowElements_inFlow
								__process_flowElements_inFlow
										.setName("flowElements");
								// assign attribute __process_flowElements_outFlow
								__process_flowElements_outFlow
										.setName("flowElements");
								// assign attribute __process_flowElements_event
								__process_flowElements_event
										.setName("flowElements");
								// assign attribute __inFlow_targetRef_event
								__inFlow_targetRef_event.setName("targetRef");
								// assign attribute __event_incoming_inFlow
								__event_incoming_inFlow.setName("incoming");
								// assign attribute __outFlow_sourceRef_event
								__outFlow_sourceRef_event.setName("sourceRef");
								// assign attribute __event_outgoing_outFlow
								__event_outgoing_outFlow.setName("outgoing");
								// assign attribute __processToActor_source_process
								__processToActor_source_process
										.setName("source");
								// assign attribute __processToActor_target_actor
								__processToActor_target_actor.setName("target");
								// assign attribute __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow.setName("source");
								// assign attribute __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow.setName("target");
								// assign attribute __inFlow_sourceRef_flowNode
								__inFlow_sourceRef_flowNode
										.setName("sourceRef");
								// assign attribute __flowNode_outgoing_inFlow
								__flowNode_outgoing_inFlow.setName("outgoing");
								// assign attribute __lane_flowNodeRefs_event
								__lane_flowNodeRefs_event
										.setName("flowNodeRefs");
								// assign attribute __laneSet_lanes_lane
								__laneSet_lanes_lane.setName("lanes");

								// create link
								__event_outgoing_outFlow.setSrc(event);

								// create link
								__outFlow_sourceRef_event.setTrg(event);

								// create link
								__inFlow_targetRef_event.setTrg(event);

								// create link
								__lane_flowNodeRefs_event.setTrg(event);

								// create link
								__process_flowElements_event.setTrg(event);

								// create link
								__event_incoming_inFlow.setSrc(event);

								// create link
								isApplicableMatch.getAllContextElements().add(
										event);

								// create link
								__process_flowElements_outFlow.setSrc(process);

								// create link
								__process_flowElements_event.setSrc(process);

								// create link
								__processToActor_source_process.setTrg(process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										process);

								// create link
								__process_laneSets_laneSet.setSrc(process);

								// create link
								__process_flowElements_inFlow.setSrc(process);

								// create link
								__inFlow_targetRef_event.setSrc(inFlow);

								// create link
								__inFlow_sourceRef_flowNode.setSrc(inFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlow);

								// create link
								__inFlowToFlow_source_inFlow.setTrg(inFlow);

								// create link
								__process_flowElements_inFlow.setTrg(inFlow);

								// create link
								__flowNode_outgoing_inFlow.setTrg(inFlow);

								// create link
								__event_incoming_inFlow.setTrg(inFlow);

								// create link
								__outFlow_sourceRef_event.setSrc(outFlow);

								// create link
								__event_outgoing_outFlow.setTrg(outFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										outFlow);

								// create link
								__process_flowElements_outFlow.setTrg(outFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								__processToActor_target_actor.setTrg(actor);

								// create link
								__processToActor_target_actor
										.setSrc(processToActor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										processToActor);

								// create link
								__processToActor_source_process
										.setSrc(processToActor);

								// create link
								__inFlowToFlow_target_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlowToFlow);

								// create link
								__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

								// create link
								__inFlowToFlow_source_inFlow
										.setSrc(inFlowToFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flowNode);

								// create link
								__flowNode_outgoing_inFlow.setSrc(flowNode);

								// create link
								__inFlow_sourceRef_flowNode.setTrg(flowNode);

								// create link
								__lane_flowNodeRefs_event.setSrc(lane);

								// create link
								__laneSet_lanes_lane.setTrg(lane);

								// create link
								isApplicableMatch.getAllContextElements().add(
										lane);

								// create link
								__laneSet_lanes_lane.setSrc(laneSet);

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneSet);

								// create link
								__process_laneSets_laneSet.setTrg(laneSet);

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__flowNode_outgoing_inFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__inFlow_targetRef_event,
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
												__event_outgoing_outFlow,
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
												__process_flowElements_event,
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
												__processToActor_target_actor,
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
												__process_flowElements_outFlow,
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
												__event_incoming_inFlow,
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
												__lane_flowNodeRefs_event,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__outFlow_sourceRef_event,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__inFlow_sourceRef_flowNode,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch, event,
													process, inFlow, outFlow,
													actor, processToActor,
													flow, inFlowToFlow,
													flowNode, lane, laneSet));

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
												.setRuleName("FirstInterThrowEventToStepRule");
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
	public void registerObjectsToMatch_FWD(Match match,
			IntermediateThrowEvent event, bpmn2.Process process,
			SequenceFlow inFlow, SequenceFlow outFlow, FlowNode flowNode,
			Lane lane, LaneSet laneSet) {
		match.registerObject("event", event);
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("outFlow", outFlow);
		match.registerObject("flowNode", flowNode);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			IntermediateThrowEvent event, bpmn2.Process process,
			SequenceFlow inFlow, SequenceFlow outFlow, FlowNode flowNode,
			Lane lane, LaneSet laneSet) {
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
			IntermediateThrowEvent event, bpmn2.Process process,
			SequenceFlow inFlow, SequenceFlow outFlow, Actor actor,
			ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, FlowNode flowNode, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("");
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", true, csp);
		var_event_name.setValue(event.getName());
		var_event_name.setType("");

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
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("event", event);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flowNode", flowNode);
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
			EObject event, EObject process, EObject inFlow, EObject outFlow,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject eventToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow,
			EObject flowNode, EObject lane, EObject laneSet) {
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("eventToNormalStep", eventToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("event")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getIntermediateThrowEvent())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
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
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;

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
				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				__normalStep_actor_actor.setTrg(actor);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

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
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");
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
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		Flow flow = null;
		FlowNode flowNode = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		bpmn2.Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		IntermediateThrowEvent event = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep eventToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge event__outgoing__outFlow = null;
		EMoflonEdge inFlow__targetRef__event = null;
		EMoflonEdge eventToNormalStep__source__event = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge event__incoming__inFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge outFlow__sourceRef__event = null;
		EMoflonEdge eventToNormalStep__target__normalStep = null;
		EMoflonEdge process__flowElements__event = null;
		EMoflonEdge lane__flowNodeRefs__event = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;

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
			_TmpObject = (isApplicableMatch.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof FlowNode);
			flowNode = (FlowNode) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
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
			// create object event
			event = Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object eventToNormalStep
			eventToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute event
			event.setId((java.lang.String) csp.getValue("event", "id"));
			// assign attribute event
			event.setName((java.lang.String) csp.getValue("event", "name"));

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			eventToNormalStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			outFlowToFlow.setTarget(flow);

			// create link
			lane.getFlowNodeRefs().add(event);

			// create link
			outFlow.setSourceRef(event);

			// create link
			eventToNormalStep.setSource(event);

			// create link
			inFlow.setTargetRef(event);

			// create link
			process.getFlowElements().add(event);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object event is really bound
			JavaSDM.ensure(event != null);
			// check object eventToNormalStep is really bound
			JavaSDM.ensure(eventToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects event and actor 
			JavaSDM.ensure(!event.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and actor 
			JavaSDM.ensure(!eventToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowNode and actor 
			JavaSDM.ensure(!flowNode.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects eventToNormalStep and event 
			JavaSDM.ensure(!eventToNormalStep.equals(event));

			// check isomorphic binding between objects flow and event 
			JavaSDM.ensure(!flow.equals(event));

			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check isomorphic binding between objects inFlow and event 
			JavaSDM.ensure(!inFlow.equals(event));

			// check isomorphic binding between objects inFlowToFlow and event 
			JavaSDM.ensure(!inFlowToFlow.equals(event));

			// check isomorphic binding between objects lane and event 
			JavaSDM.ensure(!lane.equals(event));

			// check isomorphic binding between objects laneSet and event 
			JavaSDM.ensure(!laneSet.equals(event));

			// check isomorphic binding between objects normalStep and event 
			JavaSDM.ensure(!normalStep.equals(event));

			// check isomorphic binding between objects outFlow and event 
			JavaSDM.ensure(!outFlow.equals(event));

			// check isomorphic binding between objects outFlowToFlow and event 
			JavaSDM.ensure(!outFlowToFlow.equals(event));

			// check isomorphic binding between objects outFlowToNormalStep and event 
			JavaSDM.ensure(!outFlowToNormalStep.equals(event));

			// check isomorphic binding between objects process and event 
			JavaSDM.ensure(!process.equals(event));

			// check isomorphic binding between objects processToActor and event 
			JavaSDM.ensure(!processToActor.equals(event));

			// check isomorphic binding between objects flow and eventToNormalStep 
			JavaSDM.ensure(!flow.equals(eventToNormalStep));

			// check isomorphic binding between objects flowNode and eventToNormalStep 
			JavaSDM.ensure(!flowNode.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects lane and eventToNormalStep 
			JavaSDM.ensure(!lane.equals(eventToNormalStep));

			// check isomorphic binding between objects laneSet and eventToNormalStep 
			JavaSDM.ensure(!laneSet.equals(eventToNormalStep));

			// check isomorphic binding between objects normalStep and eventToNormalStep 
			JavaSDM.ensure(!normalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and eventToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(eventToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and eventToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventToNormalStep));

			// check isomorphic binding between objects process and eventToNormalStep 
			JavaSDM.ensure(!process.equals(eventToNormalStep));

			// check isomorphic binding between objects processToActor and eventToNormalStep 
			JavaSDM.ensure(!processToActor.equals(eventToNormalStep));

			// check isomorphic binding between objects flowNode and flow 
			JavaSDM.ensure(!flowNode.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlow and flowNode 
			JavaSDM.ensure(!inFlow.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and flowNode 
			JavaSDM.ensure(!inFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects lane and flowNode 
			JavaSDM.ensure(!lane.equals(flowNode));

			// check isomorphic binding between objects laneSet and flowNode 
			JavaSDM.ensure(!laneSet.equals(flowNode));

			// check isomorphic binding between objects normalStep and flowNode 
			JavaSDM.ensure(!normalStep.equals(flowNode));

			// check isomorphic binding between objects outFlow and flowNode 
			JavaSDM.ensure(!outFlow.equals(flowNode));

			// check isomorphic binding between objects outFlowToFlow and flowNode 
			JavaSDM.ensure(!outFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects outFlowToNormalStep and flowNode 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flowNode));

			// check isomorphic binding between objects process and flowNode 
			JavaSDM.ensure(!process.equals(flowNode));

			// check isomorphic binding between objects processToActor and flowNode 
			JavaSDM.ensure(!processToActor.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToFlow and lane 
			JavaSDM.ensure(!outFlowToFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToActor and lane 
			JavaSDM.ensure(!processToActor.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToFlow and laneSet 
			JavaSDM.ensure(!outFlowToFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToActor and laneSet 
			JavaSDM.ensure(!processToActor.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object event__outgoing__outFlow
			event__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__event
			inFlow__targetRef__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__source__event
			eventToNormalStep__source__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object event__incoming__inFlow
			event__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__event
			outFlow__sourceRef__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__event
			process__flowElements__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object lane__flowNodeRefs__event
			lane__flowNodeRefs__event = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("FirstInterThrowEventToStepRule");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute process__flowElements__event
			process__flowElements__event.setName("flowElements");
			// assign attribute inFlow__targetRef__event
			inFlow__targetRef__event.setName("targetRef");
			// assign attribute event__incoming__inFlow
			event__incoming__inFlow.setName("incoming");
			// assign attribute outFlow__sourceRef__event
			outFlow__sourceRef__event.setName("sourceRef");
			// assign attribute event__outgoing__outFlow
			event__outgoing__outFlow.setName("outgoing");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute eventToNormalStep__source__event
			eventToNormalStep__source__event.setName("source");
			// assign attribute eventToNormalStep__target__normalStep
			eventToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute lane__flowNodeRefs__event
			lane__flowNodeRefs__event.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__source__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					event__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane__flowNodeRefs__event, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			eventToNormalStep__source__event.setTrg(event);

			// create link
			outFlow__sourceRef__event.setTrg(event);

			// create link
			inFlow__targetRef__event.setTrg(event);

			// create link
			event__incoming__inFlow.setSrc(event);

			// create link
			lane__flowNodeRefs__event.setTrg(event);

			// create link
			process__flowElements__event.setTrg(event);

			// create link
			event__outgoing__outFlow.setSrc(event);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			process__flowElements__event.setSrc(process);

			// create link
			event__incoming__inFlow.setTrg(inFlow);

			// create link
			inFlow__targetRef__event.setSrc(inFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__event.setSrc(outFlow);

			// create link
			event__outgoing__outFlow.setTrg(outFlow);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			eventToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			eventToNormalStep__source__event.setSrc(eventToNormalStep);

			// create link
			eventToNormalStep__target__normalStep.setSrc(eventToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			lane__flowNodeRefs__event.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, event, process, inFlow, outFlow,
				actor, processToActor, normalStep, eventToNormalStep,
				outFlowToNormalStep, flow, inFlowToFlow, outFlowToFlow,
				flowNode, lane, laneSet);
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
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __processToActor_source_process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		FlowNode flowNode = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
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
			ruleresult.setRule("FirstInterThrowEventToStepRule");

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
			// check object match is really bound
			JavaSDM.ensure(match != null);
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

					// iterate to-many link target from actor to processToActor
					fujaba__Success = false;

					fujaba__IterActorToProcessToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(actor,
											ProcessToActor.class, "target"))
							.iterator();

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
								// check object normalStep is really bound
								JavaSDM.ensure(normalStep != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToActor is really bound
								JavaSDM.ensure(processToActor != null);
								// check link actor from normalStep to actor
								JavaSDM.ensure(actor.equals(normalStep
										.getActor()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from processToActor to process
								JavaSDM.ensure(process.equals(processToActor
										.getSource()));

								// bind object
								flowNode = inFlow.getSourceRef();

								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);

								// check link steps from normalStep to flow
								JavaSDM.ensure(flow.equals(normalStep
										.eContainer()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from processToActor to actor
								JavaSDM.ensure(actor.equals(processToActor
										.getTarget()));

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
										// iterate to-many link lanes from laneSet to lane
										fujaba__Success = false;

										fujaba__IterLaneSetToLane = new ArrayList(
												laneSet.getLanes()).iterator();

										while (fujaba__IterLaneSetToLane
												.hasNext()) {
											try {
												lane = (Lane) fujaba__IterLaneSetToLane
														.next();

												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// create object __process_flowElements_inFlow
												__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_laneSets_laneSet
												__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __processToActor_source_process
												__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlow_sourceRef_flowNode
												__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flowNode_outgoing_inFlow
												__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __processToActor_target_actor
												__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __normalStep_actor_actor
												__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flow_steps_normalStep
												__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __laneSet_lanes_lane
												__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

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
												// assign attribute __inFlow_sourceRef_flowNode
												__inFlow_sourceRef_flowNode
														.setName("sourceRef");
												// assign attribute __flowNode_outgoing_inFlow
												__flowNode_outgoing_inFlow
														.setName("outgoing");
												// assign attribute __laneSet_lanes_lane
												__laneSet_lanes_lane
														.setName("lanes");

												// create link
												__process_flowElements_inFlow
														.setSrc(process);

												// create link
												__process_laneSets_laneSet
														.setSrc(process);

												// create link
												__processToActor_source_process
														.setTrg(process);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(process);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setTrg(inFlow);

												// create link
												__process_flowElements_inFlow
														.setTrg(inFlow);

												// create link
												__inFlow_sourceRef_flowNode
														.setSrc(inFlow);

												// create link
												__flowNode_outgoing_inFlow
														.setTrg(inFlow);

												// create link
												__processToActor_target_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(actor);

												// create link
												__normalStep_actor_actor
														.setTrg(actor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(processToActor);

												// create link
												__processToActor_source_process
														.setSrc(processToActor);

												// create link
												__processToActor_target_actor
														.setSrc(processToActor);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(normalStep);

												// create link
												__flow_steps_normalStep
														.setTrg(normalStep);

												// create link
												__normalStep_actor_actor
														.setSrc(normalStep);

												// create link
												__inFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__flow_steps_normalStep
														.setSrc(flow);

												// create link
												__inFlowToFlow_target_flow
														.setSrc(inFlowToFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setSrc(inFlowToFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlowToFlow);

												// create link
												__inFlow_sourceRef_flowNode
														.setTrg(flowNode);

												// create link
												__flowNode_outgoing_inFlow
														.setSrc(flowNode);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flowNode);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(lane);

												// create link
												__laneSet_lanes_lane
														.setTrg(lane);

												// create link
												__laneSet_lanes_lane
														.setSrc(laneSet);

												// create link
												__process_laneSets_laneSet
														.setTrg(laneSet);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(laneSet);

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
																__process_laneSets_laneSet,
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
																__inFlow_sourceRef_flowNode,
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
																__flowNode_outgoing_inFlow,
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
																__flow_steps_normalStep,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__processToActor_source_process,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_BWD(
																	isApplicableMatch,
																	process,
																	inFlow,
																	actor,
																	processToActor,
																	normalStep,
																	flow,
																	inFlowToFlow,
																	flowNode,
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
																.setRuleName("FirstInterThrowEventToStepRule");
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

		return ruleresult;
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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Actor actor,
			ProcessToActor processToActor, NormalStep normalStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, FlowNode flowNode, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", csp);
		var_event_id.setType("");
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", csp);
		var_event_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flowNode", flowNode);
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
			EObject event, EObject process, EObject inFlow, EObject outFlow,
			EObject actor, EObject processToActor, EObject normalStep,
			EObject eventToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow,
			EObject flowNode, EObject lane, EObject laneSet) {
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("eventToNormalStep", eventToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("flowNode", flowNode);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_39(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_331402 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_500763 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_922792 = null;
		ExclusiveGateway __DEC_outFlow_default_922792 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_665254 = null;
		SequenceFlow __DEC_event_targetRef_665254 = null;
		Match match = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		FlowNode flowNode = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEvent = null;
		IntermediateThrowEvent event = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;

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
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// iterate to-many link flowElements from process to event
			fujaba__Success = false;

			fujaba__IterProcessToEvent = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEvent.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEvent.next();

					// ensure correct type and really bound of object event
					JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
					event = (IntermediateThrowEvent) _TmpObject;
					// check link sourceRef from outFlow to event
					JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

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
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// bind object
							flowNode = inFlow.getSourceRef();

							// check object flowNode is really bound
							JavaSDM.ensure(flowNode != null);

							// check isomorphic binding between objects flowNode and event 
							JavaSDM.ensure(!flowNode.equals(event));

							// check link targetRef from inFlow to event
							JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

							// iterate to-many link flowNodeRefs from event to lane
							fujaba__Success = false;

							fujaba__IterEventToLane = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(event,
													Lane.class, "flowNodeRefs"))
									.iterator();

							while (fujaba__IterEventToLane.hasNext()) {
								try {
									lane = (Lane) fujaba__IterEventToLane
											.next();

									// check object lane is really bound
									JavaSDM.ensure(lane != null);
									// bind object
									laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
											.eContainer() : null;

									// check object laneSet is really bound
									JavaSDM.ensure(laneSet != null);

									// check if contained via correct reference
									JavaSDM.ensure(laneSet.getLanes().contains(
											lane));

									// check link laneSets from laneSet to process
									JavaSDM.ensure(process.equals(laneSet
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_event_flowElements_331402 = event
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
													.eContainer() : null;

											// check object __DEC_event_flowElements_331402 is really bound
											JavaSDM.ensure(__DEC_event_flowElements_331402 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_event_flowElements_331402
													.getFlowElements()
													.contains(event));

											// check isomorphic binding between objects __DEC_event_flowElements_331402 and process 
											JavaSDM.ensure(!__DEC_event_flowElements_331402
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

											// bind object
											__DEC_outFlow_flowElements_500763 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_500763 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_500763 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_500763
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_500763 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_500763
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_922792
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_922792 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_922792
															.hasNext()) {
												try {
													__DEC_outFlow_default_922792 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_922792
															.next();

													// check object __DEC_outFlow_default_922792 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_922792 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_922792 and flowNode 
													JavaSDM.ensure(!__DEC_outFlow_default_922792
															.equals(flowNode));

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from event to __DEC_event_targetRef_665254
											fujaba__Success = false;

											fujaba__IterEventTo__DEC_event_targetRef_665254 = new ArrayList(
													event.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventTo__DEC_event_targetRef_665254
															.hasNext()) {
												try {
													__DEC_event_targetRef_665254 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_665254
															.next();

													// check object __DEC_event_targetRef_665254 is really bound
													JavaSDM.ensure(__DEC_event_targetRef_665254 != null);
													// check isomorphic binding between objects __DEC_event_targetRef_665254 and inFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_665254
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_event_targetRef_665254 and outFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_665254
															.equals(outFlow));

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
										// check object event is really bound
										JavaSDM.ensure(event != null);
										// check object flowNode is really bound
										JavaSDM.ensure(flowNode != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects flowNode and event 
										JavaSDM.ensure(!flowNode.equals(event));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from event to process
										JavaSDM.ensure(process.equals(event
												.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from inFlow to flowNode
										JavaSDM.ensure(flowNode.equals(inFlow
												.getSourceRef()));

										// check link sourceRef from outFlow to event
										JavaSDM.ensure(event.equals(outFlow
												.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to event
										JavaSDM.ensure(event.equals(inFlow
												.getTargetRef()));

										// check link targetRef from outFlow to event
										JavaSDM.ensure(!(event.equals(outFlow
												.getTargetRef())));

										// check link trg from _edge_flowElements to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to event
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(event));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														event, process, inFlow,
														outFlow, flowNode,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_40(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_141735 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_23252 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_317460 = null;
		ExclusiveGateway __DEC_outFlow_default_317460 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_504116 = null;
		SequenceFlow __DEC_event_targetRef_504116 = null;
		Match match = null;
		FlowNode flowNode = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		IntermediateThrowEvent event = null;
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

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// check link flowElements from event to process
			JavaSDM.ensure(process.equals(event.eContainer()));

			// iterate to-many link flowNodeRefs from event to lane
			fujaba__Success = false;

			fujaba__IterEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(event,
							Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);

					// check if contained via correct reference
					JavaSDM.ensure(laneSet.getLanes().contains(lane));

					// check link laneSets from laneSet to process
					JavaSDM.ensure(process.equals(laneSet.eContainer()));

					// iterate to-many link sourceRef from event to outFlow
					fujaba__Success = false;

					fujaba__IterEventToOutFlow = new ArrayList(
							event.getOutgoing()).iterator();

					while (fujaba__IterEventToOutFlow.hasNext()) {
						try {
							outFlow = (SequenceFlow) fujaba__IterEventToOutFlow
									.next();

							// check object outFlow is really bound
							JavaSDM.ensure(outFlow != null);
							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// iterate to-many link targetRef from event to inFlow
							fujaba__Success = false;

							fujaba__IterEventToInFlow = new ArrayList(
									event.getIncoming()).iterator();

							while (fujaba__IterEventToInFlow.hasNext()) {
								try {
									inFlow = (SequenceFlow) fujaba__IterEventToInFlow
											.next();

									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link flowElements from inFlow to process
									JavaSDM.ensure(process.equals(inFlow
											.eContainer()));

									// bind object
									flowNode = inFlow.getSourceRef();

									// check object flowNode is really bound
									JavaSDM.ensure(flowNode != null);

									// check isomorphic binding between objects flowNode and event 
									JavaSDM.ensure(!flowNode.equals(event));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_event_flowElements_141735 = event
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
													.eContainer() : null;

											// check object __DEC_event_flowElements_141735 is really bound
											JavaSDM.ensure(__DEC_event_flowElements_141735 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_event_flowElements_141735
													.getFlowElements()
													.contains(event));

											// check isomorphic binding between objects __DEC_event_flowElements_141735 and process 
											JavaSDM.ensure(!__DEC_event_flowElements_141735
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

											// bind object
											__DEC_outFlow_flowElements_23252 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_23252 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_23252 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_23252
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_23252 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_23252
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_317460
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_317460 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_317460
															.hasNext()) {
												try {
													__DEC_outFlow_default_317460 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_317460
															.next();

													// check object __DEC_outFlow_default_317460 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_317460 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_317460 and flowNode 
													JavaSDM.ensure(!__DEC_outFlow_default_317460
															.equals(flowNode));

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from event to __DEC_event_targetRef_504116
											fujaba__Success = false;

											fujaba__IterEventTo__DEC_event_targetRef_504116 = new ArrayList(
													event.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventTo__DEC_event_targetRef_504116
															.hasNext()) {
												try {
													__DEC_event_targetRef_504116 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_504116
															.next();

													// check object __DEC_event_targetRef_504116 is really bound
													JavaSDM.ensure(__DEC_event_targetRef_504116 != null);
													// check isomorphic binding between objects __DEC_event_targetRef_504116 and inFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_504116
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_event_targetRef_504116 and outFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_504116
															.equals(outFlow));

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
										// check object event is really bound
										JavaSDM.ensure(event != null);
										// check object flowNode is really bound
										JavaSDM.ensure(flowNode != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects flowNode and event 
										JavaSDM.ensure(!flowNode.equals(event));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from event to process
										JavaSDM.ensure(process.equals(event
												.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from inFlow to flowNode
										JavaSDM.ensure(flowNode.equals(inFlow
												.getSourceRef()));

										// check link sourceRef from outFlow to event
										JavaSDM.ensure(event.equals(outFlow
												.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link targetRef from inFlow to event
										JavaSDM.ensure(event.equals(inFlow
												.getTargetRef()));

										// check link targetRef from outFlow to event
										JavaSDM.ensure(!(event.equals(outFlow
												.getTargetRef())));

										// check link trg from _edge_flowElements to event
										JavaSDM.ensure(event
												.equals(_edge_flowElements
														.getTrg()));

										// check link flowNodeRefs from lane to event
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(event));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														event, process, inFlow,
														outFlow, flowNode,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_41(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_261185 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_13578 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_291399 = null;
		ExclusiveGateway __DEC_outFlow_default_291399 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_266043 = null;
		SequenceFlow __DEC_event_targetRef_266043 = null;
		Match match = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		bpmn2.Process process = null;
		IntermediateThrowEvent event = null;
		FlowNode flowNode = null;
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
			flowNode = inFlow.getSourceRef();

			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// bind object
			_TmpObject = event.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link targetRef from inFlow to event
			JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from event to lane
			fujaba__Success = false;

			fujaba__IterEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(event,
							Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);

					// check if contained via correct reference
					JavaSDM.ensure(laneSet.getLanes().contains(lane));

					// check link laneSets from laneSet to process
					JavaSDM.ensure(process.equals(laneSet.eContainer()));

					// iterate to-many link sourceRef from event to outFlow
					fujaba__Success = false;

					fujaba__IterEventToOutFlow = new ArrayList(
							event.getOutgoing()).iterator();

					while (fujaba__IterEventToOutFlow.hasNext()) {
						try {
							outFlow = (SequenceFlow) fujaba__IterEventToOutFlow
									.next();

							// check object outFlow is really bound
							JavaSDM.ensure(outFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_261185 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_261185 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_261185 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_261185
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_261185 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_261185
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

									// bind object
									__DEC_outFlow_flowElements_13578 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_13578 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_13578 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_13578
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_13578 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_13578
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_291399
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_291399 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_291399
													.hasNext()) {
										try {
											__DEC_outFlow_default_291399 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_291399
													.next();

											// check object __DEC_outFlow_default_291399 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_291399 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_291399 and flowNode 
											JavaSDM.ensure(!__DEC_outFlow_default_291399
													.equals(flowNode));

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

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_266043
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_266043 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_266043
													.hasNext()) {
										try {
											__DEC_event_targetRef_266043 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_266043
													.next();

											// check object __DEC_event_targetRef_266043 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_266043 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_266043 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_266043
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_266043 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_266043
													.equals(outFlow));

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
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects flowNode and event 
								JavaSDM.ensure(!flowNode.equals(event));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link sourceRef from inFlow to flowNode
								JavaSDM.ensure(flowNode.equals(inFlow
										.getSourceRef()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_targetRef to event
								JavaSDM.ensure(event.equals(_edge_targetRef
										.getTrg()));

								// check link flowNodeRefs from lane to event
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										event));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, process, inFlow, outFlow,
										flowNode, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_42(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_661015 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_949923 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_997095 = null;
		ExclusiveGateway __DEC_outFlow_default_997095 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_578866 = null;
		SequenceFlow __DEC_event_targetRef_578866 = null;
		Match match = null;
		Iterator fujaba__IterEventTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		FlowNode flowNode = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		IntermediateThrowEvent event = null;

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

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// bind object
			flowNode = inFlow.getSourceRef();

			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);

			// check isomorphic binding between objects flowNode and event 
			JavaSDM.ensure(!flowNode.equals(event));

			// check link targetRef from inFlow to event
			JavaSDM.ensure(event.equals(inFlow.getTargetRef()));

			// iterate to-many link flowNodeRefs from event to lane
			fujaba__Success = false;

			fujaba__IterEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(event,
							Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);

					// check if contained via correct reference
					JavaSDM.ensure(laneSet.getLanes().contains(lane));

					// check link laneSets from laneSet to process
					JavaSDM.ensure(process.equals(laneSet.eContainer()));

					// iterate to-many link sourceRef from event to outFlow
					fujaba__Success = false;

					fujaba__IterEventToOutFlow = new ArrayList(
							event.getOutgoing()).iterator();

					while (fujaba__IterEventToOutFlow.hasNext()) {
						try {
							outFlow = (SequenceFlow) fujaba__IterEventToOutFlow
									.next();

							// check object outFlow is really bound
							JavaSDM.ensure(outFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// iterate to-many link trg from event to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterEventTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(event,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterEventTo_edge_targetRef.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterEventTo_edge_targetRef
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
											__DEC_event_flowElements_661015 = event
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
													.eContainer() : null;

											// check object __DEC_event_flowElements_661015 is really bound
											JavaSDM.ensure(__DEC_event_flowElements_661015 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_event_flowElements_661015
													.getFlowElements()
													.contains(event));

											// check isomorphic binding between objects __DEC_event_flowElements_661015 and process 
											JavaSDM.ensure(!__DEC_event_flowElements_661015
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

											// bind object
											__DEC_outFlow_flowElements_949923 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_949923 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_949923 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_949923
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_949923 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_949923
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_997095
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_997095 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_997095
															.hasNext()) {
												try {
													__DEC_outFlow_default_997095 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_997095
															.next();

													// check object __DEC_outFlow_default_997095 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_997095 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_997095 and flowNode 
													JavaSDM.ensure(!__DEC_outFlow_default_997095
															.equals(flowNode));

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from event to __DEC_event_targetRef_578866
											fujaba__Success = false;

											fujaba__IterEventTo__DEC_event_targetRef_578866 = new ArrayList(
													event.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventTo__DEC_event_targetRef_578866
															.hasNext()) {
												try {
													__DEC_event_targetRef_578866 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_578866
															.next();

													// check object __DEC_event_targetRef_578866 is really bound
													JavaSDM.ensure(__DEC_event_targetRef_578866 != null);
													// check isomorphic binding between objects __DEC_event_targetRef_578866 and inFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_578866
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_event_targetRef_578866 and outFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_578866
															.equals(outFlow));

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
										// check object event is really bound
										JavaSDM.ensure(event != null);
										// check object flowNode is really bound
										JavaSDM.ensure(flowNode != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
										JavaSDM.ensure(!_edge_targetRef
												.equals(_edge_incoming));

										// check isomorphic binding between objects flowNode and event 
										JavaSDM.ensure(!flowNode.equals(event));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from event to process
										JavaSDM.ensure(process.equals(event
												.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from inFlow to flowNode
										JavaSDM.ensure(flowNode.equals(inFlow
												.getSourceRef()));

										// check link sourceRef from outFlow to event
										JavaSDM.ensure(event.equals(outFlow
												.getSourceRef()));

										// check link src from _edge_incoming to event
										JavaSDM.ensure(event
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link targetRef from inFlow to event
										JavaSDM.ensure(event.equals(inFlow
												.getTargetRef()));

										// check link targetRef from outFlow to event
										JavaSDM.ensure(!(event.equals(outFlow
												.getTargetRef())));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to event
										JavaSDM.ensure(event
												.equals(_edge_targetRef
														.getTrg()));

										// check link flowNodeRefs from lane to event
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(event));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														event, process, inFlow,
														outFlow, flowNode,
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_43(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_597606 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_513108 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_766857 = null;
		ExclusiveGateway __DEC_outFlow_default_766857 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_171162 = null;
		SequenceFlow __DEC_event_targetRef_171162 = null;
		Match match = null;
		FlowNode flowNode = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		bpmn2.Process process = null;
		IntermediateThrowEvent event = null;
		SequenceFlow outFlow = null;

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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to event
			JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

			// iterate to-many link flowNodeRefs from event to lane
			fujaba__Success = false;

			fujaba__IterEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(event,
							Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);

					// check if contained via correct reference
					JavaSDM.ensure(laneSet.getLanes().contains(lane));

					// check link laneSets from laneSet to process
					JavaSDM.ensure(process.equals(laneSet.eContainer()));

					// iterate to-many link targetRef from event to inFlow
					fujaba__Success = false;

					fujaba__IterEventToInFlow = new ArrayList(
							event.getIncoming()).iterator();

					while (fujaba__IterEventToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// bind object
							flowNode = inFlow.getSourceRef();

							// check object flowNode is really bound
							JavaSDM.ensure(flowNode != null);

							// check isomorphic binding between objects flowNode and event 
							JavaSDM.ensure(!flowNode.equals(event));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_597606 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_597606 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_597606 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_597606
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_597606 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_597606
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

									// bind object
									__DEC_outFlow_flowElements_513108 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_513108 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_513108 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_513108
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_513108 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_513108
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_766857
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_766857 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_766857
													.hasNext()) {
										try {
											__DEC_outFlow_default_766857 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_766857
													.next();

											// check object __DEC_outFlow_default_766857 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_766857 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_766857 and flowNode 
											JavaSDM.ensure(!__DEC_outFlow_default_766857
													.equals(flowNode));

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

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_171162
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_171162 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_171162
													.hasNext()) {
										try {
											__DEC_event_targetRef_171162 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_171162
													.next();

											// check object __DEC_event_targetRef_171162 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_171162 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_171162 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_171162
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_171162 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_171162
													.equals(outFlow));

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

								// check object _edge_sourceRef is really bound
								JavaSDM.ensure(_edge_sourceRef != null);
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects flowNode and event 
								JavaSDM.ensure(!flowNode.equals(event));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link sourceRef from inFlow to flowNode
								JavaSDM.ensure(flowNode.equals(inFlow
										.getSourceRef()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_sourceRef to event
								JavaSDM.ensure(event.equals(_edge_sourceRef
										.getTrg()));

								// check link flowNodeRefs from lane to event
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										event));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, process, inFlow, outFlow,
										flowNode, lane, laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_44(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_511918 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_288948 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_519851 = null;
		ExclusiveGateway __DEC_outFlow_default_519851 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_878251 = null;
		SequenceFlow __DEC_event_targetRef_878251 = null;
		Match match = null;
		Iterator fujaba__IterEventTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		FlowNode flowNode = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterEventToLane = null;
		Lane lane = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		IntermediateThrowEvent event = null;

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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to event
			JavaSDM.ensure(event.equals(outFlow.getSourceRef()));

			// iterate to-many link flowNodeRefs from event to lane
			fujaba__Success = false;

			fujaba__IterEventToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(event,
							Lane.class, "flowNodeRefs")).iterator();

			while (fujaba__IterEventToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterEventToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object laneSet is really bound
					JavaSDM.ensure(laneSet != null);

					// check if contained via correct reference
					JavaSDM.ensure(laneSet.getLanes().contains(lane));

					// check link laneSets from laneSet to process
					JavaSDM.ensure(process.equals(laneSet.eContainer()));

					// iterate to-many link targetRef from event to inFlow
					fujaba__Success = false;

					fujaba__IterEventToInFlow = new ArrayList(
							event.getIncoming()).iterator();

					while (fujaba__IterEventToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// bind object
							flowNode = inFlow.getSourceRef();

							// check object flowNode is really bound
							JavaSDM.ensure(flowNode != null);

							// check isomorphic binding between objects flowNode and event 
							JavaSDM.ensure(!flowNode.equals(event));

							// iterate to-many link trg from event to _edge_sourceRef
							fujaba__Success = false;

							fujaba__IterEventTo_edge_sourceRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(event,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterEventTo_edge_sourceRef.hasNext()) {
								try {
									_edge_sourceRef = (EMoflonEdge) fujaba__IterEventTo_edge_sourceRef
											.next();

									// check object _edge_sourceRef is really bound
									JavaSDM.ensure(_edge_sourceRef != null);
									// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
									JavaSDM.ensure(!_edge_sourceRef
											.equals(_edge_outgoing));

									// check link src from _edge_sourceRef to outFlow
									JavaSDM.ensure(outFlow
											.equals(_edge_sourceRef.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_event_flowElements_511918 = event
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
													.eContainer() : null;

											// check object __DEC_event_flowElements_511918 is really bound
											JavaSDM.ensure(__DEC_event_flowElements_511918 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_event_flowElements_511918
													.getFlowElements()
													.contains(event));

											// check isomorphic binding between objects __DEC_event_flowElements_511918 and process 
											JavaSDM.ensure(!__DEC_event_flowElements_511918
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

											// bind object
											__DEC_outFlow_flowElements_288948 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_288948 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_288948 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_288948
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_288948 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_288948
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

											// iterate to-many link default from outFlow to __DEC_outFlow_default_519851
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_519851 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_519851
															.hasNext()) {
												try {
													__DEC_outFlow_default_519851 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_519851
															.next();

													// check object __DEC_outFlow_default_519851 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_519851 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_519851 and flowNode 
													JavaSDM.ensure(!__DEC_outFlow_default_519851
															.equals(flowNode));

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

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link targetRef from event to __DEC_event_targetRef_878251
											fujaba__Success = false;

											fujaba__IterEventTo__DEC_event_targetRef_878251 = new ArrayList(
													event.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterEventTo__DEC_event_targetRef_878251
															.hasNext()) {
												try {
													__DEC_event_targetRef_878251 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_878251
															.next();

													// check object __DEC_event_targetRef_878251 is really bound
													JavaSDM.ensure(__DEC_event_targetRef_878251 != null);
													// check isomorphic binding between objects __DEC_event_targetRef_878251 and inFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_878251
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_event_targetRef_878251 and outFlow 
													JavaSDM.ensure(!__DEC_event_targetRef_878251
															.equals(outFlow));

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

										// check object _edge_outgoing is really bound
										JavaSDM.ensure(_edge_outgoing != null);
										// check object _edge_sourceRef is really bound
										JavaSDM.ensure(_edge_sourceRef != null);
										// check object event is really bound
										JavaSDM.ensure(event != null);
										// check object flowNode is really bound
										JavaSDM.ensure(flowNode != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object lane is really bound
										JavaSDM.ensure(lane != null);
										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
										JavaSDM.ensure(!_edge_sourceRef
												.equals(_edge_outgoing));

										// check isomorphic binding between objects flowNode and event 
										JavaSDM.ensure(!flowNode.equals(event));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from event to process
										JavaSDM.ensure(process.equals(event
												.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link sourceRef from inFlow to flowNode
										JavaSDM.ensure(flowNode.equals(inFlow
												.getSourceRef()));

										// check link sourceRef from outFlow to event
										JavaSDM.ensure(event.equals(outFlow
												.getSourceRef()));

										// check link src from _edge_outgoing to event
										JavaSDM.ensure(event
												.equals(_edge_outgoing.getSrc()));

										// check link src from _edge_sourceRef to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_sourceRef
														.getSrc()));

										// check link targetRef from inFlow to event
										JavaSDM.ensure(event.equals(inFlow
												.getTargetRef()));

										// check link targetRef from outFlow to event
										JavaSDM.ensure(!(event.equals(outFlow
												.getTargetRef())));

										// check link trg from _edge_outgoing to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_outgoing.getTrg()));

										// check link trg from _edge_sourceRef to event
										JavaSDM.ensure(event
												.equals(_edge_sourceRef
														.getTrg()));

										// check link flowNodeRefs from lane to event
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(event));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														event, process, inFlow,
														outFlow, flowNode,
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_246395 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_628414 = null;
		Step __DEC_normalStep_next_628414 = null;
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
					__DEC_normalStep_steps_246395 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_246395 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_246395 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_246395.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_246395 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_246395.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_628414
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_628414 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_628414
									.hasNext()) {
						try {
							__DEC_normalStep_next_628414 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_628414
									.next();

							// check object __DEC_normalStep_next_628414 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_628414 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_628414 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_628414
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_480439 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_62975 = null;
		Step __DEC_normalStep_next_62975 = null;
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
					__DEC_normalStep_steps_480439 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_480439 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_480439 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_480439.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_480439 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_480439.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_62975
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_62975 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_62975
									.hasNext()) {
						try {
							__DEC_normalStep_next_62975 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_62975
									.next();

							// check object __DEC_normalStep_next_62975 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_62975 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_62975 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_62975
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_event_flowElements_917841 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_900306 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_48777 = null;
		ExclusiveGateway __DEC_outFlow_default_48777 = null;
		Iterator fujaba__IterEventTo__DEC_event_targetRef_595777 = null;
		SequenceFlow __DEC_event_targetRef_595777 = null;
		Match match = null;
		FlowNode flowNode = null;
		Iterator fujaba__IterEventToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterEventToOutFlow = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		IntermediateThrowEvent event = null;
		LaneSet laneSet = null;
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
			laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
					.eContainer() : null;

			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);

			// check if contained via correct reference
			JavaSDM.ensure(laneSet.getLanes().contains(lane));

			// bind object
			_TmpObject = _edge_flowNodeRefs.getTrg();

			// ensure correct type and really bound of object event
			JavaSDM.ensure(_TmpObject instanceof IntermediateThrowEvent);
			event = (IntermediateThrowEvent) _TmpObject;

			// bind object
			_TmpObject = event.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) event
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(event));

			// check link laneSets from laneSet to process
			JavaSDM.ensure(process.equals(laneSet.eContainer()));

			// check link flowNodeRefs from lane to event
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(event));

			// iterate to-many link sourceRef from event to outFlow
			fujaba__Success = false;

			fujaba__IterEventToOutFlow = new ArrayList(event.getOutgoing())
					.iterator();

			while (fujaba__IterEventToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterEventToOutFlow.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link targetRef from event to inFlow
					fujaba__Success = false;

					fujaba__IterEventToInFlow = new ArrayList(
							event.getIncoming()).iterator();

					while (fujaba__IterEventToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterEventToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from inFlow to process
							JavaSDM.ensure(process.equals(inFlow.eContainer()));

							// bind object
							flowNode = inFlow.getSourceRef();

							// check object flowNode is really bound
							JavaSDM.ensure(flowNode != null);

							// check isomorphic binding between objects flowNode and event 
							JavaSDM.ensure(!flowNode.equals(event));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_event_flowElements_917841 = event
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) event
											.eContainer() : null;

									// check object __DEC_event_flowElements_917841 is really bound
									JavaSDM.ensure(__DEC_event_flowElements_917841 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_event_flowElements_917841
											.getFlowElements().contains(event));

									// check isomorphic binding between objects __DEC_event_flowElements_917841 and process 
									JavaSDM.ensure(!__DEC_event_flowElements_917841
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

									// bind object
									__DEC_outFlow_flowElements_900306 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_900306 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_900306 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_900306
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_900306 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_900306
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_48777
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_48777 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_48777
													.hasNext()) {
										try {
											__DEC_outFlow_default_48777 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_48777
													.next();

											// check object __DEC_outFlow_default_48777 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_48777 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_48777 and flowNode 
											JavaSDM.ensure(!__DEC_outFlow_default_48777
													.equals(flowNode));

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

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from event to __DEC_event_targetRef_595777
									fujaba__Success = false;

									fujaba__IterEventTo__DEC_event_targetRef_595777 = new ArrayList(
											event.getIncoming()).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterEventTo__DEC_event_targetRef_595777
													.hasNext()) {
										try {
											__DEC_event_targetRef_595777 = (SequenceFlow) fujaba__IterEventTo__DEC_event_targetRef_595777
													.next();

											// check object __DEC_event_targetRef_595777 is really bound
											JavaSDM.ensure(__DEC_event_targetRef_595777 != null);
											// check isomorphic binding between objects __DEC_event_targetRef_595777 and inFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_595777
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_event_targetRef_595777 and outFlow 
											JavaSDM.ensure(!__DEC_event_targetRef_595777
													.equals(outFlow));

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
								// check object event is really bound
								JavaSDM.ensure(event != null);
								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects flowNode and event 
								JavaSDM.ensure(!flowNode.equals(event));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from event to process
								JavaSDM.ensure(process.equals(event
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link sourceRef from inFlow to flowNode
								JavaSDM.ensure(flowNode.equals(inFlow
										.getSourceRef()));

								// check link sourceRef from outFlow to event
								JavaSDM.ensure(event.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowNodeRefs to lane
								JavaSDM.ensure(lane.equals(_edge_flowNodeRefs
										.getSrc()));

								// check link targetRef from inFlow to event
								JavaSDM.ensure(event.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to event
								JavaSDM.ensure(!(event.equals(outFlow
										.getTargetRef())));

								// check link trg from _edge_flowNodeRefs to event
								JavaSDM.ensure(event.equals(_edge_flowNodeRefs
										.getTrg()));

								// check link flowNodeRefs from lane to event
								JavaSDM.ensure(lane.getFlowNodeRefs().contains(
										event));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										event, process, inFlow, outFlow,
										flowNode, lane, laneSet);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_FLOWNODE_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(FlowNode) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_FLOWNODE_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(FlowNode) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
			return null;
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_FLOWNODE_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(FlowNode) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODE_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateThrowEvent) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6), (Flow) arguments.get(7),
					(SequenceFlowToUCFlow) arguments.get(8),
					(FlowNode) arguments.get(9), (Lane) arguments.get(10),
					(LaneSet) arguments.get(11));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODE_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Actor) arguments.get(3),
					(ProcessToActor) arguments.get(4),
					(NormalStep) arguments.get(5), (Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(FlowNode) arguments.get(8), (Lane) arguments.get(9),
					(LaneSet) arguments.get(10));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_39__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_39((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_40((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_41((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_42((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_43((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_44((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FirstInterThrowEventToStepRuleImpl
