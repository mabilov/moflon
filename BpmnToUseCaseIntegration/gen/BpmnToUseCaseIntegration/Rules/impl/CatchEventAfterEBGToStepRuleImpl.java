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

import BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule;
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
 * An implementation of the model object '<em><b>Catch Event After EBG To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CatchEventAfterEBGToStepRuleImpl extends AbstractRuleImpl
		implements CatchEventAfterEBGToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventAfterEBGToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCatchEventAfterEBGToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_ceFlow = null;
		EMoflonEdge __lane_flowNodeRefs_intermediateCatchEvent = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __ceFlow_sourceRef_intermediateCatchEvent = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		EMoflonEdge __intermediateCatchEvent_outgoing_ceFlow = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object ceFlow is really bound
			JavaSDM.ensure(ceFlow != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
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
			// check isomorphic binding between objects inFlow and ceFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

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
					inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
					lane, laneSet, ceFlow));

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

				// check object ceFlow is really bound
				JavaSDM.ensure(ceFlow != null);
				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object intermediateCatchEvent is really bound
				JavaSDM.ensure(intermediateCatchEvent != null);
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
				// check isomorphic binding between objects inFlow and ceFlow 
				JavaSDM.ensure(!inFlow.equals(ceFlow));

				// check isomorphic binding between objects outFlow and ceFlow 
				JavaSDM.ensure(!outFlow.equals(ceFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __eventBasedGateway_outgoing_outFlow
				__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_eventBasedGateway
				__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_ceFlow
				__process_flowElements_ceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_intermediateCatchEvent
				__lane_flowNodeRefs_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_targetRef_intermediateCatchEvent
				__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __ceFlow_sourceRef_intermediateCatchEvent
				__ceFlow_sourceRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_intermediateCatchEvent
				__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __intermediateCatchEvent_outgoing_ceFlow
				__intermediateCatchEvent_outgoing_ceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __intermediateCatchEvent_incoming_outFlow
				__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_ceFlow
				__process_flowElements_ceFlow.setName("flowElements");
				// assign attribute __process_flowElements_intermediateCatchEvent
				__process_flowElements_intermediateCatchEvent
						.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __outFlow_sourceRef_eventBasedGateway
				__outFlow_sourceRef_eventBasedGateway.setName("sourceRef");
				// assign attribute __eventBasedGateway_outgoing_outFlow
				__eventBasedGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __outFlow_targetRef_intermediateCatchEvent
				__outFlow_targetRef_intermediateCatchEvent.setName("targetRef");
				// assign attribute __intermediateCatchEvent_incoming_outFlow
				__intermediateCatchEvent_incoming_outFlow.setName("incoming");
				// assign attribute __ceFlow_sourceRef_intermediateCatchEvent
				__ceFlow_sourceRef_intermediateCatchEvent.setName("sourceRef");
				// assign attribute __intermediateCatchEvent_outgoing_ceFlow
				__intermediateCatchEvent_outgoing_ceFlow.setName("outgoing");
				// assign attribute __lane_flowNodeRefs_intermediateCatchEvent
				__lane_flowNodeRefs_intermediateCatchEvent
						.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_eventBasedGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						intermediateCatchEvent, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_ceFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_targetRef_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__ceFlow_sourceRef_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						ceFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_intermediateCatchEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__intermediateCatchEvent_outgoing_ceFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__intermediateCatchEvent_incoming_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				__process_flowElements_ceFlow.setSrc(process);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_intermediateCatchEvent.setSrc(process);

				// create link
				__outFlow_sourceRef_eventBasedGateway.setTrg(eventBasedGateway);

				// create link
				__eventBasedGateway_outgoing_outFlow.setSrc(eventBasedGateway);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__eventBasedGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_eventBasedGateway.setSrc(outFlow);

				// create link
				__outFlow_targetRef_intermediateCatchEvent.setSrc(outFlow);

				// create link
				__intermediateCatchEvent_incoming_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

				// create link
				__intermediateCatchEvent_outgoing_ceFlow
						.setSrc(intermediateCatchEvent);

				// create link
				__lane_flowNodeRefs_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

				// create link
				__ceFlow_sourceRef_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

				// create link
				__outFlow_targetRef_intermediateCatchEvent
						.setTrg(intermediateCatchEvent);

				// create link
				__intermediateCatchEvent_incoming_outFlow
						.setSrc(intermediateCatchEvent);

				// create link
				__lane_flowNodeRefs_intermediateCatchEvent.setSrc(lane);

				// create link
				__ceFlow_sourceRef_intermediateCatchEvent.setSrc(ceFlow);

				// create link
				__process_flowElements_ceFlow.setTrg(ceFlow);

				// create link
				__intermediateCatchEvent_outgoing_ceFlow.setTrg(ceFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object ceFlow is really bound
				JavaSDM.ensure(ceFlow != null);
				// check object eventBasedGateway is really bound
				JavaSDM.ensure(eventBasedGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object intermediateCatchEvent is really bound
				JavaSDM.ensure(intermediateCatchEvent != null);
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
				// check isomorphic binding between objects inFlow and ceFlow 
				JavaSDM.ensure(!inFlow.equals(ceFlow));

				// check isomorphic binding between objects outFlow and ceFlow 
				JavaSDM.ensure(!outFlow.equals(ceFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __process_flowElements_eventBasedGateway
				__process_flowElements_eventBasedGateway
						.setName("flowElements");
				// assign attribute __inFlow_targetRef_eventBasedGateway
				__inFlow_targetRef_eventBasedGateway.setName("targetRef");
				// assign attribute __eventBasedGateway_incoming_inFlow
				__eventBasedGateway_incoming_inFlow.setName("incoming");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_eventBasedGateway,
						"contextEdges");

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
						__inFlow_targetRef_eventBasedGateway, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						eventBasedGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__eventBasedGateway_incoming_inFlow, "contextEdges");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_eventBasedGateway.setSrc(process);

				// create link
				__inFlow_targetRef_eventBasedGateway.setSrc(inFlow);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__eventBasedGateway_incoming_inFlow.setSrc(eventBasedGateway);

				// create link
				__process_flowElements_eventBasedGateway
						.setTrg(eventBasedGateway);

				// create link
				__inFlow_targetRef_eventBasedGateway.setTrg(eventBasedGateway);

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
					eventBasedGateway, outFlow, intermediateCatchEvent, lane,
					laneSet, ceFlow);
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
		SequenceFlow ceFlow = null;
		FlowNodeToStep ebgToNormalStep = null;
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		SeqFlowToAltFlowAlt outFlowToAlt = null;
		ICEToAltFlow iceToAltFlow = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge alt__ref__alternativeFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge ceFlowToAlternativeFlow__target__alternativeFlow = null;
		EMoflonEdge normalStep__stepAlternative__alt = null;
		EMoflonEdge outFlowToAlt__target__alt = null;
		EMoflonEdge __process_flowElements_ceFlow = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __ceFlow_sourceRef_intermediateCatchEvent = null;
		EMoflonEdge __intermediateCatchEvent_outgoing_ceFlow = null;
		EMoflonEdge useCase__flows__alternativeFlow = null;
		EMoflonEdge ceFlowToAlternativeFlow__source__ceFlow = null;
		EMoflonEdge iceToAltFlow__target__alternativeFlow = null;
		EMoflonEdge __lane_flowNodeRefs_intermediateCatchEvent = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge iceToAltFlow__source__intermediateCatchEvent = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("ceFlow"));

			// ensure correct type and really bound of object ceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			ceFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("ebgToNormalStep"));

			// ensure correct type and really bound of object ebgToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			ebgToNormalStep = (FlowNodeToStep) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("intermediateCatchEvent"));

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
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
			// check isomorphic binding between objects inFlow and ceFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

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
			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSeqFlowToAltFlowAlt();

			// create object iceToAltFlow
			iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createICEToAltFlow();

			// create object alternativeFlow
			alternativeFlow = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlow();

			// create object alt
			alt = UseCaseDSLFactory.eINSTANCE
					.createAlternativeFlowAlternative();

			// create object ceFlowToAlternativeFlow
			ceFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute alt
			alt.setCondition((java.lang.String) csp
					.getValue("alt", "condition"));
			// assign attribute alternativeFlow
			alternativeFlow.setName((java.lang.String) csp.getValue(
					"alternativeFlow", "name"));

			// create link
			ceFlowToAlternativeFlow.setSource(ceFlow);

			// create link
			outFlowToAlt.setSource(outFlow);

			// create link
			iceToAltFlow.setSource(intermediateCatchEvent);

			// create link
			useCase.getFlows().add(alternativeFlow); // add link

			// create link
			normalStep.getStepAlternative().add(alt); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(alt,
					alternativeFlow, "ref");

			// create link
			outFlowToAlt.setTarget(alt);

			// create link
			iceToAltFlow.setTarget(alternativeFlow);

			// create link
			ceFlowToAlternativeFlow.setTarget(alternativeFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ceFlow is really bound
			JavaSDM.ensure(ceFlow != null);
			// check object ceFlowToAlternativeFlow is really bound
			JavaSDM.ensure(ceFlowToAlternativeFlow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ceFlow is really bound
			JavaSDM.ensure(ceFlow != null);
			// check object ceFlowToAlternativeFlow is really bound
			JavaSDM.ensure(ceFlowToAlternativeFlow != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects alternativeFlow and alt 
			JavaSDM.ensure(!alternativeFlow.equals(alt));

			// check isomorphic binding between objects ceFlow and alt 
			JavaSDM.ensure(!ceFlow.equals(alt));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and alt 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alt 
			JavaSDM.ensure(!ebgToNormalStep.equals(alt));

			// check isomorphic binding between objects eventBasedGateway and alt 
			JavaSDM.ensure(!eventBasedGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects iceToAltFlow and alt 
			JavaSDM.ensure(!iceToAltFlow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects intermediateCatchEvent and alt 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alt));

			// check isomorphic binding between objects lane and alt 
			JavaSDM.ensure(!lane.equals(alt));

			// check isomorphic binding between objects laneSet and alt 
			JavaSDM.ensure(!laneSet.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToAlt and alt 
			JavaSDM.ensure(!outFlowToAlt.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects processToUseCase and alt 
			JavaSDM.ensure(!processToUseCase.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects ceFlow and alternativeFlow 
			JavaSDM.ensure(!ceFlow.equals(alternativeFlow));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and alternativeFlow 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(alternativeFlow));

			// check isomorphic binding between objects ebgToNormalStep and alternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and alternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and alternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlow and alternativeFlow 
			JavaSDM.ensure(!inFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and alternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alternativeFlow));

			// check isomorphic binding between objects lane and alternativeFlow 
			JavaSDM.ensure(!lane.equals(alternativeFlow));

			// check isomorphic binding between objects laneSet and alternativeFlow 
			JavaSDM.ensure(!laneSet.equals(alternativeFlow));

			// check isomorphic binding between objects normalStep and alternativeFlow 
			JavaSDM.ensure(!normalStep.equals(alternativeFlow));

			// check isomorphic binding between objects outFlow and alternativeFlow 
			JavaSDM.ensure(!outFlow.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(alternativeFlow));

			// check isomorphic binding between objects process and alternativeFlow 
			JavaSDM.ensure(!process.equals(alternativeFlow));

			// check isomorphic binding between objects processToUseCase and alternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(alternativeFlow));

			// check isomorphic binding between objects useCase and alternativeFlow 
			JavaSDM.ensure(!useCase.equals(alternativeFlow));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and ceFlow 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(ceFlow));

			// check isomorphic binding between objects ebgToNormalStep and ceFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(ceFlow));

			// check isomorphic binding between objects eventBasedGateway and ceFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(ceFlow));

			// check isomorphic binding between objects flow and ceFlow 
			JavaSDM.ensure(!flow.equals(ceFlow));

			// check isomorphic binding between objects iceToAltFlow and ceFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(ceFlow));

			// check isomorphic binding between objects inFlow and ceFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlow));

			// check isomorphic binding between objects inFlowToFlow and ceFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(ceFlow));

			// check isomorphic binding between objects intermediateCatchEvent and ceFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ceFlow));

			// check isomorphic binding between objects lane and ceFlow 
			JavaSDM.ensure(!lane.equals(ceFlow));

			// check isomorphic binding between objects laneSet and ceFlow 
			JavaSDM.ensure(!laneSet.equals(ceFlow));

			// check isomorphic binding between objects normalStep and ceFlow 
			JavaSDM.ensure(!normalStep.equals(ceFlow));

			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlowToAlt and ceFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(ceFlow));

			// check isomorphic binding between objects process and ceFlow 
			JavaSDM.ensure(!process.equals(ceFlow));

			// check isomorphic binding between objects processToUseCase and ceFlow 
			JavaSDM.ensure(!processToUseCase.equals(ceFlow));

			// check isomorphic binding between objects useCase and ceFlow 
			JavaSDM.ensure(!useCase.equals(ceFlow));

			// check isomorphic binding between objects ebgToNormalStep and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects flow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!flow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects inFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent
					.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects lane and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!lane.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects laneSet and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!laneSet.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects normalStep and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!normalStep.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects outFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects process and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!process.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects useCase and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!useCase.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects iceToAltFlow and ebgToNormalStep 
			JavaSDM.ensure(!iceToAltFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects intermediateCatchEvent and ebgToNormalStep 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ebgToNormalStep));

			// check isomorphic binding between objects lane and ebgToNormalStep 
			JavaSDM.ensure(!lane.equals(ebgToNormalStep));

			// check isomorphic binding between objects laneSet and ebgToNormalStep 
			JavaSDM.ensure(!laneSet.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToUseCase and ebgToNormalStep 
			JavaSDM.ensure(!processToUseCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects useCase and ebgToNormalStep 
			JavaSDM.ensure(!useCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and eventBasedGateway 
			JavaSDM.ensure(!iceToAltFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects intermediateCatchEvent and eventBasedGateway 
			JavaSDM.ensure(!intermediateCatchEvent.equals(eventBasedGateway));

			// check isomorphic binding between objects lane and eventBasedGateway 
			JavaSDM.ensure(!lane.equals(eventBasedGateway));

			// check isomorphic binding between objects laneSet and eventBasedGateway 
			JavaSDM.ensure(!laneSet.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlt and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToUseCase and eventBasedGateway 
			JavaSDM.ensure(!processToUseCase.equals(eventBasedGateway));

			// check isomorphic binding between objects useCase and eventBasedGateway 
			JavaSDM.ensure(!useCase.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and flow 
			JavaSDM.ensure(!iceToAltFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects intermediateCatchEvent and flow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToAlt and flow 
			JavaSDM.ensure(!outFlowToAlt.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects intermediateCatchEvent and iceToAltFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(iceToAltFlow));

			// check isomorphic binding between objects lane and iceToAltFlow 
			JavaSDM.ensure(!lane.equals(iceToAltFlow));

			// check isomorphic binding between objects laneSet and iceToAltFlow 
			JavaSDM.ensure(!laneSet.equals(iceToAltFlow));

			// check isomorphic binding between objects normalStep and iceToAltFlow 
			JavaSDM.ensure(!normalStep.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlt and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(iceToAltFlow));

			// check isomorphic binding between objects process and iceToAltFlow 
			JavaSDM.ensure(!process.equals(iceToAltFlow));

			// check isomorphic binding between objects processToUseCase and iceToAltFlow 
			JavaSDM.ensure(!processToUseCase.equals(iceToAltFlow));

			// check isomorphic binding between objects useCase and iceToAltFlow 
			JavaSDM.ensure(!useCase.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlowToFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and intermediateCatchEvent 
			JavaSDM.ensure(!lane.equals(intermediateCatchEvent));

			// check isomorphic binding between objects laneSet and intermediateCatchEvent 
			JavaSDM.ensure(!laneSet.equals(intermediateCatchEvent));

			// check isomorphic binding between objects normalStep and intermediateCatchEvent 
			JavaSDM.ensure(!normalStep.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlow.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlt and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlt.equals(intermediateCatchEvent));

			// check isomorphic binding between objects process and intermediateCatchEvent 
			JavaSDM.ensure(!process.equals(intermediateCatchEvent));

			// check isomorphic binding between objects processToUseCase and intermediateCatchEvent 
			JavaSDM.ensure(!processToUseCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects useCase and intermediateCatchEvent 
			JavaSDM.ensure(!useCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToAlt and lane 
			JavaSDM.ensure(!outFlowToAlt.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToUseCase and lane 
			JavaSDM.ensure(!processToUseCase.equals(lane));

			// check isomorphic binding between objects useCase and lane 
			JavaSDM.ensure(!useCase.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToAlt and laneSet 
			JavaSDM.ensure(!outFlowToAlt.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and laneSet 
			JavaSDM.ensure(!processToUseCase.equals(laneSet));

			// check isomorphic binding between objects useCase and laneSet 
			JavaSDM.ensure(!useCase.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and normalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToUseCase and normalStep 
			JavaSDM.ensure(!processToUseCase.equals(normalStep));

			// check isomorphic binding between objects useCase and normalStep 
			JavaSDM.ensure(!useCase.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and outFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToUseCase and outFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlow));

			// check isomorphic binding between objects useCase and outFlow 
			JavaSDM.ensure(!useCase.equals(outFlow));

			// check isomorphic binding between objects process and outFlowToAlt 
			JavaSDM.ensure(!process.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and outFlowToAlt 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlt));

			// check isomorphic binding between objects useCase and outFlowToAlt 
			JavaSDM.ensure(!useCase.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object alt__ref__alternativeFlow
			alt__ref__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ceFlowToAlternativeFlow__target__alternativeFlow
			ceFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_ceFlow
			__process_flowElements_ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_targetRef_intermediateCatchEvent
			__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __ceFlow_sourceRef_intermediateCatchEvent
			__ceFlow_sourceRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __intermediateCatchEvent_outgoing_ceFlow
			__intermediateCatchEvent_outgoing_ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ceFlowToAlternativeFlow__source__ceFlow
			ceFlowToAlternativeFlow__source__ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_intermediateCatchEvent
			__lane_flowNodeRefs_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __eventBasedGateway_outgoing_outFlow
			__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __intermediateCatchEvent_incoming_outFlow
			__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_eventBasedGateway
			__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_intermediateCatchEvent
			__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("CatchEventAfterEBGToStepRule");
			// assign attribute __process_flowElements_ceFlow
			__process_flowElements_ceFlow.setName("flowElements");
			// assign attribute __process_flowElements_intermediateCatchEvent
			__process_flowElements_intermediateCatchEvent
					.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __outFlow_sourceRef_eventBasedGateway
			__outFlow_sourceRef_eventBasedGateway.setName("sourceRef");
			// assign attribute __eventBasedGateway_outgoing_outFlow
			__eventBasedGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute __outFlow_targetRef_intermediateCatchEvent
			__outFlow_targetRef_intermediateCatchEvent.setName("targetRef");
			// assign attribute __intermediateCatchEvent_incoming_outFlow
			__intermediateCatchEvent_incoming_outFlow.setName("incoming");
			// assign attribute __ceFlow_sourceRef_intermediateCatchEvent
			__ceFlow_sourceRef_intermediateCatchEvent.setName("sourceRef");
			// assign attribute __intermediateCatchEvent_outgoing_ceFlow
			__intermediateCatchEvent_outgoing_ceFlow.setName("outgoing");
			// assign attribute useCase__flows__alternativeFlow
			useCase__flows__alternativeFlow.setName("flows");
			// assign attribute normalStep__stepAlternative__alt
			normalStep__stepAlternative__alt.setName("stepAlternative");
			// assign attribute alt__ref__alternativeFlow
			alt__ref__alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent.setName("source");
			// assign attribute iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow.setName("target");
			// assign attribute __lane_flowNodeRefs_intermediateCatchEvent
			__lane_flowNodeRefs_intermediateCatchEvent.setName("flowNodeRefs");
			// assign attribute ceFlowToAlternativeFlow__source__ceFlow
			ceFlowToAlternativeFlow__source__ceFlow.setName("source");
			// assign attribute ceFlowToAlternativeFlow__target__alternativeFlow
			ceFlowToAlternativeFlow__target__alternativeFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt__ref__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__stepAlternative__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_ceFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_targetRef_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__ceFlow_sourceRef_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							__intermediateCatchEvent_outgoing_ceFlow,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow__source__ceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__target__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__eventBasedGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__intermediateCatchEvent_incoming_outFlow,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_eventBasedGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__source__intermediateCatchEvent,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_intermediateCatchEvent,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			__process_flowElements_ceFlow.setSrc(process);

			// create link
			__process_flowElements_intermediateCatchEvent.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__outFlow_sourceRef_eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			__eventBasedGateway_outgoing_outFlow.setSrc(eventBasedGateway);

			// create link
			__intermediateCatchEvent_incoming_outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__eventBasedGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			__outFlow_targetRef_intermediateCatchEvent.setSrc(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_eventBasedGateway.setSrc(outFlow);

			// create link
			__lane_flowNodeRefs_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__process_flowElements_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__outFlow_targetRef_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__intermediateCatchEvent_outgoing_ceFlow
					.setSrc(intermediateCatchEvent);

			// create link
			__ceFlow_sourceRef_intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			iceToAltFlow__source__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__intermediateCatchEvent_incoming_outFlow
					.setSrc(intermediateCatchEvent);

			// create link
			useCase__flows__alternativeFlow.setSrc(useCase);

			// create link
			normalStep__stepAlternative__alt.setSrc(normalStep);

			// create link
			normalStep__stepAlternative__alt.setTrg(alt);

			// create link
			alt__ref__alternativeFlow.setSrc(alt);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			iceToAltFlow__target__alternativeFlow.setTrg(alternativeFlow);

			// create link
			useCase__flows__alternativeFlow.setTrg(alternativeFlow);

			// create link
			ceFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			alt__ref__alternativeFlow.setTrg(alternativeFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setSrc(iceToAltFlow);

			// create link
			iceToAltFlow__source__intermediateCatchEvent.setSrc(iceToAltFlow);

			// create link
			__lane_flowNodeRefs_intermediateCatchEvent.setSrc(lane);

			// create link
			__intermediateCatchEvent_outgoing_ceFlow.setTrg(ceFlow);

			// create link
			ceFlowToAlternativeFlow__source__ceFlow.setTrg(ceFlow);

			// create link
			__process_flowElements_ceFlow.setTrg(ceFlow);

			// create link
			__ceFlow_sourceRef_intermediateCatchEvent.setSrc(ceFlow);

			// create link
			ceFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(ceFlowToAlternativeFlow);

			// create link
			ceFlowToAlternativeFlow__source__ceFlow
					.setSrc(ceFlowToAlternativeFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				iceToAltFlow, lane, laneSet, ceFlow, ceFlowToAlternativeFlow);
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
		SequenceFlow ceFlow = null;
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __process_flowElements_ceFlow = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_intermediateCatchEvent = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __outFlow_sourceRef_eventBasedGateway = null;
		EMoflonEdge __eventBasedGateway_outgoing_outFlow = null;
		EMoflonEdge __ebgToNormalStep_source_eventBasedGateway = null;
		EMoflonEdge __outFlow_targetRef_intermediateCatchEvent = null;
		EMoflonEdge __intermediateCatchEvent_incoming_outFlow = null;
		EMoflonEdge __intermediateCatchEvent_outgoing_ceFlow = null;
		EMoflonEdge __lane_flowNodeRefs_intermediateCatchEvent = null;
		EMoflonEdge __ceFlow_sourceRef_intermediateCatchEvent = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __ebgToNormalStep_target_normalStep = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterEventBasedGatewayToEbgToNormalStep = null;
		FlowNodeToStep ebgToNormalStep = null;

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
			ruleresult.setRule("CatchEventAfterEBGToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("ceFlow"));

			// ensure correct type and really bound of object ceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			ceFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("eventBasedGateway"));

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("intermediateCatchEvent"));

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
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
			// check isomorphic binding between objects inFlow and ceFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from eventBasedGateway to ebgToNormalStep
			fujaba__Success = false;

			fujaba__IterEventBasedGatewayToEbgToNormalStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							eventBasedGateway, FlowNodeToStep.class, "source"))
					.iterator();

			while (fujaba__IterEventBasedGatewayToEbgToNormalStep.hasNext()) {
				try {
					ebgToNormalStep = (FlowNodeToStep) fujaba__IterEventBasedGatewayToEbgToNormalStep
							.next();

					// check object ebgToNormalStep is really bound
					JavaSDM.ensure(ebgToNormalStep != null);
					// bind object
					_TmpObject = ebgToNormalStep.getTarget();

					// ensure correct type and really bound of object normalStep
					JavaSDM.ensure(_TmpObject instanceof NormalStep);
					normalStep = (NormalStep) _TmpObject;

					// iterate to-many link source from inFlow to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToFlow = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToUCFlow.class,
											"source")).iterator();

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
													ProcessToUseCase.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToUseCase
									.hasNext()) {
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

										// check object ceFlow is really bound
										JavaSDM.ensure(ceFlow != null);
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
										// check object intermediateCatchEvent is really bound
										JavaSDM.ensure(intermediateCatchEvent != null);
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
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects inFlow and ceFlow 
										JavaSDM.ensure(!inFlow.equals(ceFlow));

										// check isomorphic binding between objects outFlow and ceFlow 
										JavaSDM.ensure(!outFlow.equals(ceFlow));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link flowElements from ceFlow to process
										JavaSDM.ensure(process.equals(ceFlow
												.eContainer()));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from intermediateCatchEvent to process
										JavaSDM.ensure(process
												.equals(intermediateCatchEvent
														.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link laneSets from laneSet to process
										JavaSDM.ensure(process.equals(laneSet
												.eContainer()));

										// check link lanes from lane to laneSet
										JavaSDM.ensure(laneSet.equals(lane
												.eContainer()));

										// check link source from ebgToNormalStep to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(ebgToNormalStep
														.getSource()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link sourceRef from ceFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(ceFlow.getSourceRef()));

										// check link sourceRef from outFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(outFlow.getSourceRef()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from ebgToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(ebgToNormalStep
														.getTarget()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

										// check link targetRef from outFlow to intermediateCatchEvent
										JavaSDM.ensure(intermediateCatchEvent
												.equals(outFlow.getTargetRef()));

										// check link flowNodeRefs from lane to intermediateCatchEvent
										JavaSDM.ensure(lane.getFlowNodeRefs()
												.contains(
														intermediateCatchEvent));

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_ceFlow
										__process_flowElements_ceFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_eventBasedGateway
										__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_laneSets_laneSet
										__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_intermediateCatchEvent
										__process_flowElements_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __eventBasedGateway_incoming_inFlow
										__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlow_targetRef_eventBasedGateway
										__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_eventBasedGateway
										__outFlow_sourceRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __eventBasedGateway_outgoing_outFlow
										__eventBasedGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_targetRef_intermediateCatchEvent
										__outFlow_targetRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __intermediateCatchEvent_incoming_outFlow
										__intermediateCatchEvent_incoming_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __intermediateCatchEvent_outgoing_ceFlow
										__intermediateCatchEvent_outgoing_ceFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __lane_flowNodeRefs_intermediateCatchEvent
										__lane_flowNodeRefs_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ceFlow_sourceRef_intermediateCatchEvent
										__ceFlow_sourceRef_intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __useCase_flows_flow
										__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __laneSet_lanes_lane
										__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_laneSets_laneSet
										__process_laneSets_laneSet
												.setName("laneSets");
										// assign attribute __process_flowElements_ceFlow
										__process_flowElements_ceFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_intermediateCatchEvent
										__process_flowElements_intermediateCatchEvent
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
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
										// assign attribute __outFlow_sourceRef_eventBasedGateway
										__outFlow_sourceRef_eventBasedGateway
												.setName("sourceRef");
										// assign attribute __eventBasedGateway_outgoing_outFlow
										__eventBasedGateway_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __outFlow_targetRef_intermediateCatchEvent
										__outFlow_targetRef_intermediateCatchEvent
												.setName("targetRef");
										// assign attribute __intermediateCatchEvent_incoming_outFlow
										__intermediateCatchEvent_incoming_outFlow
												.setName("incoming");
										// assign attribute __ceFlow_sourceRef_intermediateCatchEvent
										__ceFlow_sourceRef_intermediateCatchEvent
												.setName("sourceRef");
										// assign attribute __intermediateCatchEvent_outgoing_ceFlow
										__intermediateCatchEvent_outgoing_ceFlow
												.setName("outgoing");
										// assign attribute __useCase_flows_flow
										__useCase_flows_flow.setName("flows");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __ebgToNormalStep_source_eventBasedGateway
										__ebgToNormalStep_source_eventBasedGateway
												.setName("source");
										// assign attribute __ebgToNormalStep_target_normalStep
										__ebgToNormalStep_target_normalStep
												.setName("target");
										// assign attribute __lane_flowNodeRefs_intermediateCatchEvent
										__lane_flowNodeRefs_intermediateCatchEvent
												.setName("flowNodeRefs");
										// assign attribute __laneSet_lanes_lane
										__laneSet_lanes_lane.setName("lanes");

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										__process_flowElements_ceFlow
												.setSrc(process);

										// create link
										__process_flowElements_eventBasedGateway
												.setSrc(process);

										// create link
										__process_laneSets_laneSet
												.setSrc(process);

										// create link
										__process_flowElements_intermediateCatchEvent
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setSrc(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlow_targetRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__eventBasedGateway_incoming_inFlow
												.setSrc(eventBasedGateway);

										// create link
										__outFlow_sourceRef_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														eventBasedGateway);

										// create link
										__process_flowElements_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__eventBasedGateway_outgoing_outFlow
												.setSrc(eventBasedGateway);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setTrg(eventBasedGateway);

										// create link
										__outFlow_targetRef_intermediateCatchEvent
												.setSrc(outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										__intermediateCatchEvent_incoming_outFlow
												.setTrg(outFlow);

										// create link
										__eventBasedGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__outFlow_sourceRef_eventBasedGateway
												.setSrc(outFlow);

										// create link
										__outFlow_targetRef_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										__process_flowElements_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										__intermediateCatchEvent_outgoing_ceFlow
												.setSrc(intermediateCatchEvent);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														intermediateCatchEvent);

										// create link
										__lane_flowNodeRefs_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										__ceFlow_sourceRef_intermediateCatchEvent
												.setTrg(intermediateCatchEvent);

										// create link
										__intermediateCatchEvent_incoming_outFlow
												.setSrc(intermediateCatchEvent);

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__useCase_flows_flow.setSrc(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__useCase_flows_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__ebgToNormalStep_target_normalStep
												.setTrg(normalStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__ebgToNormalStep_source_eventBasedGateway
												.setSrc(ebgToNormalStep);

										// create link
										__ebgToNormalStep_target_normalStep
												.setSrc(ebgToNormalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														ebgToNormalStep);

										// create link
										__laneSet_lanes_lane.setTrg(lane);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														lane);

										// create link
										__lane_flowNodeRefs_intermediateCatchEvent
												.setSrc(lane);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														laneSet);

										// create link
										__process_laneSets_laneSet
												.setTrg(laneSet);

										// create link
										__laneSet_lanes_lane.setSrc(laneSet);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														ceFlow);

										// create link
										__ceFlow_sourceRef_intermediateCatchEvent
												.setSrc(ceFlow);

										// create link
										__intermediateCatchEvent_outgoing_ceFlow
												.setTrg(ceFlow);

										// create link
										__process_flowElements_ceFlow
												.setTrg(ceFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_targetRef_intermediateCatchEvent,
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
														__outFlow_sourceRef_eventBasedGateway,
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
														__lane_flowNodeRefs_intermediateCatchEvent,
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
														__flow_steps_normalStep,
														"allContextElements");

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
														__process_flowElements_intermediateCatchEvent,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__ceFlow_sourceRef_intermediateCatchEvent,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_ceFlow,
														"allContextElements");

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
														__ebgToNormalStep_target_normalStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__intermediateCatchEvent_incoming_outFlow,
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
														__ebgToNormalStep_source_eventBasedGateway,
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
														__process_laneSets_laneSet,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__intermediateCatchEvent_outgoing_ceFlow,
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
														__process_flowElements_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__eventBasedGateway_outgoing_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_source_inFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															process,
															inFlow,
															eventBasedGateway,
															outFlow,
															intermediateCatchEvent,
															useCase,
															processToUseCase,
															flow, inFlowToFlow,
															normalStep,
															ebgToNormalStep,
															lane, laneSet,
															ceFlow));

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
														.setRuleName("CatchEventAfterEBGToStepRule");
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
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("eventBasedGateway", eventBasedGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("intermediateCatchEvent", intermediateCatchEvent);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);
		match.registerObject("ceFlow", ceFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
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
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", true, csp);
		var_intermediateCatchEvent_id.setValue(intermediateCatchEvent.getId());
		var_intermediateCatchEvent_id.setType("");
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", true, csp);
		var_intermediateCatchEvent_name.setValue(intermediateCatchEvent
				.getName());
		var_intermediateCatchEvent_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_intermediateCatchEvent_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_intermediateCatchEvent_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("ebgToNormalStep", ebgToNormalStep);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("ceFlow", ceFlow);
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
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("iceToAltFlow", iceToAltFlow);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("ceFlow", ceFlow);
		ruleresult.registerObject("ceFlowToAlternativeFlow",
				ceFlowToAlternativeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow())
				&& match.getObject("intermediateCatchEvent")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getIntermediateCatchEvent())
				&& match.getObject("ceFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, Flow flow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __flow_steps_normalStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, useCase, flow,
					normalStep, alt, alternativeFlow));

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

				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object alternativeFlow is really bound
				JavaSDM.ensure(alternativeFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and alternativeFlow 
				JavaSDM.ensure(!flow.equals(alternativeFlow));

				// create object __alt_ref_alternativeFlow
				__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_stepAlternative_alt
				__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_alternativeFlow
				__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_alternativeFlow
				__useCase_flows_alternativeFlow.setName("flows");
				// assign attribute __normalStep_stepAlternative_alt
				__normalStep_stepAlternative_alt.setName("stepAlternative");
				// assign attribute __alt_ref_alternativeFlow
				__alt_ref_alternativeFlow.setName("ref");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__alt_ref_alternativeFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__normalStep_stepAlternative_alt,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						alternativeFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, alt,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_alternativeFlow, "toBeTranslatedEdges");

				// create link
				__useCase_flows_alternativeFlow.setSrc(useCase);

				// create link
				__normalStep_stepAlternative_alt.setSrc(normalStep);

				// create link
				__normalStep_stepAlternative_alt.setTrg(alt);

				// create link
				__alt_ref_alternativeFlow.setSrc(alt);

				// create link
				__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

				// create link
				__alt_ref_alternativeFlow.setTrg(alternativeFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object alt is really bound
				JavaSDM.ensure(alt != null);
				// check object alternativeFlow is really bound
				JavaSDM.ensure(alternativeFlow != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check isomorphic binding between objects flow and alternativeFlow 
				JavaSDM.ensure(!flow.equals(alternativeFlow));

				// create object __useCase_flows_flow
				__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCase_flows_flow
				__useCase_flows_flow.setName("flows");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_flow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "contextNodes");

				// create link
				__useCase_flows_flow.setSrc(useCase);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				// create link
				__useCase_flows_flow.setTrg(flow);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, useCase, flow, normalStep,
					alt, alternativeFlow);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow alternativeFlow = null;
		FlowNodeToStep ebgToNormalStep = null;
		EventBasedGateway eventBasedGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		bpmn2.Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		SequenceFlow outFlow = null;
		SequenceFlow ceFlow = null;
		SeqFlowToAltFlowAlt outFlowToAlt = null;
		ICEToAltFlow iceToAltFlow = null;
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge eventBasedGateway__outgoing__outFlow = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge ceFlow__sourceRef__intermediateCatchEvent = null;
		EMoflonEdge iceToAltFlow__target__alternativeFlow = null;
		EMoflonEdge iceToAltFlow__source__intermediateCatchEvent = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge outFlowToAlt__source__outFlow = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge ceFlowToAlternativeFlow__source__ceFlow = null;
		EMoflonEdge lane__flowNodeRefs__intermediateCatchEvent = null;
		EMoflonEdge process__flowElements__ceFlow = null;
		EMoflonEdge outFlow__sourceRef__eventBasedGateway = null;
		EMoflonEdge intermediateCatchEvent__outgoing__ceFlow = null;
		EMoflonEdge outFlow__targetRef__intermediateCatchEvent = null;
		EMoflonEdge process__flowElements__intermediateCatchEvent = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge intermediateCatchEvent__incoming__outFlow = null;
		EMoflonEdge outFlowToAlt__target__alt = null;
		EMoflonEdge ceFlowToAlternativeFlow__target__alternativeFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("alternativeFlow"));

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("ebgToNormalStep"));

			// ensure correct type and really bound of object ebgToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			ebgToNormalStep = (FlowNodeToStep) _TmpObject;
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
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

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
			// create object intermediateCatchEvent
			intermediateCatchEvent = Bpmn2Factory.eINSTANCE
					.createIntermediateCatchEvent();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object ceFlow
			ceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object outFlowToAlt
			outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSeqFlowToAltFlowAlt();

			// create object iceToAltFlow
			iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createICEToAltFlow();

			// create object ceFlowToAlternativeFlow
			ceFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute intermediateCatchEvent
			intermediateCatchEvent.setId((java.lang.String) csp.getValue(
					"intermediateCatchEvent", "id"));
			// assign attribute intermediateCatchEvent
			intermediateCatchEvent.setName((java.lang.String) csp.getValue(
					"intermediateCatchEvent", "name"));

			// create link
			outFlowToAlt.setTarget(alt);

			// create link
			iceToAltFlow.setTarget(alternativeFlow);

			// create link
			ceFlowToAlternativeFlow.setTarget(alternativeFlow);

			// create link
			ceFlowToAlternativeFlow.setSource(ceFlow);

			// create link
			process.getFlowElements().add(intermediateCatchEvent); // add link

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			process.getFlowElements().add(ceFlow); // add link

			// create link
			outFlow.setSourceRef(eventBasedGateway);

			// create link
			intermediateCatchEvent.getIncoming().add(outFlow);

			// create link
			outFlowToAlt.setSource(outFlow);

			// create link
			iceToAltFlow.setSource(intermediateCatchEvent);

			// create link
			lane.getFlowNodeRefs().add(intermediateCatchEvent);

			// create link
			ceFlow.setSourceRef(intermediateCatchEvent);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ceFlow is really bound
			JavaSDM.ensure(ceFlow != null);
			// check object ceFlowToAlternativeFlow is really bound
			JavaSDM.ensure(ceFlowToAlternativeFlow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alt, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					alternativeFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object alternativeFlow is really bound
			JavaSDM.ensure(alternativeFlow != null);
			// check object ceFlow is really bound
			JavaSDM.ensure(ceFlow != null);
			// check object ceFlowToAlternativeFlow is really bound
			JavaSDM.ensure(ceFlowToAlternativeFlow != null);
			// check object ebgToNormalStep is really bound
			JavaSDM.ensure(ebgToNormalStep != null);
			// check object eventBasedGateway is really bound
			JavaSDM.ensure(eventBasedGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object iceToAltFlow is really bound
			JavaSDM.ensure(iceToAltFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object intermediateCatchEvent is really bound
			JavaSDM.ensure(intermediateCatchEvent != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToAlt is really bound
			JavaSDM.ensure(outFlowToAlt != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects alternativeFlow and alt 
			JavaSDM.ensure(!alternativeFlow.equals(alt));

			// check isomorphic binding between objects ceFlow and alt 
			JavaSDM.ensure(!ceFlow.equals(alt));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and alt 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(alt));

			// check isomorphic binding between objects ebgToNormalStep and alt 
			JavaSDM.ensure(!ebgToNormalStep.equals(alt));

			// check isomorphic binding between objects eventBasedGateway and alt 
			JavaSDM.ensure(!eventBasedGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects iceToAltFlow and alt 
			JavaSDM.ensure(!iceToAltFlow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects intermediateCatchEvent and alt 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alt));

			// check isomorphic binding between objects lane and alt 
			JavaSDM.ensure(!lane.equals(alt));

			// check isomorphic binding between objects laneSet and alt 
			JavaSDM.ensure(!laneSet.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToAlt and alt 
			JavaSDM.ensure(!outFlowToAlt.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects processToUseCase and alt 
			JavaSDM.ensure(!processToUseCase.equals(alt));

			// check isomorphic binding between objects useCase and alt 
			JavaSDM.ensure(!useCase.equals(alt));

			// check isomorphic binding between objects ceFlow and alternativeFlow 
			JavaSDM.ensure(!ceFlow.equals(alternativeFlow));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and alternativeFlow 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(alternativeFlow));

			// check isomorphic binding between objects ebgToNormalStep and alternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(alternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and alternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(alternativeFlow));

			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and alternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlow and alternativeFlow 
			JavaSDM.ensure(!inFlow.equals(alternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and alternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(alternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and alternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(alternativeFlow));

			// check isomorphic binding between objects lane and alternativeFlow 
			JavaSDM.ensure(!lane.equals(alternativeFlow));

			// check isomorphic binding between objects laneSet and alternativeFlow 
			JavaSDM.ensure(!laneSet.equals(alternativeFlow));

			// check isomorphic binding between objects normalStep and alternativeFlow 
			JavaSDM.ensure(!normalStep.equals(alternativeFlow));

			// check isomorphic binding between objects outFlow and alternativeFlow 
			JavaSDM.ensure(!outFlow.equals(alternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and alternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(alternativeFlow));

			// check isomorphic binding between objects process and alternativeFlow 
			JavaSDM.ensure(!process.equals(alternativeFlow));

			// check isomorphic binding between objects processToUseCase and alternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(alternativeFlow));

			// check isomorphic binding between objects useCase and alternativeFlow 
			JavaSDM.ensure(!useCase.equals(alternativeFlow));

			// check isomorphic binding between objects ceFlowToAlternativeFlow and ceFlow 
			JavaSDM.ensure(!ceFlowToAlternativeFlow.equals(ceFlow));

			// check isomorphic binding between objects ebgToNormalStep and ceFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(ceFlow));

			// check isomorphic binding between objects eventBasedGateway and ceFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(ceFlow));

			// check isomorphic binding between objects flow and ceFlow 
			JavaSDM.ensure(!flow.equals(ceFlow));

			// check isomorphic binding between objects iceToAltFlow and ceFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(ceFlow));

			// check isomorphic binding between objects inFlow and ceFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlow));

			// check isomorphic binding between objects inFlowToFlow and ceFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(ceFlow));

			// check isomorphic binding between objects intermediateCatchEvent and ceFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ceFlow));

			// check isomorphic binding between objects lane and ceFlow 
			JavaSDM.ensure(!lane.equals(ceFlow));

			// check isomorphic binding between objects laneSet and ceFlow 
			JavaSDM.ensure(!laneSet.equals(ceFlow));

			// check isomorphic binding between objects normalStep and ceFlow 
			JavaSDM.ensure(!normalStep.equals(ceFlow));

			// check isomorphic binding between objects outFlow and ceFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlow));

			// check isomorphic binding between objects outFlowToAlt and ceFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(ceFlow));

			// check isomorphic binding between objects process and ceFlow 
			JavaSDM.ensure(!process.equals(ceFlow));

			// check isomorphic binding between objects processToUseCase and ceFlow 
			JavaSDM.ensure(!processToUseCase.equals(ceFlow));

			// check isomorphic binding between objects useCase and ceFlow 
			JavaSDM.ensure(!useCase.equals(ceFlow));

			// check isomorphic binding between objects ebgToNormalStep and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!ebgToNormalStep.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!eventBasedGateway.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects flow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!flow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects iceToAltFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!iceToAltFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects inFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!inFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects inFlowToFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects intermediateCatchEvent and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!intermediateCatchEvent
					.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects lane and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!lane.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects laneSet and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!laneSet.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects normalStep and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!normalStep.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects outFlow and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!outFlow.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects outFlowToAlt and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects process and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!process.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects processToUseCase and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!processToUseCase.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects useCase and ceFlowToAlternativeFlow 
			JavaSDM.ensure(!useCase.equals(ceFlowToAlternativeFlow));

			// check isomorphic binding between objects eventBasedGateway and ebgToNormalStep 
			JavaSDM.ensure(!eventBasedGateway.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and ebgToNormalStep 
			JavaSDM.ensure(!flow.equals(ebgToNormalStep));

			// check isomorphic binding between objects iceToAltFlow and ebgToNormalStep 
			JavaSDM.ensure(!iceToAltFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and ebgToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects intermediateCatchEvent and ebgToNormalStep 
			JavaSDM.ensure(!intermediateCatchEvent.equals(ebgToNormalStep));

			// check isomorphic binding between objects lane and ebgToNormalStep 
			JavaSDM.ensure(!lane.equals(ebgToNormalStep));

			// check isomorphic binding between objects laneSet and ebgToNormalStep 
			JavaSDM.ensure(!laneSet.equals(ebgToNormalStep));

			// check isomorphic binding between objects normalStep and ebgToNormalStep 
			JavaSDM.ensure(!normalStep.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlow and ebgToNormalStep 
			JavaSDM.ensure(!outFlow.equals(ebgToNormalStep));

			// check isomorphic binding between objects outFlowToAlt and ebgToNormalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(ebgToNormalStep));

			// check isomorphic binding between objects process and ebgToNormalStep 
			JavaSDM.ensure(!process.equals(ebgToNormalStep));

			// check isomorphic binding between objects processToUseCase and ebgToNormalStep 
			JavaSDM.ensure(!processToUseCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects useCase and ebgToNormalStep 
			JavaSDM.ensure(!useCase.equals(ebgToNormalStep));

			// check isomorphic binding between objects flow and eventBasedGateway 
			JavaSDM.ensure(!flow.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and eventBasedGateway 
			JavaSDM.ensure(!iceToAltFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects inFlowToFlow and eventBasedGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects intermediateCatchEvent and eventBasedGateway 
			JavaSDM.ensure(!intermediateCatchEvent.equals(eventBasedGateway));

			// check isomorphic binding between objects lane and eventBasedGateway 
			JavaSDM.ensure(!lane.equals(eventBasedGateway));

			// check isomorphic binding between objects laneSet and eventBasedGateway 
			JavaSDM.ensure(!laneSet.equals(eventBasedGateway));

			// check isomorphic binding between objects normalStep and eventBasedGateway 
			JavaSDM.ensure(!normalStep.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlow and eventBasedGateway 
			JavaSDM.ensure(!outFlow.equals(eventBasedGateway));

			// check isomorphic binding between objects outFlowToAlt and eventBasedGateway 
			JavaSDM.ensure(!outFlowToAlt.equals(eventBasedGateway));

			// check isomorphic binding between objects process and eventBasedGateway 
			JavaSDM.ensure(!process.equals(eventBasedGateway));

			// check isomorphic binding between objects processToUseCase and eventBasedGateway 
			JavaSDM.ensure(!processToUseCase.equals(eventBasedGateway));

			// check isomorphic binding between objects useCase and eventBasedGateway 
			JavaSDM.ensure(!useCase.equals(eventBasedGateway));

			// check isomorphic binding between objects iceToAltFlow and flow 
			JavaSDM.ensure(!iceToAltFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects intermediateCatchEvent and flow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToAlt and flow 
			JavaSDM.ensure(!outFlowToAlt.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToUseCase and flow 
			JavaSDM.ensure(!processToUseCase.equals(flow));

			// check isomorphic binding between objects useCase and flow 
			JavaSDM.ensure(!useCase.equals(flow));

			// check isomorphic binding between objects inFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and iceToAltFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects intermediateCatchEvent and iceToAltFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(iceToAltFlow));

			// check isomorphic binding between objects lane and iceToAltFlow 
			JavaSDM.ensure(!lane.equals(iceToAltFlow));

			// check isomorphic binding between objects laneSet and iceToAltFlow 
			JavaSDM.ensure(!laneSet.equals(iceToAltFlow));

			// check isomorphic binding between objects normalStep and iceToAltFlow 
			JavaSDM.ensure(!normalStep.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlow and iceToAltFlow 
			JavaSDM.ensure(!outFlow.equals(iceToAltFlow));

			// check isomorphic binding between objects outFlowToAlt and iceToAltFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(iceToAltFlow));

			// check isomorphic binding between objects process and iceToAltFlow 
			JavaSDM.ensure(!process.equals(iceToAltFlow));

			// check isomorphic binding between objects processToUseCase and iceToAltFlow 
			JavaSDM.ensure(!processToUseCase.equals(iceToAltFlow));

			// check isomorphic binding between objects useCase and iceToAltFlow 
			JavaSDM.ensure(!useCase.equals(iceToAltFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToUseCase and inFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlow));

			// check isomorphic binding between objects useCase and inFlow 
			JavaSDM.ensure(!useCase.equals(inFlow));

			// check isomorphic binding between objects intermediateCatchEvent and inFlowToFlow 
			JavaSDM.ensure(!intermediateCatchEvent.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToAlt and inFlowToFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToUseCase and inFlowToFlow 
			JavaSDM.ensure(!processToUseCase.equals(inFlowToFlow));

			// check isomorphic binding between objects useCase and inFlowToFlow 
			JavaSDM.ensure(!useCase.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and intermediateCatchEvent 
			JavaSDM.ensure(!lane.equals(intermediateCatchEvent));

			// check isomorphic binding between objects laneSet and intermediateCatchEvent 
			JavaSDM.ensure(!laneSet.equals(intermediateCatchEvent));

			// check isomorphic binding between objects normalStep and intermediateCatchEvent 
			JavaSDM.ensure(!normalStep.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlow and intermediateCatchEvent 
			JavaSDM.ensure(!outFlow.equals(intermediateCatchEvent));

			// check isomorphic binding between objects outFlowToAlt and intermediateCatchEvent 
			JavaSDM.ensure(!outFlowToAlt.equals(intermediateCatchEvent));

			// check isomorphic binding between objects process and intermediateCatchEvent 
			JavaSDM.ensure(!process.equals(intermediateCatchEvent));

			// check isomorphic binding between objects processToUseCase and intermediateCatchEvent 
			JavaSDM.ensure(!processToUseCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects useCase and intermediateCatchEvent 
			JavaSDM.ensure(!useCase.equals(intermediateCatchEvent));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToAlt and lane 
			JavaSDM.ensure(!outFlowToAlt.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToUseCase and lane 
			JavaSDM.ensure(!processToUseCase.equals(lane));

			// check isomorphic binding between objects useCase and lane 
			JavaSDM.ensure(!useCase.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToAlt and laneSet 
			JavaSDM.ensure(!outFlowToAlt.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and laneSet 
			JavaSDM.ensure(!processToUseCase.equals(laneSet));

			// check isomorphic binding between objects useCase and laneSet 
			JavaSDM.ensure(!useCase.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and normalStep 
			JavaSDM.ensure(!outFlowToAlt.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToUseCase and normalStep 
			JavaSDM.ensure(!processToUseCase.equals(normalStep));

			// check isomorphic binding between objects useCase and normalStep 
			JavaSDM.ensure(!useCase.equals(normalStep));

			// check isomorphic binding between objects outFlowToAlt and outFlow 
			JavaSDM.ensure(!outFlowToAlt.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToUseCase and outFlow 
			JavaSDM.ensure(!processToUseCase.equals(outFlow));

			// check isomorphic binding between objects useCase and outFlow 
			JavaSDM.ensure(!useCase.equals(outFlow));

			// check isomorphic binding between objects process and outFlowToAlt 
			JavaSDM.ensure(!process.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and outFlowToAlt 
			JavaSDM.ensure(!processToUseCase.equals(outFlowToAlt));

			// check isomorphic binding between objects useCase and outFlowToAlt 
			JavaSDM.ensure(!useCase.equals(outFlowToAlt));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object eventBasedGateway__outgoing__outFlow
			eventBasedGateway__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ceFlow__sourceRef__intermediateCatchEvent
			ceFlow__sourceRef__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ceFlowToAlternativeFlow__source__ceFlow
			ceFlowToAlternativeFlow__source__ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object lane__flowNodeRefs__intermediateCatchEvent
			lane__flowNodeRefs__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__ceFlow
			process__flowElements__ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__eventBasedGateway
			outFlow__sourceRef__eventBasedGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object intermediateCatchEvent__outgoing__ceFlow
			intermediateCatchEvent__outgoing__ceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__targetRef__intermediateCatchEvent
			outFlow__targetRef__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__intermediateCatchEvent
			process__flowElements__intermediateCatchEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object intermediateCatchEvent__incoming__outFlow
			intermediateCatchEvent__incoming__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToAlt__target__alt
			outFlowToAlt__target__alt = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ceFlowToAlternativeFlow__target__alternativeFlow
			ceFlowToAlternativeFlow__target__alternativeFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("CatchEventAfterEBGToStepRule");
			// assign attribute process__flowElements__ceFlow
			process__flowElements__ceFlow.setName("flowElements");
			// assign attribute process__flowElements__intermediateCatchEvent
			process__flowElements__intermediateCatchEvent
					.setName("flowElements");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute outFlow__sourceRef__eventBasedGateway
			outFlow__sourceRef__eventBasedGateway.setName("sourceRef");
			// assign attribute eventBasedGateway__outgoing__outFlow
			eventBasedGateway__outgoing__outFlow.setName("outgoing");
			// assign attribute outFlow__targetRef__intermediateCatchEvent
			outFlow__targetRef__intermediateCatchEvent.setName("targetRef");
			// assign attribute intermediateCatchEvent__incoming__outFlow
			intermediateCatchEvent__incoming__outFlow.setName("incoming");
			// assign attribute ceFlow__sourceRef__intermediateCatchEvent
			ceFlow__sourceRef__intermediateCatchEvent.setName("sourceRef");
			// assign attribute intermediateCatchEvent__outgoing__ceFlow
			intermediateCatchEvent__outgoing__ceFlow.setName("outgoing");
			// assign attribute __useCase_flows_alternativeFlow
			__useCase_flows_alternativeFlow.setName("flows");
			// assign attribute __normalStep_stepAlternative_alt
			__normalStep_stepAlternative_alt.setName("stepAlternative");
			// assign attribute __alt_ref_alternativeFlow
			__alt_ref_alternativeFlow.setName("ref");
			// assign attribute outFlowToAlt__source__outFlow
			outFlowToAlt__source__outFlow.setName("source");
			// assign attribute outFlowToAlt__target__alt
			outFlowToAlt__target__alt.setName("target");
			// assign attribute iceToAltFlow__source__intermediateCatchEvent
			iceToAltFlow__source__intermediateCatchEvent.setName("source");
			// assign attribute iceToAltFlow__target__alternativeFlow
			iceToAltFlow__target__alternativeFlow.setName("target");
			// assign attribute lane__flowNodeRefs__intermediateCatchEvent
			lane__flowNodeRefs__intermediateCatchEvent.setName("flowNodeRefs");
			// assign attribute ceFlowToAlternativeFlow__source__ceFlow
			ceFlowToAlternativeFlow__source__ceFlow.setName("source");
			// assign attribute ceFlowToAlternativeFlow__target__alternativeFlow
			ceFlowToAlternativeFlow__target__alternativeFlow.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					eventBasedGateway__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_alternativeFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlow__sourceRef__intermediateCatchEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__target__alternativeFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					iceToAltFlow__source__intermediateCatchEvent,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_stepAlternative_alt, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__alt_ref_alternativeFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow__source__ceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane__flowNodeRefs__intermediateCatchEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__ceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__eventBasedGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent__outgoing__ceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__targetRef__intermediateCatchEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__intermediateCatchEvent,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					intermediateCatchEvent__incoming__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToAlt__target__alt, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ceFlowToAlternativeFlow__target__alternativeFlow,
					"createdEdges");

			// create link
			process__flowElements__intermediateCatchEvent.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			process__flowElements__ceFlow.setSrc(process);

			// create link
			outFlow__sourceRef__eventBasedGateway.setTrg(eventBasedGateway);

			// create link
			eventBasedGateway__outgoing__outFlow.setSrc(eventBasedGateway);

			// create link
			outFlow__targetRef__intermediateCatchEvent.setSrc(outFlow);

			// create link
			eventBasedGateway__outgoing__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			intermediateCatchEvent__incoming__outFlow.setTrg(outFlow);

			// create link
			outFlowToAlt__source__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__eventBasedGateway.setSrc(outFlow);

			// create link
			iceToAltFlow__source__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			lane__flowNodeRefs__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			ceFlow__sourceRef__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			intermediateCatchEvent__outgoing__ceFlow
					.setSrc(intermediateCatchEvent);

			// create link
			process__flowElements__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			intermediateCatchEvent__incoming__outFlow
					.setSrc(intermediateCatchEvent);

			// create link
			outFlow__targetRef__intermediateCatchEvent
					.setTrg(intermediateCatchEvent);

			// create link
			__useCase_flows_alternativeFlow.setSrc(useCase);

			// create link
			__normalStep_stepAlternative_alt.setSrc(normalStep);

			// create link
			__normalStep_stepAlternative_alt.setTrg(alt);

			// create link
			__alt_ref_alternativeFlow.setSrc(alt);

			// create link
			outFlowToAlt__target__alt.setTrg(alt);

			// create link
			outFlowToAlt__target__alt.setSrc(outFlowToAlt);

			// create link
			outFlowToAlt__source__outFlow.setSrc(outFlowToAlt);

			// create link
			ceFlowToAlternativeFlow__target__alternativeFlow
					.setTrg(alternativeFlow);

			// create link
			__useCase_flows_alternativeFlow.setTrg(alternativeFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setTrg(alternativeFlow);

			// create link
			__alt_ref_alternativeFlow.setTrg(alternativeFlow);

			// create link
			iceToAltFlow__source__intermediateCatchEvent.setSrc(iceToAltFlow);

			// create link
			iceToAltFlow__target__alternativeFlow.setSrc(iceToAltFlow);

			// create link
			lane__flowNodeRefs__intermediateCatchEvent.setSrc(lane);

			// create link
			intermediateCatchEvent__outgoing__ceFlow.setTrg(ceFlow);

			// create link
			process__flowElements__ceFlow.setTrg(ceFlow);

			// create link
			ceFlow__sourceRef__intermediateCatchEvent.setSrc(ceFlow);

			// create link
			ceFlowToAlternativeFlow__source__ceFlow.setTrg(ceFlow);

			// create link
			ceFlowToAlternativeFlow__target__alternativeFlow
					.setSrc(ceFlowToAlternativeFlow);

			// create link
			ceFlowToAlternativeFlow__source__ceFlow
					.setSrc(ceFlowToAlternativeFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				iceToAltFlow, lane, laneSet, ceFlow, ceFlowToAlternativeFlow);
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
		AlternativeFlowAlternative alt = null;
		AlternativeFlow alternativeFlow = null;
		Flow flow = null;
		NormalStep normalStep = null;
		UseCase useCase = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_flowElements_eventBasedGateway = null;
		EMoflonEdge __processToUseCase_source_process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __eventBasedGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_eventBasedGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __ebgToNormalStep_source_eventBasedGateway = null;
		EMoflonEdge __useCase_flows_alternativeFlow = null;
		EMoflonEdge __useCase_flows_flow = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __ebgToNormalStep_target_normalStep = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __alt_ref_alternativeFlow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterUseCaseToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterNormalStepToEbgToNormalStep = null;
		FlowNodeToStep ebgToNormalStep = null;

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
			ruleresult.setRule("CatchEventAfterEBGToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (match.getObject("alternativeFlow"));

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects flow and alternativeFlow 
			JavaSDM.ensure(!flow.equals(alternativeFlow));

			// iterate to-many link target from normalStep to ebgToNormalStep
			fujaba__Success = false;

			fujaba__IterNormalStepToEbgToNormalStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, FlowNodeToStep.class, "target"))
					.iterator();

			while (fujaba__IterNormalStepToEbgToNormalStep.hasNext()) {
				try {
					ebgToNormalStep = (FlowNodeToStep) fujaba__IterNormalStepToEbgToNormalStep
							.next();

					// check object ebgToNormalStep is really bound
					JavaSDM.ensure(ebgToNormalStep != null);
					// bind object
					_TmpObject = ebgToNormalStep.getSource();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;

					// iterate to-many link target from flow to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterFlowToInFlowToFlow = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(flow,
											SequenceFlowToUCFlow.class,
											"target")).iterator();

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

							// iterate to-many link target from useCase to processToUseCase
							fujaba__Success = false;

							fujaba__IterUseCaseToProcessToUseCase = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(useCase,
													ProcessToUseCase.class,
													"target")).iterator();

							while (fujaba__IterUseCaseToProcessToUseCase
									.hasNext()) {
								try {
									processToUseCase = (ProcessToUseCase) fujaba__IterUseCaseToProcessToUseCase
											.next();

									// check object processToUseCase is really bound
									JavaSDM.ensure(processToUseCase != null);
									// bind object
									process = processToUseCase.getSource();

									// check object process is really bound
									JavaSDM.ensure(process != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object alt is really bound
										JavaSDM.ensure(alt != null);
										// check object alternativeFlow is really bound
										JavaSDM.ensure(alternativeFlow != null);
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
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToUseCase is really bound
										JavaSDM.ensure(processToUseCase != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects flow and alternativeFlow 
										JavaSDM.ensure(!flow
												.equals(alternativeFlow));

										// check link ref from alt to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(alt.getRef()));

										// check link flowElements from eventBasedGateway to process
										JavaSDM.ensure(process
												.equals(eventBasedGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flows from alternativeFlow to useCase
										JavaSDM.ensure(useCase
												.equals(alternativeFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link source from ebgToNormalStep to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(ebgToNormalStep
														.getSource()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from processToUseCase to process
										JavaSDM.ensure(process
												.equals(processToUseCase
														.getSource()));

										// check link stepAlternative from alt to normalStep
										JavaSDM.ensure(normalStep.equals(alt
												.eContainer()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from ebgToNormalStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(ebgToNormalStep
														.getTarget()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from processToUseCase to useCase
										JavaSDM.ensure(useCase
												.equals(processToUseCase
														.getTarget()));

										// check link targetRef from inFlow to eventBasedGateway
										JavaSDM.ensure(eventBasedGateway
												.equals(inFlow.getTargetRef()));

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
														// create object __process_flowElements_inFlow
														__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_eventBasedGateway
														__process_flowElements_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __processToUseCase_source_process
														__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object isApplicableMatch
														isApplicableMatch = TGGRuntimeFactory.eINSTANCE
																.createIsApplicableMatch();

														// create object __process_laneSets_laneSet
														__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __eventBasedGateway_incoming_inFlow
														__eventBasedGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlow_targetRef_eventBasedGateway
														__inFlow_targetRef_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_source_inFlow
														__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __ebgToNormalStep_source_eventBasedGateway
														__ebgToNormalStep_source_eventBasedGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __useCase_flows_alternativeFlow
														__useCase_flows_alternativeFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __useCase_flows_flow
														__useCase_flows_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __processToUseCase_target_useCase
														__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __flow_steps_normalStep
														__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_target_flow
														__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __ebgToNormalStep_target_normalStep
														__ebgToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __normalStep_stepAlternative_alt
														__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __alt_ref_alternativeFlow
														__alt_ref_alternativeFlow = TGGRuntimeFactory.eINSTANCE
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
														// assign attribute __process_flowElements_eventBasedGateway
														__process_flowElements_eventBasedGateway
																.setName("flowElements");
														// assign attribute __inFlow_targetRef_eventBasedGateway
														__inFlow_targetRef_eventBasedGateway
																.setName("targetRef");
														// assign attribute __eventBasedGateway_incoming_inFlow
														__eventBasedGateway_incoming_inFlow
																.setName("incoming");
														// assign attribute __useCase_flows_flow
														__useCase_flows_flow
																.setName("flows");
														// assign attribute __useCase_flows_alternativeFlow
														__useCase_flows_alternativeFlow
																.setName("flows");
														// assign attribute __processToUseCase_source_process
														__processToUseCase_source_process
																.setName("source");
														// assign attribute __processToUseCase_target_useCase
														__processToUseCase_target_useCase
																.setName("target");
														// assign attribute __flow_steps_normalStep
														__flow_steps_normalStep
																.setName("steps");
														// assign attribute __inFlowToFlow_source_inFlow
														__inFlowToFlow_source_inFlow
																.setName("source");
														// assign attribute __inFlowToFlow_target_flow
														__inFlowToFlow_target_flow
																.setName("target");
														// assign attribute __normalStep_stepAlternative_alt
														__normalStep_stepAlternative_alt
																.setName("stepAlternative");
														// assign attribute __ebgToNormalStep_source_eventBasedGateway
														__ebgToNormalStep_source_eventBasedGateway
																.setName("source");
														// assign attribute __ebgToNormalStep_target_normalStep
														__ebgToNormalStep_target_normalStep
																.setName("target");
														// assign attribute __alt_ref_alternativeFlow
														__alt_ref_alternativeFlow
																.setName("ref");
														// assign attribute __laneSet_lanes_lane
														__laneSet_lanes_lane
																.setName("lanes");

														// create link
														__process_flowElements_inFlow
																.setSrc(process);

														// create link
														__process_flowElements_eventBasedGateway
																.setSrc(process);

														// create link
														__processToUseCase_source_process
																.setTrg(process);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(process);

														// create link
														__process_laneSets_laneSet
																.setSrc(process);

														// create link
														__eventBasedGateway_incoming_inFlow
																.setTrg(inFlow);

														// create link
														__process_flowElements_inFlow
																.setTrg(inFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlow);

														// create link
														__inFlow_targetRef_eventBasedGateway
																.setSrc(inFlow);

														// create link
														__inFlowToFlow_source_inFlow
																.setTrg(inFlow);

														// create link
														__inFlow_targetRef_eventBasedGateway
																.setTrg(eventBasedGateway);

														// create link
														__process_flowElements_eventBasedGateway
																.setTrg(eventBasedGateway);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(eventBasedGateway);

														// create link
														__eventBasedGateway_incoming_inFlow
																.setSrc(eventBasedGateway);

														// create link
														__ebgToNormalStep_source_eventBasedGateway
																.setTrg(eventBasedGateway);

														// create link
														__useCase_flows_alternativeFlow
																.setSrc(useCase);

														// create link
														__useCase_flows_flow
																.setSrc(useCase);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(useCase);

														// create link
														__processToUseCase_target_useCase
																.setTrg(useCase);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(processToUseCase);

														// create link
														__processToUseCase_source_process
																.setSrc(processToUseCase);

														// create link
														__processToUseCase_target_useCase
																.setSrc(processToUseCase);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(flow);

														// create link
														__flow_steps_normalStep
																.setSrc(flow);

														// create link
														__inFlowToFlow_target_flow
																.setTrg(flow);

														// create link
														__useCase_flows_flow
																.setTrg(flow);

														// create link
														__inFlowToFlow_target_flow
																.setSrc(inFlowToFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlowToFlow);

														// create link
														__inFlowToFlow_source_inFlow
																.setSrc(inFlowToFlow);

														// create link
														__flow_steps_normalStep
																.setTrg(normalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(normalStep);

														// create link
														__ebgToNormalStep_target_normalStep
																.setTrg(normalStep);

														// create link
														__normalStep_stepAlternative_alt
																.setSrc(normalStep);

														// create link
														__ebgToNormalStep_source_eventBasedGateway
																.setSrc(ebgToNormalStep);

														// create link
														__ebgToNormalStep_target_normalStep
																.setSrc(ebgToNormalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(ebgToNormalStep);

														// create link
														__normalStep_stepAlternative_alt
																.setTrg(alt);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(alt);

														// create link
														__alt_ref_alternativeFlow
																.setSrc(alt);

														// create link
														__alt_ref_alternativeFlow
																.setTrg(alternativeFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(alternativeFlow);

														// create link
														__useCase_flows_alternativeFlow
																.setTrg(alternativeFlow);

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
																		__inFlowToFlow_source_inFlow,
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
																		__process_flowElements_eventBasedGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__normalStep_stepAlternative_alt,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__ebgToNormalStep_source_eventBasedGateway,
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
																		__inFlowToFlow_target_flow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__ebgToNormalStep_target_normalStep,
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
																		__processToUseCase_source_process,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__alt_ref_alternativeFlow,
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
																		__flow_steps_normalStep,
																		"allContextElements");

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
																		__inFlow_targetRef_eventBasedGateway,
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
																		__useCase_flows_alternativeFlow,
																		"allContextElements");
														// story node 'solve CSP'
														try {
															fujaba__Success = false;

															_TmpObject = (this
																	.isApplicable_solveCsp_BWD(
																			isApplicableMatch,
																			process,
																			inFlow,
																			eventBasedGateway,
																			useCase,
																			processToUseCase,
																			flow,
																			inFlowToFlow,
																			normalStep,
																			ebgToNormalStep,
																			alt,
																			alternativeFlow,
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
																		.setRuleName("CatchEventAfterEBGToStepRule");
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
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("normalStep", normalStep);
		match.registerObject("alt", alt);
		match.registerObject("alternativeFlow", alternativeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
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
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");

		// Create attribute variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", true, csp);
		var_alternativeFlow_name.setValue(alternativeFlow.getName());
		var_alternativeFlow_name.setType("");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", csp);
		var_intermediateCatchEvent_id.setType("");
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", csp);
		var_intermediateCatchEvent_name.setType("");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_eventBasedGateway_gatewayDirection,
				literal0);
		eq.setRuleName("");
		eq.solve(var_intermediateCatchEvent_id, var_alternativeFlow_name);
		eq_0.setRuleName("");
		eq_0.solve(var_intermediateCatchEvent_name, var_alt_condition);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch
				.registerObject("eventBasedGateway", eventBasedGateway);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("ebgToNormalStep", ebgToNormalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("alternativeFlow", alternativeFlow);
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
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("eventBasedGateway", eventBasedGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("intermediateCatchEvent",
				intermediateCatchEvent);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("ebgToNormalStep", ebgToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("outFlowToAlt", outFlowToAlt);
		ruleresult.registerObject("alternativeFlow", alternativeFlow);
		ruleresult.registerObject("iceToAltFlow", iceToAltFlow);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("ceFlow", ceFlow);
		ruleresult.registerObject("ceFlowToAlternativeFlow",
				ceFlowToAlternativeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative())
				&& match.getObject("alternativeFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_67(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_119809 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_414372 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_229956 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_400321 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_400321 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterIntermediateCatchEventToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToIntermediateCatchEvent = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEventBasedGateway = null;
		EventBasedGateway eventBasedGateway = null;
		SequenceFlow ceFlow = null;
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

			// ensure correct type and really bound of object ceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			ceFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from ceFlow to process
			JavaSDM.ensure(process.equals(ceFlow.eContainer()));

			// iterate to-many link flowElements from process to eventBasedGateway
			fujaba__Success = false;

			fujaba__IterProcessToEventBasedGateway = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToEventBasedGateway.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToEventBasedGateway.next();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;
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
							// check isomorphic binding between objects inFlow and ceFlow 
							JavaSDM.ensure(!inFlow.equals(ceFlow));

							// check link targetRef from inFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowElements from process to intermediateCatchEvent
							fujaba__Success = false;

							fujaba__IterProcessToIntermediateCatchEvent = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToIntermediateCatchEvent
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToIntermediateCatchEvent
											.next();

									// ensure correct type and really bound of object intermediateCatchEvent
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;
									// check link sourceRef from ceFlow to intermediateCatchEvent
									JavaSDM.ensure(intermediateCatchEvent
											.equals(ceFlow.getSourceRef()));

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
											// check isomorphic binding between objects outFlow and ceFlow 
											JavaSDM.ensure(!outFlow
													.equals(ceFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link sourceRef from outFlow to eventBasedGateway
											JavaSDM.ensure(eventBasedGateway
													.equals(outFlow
															.getSourceRef()));

											// check link targetRef from outFlow to intermediateCatchEvent
											JavaSDM.ensure(intermediateCatchEvent
													.equals(outFlow
															.getTargetRef()));

											// iterate to-many link flowNodeRefs from intermediateCatchEvent to lane
											fujaba__Success = false;

											fujaba__IterIntermediateCatchEventToLane = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	intermediateCatchEvent,
																	Lane.class,
																	"flowNodeRefs"))
													.iterator();

											while (fujaba__IterIntermediateCatchEventToLane
													.hasNext()) {
												try {
													lane = (Lane) fujaba__IterIntermediateCatchEventToLane
															.next();

													// check object lane is really bound
													JavaSDM.ensure(lane != null);
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
															JavaSDM.ensure(laneSet
																	.equals(lane
																			.eContainer()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_ceFlow_flowElements_119809 = ceFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																			.eContainer()
																			: null;

																	// check object __DEC_ceFlow_flowElements_119809 is really bound
																	JavaSDM.ensure(__DEC_ceFlow_flowElements_119809 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_ceFlow_flowElements_119809
																			.getFlowElements()
																			.contains(
																					ceFlow));

																	// check isomorphic binding between objects __DEC_ceFlow_flowElements_119809 and process 
																	JavaSDM.ensure(!__DEC_ceFlow_flowElements_119809
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
																	__DEC_intermediateCatchEvent_flowElements_414372 = intermediateCatchEvent
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																			.eContainer()
																			: null;

																	// check object __DEC_intermediateCatchEvent_flowElements_414372 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_414372 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_414372
																			.getFlowElements()
																			.contains(
																					intermediateCatchEvent));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_414372 and process 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_414372
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
																	__DEC_outFlow_flowElements_229956 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_229956 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_229956 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_229956
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_229956 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_229956
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link default from ceFlow
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				ceFlow,
																				ExclusiveGateway.class,
																				"default")
																		.size() == 0);
																// negative check for link default from outFlow
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				outFlow,
																				ExclusiveGateway.class,
																				"default")
																		.size() == 0);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_400321
																	fujaba__Success = false;

																	fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_400321 = new ArrayList(
																			intermediateCatchEvent
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_400321
																					.hasNext()) {
																		try {
																			__DEC_intermediateCatchEvent_targetRef_400321 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_400321
																					.next();

																			// check object __DEC_intermediateCatchEvent_targetRef_400321 is really bound
																			JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_400321 != null);
																			// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_400321 and ceFlow 
																			JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_400321
																					.equals(ceFlow));

																			// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_400321 and inFlow 
																			JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_400321
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_400321 and outFlow 
																			JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_400321
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
																// check object ceFlow is really bound
																JavaSDM.ensure(ceFlow != null);
																// check object eventBasedGateway is really bound
																JavaSDM.ensure(eventBasedGateway != null);
																// check object inFlow is really bound
																JavaSDM.ensure(inFlow != null);
																// check object intermediateCatchEvent is really bound
																JavaSDM.ensure(intermediateCatchEvent != null);
																// check object lane is really bound
																JavaSDM.ensure(lane != null);
																// check object laneSet is really bound
																JavaSDM.ensure(laneSet != null);
																// check object outFlow is really bound
																JavaSDM.ensure(outFlow != null);
																// check object process is really bound
																JavaSDM.ensure(process != null);
																// check isomorphic binding between objects inFlow and ceFlow 
																JavaSDM.ensure(!inFlow
																		.equals(ceFlow));

																// check isomorphic binding between objects outFlow and ceFlow 
																JavaSDM.ensure(!outFlow
																		.equals(ceFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link flowElements from ceFlow to process
																JavaSDM.ensure(process
																		.equals(ceFlow
																				.eContainer()));

																// check link flowElements from eventBasedGateway to process
																JavaSDM.ensure(process
																		.equals(eventBasedGateway
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from intermediateCatchEvent to process
																JavaSDM.ensure(process
																		.equals(intermediateCatchEvent
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

																// check link sourceRef from ceFlow to intermediateCatchEvent
																JavaSDM.ensure(intermediateCatchEvent
																		.equals(ceFlow
																				.getSourceRef()));

																// check link sourceRef from outFlow to eventBasedGateway
																JavaSDM.ensure(eventBasedGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link src from _edge_flowElements to process
																JavaSDM.ensure(process
																		.equals(_edge_flowElements
																				.getSrc()));

																// check link targetRef from inFlow to eventBasedGateway
																JavaSDM.ensure(eventBasedGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link targetRef from outFlow to intermediateCatchEvent
																JavaSDM.ensure(intermediateCatchEvent
																		.equals(outFlow
																				.getTargetRef()));

																// check link targetRef from ceFlow to intermediateCatchEvent
																JavaSDM.ensure(!(intermediateCatchEvent
																		.equals(ceFlow
																				.getTargetRef())));

																// check link targetRef from inFlow to intermediateCatchEvent
																JavaSDM.ensure(!(intermediateCatchEvent
																		.equals(inFlow
																				.getTargetRef())));

																// check link trg from _edge_flowElements to ceFlow
																JavaSDM.ensure(ceFlow
																		.equals(_edge_flowElements
																				.getTrg()));

																// check link flowNodeRefs from lane to intermediateCatchEvent
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				intermediateCatchEvent));

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
																				inFlow,
																				eventBasedGateway,
																				outFlow,
																				intermediateCatchEvent,
																				lane,
																				laneSet,
																				ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_68(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_541754 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_310028 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_418274 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_550656 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_550656 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// iterate to-many link flowElements from process to ceFlow
			fujaba__Success = false;

			fujaba__IterProcessToCeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToCeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToCeFlow.next();

					// ensure correct type and really bound of object ceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					ceFlow = (SequenceFlow) _TmpObject;
					// check link sourceRef from ceFlow to intermediateCatchEvent
					JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
							.getSourceRef()));

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
							// check isomorphic binding between objects inFlow and ceFlow 
							JavaSDM.ensure(!inFlow.equals(ceFlow));

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
									// check isomorphic binding between objects outFlow and ceFlow 
									JavaSDM.ensure(!outFlow.equals(ceFlow));

									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// bind object
									_TmpObject = outFlow.getSourceRef();

									// ensure correct type and really bound of object eventBasedGateway
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									eventBasedGateway = (EventBasedGateway) _TmpObject;

									// check link flowElements from eventBasedGateway to process
									JavaSDM.ensure(process
											.equals(eventBasedGateway
													.eContainer()));

									// check link targetRef from inFlow to eventBasedGateway
									JavaSDM.ensure(eventBasedGateway
											.equals(inFlow.getTargetRef()));

									// check link targetRef from outFlow to intermediateCatchEvent
									JavaSDM.ensure(intermediateCatchEvent
											.equals(outFlow.getTargetRef()));

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
													// check link flowNodeRefs from lane to intermediateCatchEvent
													JavaSDM.ensure(lane
															.getFlowNodeRefs()
															.contains(
																	intermediateCatchEvent));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_ceFlow_flowElements_541754 = ceFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																	.eContainer()
																	: null;

															// check object __DEC_ceFlow_flowElements_541754 is really bound
															JavaSDM.ensure(__DEC_ceFlow_flowElements_541754 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_ceFlow_flowElements_541754
																	.getFlowElements()
																	.contains(
																			ceFlow));

															// check isomorphic binding between objects __DEC_ceFlow_flowElements_541754 and process 
															JavaSDM.ensure(!__DEC_ceFlow_flowElements_541754
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
															__DEC_intermediateCatchEvent_flowElements_310028 = intermediateCatchEvent
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																	.eContainer()
																	: null;

															// check object __DEC_intermediateCatchEvent_flowElements_310028 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_310028 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_310028
																	.getFlowElements()
																	.contains(
																			intermediateCatchEvent));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_310028 and process 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_310028
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
															__DEC_outFlow_flowElements_418274 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_418274 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_418274 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_418274
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_418274 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_418274
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from ceFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		ceFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_550656
															fujaba__Success = false;

															fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_550656 = new ArrayList(
																	intermediateCatchEvent
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_550656
																			.hasNext()) {
																try {
																	__DEC_intermediateCatchEvent_targetRef_550656 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_550656
																			.next();

																	// check object __DEC_intermediateCatchEvent_targetRef_550656 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_550656 != null);
																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_550656 and ceFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_550656
																			.equals(ceFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_550656 and inFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_550656
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_550656 and outFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_550656
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
														// check object ceFlow is really bound
														JavaSDM.ensure(ceFlow != null);
														// check object eventBasedGateway is really bound
														JavaSDM.ensure(eventBasedGateway != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object intermediateCatchEvent is really bound
														JavaSDM.ensure(intermediateCatchEvent != null);
														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// check object laneSet is really bound
														JavaSDM.ensure(laneSet != null);
														// check object outFlow is really bound
														JavaSDM.ensure(outFlow != null);
														// check object process is really bound
														JavaSDM.ensure(process != null);
														// check isomorphic binding between objects inFlow and ceFlow 
														JavaSDM.ensure(!inFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and ceFlow 
														JavaSDM.ensure(!outFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from ceFlow to process
														JavaSDM.ensure(process.equals(ceFlow
																.eContainer()));

														// check link flowElements from eventBasedGateway to process
														JavaSDM.ensure(process
																.equals(eventBasedGateway
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from intermediateCatchEvent to process
														JavaSDM.ensure(process
																.equals(intermediateCatchEvent
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

														// check link sourceRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
																.getSourceRef()));

														// check link sourceRef from outFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_flowElements to process
														JavaSDM.ensure(process
																.equals(_edge_flowElements
																		.getSrc()));

														// check link targetRef from inFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from outFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
																.getTargetRef()));

														// check link targetRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
																.getTargetRef())));

														// check link targetRef from inFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
																.getTargetRef())));

														// check link trg from _edge_flowElements to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent
																.equals(_edge_flowElements
																		.getTrg()));

														// check link flowNodeRefs from lane to intermediateCatchEvent
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		intermediateCatchEvent));

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
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		lane,
																		laneSet,
																		ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_69(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_332993 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_457385 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_803028 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_661586 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_661586 = null;
		Match match = null;
		Iterator fujaba__IterIntermediateCatchEventToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToEventBasedGateway = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		SequenceFlow outFlow = null;
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

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// bind object
					_TmpObject = outFlow.getTargetRef();

					// ensure correct type and really bound of object intermediateCatchEvent
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

					// check link flowElements from intermediateCatchEvent to process
					JavaSDM.ensure(process.equals(intermediateCatchEvent
							.eContainer()));

					// iterate to-many link flowElements from process to ceFlow
					fujaba__Success = false;

					fujaba__IterProcessToCeFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToCeFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToCeFlow.next();

							// ensure correct type and really bound of object ceFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							ceFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and ceFlow 
							JavaSDM.ensure(!outFlow.equals(ceFlow));

							// check link sourceRef from ceFlow to intermediateCatchEvent
							JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to eventBasedGateway
							fujaba__Success = false;

							fujaba__IterProcessToEventBasedGateway = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToEventBasedGateway
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToEventBasedGateway
											.next();

									// ensure correct type and really bound of object eventBasedGateway
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									eventBasedGateway = (EventBasedGateway) _TmpObject;
									// check link sourceRef from outFlow to eventBasedGateway
									JavaSDM.ensure(eventBasedGateway
											.equals(outFlow.getSourceRef()));

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
											// check isomorphic binding between objects inFlow and ceFlow 
											JavaSDM.ensure(!inFlow
													.equals(ceFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link targetRef from inFlow to eventBasedGateway
											JavaSDM.ensure(eventBasedGateway
													.equals(inFlow
															.getTargetRef()));

											// iterate to-many link flowNodeRefs from intermediateCatchEvent to lane
											fujaba__Success = false;

											fujaba__IterIntermediateCatchEventToLane = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	intermediateCatchEvent,
																	Lane.class,
																	"flowNodeRefs"))
													.iterator();

											while (fujaba__IterIntermediateCatchEventToLane
													.hasNext()) {
												try {
													lane = (Lane) fujaba__IterIntermediateCatchEventToLane
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
															__DEC_ceFlow_flowElements_332993 = ceFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																	.eContainer()
																	: null;

															// check object __DEC_ceFlow_flowElements_332993 is really bound
															JavaSDM.ensure(__DEC_ceFlow_flowElements_332993 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_ceFlow_flowElements_332993
																	.getFlowElements()
																	.contains(
																			ceFlow));

															// check isomorphic binding between objects __DEC_ceFlow_flowElements_332993 and process 
															JavaSDM.ensure(!__DEC_ceFlow_flowElements_332993
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
															__DEC_intermediateCatchEvent_flowElements_457385 = intermediateCatchEvent
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																	.eContainer()
																	: null;

															// check object __DEC_intermediateCatchEvent_flowElements_457385 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_457385 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_457385
																	.getFlowElements()
																	.contains(
																			intermediateCatchEvent));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_457385 and process 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_457385
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
															__DEC_outFlow_flowElements_803028 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_803028 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_803028 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_803028
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_803028 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_803028
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from ceFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		ceFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_661586
															fujaba__Success = false;

															fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_661586 = new ArrayList(
																	intermediateCatchEvent
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_661586
																			.hasNext()) {
																try {
																	__DEC_intermediateCatchEvent_targetRef_661586 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_661586
																			.next();

																	// check object __DEC_intermediateCatchEvent_targetRef_661586 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_661586 != null);
																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_661586 and ceFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_661586
																			.equals(ceFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_661586 and inFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_661586
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_661586 and outFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_661586
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
														// check object ceFlow is really bound
														JavaSDM.ensure(ceFlow != null);
														// check object eventBasedGateway is really bound
														JavaSDM.ensure(eventBasedGateway != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object intermediateCatchEvent is really bound
														JavaSDM.ensure(intermediateCatchEvent != null);
														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// check object laneSet is really bound
														JavaSDM.ensure(laneSet != null);
														// check object outFlow is really bound
														JavaSDM.ensure(outFlow != null);
														// check object process is really bound
														JavaSDM.ensure(process != null);
														// check isomorphic binding between objects inFlow and ceFlow 
														JavaSDM.ensure(!inFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and ceFlow 
														JavaSDM.ensure(!outFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from ceFlow to process
														JavaSDM.ensure(process.equals(ceFlow
																.eContainer()));

														// check link flowElements from eventBasedGateway to process
														JavaSDM.ensure(process
																.equals(eventBasedGateway
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from intermediateCatchEvent to process
														JavaSDM.ensure(process
																.equals(intermediateCatchEvent
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

														// check link sourceRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
																.getSourceRef()));

														// check link sourceRef from outFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_flowElements to process
														JavaSDM.ensure(process
																.equals(_edge_flowElements
																		.getSrc()));

														// check link targetRef from inFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from outFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
																.getTargetRef()));

														// check link targetRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
																.getTargetRef())));

														// check link targetRef from inFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
																.getTargetRef())));

														// check link trg from _edge_flowElements to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_flowElements
																		.getTrg()));

														// check link flowNodeRefs from lane to intermediateCatchEvent
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		intermediateCatchEvent));

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
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		lane,
																		laneSet,
																		ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_70(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_126011 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_352767 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_315814 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_758723 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_758723 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		EventBasedGateway eventBasedGateway = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

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

			// bind object
			_TmpObject = outFlow.getTargetRef();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link sourceRef from outFlow to eventBasedGateway
			JavaSDM.ensure(eventBasedGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to ceFlow
			fujaba__Success = false;

			fujaba__IterProcessToCeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToCeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToCeFlow.next();

					// ensure correct type and really bound of object ceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					ceFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and ceFlow 
					JavaSDM.ensure(!outFlow.equals(ceFlow));

					// check link sourceRef from ceFlow to intermediateCatchEvent
					JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
							.getSourceRef()));

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
							// check isomorphic binding between objects inFlow and ceFlow 
							JavaSDM.ensure(!inFlow.equals(ceFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

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
									// iterate to-many link lanes from laneSet to lane
									fujaba__Success = false;

									fujaba__IterLaneSetToLane = new ArrayList(
											laneSet.getLanes()).iterator();

									while (fujaba__IterLaneSetToLane.hasNext()) {
										try {
											lane = (Lane) fujaba__IterLaneSetToLane
													.next();

											// check object lane is really bound
											JavaSDM.ensure(lane != null);
											// check link flowNodeRefs from lane to intermediateCatchEvent
											JavaSDM.ensure(lane
													.getFlowNodeRefs()
													.contains(
															intermediateCatchEvent));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_ceFlow_flowElements_126011 = ceFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
															.eContainer()
															: null;

													// check object __DEC_ceFlow_flowElements_126011 is really bound
													JavaSDM.ensure(__DEC_ceFlow_flowElements_126011 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_ceFlow_flowElements_126011
															.getFlowElements()
															.contains(ceFlow));

													// check isomorphic binding between objects __DEC_ceFlow_flowElements_126011 and process 
													JavaSDM.ensure(!__DEC_ceFlow_flowElements_126011
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
													__DEC_intermediateCatchEvent_flowElements_352767 = intermediateCatchEvent
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
															.eContainer()
															: null;

													// check object __DEC_intermediateCatchEvent_flowElements_352767 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_352767 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_352767
															.getFlowElements()
															.contains(
																	intermediateCatchEvent));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_352767 and process 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_352767
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
													__DEC_outFlow_flowElements_315814 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_315814 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_315814 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_315814
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_315814 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_315814
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from ceFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																ceFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_758723
													fujaba__Success = false;

													fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_758723 = new ArrayList(
															intermediateCatchEvent
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_758723
																	.hasNext()) {
														try {
															__DEC_intermediateCatchEvent_targetRef_758723 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_758723
																	.next();

															// check object __DEC_intermediateCatchEvent_targetRef_758723 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_758723 != null);
															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_758723 and ceFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_758723
																	.equals(ceFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_758723 and inFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_758723
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_758723 and outFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_758723
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
												// check object ceFlow is really bound
												JavaSDM.ensure(ceFlow != null);
												// check object eventBasedGateway is really bound
												JavaSDM.ensure(eventBasedGateway != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object intermediateCatchEvent is really bound
												JavaSDM.ensure(intermediateCatchEvent != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and ceFlow 
												JavaSDM.ensure(!inFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and ceFlow 
												JavaSDM.ensure(!outFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from ceFlow to process
												JavaSDM.ensure(process
														.equals(ceFlow
																.eContainer()));

												// check link flowElements from eventBasedGateway to process
												JavaSDM.ensure(process
														.equals(eventBasedGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from intermediateCatchEvent to process
												JavaSDM.ensure(process
														.equals(intermediateCatchEvent
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

												// check link sourceRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_sourceRef to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_sourceRef
																.getSrc()));

												// check link targetRef from inFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from outFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
														.getTargetRef()));

												// check link targetRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
														.getTargetRef())));

												// check link targetRef from inFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
														.getTargetRef())));

												// check link trg from _edge_sourceRef to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway
														.equals(_edge_sourceRef
																.getTrg()));

												// check link flowNodeRefs from lane to intermediateCatchEvent
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																intermediateCatchEvent));

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
																inFlow,
																eventBasedGateway,
																outFlow,
																intermediateCatchEvent,
																lane, laneSet,
																ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_71(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_749154 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_272409 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_492553 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_266235 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_266235 = null;
		Match match = null;
		Iterator fujaba__IterEventBasedGatewayTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterEventBasedGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

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
							// bind object
							_TmpObject = _edge_outgoing.getTrg();

							// ensure correct type and really bound of object outFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							outFlow = (SequenceFlow) _TmpObject;

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// check link sourceRef from outFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(outFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to ceFlow
							fujaba__Success = false;

							fujaba__IterProcessToCeFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToCeFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToCeFlow
											.next();

									// ensure correct type and really bound of object ceFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									ceFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects outFlow and ceFlow 
									JavaSDM.ensure(!outFlow.equals(ceFlow));

									// bind object
									_TmpObject = ceFlow.getSourceRef();

									// ensure correct type and really bound of object intermediateCatchEvent
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

									// check link flowElements from intermediateCatchEvent to process
									JavaSDM.ensure(process
											.equals(intermediateCatchEvent
													.eContainer()));

									// check link targetRef from outFlow to intermediateCatchEvent
									JavaSDM.ensure(intermediateCatchEvent
											.equals(outFlow.getTargetRef()));

									// check link flowNodeRefs from lane to intermediateCatchEvent
									JavaSDM.ensure(lane.getFlowNodeRefs()
											.contains(intermediateCatchEvent));

									// iterate to-many link targetRef from eventBasedGateway to inFlow
									fujaba__Success = false;

									fujaba__IterEventBasedGatewayToInFlow = new ArrayList(
											eventBasedGateway.getIncoming())
											.iterator();

									while (fujaba__IterEventBasedGatewayToInFlow
											.hasNext()) {
										try {
											inFlow = (SequenceFlow) fujaba__IterEventBasedGatewayToInFlow
													.next();

											// check object inFlow is really bound
											JavaSDM.ensure(inFlow != null);
											// check isomorphic binding between objects inFlow and ceFlow 
											JavaSDM.ensure(!inFlow
													.equals(ceFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link flowElements from inFlow to process
											JavaSDM.ensure(process
													.equals(inFlow.eContainer()));

											// iterate to-many link trg from eventBasedGateway to _edge_sourceRef
											fujaba__Success = false;

											fujaba__IterEventBasedGatewayTo_edge_sourceRef = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	eventBasedGateway,
																	EMoflonEdge.class,
																	"trg"))
													.iterator();

											while (fujaba__IterEventBasedGatewayTo_edge_sourceRef
													.hasNext()) {
												try {
													_edge_sourceRef = (EMoflonEdge) fujaba__IterEventBasedGatewayTo_edge_sourceRef
															.next();

													// check object _edge_sourceRef is really bound
													JavaSDM.ensure(_edge_sourceRef != null);
													// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
													JavaSDM.ensure(!_edge_sourceRef
															.equals(_edge_outgoing));

													// check link src from _edge_sourceRef to outFlow
													JavaSDM.ensure(outFlow
															.equals(_edge_sourceRef
																	.getSrc()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_ceFlow_flowElements_749154 = ceFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																	.eContainer()
																	: null;

															// check object __DEC_ceFlow_flowElements_749154 is really bound
															JavaSDM.ensure(__DEC_ceFlow_flowElements_749154 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_ceFlow_flowElements_749154
																	.getFlowElements()
																	.contains(
																			ceFlow));

															// check isomorphic binding between objects __DEC_ceFlow_flowElements_749154 and process 
															JavaSDM.ensure(!__DEC_ceFlow_flowElements_749154
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
															__DEC_intermediateCatchEvent_flowElements_272409 = intermediateCatchEvent
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																	.eContainer()
																	: null;

															// check object __DEC_intermediateCatchEvent_flowElements_272409 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_272409 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_272409
																	.getFlowElements()
																	.contains(
																			intermediateCatchEvent));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_272409 and process 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_272409
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
															__DEC_outFlow_flowElements_492553 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_492553 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_492553 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_492553
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_492553 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_492553
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from ceFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		ceFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_266235
															fujaba__Success = false;

															fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_266235 = new ArrayList(
																	intermediateCatchEvent
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_266235
																			.hasNext()) {
																try {
																	__DEC_intermediateCatchEvent_targetRef_266235 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_266235
																			.next();

																	// check object __DEC_intermediateCatchEvent_targetRef_266235 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_266235 != null);
																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_266235 and ceFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_266235
																			.equals(ceFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_266235 and inFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_266235
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_266235 and outFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_266235
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
														// check object ceFlow is really bound
														JavaSDM.ensure(ceFlow != null);
														// check object eventBasedGateway is really bound
														JavaSDM.ensure(eventBasedGateway != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object intermediateCatchEvent is really bound
														JavaSDM.ensure(intermediateCatchEvent != null);
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

														// check isomorphic binding between objects inFlow and ceFlow 
														JavaSDM.ensure(!inFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and ceFlow 
														JavaSDM.ensure(!outFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from ceFlow to process
														JavaSDM.ensure(process.equals(ceFlow
																.eContainer()));

														// check link flowElements from eventBasedGateway to process
														JavaSDM.ensure(process
																.equals(eventBasedGateway
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from intermediateCatchEvent to process
														JavaSDM.ensure(process
																.equals(intermediateCatchEvent
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

														// check link sourceRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
																.getSourceRef()));

														// check link sourceRef from outFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_outgoing to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway
																.equals(_edge_outgoing
																		.getSrc()));

														// check link src from _edge_sourceRef to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_sourceRef
																		.getSrc()));

														// check link targetRef from inFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from outFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
																.getTargetRef()));

														// check link targetRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
																.getTargetRef())));

														// check link targetRef from inFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
																.getTargetRef())));

														// check link trg from _edge_outgoing to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_outgoing
																		.getTrg()));

														// check link trg from _edge_sourceRef to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway
																.equals(_edge_sourceRef
																		.getTrg()));

														// check link flowNodeRefs from lane to intermediateCatchEvent
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		intermediateCatchEvent));

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
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		lane,
																		laneSet,
																		ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_883696 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_366172 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_96142 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_251252 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_251252 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		EventBasedGateway eventBasedGateway = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

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

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// bind object
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link targetRef from outFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(outFlow.getTargetRef()));

			// iterate to-many link flowElements from process to ceFlow
			fujaba__Success = false;

			fujaba__IterProcessToCeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToCeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToCeFlow.next();

					// ensure correct type and really bound of object ceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					ceFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and ceFlow 
					JavaSDM.ensure(!outFlow.equals(ceFlow));

					// check link sourceRef from ceFlow to intermediateCatchEvent
					JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
							.getSourceRef()));

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
							// check isomorphic binding between objects inFlow and ceFlow 
							JavaSDM.ensure(!inFlow.equals(ceFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

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
									// iterate to-many link lanes from laneSet to lane
									fujaba__Success = false;

									fujaba__IterLaneSetToLane = new ArrayList(
											laneSet.getLanes()).iterator();

									while (fujaba__IterLaneSetToLane.hasNext()) {
										try {
											lane = (Lane) fujaba__IterLaneSetToLane
													.next();

											// check object lane is really bound
											JavaSDM.ensure(lane != null);
											// check link flowNodeRefs from lane to intermediateCatchEvent
											JavaSDM.ensure(lane
													.getFlowNodeRefs()
													.contains(
															intermediateCatchEvent));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_ceFlow_flowElements_883696 = ceFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
															.eContainer()
															: null;

													// check object __DEC_ceFlow_flowElements_883696 is really bound
													JavaSDM.ensure(__DEC_ceFlow_flowElements_883696 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_ceFlow_flowElements_883696
															.getFlowElements()
															.contains(ceFlow));

													// check isomorphic binding between objects __DEC_ceFlow_flowElements_883696 and process 
													JavaSDM.ensure(!__DEC_ceFlow_flowElements_883696
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
													__DEC_intermediateCatchEvent_flowElements_366172 = intermediateCatchEvent
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
															.eContainer()
															: null;

													// check object __DEC_intermediateCatchEvent_flowElements_366172 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_366172 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_366172
															.getFlowElements()
															.contains(
																	intermediateCatchEvent));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_366172 and process 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_366172
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
													__DEC_outFlow_flowElements_96142 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_96142 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_96142 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_96142
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_96142 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_96142
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from ceFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																ceFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_251252
													fujaba__Success = false;

													fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_251252 = new ArrayList(
															intermediateCatchEvent
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_251252
																	.hasNext()) {
														try {
															__DEC_intermediateCatchEvent_targetRef_251252 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_251252
																	.next();

															// check object __DEC_intermediateCatchEvent_targetRef_251252 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_251252 != null);
															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_251252 and ceFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_251252
																	.equals(ceFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_251252 and inFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_251252
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_251252 and outFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_251252
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
												// check object ceFlow is really bound
												JavaSDM.ensure(ceFlow != null);
												// check object eventBasedGateway is really bound
												JavaSDM.ensure(eventBasedGateway != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object intermediateCatchEvent is really bound
												JavaSDM.ensure(intermediateCatchEvent != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and ceFlow 
												JavaSDM.ensure(!inFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and ceFlow 
												JavaSDM.ensure(!outFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from ceFlow to process
												JavaSDM.ensure(process
														.equals(ceFlow
																.eContainer()));

												// check link flowElements from eventBasedGateway to process
												JavaSDM.ensure(process
														.equals(eventBasedGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from intermediateCatchEvent to process
												JavaSDM.ensure(process
														.equals(intermediateCatchEvent
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

												// check link sourceRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_targetRef to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_targetRef
																.getSrc()));

												// check link targetRef from inFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from outFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
														.getTargetRef()));

												// check link targetRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
														.getTargetRef())));

												// check link targetRef from inFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
														.getTargetRef())));

												// check link trg from _edge_targetRef to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent
														.equals(_edge_targetRef
																.getTrg()));

												// check link flowNodeRefs from lane to intermediateCatchEvent
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																intermediateCatchEvent));

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
																inFlow,
																eventBasedGateway,
																outFlow,
																intermediateCatchEvent,
																lane, laneSet,
																ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_73(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_991735 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_768931 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_201413 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_493111 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_493111 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToCeFlow = null;
		SequenceFlow ceFlow = null;
		EventBasedGateway eventBasedGateway = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;

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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

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

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// bind object
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object eventBasedGateway
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			eventBasedGateway = (EventBasedGateway) _TmpObject;

			// check link flowElements from eventBasedGateway to process
			JavaSDM.ensure(process.equals(eventBasedGateway.eContainer()));

			// check link targetRef from outFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(outFlow.getTargetRef()));

			// iterate to-many link flowElements from process to ceFlow
			fujaba__Success = false;

			fujaba__IterProcessToCeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToCeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToCeFlow.next();

					// ensure correct type and really bound of object ceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					ceFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and ceFlow 
					JavaSDM.ensure(!outFlow.equals(ceFlow));

					// check link sourceRef from ceFlow to intermediateCatchEvent
					JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
							.getSourceRef()));

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
							// check isomorphic binding between objects inFlow and ceFlow 
							JavaSDM.ensure(!inFlow.equals(ceFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

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
									// iterate to-many link lanes from laneSet to lane
									fujaba__Success = false;

									fujaba__IterLaneSetToLane = new ArrayList(
											laneSet.getLanes()).iterator();

									while (fujaba__IterLaneSetToLane.hasNext()) {
										try {
											lane = (Lane) fujaba__IterLaneSetToLane
													.next();

											// check object lane is really bound
											JavaSDM.ensure(lane != null);
											// check link flowNodeRefs from lane to intermediateCatchEvent
											JavaSDM.ensure(lane
													.getFlowNodeRefs()
													.contains(
															intermediateCatchEvent));

											// iterate to-many link src from outFlow to _edge_targetRef
											fujaba__Success = false;

											fujaba__IterOutFlowTo_edge_targetRef = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

											while (fujaba__IterOutFlowTo_edge_targetRef
													.hasNext()) {
												try {
													_edge_targetRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_targetRef
															.next();

													// check object _edge_targetRef is really bound
													JavaSDM.ensure(_edge_targetRef != null);
													// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
													JavaSDM.ensure(!_edge_targetRef
															.equals(_edge_incoming));

													// check link trg from _edge_targetRef to intermediateCatchEvent
													JavaSDM.ensure(intermediateCatchEvent
															.equals(_edge_targetRef
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_ceFlow_flowElements_991735 = ceFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																	.eContainer()
																	: null;

															// check object __DEC_ceFlow_flowElements_991735 is really bound
															JavaSDM.ensure(__DEC_ceFlow_flowElements_991735 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_ceFlow_flowElements_991735
																	.getFlowElements()
																	.contains(
																			ceFlow));

															// check isomorphic binding between objects __DEC_ceFlow_flowElements_991735 and process 
															JavaSDM.ensure(!__DEC_ceFlow_flowElements_991735
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
															__DEC_intermediateCatchEvent_flowElements_768931 = intermediateCatchEvent
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																	.eContainer()
																	: null;

															// check object __DEC_intermediateCatchEvent_flowElements_768931 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_768931 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_768931
																	.getFlowElements()
																	.contains(
																			intermediateCatchEvent));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_768931 and process 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_768931
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
															__DEC_outFlow_flowElements_201413 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_201413 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_201413 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_201413
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_201413 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_201413
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from ceFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		ceFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_493111
															fujaba__Success = false;

															fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_493111 = new ArrayList(
																	intermediateCatchEvent
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_493111
																			.hasNext()) {
																try {
																	__DEC_intermediateCatchEvent_targetRef_493111 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_493111
																			.next();

																	// check object __DEC_intermediateCatchEvent_targetRef_493111 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_493111 != null);
																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_493111 and ceFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_493111
																			.equals(ceFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_493111 and inFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_493111
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_493111 and outFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_493111
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
														// check object ceFlow is really bound
														JavaSDM.ensure(ceFlow != null);
														// check object eventBasedGateway is really bound
														JavaSDM.ensure(eventBasedGateway != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object intermediateCatchEvent is really bound
														JavaSDM.ensure(intermediateCatchEvent != null);
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

														// check isomorphic binding between objects inFlow and ceFlow 
														JavaSDM.ensure(!inFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and ceFlow 
														JavaSDM.ensure(!outFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from ceFlow to process
														JavaSDM.ensure(process.equals(ceFlow
																.eContainer()));

														// check link flowElements from eventBasedGateway to process
														JavaSDM.ensure(process
																.equals(eventBasedGateway
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from intermediateCatchEvent to process
														JavaSDM.ensure(process
																.equals(intermediateCatchEvent
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

														// check link sourceRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
																.getSourceRef()));

														// check link sourceRef from outFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_incoming to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent
																.equals(_edge_incoming
																		.getSrc()));

														// check link src from _edge_targetRef to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_targetRef
																		.getSrc()));

														// check link targetRef from inFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from outFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
																.getTargetRef()));

														// check link targetRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
																.getTargetRef())));

														// check link targetRef from inFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
																.getTargetRef())));

														// check link trg from _edge_incoming to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_incoming
																		.getTrg()));

														// check link trg from _edge_targetRef to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent
																.equals(_edge_targetRef
																		.getTrg()));

														// check link flowNodeRefs from lane to intermediateCatchEvent
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		intermediateCatchEvent));

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
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		lane,
																		laneSet,
																		ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_74(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_619359 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_366721 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_20121 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_682823 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_682823 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		SequenceFlow ceFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;

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
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object ceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			ceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = ceFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) ceFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(ceFlow));

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// check link sourceRef from ceFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow.getSourceRef()));

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
					// check isomorphic binding between objects inFlow and ceFlow 
					JavaSDM.ensure(!inFlow.equals(ceFlow));

					// iterate to-many link flowElements from process to outFlow
					fujaba__Success = false;

					fujaba__IterProcessToOutFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToOutFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToOutFlow.next();

							// ensure correct type and really bound of object outFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							outFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and ceFlow 
							JavaSDM.ensure(!outFlow.equals(ceFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// bind object
							_TmpObject = outFlow.getSourceRef();

							// ensure correct type and really bound of object eventBasedGateway
							JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
							eventBasedGateway = (EventBasedGateway) _TmpObject;

							// check link flowElements from eventBasedGateway to process
							JavaSDM.ensure(process.equals(eventBasedGateway
									.eContainer()));

							// check link targetRef from inFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(inFlow
									.getTargetRef()));

							// check link targetRef from outFlow to intermediateCatchEvent
							JavaSDM.ensure(intermediateCatchEvent
									.equals(outFlow.getTargetRef()));

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

									while (fujaba__IterLaneSetToLane.hasNext()) {
										try {
											lane = (Lane) fujaba__IterLaneSetToLane
													.next();

											// check object lane is really bound
											JavaSDM.ensure(lane != null);
											// check link flowNodeRefs from lane to intermediateCatchEvent
											JavaSDM.ensure(lane
													.getFlowNodeRefs()
													.contains(
															intermediateCatchEvent));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_ceFlow_flowElements_619359 = ceFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
															.eContainer()
															: null;

													// check object __DEC_ceFlow_flowElements_619359 is really bound
													JavaSDM.ensure(__DEC_ceFlow_flowElements_619359 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_ceFlow_flowElements_619359
															.getFlowElements()
															.contains(ceFlow));

													// check isomorphic binding between objects __DEC_ceFlow_flowElements_619359 and process 
													JavaSDM.ensure(!__DEC_ceFlow_flowElements_619359
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
													__DEC_intermediateCatchEvent_flowElements_366721 = intermediateCatchEvent
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
															.eContainer()
															: null;

													// check object __DEC_intermediateCatchEvent_flowElements_366721 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_366721 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_366721
															.getFlowElements()
															.contains(
																	intermediateCatchEvent));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_366721 and process 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_366721
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
													__DEC_outFlow_flowElements_20121 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_20121 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_20121 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_20121
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_20121 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_20121
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from ceFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																ceFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_682823
													fujaba__Success = false;

													fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_682823 = new ArrayList(
															intermediateCatchEvent
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_682823
																	.hasNext()) {
														try {
															__DEC_intermediateCatchEvent_targetRef_682823 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_682823
																	.next();

															// check object __DEC_intermediateCatchEvent_targetRef_682823 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_682823 != null);
															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_682823 and ceFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_682823
																	.equals(ceFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_682823 and inFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_682823
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_682823 and outFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_682823
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
												// check object ceFlow is really bound
												JavaSDM.ensure(ceFlow != null);
												// check object eventBasedGateway is really bound
												JavaSDM.ensure(eventBasedGateway != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object intermediateCatchEvent is really bound
												JavaSDM.ensure(intermediateCatchEvent != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and ceFlow 
												JavaSDM.ensure(!inFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and ceFlow 
												JavaSDM.ensure(!outFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from ceFlow to process
												JavaSDM.ensure(process
														.equals(ceFlow
																.eContainer()));

												// check link flowElements from eventBasedGateway to process
												JavaSDM.ensure(process
														.equals(eventBasedGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from intermediateCatchEvent to process
												JavaSDM.ensure(process
														.equals(intermediateCatchEvent
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

												// check link sourceRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_sourceRef to ceFlow
												JavaSDM.ensure(ceFlow
														.equals(_edge_sourceRef
																.getSrc()));

												// check link targetRef from inFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from outFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
														.getTargetRef()));

												// check link targetRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
														.getTargetRef())));

												// check link targetRef from inFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
														.getTargetRef())));

												// check link trg from _edge_sourceRef to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent
														.equals(_edge_sourceRef
																.getTrg()));

												// check link flowNodeRefs from lane to intermediateCatchEvent
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																intermediateCatchEvent));

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
																inFlow,
																eventBasedGateway,
																outFlow,
																intermediateCatchEvent,
																lane, laneSet,
																ceFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_75(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_461127 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_538803 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_499300 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_187556 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_187556 = null;
		Match match = null;
		Iterator fujaba__IterCeFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterIntermediateCatchEventToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		SequenceFlow ceFlow = null;
		IntermediateCatchEvent intermediateCatchEvent = null;

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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object ceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			ceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = ceFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) ceFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(ceFlow));

			// check link flowElements from intermediateCatchEvent to process
			JavaSDM.ensure(process.equals(intermediateCatchEvent.eContainer()));

			// check link sourceRef from ceFlow to intermediateCatchEvent
			JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow.getSourceRef()));

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
					// check isomorphic binding between objects inFlow and ceFlow 
					JavaSDM.ensure(!inFlow.equals(ceFlow));

					// bind object
					_TmpObject = inFlow.getTargetRef();

					// ensure correct type and really bound of object eventBasedGateway
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					eventBasedGateway = (EventBasedGateway) _TmpObject;

					// check link flowElements from eventBasedGateway to process
					JavaSDM.ensure(process.equals(eventBasedGateway
							.eContainer()));

					// iterate to-many link flowElements from process to outFlow
					fujaba__Success = false;

					fujaba__IterProcessToOutFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToOutFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToOutFlow.next();

							// ensure correct type and really bound of object outFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							outFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and ceFlow 
							JavaSDM.ensure(!outFlow.equals(ceFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link sourceRef from outFlow to eventBasedGateway
							JavaSDM.ensure(eventBasedGateway.equals(outFlow
									.getSourceRef()));

							// check link targetRef from outFlow to intermediateCatchEvent
							JavaSDM.ensure(intermediateCatchEvent
									.equals(outFlow.getTargetRef()));

							// iterate to-many link flowNodeRefs from intermediateCatchEvent to lane
							fujaba__Success = false;

							fujaba__IterIntermediateCatchEventToLane = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													intermediateCatchEvent,
													Lane.class, "flowNodeRefs"))
									.iterator();

							while (fujaba__IterIntermediateCatchEventToLane
									.hasNext()) {
								try {
									lane = (Lane) fujaba__IterIntermediateCatchEventToLane
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

											// iterate to-many link src from ceFlow to _edge_sourceRef
											fujaba__Success = false;

											fujaba__IterCeFlowTo_edge_sourceRef = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	ceFlow,
																	EMoflonEdge.class,
																	"src"))
													.iterator();

											while (fujaba__IterCeFlowTo_edge_sourceRef
													.hasNext()) {
												try {
													_edge_sourceRef = (EMoflonEdge) fujaba__IterCeFlowTo_edge_sourceRef
															.next();

													// check object _edge_sourceRef is really bound
													JavaSDM.ensure(_edge_sourceRef != null);
													// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
													JavaSDM.ensure(!_edge_sourceRef
															.equals(_edge_outgoing));

													// check link trg from _edge_sourceRef to intermediateCatchEvent
													JavaSDM.ensure(intermediateCatchEvent
															.equals(_edge_sourceRef
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_ceFlow_flowElements_461127 = ceFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
																	.eContainer()
																	: null;

															// check object __DEC_ceFlow_flowElements_461127 is really bound
															JavaSDM.ensure(__DEC_ceFlow_flowElements_461127 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_ceFlow_flowElements_461127
																	.getFlowElements()
																	.contains(
																			ceFlow));

															// check isomorphic binding between objects __DEC_ceFlow_flowElements_461127 and process 
															JavaSDM.ensure(!__DEC_ceFlow_flowElements_461127
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
															__DEC_intermediateCatchEvent_flowElements_538803 = intermediateCatchEvent
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
																	.eContainer()
																	: null;

															// check object __DEC_intermediateCatchEvent_flowElements_538803 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_538803 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_538803
																	.getFlowElements()
																	.contains(
																			intermediateCatchEvent));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_538803 and process 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_538803
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
															__DEC_outFlow_flowElements_499300 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_499300 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_499300 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_499300
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_499300 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_499300
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from ceFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		ceFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_187556
															fujaba__Success = false;

															fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_187556 = new ArrayList(
																	intermediateCatchEvent
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_187556
																			.hasNext()) {
																try {
																	__DEC_intermediateCatchEvent_targetRef_187556 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_187556
																			.next();

																	// check object __DEC_intermediateCatchEvent_targetRef_187556 is really bound
																	JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_187556 != null);
																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_187556 and ceFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_187556
																			.equals(ceFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_187556 and inFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_187556
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_187556 and outFlow 
																	JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_187556
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
														// check object ceFlow is really bound
														JavaSDM.ensure(ceFlow != null);
														// check object eventBasedGateway is really bound
														JavaSDM.ensure(eventBasedGateway != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object intermediateCatchEvent is really bound
														JavaSDM.ensure(intermediateCatchEvent != null);
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

														// check isomorphic binding between objects inFlow and ceFlow 
														JavaSDM.ensure(!inFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and ceFlow 
														JavaSDM.ensure(!outFlow
																.equals(ceFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from ceFlow to process
														JavaSDM.ensure(process.equals(ceFlow
																.eContainer()));

														// check link flowElements from eventBasedGateway to process
														JavaSDM.ensure(process
																.equals(eventBasedGateway
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from intermediateCatchEvent to process
														JavaSDM.ensure(process
																.equals(intermediateCatchEvent
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

														// check link sourceRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
																.getSourceRef()));

														// check link sourceRef from outFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_outgoing to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent
																.equals(_edge_outgoing
																		.getSrc()));

														// check link src from _edge_sourceRef to ceFlow
														JavaSDM.ensure(ceFlow
																.equals(_edge_sourceRef
																		.getSrc()));

														// check link targetRef from inFlow to eventBasedGateway
														JavaSDM.ensure(eventBasedGateway.equals(inFlow
																.getTargetRef()));

														// check link targetRef from outFlow to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
																.getTargetRef()));

														// check link targetRef from ceFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
																.getTargetRef())));

														// check link targetRef from inFlow to intermediateCatchEvent
														JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
																.getTargetRef())));

														// check link trg from _edge_outgoing to ceFlow
														JavaSDM.ensure(ceFlow
																.equals(_edge_outgoing
																		.getTrg()));

														// check link trg from _edge_sourceRef to intermediateCatchEvent
														JavaSDM.ensure(intermediateCatchEvent
																.equals(_edge_sourceRef
																		.getTrg()));

														// check link flowNodeRefs from lane to intermediateCatchEvent
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		intermediateCatchEvent));

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
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		lane,
																		laneSet,
																		ceFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_26(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_141509 = null;
		NormalStep __DEC_alt_stepAlternative_433319 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_733416 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_733416 = null;
		Match match = null;
		Iterator fujaba__IterFlowToNormalStep = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		Iterator fujaba__IterAlternativeFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow alternativeFlow = null;
		UseCase useCase = null;

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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;

			// check link flows from alternativeFlow to useCase
			JavaSDM.ensure(useCase.equals(alternativeFlow.eContainer()));

			// iterate to-many link ref from alternativeFlow to alt
			fujaba__Success = false;

			fujaba__IterAlternativeFlowToAlt = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							alternativeFlow, AlternativeFlowAlternative.class,
							"ref")).iterator();

			while (fujaba__IterAlternativeFlowToAlt.hasNext()) {
				try {
					alt = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowToAlt
							.next();

					// check object alt is really bound
					JavaSDM.ensure(alt != null);
					// iterate to-many link flows from useCase to flow
					fujaba__Success = false;

					fujaba__IterUseCaseToFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToFlow.hasNext()) {
						try {
							flow = (Flow) fujaba__IterUseCaseToFlow.next();

							// check object flow is really bound
							JavaSDM.ensure(flow != null);
							// check isomorphic binding between objects flow and alternativeFlow 
							JavaSDM.ensure(!flow.equals(alternativeFlow));

							// iterate to-many link steps from flow to normalStep
							fujaba__Success = false;

							fujaba__IterFlowToNormalStep = new ArrayList(
									flow.getSteps()).iterator();

							while (fujaba__IterFlowToNormalStep.hasNext()) {
								try {
									_TmpObject = fujaba__IterFlowToNormalStep
											.next();

									// ensure correct type and really bound of object normalStep
									JavaSDM.ensure(_TmpObject instanceof NormalStep);
									normalStep = (NormalStep) _TmpObject;
									// check link stepAlternative from alt to normalStep
									JavaSDM.ensure(normalStep.equals(alt
											.eContainer()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_alternativeFlow_flows_141509 = alternativeFlow
													.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
													.eContainer() : null;

											// check object __DEC_alternativeFlow_flows_141509 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_flows_141509 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alternativeFlow_flows_141509
													.getFlows().contains(
															alternativeFlow));

											// check isomorphic binding between objects __DEC_alternativeFlow_flows_141509 and useCase 
											JavaSDM.ensure(!__DEC_alternativeFlow_flows_141509
													.equals(useCase));

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
											__DEC_alt_stepAlternative_433319 = alt
													.eContainer() instanceof NormalStep ? (NormalStep) alt
													.eContainer() : null;

											// check object __DEC_alt_stepAlternative_433319 is really bound
											JavaSDM.ensure(__DEC_alt_stepAlternative_433319 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_alt_stepAlternative_433319
													.getStepAlternative()
													.contains(alt));

											// check isomorphic binding between objects __DEC_alt_stepAlternative_433319 and normalStep 
											JavaSDM.ensure(!__DEC_alt_stepAlternative_433319
													.equals(normalStep));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_733416
											fujaba__Success = false;

											fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_733416 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	alternativeFlow,
																	AlternativeFlowAlternative.class,
																	"ref"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_733416
															.hasNext()) {
												try {
													__DEC_alternativeFlow_ref_733416 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_733416
															.next();

													// check object __DEC_alternativeFlow_ref_733416 is really bound
													JavaSDM.ensure(__DEC_alternativeFlow_ref_733416 != null);
													// check isomorphic binding between objects __DEC_alternativeFlow_ref_733416 and alt 
													JavaSDM.ensure(!__DEC_alternativeFlow_ref_733416
															.equals(alt));

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

										// check object _edge_flows is really bound
										JavaSDM.ensure(_edge_flows != null);
										// check object alt is really bound
										JavaSDM.ensure(alt != null);
										// check object alternativeFlow is really bound
										JavaSDM.ensure(alternativeFlow != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object useCase is really bound
										JavaSDM.ensure(useCase != null);
										// check isomorphic binding between objects flow and alternativeFlow 
										JavaSDM.ensure(!flow
												.equals(alternativeFlow));

										// check link ref from alt to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(alt.getRef()));

										// check link flows from alternativeFlow to useCase
										JavaSDM.ensure(useCase
												.equals(alternativeFlow
														.eContainer()));

										// check link flows from flow to useCase
										JavaSDM.ensure(useCase.equals(flow
												.eContainer()));

										// check link src from _edge_flows to useCase
										JavaSDM.ensure(useCase
												.equals(_edge_flows.getSrc()));

										// check link stepAlternative from alt to normalStep
										JavaSDM.ensure(normalStep.equals(alt
												.eContainer()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link trg from _edge_flows to alternativeFlow
										JavaSDM.ensure(alternativeFlow
												.equals(_edge_flows.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_BWD(match,
														useCase, flow,
														normalStep, alt,
														alternativeFlow);
										if (fujaba__Success) {
											// statement node 'Ensure that the correct types of elements are matched'
											fujaba__Success = this
													.checkTypes_BWD(match);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_27(
			EMoflonEdge _edge_stepAlternative) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_187484 = null;
		NormalStep __DEC_alt_stepAlternative_798353 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_261160 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_261160 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToAlternativeFlow = null;
		AlternativeFlow alternativeFlow = null;
		UseCase useCase = null;
		Flow flow = null;
		AlternativeFlowAlternative alt = null;
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

			// check object _edge_stepAlternative is really bound
			JavaSDM.ensure(_edge_stepAlternative != null);
			// bind object
			_TmpObject = _edge_stepAlternative.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			_TmpObject = _edge_stepAlternative.getTrg();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// check link stepAlternative from alt to normalStep
			JavaSDM.ensure(normalStep.equals(alt.eContainer()));

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// bind object
			useCase = flow.eContainer() instanceof UseCase ? (UseCase) flow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(flow));

			// iterate to-many link flows from useCase to alternativeFlow
			fujaba__Success = false;

			fujaba__IterUseCaseToAlternativeFlow = new ArrayList(
					useCase.getFlows()).iterator();

			while (fujaba__IterUseCaseToAlternativeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterUseCaseToAlternativeFlow.next();

					// ensure correct type and really bound of object alternativeFlow
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
					alternativeFlow = (AlternativeFlow) _TmpObject;
					// check isomorphic binding between objects flow and alternativeFlow 
					JavaSDM.ensure(!flow.equals(alternativeFlow));

					// check link ref from alt to alternativeFlow
					JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_alternativeFlow_flows_187484 = alternativeFlow
									.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
									.eContainer() : null;

							// check object __DEC_alternativeFlow_flows_187484 is really bound
							JavaSDM.ensure(__DEC_alternativeFlow_flows_187484 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alternativeFlow_flows_187484
									.getFlows().contains(alternativeFlow));

							// check isomorphic binding between objects __DEC_alternativeFlow_flows_187484 and useCase 
							JavaSDM.ensure(!__DEC_alternativeFlow_flows_187484
									.equals(useCase));

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
							__DEC_alt_stepAlternative_798353 = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
									.eContainer() : null;

							// check object __DEC_alt_stepAlternative_798353 is really bound
							JavaSDM.ensure(__DEC_alt_stepAlternative_798353 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_alt_stepAlternative_798353
									.getStepAlternative().contains(alt));

							// check isomorphic binding between objects __DEC_alt_stepAlternative_798353 and normalStep 
							JavaSDM.ensure(!__DEC_alt_stepAlternative_798353
									.equals(normalStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_261160
							fujaba__Success = false;

							fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_261160 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													alternativeFlow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_261160
											.hasNext()) {
								try {
									__DEC_alternativeFlow_ref_261160 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_261160
											.next();

									// check object __DEC_alternativeFlow_ref_261160 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_ref_261160 != null);
									// check isomorphic binding between objects __DEC_alternativeFlow_ref_261160 and alt 
									JavaSDM.ensure(!__DEC_alternativeFlow_ref_261160
											.equals(alt));

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

						// check object _edge_stepAlternative is really bound
						JavaSDM.ensure(_edge_stepAlternative != null);
						// check object alt is really bound
						JavaSDM.ensure(alt != null);
						// check object alternativeFlow is really bound
						JavaSDM.ensure(alternativeFlow != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check isomorphic binding between objects flow and alternativeFlow 
						JavaSDM.ensure(!flow.equals(alternativeFlow));

						// check link ref from alt to alternativeFlow
						JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

						// check link flows from alternativeFlow to useCase
						JavaSDM.ensure(useCase.equals(alternativeFlow
								.eContainer()));

						// check link flows from flow to useCase
						JavaSDM.ensure(useCase.equals(flow.eContainer()));

						// check link src from _edge_stepAlternative to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_stepAlternative
								.getSrc()));

						// check link stepAlternative from alt to normalStep
						JavaSDM.ensure(normalStep.equals(alt.eContainer()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_stepAlternative to alt
						JavaSDM.ensure(alt.equals(_edge_stepAlternative
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this
								.isAppropriate_BWD(match, useCase, flow,
										normalStep, alt, alternativeFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(
			EMoflonEdge _edge_ref) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_alternativeFlow_flows_981483 = null;
		NormalStep __DEC_alt_stepAlternative_399257 = null;
		Iterator fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_792971 = null;
		AlternativeFlowAlternative __DEC_alternativeFlow_ref_792971 = null;
		Match match = null;
		Iterator fujaba__IterFlowToNormalStep = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterUseCaseToFlow = null;
		Flow flow = null;
		UseCase useCase = null;
		AlternativeFlow alternativeFlow = null;
		AlternativeFlowAlternative alt = null;

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

			// check object _edge_ref is really bound
			JavaSDM.ensure(_edge_ref != null);
			// bind object
			_TmpObject = _edge_ref.getSrc();

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;

			// bind object
			_TmpObject = _edge_ref.getTrg();

			// ensure correct type and really bound of object alternativeFlow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			alternativeFlow = (AlternativeFlow) _TmpObject;

			// check link ref from alt to alternativeFlow
			JavaSDM.ensure(alternativeFlow.equals(alt.getRef()));

			// bind object
			useCase = alternativeFlow.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
					.eContainer() : null;

			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);

			// check if contained via correct reference
			JavaSDM.ensure(useCase.getFlows().contains(alternativeFlow));

			// iterate to-many link flows from useCase to flow
			fujaba__Success = false;

			fujaba__IterUseCaseToFlow = new ArrayList(useCase.getFlows())
					.iterator();

			while (fujaba__IterUseCaseToFlow.hasNext()) {
				try {
					flow = (Flow) fujaba__IterUseCaseToFlow.next();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);
					// check isomorphic binding between objects flow and alternativeFlow 
					JavaSDM.ensure(!flow.equals(alternativeFlow));

					// iterate to-many link steps from flow to normalStep
					fujaba__Success = false;

					fujaba__IterFlowToNormalStep = new ArrayList(
							flow.getSteps()).iterator();

					while (fujaba__IterFlowToNormalStep.hasNext()) {
						try {
							_TmpObject = fujaba__IterFlowToNormalStep.next();

							// ensure correct type and really bound of object normalStep
							JavaSDM.ensure(_TmpObject instanceof NormalStep);
							normalStep = (NormalStep) _TmpObject;
							// check link stepAlternative from alt to normalStep
							JavaSDM.ensure(normalStep.equals(alt.eContainer()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_alternativeFlow_flows_981483 = alternativeFlow
											.eContainer() instanceof UseCase ? (UseCase) alternativeFlow
											.eContainer() : null;

									// check object __DEC_alternativeFlow_flows_981483 is really bound
									JavaSDM.ensure(__DEC_alternativeFlow_flows_981483 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alternativeFlow_flows_981483
											.getFlows().contains(
													alternativeFlow));

									// check isomorphic binding between objects __DEC_alternativeFlow_flows_981483 and useCase 
									JavaSDM.ensure(!__DEC_alternativeFlow_flows_981483
											.equals(useCase));

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
									__DEC_alt_stepAlternative_399257 = alt
											.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object __DEC_alt_stepAlternative_399257 is really bound
									JavaSDM.ensure(__DEC_alt_stepAlternative_399257 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_alt_stepAlternative_399257
											.getStepAlternative().contains(alt));

									// check isomorphic binding between objects __DEC_alt_stepAlternative_399257 and normalStep 
									JavaSDM.ensure(!__DEC_alt_stepAlternative_399257
											.equals(normalStep));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link ref from alternativeFlow to __DEC_alternativeFlow_ref_792971
									fujaba__Success = false;

									fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_792971 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															alternativeFlow,
															AlternativeFlowAlternative.class,
															"ref")).iterator();

									while (!(fujaba__Success)
											&& fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_792971
													.hasNext()) {
										try {
											__DEC_alternativeFlow_ref_792971 = (AlternativeFlowAlternative) fujaba__IterAlternativeFlowTo__DEC_alternativeFlow_ref_792971
													.next();

											// check object __DEC_alternativeFlow_ref_792971 is really bound
											JavaSDM.ensure(__DEC_alternativeFlow_ref_792971 != null);
											// check isomorphic binding between objects __DEC_alternativeFlow_ref_792971 and alt 
											JavaSDM.ensure(!__DEC_alternativeFlow_ref_792971
													.equals(alt));

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

								// check object _edge_ref is really bound
								JavaSDM.ensure(_edge_ref != null);
								// check object alt is really bound
								JavaSDM.ensure(alt != null);
								// check object alternativeFlow is really bound
								JavaSDM.ensure(alternativeFlow != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object normalStep is really bound
								JavaSDM.ensure(normalStep != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check isomorphic binding between objects flow and alternativeFlow 
								JavaSDM.ensure(!flow.equals(alternativeFlow));

								// check link ref from alt to alternativeFlow
								JavaSDM.ensure(alternativeFlow.equals(alt
										.getRef()));

								// check link flows from alternativeFlow to useCase
								JavaSDM.ensure(useCase.equals(alternativeFlow
										.eContainer()));

								// check link flows from flow to useCase
								JavaSDM.ensure(useCase.equals(flow.eContainer()));

								// check link src from _edge_ref to alt
								JavaSDM.ensure(alt.equals(_edge_ref.getSrc()));

								// check link stepAlternative from alt to normalStep
								JavaSDM.ensure(normalStep.equals(alt
										.eContainer()));

								// check link steps from normalStep to flow
								JavaSDM.ensure(flow.equals(normalStep
										.eContainer()));

								// check link trg from _edge_ref to alternativeFlow
								JavaSDM.ensure(alternativeFlow.equals(_edge_ref
										.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										useCase, flow, normalStep, alt,
										alternativeFlow);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_76(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_ceFlow_flowElements_302187 = null;
		FlowElementsContainer __DEC_intermediateCatchEvent_flowElements_40451 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_813672 = null;
		Iterator fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_676536 = null;
		SequenceFlow __DEC_intermediateCatchEvent_targetRef_676536 = null;
		Match match = null;
		Iterator fujaba__IterIntermediateCatchEventToOutFlow = null;
		SequenceFlow outFlow = null;
		EventBasedGateway eventBasedGateway = null;
		Iterator fujaba__IterIntermediateCatchEventToCeFlow = null;
		SequenceFlow ceFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		IntermediateCatchEvent intermediateCatchEvent = null;
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

			// ensure correct type and really bound of object intermediateCatchEvent
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			intermediateCatchEvent = (IntermediateCatchEvent) _TmpObject;

			// bind object
			_TmpObject = intermediateCatchEvent.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) intermediateCatchEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(
					intermediateCatchEvent));

			// check link flowNodeRefs from lane to intermediateCatchEvent
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(
					intermediateCatchEvent));

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

							// iterate to-many link sourceRef from intermediateCatchEvent to ceFlow
							fujaba__Success = false;

							fujaba__IterIntermediateCatchEventToCeFlow = new ArrayList(
									intermediateCatchEvent.getOutgoing())
									.iterator();

							while (fujaba__IterIntermediateCatchEventToCeFlow
									.hasNext()) {
								try {
									ceFlow = (SequenceFlow) fujaba__IterIntermediateCatchEventToCeFlow
											.next();

									// check object ceFlow is really bound
									JavaSDM.ensure(ceFlow != null);
									// check isomorphic binding between objects inFlow and ceFlow 
									JavaSDM.ensure(!inFlow.equals(ceFlow));

									// check link flowElements from ceFlow to process
									JavaSDM.ensure(process.equals(ceFlow
											.eContainer()));

									// bind object
									_TmpObject = inFlow.getTargetRef();

									// ensure correct type and really bound of object eventBasedGateway
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									eventBasedGateway = (EventBasedGateway) _TmpObject;

									// check link flowElements from eventBasedGateway to process
									JavaSDM.ensure(process
											.equals(eventBasedGateway
													.eContainer()));

									// iterate to-many link targetRef from intermediateCatchEvent to outFlow
									fujaba__Success = false;

									fujaba__IterIntermediateCatchEventToOutFlow = new ArrayList(
											intermediateCatchEvent
													.getIncoming()).iterator();

									while (fujaba__IterIntermediateCatchEventToOutFlow
											.hasNext()) {
										try {
											outFlow = (SequenceFlow) fujaba__IterIntermediateCatchEventToOutFlow
													.next();

											// check object outFlow is really bound
											JavaSDM.ensure(outFlow != null);
											// check isomorphic binding between objects outFlow and ceFlow 
											JavaSDM.ensure(!outFlow
													.equals(ceFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

											// check link flowElements from outFlow to process
											JavaSDM.ensure(process
													.equals(outFlow
															.eContainer()));

											// check link sourceRef from outFlow to eventBasedGateway
											JavaSDM.ensure(eventBasedGateway
													.equals(outFlow
															.getSourceRef()));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_ceFlow_flowElements_302187 = ceFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) ceFlow
															.eContainer()
															: null;

													// check object __DEC_ceFlow_flowElements_302187 is really bound
													JavaSDM.ensure(__DEC_ceFlow_flowElements_302187 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_ceFlow_flowElements_302187
															.getFlowElements()
															.contains(ceFlow));

													// check isomorphic binding between objects __DEC_ceFlow_flowElements_302187 and process 
													JavaSDM.ensure(!__DEC_ceFlow_flowElements_302187
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
													__DEC_intermediateCatchEvent_flowElements_40451 = intermediateCatchEvent
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) intermediateCatchEvent
															.eContainer()
															: null;

													// check object __DEC_intermediateCatchEvent_flowElements_40451 is really bound
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_40451 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_intermediateCatchEvent_flowElements_40451
															.getFlowElements()
															.contains(
																	intermediateCatchEvent));

													// check isomorphic binding between objects __DEC_intermediateCatchEvent_flowElements_40451 and process 
													JavaSDM.ensure(!__DEC_intermediateCatchEvent_flowElements_40451
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
													__DEC_outFlow_flowElements_813672 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_813672 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_813672 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_813672
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_813672 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_813672
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from ceFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																ceFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link targetRef from intermediateCatchEvent to __DEC_intermediateCatchEvent_targetRef_676536
													fujaba__Success = false;

													fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_676536 = new ArrayList(
															intermediateCatchEvent
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_676536
																	.hasNext()) {
														try {
															__DEC_intermediateCatchEvent_targetRef_676536 = (SequenceFlow) fujaba__IterIntermediateCatchEventTo__DEC_intermediateCatchEvent_targetRef_676536
																	.next();

															// check object __DEC_intermediateCatchEvent_targetRef_676536 is really bound
															JavaSDM.ensure(__DEC_intermediateCatchEvent_targetRef_676536 != null);
															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_676536 and ceFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_676536
																	.equals(ceFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_676536 and inFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_676536
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_intermediateCatchEvent_targetRef_676536 and outFlow 
															JavaSDM.ensure(!__DEC_intermediateCatchEvent_targetRef_676536
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
												// check object ceFlow is really bound
												JavaSDM.ensure(ceFlow != null);
												// check object eventBasedGateway is really bound
												JavaSDM.ensure(eventBasedGateway != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object intermediateCatchEvent is really bound
												JavaSDM.ensure(intermediateCatchEvent != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and ceFlow 
												JavaSDM.ensure(!inFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and ceFlow 
												JavaSDM.ensure(!outFlow
														.equals(ceFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from ceFlow to process
												JavaSDM.ensure(process
														.equals(ceFlow
																.eContainer()));

												// check link flowElements from eventBasedGateway to process
												JavaSDM.ensure(process
														.equals(eventBasedGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from intermediateCatchEvent to process
												JavaSDM.ensure(process
														.equals(intermediateCatchEvent
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

												// check link sourceRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(ceFlow
														.getSourceRef()));

												// check link sourceRef from outFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_flowNodeRefs to lane
												JavaSDM.ensure(lane
														.equals(_edge_flowNodeRefs
																.getSrc()));

												// check link targetRef from inFlow to eventBasedGateway
												JavaSDM.ensure(eventBasedGateway.equals(inFlow
														.getTargetRef()));

												// check link targetRef from outFlow to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent.equals(outFlow
														.getTargetRef()));

												// check link targetRef from ceFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(ceFlow
														.getTargetRef())));

												// check link targetRef from inFlow to intermediateCatchEvent
												JavaSDM.ensure(!(intermediateCatchEvent.equals(inFlow
														.getTargetRef())));

												// check link trg from _edge_flowNodeRefs to intermediateCatchEvent
												JavaSDM.ensure(intermediateCatchEvent
														.equals(_edge_flowNodeRefs
																.getTrg()));

												// check link flowNodeRefs from lane to intermediateCatchEvent
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																intermediateCatchEvent));

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
																inFlow,
																eventBasedGateway,
																outFlow,
																intermediateCatchEvent,
																lane, laneSet,
																ceFlow);
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
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_LANE_LANESET_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(Lane) arguments.get(6), (LaneSet) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_LANE_LANESET_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(Lane) arguments.get(6), (LaneSet) arguments.get(7),
					(SequenceFlow) arguments.get(8));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_LANE_LANESET_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(Lane) arguments.get(6), (LaneSet) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_LANE_LANESET_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(IntermediateCatchEvent) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(NormalStep) arguments.get(10),
					(FlowNodeToStep) arguments.get(11),
					(Lane) arguments.get(12), (LaneSet) arguments.get(13),
					(SequenceFlow) arguments.get(14));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(UseCase) arguments.get(4),
					(ProcessToUseCase) arguments.get(5),
					(Flow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(AlternativeFlowAlternative) arguments.get(10),
					(AlternativeFlow) arguments.get(11),
					(Lane) arguments.get(12), (LaneSet) arguments.get(13));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_67__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_67((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_68__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_68((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_69__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_69((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_70__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_70((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_71((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_73__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_73((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_74__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_74((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_75((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_26((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_27((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_76((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CatchEventAfterEBGToStepRuleImpl
