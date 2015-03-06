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

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterEvGwRule;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
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
 * An implementation of the model object '<em><b>User Task To Step After Ev Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserTaskToStepAfterEvGwRuleImpl extends AbstractRuleImpl implements
		UserTaskToStepAfterEvGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTaskToStepAfterEvGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserTaskToStepAfterEvGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __task_incoming_inFlow = null;
		EMoflonEdge __task_outgoing_outFlow = null;
		EMoflonEdge __inFlow_targetRef_task = null;
		EMoflonEdge __outFlow_sourceRef_task = null;
		EMoflonEdge __process_flowElements_task = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __flowNode_incoming_iceInFlow = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		EMoflonEdge __evGw_outgoing_iceInFlow = null;
		EMoflonEdge __process_flowElements_flowNode = null;
		EMoflonEdge __iceInFlow_targetRef_flowNode = null;
		EMoflonEdge __iceInFlow_sourceRef_evGw = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object evGw is really bound
			JavaSDM.ensure(evGw != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object iceInFlow is really bound
			JavaSDM.ensure(iceInFlow != null);
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
			// check object task is really bound
			JavaSDM.ensure(task != null);
			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and iceInFlow 
			JavaSDM.ensure(!outFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, flowNode,
					iceInFlow, evGw, lane, task, inFlow, process, outFlow,
					laneSet));

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

				// check object evGw is really bound
				JavaSDM.ensure(evGw != null);
				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object iceInFlow is really bound
				JavaSDM.ensure(iceInFlow != null);
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
				// check object task is really bound
				JavaSDM.ensure(task != null);
				// check isomorphic binding between objects inFlow and iceInFlow 
				JavaSDM.ensure(!inFlow.equals(iceInFlow));

				// check isomorphic binding between objects outFlow and iceInFlow 
				JavaSDM.ensure(!outFlow.equals(iceInFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __task_incoming_inFlow
				__task_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __task_outgoing_outFlow
				__task_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_task
				__inFlow_targetRef_task = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_task
				__outFlow_sourceRef_task = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_task
				__process_flowElements_task = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __inFlow_targetRef_task
				__inFlow_targetRef_task.setName("targetRef");
				// assign attribute __task_incoming_inFlow
				__task_incoming_inFlow.setName("incoming");
				// assign attribute __process_flowElements_task
				__process_flowElements_task.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __outFlow_sourceRef_task
				__outFlow_sourceRef_task.setName("sourceRef");
				// assign attribute __task_outgoing_outFlow
				__task_outgoing_outFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__task_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__task_outgoing_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_task, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_task, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_task, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						task, "toBeTranslatedNodes");

				// create link
				__inFlow_targetRef_task.setTrg(task);

				// create link
				__task_outgoing_outFlow.setSrc(task);

				// create link
				__process_flowElements_task.setTrg(task);

				// create link
				__task_incoming_inFlow.setSrc(task);

				// create link
				__outFlow_sourceRef_task.setTrg(task);

				// create link
				__inFlow_targetRef_task.setSrc(inFlow);

				// create link
				__task_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_task.setSrc(process);

				// create link
				__task_outgoing_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_task.setSrc(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object evGw is really bound
				JavaSDM.ensure(evGw != null);
				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object iceInFlow is really bound
				JavaSDM.ensure(iceInFlow != null);
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
				// check object task is really bound
				JavaSDM.ensure(task != null);
				// check isomorphic binding between objects inFlow and iceInFlow 
				JavaSDM.ensure(!inFlow.equals(iceInFlow));

				// check isomorphic binding between objects outFlow and iceInFlow 
				JavaSDM.ensure(!outFlow.equals(iceInFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flowNode_incoming_iceInFlow
				__flowNode_incoming_iceInFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flowNode_outgoing_inFlow
				__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_sourceRef_flowNode
				__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __evGw_outgoing_iceInFlow
				__evGw_outgoing_iceInFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_flowNode
				__process_flowElements_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __iceInFlow_targetRef_flowNode
				__iceInFlow_targetRef_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __iceInFlow_sourceRef_evGw
				__iceInFlow_sourceRef_evGw = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __iceInFlow_targetRef_flowNode
				__iceInFlow_targetRef_flowNode.setName("targetRef");
				// assign attribute __flowNode_incoming_iceInFlow
				__flowNode_incoming_iceInFlow.setName("incoming");
				// assign attribute __iceInFlow_sourceRef_evGw
				__iceInFlow_sourceRef_evGw.setName("sourceRef");
				// assign attribute __evGw_outgoing_iceInFlow
				__evGw_outgoing_iceInFlow.setName("outgoing");
				// assign attribute __process_flowElements_flowNode
				__process_flowElements_flowNode.setName("flowElements");
				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");
				// assign attribute __inFlow_sourceRef_flowNode
				__inFlow_sourceRef_flowNode.setName("sourceRef");
				// assign attribute __flowNode_outgoing_inFlow
				__flowNode_outgoing_inFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						iceInFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flowNode_incoming_iceInFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flowNode_outgoing_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_sourceRef_flowNode, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__evGw_outgoing_iceInFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_flowNode, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__iceInFlow_targetRef_flowNode, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__iceInFlow_sourceRef_evGw, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						evGw, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flowNode, "contextNodes");

				// create link
				__inFlow_sourceRef_flowNode.setTrg(flowNode);

				// create link
				__process_flowElements_flowNode.setTrg(flowNode);

				// create link
				__iceInFlow_targetRef_flowNode.setTrg(flowNode);

				// create link
				__flowNode_outgoing_inFlow.setSrc(flowNode);

				// create link
				__flowNode_incoming_iceInFlow.setSrc(flowNode);

				// create link
				__flowNode_incoming_iceInFlow.setTrg(iceInFlow);

				// create link
				__evGw_outgoing_iceInFlow.setTrg(iceInFlow);

				// create link
				__iceInFlow_sourceRef_evGw.setSrc(iceInFlow);

				// create link
				__iceInFlow_targetRef_flowNode.setSrc(iceInFlow);

				// create link
				__iceInFlow_sourceRef_evGw.setTrg(evGw);

				// create link
				__evGw_outgoing_iceInFlow.setSrc(evGw);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__inFlow_sourceRef_flowNode.setSrc(inFlow);

				// create link
				__flowNode_outgoing_inFlow.setTrg(inFlow);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_flowNode.setSrc(process);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, flowNode, iceInFlow, evGw,
					lane, task, inFlow, process, outFlow, laneSet);
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
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		EventBasedGateway evGw = null;
		IntermediateCatchEvent flowNode = null;
		SequenceFlow iceInFlow = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		UserTask task = null;
		EMoflonEdge __iceInFlow_targetRef_flowNode = null;
		EMoflonEdge __process_flowElements_flowNode = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __flowNode_incoming_iceInFlow = null;
		EMoflonEdge __evGw_outgoing_iceInFlow = null;
		EMoflonEdge __iceInFlow_sourceRef_evGw = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __laneToActor_source_lane = null;
		EMoflonEdge __task_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_task = null;
		EMoflonEdge __task_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_task = null;
		EMoflonEdge __inFlow_targetRef_task = null;
		EMoflonEdge __laneToActor_target_actor = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterLaneToLaneToActor = null;
		LaneToActor laneToActor = null;
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
			ruleresult.setRule("UserTaskToStepAfterEvGwRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("evGw"));

			// ensure correct type and really bound of object evGw
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			evGw = (EventBasedGateway) _TmpObject;
			_TmpObject = (match.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			flowNode = (IntermediateCatchEvent) _TmpObject;
			_TmpObject = (match.getObject("iceInFlow"));

			// ensure correct type and really bound of object iceInFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			iceInFlow = (SequenceFlow) _TmpObject;
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
			_TmpObject = (match.getObject("task"));

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and iceInFlow 
			JavaSDM.ensure(!outFlow.equals(iceInFlow));

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

					// iterate to-many link source from lane to laneToActor
					fujaba__Success = false;

					fujaba__IterLaneToLaneToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(lane,
											LaneToActor.class, "source"))
							.iterator();

					while (fujaba__IterLaneToLaneToActor.hasNext()) {
						try {
							laneToActor = (LaneToActor) fujaba__IterLaneToLaneToActor
									.next();

							// check object laneToActor is really bound
							JavaSDM.ensure(laneToActor != null);
							// bind object
							actor = laneToActor.getTarget();

							// check object actor is really bound
							JavaSDM.ensure(actor != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object evGw is really bound
								JavaSDM.ensure(evGw != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object flowNode is really bound
								JavaSDM.ensure(flowNode != null);
								// check object iceInFlow is really bound
								JavaSDM.ensure(iceInFlow != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object laneToActor is really bound
								JavaSDM.ensure(laneToActor != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object task is really bound
								JavaSDM.ensure(task != null);
								// check isomorphic binding between objects inFlow and iceInFlow 
								JavaSDM.ensure(!inFlow.equals(iceInFlow));

								// check isomorphic binding between objects outFlow and iceInFlow 
								JavaSDM.ensure(!outFlow.equals(iceInFlow));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from flowNode to process
								JavaSDM.ensure(process.equals(flowNode
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link flowElements from task to process
								JavaSDM.ensure(process.equals(task.eContainer()));

								// check link incoming from iceInFlow to flowNode
								JavaSDM.ensure(flowNode.equals(iceInFlow
										.getTargetRef()));

								// check link incoming from inFlow to task
								JavaSDM.ensure(task.equals(inFlow
										.getTargetRef()));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link outgoing from iceInFlow to evGw
								JavaSDM.ensure(evGw.equals(iceInFlow
										.getSourceRef()));

								// check link outgoing from inFlow to flowNode
								JavaSDM.ensure(flowNode.equals(inFlow
										.getSourceRef()));

								// check link outgoing from outFlow to task
								JavaSDM.ensure(task.equals(outFlow
										.getSourceRef()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from laneToActor to lane
								JavaSDM.ensure(lane.equals(laneToActor
										.getSource()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from laneToActor to actor
								JavaSDM.ensure(actor.equals(laneToActor
										.getTarget()));

								// create object __iceInFlow_targetRef_flowNode
								__iceInFlow_targetRef_flowNode = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_flowNode
								__process_flowElements_flowNode = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __flowNode_outgoing_inFlow
								__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_sourceRef_flowNode
								__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __flowNode_incoming_iceInFlow
								__flowNode_incoming_iceInFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __evGw_outgoing_iceInFlow
								__evGw_outgoing_iceInFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __iceInFlow_sourceRef_evGw
								__iceInFlow_sourceRef_evGw = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __laneSet_lanes_lane
								__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __laneToActor_source_lane
								__laneToActor_source_lane = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __task_incoming_inFlow
								__task_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_task
								__process_flowElements_task = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __task_outgoing_outFlow
								__task_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __outFlow_sourceRef_task
								__outFlow_sourceRef_task = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlow_targetRef_task
								__inFlow_targetRef_task = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __laneToActor_target_actor
								__laneToActor_target_actor = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_inFlow
								__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_laneSets_laneSet
								__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_flowElements_outFlow
								__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __iceInFlow_targetRef_flowNode
								__iceInFlow_targetRef_flowNode
										.setName("targetRef");
								// assign attribute __flowNode_incoming_iceInFlow
								__flowNode_incoming_iceInFlow
										.setName("incoming");
								// assign attribute __iceInFlow_sourceRef_evGw
								__iceInFlow_sourceRef_evGw.setName("sourceRef");
								// assign attribute __evGw_outgoing_iceInFlow
								__evGw_outgoing_iceInFlow.setName("outgoing");
								// assign attribute __laneToActor_source_lane
								__laneToActor_source_lane.setName("source");
								// assign attribute __laneToActor_target_actor
								__laneToActor_target_actor.setName("target");
								// assign attribute __inFlow_targetRef_task
								__inFlow_targetRef_task.setName("targetRef");
								// assign attribute __task_incoming_inFlow
								__task_incoming_inFlow.setName("incoming");
								// assign attribute __process_flowElements_flowNode
								__process_flowElements_flowNode
										.setName("flowElements");
								// assign attribute __process_laneSets_laneSet
								__process_laneSets_laneSet.setName("laneSets");
								// assign attribute __process_flowElements_inFlow
								__process_flowElements_inFlow
										.setName("flowElements");
								// assign attribute __process_flowElements_task
								__process_flowElements_task
										.setName("flowElements");
								// assign attribute __process_flowElements_outFlow
								__process_flowElements_outFlow
										.setName("flowElements");
								// assign attribute __outFlow_sourceRef_task
								__outFlow_sourceRef_task.setName("sourceRef");
								// assign attribute __task_outgoing_outFlow
								__task_outgoing_outFlow.setName("outgoing");
								// assign attribute __inFlowToFlow_source_inFlow
								__inFlowToFlow_source_inFlow.setName("source");
								// assign attribute __inFlowToFlow_target_flow
								__inFlowToFlow_target_flow.setName("target");
								// assign attribute __laneSet_lanes_lane
								__laneSet_lanes_lane.setName("lanes");
								// assign attribute __inFlow_sourceRef_flowNode
								__inFlow_sourceRef_flowNode
										.setName("sourceRef");
								// assign attribute __flowNode_outgoing_inFlow
								__flowNode_outgoing_inFlow.setName("outgoing");

								// create link
								__iceInFlow_targetRef_flowNode.setTrg(flowNode);

								// create link
								__process_flowElements_flowNode
										.setTrg(flowNode);

								// create link
								__flowNode_outgoing_inFlow.setSrc(flowNode);

								// create link
								__inFlow_sourceRef_flowNode.setTrg(flowNode);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flowNode);

								// create link
								__flowNode_incoming_iceInFlow.setSrc(flowNode);

								// create link
								isApplicableMatch.getAllContextElements().add(
										iceInFlow);

								// create link
								__evGw_outgoing_iceInFlow.setTrg(iceInFlow);

								// create link
								__flowNode_incoming_iceInFlow.setTrg(iceInFlow);

								// create link
								__iceInFlow_targetRef_flowNode
										.setSrc(iceInFlow);

								// create link
								__iceInFlow_sourceRef_evGw.setSrc(iceInFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										evGw);

								// create link
								__evGw_outgoing_iceInFlow.setSrc(evGw);

								// create link
								__iceInFlow_sourceRef_evGw.setTrg(evGw);

								// create link
								__laneSet_lanes_lane.setTrg(lane);

								// create link
								isApplicableMatch.getAllContextElements().add(
										lane);

								// create link
								__laneToActor_source_lane.setTrg(lane);

								// create link
								__task_incoming_inFlow.setSrc(task);

								// create link
								isApplicableMatch.getAllContextElements().add(
										task);

								// create link
								__process_flowElements_task.setTrg(task);

								// create link
								__task_outgoing_outFlow.setSrc(task);

								// create link
								__outFlow_sourceRef_task.setTrg(task);

								// create link
								__inFlow_targetRef_task.setTrg(task);

								// create link
								__laneToActor_target_actor.setTrg(actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										actor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneToActor);

								// create link
								__laneToActor_source_lane.setSrc(laneToActor);

								// create link
								__laneToActor_target_actor.setSrc(laneToActor);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlow);

								// create link
								__inFlow_sourceRef_flowNode.setSrc(inFlow);

								// create link
								__flowNode_outgoing_inFlow.setTrg(inFlow);

								// create link
								__process_flowElements_inFlow.setTrg(inFlow);

								// create link
								__inFlow_targetRef_task.setSrc(inFlow);

								// create link
								__inFlowToFlow_source_inFlow.setTrg(inFlow);

								// create link
								__task_incoming_inFlow.setTrg(inFlow);

								// create link
								__process_laneSets_laneSet.setSrc(process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										process);

								// create link
								__process_flowElements_flowNode.setSrc(process);

								// create link
								__process_flowElements_outFlow.setSrc(process);

								// create link
								__process_flowElements_inFlow.setSrc(process);

								// create link
								__process_flowElements_task.setSrc(process);

								// create link
								__outFlow_sourceRef_task.setSrc(outFlow);

								// create link
								__process_flowElements_outFlow.setTrg(outFlow);

								// create link
								__task_outgoing_outFlow.setTrg(outFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										outFlow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										inFlowToFlow);

								// create link
								__inFlowToFlow_source_inFlow
										.setSrc(inFlowToFlow);

								// create link
								__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

								// create link
								__inFlowToFlow_target_flow.setTrg(flow);

								// create link
								isApplicableMatch.getAllContextElements().add(
										flow);

								// create link
								__process_laneSets_laneSet.setTrg(laneSet);

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneSet);

								// create link
								__laneSet_lanes_lane.setSrc(laneSet);

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__flowNode_incoming_iceInFlow,
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
												__outFlow_sourceRef_task,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__laneToActor_target_actor,
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
												__inFlow_targetRef_task,
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
												__process_flowElements_outFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__task_outgoing_outFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__process_flowElements_flowNode,
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
												__iceInFlow_sourceRef_evGw,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__evGw_outgoing_iceInFlow,
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
												__task_incoming_inFlow,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__iceInFlow_targetRef_flowNode,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__process_flowElements_task,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__laneToActor_source_lane,
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
												__inFlowToFlow_target_flow,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch,
													flowNode, iceInFlow, evGw,
													lane, task, actor,
													laneToActor, inFlow,
													process, outFlow,
													inFlowToFlow, flow, laneSet));

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
										// assign attribute ruleresult
										ruleresult.setSuccess(true);
										// assign attribute isApplicableMatch
										isApplicableMatch
												.setRuleName("UserTaskToStepAfterEvGwRule");

										// create link
										isApplicableMatch
												.setIsApplicableRuleResult(ruleresult);

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
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		EventBasedGateway evGw = null;
		Flow flow = null;
		IntermediateCatchEvent flowNode = null;
		SequenceFlow iceInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		LaneToActor laneToActor = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		UserTask task = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep taskToNormalStep = null;
		NormalStep normalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __inFlow_targetRef_task = null;
		EMoflonEdge __task_incoming_inFlow = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge taskToNormalStep__source__task = null;
		EMoflonEdge __outFlow_sourceRef_task = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge taskToNormalStep__target__normalStep = null;
		EMoflonEdge __task_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_task = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("evGw"));

			// ensure correct type and really bound of object evGw
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			evGw = (EventBasedGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			flowNode = (IntermediateCatchEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("iceInFlow"));

			// ensure correct type and really bound of object iceInFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			iceInFlow = (SequenceFlow) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("laneToActor"));

			// ensure correct type and really bound of object laneToActor
			JavaSDM.ensure(_TmpObject instanceof LaneToActor);
			laneToActor = (LaneToActor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("task"));

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and iceInFlow 
			JavaSDM.ensure(!outFlow.equals(iceInFlow));

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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object taskToNormalStep
			taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getAttributeVariable(
					"normalStep", "name").getValue());
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getAttributeVariable(
					"normalStep", "label").getValue());

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			taskToNormalStep.setSource(task);

			// create link
			normalStep.setActor(actor);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			flow.getSteps().add(normalStep);

			// create link
			taskToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object task is really bound
			JavaSDM.ensure(task != null);
			// check object taskToNormalStep is really bound
			JavaSDM.ensure(taskToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					task, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object evGw is really bound
			JavaSDM.ensure(evGw != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object iceInFlow is really bound
			JavaSDM.ensure(iceInFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object task is really bound
			JavaSDM.ensure(task != null);
			// check object taskToNormalStep is really bound
			JavaSDM.ensure(taskToNormalStep != null);
			// check isomorphic binding between objects evGw and actor 
			JavaSDM.ensure(!evGw.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowNode and actor 
			JavaSDM.ensure(!flowNode.equals(actor));

			// check isomorphic binding between objects iceInFlow and actor 
			JavaSDM.ensure(!iceInFlow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects laneToActor and actor 
			JavaSDM.ensure(!laneToActor.equals(actor));

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

			// check isomorphic binding between objects task and actor 
			JavaSDM.ensure(!task.equals(actor));

			// check isomorphic binding between objects taskToNormalStep and actor 
			JavaSDM.ensure(!taskToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and evGw 
			JavaSDM.ensure(!flow.equals(evGw));

			// check isomorphic binding between objects flowNode and evGw 
			JavaSDM.ensure(!flowNode.equals(evGw));

			// check isomorphic binding between objects iceInFlow and evGw 
			JavaSDM.ensure(!iceInFlow.equals(evGw));

			// check isomorphic binding between objects inFlow and evGw 
			JavaSDM.ensure(!inFlow.equals(evGw));

			// check isomorphic binding between objects inFlowToFlow and evGw 
			JavaSDM.ensure(!inFlowToFlow.equals(evGw));

			// check isomorphic binding between objects lane and evGw 
			JavaSDM.ensure(!lane.equals(evGw));

			// check isomorphic binding between objects laneSet and evGw 
			JavaSDM.ensure(!laneSet.equals(evGw));

			// check isomorphic binding between objects laneToActor and evGw 
			JavaSDM.ensure(!laneToActor.equals(evGw));

			// check isomorphic binding between objects normalStep and evGw 
			JavaSDM.ensure(!normalStep.equals(evGw));

			// check isomorphic binding between objects outFlow and evGw 
			JavaSDM.ensure(!outFlow.equals(evGw));

			// check isomorphic binding between objects outFlowToFlow and evGw 
			JavaSDM.ensure(!outFlowToFlow.equals(evGw));

			// check isomorphic binding between objects outFlowToNormalStep and evGw 
			JavaSDM.ensure(!outFlowToNormalStep.equals(evGw));

			// check isomorphic binding between objects process and evGw 
			JavaSDM.ensure(!process.equals(evGw));

			// check isomorphic binding between objects task and evGw 
			JavaSDM.ensure(!task.equals(evGw));

			// check isomorphic binding between objects taskToNormalStep and evGw 
			JavaSDM.ensure(!taskToNormalStep.equals(evGw));

			// check isomorphic binding between objects flowNode and flow 
			JavaSDM.ensure(!flowNode.equals(flow));

			// check isomorphic binding between objects iceInFlow and flow 
			JavaSDM.ensure(!iceInFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects laneToActor and flow 
			JavaSDM.ensure(!laneToActor.equals(flow));

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

			// check isomorphic binding between objects task and flow 
			JavaSDM.ensure(!task.equals(flow));

			// check isomorphic binding between objects taskToNormalStep and flow 
			JavaSDM.ensure(!taskToNormalStep.equals(flow));

			// check isomorphic binding between objects iceInFlow and flowNode 
			JavaSDM.ensure(!iceInFlow.equals(flowNode));

			// check isomorphic binding between objects inFlow and flowNode 
			JavaSDM.ensure(!inFlow.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and flowNode 
			JavaSDM.ensure(!inFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects lane and flowNode 
			JavaSDM.ensure(!lane.equals(flowNode));

			// check isomorphic binding between objects laneSet and flowNode 
			JavaSDM.ensure(!laneSet.equals(flowNode));

			// check isomorphic binding between objects laneToActor and flowNode 
			JavaSDM.ensure(!laneToActor.equals(flowNode));

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

			// check isomorphic binding between objects task and flowNode 
			JavaSDM.ensure(!task.equals(flowNode));

			// check isomorphic binding between objects taskToNormalStep and flowNode 
			JavaSDM.ensure(!taskToNormalStep.equals(flowNode));

			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

			// check isomorphic binding between objects inFlowToFlow and iceInFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceInFlow));

			// check isomorphic binding between objects lane and iceInFlow 
			JavaSDM.ensure(!lane.equals(iceInFlow));

			// check isomorphic binding between objects laneSet and iceInFlow 
			JavaSDM.ensure(!laneSet.equals(iceInFlow));

			// check isomorphic binding between objects laneToActor and iceInFlow 
			JavaSDM.ensure(!laneToActor.equals(iceInFlow));

			// check isomorphic binding between objects normalStep and iceInFlow 
			JavaSDM.ensure(!normalStep.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and iceInFlow 
			JavaSDM.ensure(!outFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlowToFlow and iceInFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlowToNormalStep and iceInFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(iceInFlow));

			// check isomorphic binding between objects process and iceInFlow 
			JavaSDM.ensure(!process.equals(iceInFlow));

			// check isomorphic binding between objects task and iceInFlow 
			JavaSDM.ensure(!task.equals(iceInFlow));

			// check isomorphic binding between objects taskToNormalStep and iceInFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(iceInFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects laneToActor and inFlow 
			JavaSDM.ensure(!laneToActor.equals(inFlow));

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

			// check isomorphic binding between objects task and inFlow 
			JavaSDM.ensure(!task.equals(inFlow));

			// check isomorphic binding between objects taskToNormalStep and inFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects laneToActor and inFlowToFlow 
			JavaSDM.ensure(!laneToActor.equals(inFlowToFlow));

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

			// check isomorphic binding between objects task and inFlowToFlow 
			JavaSDM.ensure(!task.equals(inFlowToFlow));

			// check isomorphic binding between objects taskToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects laneToActor and lane 
			JavaSDM.ensure(!laneToActor.equals(lane));

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

			// check isomorphic binding between objects task and lane 
			JavaSDM.ensure(!task.equals(lane));

			// check isomorphic binding between objects taskToNormalStep and lane 
			JavaSDM.ensure(!taskToNormalStep.equals(lane));

			// check isomorphic binding between objects laneToActor and laneSet 
			JavaSDM.ensure(!laneToActor.equals(laneSet));

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

			// check isomorphic binding between objects task and laneSet 
			JavaSDM.ensure(!task.equals(laneSet));

			// check isomorphic binding between objects taskToNormalStep and laneSet 
			JavaSDM.ensure(!taskToNormalStep.equals(laneSet));

			// check isomorphic binding between objects normalStep and laneToActor 
			JavaSDM.ensure(!normalStep.equals(laneToActor));

			// check isomorphic binding between objects outFlow and laneToActor 
			JavaSDM.ensure(!outFlow.equals(laneToActor));

			// check isomorphic binding between objects outFlowToFlow and laneToActor 
			JavaSDM.ensure(!outFlowToFlow.equals(laneToActor));

			// check isomorphic binding between objects outFlowToNormalStep and laneToActor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneToActor));

			// check isomorphic binding between objects process and laneToActor 
			JavaSDM.ensure(!process.equals(laneToActor));

			// check isomorphic binding between objects task and laneToActor 
			JavaSDM.ensure(!task.equals(laneToActor));

			// check isomorphic binding between objects taskToNormalStep and laneToActor 
			JavaSDM.ensure(!taskToNormalStep.equals(laneToActor));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects task and normalStep 
			JavaSDM.ensure(!task.equals(normalStep));

			// check isomorphic binding between objects taskToNormalStep and normalStep 
			JavaSDM.ensure(!taskToNormalStep.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects task and outFlow 
			JavaSDM.ensure(!task.equals(outFlow));

			// check isomorphic binding between objects taskToNormalStep and outFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects task and outFlowToFlow 
			JavaSDM.ensure(!task.equals(outFlowToFlow));

			// check isomorphic binding between objects taskToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects task and outFlowToNormalStep 
			JavaSDM.ensure(!task.equals(outFlowToNormalStep));

			// check isomorphic binding between objects taskToNormalStep and outFlowToNormalStep 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects task and process 
			JavaSDM.ensure(!task.equals(process));

			// check isomorphic binding between objects taskToNormalStep and process 
			JavaSDM.ensure(!taskToNormalStep.equals(process));

			// check isomorphic binding between objects taskToNormalStep and task 
			JavaSDM.ensure(!taskToNormalStep.equals(task));

			// create object __inFlow_targetRef_task
			__inFlow_targetRef_task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __task_incoming_inFlow
			__task_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object taskToNormalStep__source__task
			taskToNormalStep__source__task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_task
			__outFlow_sourceRef_task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object taskToNormalStep__target__normalStep
			taskToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __task_outgoing_outFlow
			__task_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_task
			__process_flowElements_task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserTaskToStepAfterEvGwRule");
			// assign attribute __inFlow_targetRef_task
			__inFlow_targetRef_task.setName("targetRef");
			// assign attribute __task_incoming_inFlow
			__task_incoming_inFlow.setName("incoming");
			// assign attribute __process_flowElements_task
			__process_flowElements_task.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __outFlow_sourceRef_task
			__outFlow_sourceRef_task.setName("sourceRef");
			// assign attribute __task_outgoing_outFlow
			__task_outgoing_outFlow.setName("outgoing");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute taskToNormalStep__source__task
			taskToNormalStep__source__task.setName("source");
			// assign attribute taskToNormalStep__target__normalStep
			taskToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_task, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__task_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep__source__task, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_task, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__task_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_task, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			__outFlow_sourceRef_task.setTrg(task);

			// create link
			__task_incoming_inFlow.setSrc(task);

			// create link
			__task_outgoing_outFlow.setSrc(task);

			// create link
			taskToNormalStep__source__task.setTrg(task);

			// create link
			__process_flowElements_task.setTrg(task);

			// create link
			__inFlow_targetRef_task.setTrg(task);

			// create link
			normalStep__actor__actor.setTrg(actor);

			// create link
			__task_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_task.setSrc(inFlow);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__process_flowElements_task.setSrc(process);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_task.setSrc(outFlow);

			// create link
			__task_outgoing_outFlow.setTrg(outFlow);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			taskToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			taskToNormalStep__source__task.setSrc(taskToNormalStep);

			// create link
			taskToNormalStep__target__normalStep.setSrc(taskToNormalStep);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			flow__steps__normalStep.setSrc(flow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, flowNode, iceInFlow, evGw, lane,
				task, actor, laneToActor, inFlow, process, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
				inFlowToFlow, flow, laneSet);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		match.registerObject("flowNode", flowNode);
		match.registerObject("iceInFlow", iceInFlow);
		match.registerObject("evGw", evGw);
		match.registerObject("lane", lane);
		match.registerObject("task", task);
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("outFlow", outFlow);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
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
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", true, csp);
		var_task_name.setValue(task.getName());
		var_task_name.setType("");

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
		eq.solve(var_task_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_task_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("iceInFlow", iceInFlow);
		isApplicableMatch.registerObject("evGw", evGw);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("task", task);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("laneToActor", laneToActor);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
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
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject lane,
			EObject task, EObject actor, EObject laneToActor, EObject inFlow,
			EObject process, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("iceInFlow", iceInFlow);
		ruleresult.registerObject("evGw", evGw);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("taskToNormalStep", taskToNormalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("task").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getUserTask())
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
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

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
		EMoflonEdge __inFlow_sourceRef_flowNode = null;
		EMoflonEdge __process_flowElements_flowNode = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __iceInFlow_targetRef_flowNode = null;
		EMoflonEdge __flowNode_outgoing_inFlow = null;
		EMoflonEdge __flowNode_incoming_iceInFlow = null;
		EMoflonEdge __iceInFlow_sourceRef_evGw = null;
		EMoflonEdge __evGw_outgoing_iceInFlow = null;
		EMoflonEdge __laneToActor_source_lane = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __laneToActor_target_actor = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		IntermediateCatchEvent flowNode = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Lane lane = null;
		Iterator fujaba__IterActorToLaneToActor = null;
		LaneToActor laneToActor = null;
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
			ruleresult.setRule("UserTaskToStepAfterEvGwRule");

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

					// iterate to-many link target from actor to laneToActor
					fujaba__Success = false;

					fujaba__IterActorToLaneToActor = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(actor,
											LaneToActor.class, "target"))
							.iterator();

					while (fujaba__IterActorToLaneToActor.hasNext()) {
						try {
							laneToActor = (LaneToActor) fujaba__IterActorToLaneToActor
									.next();

							// check object laneToActor is really bound
							JavaSDM.ensure(laneToActor != null);
							// bind object
							lane = laneToActor.getSource();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);

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
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneToActor is really bound
								JavaSDM.ensure(laneToActor != null);
								// check object normalStep is really bound
								JavaSDM.ensure(normalStep != null);
								// check link actor from normalStep to actor
								JavaSDM.ensure(actor.equals(normalStep
										.getActor()));

								// bind object
								_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
										.eContainer() : null;

								// ensure correct type and really bound of object process
								JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
								process = (bpmn2.Process) _TmpObject;

								// check if contained via correct reference
								JavaSDM.ensure(process.getFlowElements()
										.contains(inFlow));

								// bind object
								laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
										.eContainer() : null;

								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);

								// check if contained via correct reference
								JavaSDM.ensure(laneSet.getLanes()
										.contains(lane));

								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// bind object
								_TmpObject = inFlow.getSourceRef();

								// ensure correct type and really bound of object flowNode
								JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
								flowNode = (IntermediateCatchEvent) _TmpObject;

								// check link flowElements from flowNode to process
								JavaSDM.ensure(process.equals(flowNode
										.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from laneToActor to lane
								JavaSDM.ensure(lane.equals(laneToActor
										.getSource()));

								// check link steps from normalStep to flow
								JavaSDM.ensure(flow.equals(normalStep
										.eContainer()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from laneToActor to actor
								JavaSDM.ensure(actor.equals(laneToActor
										.getTarget()));

								// iterate to-many link incoming from flowNode to iceInFlow
								fujaba__Success = false;

								fujaba__IterFlowNodeToIceInFlow = new ArrayList(
										flowNode.getIncoming()).iterator();

								while (fujaba__IterFlowNodeToIceInFlow
										.hasNext()) {
									try {
										iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
												.next();

										// check object iceInFlow is really bound
										JavaSDM.ensure(iceInFlow != null);
										// check isomorphic binding between objects inFlow and iceInFlow 
										JavaSDM.ensure(!inFlow
												.equals(iceInFlow));

										// bind object
										_TmpObject = iceInFlow.getSourceRef();

										// ensure correct type and really bound of object evGw
										JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
										evGw = (EventBasedGateway) _TmpObject;

										// create object __inFlow_sourceRef_flowNode
										__inFlow_sourceRef_flowNode = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_flowNode
										__process_flowElements_flowNode = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __iceInFlow_targetRef_flowNode
										__iceInFlow_targetRef_flowNode = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowNode_outgoing_inFlow
										__flowNode_outgoing_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flowNode_incoming_iceInFlow
										__flowNode_incoming_iceInFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __iceInFlow_sourceRef_evGw
										__iceInFlow_sourceRef_evGw = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __evGw_outgoing_iceInFlow
										__evGw_outgoing_iceInFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __laneToActor_source_lane
										__laneToActor_source_lane = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __laneSet_lanes_lane
										__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __laneToActor_target_actor
										__laneToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_actor_actor
										__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_laneSets_laneSet
										__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __iceInFlow_targetRef_flowNode
										__iceInFlow_targetRef_flowNode
												.setName("targetRef");
										// assign attribute __flowNode_incoming_iceInFlow
										__flowNode_incoming_iceInFlow
												.setName("incoming");
										// assign attribute __iceInFlow_sourceRef_evGw
										__iceInFlow_sourceRef_evGw
												.setName("sourceRef");
										// assign attribute __evGw_outgoing_iceInFlow
										__evGw_outgoing_iceInFlow
												.setName("outgoing");
										// assign attribute __laneToActor_source_lane
										__laneToActor_source_lane
												.setName("source");
										// assign attribute __laneToActor_target_actor
										__laneToActor_target_actor
												.setName("target");
										// assign attribute __process_flowElements_flowNode
										__process_flowElements_flowNode
												.setName("flowElements");
										// assign attribute __process_laneSets_laneSet
										__process_laneSets_laneSet
												.setName("laneSets");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __normalStep_actor_actor
										__normalStep_actor_actor
												.setName("actor");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __laneSet_lanes_lane
										__laneSet_lanes_lane.setName("lanes");
										// assign attribute __inFlow_sourceRef_flowNode
										__inFlow_sourceRef_flowNode
												.setName("sourceRef");
										// assign attribute __flowNode_outgoing_inFlow
										__flowNode_outgoing_inFlow
												.setName("outgoing");

										// create link
										__inFlow_sourceRef_flowNode
												.setTrg(flowNode);

										// create link
										__process_flowElements_flowNode
												.setTrg(flowNode);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flowNode);

										// create link
										__iceInFlow_targetRef_flowNode
												.setTrg(flowNode);

										// create link
										__flowNode_outgoing_inFlow
												.setSrc(flowNode);

										// create link
										__flowNode_incoming_iceInFlow
												.setSrc(flowNode);

										// create link
										__iceInFlow_sourceRef_evGw
												.setSrc(iceInFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														iceInFlow);

										// create link
										__iceInFlow_targetRef_flowNode
												.setSrc(iceInFlow);

										// create link
										__flowNode_incoming_iceInFlow
												.setTrg(iceInFlow);

										// create link
										__evGw_outgoing_iceInFlow
												.setTrg(iceInFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														evGw);

										// create link
										__evGw_outgoing_iceInFlow.setSrc(evGw);

										// create link
										__iceInFlow_sourceRef_evGw.setTrg(evGw);

										// create link
										__laneToActor_source_lane.setTrg(lane);

										// create link
										__laneSet_lanes_lane.setTrg(lane);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														lane);

										// create link
										__laneToActor_target_actor
												.setTrg(actor);

										// create link
										__normalStep_actor_actor.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														laneToActor);

										// create link
										__laneToActor_target_actor
												.setSrc(laneToActor);

										// create link
										__laneToActor_source_lane
												.setSrc(laneToActor);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__flowNode_outgoing_inFlow
												.setTrg(inFlow);

										// create link
										__inFlow_sourceRef_flowNode
												.setSrc(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__process_laneSets_laneSet
												.setSrc(process);

										// create link
										__process_flowElements_flowNode
												.setSrc(process);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										__normalStep_actor_actor
												.setSrc(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										__process_laneSets_laneSet
												.setTrg(laneSet);

										// create link
										__laneSet_lanes_lane.setSrc(laneSet);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														laneSet);

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
														__laneToActor_source_lane,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__iceInFlow_targetRef_flowNode,
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
														__evGw_outgoing_iceInFlow,
														"allContextElements");

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
														__process_flowElements_inFlow,
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
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__flowNode_incoming_iceInFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__laneToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_flowNode,
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
														__inFlowToFlow_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__iceInFlow_sourceRef_evGw,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															flowNode,
															iceInFlow, evGw,
															lane, actor,
															laneToActor,
															inFlow, process,
															normalStep,
															inFlowToFlow, flow,
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
												// assign attribute ruleresult
												ruleresult.setSuccess(true);
												// assign attribute isApplicableMatch
												isApplicableMatch
														.setRuleName("UserTaskToStepAfterEvGwRule");

												// create link
												isApplicableMatch
														.setIsApplicableRuleResult(ruleresult);

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
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Actor actor = null;
		EventBasedGateway evGw = null;
		Flow flow = null;
		IntermediateCatchEvent flowNode = null;
		SequenceFlow iceInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		LaneToActor laneToActor = null;
		NormalStep normalStep = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UserTask task = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep taskToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge task__outgoing__outFlow = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge process__flowElements__task = null;
		EMoflonEdge taskToNormalStep__target__normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge taskToNormalStep__source__task = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge inFlow__targetRef__task = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge outFlow__sourceRef__task = null;
		EMoflonEdge task__incoming__inFlow = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge __normalStep_actor_actor = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("evGw"));

			// ensure correct type and really bound of object evGw
			JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
			evGw = (EventBasedGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			flowNode = (IntermediateCatchEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("iceInFlow"));

			// ensure correct type and really bound of object iceInFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			iceInFlow = (SequenceFlow) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("laneToActor"));

			// ensure correct type and really bound of object laneToActor
			JavaSDM.ensure(_TmpObject instanceof LaneToActor);
			laneToActor = (LaneToActor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object task
			task = Bpmn2Factory.eINSTANCE.createUserTask();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object taskToNormalStep
			taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute task
			task.setId((java.lang.String) csp
					.getAttributeVariable("task", "id").getValue());
			// assign attribute task
			task.setName((java.lang.String) csp.getAttributeVariable("task",
					"name").getValue());

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToFlow.setSource(outFlow);

			// create link
			taskToNormalStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			outFlow.setSourceRef(task);

			// create link
			inFlow.setTargetRef(task);

			// create link
			taskToNormalStep.setSource(task);

			// create link
			process.getFlowElements().add(task);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object task is really bound
			JavaSDM.ensure(task != null);
			// check object taskToNormalStep is really bound
			JavaSDM.ensure(taskToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					task, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object evGw is really bound
			JavaSDM.ensure(evGw != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object iceInFlow is really bound
			JavaSDM.ensure(iceInFlow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
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
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object task is really bound
			JavaSDM.ensure(task != null);
			// check object taskToNormalStep is really bound
			JavaSDM.ensure(taskToNormalStep != null);
			// check isomorphic binding between objects evGw and actor 
			JavaSDM.ensure(!evGw.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects flowNode and actor 
			JavaSDM.ensure(!flowNode.equals(actor));

			// check isomorphic binding between objects iceInFlow and actor 
			JavaSDM.ensure(!iceInFlow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects laneToActor and actor 
			JavaSDM.ensure(!laneToActor.equals(actor));

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

			// check isomorphic binding between objects task and actor 
			JavaSDM.ensure(!task.equals(actor));

			// check isomorphic binding between objects taskToNormalStep and actor 
			JavaSDM.ensure(!taskToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and evGw 
			JavaSDM.ensure(!flow.equals(evGw));

			// check isomorphic binding between objects flowNode and evGw 
			JavaSDM.ensure(!flowNode.equals(evGw));

			// check isomorphic binding between objects iceInFlow and evGw 
			JavaSDM.ensure(!iceInFlow.equals(evGw));

			// check isomorphic binding between objects inFlow and evGw 
			JavaSDM.ensure(!inFlow.equals(evGw));

			// check isomorphic binding between objects inFlowToFlow and evGw 
			JavaSDM.ensure(!inFlowToFlow.equals(evGw));

			// check isomorphic binding between objects lane and evGw 
			JavaSDM.ensure(!lane.equals(evGw));

			// check isomorphic binding between objects laneSet and evGw 
			JavaSDM.ensure(!laneSet.equals(evGw));

			// check isomorphic binding between objects laneToActor and evGw 
			JavaSDM.ensure(!laneToActor.equals(evGw));

			// check isomorphic binding between objects normalStep and evGw 
			JavaSDM.ensure(!normalStep.equals(evGw));

			// check isomorphic binding between objects outFlow and evGw 
			JavaSDM.ensure(!outFlow.equals(evGw));

			// check isomorphic binding between objects outFlowToFlow and evGw 
			JavaSDM.ensure(!outFlowToFlow.equals(evGw));

			// check isomorphic binding between objects outFlowToNormalStep and evGw 
			JavaSDM.ensure(!outFlowToNormalStep.equals(evGw));

			// check isomorphic binding between objects process and evGw 
			JavaSDM.ensure(!process.equals(evGw));

			// check isomorphic binding between objects task and evGw 
			JavaSDM.ensure(!task.equals(evGw));

			// check isomorphic binding between objects taskToNormalStep and evGw 
			JavaSDM.ensure(!taskToNormalStep.equals(evGw));

			// check isomorphic binding between objects flowNode and flow 
			JavaSDM.ensure(!flowNode.equals(flow));

			// check isomorphic binding between objects iceInFlow and flow 
			JavaSDM.ensure(!iceInFlow.equals(flow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects laneToActor and flow 
			JavaSDM.ensure(!laneToActor.equals(flow));

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

			// check isomorphic binding between objects task and flow 
			JavaSDM.ensure(!task.equals(flow));

			// check isomorphic binding between objects taskToNormalStep and flow 
			JavaSDM.ensure(!taskToNormalStep.equals(flow));

			// check isomorphic binding between objects iceInFlow and flowNode 
			JavaSDM.ensure(!iceInFlow.equals(flowNode));

			// check isomorphic binding between objects inFlow and flowNode 
			JavaSDM.ensure(!inFlow.equals(flowNode));

			// check isomorphic binding between objects inFlowToFlow and flowNode 
			JavaSDM.ensure(!inFlowToFlow.equals(flowNode));

			// check isomorphic binding between objects lane and flowNode 
			JavaSDM.ensure(!lane.equals(flowNode));

			// check isomorphic binding between objects laneSet and flowNode 
			JavaSDM.ensure(!laneSet.equals(flowNode));

			// check isomorphic binding between objects laneToActor and flowNode 
			JavaSDM.ensure(!laneToActor.equals(flowNode));

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

			// check isomorphic binding between objects task and flowNode 
			JavaSDM.ensure(!task.equals(flowNode));

			// check isomorphic binding between objects taskToNormalStep and flowNode 
			JavaSDM.ensure(!taskToNormalStep.equals(flowNode));

			// check isomorphic binding between objects inFlow and iceInFlow 
			JavaSDM.ensure(!inFlow.equals(iceInFlow));

			// check isomorphic binding between objects inFlowToFlow and iceInFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(iceInFlow));

			// check isomorphic binding between objects lane and iceInFlow 
			JavaSDM.ensure(!lane.equals(iceInFlow));

			// check isomorphic binding between objects laneSet and iceInFlow 
			JavaSDM.ensure(!laneSet.equals(iceInFlow));

			// check isomorphic binding between objects laneToActor and iceInFlow 
			JavaSDM.ensure(!laneToActor.equals(iceInFlow));

			// check isomorphic binding between objects normalStep and iceInFlow 
			JavaSDM.ensure(!normalStep.equals(iceInFlow));

			// check isomorphic binding between objects outFlow and iceInFlow 
			JavaSDM.ensure(!outFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlowToFlow and iceInFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(iceInFlow));

			// check isomorphic binding between objects outFlowToNormalStep and iceInFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(iceInFlow));

			// check isomorphic binding between objects process and iceInFlow 
			JavaSDM.ensure(!process.equals(iceInFlow));

			// check isomorphic binding between objects task and iceInFlow 
			JavaSDM.ensure(!task.equals(iceInFlow));

			// check isomorphic binding between objects taskToNormalStep and iceInFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(iceInFlow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects laneToActor and inFlow 
			JavaSDM.ensure(!laneToActor.equals(inFlow));

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

			// check isomorphic binding between objects task and inFlow 
			JavaSDM.ensure(!task.equals(inFlow));

			// check isomorphic binding between objects taskToNormalStep and inFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(inFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects laneToActor and inFlowToFlow 
			JavaSDM.ensure(!laneToActor.equals(inFlowToFlow));

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

			// check isomorphic binding between objects task and inFlowToFlow 
			JavaSDM.ensure(!task.equals(inFlowToFlow));

			// check isomorphic binding between objects taskToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects laneToActor and lane 
			JavaSDM.ensure(!laneToActor.equals(lane));

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

			// check isomorphic binding between objects task and lane 
			JavaSDM.ensure(!task.equals(lane));

			// check isomorphic binding between objects taskToNormalStep and lane 
			JavaSDM.ensure(!taskToNormalStep.equals(lane));

			// check isomorphic binding between objects laneToActor and laneSet 
			JavaSDM.ensure(!laneToActor.equals(laneSet));

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

			// check isomorphic binding between objects task and laneSet 
			JavaSDM.ensure(!task.equals(laneSet));

			// check isomorphic binding between objects taskToNormalStep and laneSet 
			JavaSDM.ensure(!taskToNormalStep.equals(laneSet));

			// check isomorphic binding between objects normalStep and laneToActor 
			JavaSDM.ensure(!normalStep.equals(laneToActor));

			// check isomorphic binding between objects outFlow and laneToActor 
			JavaSDM.ensure(!outFlow.equals(laneToActor));

			// check isomorphic binding between objects outFlowToFlow and laneToActor 
			JavaSDM.ensure(!outFlowToFlow.equals(laneToActor));

			// check isomorphic binding between objects outFlowToNormalStep and laneToActor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneToActor));

			// check isomorphic binding between objects process and laneToActor 
			JavaSDM.ensure(!process.equals(laneToActor));

			// check isomorphic binding between objects task and laneToActor 
			JavaSDM.ensure(!task.equals(laneToActor));

			// check isomorphic binding between objects taskToNormalStep and laneToActor 
			JavaSDM.ensure(!taskToNormalStep.equals(laneToActor));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects task and normalStep 
			JavaSDM.ensure(!task.equals(normalStep));

			// check isomorphic binding between objects taskToNormalStep and normalStep 
			JavaSDM.ensure(!taskToNormalStep.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects task and outFlow 
			JavaSDM.ensure(!task.equals(outFlow));

			// check isomorphic binding between objects taskToNormalStep and outFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects task and outFlowToFlow 
			JavaSDM.ensure(!task.equals(outFlowToFlow));

			// check isomorphic binding between objects taskToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects task and outFlowToNormalStep 
			JavaSDM.ensure(!task.equals(outFlowToNormalStep));

			// check isomorphic binding between objects taskToNormalStep and outFlowToNormalStep 
			JavaSDM.ensure(!taskToNormalStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects task and process 
			JavaSDM.ensure(!task.equals(process));

			// check isomorphic binding between objects taskToNormalStep and process 
			JavaSDM.ensure(!taskToNormalStep.equals(process));

			// check isomorphic binding between objects taskToNormalStep and task 
			JavaSDM.ensure(!taskToNormalStep.equals(task));

			// create object task__outgoing__outFlow
			task__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__task
			process__flowElements__task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object taskToNormalStep__target__normalStep
			taskToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object taskToNormalStep__source__task
			taskToNormalStep__source__task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__task
			inFlow__targetRef__task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__task
			outFlow__sourceRef__task = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object task__incoming__inFlow
			task__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UserTaskToStepAfterEvGwRule");
			// assign attribute inFlow__targetRef__task
			inFlow__targetRef__task.setName("targetRef");
			// assign attribute task__incoming__inFlow
			task__incoming__inFlow.setName("incoming");
			// assign attribute process__flowElements__task
			process__flowElements__task.setName("flowElements");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute outFlow__sourceRef__task
			outFlow__sourceRef__task.setName("sourceRef");
			// assign attribute task__outgoing__outFlow
			task__outgoing__outFlow.setName("outgoing");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute taskToNormalStep__source__task
			taskToNormalStep__source__task.setName("source");
			// assign attribute taskToNormalStep__target__normalStep
			taskToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					task__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__task, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					taskToNormalStep__source__task, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__task, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__task, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					task__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			taskToNormalStep__source__task.setTrg(task);

			// create link
			task__outgoing__outFlow.setSrc(task);

			// create link
			process__flowElements__task.setTrg(task);

			// create link
			task__incoming__inFlow.setSrc(task);

			// create link
			outFlow__sourceRef__task.setTrg(task);

			// create link
			inFlow__targetRef__task.setTrg(task);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			// create link
			inFlow__targetRef__task.setSrc(inFlow);

			// create link
			task__incoming__inFlow.setTrg(inFlow);

			// create link
			process__flowElements__task.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			task__outgoing__outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlow__sourceRef__task.setSrc(outFlow);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			taskToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			taskToNormalStep__source__task.setSrc(taskToNormalStep);

			// create link
			taskToNormalStep__target__normalStep.setSrc(taskToNormalStep);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, flowNode, iceInFlow, evGw, lane,
				task, actor, laneToActor, inFlow, process, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
				inFlowToFlow, flow, laneSet);
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
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
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
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", csp);
		var_task_id.setType("");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", csp);
		var_task_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_task_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("iceInFlow", iceInFlow);
		isApplicableMatch.registerObject("evGw", evGw);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("laneToActor", laneToActor);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
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
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject lane,
			EObject task, EObject actor, EObject laneToActor, EObject inFlow,
			EObject process, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("iceInFlow", iceInFlow);
		ruleresult.registerObject("evGw", evGw);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("taskToNormalStep", taskToNormalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("flow", flow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_223(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_830098 = null;
		FlowElementsContainer __DEC_task_flowElements_704796 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_747614 = null;
		SequenceFlow __DEC_task_targetRef_747614 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		IntermediateCatchEvent flowNode = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		UserTask task = null;
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

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;

			// check link flowElements from task to process
			JavaSDM.ensure(process.equals(task.eContainer()));

			// check link incoming from inFlow to task
			JavaSDM.ensure(task.equals(inFlow.getTargetRef()));

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
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// bind object
					_TmpObject = inFlow.getSourceRef();

					// ensure correct type and really bound of object flowNode
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					flowNode = (IntermediateCatchEvent) _TmpObject;

					// check link flowElements from flowNode to process
					JavaSDM.ensure(process.equals(flowNode.eContainer()));

					// check link outgoing from outFlow to task
					JavaSDM.ensure(task.equals(outFlow.getSourceRef()));

					// iterate to-many link incoming from flowNode to iceInFlow
					fujaba__Success = false;

					fujaba__IterFlowNodeToIceInFlow = new ArrayList(
							flowNode.getIncoming()).iterator();

					while (fujaba__IterFlowNodeToIceInFlow.hasNext()) {
						try {
							iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
									.next();

							// check object iceInFlow is really bound
							JavaSDM.ensure(iceInFlow != null);
							// check isomorphic binding between objects inFlow and iceInFlow 
							JavaSDM.ensure(!inFlow.equals(iceInFlow));

							// check isomorphic binding between objects outFlow and iceInFlow 
							JavaSDM.ensure(!outFlow.equals(iceInFlow));

							// bind object
							_TmpObject = iceInFlow.getSourceRef();

							// ensure correct type and really bound of object evGw
							JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
							evGw = (EventBasedGateway) _TmpObject;

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
											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_outFlow_flowElements_830098 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_830098 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_830098 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_830098
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_830098 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_830098
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
													__DEC_task_flowElements_704796 = task
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
															.eContainer()
															: null;

													// check object __DEC_task_flowElements_704796 is really bound
													JavaSDM.ensure(__DEC_task_flowElements_704796 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_task_flowElements_704796
															.getFlowElements()
															.contains(task));

													// check isomorphic binding between objects __DEC_task_flowElements_704796 and process 
													JavaSDM.ensure(!__DEC_task_flowElements_704796
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

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

													// iterate to-many link incoming from task to __DEC_task_targetRef_747614
													fujaba__Success = false;

													fujaba__IterTaskTo__DEC_task_targetRef_747614 = new ArrayList(
															task.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterTaskTo__DEC_task_targetRef_747614
																	.hasNext()) {
														try {
															__DEC_task_targetRef_747614 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_747614
																	.next();

															// check object __DEC_task_targetRef_747614 is really bound
															JavaSDM.ensure(__DEC_task_targetRef_747614 != null);
															// check isomorphic binding between objects __DEC_task_targetRef_747614 and iceInFlow 
															JavaSDM.ensure(!__DEC_task_targetRef_747614
																	.equals(iceInFlow));

															// check isomorphic binding between objects __DEC_task_targetRef_747614 and inFlow 
															JavaSDM.ensure(!__DEC_task_targetRef_747614
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_task_targetRef_747614 and outFlow 
															JavaSDM.ensure(!__DEC_task_targetRef_747614
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
												// check object evGw is really bound
												JavaSDM.ensure(evGw != null);
												// check object flowNode is really bound
												JavaSDM.ensure(flowNode != null);
												// check object iceInFlow is really bound
												JavaSDM.ensure(iceInFlow != null);
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
												// check object task is really bound
												JavaSDM.ensure(task != null);
												// check isomorphic binding between objects inFlow and iceInFlow 
												JavaSDM.ensure(!inFlow
														.equals(iceInFlow));

												// check isomorphic binding between objects outFlow and iceInFlow 
												JavaSDM.ensure(!outFlow
														.equals(iceInFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check link flowElements from flowNode to process
												JavaSDM.ensure(process
														.equals(flowNode
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link flowElements from task to process
												JavaSDM.ensure(process
														.equals(task
																.eContainer()));

												// check link incoming from iceInFlow to flowNode
												JavaSDM.ensure(flowNode.equals(iceInFlow
														.getTargetRef()));

												// check link incoming from inFlow to task
												JavaSDM.ensure(task.equals(inFlow
														.getTargetRef()));

												// check link incoming from iceInFlow to task
												JavaSDM.ensure(!(task.equals(iceInFlow
														.getTargetRef())));

												// check link incoming from outFlow to task
												JavaSDM.ensure(!(task.equals(outFlow
														.getTargetRef())));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link outgoing from iceInFlow to evGw
												JavaSDM.ensure(evGw.equals(iceInFlow
														.getSourceRef()));

												// check link outgoing from inFlow to flowNode
												JavaSDM.ensure(flowNode.equals(inFlow
														.getSourceRef()));

												// check link outgoing from outFlow to task
												JavaSDM.ensure(task.equals(outFlow
														.getSourceRef()));

												// check link src from _edge_targetRef to inFlow
												JavaSDM.ensure(inFlow
														.equals(_edge_targetRef
																.getSrc()));

												// check link trg from _edge_targetRef to task
												JavaSDM.ensure(task
														.equals(_edge_targetRef
																.getTrg()));

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
																flowNode,
																iceInFlow,
																evGw, lane,
																task, inFlow,
																process,
																outFlow,
																laneSet);
												if (fujaba__Success) {
													// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_224(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_24880 = null;
		FlowElementsContainer __DEC_task_flowElements_340530 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_562179 = null;
		SequenceFlow __DEC_task_targetRef_562179 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		EventBasedGateway evGw = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		IntermediateCatchEvent flowNode = null;
		SequenceFlow inFlow = null;
		UserTask task = null;

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

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link incoming from inFlow to task
			JavaSDM.ensure(task.equals(inFlow.getTargetRef()));

			// bind object
			_TmpObject = inFlow.getSourceRef();

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
			flowNode = (IntermediateCatchEvent) _TmpObject;

			// iterate to-many link incoming from flowNode to iceInFlow
			fujaba__Success = false;

			fujaba__IterFlowNodeToIceInFlow = new ArrayList(
					flowNode.getIncoming()).iterator();

			while (fujaba__IterFlowNodeToIceInFlow.hasNext()) {
				try {
					iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
							.next();

					// check object iceInFlow is really bound
					JavaSDM.ensure(iceInFlow != null);
					// check isomorphic binding between objects inFlow and iceInFlow 
					JavaSDM.ensure(!inFlow.equals(iceInFlow));

					// bind object
					_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(inFlow));

					// check link flowElements from flowNode to process
					JavaSDM.ensure(process.equals(flowNode.eContainer()));

					// check link flowElements from task to process
					JavaSDM.ensure(process.equals(task.eContainer()));

					// bind object
					_TmpObject = iceInFlow.getSourceRef();

					// ensure correct type and really bound of object evGw
					JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
					evGw = (EventBasedGateway) _TmpObject;

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
							// check isomorphic binding between objects outFlow and iceInFlow 
							JavaSDM.ensure(!outFlow.equals(iceInFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link outgoing from outFlow to task
							JavaSDM.ensure(task.equals(outFlow.getSourceRef()));

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
											// iterate to-many link src from inFlow to _edge_targetRef
											fujaba__Success = false;

											fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	inFlow,
																	EMoflonEdge.class,
																	"src"))
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

													// check link trg from _edge_targetRef to task
													JavaSDM.ensure(task
															.equals(_edge_targetRef
																	.getTrg()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_outFlow_flowElements_24880 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_24880 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_24880 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_24880
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_24880 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_24880
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
															__DEC_task_flowElements_340530 = task
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
																	.eContainer()
																	: null;

															// check object __DEC_task_flowElements_340530 is really bound
															JavaSDM.ensure(__DEC_task_flowElements_340530 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_task_flowElements_340530
																	.getFlowElements()
																	.contains(
																			task));

															// check isomorphic binding between objects __DEC_task_flowElements_340530 and process 
															JavaSDM.ensure(!__DEC_task_flowElements_340530
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

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

															// iterate to-many link incoming from task to __DEC_task_targetRef_562179
															fujaba__Success = false;

															fujaba__IterTaskTo__DEC_task_targetRef_562179 = new ArrayList(
																	task.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterTaskTo__DEC_task_targetRef_562179
																			.hasNext()) {
																try {
																	__DEC_task_targetRef_562179 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_562179
																			.next();

																	// check object __DEC_task_targetRef_562179 is really bound
																	JavaSDM.ensure(__DEC_task_targetRef_562179 != null);
																	// check isomorphic binding between objects __DEC_task_targetRef_562179 and iceInFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_562179
																			.equals(iceInFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_562179 and inFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_562179
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_562179 and outFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_562179
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
														// check object evGw is really bound
														JavaSDM.ensure(evGw != null);
														// check object flowNode is really bound
														JavaSDM.ensure(flowNode != null);
														// check object iceInFlow is really bound
														JavaSDM.ensure(iceInFlow != null);
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
														// check object task is really bound
														JavaSDM.ensure(task != null);
														// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
														JavaSDM.ensure(!_edge_targetRef
																.equals(_edge_incoming));

														// check isomorphic binding between objects inFlow and iceInFlow 
														JavaSDM.ensure(!inFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and iceInFlow 
														JavaSDM.ensure(!outFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from flowNode to process
														JavaSDM.ensure(process
																.equals(flowNode
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link flowElements from task to process
														JavaSDM.ensure(process.equals(task
																.eContainer()));

														// check link incoming from iceInFlow to flowNode
														JavaSDM.ensure(flowNode
																.equals(iceInFlow
																		.getTargetRef()));

														// check link incoming from inFlow to task
														JavaSDM.ensure(task.equals(inFlow
																.getTargetRef()));

														// check link incoming from iceInFlow to task
														JavaSDM.ensure(!(task
																.equals(iceInFlow
																		.getTargetRef())));

														// check link incoming from outFlow to task
														JavaSDM.ensure(!(task.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from iceInFlow to evGw
														JavaSDM.ensure(evGw
																.equals(iceInFlow
																		.getSourceRef()));

														// check link outgoing from inFlow to flowNode
														JavaSDM.ensure(flowNode.equals(inFlow
																.getSourceRef()));

														// check link outgoing from outFlow to task
														JavaSDM.ensure(task.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_incoming to task
														JavaSDM.ensure(task
																.equals(_edge_incoming
																		.getSrc()));

														// check link src from _edge_targetRef to inFlow
														JavaSDM.ensure(inFlow
																.equals(_edge_targetRef
																		.getSrc()));

														// check link trg from _edge_incoming to inFlow
														JavaSDM.ensure(inFlow
																.equals(_edge_incoming
																		.getTrg()));

														// check link trg from _edge_targetRef to task
														JavaSDM.ensure(task
																.equals(_edge_targetRef
																		.getTrg()));

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
																		flowNode,
																		iceInFlow,
																		evGw,
																		lane,
																		task,
																		inFlow,
																		process,
																		outFlow,
																		laneSet);
														if (fujaba__Success) {
															// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_225(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_150864 = null;
		FlowElementsContainer __DEC_task_flowElements_383534 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_574863 = null;
		SequenceFlow __DEC_task_targetRef_574863 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToFlowNode = null;
		IntermediateCatchEvent flowNode = null;
		bpmn2.Process process = null;
		UserTask task = null;

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

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check link flowElements from task to process
			JavaSDM.ensure(process.equals(task.eContainer()));

			// iterate to-many link flowElements from process to flowNode
			fujaba__Success = false;

			fujaba__IterProcessToFlowNode = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToFlowNode.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToFlowNode.next();

					// ensure correct type and really bound of object flowNode
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					flowNode = (IntermediateCatchEvent) _TmpObject;
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
							// check link incoming from inFlow to task
							JavaSDM.ensure(task.equals(inFlow.getTargetRef()));

							// check link outgoing from inFlow to flowNode
							JavaSDM.ensure(flowNode.equals(inFlow
									.getSourceRef()));

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
									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link outgoing from outFlow to task
									JavaSDM.ensure(task.equals(outFlow
											.getSourceRef()));

									// iterate to-many link incoming from flowNode to iceInFlow
									fujaba__Success = false;

									fujaba__IterFlowNodeToIceInFlow = new ArrayList(
											flowNode.getIncoming()).iterator();

									while (fujaba__IterFlowNodeToIceInFlow
											.hasNext()) {
										try {
											iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
													.next();

											// check object iceInFlow is really bound
											JavaSDM.ensure(iceInFlow != null);
											// check isomorphic binding between objects inFlow and iceInFlow 
											JavaSDM.ensure(!inFlow
													.equals(iceInFlow));

											// check isomorphic binding between objects outFlow and iceInFlow 
											JavaSDM.ensure(!outFlow
													.equals(iceInFlow));

											// bind object
											_TmpObject = iceInFlow
													.getSourceRef();

											// ensure correct type and really bound of object evGw
											JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
											evGw = (EventBasedGateway) _TmpObject;

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
															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_outFlow_flowElements_150864 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_150864 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_150864 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_150864
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_150864 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_150864
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
																	__DEC_task_flowElements_383534 = task
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
																			.eContainer()
																			: null;

																	// check object __DEC_task_flowElements_383534 is really bound
																	JavaSDM.ensure(__DEC_task_flowElements_383534 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_task_flowElements_383534
																			.getFlowElements()
																			.contains(
																					task));

																	// check isomorphic binding between objects __DEC_task_flowElements_383534 and process 
																	JavaSDM.ensure(!__DEC_task_flowElements_383534
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

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

																	// iterate to-many link incoming from task to __DEC_task_targetRef_574863
																	fujaba__Success = false;

																	fujaba__IterTaskTo__DEC_task_targetRef_574863 = new ArrayList(
																			task.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterTaskTo__DEC_task_targetRef_574863
																					.hasNext()) {
																		try {
																			__DEC_task_targetRef_574863 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_574863
																					.next();

																			// check object __DEC_task_targetRef_574863 is really bound
																			JavaSDM.ensure(__DEC_task_targetRef_574863 != null);
																			// check isomorphic binding between objects __DEC_task_targetRef_574863 and iceInFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_574863
																					.equals(iceInFlow));

																			// check isomorphic binding between objects __DEC_task_targetRef_574863 and inFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_574863
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_task_targetRef_574863 and outFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_574863
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
																// check object evGw is really bound
																JavaSDM.ensure(evGw != null);
																// check object flowNode is really bound
																JavaSDM.ensure(flowNode != null);
																// check object iceInFlow is really bound
																JavaSDM.ensure(iceInFlow != null);
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
																// check object task is really bound
																JavaSDM.ensure(task != null);
																// check isomorphic binding between objects inFlow and iceInFlow 
																JavaSDM.ensure(!inFlow
																		.equals(iceInFlow));

																// check isomorphic binding between objects outFlow and iceInFlow 
																JavaSDM.ensure(!outFlow
																		.equals(iceInFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link flowElements from flowNode to process
																JavaSDM.ensure(process
																		.equals(flowNode
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link flowElements from task to process
																JavaSDM.ensure(process
																		.equals(task
																				.eContainer()));

																// check link incoming from iceInFlow to flowNode
																JavaSDM.ensure(flowNode
																		.equals(iceInFlow
																				.getTargetRef()));

																// check link incoming from inFlow to task
																JavaSDM.ensure(task
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from iceInFlow to task
																JavaSDM.ensure(!(task
																		.equals(iceInFlow
																				.getTargetRef())));

																// check link incoming from outFlow to task
																JavaSDM.ensure(!(task
																		.equals(outFlow
																				.getTargetRef())));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link outgoing from iceInFlow to evGw
																JavaSDM.ensure(evGw
																		.equals(iceInFlow
																				.getSourceRef()));

																// check link outgoing from inFlow to flowNode
																JavaSDM.ensure(flowNode
																		.equals(inFlow
																				.getSourceRef()));

																// check link outgoing from outFlow to task
																JavaSDM.ensure(task
																		.equals(outFlow
																				.getSourceRef()));

																// check link src from _edge_flowElements to process
																JavaSDM.ensure(process
																		.equals(_edge_flowElements
																				.getSrc()));

																// check link trg from _edge_flowElements to task
																JavaSDM.ensure(task
																		.equals(_edge_flowElements
																				.getTrg()));

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
																				flowNode,
																				iceInFlow,
																				evGw,
																				lane,
																				task,
																				inFlow,
																				process,
																				outFlow,
																				laneSet);
																if (fujaba__Success) {
																	// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_226(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_534591 = null;
		FlowElementsContainer __DEC_task_flowElements_837816 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_576342 = null;
		SequenceFlow __DEC_task_targetRef_576342 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		UserTask task = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToFlowNode = null;
		IntermediateCatchEvent flowNode = null;
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

			// iterate to-many link flowElements from process to flowNode
			fujaba__Success = false;

			fujaba__IterProcessToFlowNode = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToFlowNode.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToFlowNode.next();

					// ensure correct type and really bound of object flowNode
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					flowNode = (IntermediateCatchEvent) _TmpObject;
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
							_TmpObject = inFlow.getTargetRef();

							// ensure correct type and really bound of object task
							JavaSDM.ensure(_TmpObject instanceof UserTask);
							task = (UserTask) _TmpObject;

							// check link flowElements from task to process
							JavaSDM.ensure(process.equals(task.eContainer()));

							// check link outgoing from inFlow to flowNode
							JavaSDM.ensure(flowNode.equals(inFlow
									.getSourceRef()));

							// check link outgoing from outFlow to task
							JavaSDM.ensure(task.equals(outFlow.getSourceRef()));

							// iterate to-many link incoming from flowNode to iceInFlow
							fujaba__Success = false;

							fujaba__IterFlowNodeToIceInFlow = new ArrayList(
									flowNode.getIncoming()).iterator();

							while (fujaba__IterFlowNodeToIceInFlow.hasNext()) {
								try {
									iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
											.next();

									// check object iceInFlow is really bound
									JavaSDM.ensure(iceInFlow != null);
									// check isomorphic binding between objects inFlow and iceInFlow 
									JavaSDM.ensure(!inFlow.equals(iceInFlow));

									// check isomorphic binding between objects outFlow and iceInFlow 
									JavaSDM.ensure(!outFlow.equals(iceInFlow));

									// bind object
									_TmpObject = iceInFlow.getSourceRef();

									// ensure correct type and really bound of object evGw
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									evGw = (EventBasedGateway) _TmpObject;

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
													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_outFlow_flowElements_534591 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_534591 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_534591 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_534591
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_534591 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_534591
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
															__DEC_task_flowElements_837816 = task
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
																	.eContainer()
																	: null;

															// check object __DEC_task_flowElements_837816 is really bound
															JavaSDM.ensure(__DEC_task_flowElements_837816 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_task_flowElements_837816
																	.getFlowElements()
																	.contains(
																			task));

															// check isomorphic binding between objects __DEC_task_flowElements_837816 and process 
															JavaSDM.ensure(!__DEC_task_flowElements_837816
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

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

															// iterate to-many link incoming from task to __DEC_task_targetRef_576342
															fujaba__Success = false;

															fujaba__IterTaskTo__DEC_task_targetRef_576342 = new ArrayList(
																	task.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterTaskTo__DEC_task_targetRef_576342
																			.hasNext()) {
																try {
																	__DEC_task_targetRef_576342 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_576342
																			.next();

																	// check object __DEC_task_targetRef_576342 is really bound
																	JavaSDM.ensure(__DEC_task_targetRef_576342 != null);
																	// check isomorphic binding between objects __DEC_task_targetRef_576342 and iceInFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_576342
																			.equals(iceInFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_576342 and inFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_576342
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_576342 and outFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_576342
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
														// check object evGw is really bound
														JavaSDM.ensure(evGw != null);
														// check object flowNode is really bound
														JavaSDM.ensure(flowNode != null);
														// check object iceInFlow is really bound
														JavaSDM.ensure(iceInFlow != null);
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
														// check object task is really bound
														JavaSDM.ensure(task != null);
														// check isomorphic binding between objects inFlow and iceInFlow 
														JavaSDM.ensure(!inFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and iceInFlow 
														JavaSDM.ensure(!outFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from flowNode to process
														JavaSDM.ensure(process
																.equals(flowNode
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link flowElements from task to process
														JavaSDM.ensure(process.equals(task
																.eContainer()));

														// check link incoming from iceInFlow to flowNode
														JavaSDM.ensure(flowNode
																.equals(iceInFlow
																		.getTargetRef()));

														// check link incoming from inFlow to task
														JavaSDM.ensure(task.equals(inFlow
																.getTargetRef()));

														// check link incoming from iceInFlow to task
														JavaSDM.ensure(!(task
																.equals(iceInFlow
																		.getTargetRef())));

														// check link incoming from outFlow to task
														JavaSDM.ensure(!(task.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from iceInFlow to evGw
														JavaSDM.ensure(evGw
																.equals(iceInFlow
																		.getSourceRef()));

														// check link outgoing from inFlow to flowNode
														JavaSDM.ensure(flowNode.equals(inFlow
																.getSourceRef()));

														// check link outgoing from outFlow to task
														JavaSDM.ensure(task.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_flowElements to process
														JavaSDM.ensure(process
																.equals(_edge_flowElements
																		.getSrc()));

														// check link trg from _edge_flowElements to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_flowElements
																		.getTrg()));

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
																		flowNode,
																		iceInFlow,
																		evGw,
																		lane,
																		task,
																		inFlow,
																		process,
																		outFlow,
																		laneSet);
														if (fujaba__Success) {
															// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_227(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_526924 = null;
		FlowElementsContainer __DEC_task_flowElements_533626 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_868741 = null;
		SequenceFlow __DEC_task_targetRef_868741 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToFlowNode = null;
		IntermediateCatchEvent flowNode = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		UserTask task = null;

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

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;

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

			// check link flowElements from task to process
			JavaSDM.ensure(process.equals(task.eContainer()));

			// check link outgoing from outFlow to task
			JavaSDM.ensure(task.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to flowNode
			fujaba__Success = false;

			fujaba__IterProcessToFlowNode = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToFlowNode.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToFlowNode.next();

					// ensure correct type and really bound of object flowNode
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					flowNode = (IntermediateCatchEvent) _TmpObject;
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

							// check link incoming from inFlow to task
							JavaSDM.ensure(task.equals(inFlow.getTargetRef()));

							// check link outgoing from inFlow to flowNode
							JavaSDM.ensure(flowNode.equals(inFlow
									.getSourceRef()));

							// iterate to-many link incoming from flowNode to iceInFlow
							fujaba__Success = false;

							fujaba__IterFlowNodeToIceInFlow = new ArrayList(
									flowNode.getIncoming()).iterator();

							while (fujaba__IterFlowNodeToIceInFlow.hasNext()) {
								try {
									iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
											.next();

									// check object iceInFlow is really bound
									JavaSDM.ensure(iceInFlow != null);
									// check isomorphic binding between objects inFlow and iceInFlow 
									JavaSDM.ensure(!inFlow.equals(iceInFlow));

									// check isomorphic binding between objects outFlow and iceInFlow 
									JavaSDM.ensure(!outFlow.equals(iceInFlow));

									// bind object
									_TmpObject = iceInFlow.getSourceRef();

									// ensure correct type and really bound of object evGw
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									evGw = (EventBasedGateway) _TmpObject;

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
													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_outFlow_flowElements_526924 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_526924 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_526924 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_526924
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_526924 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_526924
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
															__DEC_task_flowElements_533626 = task
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
																	.eContainer()
																	: null;

															// check object __DEC_task_flowElements_533626 is really bound
															JavaSDM.ensure(__DEC_task_flowElements_533626 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_task_flowElements_533626
																	.getFlowElements()
																	.contains(
																			task));

															// check isomorphic binding between objects __DEC_task_flowElements_533626 and process 
															JavaSDM.ensure(!__DEC_task_flowElements_533626
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

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

															// iterate to-many link incoming from task to __DEC_task_targetRef_868741
															fujaba__Success = false;

															fujaba__IterTaskTo__DEC_task_targetRef_868741 = new ArrayList(
																	task.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterTaskTo__DEC_task_targetRef_868741
																			.hasNext()) {
																try {
																	__DEC_task_targetRef_868741 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_868741
																			.next();

																	// check object __DEC_task_targetRef_868741 is really bound
																	JavaSDM.ensure(__DEC_task_targetRef_868741 != null);
																	// check isomorphic binding between objects __DEC_task_targetRef_868741 and iceInFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_868741
																			.equals(iceInFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_868741 and inFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_868741
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_task_targetRef_868741 and outFlow 
																	JavaSDM.ensure(!__DEC_task_targetRef_868741
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
														// check object evGw is really bound
														JavaSDM.ensure(evGw != null);
														// check object flowNode is really bound
														JavaSDM.ensure(flowNode != null);
														// check object iceInFlow is really bound
														JavaSDM.ensure(iceInFlow != null);
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
														// check object task is really bound
														JavaSDM.ensure(task != null);
														// check isomorphic binding between objects inFlow and iceInFlow 
														JavaSDM.ensure(!inFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and iceInFlow 
														JavaSDM.ensure(!outFlow
																.equals(iceInFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link flowElements from flowNode to process
														JavaSDM.ensure(process
																.equals(flowNode
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link flowElements from task to process
														JavaSDM.ensure(process.equals(task
																.eContainer()));

														// check link incoming from iceInFlow to flowNode
														JavaSDM.ensure(flowNode
																.equals(iceInFlow
																		.getTargetRef()));

														// check link incoming from inFlow to task
														JavaSDM.ensure(task.equals(inFlow
																.getTargetRef()));

														// check link incoming from iceInFlow to task
														JavaSDM.ensure(!(task
																.equals(iceInFlow
																		.getTargetRef())));

														// check link incoming from outFlow to task
														JavaSDM.ensure(!(task.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from iceInFlow to evGw
														JavaSDM.ensure(evGw
																.equals(iceInFlow
																		.getSourceRef()));

														// check link outgoing from inFlow to flowNode
														JavaSDM.ensure(flowNode.equals(inFlow
																.getSourceRef()));

														// check link outgoing from outFlow to task
														JavaSDM.ensure(task.equals(outFlow
																.getSourceRef()));

														// check link src from _edge_sourceRef to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_sourceRef
																		.getSrc()));

														// check link trg from _edge_sourceRef to task
														JavaSDM.ensure(task
																.equals(_edge_sourceRef
																		.getTrg()));

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
																		flowNode,
																		iceInFlow,
																		evGw,
																		lane,
																		task,
																		inFlow,
																		process,
																		outFlow,
																		laneSet);
														if (fujaba__Success) {
															// statement node ''
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_228(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_770260 = null;
		FlowElementsContainer __DEC_task_flowElements_83221 = null;
		Iterator fujaba__IterTaskTo__DEC_task_targetRef_321732 = null;
		SequenceFlow __DEC_task_targetRef_321732 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToFlowNode = null;
		IntermediateCatchEvent flowNode = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		UserTask task = null;

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

			// ensure correct type and really bound of object task
			JavaSDM.ensure(_TmpObject instanceof UserTask);
			task = (UserTask) _TmpObject;

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

			// check link flowElements from task to process
			JavaSDM.ensure(process.equals(task.eContainer()));

			// check link outgoing from outFlow to task
			JavaSDM.ensure(task.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to flowNode
			fujaba__Success = false;

			fujaba__IterProcessToFlowNode = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToFlowNode.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToFlowNode.next();

					// ensure correct type and really bound of object flowNode
					JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
					flowNode = (IntermediateCatchEvent) _TmpObject;
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

							// check link incoming from inFlow to task
							JavaSDM.ensure(task.equals(inFlow.getTargetRef()));

							// check link outgoing from inFlow to flowNode
							JavaSDM.ensure(flowNode.equals(inFlow
									.getSourceRef()));

							// iterate to-many link incoming from flowNode to iceInFlow
							fujaba__Success = false;

							fujaba__IterFlowNodeToIceInFlow = new ArrayList(
									flowNode.getIncoming()).iterator();

							while (fujaba__IterFlowNodeToIceInFlow.hasNext()) {
								try {
									iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
											.next();

									// check object iceInFlow is really bound
									JavaSDM.ensure(iceInFlow != null);
									// check isomorphic binding between objects inFlow and iceInFlow 
									JavaSDM.ensure(!inFlow.equals(iceInFlow));

									// check isomorphic binding between objects outFlow and iceInFlow 
									JavaSDM.ensure(!outFlow.equals(iceInFlow));

									// bind object
									_TmpObject = iceInFlow.getSourceRef();

									// ensure correct type and really bound of object evGw
									JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
									evGw = (EventBasedGateway) _TmpObject;

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

															// check link trg from _edge_sourceRef to task
															JavaSDM.ensure(task
																	.equals(_edge_sourceRef
																			.getTrg()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_outFlow_flowElements_770260 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_770260 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_770260 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_770260
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_770260 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_770260
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
																	__DEC_task_flowElements_83221 = task
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) task
																			.eContainer()
																			: null;

																	// check object __DEC_task_flowElements_83221 is really bound
																	JavaSDM.ensure(__DEC_task_flowElements_83221 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_task_flowElements_83221
																			.getFlowElements()
																			.contains(
																					task));

																	// check isomorphic binding between objects __DEC_task_flowElements_83221 and process 
																	JavaSDM.ensure(!__DEC_task_flowElements_83221
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

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

																	// iterate to-many link incoming from task to __DEC_task_targetRef_321732
																	fujaba__Success = false;

																	fujaba__IterTaskTo__DEC_task_targetRef_321732 = new ArrayList(
																			task.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterTaskTo__DEC_task_targetRef_321732
																					.hasNext()) {
																		try {
																			__DEC_task_targetRef_321732 = (SequenceFlow) fujaba__IterTaskTo__DEC_task_targetRef_321732
																					.next();

																			// check object __DEC_task_targetRef_321732 is really bound
																			JavaSDM.ensure(__DEC_task_targetRef_321732 != null);
																			// check isomorphic binding between objects __DEC_task_targetRef_321732 and iceInFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_321732
																					.equals(iceInFlow));

																			// check isomorphic binding between objects __DEC_task_targetRef_321732 and inFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_321732
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_task_targetRef_321732 and outFlow 
																			JavaSDM.ensure(!__DEC_task_targetRef_321732
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
																// check object evGw is really bound
																JavaSDM.ensure(evGw != null);
																// check object flowNode is really bound
																JavaSDM.ensure(flowNode != null);
																// check object iceInFlow is really bound
																JavaSDM.ensure(iceInFlow != null);
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
																// check object task is really bound
																JavaSDM.ensure(task != null);
																// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
																JavaSDM.ensure(!_edge_sourceRef
																		.equals(_edge_outgoing));

																// check isomorphic binding between objects inFlow and iceInFlow 
																JavaSDM.ensure(!inFlow
																		.equals(iceInFlow));

																// check isomorphic binding between objects outFlow and iceInFlow 
																JavaSDM.ensure(!outFlow
																		.equals(iceInFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link flowElements from flowNode to process
																JavaSDM.ensure(process
																		.equals(flowNode
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link flowElements from task to process
																JavaSDM.ensure(process
																		.equals(task
																				.eContainer()));

																// check link incoming from iceInFlow to flowNode
																JavaSDM.ensure(flowNode
																		.equals(iceInFlow
																				.getTargetRef()));

																// check link incoming from inFlow to task
																JavaSDM.ensure(task
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from iceInFlow to task
																JavaSDM.ensure(!(task
																		.equals(iceInFlow
																				.getTargetRef())));

																// check link incoming from outFlow to task
																JavaSDM.ensure(!(task
																		.equals(outFlow
																				.getTargetRef())));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link outgoing from iceInFlow to evGw
																JavaSDM.ensure(evGw
																		.equals(iceInFlow
																				.getSourceRef()));

																// check link outgoing from inFlow to flowNode
																JavaSDM.ensure(flowNode
																		.equals(inFlow
																				.getSourceRef()));

																// check link outgoing from outFlow to task
																JavaSDM.ensure(task
																		.equals(outFlow
																				.getSourceRef()));

																// check link src from _edge_outgoing to task
																JavaSDM.ensure(task
																		.equals(_edge_outgoing
																				.getSrc()));

																// check link src from _edge_sourceRef to outFlow
																JavaSDM.ensure(outFlow
																		.equals(_edge_sourceRef
																				.getSrc()));

																// check link trg from _edge_outgoing to outFlow
																JavaSDM.ensure(outFlow
																		.equals(_edge_outgoing
																				.getTrg()));

																// check link trg from _edge_sourceRef to task
																JavaSDM.ensure(task
																		.equals(_edge_sourceRef
																				.getTrg()));

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
																				flowNode,
																				iceInFlow,
																				evGw,
																				lane,
																				task,
																				inFlow,
																				process,
																				outFlow,
																				laneSet);
																if (fujaba__Success) {
																	// statement node ''
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_70(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_440424 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_522103 = null;
		Step __DEC_normalStep_next_522103 = null;
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
					__DEC_normalStep_steps_440424 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_440424 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_440424 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_440424.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_440424 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_440424.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_522103
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_522103 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_522103
									.hasNext()) {
						try {
							__DEC_normalStep_next_522103 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_522103
									.next();

							// check object __DEC_normalStep_next_522103 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_522103 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_522103 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_522103
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
					// statement node ''
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_71(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_169373 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_241182 = null;
		Step __DEC_normalStep_next_241182 = null;
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
					__DEC_normalStep_steps_169373 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_169373 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_169373 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_169373.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_169373 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_169373.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_241182
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_241182 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_241182
									.hasNext()) {
						try {
							__DEC_normalStep_next_241182 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_241182
									.next();

							// check object __DEC_normalStep_next_241182 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_241182 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_241182 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_241182
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
					// statement node ''
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			LaneToActor laneToActorDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		UserTask task = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep taskToNormalStep = null;
		NormalStep normalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		EventBasedGateway evGw = null;
		Iterator fujaba__IterFlowNodeToIceInFlow = null;
		SequenceFlow iceInFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToFlowNode = null;
		IntermediateCatchEvent flowNode = null;
		Actor actor = null;
		bpmn2.Process process = null;
		LaneSet laneSet = null;
		Lane lane = null;
		Iterator fujaba__IterLaneToActorListToLaneToActor = null;
		LaneToActor laneToActor = null;
		Iterator fujaba__IterRuleEntryContainerToLaneToActorList = null;
		RuleEntryList laneToActorList = null;

		// story node 'create result'
		try {
			fujaba__Success = false;

			// create object ruleResult
			ruleResult = TGGRuntimeFactory.eINSTANCE
					.createModelgeneratorRuleResult();

			// create object isApplicableMatch
			isApplicableMatch = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableMatch();

			// assign attribute ruleResult
			ruleResult.setSuccess(false);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'is applicable core'
		try {
			fujaba__Success = false;

			// check object ruleEntryContainer is really bound
			JavaSDM.ensure(ruleEntryContainer != null);
			// iterate to-many link ruleEntryList from ruleEntryContainer to laneToActorList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToLaneToActorList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToLaneToActorList.hasNext()) {
				try {
					laneToActorList = (RuleEntryList) fujaba__IterRuleEntryContainerToLaneToActorList
							.next();

					// check object laneToActorList is really bound
					JavaSDM.ensure(laneToActorList != null);
					// iterate to-many link entryObjects from laneToActorList to laneToActor
					fujaba__Success = false;

					fujaba__IterLaneToActorListToLaneToActor = new ArrayList(
							laneToActorList.getEntryObjects()).iterator();

					while (fujaba__IterLaneToActorListToLaneToActor.hasNext()) {
						try {
							_TmpObject = fujaba__IterLaneToActorListToLaneToActor
									.next();

							// ensure correct type and really bound of object laneToActor
							JavaSDM.ensure(_TmpObject instanceof LaneToActor);
							laneToActor = (LaneToActor) _TmpObject;
							// bind object
							lane = laneToActor.getSource();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);

							// bind object
							laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
									.eContainer() : null;

							// check object laneSet is really bound
							JavaSDM.ensure(laneSet != null);

							// check if contained via correct reference
							JavaSDM.ensure(laneSet.getLanes().contains(lane));

							// bind object
							_TmpObject = laneSet.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) laneSet
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getLaneSets().contains(
									laneSet));

							// bind object
							actor = laneToActor.getTarget();

							// check object actor is really bound
							JavaSDM.ensure(actor != null);

							// iterate to-many link flowElements from process to flowNode
							fujaba__Success = false;

							fujaba__IterProcessToFlowNode = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToFlowNode.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToFlowNode
											.next();

									// ensure correct type and really bound of object flowNode
									JavaSDM.ensure(_TmpObject instanceof IntermediateCatchEvent);
									flowNode = (IntermediateCatchEvent) _TmpObject;
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
											// check link outgoing from inFlow to flowNode
											JavaSDM.ensure(flowNode
													.equals(inFlow
															.getSourceRef()));

											// iterate to-many link incoming from flowNode to iceInFlow
											fujaba__Success = false;

											fujaba__IterFlowNodeToIceInFlow = new ArrayList(
													flowNode.getIncoming())
													.iterator();

											while (fujaba__IterFlowNodeToIceInFlow
													.hasNext()) {
												try {
													iceInFlow = (SequenceFlow) fujaba__IterFlowNodeToIceInFlow
															.next();

													// check object iceInFlow is really bound
													JavaSDM.ensure(iceInFlow != null);
													// check isomorphic binding between objects inFlow and iceInFlow 
													JavaSDM.ensure(!inFlow
															.equals(iceInFlow));

													// bind object
													_TmpObject = iceInFlow
															.getSourceRef();

													// ensure correct type and really bound of object evGw
													JavaSDM.ensure(_TmpObject instanceof EventBasedGateway);
													evGw = (EventBasedGateway) _TmpObject;

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
															// bind object
															flow = inFlowToFlow
																	.getTarget();

															// check object flow is really bound
															JavaSDM.ensure(flow != null);

															// story node 'solve CSP'
															try {
																fujaba__Success = false;

																_TmpObject = (this
																		.generateModel_solveCsp_BWD(
																				isApplicableMatch,
																				flowNode,
																				iceInFlow,
																				evGw,
																				lane,
																				task,
																				actor,
																				laneToActor,
																				inFlow,
																				process,
																				outFlow,
																				normalStep,
																				taskToNormalStep,
																				outFlowToFlow,
																				outFlowToNormalStep,
																				inFlowToFlow,
																				flow,
																				laneSet,
																				ruleResult));

																// ensure correct type and really bound of object csp
																JavaSDM.ensure(_TmpObject instanceof CSP);
																csp = (CSP) _TmpObject;
																fujaba__Success = true;
															} catch (JavaSDMException fujaba__InternalException) {
																fujaba__Success = false;
															}

															// statement node 'check CSP'
															fujaba__Success = this
																	.generateModel_checkCsp_BWD(csp);
															if (fujaba__Success) {
																// story node 'perform'
																try {
																	fujaba__Success = false;

																	// check object actor is really bound
																	JavaSDM.ensure(actor != null);
																	// check object evGw is really bound
																	JavaSDM.ensure(evGw != null);
																	// check object flow is really bound
																	JavaSDM.ensure(flow != null);
																	// check object flowNode is really bound
																	JavaSDM.ensure(flowNode != null);
																	// check object iceInFlow is really bound
																	JavaSDM.ensure(iceInFlow != null);
																	// check object inFlow is really bound
																	JavaSDM.ensure(inFlow != null);
																	// check object inFlowToFlow is really bound
																	JavaSDM.ensure(inFlowToFlow != null);
																	// check object lane is really bound
																	JavaSDM.ensure(lane != null);
																	// check object laneSet is really bound
																	JavaSDM.ensure(laneSet != null);
																	// check object laneToActor is really bound
																	JavaSDM.ensure(laneToActor != null);
																	// check object process is really bound
																	JavaSDM.ensure(process != null);
																	// check object ruleResult is really bound
																	JavaSDM.ensure(ruleResult != null);
																	// check isomorphic binding between objects inFlow and iceInFlow 
																	JavaSDM.ensure(!inFlow
																			.equals(iceInFlow));

																	// create object task
																	task = Bpmn2Factory.eINSTANCE
																			.createUserTask();

																	// create object outFlow
																	outFlow = Bpmn2Factory.eINSTANCE
																			.createSequenceFlow();

																	// create object taskToNormalStep
																	taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																			.createFlowNodeToStep();

																	// create object normalStep
																	normalStep = UseCaseDSLFactory.eINSTANCE
																			.createNormalStep();

																	// create object outFlowToNormalStep
																	outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																			.createSequenceFlowToStep();

																	// create object outFlowToFlow
																	outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																			.createSequenceFlowToUCFlow();

																	// assign attribute task
																	task.setId((java.lang.String) csp
																			.getAttributeVariable(
																					"task",
																					"id")
																			.getValue());
																	// assign attribute task
																	task.setName((java.lang.String) csp
																			.getAttributeVariable(
																					"task",
																					"name")
																			.getValue());
																	// assign attribute normalStep
																	normalStep
																			.setName((java.lang.String) csp
																					.getAttributeVariable(
																							"normalStep",
																							"name")
																					.getValue());
																	// assign attribute normalStep
																	normalStep
																			.setLabel((java.lang.String) csp
																					.getAttributeVariable(
																							"normalStep",
																							"label")
																					.getValue());
																	// assign attribute ruleResult
																	ruleResult
																			.setSuccess(true);

																	// create link
																	outFlow.setSourceRef(task);

																	// create link
																	inFlow.setTargetRef(task);

																	// create link
																	taskToNormalStep
																			.setSource(task);

																	// create link
																	process.getFlowElements()
																			.add(task);

																	// create link
																	ruleResult
																			.getSourceObjects()
																			.add(task);

																	// create link
																	normalStep
																			.setActor(actor);

																	// create link
																	process.getFlowElements()
																			.add(outFlow); // add link

																	// create link
																	ruleResult
																			.getSourceObjects()
																			.add(outFlow);

																	// create link
																	outFlowToNormalStep
																			.setSource(outFlow);

																	// create link
																	outFlowToFlow
																			.setSource(outFlow);

																	// create link
																	taskToNormalStep
																			.setTarget(normalStep);

																	// create link
																	outFlowToNormalStep
																			.setTarget(normalStep);

																	// create link
																	ruleResult
																			.getTargetObjects()
																			.add(normalStep);

																	// create link
																	flow.getSteps()
																			.add(normalStep);

																	// create link
																	ruleResult
																			.getCorrObjects()
																			.add(taskToNormalStep);

																	// create link
																	org.moflon.util.eMoflonEMFUtil
																			.addOppositeReference(
																					outFlowToFlow,
																					flow,
																					"target");

																	// create link
																	ruleResult
																			.getCorrObjects()
																			.add(outFlowToFlow);

																	// create link
																	ruleResult
																			.getCorrObjects()
																			.add(outFlowToNormalStep);

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																return ruleResult;

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", csp);
		var_task_id.setType("");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", csp);
		var_task_name.setType("");
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
		eq.solve(var_task_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_task_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("iceInFlow", iceInFlow);
		isApplicableMatch.registerObject("evGw", evGw);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("laneToActor", laneToActor);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
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
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (UserTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(bpmn2.Process) arguments.get(7),
					(SequenceFlow) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (UserTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(bpmn2.Process) arguments.get(7),
					(SequenceFlow) arguments.get(8), (LaneSet) arguments.get(9));
			return null;
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (UserTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(bpmn2.Process) arguments.get(7),
					(SequenceFlow) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_USERTASK_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (UserTask) arguments.get(5),
					(Actor) arguments.get(6), (LaneToActor) arguments.get(7),
					(SequenceFlow) arguments.get(8),
					(bpmn2.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(Flow) arguments.get(12), (LaneSet) arguments.get(13));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17));
			return null;
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (Actor) arguments.get(5),
					(LaneToActor) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(bpmn2.Process) arguments.get(8),
					(NormalStep) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10),
					(Flow) arguments.get(11), (LaneSet) arguments.get(12));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17));
			return null;
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_223__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_223((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_224__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_224((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_225__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_225((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_226__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_226((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_227__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_227((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_228__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_228((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_70__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_70((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_71((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_LANETOACTOR:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(LaneToActor) arguments.get(1));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_USERTASK_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_NORMALSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (UserTask) arguments.get(5),
					(Actor) arguments.get(6), (LaneToActor) arguments.get(7),
					(SequenceFlow) arguments.get(8),
					(bpmn2.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10),
					(NormalStep) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SequenceFlowToUCFlow) arguments.get(13),
					(SequenceFlowToStep) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(Flow) arguments.get(16), (LaneSet) arguments.get(17),
					(ModelgeneratorRuleResult) arguments.get(18));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserTaskToStepAfterEvGwRuleImpl
