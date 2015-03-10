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

import BpmnToUseCaseIntegration.Rules.ExcConvGwAfterEventGwRule;
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
 * An implementation of the model object '<em><b>Exc Conv Gw After Event Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExcConvGwAfterEventGwRuleImpl extends AbstractRuleImpl implements
		ExcConvGwAfterEventGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcConvGwAfterEventGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExcConvGwAfterEventGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge __eventGw_outgoing_divergeFlow = null;
		EMoflonEdge __divergeFlow_targetRef_ice = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __ice_incoming_divergeFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_eventGw = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __divergeFlow_sourceRef_eventGw = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		EMoflonEdge __process_flowElements_ice = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
			// check object eventGw is really bound
			JavaSDM.ensure(eventGw != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object ice is really bound
			JavaSDM.ensure(ice != null);
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
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					eventGw, divergeFlow, ice, inFlow, exConvGateway, outFlow,
					lane, laneSet));

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

				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
				// check object eventGw is really bound
				JavaSDM.ensure(eventGw != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
				// check object ice is really bound
				JavaSDM.ensure(ice != null);
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
				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_exConvGateway
				__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway.setName("flowElements");
				// assign attribute __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway.setName("targetRef");
				// assign attribute __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway.setName("sourceRef");
				// assign attribute __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __lane_flowNodeRefs_exConvGateway
				__lane_flowNodeRefs_exConvGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exConvGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__exConvGateway_outgoing_outFlow,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exConvGateway_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__inFlow_targetRef_exConvGateway,
								"toBeTranslatedEdges");

				// create link
				__process_flowElements_exConvGateway.setSrc(process);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__inFlow_targetRef_exConvGateway.setSrc(inFlow);

				// create link
				__exConvGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

				// create link
				__process_flowElements_exConvGateway.setTrg(exConvGateway);

				// create link
				__lane_flowNodeRefs_exConvGateway.setTrg(exConvGateway);

				// create link
				__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

				// create link
				__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__exConvGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__lane_flowNodeRefs_exConvGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
				// check object eventGw is really bound
				JavaSDM.ensure(eventGw != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
				// check object ice is really bound
				JavaSDM.ensure(ice != null);
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
				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __eventGw_outgoing_divergeFlow
				__eventGw_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __divergeFlow_targetRef_ice
				__divergeFlow_targetRef_ice = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __ice_incoming_divergeFlow
				__ice_incoming_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_eventGw
				__process_flowElements_eventGw = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __divergeFlow_sourceRef_eventGw
				__divergeFlow_sourceRef_eventGw = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_ice
				__process_flowElements_ice = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_eventGw
				__process_flowElements_eventGw.setName("flowElements");
				// assign attribute __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow.setName("flowElements");
				// assign attribute __process_flowElements_ice
				__process_flowElements_ice.setName("flowElements");
				// assign attribute __divergeFlow_sourceRef_eventGw
				__divergeFlow_sourceRef_eventGw.setName("sourceRef");
				// assign attribute __eventGw_outgoing_divergeFlow
				__eventGw_outgoing_divergeFlow.setName("outgoing");
				// assign attribute __divergeFlow_targetRef_ice
				__divergeFlow_targetRef_ice.setName("targetRef");
				// assign attribute __ice_incoming_divergeFlow
				__ice_incoming_divergeFlow.setName("incoming");
				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventGw_outgoing_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__divergeFlow_targetRef_ice, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__ice_incoming_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, ice,
						"contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventGw, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						divergeFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__divergeFlow_sourceRef_eventGw, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventGw, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_ice, "contextEdges");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_divergeFlow.setSrc(process);

				// create link
				__process_flowElements_eventGw.setSrc(process);

				// create link
				__process_flowElements_ice.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__divergeFlow_sourceRef_eventGw.setTrg(eventGw);

				// create link
				__process_flowElements_eventGw.setTrg(eventGw);

				// create link
				__eventGw_outgoing_divergeFlow.setSrc(eventGw);

				// create link
				__ice_incoming_divergeFlow.setTrg(divergeFlow);

				// create link
				__divergeFlow_targetRef_ice.setSrc(divergeFlow);

				// create link
				__divergeFlow_sourceRef_eventGw.setSrc(divergeFlow);

				// create link
				__process_flowElements_divergeFlow.setTrg(divergeFlow);

				// create link
				__eventGw_outgoing_divergeFlow.setTrg(divergeFlow);

				// create link
				__ice_incoming_divergeFlow.setSrc(ice);

				// create link
				__divergeFlow_targetRef_ice.setTrg(ice);

				// create link
				__process_flowElements_ice.setTrg(ice);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, eventGw,
					divergeFlow, ice, inFlow, exConvGateway, outFlow, lane,
					laneSet);
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
		AlternativeFlowAlternative alt = null;
		SequenceFlow divergeFlow = null;
		SeqFlowToAltFlowAlt divergeFlowToAlt = null;
		EventBasedGateway eventGw = null;
		FlowNodeToStep eventGwToNormalStep = null;
		ExclusiveGateway exConvGateway = null;
		AlternativeFlow flow = null;
		IntermediateCatchEvent ice = null;
		ICEToAltFlow iceToFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Flow initFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		FlowNodeToStep ecgwToStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge ecgwToStep__target__normalStep = null;
		EMoflonEdge ecgwToStep__source__exConvGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlowToAlt"));

			// ensure correct type and really bound of object divergeFlowToAlt
			JavaSDM.ensure(_TmpObject instanceof SeqFlowToAltFlowAlt);
			divergeFlowToAlt = (SeqFlowToAltFlowAlt) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("eventGw"));

			// ensure correct type and really bound of object eventGw
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventGw = (EventBasedGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("eventGwToNormalStep"));

			// ensure correct type and really bound of object eventGwToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			eventGwToNormalStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("ice"));

			// ensure correct type and really bound of object ice
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			ice = (IntermediateCatchEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("iceToFlow"));

			// ensure correct type and really bound of object iceToFlow
			JavaSDM.ensure(_TmpObject instanceof ICEToAltFlow);
			iceToFlow = (ICEToAltFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("initFlow"));

			// ensure correct type and really bound of object initFlow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			initFlow = (Flow) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

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
			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object ecgwToStep
			ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			ecgwToStep.setTarget(normalStep);

			// create link
			ecgwToStep.setSource(exConvGateway);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ecgwToStep is really bound
			JavaSDM.ensure(ecgwToStep != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exConvGateway, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
			// check object divergeFlowToAlt is really bound
			JavaSDM.ensure(divergeFlowToAlt != null);
			// check object ecgwToStep is really bound
			JavaSDM.ensure(ecgwToStep != null);
			// check object eventGw is really bound
			JavaSDM.ensure(eventGw != null);
			// check object eventGwToNormalStep is really bound
			JavaSDM.ensure(eventGwToNormalStep != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object ice is really bound
			JavaSDM.ensure(ice != null);
			// check object iceToFlow is really bound
			JavaSDM.ensure(iceToFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object initFlow is really bound
			JavaSDM.ensure(initFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects divergeFlow and alt 
			JavaSDM.ensure(!divergeFlow.equals(alt));

			// check isomorphic binding between objects divergeFlowToAlt and alt 
			JavaSDM.ensure(!divergeFlowToAlt.equals(alt));

			// check isomorphic binding between objects ecgwToStep and alt 
			JavaSDM.ensure(!ecgwToStep.equals(alt));

			// check isomorphic binding between objects eventGw and alt 
			JavaSDM.ensure(!eventGw.equals(alt));

			// check isomorphic binding between objects eventGwToNormalStep and alt 
			JavaSDM.ensure(!eventGwToNormalStep.equals(alt));

			// check isomorphic binding between objects exConvGateway and alt 
			JavaSDM.ensure(!exConvGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects ice and alt 
			JavaSDM.ensure(!ice.equals(alt));

			// check isomorphic binding between objects iceToFlow and alt 
			JavaSDM.ensure(!iceToFlow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects initFlow and alt 
			JavaSDM.ensure(!initFlow.equals(alt));

			// check isomorphic binding between objects lane and alt 
			JavaSDM.ensure(!lane.equals(alt));

			// check isomorphic binding between objects laneSet and alt 
			JavaSDM.ensure(!laneSet.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToInitFlow and alt 
			JavaSDM.ensure(!outFlowToInitFlow.equals(alt));

			// check isomorphic binding between objects outFlowToNormalStep and alt 
			JavaSDM.ensure(!outFlowToNormalStep.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects divergeFlowToAlt and divergeFlow 
			JavaSDM.ensure(!divergeFlowToAlt.equals(divergeFlow));

			// check isomorphic binding between objects ecgwToStep and divergeFlow 
			JavaSDM.ensure(!ecgwToStep.equals(divergeFlow));

			// check isomorphic binding between objects eventGw and divergeFlow 
			JavaSDM.ensure(!eventGw.equals(divergeFlow));

			// check isomorphic binding between objects eventGwToNormalStep and divergeFlow 
			JavaSDM.ensure(!eventGwToNormalStep.equals(divergeFlow));

			// check isomorphic binding between objects exConvGateway and divergeFlow 
			JavaSDM.ensure(!exConvGateway.equals(divergeFlow));

			// check isomorphic binding between objects flow and divergeFlow 
			JavaSDM.ensure(!flow.equals(divergeFlow));

			// check isomorphic binding between objects ice and divergeFlow 
			JavaSDM.ensure(!ice.equals(divergeFlow));

			// check isomorphic binding between objects iceToFlow and divergeFlow 
			JavaSDM.ensure(!iceToFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlowToFlow and divergeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(divergeFlow));

			// check isomorphic binding between objects initFlow and divergeFlow 
			JavaSDM.ensure(!initFlow.equals(divergeFlow));

			// check isomorphic binding between objects lane and divergeFlow 
			JavaSDM.ensure(!lane.equals(divergeFlow));

			// check isomorphic binding between objects laneSet and divergeFlow 
			JavaSDM.ensure(!laneSet.equals(divergeFlow));

			// check isomorphic binding between objects normalStep and divergeFlow 
			JavaSDM.ensure(!normalStep.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToNormalStep and divergeFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(divergeFlow));

			// check isomorphic binding between objects process and divergeFlow 
			JavaSDM.ensure(!process.equals(divergeFlow));

			// check isomorphic binding between objects ecgwToStep and divergeFlowToAlt 
			JavaSDM.ensure(!ecgwToStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects eventGw and divergeFlowToAlt 
			JavaSDM.ensure(!eventGw.equals(divergeFlowToAlt));

			// check isomorphic binding between objects eventGwToNormalStep and divergeFlowToAlt 
			JavaSDM.ensure(!eventGwToNormalStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects exConvGateway and divergeFlowToAlt 
			JavaSDM.ensure(!exConvGateway.equals(divergeFlowToAlt));

			// check isomorphic binding between objects flow and divergeFlowToAlt 
			JavaSDM.ensure(!flow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects ice and divergeFlowToAlt 
			JavaSDM.ensure(!ice.equals(divergeFlowToAlt));

			// check isomorphic binding between objects iceToFlow and divergeFlowToAlt 
			JavaSDM.ensure(!iceToFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects inFlow and divergeFlowToAlt 
			JavaSDM.ensure(!inFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects inFlowToFlow and divergeFlowToAlt 
			JavaSDM.ensure(!inFlowToFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects initFlow and divergeFlowToAlt 
			JavaSDM.ensure(!initFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects lane and divergeFlowToAlt 
			JavaSDM.ensure(!lane.equals(divergeFlowToAlt));

			// check isomorphic binding between objects laneSet and divergeFlowToAlt 
			JavaSDM.ensure(!laneSet.equals(divergeFlowToAlt));

			// check isomorphic binding between objects normalStep and divergeFlowToAlt 
			JavaSDM.ensure(!normalStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlow and divergeFlowToAlt 
			JavaSDM.ensure(!outFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlowToAlt 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlowToNormalStep and divergeFlowToAlt 
			JavaSDM.ensure(!outFlowToNormalStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects process and divergeFlowToAlt 
			JavaSDM.ensure(!process.equals(divergeFlowToAlt));

			// check isomorphic binding between objects eventGw and ecgwToStep 
			JavaSDM.ensure(!eventGw.equals(ecgwToStep));

			// check isomorphic binding between objects eventGwToNormalStep and ecgwToStep 
			JavaSDM.ensure(!eventGwToNormalStep.equals(ecgwToStep));

			// check isomorphic binding between objects exConvGateway and ecgwToStep 
			JavaSDM.ensure(!exConvGateway.equals(ecgwToStep));

			// check isomorphic binding between objects flow and ecgwToStep 
			JavaSDM.ensure(!flow.equals(ecgwToStep));

			// check isomorphic binding between objects ice and ecgwToStep 
			JavaSDM.ensure(!ice.equals(ecgwToStep));

			// check isomorphic binding between objects iceToFlow and ecgwToStep 
			JavaSDM.ensure(!iceToFlow.equals(ecgwToStep));

			// check isomorphic binding between objects inFlow and ecgwToStep 
			JavaSDM.ensure(!inFlow.equals(ecgwToStep));

			// check isomorphic binding between objects inFlowToFlow and ecgwToStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ecgwToStep));

			// check isomorphic binding between objects initFlow and ecgwToStep 
			JavaSDM.ensure(!initFlow.equals(ecgwToStep));

			// check isomorphic binding between objects lane and ecgwToStep 
			JavaSDM.ensure(!lane.equals(ecgwToStep));

			// check isomorphic binding between objects laneSet and ecgwToStep 
			JavaSDM.ensure(!laneSet.equals(ecgwToStep));

			// check isomorphic binding between objects normalStep and ecgwToStep 
			JavaSDM.ensure(!normalStep.equals(ecgwToStep));

			// check isomorphic binding between objects outFlow and ecgwToStep 
			JavaSDM.ensure(!outFlow.equals(ecgwToStep));

			// check isomorphic binding between objects outFlowToInitFlow and ecgwToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(ecgwToStep));

			// check isomorphic binding between objects outFlowToNormalStep and ecgwToStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(ecgwToStep));

			// check isomorphic binding between objects process and ecgwToStep 
			JavaSDM.ensure(!process.equals(ecgwToStep));

			// check isomorphic binding between objects eventGwToNormalStep and eventGw 
			JavaSDM.ensure(!eventGwToNormalStep.equals(eventGw));

			// check isomorphic binding between objects exConvGateway and eventGw 
			JavaSDM.ensure(!exConvGateway.equals(eventGw));

			// check isomorphic binding between objects flow and eventGw 
			JavaSDM.ensure(!flow.equals(eventGw));

			// check isomorphic binding between objects ice and eventGw 
			JavaSDM.ensure(!ice.equals(eventGw));

			// check isomorphic binding between objects iceToFlow and eventGw 
			JavaSDM.ensure(!iceToFlow.equals(eventGw));

			// check isomorphic binding between objects inFlow and eventGw 
			JavaSDM.ensure(!inFlow.equals(eventGw));

			// check isomorphic binding between objects inFlowToFlow and eventGw 
			JavaSDM.ensure(!inFlowToFlow.equals(eventGw));

			// check isomorphic binding between objects initFlow and eventGw 
			JavaSDM.ensure(!initFlow.equals(eventGw));

			// check isomorphic binding between objects lane and eventGw 
			JavaSDM.ensure(!lane.equals(eventGw));

			// check isomorphic binding between objects laneSet and eventGw 
			JavaSDM.ensure(!laneSet.equals(eventGw));

			// check isomorphic binding between objects normalStep and eventGw 
			JavaSDM.ensure(!normalStep.equals(eventGw));

			// check isomorphic binding between objects outFlow and eventGw 
			JavaSDM.ensure(!outFlow.equals(eventGw));

			// check isomorphic binding between objects outFlowToInitFlow and eventGw 
			JavaSDM.ensure(!outFlowToInitFlow.equals(eventGw));

			// check isomorphic binding between objects outFlowToNormalStep and eventGw 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventGw));

			// check isomorphic binding between objects process and eventGw 
			JavaSDM.ensure(!process.equals(eventGw));

			// check isomorphic binding between objects exConvGateway and eventGwToNormalStep 
			JavaSDM.ensure(!exConvGateway.equals(eventGwToNormalStep));

			// check isomorphic binding between objects flow and eventGwToNormalStep 
			JavaSDM.ensure(!flow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects ice and eventGwToNormalStep 
			JavaSDM.ensure(!ice.equals(eventGwToNormalStep));

			// check isomorphic binding between objects iceToFlow and eventGwToNormalStep 
			JavaSDM.ensure(!iceToFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects inFlow and eventGwToNormalStep 
			JavaSDM.ensure(!inFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and eventGwToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects initFlow and eventGwToNormalStep 
			JavaSDM.ensure(!initFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects lane and eventGwToNormalStep 
			JavaSDM.ensure(!lane.equals(eventGwToNormalStep));

			// check isomorphic binding between objects laneSet and eventGwToNormalStep 
			JavaSDM.ensure(!laneSet.equals(eventGwToNormalStep));

			// check isomorphic binding between objects normalStep and eventGwToNormalStep 
			JavaSDM.ensure(!normalStep.equals(eventGwToNormalStep));

			// check isomorphic binding between objects outFlow and eventGwToNormalStep 
			JavaSDM.ensure(!outFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects outFlowToInitFlow and eventGwToNormalStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(eventGwToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and eventGwToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(eventGwToNormalStep));

			// check isomorphic binding between objects process and eventGwToNormalStep 
			JavaSDM.ensure(!process.equals(eventGwToNormalStep));

			// check isomorphic binding between objects flow and exConvGateway 
			JavaSDM.ensure(!flow.equals(exConvGateway));

			// check isomorphic binding between objects ice and exConvGateway 
			JavaSDM.ensure(!ice.equals(exConvGateway));

			// check isomorphic binding between objects iceToFlow and exConvGateway 
			JavaSDM.ensure(!iceToFlow.equals(exConvGateway));

			// check isomorphic binding between objects inFlow and exConvGateway 
			JavaSDM.ensure(!inFlow.equals(exConvGateway));

			// check isomorphic binding between objects inFlowToFlow and exConvGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exConvGateway));

			// check isomorphic binding between objects initFlow and exConvGateway 
			JavaSDM.ensure(!initFlow.equals(exConvGateway));

			// check isomorphic binding between objects lane and exConvGateway 
			JavaSDM.ensure(!lane.equals(exConvGateway));

			// check isomorphic binding between objects laneSet and exConvGateway 
			JavaSDM.ensure(!laneSet.equals(exConvGateway));

			// check isomorphic binding between objects normalStep and exConvGateway 
			JavaSDM.ensure(!normalStep.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and exConvGateway 
			JavaSDM.ensure(!outFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToInitFlow and exConvGateway 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exConvGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exConvGateway));

			// check isomorphic binding between objects process and exConvGateway 
			JavaSDM.ensure(!process.equals(exConvGateway));

			// check isomorphic binding between objects ice and flow 
			JavaSDM.ensure(!ice.equals(flow));

			// check isomorphic binding between objects iceToFlow and flow 
			JavaSDM.ensure(!iceToFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToInitFlow and flow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects iceToFlow and ice 
			JavaSDM.ensure(!iceToFlow.equals(ice));

			// check isomorphic binding between objects inFlow and ice 
			JavaSDM.ensure(!inFlow.equals(ice));

			// check isomorphic binding between objects inFlowToFlow and ice 
			JavaSDM.ensure(!inFlowToFlow.equals(ice));

			// check isomorphic binding between objects initFlow and ice 
			JavaSDM.ensure(!initFlow.equals(ice));

			// check isomorphic binding between objects lane and ice 
			JavaSDM.ensure(!lane.equals(ice));

			// check isomorphic binding between objects laneSet and ice 
			JavaSDM.ensure(!laneSet.equals(ice));

			// check isomorphic binding between objects normalStep and ice 
			JavaSDM.ensure(!normalStep.equals(ice));

			// check isomorphic binding between objects outFlow and ice 
			JavaSDM.ensure(!outFlow.equals(ice));

			// check isomorphic binding between objects outFlowToInitFlow and ice 
			JavaSDM.ensure(!outFlowToInitFlow.equals(ice));

			// check isomorphic binding between objects outFlowToNormalStep and ice 
			JavaSDM.ensure(!outFlowToNormalStep.equals(ice));

			// check isomorphic binding between objects process and ice 
			JavaSDM.ensure(!process.equals(ice));

			// check isomorphic binding between objects inFlow and iceToFlow 
			JavaSDM.ensure(!inFlow.equals(iceToFlow));

			// check isomorphic binding between objects inFlowToFlow and iceToFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceToFlow));

			// check isomorphic binding between objects initFlow and iceToFlow 
			JavaSDM.ensure(!initFlow.equals(iceToFlow));

			// check isomorphic binding between objects lane and iceToFlow 
			JavaSDM.ensure(!lane.equals(iceToFlow));

			// check isomorphic binding between objects laneSet and iceToFlow 
			JavaSDM.ensure(!laneSet.equals(iceToFlow));

			// check isomorphic binding between objects normalStep and iceToFlow 
			JavaSDM.ensure(!normalStep.equals(iceToFlow));

			// check isomorphic binding between objects outFlow and iceToFlow 
			JavaSDM.ensure(!outFlow.equals(iceToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and iceToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(iceToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and iceToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(iceToFlow));

			// check isomorphic binding between objects process and iceToFlow 
			JavaSDM.ensure(!process.equals(iceToFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlow 
			JavaSDM.ensure(!initFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and initFlow 
			JavaSDM.ensure(!lane.equals(initFlow));

			// check isomorphic binding between objects laneSet and initFlow 
			JavaSDM.ensure(!laneSet.equals(initFlow));

			// check isomorphic binding between objects normalStep and initFlow 
			JavaSDM.ensure(!normalStep.equals(initFlow));

			// check isomorphic binding between objects outFlow and initFlow 
			JavaSDM.ensure(!outFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and initFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToNormalStep and initFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(initFlow));

			// check isomorphic binding between objects process and initFlow 
			JavaSDM.ensure(!process.equals(initFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToInitFlow and lane 
			JavaSDM.ensure(!outFlowToInitFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToInitFlow and laneSet 
			JavaSDM.ensure(!outFlowToInitFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and normalStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and outFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToInitFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToInitFlow 
			JavaSDM.ensure(!process.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_exConvGateway
			__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ecgwToStep__target__normalStep
			ecgwToStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ecgwToStep__source__exConvGateway
			ecgwToStep__source__exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExcConvGwAfterEventGwRule");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway.setName("targetRef");
			// assign attribute __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway.setName("sourceRef");
			// assign attribute __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute ecgwToStep__source__exConvGateway
			ecgwToStep__source__exConvGateway.setName("source");
			// assign attribute ecgwToStep__target__normalStep
			ecgwToStep__target__normalStep.setName("target");
			// assign attribute outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow.setName("source");
			// assign attribute outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __lane_flowNodeRefs_exConvGateway
			__lane_flowNodeRefs_exConvGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep__source__exConvGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			__process_flowElements_exConvGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			ecgwToStep__target__normalStep.setTrg(normalStep);

			// create link
			__inFlow_targetRef_exConvGateway.setSrc(inFlow);

			// create link
			__exConvGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

			// create link
			__process_flowElements_exConvGateway.setTrg(exConvGateway);

			// create link
			__lane_flowNodeRefs_exConvGateway.setTrg(exConvGateway);

			// create link
			ecgwToStep__source__exConvGateway.setTrg(exConvGateway);

			// create link
			__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

			// create link
			__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

			// create link
			__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

			// create link
			__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__exConvGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			ecgwToStep__target__normalStep.setSrc(ecgwToStep);

			// create link
			ecgwToStep__source__exConvGateway.setSrc(ecgwToStep);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			__lane_flowNodeRefs_exConvGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, eventGw, divergeFlow,
				ice, normalStep, eventGwToNormalStep, alt, divergeFlowToAlt,
				flow, iceToFlow, inFlow, exConvGateway, outFlow, inFlowToFlow,
				ecgwToStep, initFlow, outFlowToInitFlow, outFlowToNormalStep,
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
		SequenceFlow divergeFlow = null;
		EventBasedGateway eventGw = null;
		ExclusiveGateway exConvGateway = null;
		IntermediateCatchEvent ice = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		EMoflonEdge __process_flowElements_eventGw = null;
		EMoflonEdge __process_flowElements_ice = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		EMoflonEdge __eventGwToNormalStep_source_eventGw = null;
		EMoflonEdge __eventGw_outgoing_divergeFlow = null;
		EMoflonEdge __divergeFlow_sourceRef_eventGw = null;
		EMoflonEdge __divergeFlowToAlt_source_divergeFlow = null;
		EMoflonEdge __divergeFlow_targetRef_ice = null;
		EMoflonEdge __ice_incoming_divergeFlow = null;
		EMoflonEdge __iceToFlow_source_ice = null;
		EMoflonEdge __initFlow_steps_normalStep = null;
		EMoflonEdge __eventGwToNormalStep_target_normalStep = null;
		EMoflonEdge __divergeFlowToAlt_target_alt = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __iceToFlow_target_flow = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Flow initFlow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		AlternativeFlow flow = null;
		Iterator fujaba__IterIceToIceToFlow = null;
		ICEToAltFlow iceToFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterEventGwToEventGwToNormalStep = null;
		FlowNodeToStep eventGwToNormalStep = null;
		AlternativeFlowAlternative alt = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToAlt = null;
		SeqFlowToAltFlowAlt divergeFlowToAlt = null;

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
			ruleresult.setRule("ExcConvGwAfterEventGwRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("eventGw"));

			// ensure correct type and really bound of object eventGw
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventGw = (EventBasedGateway) _TmpObject;
			_TmpObject = (match.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (match.getObject("ice"));

			// ensure correct type and really bound of object ice
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			ice = (IntermediateCatchEvent) _TmpObject;
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
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from divergeFlow to divergeFlowToAlt
			fujaba__Success = false;

			fujaba__IterDivergeFlowToDivergeFlowToAlt = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							divergeFlow, SeqFlowToAltFlowAlt.class, "source"))
					.iterator();

			while (fujaba__IterDivergeFlowToDivergeFlowToAlt.hasNext()) {
				try {
					divergeFlowToAlt = (SeqFlowToAltFlowAlt) fujaba__IterDivergeFlowToDivergeFlowToAlt
							.next();

					// check object divergeFlowToAlt is really bound
					JavaSDM.ensure(divergeFlowToAlt != null);
					// bind object
					alt = divergeFlowToAlt.getTarget();

					// check object alt is really bound
					JavaSDM.ensure(alt != null);

					// iterate to-many link source from eventGw to eventGwToNormalStep
					fujaba__Success = false;

					fujaba__IterEventGwToEventGwToNormalStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(eventGw,
											FlowNodeToStep.class, "source"))
							.iterator();

					while (fujaba__IterEventGwToEventGwToNormalStep.hasNext()) {
						try {
							eventGwToNormalStep = (FlowNodeToStep) fujaba__IterEventGwToEventGwToNormalStep
									.next();

							// check object eventGwToNormalStep is really bound
							JavaSDM.ensure(eventGwToNormalStep != null);
							// bind object
							_TmpObject = eventGwToNormalStep.getTarget();

							// ensure correct type and really bound of object normalStep
							JavaSDM.ensure(_TmpObject instanceof NormalStep);
							normalStep = (NormalStep) _TmpObject;

							// iterate to-many link source from ice to iceToFlow
							fujaba__Success = false;

							fujaba__IterIceToIceToFlow = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(ice,
													ICEToAltFlow.class,
													"source")).iterator();

							while (fujaba__IterIceToIceToFlow.hasNext()) {
								try {
									iceToFlow = (ICEToAltFlow) fujaba__IterIceToIceToFlow
											.next();

									// check object iceToFlow is really bound
									JavaSDM.ensure(iceToFlow != null);
									// bind object
									flow = iceToFlow.getTarget();

									// check object flow is really bound
									JavaSDM.ensure(flow != null);

									// iterate to-many link source from inFlow to inFlowToFlow
									fujaba__Success = false;

									fujaba__IterInFlowToInFlowToFlow = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															inFlow,
															SequenceFlowToUCFlow.class,
															"source"))
											.iterator();

									while (fujaba__IterInFlowToInFlowToFlow
											.hasNext()) {
										try {
											inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
													.next();

											// check object inFlowToFlow is really bound
											JavaSDM.ensure(inFlowToFlow != null);
											// check link target from inFlowToFlow to flow
											JavaSDM.ensure(flow
													.equals(inFlowToFlow
															.getTarget()));

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check object alt is really bound
												JavaSDM.ensure(alt != null);
												// check object divergeFlow is really bound
												JavaSDM.ensure(divergeFlow != null);
												// check object divergeFlowToAlt is really bound
												JavaSDM.ensure(divergeFlowToAlt != null);
												// check object eventGw is really bound
												JavaSDM.ensure(eventGw != null);
												// check object eventGwToNormalStep is really bound
												JavaSDM.ensure(eventGwToNormalStep != null);
												// check object exConvGateway is really bound
												JavaSDM.ensure(exConvGateway != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object ice is really bound
												JavaSDM.ensure(ice != null);
												// check object iceToFlow is really bound
												JavaSDM.ensure(iceToFlow != null);
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
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and divergeFlow 
												JavaSDM.ensure(!inFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and divergeFlow 
												JavaSDM.ensure(!outFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from divergeFlow to process
												JavaSDM.ensure(process
														.equals(divergeFlow
																.eContainer()));

												// check link flowElements from eventGw to process
												JavaSDM.ensure(process
														.equals(eventGw
																.eContainer()));

												// check link flowElements from exConvGateway to process
												JavaSDM.ensure(process
														.equals(exConvGateway
																.eContainer()));

												// check link flowElements from ice to process
												JavaSDM.ensure(process
														.equals(ice
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link source from divergeFlowToAlt to divergeFlow
												JavaSDM.ensure(divergeFlow
														.equals(divergeFlowToAlt
																.getSource()));

												// check link source from eventGwToNormalStep to eventGw
												JavaSDM.ensure(eventGw
														.equals(eventGwToNormalStep
																.getSource()));

												// check link source from iceToFlow to ice
												JavaSDM.ensure(ice
														.equals(iceToFlow
																.getSource()));

												// check link source from inFlowToFlow to inFlow
												JavaSDM.ensure(inFlow
														.equals(inFlowToFlow
																.getSource()));

												// check link sourceRef from divergeFlow to eventGw
												JavaSDM.ensure(eventGw.equals(divergeFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(outFlow
														.getSourceRef()));

												// bind object
												initFlow = normalStep
														.eContainer() instanceof Flow ? (Flow) normalStep
														.eContainer() : null;

												// check object initFlow is really bound
												JavaSDM.ensure(initFlow != null);

												// check if contained via correct reference
												JavaSDM.ensure(initFlow
														.getSteps().contains(
																normalStep));

												// check isomorphic binding between objects initFlow and flow 
												JavaSDM.ensure(!initFlow
														.equals(flow));

												// check link target from divergeFlowToAlt to alt
												JavaSDM.ensure(alt
														.equals(divergeFlowToAlt
																.getTarget()));

												// check link target from eventGwToNormalStep to normalStep
												JavaSDM.ensure(normalStep
														.equals(eventGwToNormalStep
																.getTarget()));

												// check link target from iceToFlow to flow
												JavaSDM.ensure(flow
														.equals(iceToFlow
																.getTarget()));

												// check link target from inFlowToFlow to flow
												JavaSDM.ensure(flow
														.equals(inFlowToFlow
																.getTarget()));

												// check link targetRef from divergeFlow to ice
												JavaSDM.ensure(ice.equals(divergeFlow
														.getTargetRef()));

												// check link targetRef from inFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(inFlow
														.getTargetRef()));

												// check link flowNodeRefs from lane to exConvGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(exConvGateway));

												// create object __process_flowElements_eventGw
												__process_flowElements_eventGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_ice
												__process_flowElements_ice = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_inFlow
												__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_laneSets_laneSet
												__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_outFlow
												__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_exConvGateway
												__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __process_flowElements_divergeFlow
												__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __eventGwToNormalStep_source_eventGw
												__eventGwToNormalStep_source_eventGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __eventGw_outgoing_divergeFlow
												__eventGw_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlow_sourceRef_eventGw
												__divergeFlow_sourceRef_eventGw = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlowToAlt_source_divergeFlow
												__divergeFlowToAlt_source_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlow_targetRef_ice
												__divergeFlow_targetRef_ice = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __ice_incoming_divergeFlow
												__ice_incoming_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __iceToFlow_source_ice
												__iceToFlow_source_ice = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __initFlow_steps_normalStep
												__initFlow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __eventGwToNormalStep_target_normalStep
												__eventGwToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlowToAlt_target_alt
												__divergeFlowToAlt_target_alt = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __iceToFlow_target_flow
												__iceToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlow_targetRef_exConvGateway
												__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __exConvGateway_incoming_inFlow
												__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __lane_flowNodeRefs_exConvGateway
												__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __exConvGateway_outgoing_outFlow
												__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __outFlow_sourceRef_exConvGateway
												__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __laneSet_lanes_lane
												__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __process_flowElements_eventGw
												__process_flowElements_eventGw
														.setName("flowElements");
												// assign attribute __process_flowElements_divergeFlow
												__process_flowElements_divergeFlow
														.setName("flowElements");
												// assign attribute __process_flowElements_ice
												__process_flowElements_ice
														.setName("flowElements");
												// assign attribute __divergeFlow_sourceRef_eventGw
												__divergeFlow_sourceRef_eventGw
														.setName("sourceRef");
												// assign attribute __eventGw_outgoing_divergeFlow
												__eventGw_outgoing_divergeFlow
														.setName("outgoing");
												// assign attribute __divergeFlow_targetRef_ice
												__divergeFlow_targetRef_ice
														.setName("targetRef");
												// assign attribute __ice_incoming_divergeFlow
												__ice_incoming_divergeFlow
														.setName("incoming");
												// assign attribute __eventGwToNormalStep_source_eventGw
												__eventGwToNormalStep_source_eventGw
														.setName("source");
												// assign attribute __eventGwToNormalStep_target_normalStep
												__eventGwToNormalStep_target_normalStep
														.setName("target");
												// assign attribute __divergeFlowToAlt_source_divergeFlow
												__divergeFlowToAlt_source_divergeFlow
														.setName("source");
												// assign attribute __divergeFlowToAlt_target_alt
												__divergeFlowToAlt_target_alt
														.setName("target");
												// assign attribute __iceToFlow_source_ice
												__iceToFlow_source_ice
														.setName("source");
												// assign attribute __iceToFlow_target_flow
												__iceToFlow_target_flow
														.setName("target");
												// assign attribute __process_flowElements_outFlow
												__process_flowElements_outFlow
														.setName("flowElements");
												// assign attribute __process_laneSets_laneSet
												__process_laneSets_laneSet
														.setName("laneSets");
												// assign attribute __process_flowElements_inFlow
												__process_flowElements_inFlow
														.setName("flowElements");
												// assign attribute __process_flowElements_exConvGateway
												__process_flowElements_exConvGateway
														.setName("flowElements");
												// assign attribute __inFlow_targetRef_exConvGateway
												__inFlow_targetRef_exConvGateway
														.setName("targetRef");
												// assign attribute __exConvGateway_incoming_inFlow
												__exConvGateway_incoming_inFlow
														.setName("incoming");
												// assign attribute __outFlow_sourceRef_exConvGateway
												__outFlow_sourceRef_exConvGateway
														.setName("sourceRef");
												// assign attribute __exConvGateway_outgoing_outFlow
												__exConvGateway_outgoing_outFlow
														.setName("outgoing");
												// assign attribute __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow
														.setName("source");
												// assign attribute __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow
														.setName("target");
												// assign attribute __initFlow_steps_normalStep
												__initFlow_steps_normalStep
														.setName("steps");
												// assign attribute __lane_flowNodeRefs_exConvGateway
												__lane_flowNodeRefs_exConvGateway
														.setName("flowNodeRefs");
												// assign attribute __laneSet_lanes_lane
												__laneSet_lanes_lane
														.setName("lanes");

												// create link
												__process_flowElements_eventGw
														.setSrc(process);

												// create link
												__process_flowElements_ice
														.setSrc(process);

												// create link
												__process_flowElements_inFlow
														.setSrc(process);

												// create link
												__process_laneSets_laneSet
														.setSrc(process);

												// create link
												__process_flowElements_outFlow
														.setSrc(process);

												// create link
												__process_flowElements_exConvGateway
														.setSrc(process);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(process);

												// create link
												__process_flowElements_divergeFlow
														.setSrc(process);

												// create link
												__eventGwToNormalStep_source_eventGw
														.setTrg(eventGw);

												// create link
												__process_flowElements_eventGw
														.setTrg(eventGw);

												// create link
												__eventGw_outgoing_divergeFlow
														.setSrc(eventGw);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(eventGw);

												// create link
												__divergeFlow_sourceRef_eventGw
														.setTrg(eventGw);

												// create link
												__divergeFlow_sourceRef_eventGw
														.setSrc(divergeFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(divergeFlow);

												// create link
												__eventGw_outgoing_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__divergeFlowToAlt_source_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__divergeFlow_targetRef_ice
														.setSrc(divergeFlow);

												// create link
												__ice_incoming_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__process_flowElements_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__divergeFlow_targetRef_ice
														.setTrg(ice);

												// create link
												__ice_incoming_divergeFlow
														.setSrc(ice);

												// create link
												__process_flowElements_ice
														.setTrg(ice);

												// create link
												__iceToFlow_source_ice
														.setTrg(ice);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(ice);

												// create link
												__initFlow_steps_normalStep
														.setTrg(normalStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(normalStep);

												// create link
												__eventGwToNormalStep_target_normalStep
														.setTrg(normalStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(eventGwToNormalStep);

												// create link
												__eventGwToNormalStep_target_normalStep
														.setSrc(eventGwToNormalStep);

												// create link
												__eventGwToNormalStep_source_eventGw
														.setSrc(eventGwToNormalStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(alt);

												// create link
												__divergeFlowToAlt_target_alt
														.setTrg(alt);

												// create link
												__divergeFlowToAlt_target_alt
														.setSrc(divergeFlowToAlt);

												// create link
												__divergeFlowToAlt_source_divergeFlow
														.setSrc(divergeFlowToAlt);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(divergeFlowToAlt);

												// create link
												__inFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__iceToFlow_target_flow
														.setTrg(flow);

												// create link
												__iceToFlow_source_ice
														.setSrc(iceToFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(iceToFlow);

												// create link
												__iceToFlow_target_flow
														.setSrc(iceToFlow);

												// create link
												__process_flowElements_inFlow
														.setTrg(inFlow);

												// create link
												__inFlow_targetRef_exConvGateway
														.setSrc(inFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setTrg(inFlow);

												// create link
												__exConvGateway_incoming_inFlow
														.setTrg(inFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlow);

												// create link
												__exConvGateway_incoming_inFlow
														.setSrc(exConvGateway);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(exConvGateway);

												// create link
												__lane_flowNodeRefs_exConvGateway
														.setTrg(exConvGateway);

												// create link
												__exConvGateway_outgoing_outFlow
														.setSrc(exConvGateway);

												// create link
												__inFlow_targetRef_exConvGateway
														.setTrg(exConvGateway);

												// create link
												__process_flowElements_exConvGateway
														.setTrg(exConvGateway);

												// create link
												__outFlow_sourceRef_exConvGateway
														.setTrg(exConvGateway);

												// create link
												__process_flowElements_outFlow
														.setTrg(outFlow);

												// create link
												__exConvGateway_outgoing_outFlow
														.setTrg(outFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(outFlow);

												// create link
												__outFlow_sourceRef_exConvGateway
														.setSrc(outFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlowToFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setSrc(inFlowToFlow);

												// create link
												__inFlowToFlow_target_flow
														.setSrc(inFlowToFlow);

												// create link
												__initFlow_steps_normalStep
														.setSrc(initFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(initFlow);

												// create link
												__lane_flowNodeRefs_exConvGateway
														.setSrc(lane);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(lane);

												// create link
												__laneSet_lanes_lane
														.setTrg(lane);

												// create link
												__process_laneSets_laneSet
														.setTrg(laneSet);

												// create link
												__laneSet_lanes_lane
														.setSrc(laneSet);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(laneSet);

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__lane_flowNodeRefs_exConvGateway,
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
																__laneSet_lanes_lane,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__eventGw_outgoing_divergeFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__ice_incoming_divergeFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__exConvGateway_outgoing_outFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__initFlow_steps_normalStep,
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
																__inFlowToFlow_source_inFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__process_flowElements_exConvGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__process_flowElements_divergeFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__eventGwToNormalStep_source_eventGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__eventGwToNormalStep_target_normalStep,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__iceToFlow_target_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__iceToFlow_source_ice,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__divergeFlow_targetRef_ice,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlow_targetRef_exConvGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__divergeFlowToAlt_source_divergeFlow,
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
																__process_flowElements_ice,
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
																__outFlow_sourceRef_exConvGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__divergeFlow_sourceRef_eventGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__exConvGateway_incoming_inFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__process_flowElements_eventGw,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__divergeFlowToAlt_target_alt,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_FWD(
																	isApplicableMatch,
																	process,
																	eventGw,
																	divergeFlow,
																	ice,
																	normalStep,
																	eventGwToNormalStep,
																	alt,
																	divergeFlowToAlt,
																	flow,
																	iceToFlow,
																	inFlow,
																	exConvGateway,
																	outFlow,
																	inFlowToFlow,
																	initFlow,
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
																.setRuleName("ExcConvGwAfterEventGwRule");
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
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("eventGw", eventGw);
		match.registerObject("divergeFlow", divergeFlow);
		match.registerObject("ice", ice);
		match.registerObject("inFlow", inFlow);
		match.registerObject("exConvGateway", exConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", true, csp);
		var_exConvGateway_gatewayDirection.setValue(exConvGateway
				.getGatewayDirection());
		var_exConvGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exConvGateway_gatewayDirection, literal0);
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
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, IntermediateCatchEvent ice,
			NormalStep normalStep, FlowNodeToStep eventGwToNormalStep,
			AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlow inFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow initFlow, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("eventGw", eventGw);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("ice", ice);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("eventGwToNormalStep",
				eventGwToNormalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("iceToFlow", iceToFlow);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("exConvGateway", exConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("initFlow", initFlow);
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
			EObject process, EObject eventGw, EObject divergeFlow, EObject ice,
			EObject normalStep, EObject eventGwToNormalStep, EObject alt,
			EObject divergeFlowToAlt, EObject flow, EObject iceToFlow,
			EObject inFlow, EObject exConvGateway, EObject outFlow,
			EObject inFlowToFlow, EObject ecgwToStep, EObject initFlow,
			EObject outFlowToInitFlow, EObject outFlowToNormalStep,
			EObject lane, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventGw", eventGw);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("ice", ice);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("eventGwToNormalStep", eventGwToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("iceToFlow", iceToFlow);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exConvGateway", exConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
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
				&& match.getObject("exConvGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getExclusiveGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_94(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_18933 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_298089 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_877295 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_897796 = null;
		ExclusiveGateway __DEC_outFlow_default_897796 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_506312 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_506312 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent ice = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		ExclusiveGateway exConvGateway = null;
		SequenceFlow outFlow = null;
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

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// bind object
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and divergeFlow 
					JavaSDM.ensure(!outFlow.equals(divergeFlow));

					// bind object
					_TmpObject = divergeFlow.getSourceRef();

					// ensure correct type and really bound of object eventGw
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventGw = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventGw to process
					JavaSDM.ensure(process.equals(eventGw.eContainer()));

					// bind object
					_TmpObject = divergeFlow.getTargetRef();

					// ensure correct type and really bound of object ice
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					ice = (IntermediateCatchEvent) _TmpObject;

					// check link flowElements from ice to process
					JavaSDM.ensure(process.equals(ice.eContainer()));

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
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link targetRef from inFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowNodeRefs from exConvGateway to lane
							fujaba__Success = false;

							fujaba__IterExConvGatewayToLane = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													exConvGateway, Lane.class,
													"flowNodeRefs")).iterator();

							while (fujaba__IterExConvGatewayToLane.hasNext()) {
								try {
									lane = (Lane) fujaba__IterExConvGatewayToLane
											.next();

									// check object lane is really bound
									JavaSDM.ensure(lane != null);
									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
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
													__DEC_exConvGateway_default_18933 = exConvGateway
															.getDefault();

													// check object __DEC_exConvGateway_default_18933 is really bound
													JavaSDM.ensure(__DEC_exConvGateway_default_18933 != null);

													// check isomorphic binding between objects __DEC_exConvGateway_default_18933 and divergeFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_default_18933
															.equals(divergeFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_default_18933 and inFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_default_18933
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_default_18933 and outFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_default_18933
															.equals(outFlow));

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
													__DEC_exConvGateway_flowElements_298089 = exConvGateway
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
															.eContainer()
															: null;

													// check object __DEC_exConvGateway_flowElements_298089 is really bound
													JavaSDM.ensure(__DEC_exConvGateway_flowElements_298089 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_exConvGateway_flowElements_298089
															.getFlowElements()
															.contains(
																	exConvGateway));

													// check isomorphic binding between objects __DEC_exConvGateway_flowElements_298089 and process 
													JavaSDM.ensure(!__DEC_exConvGateway_flowElements_298089
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
													__DEC_outFlow_flowElements_877295 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_877295 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_877295 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_877295
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_877295 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_877295
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

													// iterate to-many link default from outFlow to __DEC_outFlow_default_897796
													fujaba__Success = false;

													fujaba__IterOutFlowTo__DEC_outFlow_default_897796 = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			outFlow,
																			ExclusiveGateway.class,
																			"default"))
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterOutFlowTo__DEC_outFlow_default_897796
																	.hasNext()) {
														try {
															__DEC_outFlow_default_897796 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_897796
																	.next();

															// check object __DEC_outFlow_default_897796 is really bound
															JavaSDM.ensure(__DEC_outFlow_default_897796 != null);
															// check isomorphic binding between objects __DEC_outFlow_default_897796 and exConvGateway 
															JavaSDM.ensure(!__DEC_outFlow_default_897796
																	.equals(exConvGateway));

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

													// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_506312
													fujaba__Success = false;

													fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_506312 = new ArrayList(
															exConvGateway
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_506312
																	.hasNext()) {
														try {
															__DEC_exConvGateway_targetRef_506312 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_506312
																	.next();

															// check object __DEC_exConvGateway_targetRef_506312 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_targetRef_506312 != null);
															// check isomorphic binding between objects __DEC_exConvGateway_targetRef_506312 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_targetRef_506312
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_targetRef_506312 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_targetRef_506312
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_targetRef_506312 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_targetRef_506312
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
												// check object divergeFlow is really bound
												JavaSDM.ensure(divergeFlow != null);
												// check object eventGw is really bound
												JavaSDM.ensure(eventGw != null);
												// check object exConvGateway is really bound
												JavaSDM.ensure(exConvGateway != null);
												// check object ice is really bound
												JavaSDM.ensure(ice != null);
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
												// check isomorphic binding between objects inFlow and divergeFlow 
												JavaSDM.ensure(!inFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and divergeFlow 
												JavaSDM.ensure(!outFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link default from exConvGateway to divergeFlow
												JavaSDM.ensure(!(divergeFlow
														.equals(exConvGateway
																.getDefault())));

												// check link default from exConvGateway to inFlow
												JavaSDM.ensure(!(inFlow
														.equals(exConvGateway
																.getDefault())));

												// check link default from exConvGateway to outFlow
												JavaSDM.ensure(!(outFlow
														.equals(exConvGateway
																.getDefault())));

												// check link flowElements from divergeFlow to process
												JavaSDM.ensure(process
														.equals(divergeFlow
																.eContainer()));

												// check link flowElements from eventGw to process
												JavaSDM.ensure(process
														.equals(eventGw
																.eContainer()));

												// check link flowElements from exConvGateway to process
												JavaSDM.ensure(process
														.equals(exConvGateway
																.eContainer()));

												// check link flowElements from ice to process
												JavaSDM.ensure(process
														.equals(ice
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link sourceRef from divergeFlow to eventGw
												JavaSDM.ensure(eventGw.equals(divergeFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_flowElements to process
												JavaSDM.ensure(process
														.equals(_edge_flowElements
																.getSrc()));

												// check link targetRef from divergeFlow to ice
												JavaSDM.ensure(ice.equals(divergeFlow
														.getTargetRef()));

												// check link targetRef from inFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from divergeFlow to exConvGateway
												JavaSDM.ensure(!(exConvGateway.equals(divergeFlow
														.getTargetRef())));

												// check link targetRef from outFlow to exConvGateway
												JavaSDM.ensure(!(exConvGateway.equals(outFlow
														.getTargetRef())));

												// check link trg from _edge_flowElements to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_flowElements
																.getTrg()));

												// check link flowNodeRefs from lane to exConvGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(exConvGateway));

												// create object match
												match = TGGRuntimeFactory.eINSTANCE
														.createMatch();

												// assign attribute match
												match.setRuleName(__eClass
														.getName());
												// statement node 'bookkeeping with generic isAppropriate method'
												fujaba__Success = this
														.isAppropriate_FWD(
																match, process,
																eventGw,
																divergeFlow,
																ice, inFlow,
																exConvGateway,
																outFlow, lane,
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
															__result.getContents()
																	.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_95(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_457768 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_916439 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_295380 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_293930 = null;
		ExclusiveGateway __DEC_outFlow_default_293930 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_456156 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_456156 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent ice = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// bind object
					_TmpObject = divergeFlow.getSourceRef();

					// ensure correct type and really bound of object eventGw
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventGw = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventGw to process
					JavaSDM.ensure(process.equals(eventGw.eContainer()));

					// bind object
					_TmpObject = divergeFlow.getTargetRef();

					// ensure correct type and really bound of object ice
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					ice = (IntermediateCatchEvent) _TmpObject;

					// check link flowElements from ice to process
					JavaSDM.ensure(process.equals(ice.eContainer()));

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
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// check link targetRef from inFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowElements from process to outFlow
							fujaba__Success = false;

							fujaba__IterProcessToOutFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToOutFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToOutFlow
											.next();

									// ensure correct type and really bound of object outFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									outFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects outFlow and divergeFlow 
									JavaSDM.ensure(!outFlow.equals(divergeFlow));

									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link sourceRef from outFlow to exConvGateway
									JavaSDM.ensure(exConvGateway.equals(outFlow
											.getSourceRef()));

									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

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
													// check link flowNodeRefs from lane to exConvGateway
													JavaSDM.ensure(lane
															.getFlowNodeRefs()
															.contains(
																	exConvGateway));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_exConvGateway_default_457768 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_457768 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_457768 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_457768 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_457768
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_457768 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_457768
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_457768 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_457768
																	.equals(outFlow));

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
															__DEC_exConvGateway_flowElements_916439 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_916439 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_916439 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_916439
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_916439 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_916439
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
															__DEC_outFlow_flowElements_295380 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_295380 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_295380 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_295380
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_295380 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_295380
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

															// iterate to-many link default from outFlow to __DEC_outFlow_default_293930
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_293930 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_293930
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_293930 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_293930
																			.next();

																	// check object __DEC_outFlow_default_293930 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_293930 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_293930 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_293930
																			.equals(exConvGateway));

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

															// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_456156
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_456156 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_456156
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_456156 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_456156
																			.next();

																	// check object __DEC_exConvGateway_targetRef_456156 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_456156 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_456156 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_456156
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_456156 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_456156
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_456156 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_456156
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
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object eventGw is really bound
														JavaSDM.ensure(eventGw != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
														// check object ice is really bound
														JavaSDM.ensure(ice != null);
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
														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from eventGw to process
														JavaSDM.ensure(process.equals(eventGw
																.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from ice to process
														JavaSDM.ensure(process.equals(ice
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

														// check link sourceRef from divergeFlow to eventGw
														JavaSDM.ensure(eventGw
																.equals(divergeFlow
																		.getSourceRef()));

														// check link sourceRef from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_flowElements to process
														JavaSDM.ensure(process
																.equals(_edge_flowElements
																		.getSrc()));

														// check link targetRef from divergeFlow to ice
														JavaSDM.ensure(ice
																.equals(divergeFlow
																		.getTargetRef()));

														// check link targetRef from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link targetRef from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link trg from _edge_flowElements to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_flowElements
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

														// create object match
														match = TGGRuntimeFactory.eINSTANCE
																.createMatch();

														// assign attribute match
														match.setRuleName(__eClass
																.getName());
														// statement node 'bookkeeping with generic isAppropriate method'
														fujaba__Success = this
																.isAppropriate_FWD(
																		match,
																		process,
																		eventGw,
																		divergeFlow,
																		ice,
																		inFlow,
																		exConvGateway,
																		outFlow,
																		lane,
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
																	__result.getContents()
																			.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_96(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_803050 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_976193 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_224570 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_605495 = null;
		ExclusiveGateway __DEC_outFlow_default_605495 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_497122 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_497122 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToEventGw = null;
		EventBasedGateway eventGw = null;
		IntermediateCatchEvent ice = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

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

					// check link flowElements from exConvGateway to process
					JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

					// check link targetRef from inFlow to exConvGateway
					JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

					// iterate to-many link flowElements from process to divergeFlow
					fujaba__Success = false;

					fujaba__IterProcessToDivergeFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToDivergeFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToDivergeFlow
									.next();

							// ensure correct type and really bound of object divergeFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							divergeFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// bind object
							_TmpObject = divergeFlow.getTargetRef();

							// ensure correct type and really bound of object ice
							JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
							ice = (IntermediateCatchEvent) _TmpObject;

							// check link flowElements from ice to process
							JavaSDM.ensure(process.equals(ice.eContainer()));

							// iterate to-many link flowElements from process to eventGw
							fujaba__Success = false;

							fujaba__IterProcessToEventGw = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToEventGw.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToEventGw
											.next();

									// ensure correct type and really bound of object eventGw
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									eventGw = (EventBasedGateway) _TmpObject;
									// check link sourceRef from divergeFlow to eventGw
									JavaSDM.ensure(eventGw.equals(divergeFlow
											.getSourceRef()));

									// iterate to-many link flowElements from process to outFlow
									fujaba__Success = false;

									fujaba__IterProcessToOutFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToOutFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToOutFlow
													.next();

											// ensure correct type and really bound of object outFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											outFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects outFlow and divergeFlow 
											JavaSDM.ensure(!outFlow
													.equals(divergeFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link sourceRef from outFlow to exConvGateway
											JavaSDM.ensure(exConvGateway
													.equals(outFlow
															.getSourceRef()));

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
															__DEC_exConvGateway_default_803050 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_803050 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_803050 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_803050 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_803050
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_803050 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_803050
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_803050 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_803050
																	.equals(outFlow));

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
															__DEC_exConvGateway_flowElements_976193 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_976193 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_976193 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_976193
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_976193 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_976193
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
															__DEC_outFlow_flowElements_224570 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_224570 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_224570 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_224570
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_224570 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_224570
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

															// iterate to-many link default from outFlow to __DEC_outFlow_default_605495
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_605495 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_605495
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_605495 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_605495
																			.next();

																	// check object __DEC_outFlow_default_605495 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_605495 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_605495 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_605495
																			.equals(exConvGateway));

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

															// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_497122
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_497122 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_497122
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_497122 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_497122
																			.next();

																	// check object __DEC_exConvGateway_targetRef_497122 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_497122 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_497122 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_497122
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_497122 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_497122
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_497122 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_497122
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
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object eventGw is really bound
														JavaSDM.ensure(eventGw != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
														// check object ice is really bound
														JavaSDM.ensure(ice != null);
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
														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from eventGw to process
														JavaSDM.ensure(process.equals(eventGw
																.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from ice to process
														JavaSDM.ensure(process.equals(ice
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

														// check link sourceRef from divergeFlow to eventGw
														JavaSDM.ensure(eventGw
																.equals(divergeFlow
																		.getSourceRef()));

														// check link sourceRef from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_targetRef to inFlow
														JavaSDM.ensure(inFlow
																.equals(_edge_targetRef
																		.getSrc()));

														// check link targetRef from divergeFlow to ice
														JavaSDM.ensure(ice
																.equals(divergeFlow
																		.getTargetRef()));

														// check link targetRef from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link targetRef from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link trg from _edge_targetRef to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_targetRef
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

														// create object match
														match = TGGRuntimeFactory.eINSTANCE
																.createMatch();

														// assign attribute match
														match.setRuleName(__eClass
																.getName());
														// statement node 'bookkeeping with generic isAppropriate method'
														fujaba__Success = this
																.isAppropriate_FWD(
																		match,
																		process,
																		eventGw,
																		divergeFlow,
																		ice,
																		inFlow,
																		exConvGateway,
																		outFlow,
																		lane,
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
																	__result.getContents()
																			.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_97(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_86327 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_653232 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_989041 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_982063 = null;
		ExclusiveGateway __DEC_outFlow_default_982063 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_398568 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_398568 = null;
		Match match = null;
		Iterator fujaba__IterProcessToEventGw = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToIce = null;
		IntermediateCatchEvent ice = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link trg from exConvGateway to _edge_targetRef
					fujaba__Success = false;

					fujaba__IterExConvGatewayTo_edge_targetRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exConvGateway,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterExConvGatewayTo_edge_targetRef.hasNext()) {
						try {
							_edge_targetRef = (EMoflonEdge) fujaba__IterExConvGatewayTo_edge_targetRef
									.next();

							// check object _edge_targetRef is really bound
							JavaSDM.ensure(_edge_targetRef != null);
							// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
							JavaSDM.ensure(!_edge_targetRef
									.equals(_edge_incoming));

							// bind object
							_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									exConvGateway));

							// iterate to-many link flowElements from process to ice
							fujaba__Success = false;

							fujaba__IterProcessToIce = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToIce.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToIce
											.next();

									// ensure correct type and really bound of object ice
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									ice = (IntermediateCatchEvent) _TmpObject;
									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
										try {
											laneSet = (LaneSet) fujaba__IterProcessToLaneSet
													.next();

											// check object laneSet is really bound
											JavaSDM.ensure(laneSet != null);
											// check link lanes from lane to laneSet
											JavaSDM.ensure(laneSet.equals(lane
													.eContainer()));

											// iterate to-many link sourceRef from exConvGateway to outFlow
											fujaba__Success = false;

											fujaba__IterExConvGatewayToOutFlow = new ArrayList(
													exConvGateway.getOutgoing())
													.iterator();

											while (fujaba__IterExConvGatewayToOutFlow
													.hasNext()) {
												try {
													outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
															.next();

													// check object outFlow is really bound
													JavaSDM.ensure(outFlow != null);
													// check link flowElements from outFlow to process
													JavaSDM.ensure(process.equals(outFlow
															.eContainer()));

													// bind object
													_TmpObject = _edge_incoming
															.getTrg();

													// ensure correct type and really bound of object inFlow
													JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
													inFlow = (SequenceFlow) _TmpObject;

													// check isomorphic binding between objects outFlow and inFlow 
													JavaSDM.ensure(!outFlow
															.equals(inFlow));

													// check link flowElements from inFlow to process
													JavaSDM.ensure(process.equals(inFlow
															.eContainer()));

													// check link src from _edge_targetRef to inFlow
													JavaSDM.ensure(inFlow
															.equals(_edge_targetRef
																	.getSrc()));

													// check link targetRef from inFlow to exConvGateway
													JavaSDM.ensure(exConvGateway.equals(inFlow
															.getTargetRef()));

													// iterate to-many link flowElements from process to divergeFlow
													fujaba__Success = false;

													fujaba__IterProcessToDivergeFlow = new ArrayList(
															process.getFlowElements())
															.iterator();

													while (fujaba__IterProcessToDivergeFlow
															.hasNext()) {
														try {
															_TmpObject = fujaba__IterProcessToDivergeFlow
																	.next();

															// ensure correct type and really bound of object divergeFlow
															JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
															divergeFlow = (SequenceFlow) _TmpObject;
															// check isomorphic binding between objects inFlow and divergeFlow 
															JavaSDM.ensure(!inFlow
																	.equals(divergeFlow));

															// check isomorphic binding between objects outFlow and divergeFlow 
															JavaSDM.ensure(!outFlow
																	.equals(divergeFlow));

															// check link targetRef from divergeFlow to ice
															JavaSDM.ensure(ice
																	.equals(divergeFlow
																			.getTargetRef()));

															// iterate to-many link flowElements from process to eventGw
															fujaba__Success = false;

															fujaba__IterProcessToEventGw = new ArrayList(
																	process.getFlowElements())
																	.iterator();

															while (fujaba__IterProcessToEventGw
																	.hasNext()) {
																try {
																	_TmpObject = fujaba__IterProcessToEventGw
																			.next();

																	// ensure correct type and really bound of object eventGw
																	JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
																	eventGw = (EventBasedGateway) _TmpObject;
																	// check link sourceRef from divergeFlow to eventGw
																	JavaSDM.ensure(eventGw
																			.equals(divergeFlow
																					.getSourceRef()));

																	// story node 'test core match and DECs'
																	try {
																		fujaba__Success = false;

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_exConvGateway_default_86327 = exConvGateway
																					.getDefault();

																			// check object __DEC_exConvGateway_default_86327 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_default_86327 != null);

																			// check isomorphic binding between objects __DEC_exConvGateway_default_86327 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_86327
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_default_86327 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_86327
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_default_86327 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_86327
																					.equals(outFlow));

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
																			__DEC_exConvGateway_flowElements_653232 = exConvGateway
																					.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																					.eContainer()
																					: null;

																			// check object __DEC_exConvGateway_flowElements_653232 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_flowElements_653232 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(__DEC_exConvGateway_flowElements_653232
																					.getFlowElements()
																					.contains(
																							exConvGateway));

																			// check isomorphic binding between objects __DEC_exConvGateway_flowElements_653232 and process 
																			JavaSDM.ensure(!__DEC_exConvGateway_flowElements_653232
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
																			__DEC_outFlow_flowElements_989041 = outFlow
																					.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																					.eContainer()
																					: null;

																			// check object __DEC_outFlow_flowElements_989041 is really bound
																			JavaSDM.ensure(__DEC_outFlow_flowElements_989041 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(__DEC_outFlow_flowElements_989041
																					.getFlowElements()
																					.contains(
																							outFlow));

																			// check isomorphic binding between objects __DEC_outFlow_flowElements_989041 and process 
																			JavaSDM.ensure(!__DEC_outFlow_flowElements_989041
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

																			// iterate to-many link default from outFlow to __DEC_outFlow_default_982063
																			fujaba__Success = false;

																			fujaba__IterOutFlowTo__DEC_outFlow_default_982063 = new ArrayList(
																					org.moflon.util.eMoflonEMFUtil
																							.getOppositeReference(
																									outFlow,
																									ExclusiveGateway.class,
																									"default"))
																					.iterator();

																			while (!(fujaba__Success)
																					&& fujaba__IterOutFlowTo__DEC_outFlow_default_982063
																							.hasNext()) {
																				try {
																					__DEC_outFlow_default_982063 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_982063
																							.next();

																					// check object __DEC_outFlow_default_982063 is really bound
																					JavaSDM.ensure(__DEC_outFlow_default_982063 != null);
																					// check isomorphic binding between objects __DEC_outFlow_default_982063 and exConvGateway 
																					JavaSDM.ensure(!__DEC_outFlow_default_982063
																							.equals(exConvGateway));

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

																			// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_398568
																			fujaba__Success = false;

																			fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_398568 = new ArrayList(
																					exConvGateway
																							.getIncoming())
																					.iterator();

																			while (!(fujaba__Success)
																					&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_398568
																							.hasNext()) {
																				try {
																					__DEC_exConvGateway_targetRef_398568 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_398568
																							.next();

																					// check object __DEC_exConvGateway_targetRef_398568 is really bound
																					JavaSDM.ensure(__DEC_exConvGateway_targetRef_398568 != null);
																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_398568 and divergeFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_398568
																							.equals(divergeFlow));

																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_398568 and inFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_398568
																							.equals(inFlow));

																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_398568 and outFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_398568
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
																		// check object divergeFlow is really bound
																		JavaSDM.ensure(divergeFlow != null);
																		// check object eventGw is really bound
																		JavaSDM.ensure(eventGw != null);
																		// check object exConvGateway is really bound
																		JavaSDM.ensure(exConvGateway != null);
																		// check object ice is really bound
																		JavaSDM.ensure(ice != null);
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

																		// check isomorphic binding between objects inFlow and divergeFlow 
																		JavaSDM.ensure(!inFlow
																				.equals(divergeFlow));

																		// check isomorphic binding between objects outFlow and divergeFlow 
																		JavaSDM.ensure(!outFlow
																				.equals(divergeFlow));

																		// check isomorphic binding between objects outFlow and inFlow 
																		JavaSDM.ensure(!outFlow
																				.equals(inFlow));

																		// check link default from exConvGateway to divergeFlow
																		JavaSDM.ensure(!(divergeFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link default from exConvGateway to inFlow
																		JavaSDM.ensure(!(inFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link default from exConvGateway to outFlow
																		JavaSDM.ensure(!(outFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link flowElements from divergeFlow to process
																		JavaSDM.ensure(process
																				.equals(divergeFlow
																						.eContainer()));

																		// check link flowElements from eventGw to process
																		JavaSDM.ensure(process
																				.equals(eventGw
																						.eContainer()));

																		// check link flowElements from exConvGateway to process
																		JavaSDM.ensure(process
																				.equals(exConvGateway
																						.eContainer()));

																		// check link flowElements from ice to process
																		JavaSDM.ensure(process
																				.equals(ice
																						.eContainer()));

																		// check link flowElements from inFlow to process
																		JavaSDM.ensure(process
																				.equals(inFlow
																						.eContainer()));

																		// check link flowElements from outFlow to process
																		JavaSDM.ensure(process
																				.equals(outFlow
																						.eContainer()));

																		// check link laneSets from laneSet to process
																		JavaSDM.ensure(process
																				.equals(laneSet
																						.eContainer()));

																		// check link lanes from lane to laneSet
																		JavaSDM.ensure(laneSet
																				.equals(lane
																						.eContainer()));

																		// check link sourceRef from divergeFlow to eventGw
																		JavaSDM.ensure(eventGw
																				.equals(divergeFlow
																						.getSourceRef()));

																		// check link sourceRef from outFlow to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(outFlow
																						.getSourceRef()));

																		// check link src from _edge_incoming to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(_edge_incoming
																						.getSrc()));

																		// check link src from _edge_targetRef to inFlow
																		JavaSDM.ensure(inFlow
																				.equals(_edge_targetRef
																						.getSrc()));

																		// check link targetRef from divergeFlow to ice
																		JavaSDM.ensure(ice
																				.equals(divergeFlow
																						.getTargetRef()));

																		// check link targetRef from inFlow to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(inFlow
																						.getTargetRef()));

																		// check link targetRef from divergeFlow to exConvGateway
																		JavaSDM.ensure(!(exConvGateway
																				.equals(divergeFlow
																						.getTargetRef())));

																		// check link targetRef from outFlow to exConvGateway
																		JavaSDM.ensure(!(exConvGateway
																				.equals(outFlow
																						.getTargetRef())));

																		// check link trg from _edge_incoming to inFlow
																		JavaSDM.ensure(inFlow
																				.equals(_edge_incoming
																						.getTrg()));

																		// check link trg from _edge_targetRef to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(_edge_targetRef
																						.getTrg()));

																		// check link flowNodeRefs from lane to exConvGateway
																		JavaSDM.ensure(lane
																				.getFlowNodeRefs()
																				.contains(
																						exConvGateway));

																		// create object match
																		match = TGGRuntimeFactory.eINSTANCE
																				.createMatch();

																		// assign attribute match
																		match.setRuleName(__eClass
																				.getName());
																		// statement node 'bookkeeping with generic isAppropriate method'
																		fujaba__Success = this
																				.isAppropriate_FWD(
																						match,
																						process,
																						eventGw,
																						divergeFlow,
																						ice,
																						inFlow,
																						exConvGateway,
																						outFlow,
																						lane,
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
																					__result.getContents()
																							.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_98(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_188125 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_423653 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_317704 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_413644 = null;
		ExclusiveGateway __DEC_outFlow_default_413644 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_80770 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_80770 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToIce = null;
		IntermediateCatchEvent ice = null;
		Iterator fujaba__IterProcessToEventGw = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link sourceRef from outFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(
							exConvGateway));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link flowElements from process to divergeFlow
					fujaba__Success = false;

					fujaba__IterProcessToDivergeFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToDivergeFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToDivergeFlow
									.next();

							// ensure correct type and really bound of object divergeFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							divergeFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and divergeFlow 
							JavaSDM.ensure(!outFlow.equals(divergeFlow));

							// iterate to-many link flowElements from process to eventGw
							fujaba__Success = false;

							fujaba__IterProcessToEventGw = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToEventGw.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToEventGw
											.next();

									// ensure correct type and really bound of object eventGw
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									eventGw = (EventBasedGateway) _TmpObject;
									// check link sourceRef from divergeFlow to eventGw
									JavaSDM.ensure(eventGw.equals(divergeFlow
											.getSourceRef()));

									// iterate to-many link flowElements from process to ice
									fujaba__Success = false;

									fujaba__IterProcessToIce = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToIce.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToIce
													.next();

											// ensure correct type and really bound of object ice
											JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
											ice = (IntermediateCatchEvent) _TmpObject;
											// check link targetRef from divergeFlow to ice
											JavaSDM.ensure(ice
													.equals(divergeFlow
															.getTargetRef()));

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
													// check link lanes from lane to laneSet
													JavaSDM.ensure(laneSet.equals(lane
															.eContainer()));

													// iterate to-many link targetRef from exConvGateway to inFlow
													fujaba__Success = false;

													fujaba__IterExConvGatewayToInFlow = new ArrayList(
															exConvGateway
																	.getIncoming())
															.iterator();

													while (fujaba__IterExConvGatewayToInFlow
															.hasNext()) {
														try {
															inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
																	.next();

															// check object inFlow is really bound
															JavaSDM.ensure(inFlow != null);
															// check isomorphic binding between objects inFlow and divergeFlow 
															JavaSDM.ensure(!inFlow
																	.equals(divergeFlow));

															// check isomorphic binding between objects outFlow and inFlow 
															JavaSDM.ensure(!outFlow
																	.equals(inFlow));

															// check link flowElements from inFlow to process
															JavaSDM.ensure(process
																	.equals(inFlow
																			.eContainer()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_exConvGateway_default_188125 = exConvGateway
																			.getDefault();

																	// check object __DEC_exConvGateway_default_188125 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_default_188125 != null);

																	// check isomorphic binding between objects __DEC_exConvGateway_default_188125 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_188125
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_188125 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_188125
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_188125 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_188125
																			.equals(outFlow));

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
																	__DEC_exConvGateway_flowElements_423653 = exConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_exConvGateway_flowElements_423653 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_423653 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_423653
																			.getFlowElements()
																			.contains(
																					exConvGateway));

																	// check isomorphic binding between objects __DEC_exConvGateway_flowElements_423653 and process 
																	JavaSDM.ensure(!__DEC_exConvGateway_flowElements_423653
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
																	__DEC_outFlow_flowElements_317704 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_317704 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_317704 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_317704
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_317704 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_317704
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

																	// iterate to-many link default from outFlow to __DEC_outFlow_default_413644
																	fujaba__Success = false;

																	fujaba__IterOutFlowTo__DEC_outFlow_default_413644 = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							outFlow,
																							ExclusiveGateway.class,
																							"default"))
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterOutFlowTo__DEC_outFlow_default_413644
																					.hasNext()) {
																		try {
																			__DEC_outFlow_default_413644 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_413644
																					.next();

																			// check object __DEC_outFlow_default_413644 is really bound
																			JavaSDM.ensure(__DEC_outFlow_default_413644 != null);
																			// check isomorphic binding between objects __DEC_outFlow_default_413644 and exConvGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_413644
																					.equals(exConvGateway));

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

																	// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_80770
																	fujaba__Success = false;

																	fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_80770 = new ArrayList(
																			exConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_80770
																					.hasNext()) {
																		try {
																			__DEC_exConvGateway_targetRef_80770 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_80770
																					.next();

																			// check object __DEC_exConvGateway_targetRef_80770 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_targetRef_80770 != null);
																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_80770 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_80770
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_80770 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_80770
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_80770 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_80770
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
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object eventGw is really bound
																JavaSDM.ensure(eventGw != null);
																// check object exConvGateway is really bound
																JavaSDM.ensure(exConvGateway != null);
																// check object ice is really bound
																JavaSDM.ensure(ice != null);
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
																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link default from exConvGateway to divergeFlow
																JavaSDM.ensure(!(divergeFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to inFlow
																JavaSDM.ensure(!(inFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from eventGw to process
																JavaSDM.ensure(process
																		.equals(eventGw
																				.eContainer()));

																// check link flowElements from exConvGateway to process
																JavaSDM.ensure(process
																		.equals(exConvGateway
																				.eContainer()));

																// check link flowElements from ice to process
																JavaSDM.ensure(process
																		.equals(ice
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link sourceRef from divergeFlow to eventGw
																JavaSDM.ensure(eventGw
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link sourceRef from outFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link src from _edge_sourceRef to outFlow
																JavaSDM.ensure(outFlow
																		.equals(_edge_sourceRef
																				.getSrc()));

																// check link targetRef from divergeFlow to ice
																JavaSDM.ensure(ice
																		.equals(divergeFlow
																				.getTargetRef()));

																// check link targetRef from inFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link targetRef from divergeFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link targetRef from outFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(outFlow
																				.getTargetRef())));

																// check link trg from _edge_sourceRef to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(_edge_sourceRef
																				.getTrg()));

																// check link flowNodeRefs from lane to exConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				exConvGateway));

																// create object match
																match = TGGRuntimeFactory.eINSTANCE
																		.createMatch();

																// assign attribute match
																match.setRuleName(__eClass
																		.getName());
																// statement node 'bookkeeping with generic isAppropriate method'
																fujaba__Success = this
																		.isAppropriate_FWD(
																				match,
																				process,
																				eventGw,
																				divergeFlow,
																				ice,
																				inFlow,
																				exConvGateway,
																				outFlow,
																				lane,
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
																			__result.getContents()
																					.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_99(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_992827 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_266941 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_405588 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_515260 = null;
		ExclusiveGateway __DEC_outFlow_default_515260 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_200891 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_200891 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToIce = null;
		IntermediateCatchEvent ice = null;
		Iterator fujaba__IterProcessToEventGw = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// check link sourceRef from outFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and divergeFlow 
					JavaSDM.ensure(!outFlow.equals(divergeFlow));

					// iterate to-many link flowElements from process to eventGw
					fujaba__Success = false;

					fujaba__IterProcessToEventGw = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToEventGw.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToEventGw.next();

							// ensure correct type and really bound of object eventGw
							JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
							eventGw = (EventBasedGateway) _TmpObject;
							// check link sourceRef from divergeFlow to eventGw
							JavaSDM.ensure(eventGw.equals(divergeFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to ice
							fujaba__Success = false;

							fujaba__IterProcessToIce = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToIce.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToIce
											.next();

									// ensure correct type and really bound of object ice
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									ice = (IntermediateCatchEvent) _TmpObject;
									// check link targetRef from divergeFlow to ice
									JavaSDM.ensure(ice.equals(divergeFlow
											.getTargetRef()));

									// iterate to-many link flowElements from process to inFlow
									fujaba__Success = false;

									fujaba__IterProcessToInFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToInFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToInFlow
													.next();

											// ensure correct type and really bound of object inFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											inFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects inFlow and divergeFlow 
											JavaSDM.ensure(!inFlow
													.equals(divergeFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link targetRef from inFlow to exConvGateway
											JavaSDM.ensure(exConvGateway
													.equals(inFlow
															.getTargetRef()));

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
															// check link flowNodeRefs from lane to exConvGateway
															JavaSDM.ensure(lane
																	.getFlowNodeRefs()
																	.contains(
																			exConvGateway));

															// iterate to-many link src from outFlow to _edge_sourceRef
															fujaba__Success = false;

															fujaba__IterOutFlowTo_edge_sourceRef = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					EMoflonEdge.class,
																					"src"))
																	.iterator();

															while (fujaba__IterOutFlowTo_edge_sourceRef
																	.hasNext()) {
																try {
																	_edge_sourceRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_sourceRef
																			.next();

																	// check object _edge_sourceRef is really bound
																	JavaSDM.ensure(_edge_sourceRef != null);
																	// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
																	JavaSDM.ensure(!_edge_sourceRef
																			.equals(_edge_outgoing));

																	// check link trg from _edge_sourceRef to exConvGateway
																	JavaSDM.ensure(exConvGateway
																			.equals(_edge_sourceRef
																					.getTrg()));

																	// story node 'test core match and DECs'
																	try {
																		fujaba__Success = false;

																		// check negative bindings
																		try {
																			fujaba__Success = false;

																			// bind object
																			__DEC_exConvGateway_default_992827 = exConvGateway
																					.getDefault();

																			// check object __DEC_exConvGateway_default_992827 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_default_992827 != null);

																			// check isomorphic binding between objects __DEC_exConvGateway_default_992827 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_992827
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_default_992827 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_992827
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_default_992827 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_default_992827
																					.equals(outFlow));

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
																			__DEC_exConvGateway_flowElements_266941 = exConvGateway
																					.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																					.eContainer()
																					: null;

																			// check object __DEC_exConvGateway_flowElements_266941 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_flowElements_266941 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(__DEC_exConvGateway_flowElements_266941
																					.getFlowElements()
																					.contains(
																							exConvGateway));

																			// check isomorphic binding between objects __DEC_exConvGateway_flowElements_266941 and process 
																			JavaSDM.ensure(!__DEC_exConvGateway_flowElements_266941
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
																			__DEC_outFlow_flowElements_405588 = outFlow
																					.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																					.eContainer()
																					: null;

																			// check object __DEC_outFlow_flowElements_405588 is really bound
																			JavaSDM.ensure(__DEC_outFlow_flowElements_405588 != null);

																			// check if contained via correct reference
																			JavaSDM.ensure(__DEC_outFlow_flowElements_405588
																					.getFlowElements()
																					.contains(
																							outFlow));

																			// check isomorphic binding between objects __DEC_outFlow_flowElements_405588 and process 
																			JavaSDM.ensure(!__DEC_outFlow_flowElements_405588
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

																			// iterate to-many link default from outFlow to __DEC_outFlow_default_515260
																			fujaba__Success = false;

																			fujaba__IterOutFlowTo__DEC_outFlow_default_515260 = new ArrayList(
																					org.moflon.util.eMoflonEMFUtil
																							.getOppositeReference(
																									outFlow,
																									ExclusiveGateway.class,
																									"default"))
																					.iterator();

																			while (!(fujaba__Success)
																					&& fujaba__IterOutFlowTo__DEC_outFlow_default_515260
																							.hasNext()) {
																				try {
																					__DEC_outFlow_default_515260 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_515260
																							.next();

																					// check object __DEC_outFlow_default_515260 is really bound
																					JavaSDM.ensure(__DEC_outFlow_default_515260 != null);
																					// check isomorphic binding between objects __DEC_outFlow_default_515260 and exConvGateway 
																					JavaSDM.ensure(!__DEC_outFlow_default_515260
																							.equals(exConvGateway));

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

																			// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_200891
																			fujaba__Success = false;

																			fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_200891 = new ArrayList(
																					exConvGateway
																							.getIncoming())
																					.iterator();

																			while (!(fujaba__Success)
																					&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_200891
																							.hasNext()) {
																				try {
																					__DEC_exConvGateway_targetRef_200891 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_200891
																							.next();

																					// check object __DEC_exConvGateway_targetRef_200891 is really bound
																					JavaSDM.ensure(__DEC_exConvGateway_targetRef_200891 != null);
																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_200891 and divergeFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_200891
																							.equals(divergeFlow));

																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_200891 and inFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_200891
																							.equals(inFlow));

																					// check isomorphic binding between objects __DEC_exConvGateway_targetRef_200891 and outFlow 
																					JavaSDM.ensure(!__DEC_exConvGateway_targetRef_200891
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
																		// check object divergeFlow is really bound
																		JavaSDM.ensure(divergeFlow != null);
																		// check object eventGw is really bound
																		JavaSDM.ensure(eventGw != null);
																		// check object exConvGateway is really bound
																		JavaSDM.ensure(exConvGateway != null);
																		// check object ice is really bound
																		JavaSDM.ensure(ice != null);
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

																		// check isomorphic binding between objects inFlow and divergeFlow 
																		JavaSDM.ensure(!inFlow
																				.equals(divergeFlow));

																		// check isomorphic binding between objects outFlow and divergeFlow 
																		JavaSDM.ensure(!outFlow
																				.equals(divergeFlow));

																		// check isomorphic binding between objects outFlow and inFlow 
																		JavaSDM.ensure(!outFlow
																				.equals(inFlow));

																		// check link default from exConvGateway to divergeFlow
																		JavaSDM.ensure(!(divergeFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link default from exConvGateway to inFlow
																		JavaSDM.ensure(!(inFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link default from exConvGateway to outFlow
																		JavaSDM.ensure(!(outFlow
																				.equals(exConvGateway
																						.getDefault())));

																		// check link flowElements from divergeFlow to process
																		JavaSDM.ensure(process
																				.equals(divergeFlow
																						.eContainer()));

																		// check link flowElements from eventGw to process
																		JavaSDM.ensure(process
																				.equals(eventGw
																						.eContainer()));

																		// check link flowElements from exConvGateway to process
																		JavaSDM.ensure(process
																				.equals(exConvGateway
																						.eContainer()));

																		// check link flowElements from ice to process
																		JavaSDM.ensure(process
																				.equals(ice
																						.eContainer()));

																		// check link flowElements from inFlow to process
																		JavaSDM.ensure(process
																				.equals(inFlow
																						.eContainer()));

																		// check link flowElements from outFlow to process
																		JavaSDM.ensure(process
																				.equals(outFlow
																						.eContainer()));

																		// check link laneSets from laneSet to process
																		JavaSDM.ensure(process
																				.equals(laneSet
																						.eContainer()));

																		// check link lanes from lane to laneSet
																		JavaSDM.ensure(laneSet
																				.equals(lane
																						.eContainer()));

																		// check link sourceRef from divergeFlow to eventGw
																		JavaSDM.ensure(eventGw
																				.equals(divergeFlow
																						.getSourceRef()));

																		// check link sourceRef from outFlow to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(outFlow
																						.getSourceRef()));

																		// check link src from _edge_outgoing to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(_edge_outgoing
																						.getSrc()));

																		// check link src from _edge_sourceRef to outFlow
																		JavaSDM.ensure(outFlow
																				.equals(_edge_sourceRef
																						.getSrc()));

																		// check link targetRef from divergeFlow to ice
																		JavaSDM.ensure(ice
																				.equals(divergeFlow
																						.getTargetRef()));

																		// check link targetRef from inFlow to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(inFlow
																						.getTargetRef()));

																		// check link targetRef from divergeFlow to exConvGateway
																		JavaSDM.ensure(!(exConvGateway
																				.equals(divergeFlow
																						.getTargetRef())));

																		// check link targetRef from outFlow to exConvGateway
																		JavaSDM.ensure(!(exConvGateway
																				.equals(outFlow
																						.getTargetRef())));

																		// check link trg from _edge_outgoing to outFlow
																		JavaSDM.ensure(outFlow
																				.equals(_edge_outgoing
																						.getTrg()));

																		// check link trg from _edge_sourceRef to exConvGateway
																		JavaSDM.ensure(exConvGateway
																				.equals(_edge_sourceRef
																						.getTrg()));

																		// check link flowNodeRefs from lane to exConvGateway
																		JavaSDM.ensure(lane
																				.getFlowNodeRefs()
																				.contains(
																						exConvGateway));

																		// create object match
																		match = TGGRuntimeFactory.eINSTANCE
																				.createMatch();

																		// assign attribute match
																		match.setRuleName(__eClass
																				.getName());
																		// statement node 'bookkeeping with generic isAppropriate method'
																		fujaba__Success = this
																				.isAppropriate_FWD(
																						match,
																						process,
																						eventGw,
																						divergeFlow,
																						ice,
																						inFlow,
																						exConvGateway,
																						outFlow,
																						lane,
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
																					__result.getContents()
																							.add(match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_100(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_471641 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_988140 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_943428 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_713838 = null;
		ExclusiveGateway __DEC_outFlow_default_713838 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_890398 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_890398 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToIce = null;
		IntermediateCatchEvent ice = null;
		EventBasedGateway eventGw = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exConvGateway));

			// check link flowNodeRefs from lane to exConvGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(exConvGateway));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// bind object
					_TmpObject = divergeFlow.getSourceRef();

					// ensure correct type and really bound of object eventGw
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventGw = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventGw to process
					JavaSDM.ensure(process.equals(eventGw.eContainer()));

					// iterate to-many link flowElements from process to ice
					fujaba__Success = false;

					fujaba__IterProcessToIce = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToIce.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToIce.next();

							// ensure correct type and really bound of object ice
							JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
							ice = (IntermediateCatchEvent) _TmpObject;
							// check link targetRef from divergeFlow to ice
							JavaSDM.ensure(ice.equals(divergeFlow
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
									JavaSDM.ensure(laneSet.equals(lane
											.eContainer()));

									// iterate to-many link sourceRef from exConvGateway to outFlow
									fujaba__Success = false;

									fujaba__IterExConvGatewayToOutFlow = new ArrayList(
											exConvGateway.getOutgoing())
											.iterator();

									while (fujaba__IterExConvGatewayToOutFlow
											.hasNext()) {
										try {
											outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
													.next();

											// check object outFlow is really bound
											JavaSDM.ensure(outFlow != null);
											// check isomorphic binding between objects outFlow and divergeFlow 
											JavaSDM.ensure(!outFlow
													.equals(divergeFlow));

											// check link flowElements from outFlow to process
											JavaSDM.ensure(process
													.equals(outFlow
															.eContainer()));

											// iterate to-many link targetRef from exConvGateway to inFlow
											fujaba__Success = false;

											fujaba__IterExConvGatewayToInFlow = new ArrayList(
													exConvGateway.getIncoming())
													.iterator();

											while (fujaba__IterExConvGatewayToInFlow
													.hasNext()) {
												try {
													inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
															.next();

													// check object inFlow is really bound
													JavaSDM.ensure(inFlow != null);
													// check isomorphic binding between objects inFlow and divergeFlow 
													JavaSDM.ensure(!inFlow
															.equals(divergeFlow));

													// check isomorphic binding between objects outFlow and inFlow 
													JavaSDM.ensure(!outFlow
															.equals(inFlow));

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
															__DEC_exConvGateway_default_471641 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_471641 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_471641 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_471641 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_471641
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_471641 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_471641
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_471641 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_471641
																	.equals(outFlow));

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
															__DEC_exConvGateway_flowElements_988140 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_988140 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_988140 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_988140
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_988140 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_988140
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
															__DEC_outFlow_flowElements_943428 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_943428 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_943428 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_943428
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_943428 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_943428
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

															// iterate to-many link default from outFlow to __DEC_outFlow_default_713838
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_713838 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_713838
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_713838 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_713838
																			.next();

																	// check object __DEC_outFlow_default_713838 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_713838 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_713838 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_713838
																			.equals(exConvGateway));

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

															// iterate to-many link targetRef from exConvGateway to __DEC_exConvGateway_targetRef_890398
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_890398 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_890398
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_890398 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_890398
																			.next();

																	// check object __DEC_exConvGateway_targetRef_890398 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_890398 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_890398 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_890398
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_890398 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_890398
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_890398 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_890398
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
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object eventGw is really bound
														JavaSDM.ensure(eventGw != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
														// check object ice is really bound
														JavaSDM.ensure(ice != null);
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
														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from eventGw to process
														JavaSDM.ensure(process.equals(eventGw
																.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from ice to process
														JavaSDM.ensure(process.equals(ice
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

														// check link sourceRef from divergeFlow to eventGw
														JavaSDM.ensure(eventGw
																.equals(divergeFlow
																		.getSourceRef()));

														// check link sourceRef from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_flowNodeRefs to lane
														JavaSDM.ensure(lane
																.equals(_edge_flowNodeRefs
																		.getSrc()));

														// check link targetRef from divergeFlow to ice
														JavaSDM.ensure(ice
																.equals(divergeFlow
																		.getTargetRef()));

														// check link targetRef from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link targetRef from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link trg from _edge_flowNodeRefs to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_flowNodeRefs
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

														// create object match
														match = TGGRuntimeFactory.eINSTANCE
																.createMatch();

														// assign attribute match
														match.setRuleName(__eClass
																.getName());
														// statement node 'bookkeeping with generic isAppropriate method'
														fujaba__Success = this
																.isAppropriate_FWD(
																		match,
																		process,
																		eventGw,
																		divergeFlow,
																		ice,
																		inFlow,
																		exConvGateway,
																		outFlow,
																		lane,
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
																	__result.getContents()
																			.add(match);

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
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(EventBasedGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(IntermediateCatchEvent) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(EventBasedGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(IntermediateCatchEvent) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(EventBasedGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(IntermediateCatchEvent) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_ICETOALTFLOW_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(EventBasedGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(IntermediateCatchEvent) arguments.get(4),
					(NormalStep) arguments.get(5),
					(FlowNodeToStep) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(SeqFlowToAltFlowAlt) arguments.get(8),
					(AlternativeFlow) arguments.get(9),
					(ICEToAltFlow) arguments.get(10),
					(SequenceFlow) arguments.get(11),
					(ExclusiveGateway) arguments.get(12),
					(SequenceFlow) arguments.get(13),
					(SequenceFlowToUCFlow) arguments.get(14),
					(Flow) arguments.get(15), (Lane) arguments.get(16),
					(LaneSet) arguments.get(17));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_94((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_95((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_96__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_96((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_97__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_97((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_98__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_98((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_99((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_100((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExcConvGwAfterEventGwRuleImpl
