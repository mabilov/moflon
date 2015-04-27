/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.LaneToActor;

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterEvGwRule;

import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;

import TGGLanguage.csp.CSP;

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
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.SequenceFlow;
import bpmn2.UserTask;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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
		// initial bindings
		Object[] result1_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_0_1_blackBBBBBBBBBBB(this,
						match, flowNode, iceInFlow, evGw, lane, task, inFlow,
						process, outFlow, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
						this, match, flowNode, iceInFlow, evGw, lane, task,
						inFlow, process, outFlow, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_4_blackBBBBBBBBBB(
							match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_4_greenBBBBBBFFFFFFF(
							match, lane, task, inFlow, process, outFlow);
			// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result4_green[6];
			// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[9];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[10];
			// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result4_green[11];
			// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_5_blackBBBBBBBBBB(
							match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_5_greenBBBBBBBBFFFFFFFFFF(
							match, flowNode, iceInFlow, evGw, lane, inFlow,
							process, laneSet);
			// EMoflonEdge iceInFlow__flowNode____targetRef = (EMoflonEdge) result5_green[8];
			// EMoflonEdge flowNode__iceInFlow____incoming = (EMoflonEdge) result5_green[9];
			// EMoflonEdge iceInFlow__evGw____sourceRef = (EMoflonEdge) result5_green[10];
			// EMoflonEdge evGw__iceInFlow____outgoing = (EMoflonEdge) result5_green[11];
			// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result5_green[12];
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[13];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[14];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[15];
			// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result5_green[16];
			// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result5_green[17];

			// register objects to match
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_6_expressionBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet);
			return UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_7_expressionF();
		} else {
			return UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result1_bindingAndBlack[0];
		SequenceFlow iceInFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway evGw = (EventBasedGateway) result1_bindingAndBlack[2];
		Lane lane = (Lane) result1_bindingAndBlack[3];
		UserTask task = (UserTask) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		LaneToActor laneToActor = (LaneToActor) result1_bindingAndBlack[6];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[7];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[8];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[9];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[10];
		Flow flow = (Flow) result1_bindingAndBlack[11];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_1_greenBBBFFFFBB(task,
						actor, outFlow, flow, csp);
		NormalStep normalStep = (NormalStep) result1_green[3];
		FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result1_green[4];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[5];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_2_blackBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_2_greenFBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_3_blackBBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, iceInFlow, evGw, lane, task,
						actor, laneToActor, inFlow, process, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, lane, task, actor, inFlow, process,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, flow);
		// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[19];
		// EMoflonEdge taskToNormalStep__task____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge taskToNormalStep__normalStep____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, iceInFlow, evGw, lane,
						task, actor, laneToActor, inFlow, process, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet);
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_2_2_bindingFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_binding[0];
		SequenceFlow iceInFlow = (SequenceFlow) result2_binding[1];
		EventBasedGateway evGw = (EventBasedGateway) result2_binding[2];
		Lane lane = (Lane) result2_binding[3];
		UserTask task = (UserTask) result2_binding[4];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[5];
		bpmn2.Process process = (bpmn2.Process) result2_binding[6];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[7];
		LaneSet laneSet = (LaneSet) result2_binding[8];
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_2_2_blackBBBBBFFBBBFFBB(
						flowNode, iceInFlow, evGw, lane, task, inFlow, process,
						outFlow, laneSet, match)) {
			Actor actor = (Actor) result2_black[5];
			LaneToActor laneToActor = (LaneToActor) result2_black[6];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[10];
			Flow flow = (Flow) result2_black[11];
			// ForEach find context
			for (Object[] result3_black : UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_2_3_blackBBBBBBBBBBBBB(
							flowNode, iceInFlow, evGw, lane, task, actor,
							laneToActor, inFlow, process, outFlow,
							inFlowToFlow, flow, laneSet)) {
				Object[] result3_green = UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
								flowNode, iceInFlow, evGw, lane, task, actor,
								laneToActor, inFlow, process, outFlow,
								inFlowToFlow, flow, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge iceInFlow__flowNode____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flowNode__iceInFlow____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge iceInFlow__evGw____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge evGw__iceInFlow____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[18];
				// EMoflonEdge laneToActor__lane____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge laneToActor__actor____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[27];
				// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[28];
				// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[29];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[30];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[31];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[32];
				// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result3_green[33];
				// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result3_green[34];

				// solve CSP
				Object[] result4_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, iceInFlow,
								evGw, lane, task, actor, laneToActor, inFlow,
								process, outFlow, inFlowToFlow, flow, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_2_7_expressionFB(ruleresult);
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
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

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
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", true, csp);
		var_task_name.setValue(task.getName());
		var_task_name.setType("String");

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");

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
		// initial bindings
		Object[] result1_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_10_1_blackBBBBB(this,
						match, actor, normalStep, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_10_2_bindingAndBlackFBBBBB(
						this, match, actor, normalStep, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_4_blackBBBB(match,
							actor, normalStep, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_4_greenBBBBFF(
							match, actor, normalStep, flow);
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_5_blackBBBB(match,
							actor, normalStep, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_5_greenBBB(match,
							actor, flow);

			// register objects to match
			UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_6_expressionBBBBB(
							this, match, actor, normalStep, flow);
			return UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_7_expressionF();
		} else {
			return UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result1_bindingAndBlack[0];
		SequenceFlow iceInFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway evGw = (EventBasedGateway) result1_bindingAndBlack[2];
		Lane lane = (Lane) result1_bindingAndBlack[3];
		Actor actor = (Actor) result1_bindingAndBlack[4];
		LaneToActor laneToActor = (LaneToActor) result1_bindingAndBlack[5];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[6];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[7];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[8];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[9];
		Flow flow = (Flow) result1_bindingAndBlack[10];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_1_greenBFBBFBFFFBB(
						lane, inFlow, process, normalStep, flow, csp);
		UserTask task = (UserTask) result1_green[1];
		SequenceFlow outFlow = (SequenceFlow) result1_green[4];
		FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result1_green[6];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[7];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[8];

		// collect translated elements
		Object[] result2_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_2_blackBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_2_greenFBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_3_blackBBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, iceInFlow, evGw, lane, task,
						actor, laneToActor, inFlow, process, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, lane, task, actor, inFlow, process,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, flow);
		// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[19];
		// EMoflonEdge taskToNormalStep__task____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge taskToNormalStep__normalStep____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, iceInFlow, evGw, lane,
						task, actor, laneToActor, inFlow, process, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet);
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		NormalStep normalStep = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_12_2_blackFBFFBFBB(actor,
						normalStep, flow, match)) {
			Lane lane = (Lane) result2_black[0];
			LaneToActor laneToActor = (LaneToActor) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_12_3_blackFFFBBBBFBBBF(
							lane, actor, laneToActor, inFlow, normalStep,
							inFlowToFlow, flow)) {
				IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result3_black[0];
				SequenceFlow iceInFlow = (SequenceFlow) result3_black[1];
				EventBasedGateway evGw = (EventBasedGateway) result3_black[2];
				bpmn2.Process process = (bpmn2.Process) result3_black[7];
				LaneSet laneSet = (LaneSet) result3_black[11];
				Object[] result3_green = UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								flowNode, iceInFlow, evGw, lane, actor,
								laneToActor, inFlow, process, normalStep,
								inFlowToFlow, flow, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge iceInFlow__flowNode____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flowNode__iceInFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge iceInFlow__evGw____sourceRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge evGw__iceInFlow____outgoing = (EMoflonEdge) result3_green[16];
				// EMoflonEdge laneToActor__lane____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge laneToActor__actor____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[22];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[25];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[26];
				// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result3_green[28];

				// solve CSP
				Object[] result4_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, iceInFlow,
								evGw, lane, actor, laneToActor, inFlow,
								process, normalStep, inFlowToFlow, flow,
								laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_12_7_expressionFB(ruleresult);
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
			NormalStep normalStep, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

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
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("String");

		// Create unbound variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", csp);
		var_task_id.setType("String");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", csp);
		var_task_name.setType("String");

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_221(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_20_2_blackFFFFFFFFFB(_edge_flowNodeRefs)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_20_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_222(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_21_2_blackFFFFFFFFFB(_edge_targetRef)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_21_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_223(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_22_2_blackFFFFFFFFFB(_edge_incoming)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_22_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_224(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_23_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_23_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_225(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_24_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_24_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_226(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_25_2_blackFFFFFFFFFB(_edge_sourceRef)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_25_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_227(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_26_2_blackFFFFFFFFFB(_edge_outgoing)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			UserTask task = (UserTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			SequenceFlow outFlow = (SequenceFlow) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_26_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, lane, task,
							inFlow, process, outFlow, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_67(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_27_2_blackFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_27_3_expressionFBBBBB(
							this, match, actor, normalStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_68(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_28_2_blackFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_28_3_expressionFBBBBB(
							this, match, actor, normalStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {// TODO: NICO!!!
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {// TODO: NICO!!!
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			LaneToActor laneToActorParameter) {
		// create result
		Object[] result1_black = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_31_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_31_2_blackFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList laneToActorList = (RuleEntryList) result2_black[0];
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[2];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[3];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Lane lane = (Lane) result2_black[6];
			LaneToActor laneToActor = (LaneToActor) result2_black[7];
			Actor actor = (Actor) result2_black[8];
			SequenceFlow inFlow = (SequenceFlow) result2_black[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[10];
			Flow flow = (Flow) result2_black[11];

			// solve CSP
			Object[] result3_bindingAndBlack = UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_31_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, flowNode, iceInFlow, evGw,
							lane, actor, laneToActor, inFlow, process,
							inFlowToFlow, flow, laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UserTaskToStepAfterEvGwRuleImpl
					.pattern_UserTaskToStepAfterEvGwRule_31_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = UserTaskToStepAfterEvGwRuleImpl
						.pattern_UserTaskToStepAfterEvGwRule_31_5_blackBBBBBBBBBBB(
								flowNode, iceInFlow, evGw, lane, actor,
								laneToActor, inFlow, process, inFlowToFlow,
								flow, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_31_6_blackBBBBBBBBBBBB(
									flowNode, iceInFlow, evGw, lane, actor,
									laneToActor, inFlow, process, inFlowToFlow,
									flow, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					UserTaskToStepAfterEvGwRuleImpl
							.pattern_UserTaskToStepAfterEvGwRule_31_6_greenBFBBBFFFFFBBB(
									lane, actor, inFlow, process, flow,
									ruleResult, csp);
					// UserTask task = (UserTask) result6_green[1];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[5];
					// NormalStep normalStep = (NormalStep) result6_green[6];
					// FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result6_green[7];
					// SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result6_green[8];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return UserTaskToStepAfterEvGwRuleImpl
				.pattern_UserTaskToStepAfterEvGwRule_31_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.id", csp);
		var_task_id.setType("String");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_task_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"task.name", csp);
		var_task_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");

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
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
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
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
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
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_221__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_221((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_222__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_222((EMoflonEdge) arguments
					.get(0));
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
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_67__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_67((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_68__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_68((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_LANETOACTOR:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(LaneToActor) arguments.get(1));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(Lane) arguments.get(4), (Actor) arguments.get(5),
					(LaneToActor) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(bpmn2.Process) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Flow) arguments.get(10), (LaneSet) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_1_blackBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { _this, match, flowNode, iceInFlow,
							evGw, lane, task, inFlow, process, outFlow, laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_2_bindingFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				flowNode, iceInFlow, evGw, lane, task, inFlow, process,
				outFlow, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flowNode, iceInFlow, evGw,
					lane, task, inFlow, process, outFlow, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_0_2_binding = pattern_UserTaskToStepAfterEvGwRule_0_2_bindingFBBBBBBBBBBB(
				_this, match, flowNode, iceInFlow, evGw, lane, task, inFlow,
				process, outFlow, laneSet);
		if (result_pattern_UserTaskToStepAfterEvGwRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_0_2_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_0_2_black = pattern_UserTaskToStepAfterEvGwRule_0_2_blackB(csp);
			if (result_pattern_UserTaskToStepAfterEvGwRule_0_2_black != null) {

				return new Object[] { csp, _this, match, flowNode, iceInFlow,
						evGw, lane, task, inFlow, process, outFlow, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_0_3_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_4_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw, Lane lane,
			UserTask task, SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow outFlow, LaneSet laneSet) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { match, flowNode, iceInFlow, evGw,
							lane, task, inFlow, process, outFlow, laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_4_greenBBBBBBFFFFFFF(
			Match match, Lane lane, UserTask task, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow) {
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(task);
		match.getToBeTranslatedNodes().add(outFlow);
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__task____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		match.getToBeTranslatedEdges().add(lane__task____flowNodeRefs);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		match.getToBeTranslatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(task__inFlow____incoming);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		match.getToBeTranslatedEdges().add(process__task____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__task____sourceRef.setSrc(outFlow);
		outFlow__task____sourceRef.setTrg(task);
		match.getToBeTranslatedEdges().add(outFlow__task____sourceRef);
		task__outFlow____outgoing.setSrc(task);
		task__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(task__outFlow____outgoing);
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__task____sourceRef
				.setName(outFlow__task____sourceRef_name_prime);
		task__outFlow____outgoing.setName(task__outFlow____outgoing_name_prime);
		return new Object[] { match, lane, task, inFlow, process, outFlow,
				lane__task____flowNodeRefs, inFlow__task____targetRef,
				task__inFlow____incoming, process__task____flowElements,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_5_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw, Lane lane,
			UserTask task, SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow outFlow, LaneSet laneSet) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { match, flowNode, iceInFlow, evGw,
							lane, task, inFlow, process, outFlow, laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_0_5_greenBBBBBBBBFFFFFFFFFF(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw, Lane lane,
			SequenceFlow inFlow, bpmn2.Process process, LaneSet laneSet) {
		EMoflonEdge iceInFlow__flowNode____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__iceInFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceInFlow__evGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge evGw__iceInFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__flowNode____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(flowNode);
		match.getContextNodes().add(iceInFlow);
		match.getContextNodes().add(evGw);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(laneSet);
		String iceInFlow__flowNode____targetRef_name_prime = "targetRef";
		String flowNode__iceInFlow____incoming_name_prime = "incoming";
		String iceInFlow__evGw____sourceRef_name_prime = "sourceRef";
		String evGw__iceInFlow____outgoing_name_prime = "outgoing";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		iceInFlow__flowNode____targetRef.setSrc(iceInFlow);
		iceInFlow__flowNode____targetRef.setTrg(flowNode);
		match.getContextEdges().add(iceInFlow__flowNode____targetRef);
		flowNode__iceInFlow____incoming.setSrc(flowNode);
		flowNode__iceInFlow____incoming.setTrg(iceInFlow);
		match.getContextEdges().add(flowNode__iceInFlow____incoming);
		iceInFlow__evGw____sourceRef.setSrc(iceInFlow);
		iceInFlow__evGw____sourceRef.setTrg(evGw);
		match.getContextEdges().add(iceInFlow__evGw____sourceRef);
		evGw__iceInFlow____outgoing.setSrc(evGw);
		evGw__iceInFlow____outgoing.setTrg(iceInFlow);
		match.getContextEdges().add(evGw__iceInFlow____outgoing);
		process__flowNode____flowElements.setSrc(process);
		process__flowNode____flowElements.setTrg(flowNode);
		match.getContextEdges().add(process__flowNode____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		match.getContextEdges().add(inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		match.getContextEdges().add(flowNode__inFlow____outgoing);
		iceInFlow__flowNode____targetRef
				.setName(iceInFlow__flowNode____targetRef_name_prime);
		flowNode__iceInFlow____incoming
				.setName(flowNode__iceInFlow____incoming_name_prime);
		iceInFlow__evGw____sourceRef
				.setName(iceInFlow__evGw____sourceRef_name_prime);
		evGw__iceInFlow____outgoing
				.setName(evGw__iceInFlow____outgoing_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		return new Object[] { match, flowNode, iceInFlow, evGw, lane, inFlow,
				process, laneSet, iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing };
	}

	public static final void pattern_UserTaskToStepAfterEvGwRule_0_6_expressionBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, flowNode, iceInFlow, evGw,
				lane, task, inFlow, process, outFlow, laneSet);

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("iceInFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("evGw");
		EObject _localVariable_3 = isApplicableMatch.getObject("lane");
		EObject _localVariable_4 = isApplicableMatch.getObject("task");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch.getObject("laneToActor");
		EObject _localVariable_7 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_8 = isApplicableMatch.getObject("process");
		EObject _localVariable_9 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_10 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_11 = isApplicableMatch.getObject("flow");
		EObject _localVariable_12 = isApplicableMatch.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		EObject tmpTask = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpLaneToActor = _localVariable_6;
		EObject tmpInFlow = _localVariable_7;
		EObject tmpProcess = _localVariable_8;
		EObject tmpOutFlow = _localVariable_9;
		EObject tmpInFlowToFlow = _localVariable_10;
		EObject tmpFlow = _localVariable_11;
		EObject tmpLaneSet = _localVariable_12;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						if (tmpTask instanceof UserTask) {
							UserTask task = (UserTask) tmpTask;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpLaneToActor instanceof LaneToActor) {
									LaneToActor laneToActor = (LaneToActor) tmpLaneToActor;
									if (tmpInFlow instanceof SequenceFlow) {
										SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
										if (tmpProcess instanceof bpmn2.Process) {
											bpmn2.Process process = (bpmn2.Process) tmpProcess;
											if (tmpOutFlow instanceof SequenceFlow) {
												SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
												if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
													SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
													if (tmpFlow instanceof Flow) {
														Flow flow = (Flow) tmpFlow;
														if (tmpLaneSet instanceof LaneSet) {
															LaneSet laneSet = (LaneSet) tmpLaneSet;
															return new Object[] {
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
																	inFlowToFlow,
																	flow,
																	laneSet,
																	isApplicableMatch };
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { flowNode, iceInFlow, evGw,
									lane, task, actor, laneToActor, inFlow,
									process, outFlow, inFlowToFlow, flow,
									laneSet, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding = pattern_UserTaskToStepAfterEvGwRule_1_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding != null) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[0];
			SequenceFlow iceInFlow = (SequenceFlow) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[1];
			EventBasedGateway evGw = (EventBasedGateway) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[2];
			Lane lane = (Lane) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[3];
			UserTask task = (UserTask) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[4];
			Actor actor = (Actor) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[5];
			LaneToActor laneToActor = (LaneToActor) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[6];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[7];
			bpmn2.Process process = (bpmn2.Process) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[8];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[10];
			Flow flow = (Flow) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[11];
			LaneSet laneSet = (LaneSet) result_pattern_UserTaskToStepAfterEvGwRule_1_1_binding[12];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_1_1_black = pattern_UserTaskToStepAfterEvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
					flowNode, iceInFlow, evGw, lane, task, actor, laneToActor,
					inFlow, process, outFlow, inFlowToFlow, flow, laneSet,
					_this, isApplicableMatch);
			if (result_pattern_UserTaskToStepAfterEvGwRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_1_1_black[13];

				return new Object[] { flowNode, iceInFlow, evGw, lane, task,
						actor, laneToActor, inFlow, process, outFlow,
						inFlowToFlow, flow, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_1_greenBBBFFFFBB(
			UserTask task, Actor actor, SequenceFlow outFlow, Flow flow, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		FlowNodeToStep taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		taskToNormalStep.setSource(task);
		taskToNormalStep.setTarget(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		return new Object[] { task, actor, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep, flow, csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_2_blackBBBBBB(
			UserTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { task, outFlow, normalStep, taskToNormalStep,
				outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_2_greenFBBBBBB(
			UserTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(task);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(taskToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, task, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_3_blackBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject iceInFlow,
			EObject evGw, EObject lane, EObject task, EObject actor,
			EObject laneToActor, EObject inFlow, EObject process,
			EObject outFlow, EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep,
			EObject inFlowToFlow, EObject flow, EObject laneSet) {
		if (!flowNode.equals(iceInFlow)) {
			if (!flowNode.equals(lane)) {
				if (!flowNode.equals(task)) {
					if (!flowNode.equals(laneToActor)) {
						if (!flowNode.equals(inFlow)) {
							if (!flowNode.equals(process)) {
								if (!flowNode.equals(outFlow)) {
									if (!flowNode.equals(normalStep)) {
										if (!flowNode.equals(taskToNormalStep)) {
											if (!flowNode.equals(outFlowToFlow)) {
												if (!flowNode
														.equals(outFlowToNormalStep)) {
													if (!flowNode
															.equals(inFlowToFlow)) {
														if (!flowNode
																.equals(laneSet)) {
															if (!iceInFlow
																	.equals(lane)) {
																if (!iceInFlow
																		.equals(task)) {
																	if (!iceInFlow
																			.equals(laneToActor)) {
																		if (!iceInFlow
																				.equals(inFlow)) {
																			if (!iceInFlow
																					.equals(process)) {
																				if (!iceInFlow
																						.equals(outFlow)) {
																					if (!iceInFlow
																							.equals(normalStep)) {
																						if (!iceInFlow
																								.equals(taskToNormalStep)) {
																							if (!iceInFlow
																									.equals(outFlowToFlow)) {
																								if (!iceInFlow
																										.equals(outFlowToNormalStep)) {
																									if (!iceInFlow
																											.equals(inFlowToFlow)) {
																										if (!iceInFlow
																												.equals(laneSet)) {
																											if (!evGw
																													.equals(flowNode)) {
																												if (!evGw
																														.equals(iceInFlow)) {
																													if (!evGw
																															.equals(lane)) {
																														if (!evGw
																																.equals(task)) {
																															if (!evGw
																																	.equals(laneToActor)) {
																																if (!evGw
																																		.equals(inFlow)) {
																																	if (!evGw
																																			.equals(process)) {
																																		if (!evGw
																																				.equals(outFlow)) {
																																			if (!evGw
																																					.equals(normalStep)) {
																																				if (!evGw
																																						.equals(taskToNormalStep)) {
																																					if (!evGw
																																							.equals(outFlowToFlow)) {
																																						if (!evGw
																																								.equals(outFlowToNormalStep)) {
																																							if (!evGw
																																									.equals(inFlowToFlow)) {
																																								if (!evGw
																																										.equals(flow)) {
																																									if (!evGw
																																											.equals(laneSet)) {
																																										if (!lane
																																												.equals(task)) {
																																											if (!lane
																																													.equals(laneToActor)) {
																																												if (!lane
																																														.equals(process)) {
																																													if (!lane
																																															.equals(outFlow)) {
																																														if (!lane
																																																.equals(normalStep)) {
																																															if (!lane
																																																	.equals(taskToNormalStep)) {
																																																if (!lane
																																																		.equals(outFlowToFlow)) {
																																																	if (!lane
																																																			.equals(outFlowToNormalStep)) {
																																																		if (!lane
																																																				.equals(laneSet)) {
																																																			if (!task
																																																					.equals(taskToNormalStep)) {
																																																				if (!actor
																																																						.equals(flowNode)) {
																																																					if (!actor
																																																							.equals(iceInFlow)) {
																																																						if (!actor
																																																								.equals(evGw)) {
																																																							if (!actor
																																																									.equals(lane)) {
																																																								if (!actor
																																																										.equals(task)) {
																																																									if (!actor
																																																											.equals(laneToActor)) {
																																																										if (!actor
																																																												.equals(inFlow)) {
																																																											if (!actor
																																																													.equals(process)) {
																																																												if (!actor
																																																														.equals(outFlow)) {
																																																													if (!actor
																																																															.equals(normalStep)) {
																																																														if (!actor
																																																																.equals(taskToNormalStep)) {
																																																															if (!actor
																																																																	.equals(outFlowToFlow)) {
																																																																if (!actor
																																																																		.equals(outFlowToNormalStep)) {
																																																																	if (!actor
																																																																			.equals(inFlowToFlow)) {
																																																																		if (!actor
																																																																				.equals(flow)) {
																																																																			if (!actor
																																																																					.equals(laneSet)) {
																																																																				if (!laneToActor
																																																																						.equals(task)) {
																																																																					if (!laneToActor
																																																																							.equals(process)) {
																																																																						if (!laneToActor
																																																																								.equals(outFlow)) {
																																																																							if (!laneToActor
																																																																									.equals(normalStep)) {
																																																																								if (!laneToActor
																																																																										.equals(taskToNormalStep)) {
																																																																									if (!laneToActor
																																																																											.equals(outFlowToFlow)) {
																																																																										if (!laneToActor
																																																																												.equals(outFlowToNormalStep)) {
																																																																											if (!inFlow
																																																																													.equals(lane)) {
																																																																												if (!inFlow
																																																																														.equals(task)) {
																																																																													if (!inFlow
																																																																															.equals(laneToActor)) {
																																																																														if (!inFlow
																																																																																.equals(process)) {
																																																																															if (!inFlow
																																																																																	.equals(outFlow)) {
																																																																																if (!inFlow
																																																																																		.equals(normalStep)) {
																																																																																	if (!inFlow
																																																																																			.equals(taskToNormalStep)) {
																																																																																		if (!inFlow
																																																																																				.equals(outFlowToFlow)) {
																																																																																			if (!inFlow
																																																																																					.equals(outFlowToNormalStep)) {
																																																																																				if (!inFlow
																																																																																						.equals(inFlowToFlow)) {
																																																																																					if (!inFlow
																																																																																							.equals(laneSet)) {
																																																																																						if (!process
																																																																																								.equals(task)) {
																																																																																							if (!process
																																																																																									.equals(taskToNormalStep)) {
																																																																																								if (!outFlow
																																																																																										.equals(task)) {
																																																																																									if (!outFlow
																																																																																											.equals(process)) {
																																																																																										if (!outFlow
																																																																																												.equals(taskToNormalStep)) {
																																																																																											if (!outFlow
																																																																																													.equals(outFlowToFlow)) {
																																																																																												if (!outFlow
																																																																																														.equals(outFlowToNormalStep)) {
																																																																																													if (!normalStep
																																																																																															.equals(task)) {
																																																																																														if (!normalStep
																																																																																																.equals(process)) {
																																																																																															if (!normalStep
																																																																																																	.equals(outFlow)) {
																																																																																																if (!normalStep
																																																																																																		.equals(taskToNormalStep)) {
																																																																																																	if (!normalStep
																																																																																																			.equals(outFlowToFlow)) {
																																																																																																		if (!normalStep
																																																																																																				.equals(outFlowToNormalStep)) {
																																																																																																			if (!outFlowToFlow
																																																																																																					.equals(task)) {
																																																																																																				if (!outFlowToFlow
																																																																																																						.equals(process)) {
																																																																																																					if (!outFlowToFlow
																																																																																																							.equals(taskToNormalStep)) {
																																																																																																						if (!outFlowToFlow
																																																																																																								.equals(outFlowToNormalStep)) {
																																																																																																							if (!outFlowToNormalStep
																																																																																																									.equals(task)) {
																																																																																																								if (!outFlowToNormalStep
																																																																																																										.equals(process)) {
																																																																																																									if (!outFlowToNormalStep
																																																																																																											.equals(taskToNormalStep)) {
																																																																																																										if (!inFlowToFlow
																																																																																																												.equals(lane)) {
																																																																																																											if (!inFlowToFlow
																																																																																																													.equals(task)) {
																																																																																																												if (!inFlowToFlow
																																																																																																														.equals(laneToActor)) {
																																																																																																													if (!inFlowToFlow
																																																																																																															.equals(process)) {
																																																																																																														if (!inFlowToFlow
																																																																																																																.equals(outFlow)) {
																																																																																																															if (!inFlowToFlow
																																																																																																																	.equals(normalStep)) {
																																																																																																																if (!inFlowToFlow
																																																																																																																		.equals(taskToNormalStep)) {
																																																																																																																	if (!inFlowToFlow
																																																																																																																			.equals(outFlowToFlow)) {
																																																																																																																		if (!inFlowToFlow
																																																																																																																				.equals(outFlowToNormalStep)) {
																																																																																																																			if (!inFlowToFlow
																																																																																																																					.equals(laneSet)) {
																																																																																																																				if (!flow
																																																																																																																						.equals(flowNode)) {
																																																																																																																					if (!flow
																																																																																																																							.equals(iceInFlow)) {
																																																																																																																						if (!flow
																																																																																																																								.equals(lane)) {
																																																																																																																							if (!flow
																																																																																																																									.equals(task)) {
																																																																																																																								if (!flow
																																																																																																																										.equals(laneToActor)) {
																																																																																																																									if (!flow
																																																																																																																											.equals(inFlow)) {
																																																																																																																										if (!flow
																																																																																																																												.equals(process)) {
																																																																																																																											if (!flow
																																																																																																																													.equals(outFlow)) {
																																																																																																																												if (!flow
																																																																																																																														.equals(normalStep)) {
																																																																																																																													if (!flow
																																																																																																																															.equals(taskToNormalStep)) {
																																																																																																																														if (!flow
																																																																																																																																.equals(outFlowToFlow)) {
																																																																																																																															if (!flow
																																																																																																																																	.equals(outFlowToNormalStep)) {
																																																																																																																																if (!flow
																																																																																																																																		.equals(inFlowToFlow)) {
																																																																																																																																	if (!flow
																																																																																																																																			.equals(laneSet)) {
																																																																																																																																		if (!laneSet
																																																																																																																																				.equals(task)) {
																																																																																																																																			if (!laneSet
																																																																																																																																					.equals(laneToActor)) {
																																																																																																																																				if (!laneSet
																																																																																																																																						.equals(process)) {
																																																																																																																																					if (!laneSet
																																																																																																																																							.equals(outFlow)) {
																																																																																																																																						if (!laneSet
																																																																																																																																								.equals(normalStep)) {
																																																																																																																																							if (!laneSet
																																																																																																																																									.equals(taskToNormalStep)) {
																																																																																																																																								if (!laneSet
																																																																																																																																										.equals(outFlowToFlow)) {
																																																																																																																																									if (!laneSet
																																																																																																																																											.equals(outFlowToNormalStep)) {
																																																																																																																																										return new Object[] {
																																																																																																																																												ruleresult,
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
																																																																																																																																												laneSet };
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject lane, EObject task,
			EObject actor, EObject inFlow, EObject process, EObject outFlow,
			EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep, EObject flow) {
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge taskToNormalStep__task____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge taskToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserTaskToStepAfterEvGwRule";
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__task____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		String normalStep__actor____actor_name_prime = "actor";
		String taskToNormalStep__task____source_name_prime = "source";
		String taskToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		ruleresult.getTranslatedEdges().add(lane__task____flowNodeRefs);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(task__inFlow____incoming);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getTranslatedEdges().add(process__task____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__task____sourceRef.setSrc(outFlow);
		outFlow__task____sourceRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(outFlow__task____sourceRef);
		task__outFlow____outgoing.setSrc(task);
		task__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(task__outFlow____outgoing);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(normalStep__actor____actor);
		taskToNormalStep__task____source.setSrc(taskToNormalStep);
		taskToNormalStep__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(taskToNormalStep__task____source);
		taskToNormalStep__normalStep____target.setSrc(taskToNormalStep);
		taskToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges()
				.add(taskToNormalStep__normalStep____target);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(flow__normalStep____steps);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__task____sourceRef
				.setName(outFlow__task____sourceRef_name_prime);
		task__outFlow____outgoing.setName(task__outFlow____outgoing_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		taskToNormalStep__task____source
				.setName(taskToNormalStep__task____source_name_prime);
		taskToNormalStep__normalStep____target
				.setName(taskToNormalStep__normalStep____target_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { ruleresult, lane, task, actor, inFlow, process,
				outFlow, normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, lane__task____flowNodeRefs,
				inFlow__task____targetRef, task__inFlow____incoming,
				process__task____flowElements,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, normalStep__actor____actor,
				taskToNormalStep__task____source,
				taskToNormalStep__normalStep____target,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps };
	}

	public static final void pattern_UserTaskToStepAfterEvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject lane,
			EObject task, EObject actor, EObject laneToActor, EObject inFlow,
			EObject process, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, flowNode, iceInFlow, evGw, lane,
				task, actor, laneToActor, inFlow, process, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
				inFlowToFlow, flow, laneSet);

	}

	public static final PerformRuleResult pattern_UserTaskToStepAfterEvGwRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_1_blackFBB(
			EClass eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_2_1_binding = pattern_UserTaskToStepAfterEvGwRule_2_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_2_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_2_1_black = pattern_UserTaskToStepAfterEvGwRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserTaskToStepAfterEvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_2_bindingFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("flowNode");
		EObject _localVariable_1 = match.getObject("iceInFlow");
		EObject _localVariable_2 = match.getObject("evGw");
		EObject _localVariable_3 = match.getObject("lane");
		EObject _localVariable_4 = match.getObject("task");
		EObject _localVariable_5 = match.getObject("inFlow");
		EObject _localVariable_6 = match.getObject("process");
		EObject _localVariable_7 = match.getObject("outFlow");
		EObject _localVariable_8 = match.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		EObject tmpTask = _localVariable_4;
		EObject tmpInFlow = _localVariable_5;
		EObject tmpProcess = _localVariable_6;
		EObject tmpOutFlow = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						if (tmpTask instanceof UserTask) {
							UserTask task = (UserTask) tmpTask;
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (tmpOutFlow instanceof SequenceFlow) {
										SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											return new Object[] { flowNode,
													iceInFlow, evGw, lane,
													task, inFlow, process,
													outFlow, laneSet, match };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_2_2_blackBBBBBFFBBBFFBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					for (LaneToActor laneToActor : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(lane, LaneToActor.class,
									"source")) {
						Actor actor = laneToActor.getTarget();
						if (actor != null) {
							for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(inFlow,
											SequenceFlowToUCFlow.class,
											"source")) {
								Flow flow = inFlowToFlow.getTarget();
								if (flow != null) {
									_result.add(new Object[] { flowNode,
											iceInFlow, evGw, lane, task, actor,
											laneToActor, inFlow, process,
											outFlow, inFlowToFlow, flow,
											laneSet, match });
								}

							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_2_3_blackBBBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					if (flowNode.equals(iceInFlow.getTargetRef())) {
						if (evGw.equals(iceInFlow.getSourceRef())) {
							if (lane.getFlowNodeRefs().contains(task)) {
								if (lane.equals(laneToActor.getSource())) {
									if (actor.equals(laneToActor.getTarget())) {
										if (task.equals(inFlow.getTargetRef())) {
											if (process.getFlowElements()
													.contains(flowNode)) {
												if (process.getLaneSets()
														.contains(laneSet)) {
													if (process
															.getFlowElements()
															.contains(inFlow)) {
														if (process
																.getFlowElements()
																.contains(task)) {
															if (process
																	.getFlowElements()
																	.contains(
																			outFlow)) {
																if (task.equals(outFlow
																		.getSourceRef())) {
																	if (inFlow
																			.equals(inFlowToFlow
																					.getSource())) {
																		if (flow.equals(inFlowToFlow
																				.getTarget())) {
																			if (laneSet
																					.getLanes()
																					.contains(
																							lane)) {
																				if (flowNode
																						.equals(inFlow
																								.getSourceRef())) {
																					_result.add(new Object[] {
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
																							inFlowToFlow,
																							flow,
																							laneSet });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge iceInFlow__flowNode____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__iceInFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceInFlow__evGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge evGw__iceInFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__lane____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__flowNode____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String iceInFlow__flowNode____targetRef_name_prime = "targetRef";
		String flowNode__iceInFlow____incoming_name_prime = "incoming";
		String iceInFlow__evGw____sourceRef_name_prime = "sourceRef";
		String evGw__iceInFlow____outgoing_name_prime = "outgoing";
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneToActor__lane____source_name_prime = "source";
		String laneToActor__actor____target_name_prime = "target";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__task____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(iceInFlow);
		isApplicableMatch.getAllContextElements().add(evGw);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(laneToActor);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		iceInFlow__flowNode____targetRef.setSrc(iceInFlow);
		iceInFlow__flowNode____targetRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				iceInFlow__flowNode____targetRef);
		flowNode__iceInFlow____incoming.setSrc(flowNode);
		flowNode__iceInFlow____incoming.setTrg(iceInFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__iceInFlow____incoming);
		iceInFlow__evGw____sourceRef.setSrc(iceInFlow);
		iceInFlow__evGw____sourceRef.setTrg(evGw);
		isApplicableMatch.getAllContextElements().add(
				iceInFlow__evGw____sourceRef);
		evGw__iceInFlow____outgoing.setSrc(evGw);
		evGw__iceInFlow____outgoing.setTrg(iceInFlow);
		isApplicableMatch.getAllContextElements().add(
				evGw__iceInFlow____outgoing);
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				lane__task____flowNodeRefs);
		laneToActor__lane____source.setSrc(laneToActor);
		laneToActor__lane____source.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(
				laneToActor__lane____source);
		laneToActor__actor____target.setSrc(laneToActor);
		laneToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				laneToActor__actor____target);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		isApplicableMatch.getAllContextElements()
				.add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(task__inFlow____incoming);
		process__flowNode____flowElements.setSrc(process);
		process__flowNode____flowElements.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				process__flowNode____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				process__task____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		outFlow__task____sourceRef.setSrc(outFlow);
		outFlow__task____sourceRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				outFlow__task____sourceRef);
		task__outFlow____outgoing.setSrc(task);
		task__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements()
				.add(task__outFlow____outgoing);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__inFlow____outgoing);
		iceInFlow__flowNode____targetRef
				.setName(iceInFlow__flowNode____targetRef_name_prime);
		flowNode__iceInFlow____incoming
				.setName(flowNode__iceInFlow____incoming_name_prime);
		iceInFlow__evGw____sourceRef
				.setName(iceInFlow__evGw____sourceRef_name_prime);
		evGw__iceInFlow____outgoing
				.setName(evGw__iceInFlow____outgoing_name_prime);
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		laneToActor__lane____source
				.setName(laneToActor__lane____source_name_prime);
		laneToActor__actor____target
				.setName(laneToActor__actor____target_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__task____sourceRef
				.setName(outFlow__task____sourceRef_name_prime);
		task__outFlow____outgoing.setName(task__outFlow____outgoing_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		return new Object[] { flowNode, iceInFlow, evGw, lane, task, actor,
				laneToActor, inFlow, process, outFlow, inFlowToFlow, flow,
				laneSet, isApplicableMatch, iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, lane__task____flowNodeRefs,
				laneToActor__lane____source, laneToActor__actor____target,
				inFlow__task____targetRef, task__inFlow____incoming,
				process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__task____flowElements,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, laneSet__lane____lanes,
				inFlow__flowNode____sourceRef, flowNode__inFlow____outgoing };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, lane, task,
				actor, laneToActor, inFlow, process, outFlow, inFlowToFlow,
				flow, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, lane, task, actor, laneToActor, inFlow,
					process, outFlow, inFlowToFlow, flow, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_2_4_binding = pattern_UserTaskToStepAfterEvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, lane,
				task, actor, laneToActor, inFlow, process, outFlow,
				inFlowToFlow, flow, laneSet);
		if (result_pattern_UserTaskToStepAfterEvGwRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_2_4_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_2_4_black = pattern_UserTaskToStepAfterEvGwRule_2_4_blackB(csp);
			if (result_pattern_UserTaskToStepAfterEvGwRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, lane, task, actor, laneToActor,
						inFlow, process, outFlow, inFlowToFlow, flow, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_2_5_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserTaskToStepAfterEvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserTaskToStepAfterEvGwRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_1_blackBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		return new Object[] { _this, match, actor, normalStep, flow };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_2_bindingFBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, actor,
				normalStep, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, normalStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_2_bindingAndBlackFBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_10_2_binding = pattern_UserTaskToStepAfterEvGwRule_10_2_bindingFBBBBB(
				_this, match, actor, normalStep, flow);
		if (result_pattern_UserTaskToStepAfterEvGwRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_10_2_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_10_2_black = pattern_UserTaskToStepAfterEvGwRule_10_2_blackB(csp);
			if (result_pattern_UserTaskToStepAfterEvGwRule_10_2_black != null) {

				return new Object[] { csp, _this, match, actor, normalStep,
						flow };
			}
		}
		return null;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_10_3_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_4_blackBBBB(
			Match match, Actor actor, NormalStep normalStep, Flow flow) {
		return new Object[] { match, actor, normalStep, flow };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_4_greenBBBBFF(
			Match match, Actor actor, NormalStep normalStep, Flow flow) {
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(normalStep);
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(flow__normalStep____steps);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, actor, normalStep, flow,
				normalStep__actor____actor, flow__normalStep____steps };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_5_blackBBBB(
			Match match, Actor actor, NormalStep normalStep, Flow flow) {
		return new Object[] { match, actor, normalStep, flow };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_10_5_greenBBB(
			Match match, Actor actor, Flow flow) {
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		return new Object[] { match, actor, flow };
	}

	public static final void pattern_UserTaskToStepAfterEvGwRule_10_6_expressionBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, actor, normalStep, flow);

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("iceInFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("evGw");
		EObject _localVariable_3 = isApplicableMatch.getObject("lane");
		EObject _localVariable_4 = isApplicableMatch.getObject("actor");
		EObject _localVariable_5 = isApplicableMatch.getObject("laneToActor");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("process");
		EObject _localVariable_8 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_9 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_10 = isApplicableMatch.getObject("flow");
		EObject _localVariable_11 = isApplicableMatch.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		EObject tmpActor = _localVariable_4;
		EObject tmpLaneToActor = _localVariable_5;
		EObject tmpInFlow = _localVariable_6;
		EObject tmpProcess = _localVariable_7;
		EObject tmpNormalStep = _localVariable_8;
		EObject tmpInFlowToFlow = _localVariable_9;
		EObject tmpFlow = _localVariable_10;
		EObject tmpLaneSet = _localVariable_11;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						if (tmpActor instanceof Actor) {
							Actor actor = (Actor) tmpActor;
							if (tmpLaneToActor instanceof LaneToActor) {
								LaneToActor laneToActor = (LaneToActor) tmpLaneToActor;
								if (tmpInFlow instanceof SequenceFlow) {
									SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
									if (tmpProcess instanceof bpmn2.Process) {
										bpmn2.Process process = (bpmn2.Process) tmpProcess;
										if (tmpNormalStep instanceof NormalStep) {
											NormalStep normalStep = (NormalStep) tmpNormalStep;
											if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
												SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
												if (tmpFlow instanceof Flow) {
													Flow flow = (Flow) tmpFlow;
													if (tmpLaneSet instanceof LaneSet) {
														LaneSet laneSet = (LaneSet) tmpLaneSet;
														return new Object[] {
																flowNode,
																iceInFlow,
																evGw, lane,
																actor,
																laneToActor,
																inFlow,
																process,
																normalStep,
																inFlowToFlow,
																flow, laneSet,
																isApplicableMatch };
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_1_blackBBBBBBBBBBBBFBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!iceInFlow.equals(inFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { flowNode, iceInFlow, evGw, lane,
							actor, laneToActor, inFlow, process, normalStep,
							inFlowToFlow, flow, laneSet, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding = pattern_UserTaskToStepAfterEvGwRule_11_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding != null) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[0];
			SequenceFlow iceInFlow = (SequenceFlow) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[1];
			EventBasedGateway evGw = (EventBasedGateway) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[2];
			Lane lane = (Lane) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[3];
			Actor actor = (Actor) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[4];
			LaneToActor laneToActor = (LaneToActor) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[5];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[6];
			bpmn2.Process process = (bpmn2.Process) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[7];
			NormalStep normalStep = (NormalStep) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[8];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[9];
			Flow flow = (Flow) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[10];
			LaneSet laneSet = (LaneSet) result_pattern_UserTaskToStepAfterEvGwRule_11_1_binding[11];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_11_1_black = pattern_UserTaskToStepAfterEvGwRule_11_1_blackBBBBBBBBBBBBFBB(
					flowNode, iceInFlow, evGw, lane, actor, laneToActor,
					inFlow, process, normalStep, inFlowToFlow, flow, laneSet,
					_this, isApplicableMatch);
			if (result_pattern_UserTaskToStepAfterEvGwRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_11_1_black[12];

				return new Object[] { flowNode, iceInFlow, evGw, lane, actor,
						laneToActor, inFlow, process, normalStep, inFlowToFlow,
						flow, laneSet, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_1_greenBFBBFBFFFBB(
			Lane lane, SequenceFlow inFlow, bpmn2.Process process,
			NormalStep normalStep, Flow flow, CSP csp) {
		UserTask task = Bpmn2Factory.eINSTANCE.createUserTask();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("task", "id");
		Object _localVariable_1 = csp.getValue("task", "name");
		lane.getFlowNodeRefs().add(task);
		inFlow.setTargetRef(task);
		process.getFlowElements().add(task);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(task);
		taskToNormalStep.setSource(task);
		taskToNormalStep.setTarget(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String task_id_prime = (String) _localVariable_0;
		String task_name_prime = (String) _localVariable_1;
		task.setId(task_id_prime);
		task.setName(task_name_prime);
		return new Object[] { lane, task, inFlow, process, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep, flow, csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_2_blackBBBBBB(
			UserTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { task, outFlow, normalStep, taskToNormalStep,
				outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_2_greenFBBBBBB(
			UserTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(task);
		ruleresult.getCreatedElements().add(outFlow);
		ruleresult.getTranslatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(taskToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, task, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_3_blackBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject iceInFlow,
			EObject evGw, EObject lane, EObject task, EObject actor,
			EObject laneToActor, EObject inFlow, EObject process,
			EObject outFlow, EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep,
			EObject inFlowToFlow, EObject flow, EObject laneSet) {
		if (!flowNode.equals(iceInFlow)) {
			if (!flowNode.equals(lane)) {
				if (!flowNode.equals(task)) {
					if (!flowNode.equals(laneToActor)) {
						if (!flowNode.equals(inFlow)) {
							if (!flowNode.equals(process)) {
								if (!flowNode.equals(outFlow)) {
									if (!flowNode.equals(normalStep)) {
										if (!flowNode.equals(taskToNormalStep)) {
											if (!flowNode.equals(outFlowToFlow)) {
												if (!flowNode
														.equals(outFlowToNormalStep)) {
													if (!flowNode
															.equals(inFlowToFlow)) {
														if (!flowNode
																.equals(laneSet)) {
															if (!iceInFlow
																	.equals(lane)) {
																if (!iceInFlow
																		.equals(task)) {
																	if (!iceInFlow
																			.equals(laneToActor)) {
																		if (!iceInFlow
																				.equals(inFlow)) {
																			if (!iceInFlow
																					.equals(process)) {
																				if (!iceInFlow
																						.equals(outFlow)) {
																					if (!iceInFlow
																							.equals(normalStep)) {
																						if (!iceInFlow
																								.equals(taskToNormalStep)) {
																							if (!iceInFlow
																									.equals(outFlowToFlow)) {
																								if (!iceInFlow
																										.equals(outFlowToNormalStep)) {
																									if (!iceInFlow
																											.equals(inFlowToFlow)) {
																										if (!iceInFlow
																												.equals(laneSet)) {
																											if (!evGw
																													.equals(flowNode)) {
																												if (!evGw
																														.equals(iceInFlow)) {
																													if (!evGw
																															.equals(lane)) {
																														if (!evGw
																																.equals(task)) {
																															if (!evGw
																																	.equals(laneToActor)) {
																																if (!evGw
																																		.equals(inFlow)) {
																																	if (!evGw
																																			.equals(process)) {
																																		if (!evGw
																																				.equals(outFlow)) {
																																			if (!evGw
																																					.equals(normalStep)) {
																																				if (!evGw
																																						.equals(taskToNormalStep)) {
																																					if (!evGw
																																							.equals(outFlowToFlow)) {
																																						if (!evGw
																																								.equals(outFlowToNormalStep)) {
																																							if (!evGw
																																									.equals(inFlowToFlow)) {
																																								if (!evGw
																																										.equals(flow)) {
																																									if (!evGw
																																											.equals(laneSet)) {
																																										if (!lane
																																												.equals(task)) {
																																											if (!lane
																																													.equals(laneToActor)) {
																																												if (!lane
																																														.equals(process)) {
																																													if (!lane
																																															.equals(outFlow)) {
																																														if (!lane
																																																.equals(normalStep)) {
																																															if (!lane
																																																	.equals(taskToNormalStep)) {
																																																if (!lane
																																																		.equals(outFlowToFlow)) {
																																																	if (!lane
																																																			.equals(outFlowToNormalStep)) {
																																																		if (!lane
																																																				.equals(laneSet)) {
																																																			if (!task
																																																					.equals(taskToNormalStep)) {
																																																				if (!actor
																																																						.equals(flowNode)) {
																																																					if (!actor
																																																							.equals(iceInFlow)) {
																																																						if (!actor
																																																								.equals(evGw)) {
																																																							if (!actor
																																																									.equals(lane)) {
																																																								if (!actor
																																																										.equals(task)) {
																																																									if (!actor
																																																											.equals(laneToActor)) {
																																																										if (!actor
																																																												.equals(inFlow)) {
																																																											if (!actor
																																																													.equals(process)) {
																																																												if (!actor
																																																														.equals(outFlow)) {
																																																													if (!actor
																																																															.equals(normalStep)) {
																																																														if (!actor
																																																																.equals(taskToNormalStep)) {
																																																															if (!actor
																																																																	.equals(outFlowToFlow)) {
																																																																if (!actor
																																																																		.equals(outFlowToNormalStep)) {
																																																																	if (!actor
																																																																			.equals(inFlowToFlow)) {
																																																																		if (!actor
																																																																				.equals(flow)) {
																																																																			if (!actor
																																																																					.equals(laneSet)) {
																																																																				if (!laneToActor
																																																																						.equals(task)) {
																																																																					if (!laneToActor
																																																																							.equals(process)) {
																																																																						if (!laneToActor
																																																																								.equals(outFlow)) {
																																																																							if (!laneToActor
																																																																									.equals(normalStep)) {
																																																																								if (!laneToActor
																																																																										.equals(taskToNormalStep)) {
																																																																									if (!laneToActor
																																																																											.equals(outFlowToFlow)) {
																																																																										if (!laneToActor
																																																																												.equals(outFlowToNormalStep)) {
																																																																											if (!inFlow
																																																																													.equals(lane)) {
																																																																												if (!inFlow
																																																																														.equals(task)) {
																																																																													if (!inFlow
																																																																															.equals(laneToActor)) {
																																																																														if (!inFlow
																																																																																.equals(process)) {
																																																																															if (!inFlow
																																																																																	.equals(outFlow)) {
																																																																																if (!inFlow
																																																																																		.equals(normalStep)) {
																																																																																	if (!inFlow
																																																																																			.equals(taskToNormalStep)) {
																																																																																		if (!inFlow
																																																																																				.equals(outFlowToFlow)) {
																																																																																			if (!inFlow
																																																																																					.equals(outFlowToNormalStep)) {
																																																																																				if (!inFlow
																																																																																						.equals(inFlowToFlow)) {
																																																																																					if (!inFlow
																																																																																							.equals(laneSet)) {
																																																																																						if (!process
																																																																																								.equals(task)) {
																																																																																							if (!process
																																																																																									.equals(taskToNormalStep)) {
																																																																																								if (!outFlow
																																																																																										.equals(task)) {
																																																																																									if (!outFlow
																																																																																											.equals(process)) {
																																																																																										if (!outFlow
																																																																																												.equals(taskToNormalStep)) {
																																																																																											if (!outFlow
																																																																																													.equals(outFlowToFlow)) {
																																																																																												if (!outFlow
																																																																																														.equals(outFlowToNormalStep)) {
																																																																																													if (!normalStep
																																																																																															.equals(task)) {
																																																																																														if (!normalStep
																																																																																																.equals(process)) {
																																																																																															if (!normalStep
																																																																																																	.equals(outFlow)) {
																																																																																																if (!normalStep
																																																																																																		.equals(taskToNormalStep)) {
																																																																																																	if (!normalStep
																																																																																																			.equals(outFlowToFlow)) {
																																																																																																		if (!normalStep
																																																																																																				.equals(outFlowToNormalStep)) {
																																																																																																			if (!outFlowToFlow
																																																																																																					.equals(task)) {
																																																																																																				if (!outFlowToFlow
																																																																																																						.equals(process)) {
																																																																																																					if (!outFlowToFlow
																																																																																																							.equals(taskToNormalStep)) {
																																																																																																						if (!outFlowToFlow
																																																																																																								.equals(outFlowToNormalStep)) {
																																																																																																							if (!outFlowToNormalStep
																																																																																																									.equals(task)) {
																																																																																																								if (!outFlowToNormalStep
																																																																																																										.equals(process)) {
																																																																																																									if (!outFlowToNormalStep
																																																																																																											.equals(taskToNormalStep)) {
																																																																																																										if (!inFlowToFlow
																																																																																																												.equals(lane)) {
																																																																																																											if (!inFlowToFlow
																																																																																																													.equals(task)) {
																																																																																																												if (!inFlowToFlow
																																																																																																														.equals(laneToActor)) {
																																																																																																													if (!inFlowToFlow
																																																																																																															.equals(process)) {
																																																																																																														if (!inFlowToFlow
																																																																																																																.equals(outFlow)) {
																																																																																																															if (!inFlowToFlow
																																																																																																																	.equals(normalStep)) {
																																																																																																																if (!inFlowToFlow
																																																																																																																		.equals(taskToNormalStep)) {
																																																																																																																	if (!inFlowToFlow
																																																																																																																			.equals(outFlowToFlow)) {
																																																																																																																		if (!inFlowToFlow
																																																																																																																				.equals(outFlowToNormalStep)) {
																																																																																																																			if (!inFlowToFlow
																																																																																																																					.equals(laneSet)) {
																																																																																																																				if (!flow
																																																																																																																						.equals(flowNode)) {
																																																																																																																					if (!flow
																																																																																																																							.equals(iceInFlow)) {
																																																																																																																						if (!flow
																																																																																																																								.equals(lane)) {
																																																																																																																							if (!flow
																																																																																																																									.equals(task)) {
																																																																																																																								if (!flow
																																																																																																																										.equals(laneToActor)) {
																																																																																																																									if (!flow
																																																																																																																											.equals(inFlow)) {
																																																																																																																										if (!flow
																																																																																																																												.equals(process)) {
																																																																																																																											if (!flow
																																																																																																																													.equals(outFlow)) {
																																																																																																																												if (!flow
																																																																																																																														.equals(normalStep)) {
																																																																																																																													if (!flow
																																																																																																																															.equals(taskToNormalStep)) {
																																																																																																																														if (!flow
																																																																																																																																.equals(outFlowToFlow)) {
																																																																																																																															if (!flow
																																																																																																																																	.equals(outFlowToNormalStep)) {
																																																																																																																																if (!flow
																																																																																																																																		.equals(inFlowToFlow)) {
																																																																																																																																	if (!flow
																																																																																																																																			.equals(laneSet)) {
																																																																																																																																		if (!laneSet
																																																																																																																																				.equals(task)) {
																																																																																																																																			if (!laneSet
																																																																																																																																					.equals(laneToActor)) {
																																																																																																																																				if (!laneSet
																																																																																																																																						.equals(process)) {
																																																																																																																																					if (!laneSet
																																																																																																																																							.equals(outFlow)) {
																																																																																																																																						if (!laneSet
																																																																																																																																								.equals(normalStep)) {
																																																																																																																																							if (!laneSet
																																																																																																																																									.equals(taskToNormalStep)) {
																																																																																																																																								if (!laneSet
																																																																																																																																										.equals(outFlowToFlow)) {
																																																																																																																																									if (!laneSet
																																																																																																																																											.equals(outFlowToNormalStep)) {
																																																																																																																																										return new Object[] {
																																																																																																																																												ruleresult,
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
																																																																																																																																												laneSet };
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject lane, EObject task,
			EObject actor, EObject inFlow, EObject process, EObject outFlow,
			EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep, EObject flow) {
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge taskToNormalStep__task____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge taskToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserTaskToStepAfterEvGwRule";
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__task____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		String normalStep__actor____actor_name_prime = "actor";
		String taskToNormalStep__task____source_name_prime = "source";
		String taskToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		ruleresult.getCreatedEdges().add(lane__task____flowNodeRefs);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		ruleresult.getCreatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(task__inFlow____incoming);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getCreatedEdges().add(process__task____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		outFlow__task____sourceRef.setSrc(outFlow);
		outFlow__task____sourceRef.setTrg(task);
		ruleresult.getCreatedEdges().add(outFlow__task____sourceRef);
		task__outFlow____outgoing.setSrc(task);
		task__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(task__outFlow____outgoing);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(normalStep__actor____actor);
		taskToNormalStep__task____source.setSrc(taskToNormalStep);
		taskToNormalStep__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(taskToNormalStep__task____source);
		taskToNormalStep__normalStep____target.setSrc(taskToNormalStep);
		taskToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges()
				.add(taskToNormalStep__normalStep____target);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(flow__normalStep____steps);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__task____sourceRef
				.setName(outFlow__task____sourceRef_name_prime);
		task__outFlow____outgoing.setName(task__outFlow____outgoing_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		taskToNormalStep__task____source
				.setName(taskToNormalStep__task____source_name_prime);
		taskToNormalStep__normalStep____target
				.setName(taskToNormalStep__normalStep____target_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { ruleresult, lane, task, actor, inFlow, process,
				outFlow, normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, lane__task____flowNodeRefs,
				inFlow__task____targetRef, task__inFlow____incoming,
				process__task____flowElements,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, normalStep__actor____actor,
				taskToNormalStep__task____source,
				taskToNormalStep__normalStep____target,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps };
	}

	public static final void pattern_UserTaskToStepAfterEvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject lane,
			EObject task, EObject actor, EObject laneToActor, EObject inFlow,
			EObject process, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet) {
		_this.registerObjects_BWD(ruleresult, flowNode, iceInFlow, evGw, lane,
				task, actor, laneToActor, inFlow, process, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
				inFlowToFlow, flow, laneSet);

	}

	public static final PerformRuleResult pattern_UserTaskToStepAfterEvGwRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_1_blackFBB(
			EClass eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_12_1_binding = pattern_UserTaskToStepAfterEvGwRule_12_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_12_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_12_1_black = pattern_UserTaskToStepAfterEvGwRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserTaskToStepAfterEvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("normalStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpActor = _localVariable_0;
		EObject tmpNormalStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { actor, normalStep, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_12_2_blackFBFFBFBB(
			Actor actor, NormalStep normalStep, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (LaneToActor laneToActor : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, LaneToActor.class, "target")) {
			Lane lane = laneToActor.getSource();
			if (lane != null) {
				for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(flow,
								SequenceFlowToUCFlow.class, "target")) {
					SequenceFlow inFlow = inFlowToFlow.getSource();
					if (inFlow != null) {
						_result.add(new Object[] { lane, actor, laneToActor,
								inFlow, normalStep, inFlowToFlow, flow, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_12_3_blackFFFBBBBFBBBF(
			Lane lane, Actor actor, LaneToActor laneToActor,
			SequenceFlow inFlow, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (lane.equals(laneToActor.getSource())) {
			if (actor.equals(laneToActor.getTarget())) {
				if (actor.equals(normalStep.getActor())) {
					if (inFlow.equals(inFlowToFlow.getSource())) {
						if (flow.equals(inFlowToFlow.getTarget())) {
							if (flow.getSteps().contains(normalStep)) {
								FlowNode tmpFlowNode = inFlow.getSourceRef();
								if (tmpFlowNode instanceof IntermediateCatchEvent) {
									IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
									for (SequenceFlow iceInFlow : flowNode
											.getIncoming()) {
										if (!iceInFlow.equals(inFlow)) {
											FlowNode tmpEvGw = iceInFlow
													.getSourceRef();
											if (tmpEvGw instanceof EventBasedGateway) {
												EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
												for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																inFlow,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		flowNode)) {
															for (LaneSet laneSet : process
																	.getLaneSets()) {
																if (laneSet
																		.getLanes()
																		.contains(
																				lane)) {
																	_result.add(new Object[] {
																			flowNode,
																			iceInFlow,
																			evGw,
																			lane,
																			actor,
																			laneToActor,
																			inFlow,
																			process,
																			normalStep,
																			inFlowToFlow,
																			flow,
																			laneSet });
																}
															}
														}
													}
												}
											}

										}
									}
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge iceInFlow__flowNode____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__iceInFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceInFlow__evGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge evGw__iceInFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__lane____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__flowNode____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String iceInFlow__flowNode____targetRef_name_prime = "targetRef";
		String flowNode__iceInFlow____incoming_name_prime = "incoming";
		String iceInFlow__evGw____sourceRef_name_prime = "sourceRef";
		String evGw__iceInFlow____outgoing_name_prime = "outgoing";
		String laneToActor__lane____source_name_prime = "source";
		String laneToActor__actor____target_name_prime = "target";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String normalStep__actor____actor_name_prime = "actor";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String laneSet__lane____lanes_name_prime = "lanes";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(iceInFlow);
		isApplicableMatch.getAllContextElements().add(evGw);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(laneToActor);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		iceInFlow__flowNode____targetRef.setSrc(iceInFlow);
		iceInFlow__flowNode____targetRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				iceInFlow__flowNode____targetRef);
		flowNode__iceInFlow____incoming.setSrc(flowNode);
		flowNode__iceInFlow____incoming.setTrg(iceInFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__iceInFlow____incoming);
		iceInFlow__evGw____sourceRef.setSrc(iceInFlow);
		iceInFlow__evGw____sourceRef.setTrg(evGw);
		isApplicableMatch.getAllContextElements().add(
				iceInFlow__evGw____sourceRef);
		evGw__iceInFlow____outgoing.setSrc(evGw);
		evGw__iceInFlow____outgoing.setTrg(iceInFlow);
		isApplicableMatch.getAllContextElements().add(
				evGw__iceInFlow____outgoing);
		laneToActor__lane____source.setSrc(laneToActor);
		laneToActor__lane____source.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(
				laneToActor__lane____source);
		laneToActor__actor____target.setSrc(laneToActor);
		laneToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				laneToActor__actor____target);
		process__flowNode____flowElements.setSrc(process);
		process__flowNode____flowElements.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				process__flowNode____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				normalStep__actor____actor);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__inFlow____outgoing);
		iceInFlow__flowNode____targetRef
				.setName(iceInFlow__flowNode____targetRef_name_prime);
		flowNode__iceInFlow____incoming
				.setName(flowNode__iceInFlow____incoming_name_prime);
		iceInFlow__evGw____sourceRef
				.setName(iceInFlow__evGw____sourceRef_name_prime);
		evGw__iceInFlow____outgoing
				.setName(evGw__iceInFlow____outgoing_name_prime);
		laneToActor__lane____source
				.setName(laneToActor__lane____source_name_prime);
		laneToActor__actor____target
				.setName(laneToActor__actor____target_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		return new Object[] { flowNode, iceInFlow, evGw, lane, actor,
				laneToActor, inFlow, process, normalStep, inFlowToFlow, flow,
				laneSet, isApplicableMatch, iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, laneToActor__lane____source,
				laneToActor__actor____target,
				process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				normalStep__actor____actor, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, flow__normalStep____steps,
				laneSet__lane____lanes, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, lane, actor,
				laneToActor, inFlow, process, normalStep, inFlowToFlow, flow,
				laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, lane, actor, laneToActor, inFlow, process,
					normalStep, inFlowToFlow, flow, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_12_4_binding = pattern_UserTaskToStepAfterEvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, lane,
				actor, laneToActor, inFlow, process, normalStep, inFlowToFlow,
				flow, laneSet);
		if (result_pattern_UserTaskToStepAfterEvGwRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_12_4_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_12_4_black = pattern_UserTaskToStepAfterEvGwRule_12_4_blackB(csp);
			if (result_pattern_UserTaskToStepAfterEvGwRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, lane, actor, laneToActor, inFlow,
						process, normalStep, inFlowToFlow, flow, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_12_5_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserTaskToStepAfterEvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserTaskToStepAfterEvGwRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_20_1_binding = pattern_UserTaskToStepAfterEvGwRule_20_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_20_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_20_1_black = pattern_UserTaskToStepAfterEvGwRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_660623 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_20_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpTask = _edge_flowNodeRefs.getTrg();
			if (tmpTask instanceof UserTask) {
				UserTask task = (UserTask) tmpTask;
				if (lane.getFlowNodeRefs().contains(task)) {
					for (SequenceFlow inFlow : task.getIncoming()) {
						FlowNode tmpFlowNode = inFlow.getSourceRef();
						if (tmpFlowNode instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
							for (SequenceFlow outFlow : task.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_0B(outFlow) == null) {
										if (pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_2BB(
												outFlow, task) == null) {
											for (SequenceFlow iceInFlow : flowNode
													.getIncoming()) {
												if (!iceInFlow.equals(inFlow)) {
													if (!iceInFlow
															.equals(outFlow)) {
														FlowNode tmpEvGw = iceInFlow
																.getSourceRef();
														if (tmpEvGw instanceof EventBasedGateway) {
															EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
															if (pattern_UserTaskToStepAfterEvGwRule_20_2_black_nac_1BB(
																	iceInFlow,
																	task) == null) {
																for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				lane,
																				LaneSet.class,
																				"lanes")) {
																	for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					task,
																					FlowElementsContainer.class,
																					"flowElements")) {
																		if (tmpProcess instanceof bpmn2.Process) {
																			bpmn2.Process process = (bpmn2.Process) tmpProcess;
																			if (process
																					.getFlowElements()
																					.contains(
																							flowNode)) {
																				if (process
																						.getLaneSets()
																						.contains(
																								laneSet)) {
																					if (process
																							.getFlowElements()
																							.contains(
																									inFlow)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										outFlow)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									lane,
																									task,
																									inFlow,
																									process,
																									outFlow,
																									laneSet,
																									_edge_flowNodeRefs });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}

													}
												}
											}
										}
									}
								}
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_20_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_20_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_21_1_binding = pattern_UserTaskToStepAfterEvGwRule_21_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_21_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_21_1_black = pattern_UserTaskToStepAfterEvGwRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_233149 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_21_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof UserTask) {
				UserTask task = (UserTask) tmpTask;
				if (task.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
						for (SequenceFlow outFlow : task.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_0B(outFlow) == null) {
									if (pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_2BB(
											outFlow, task) == null) {
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_UserTaskToStepAfterEvGwRule_21_2_black_nac_1BB(
																iceInFlow, task) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			inFlow,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					flowNode)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						task)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				for (LaneSet laneSet : process
																						.getLaneSets()) {
																					for (Lane lane : laneSet
																							.getLanes()) {
																						if (lane.getFlowNodeRefs()
																								.contains(
																										task)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									lane,
																									task,
																									inFlow,
																									process,
																									outFlow,
																									laneSet,
																									_edge_targetRef });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_21_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_21_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_22_1_binding = pattern_UserTaskToStepAfterEvGwRule_22_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_22_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_22_1_black = pattern_UserTaskToStepAfterEvGwRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_451140 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_22_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof UserTask) {
			UserTask task = (UserTask) tmpTask;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (task.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
						for (SequenceFlow outFlow : task.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_0B(outFlow) == null) {
									if (pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_2BB(
											outFlow, task) == null) {
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_UserTaskToStepAfterEvGwRule_22_2_black_nac_1BB(
																iceInFlow, task) == null) {
															for (Lane lane : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			task,
																			Lane.class,
																			"flowNodeRefs")) {
																for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				task,
																				FlowElementsContainer.class,
																				"flowElements")) {
																	if (tmpProcess instanceof bpmn2.Process) {
																		bpmn2.Process process = (bpmn2.Process) tmpProcess;
																		if (process
																				.getFlowElements()
																				.contains(
																						flowNode)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							inFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								outFlow)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						if (laneSet
																								.getLanes()
																								.contains(
																										lane)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									lane,
																									task,
																									inFlow,
																									process,
																									outFlow,
																									laneSet,
																									_edge_incoming });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_22_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_22_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_23_1_binding = pattern_UserTaskToStepAfterEvGwRule_23_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_23_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_23_1_black = pattern_UserTaskToStepAfterEvGwRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_193795 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_23_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof UserTask) {
				UserTask task = (UserTask) tmpTask;
				if (process.getFlowElements().contains(task)) {
					for (FlowElement tmpFlowNode : process.getFlowElements()) {
						if (tmpFlowNode instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
							for (LaneSet laneSet : process.getLaneSets()) {
								for (FlowElement tmpInFlow : process
										.getFlowElements()) {
									if (tmpInFlow instanceof SequenceFlow) {
										SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
										if (task.equals(inFlow.getTargetRef())) {
											if (flowNode.equals(inFlow
													.getSourceRef())) {
												for (FlowElement tmpOutFlow : process
														.getFlowElements()) {
													if (tmpOutFlow instanceof SequenceFlow) {
														SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
														if (!inFlow
																.equals(outFlow)) {
															if (task.equals(outFlow
																	.getSourceRef())) {
																if (pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_0B(outFlow) == null) {
																	if (pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_2BB(
																			outFlow,
																			task) == null) {
																		for (SequenceFlow iceInFlow : flowNode
																				.getIncoming()) {
																			if (!iceInFlow
																					.equals(inFlow)) {
																				if (!iceInFlow
																						.equals(outFlow)) {
																					FlowNode tmpEvGw = iceInFlow
																							.getSourceRef();
																					if (tmpEvGw instanceof EventBasedGateway) {
																						EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
																						if (pattern_UserTaskToStepAfterEvGwRule_23_2_black_nac_1BB(
																								iceInFlow,
																								task) == null) {
																							for (Lane lane : laneSet
																									.getLanes()) {
																								if (lane.getFlowNodeRefs()
																										.contains(
																												task)) {
																									_result.add(new Object[] {
																											flowNode,
																											iceInFlow,
																											evGw,
																											lane,
																											task,
																											inFlow,
																											process,
																											outFlow,
																											laneSet,
																											_edge_flowElements });
																								}
																							}
																						}
																					}

																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_23_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_23_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_24_1_binding = pattern_UserTaskToStepAfterEvGwRule_24_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_24_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_24_1_black = pattern_UserTaskToStepAfterEvGwRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_269871 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_24_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpTask = outFlow.getSourceRef();
					if (tmpTask instanceof UserTask) {
						UserTask task = (UserTask) tmpTask;
						if (process.getFlowElements().contains(task)) {
							if (pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_0B(outFlow) == null) {
								if (pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_2BB(
										outFlow, task) == null) {
									for (FlowElement tmpFlowNode : process
											.getFlowElements()) {
										if (tmpFlowNode instanceof IntermediateCatchEvent) {
											IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
											for (LaneSet laneSet : process
													.getLaneSets()) {
												for (FlowElement tmpInFlow : process
														.getFlowElements()) {
													if (tmpInFlow instanceof SequenceFlow) {
														SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
														if (!inFlow
																.equals(outFlow)) {
															if (task.equals(inFlow
																	.getTargetRef())) {
																if (flowNode
																		.equals(inFlow
																				.getSourceRef())) {
																	for (SequenceFlow iceInFlow : flowNode
																			.getIncoming()) {
																		if (!iceInFlow
																				.equals(inFlow)) {
																			if (!iceInFlow
																					.equals(outFlow)) {
																				FlowNode tmpEvGw = iceInFlow
																						.getSourceRef();
																				if (tmpEvGw instanceof EventBasedGateway) {
																					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
																					if (pattern_UserTaskToStepAfterEvGwRule_24_2_black_nac_1BB(
																							iceInFlow,
																							task) == null) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											task)) {
																								_result.add(new Object[] {
																										flowNode,
																										iceInFlow,
																										evGw,
																										lane,
																										task,
																										inFlow,
																										process,
																										outFlow,
																										laneSet,
																										_edge_flowElements });
																							}
																						}
																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_24_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_24_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_25_1_binding = pattern_UserTaskToStepAfterEvGwRule_25_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_25_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_25_1_black = pattern_UserTaskToStepAfterEvGwRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_986508 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_25_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpTask = _edge_sourceRef.getTrg();
			if (tmpTask instanceof UserTask) {
				UserTask task = (UserTask) tmpTask;
				if (task.equals(outFlow.getSourceRef())) {
					if (pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_0B(outFlow) == null) {
						if (pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_2BB(
								outFlow, task) == null) {
							for (SequenceFlow inFlow : task.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									FlowNode tmpFlowNode = inFlow
											.getSourceRef();
									if (tmpFlowNode instanceof IntermediateCatchEvent) {
										IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_UserTaskToStepAfterEvGwRule_25_2_black_nac_1BB(
																iceInFlow, task) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			outFlow,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					flowNode)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							task)) {
																				for (LaneSet laneSet : process
																						.getLaneSets()) {
																					for (Lane lane : laneSet
																							.getLanes()) {
																						if (lane.getFlowNodeRefs()
																								.contains(
																										task)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									lane,
																									task,
																									inFlow,
																									process,
																									outFlow,
																									laneSet,
																									_edge_sourceRef });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

												}
											}
										}
									}

								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_25_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_25_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_26_1_binding = pattern_UserTaskToStepAfterEvGwRule_26_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_26_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_26_1_black = pattern_UserTaskToStepAfterEvGwRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_981210 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_1BB(
			SequenceFlow iceInFlow, UserTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_2BB(
			SequenceFlow outFlow, UserTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_26_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_outgoing.getSrc();
		if (tmpTask instanceof UserTask) {
			UserTask task = (UserTask) tmpTask;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (task.equals(outFlow.getSourceRef())) {
					if (pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_0B(outFlow) == null) {
						if (pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_2BB(
								outFlow, task) == null) {
							for (SequenceFlow inFlow : task.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									FlowNode tmpFlowNode = inFlow
											.getSourceRef();
									if (tmpFlowNode instanceof IntermediateCatchEvent) {
										IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_UserTaskToStepAfterEvGwRule_26_2_black_nac_1BB(
																iceInFlow, task) == null) {
															for (Lane lane : org.moflon.util.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			task,
																			Lane.class,
																			"flowNodeRefs")) {
																for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				task,
																				FlowElementsContainer.class,
																				"flowElements")) {
																	if (tmpProcess instanceof bpmn2.Process) {
																		bpmn2.Process process = (bpmn2.Process) tmpProcess;
																		if (process
																				.getFlowElements()
																				.contains(
																						flowNode)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							inFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								outFlow)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						if (laneSet
																								.getLanes()
																								.contains(
																										lane)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									lane,
																									task,
																									inFlow,
																									process,
																									outFlow,
																									laneSet,
																									_edge_outgoing });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

												}
											}
										}
									}

								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_26_3_expressionFBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, UserTask task,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, lane, task, inFlow, process, outFlow, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_26_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_27_1_binding = pattern_UserTaskToStepAfterEvGwRule_27_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_27_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_27_1_black = pattern_UserTaskToStepAfterEvGwRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_27_2_blackFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_actor.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(normalStep.getActor())) {
					for (Flow flow : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(normalStep, Flow.class,
									"steps")) {
						_result.add(new Object[] { actor, normalStep, flow,
								_edge_actor });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_27_3_expressionFBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, actor,
				normalStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_27_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_1_bindingFB(
			UserTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_1_blackFBB(
			EClass __eClass, UserTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_1_bindingAndBlackFFB(
			UserTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_28_1_binding = pattern_UserTaskToStepAfterEvGwRule_28_1_bindingFB(_this);
		if (result_pattern_UserTaskToStepAfterEvGwRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserTaskToStepAfterEvGwRule_28_1_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_28_1_black = pattern_UserTaskToStepAfterEvGwRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserTaskToStepAfterEvGwRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserTaskToStepAfterEvGwRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_28_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpNormalStep = _edge_steps.getTrg();
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (flow.getSteps().contains(normalStep)) {
					Actor actor = normalStep.getActor();
					if (actor != null) {
						_result.add(new Object[] { actor, normalStep, flow,
								_edge_steps });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_28_3_expressionFBBBBB(
			UserTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, actor,
				normalStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_28_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserTaskToStepAfterEvGwRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_1_blackB(
			UserTaskToStepAfterEvGwRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, IntermediateCatchEvent flowNode) {
		if (ruleResult.getSourceObjects().contains(flowNode)) {
			return new Object[] { ruleResult, flowNode };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow iceInFlow) {
		if (ruleResult.getSourceObjects().contains(iceInFlow)) {
			return new Object[] { ruleResult, iceInFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, EventBasedGateway evGw) {
		if (ruleResult.getSourceObjects().contains(evGw)) {
			return new Object[] { ruleResult, evGw };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, LaneToActor laneToActor) {
		if (ruleResult.getCorrObjects().contains(laneToActor)) {
			return new Object[] { ruleResult, laneToActor };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserTaskToStepAfterEvGwRule_31_2_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList laneToActorList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpLaneToActor : laneToActorList.getEntryObjects()) {
				if (tmpLaneToActor instanceof LaneToActor) {
					LaneToActor laneToActor = (LaneToActor) tmpLaneToActor;
					Lane lane = laneToActor.getSource();
					if (lane != null) {
						Actor actor = laneToActor.getTarget();
						if (actor != null) {
							if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_6BB(
									ruleResult, laneToActor) == null) {
								if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_5BB(
										ruleResult, lane) == null) {
									if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_7BB(
											ruleResult, actor) == null) {
										for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														lane, LaneSet.class,
														"lanes")) {
											if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_4BB(
													ruleResult, laneSet) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																laneSet,
																FlowElementsContainer.class,
																"laneSets")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_3BB(
																ruleResult,
																process) == null) {
															for (FlowElement tmpFlowNode : process
																	.getFlowElements()) {
																if (tmpFlowNode instanceof IntermediateCatchEvent) {
																	IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
																	if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_0BB(
																			ruleResult,
																			flowNode) == null) {
																		for (FlowElement tmpInFlow : process
																				.getFlowElements()) {
																			if (tmpInFlow instanceof SequenceFlow) {
																				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																				if (flowNode
																						.equals(inFlow
																								.getSourceRef())) {
																					if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_8BB(
																							ruleResult,
																							inFlow) == null) {
																						for (SequenceFlow iceInFlow : flowNode
																								.getIncoming()) {
																							if (!iceInFlow
																									.equals(inFlow)) {
																								FlowNode tmpEvGw = iceInFlow
																										.getSourceRef();
																								if (tmpEvGw instanceof EventBasedGateway) {
																									EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
																									if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_1BB(
																											ruleResult,
																											iceInFlow) == null) {
																										if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_2BB(
																												ruleResult,
																												evGw) == null) {
																											for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															inFlow,
																															SequenceFlowToUCFlow.class,
																															"source")) {
																												Flow flow = inFlowToFlow
																														.getTarget();
																												if (flow != null) {
																													if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_9BB(
																															ruleResult,
																															inFlowToFlow) == null) {
																														if (pattern_UserTaskToStepAfterEvGwRule_31_2_black_nac_10BB(
																																ruleResult,
																																flow) == null) {
																															_result.add(new Object[] {
																																	laneToActorList,
																																	flowNode,
																																	iceInFlow,
																																	evGw,
																																	process,
																																	laneSet,
																																	lane,
																																	laneToActor,
																																	actor,
																																	inFlow,
																																	inFlowToFlow,
																																	flow,
																																	ruleEntryContainer,
																																	ruleResult });
																														}
																													}
																												}

																											}
																										}
																									}
																								}

																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_3_bindingFBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, lane, actor,
				laneToActor, inFlow, process, inFlowToFlow, flow, laneSet,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, lane, actor, laneToActor, inFlow, process,
					inFlowToFlow, flow, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_3_bindingAndBlackFBBBBBBBBBBBBBB(
			UserTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UserTaskToStepAfterEvGwRule_31_3_binding = pattern_UserTaskToStepAfterEvGwRule_31_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, lane,
				actor, laneToActor, inFlow, process, inFlowToFlow, flow,
				laneSet, ruleResult);
		if (result_pattern_UserTaskToStepAfterEvGwRule_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_UserTaskToStepAfterEvGwRule_31_3_binding[0];

			Object[] result_pattern_UserTaskToStepAfterEvGwRule_31_3_black = pattern_UserTaskToStepAfterEvGwRule_31_3_blackB(csp);
			if (result_pattern_UserTaskToStepAfterEvGwRule_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, lane, actor, laneToActor, inFlow,
						process, inFlowToFlow, flow, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UserTaskToStepAfterEvGwRule_31_4_expressionFBB(
			UserTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_5_blackBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet) {
		if (!iceInFlow.equals(inFlow)) {
			return new Object[] { flowNode, iceInFlow, evGw, lane, actor,
					laneToActor, inFlow, process, inFlowToFlow, flow, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_6_blackBBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, Lane lane, Actor actor,
			LaneToActor laneToActor, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		if (!iceInFlow.equals(inFlow)) {
			return new Object[] { flowNode, iceInFlow, evGw, lane, actor,
					laneToActor, inFlow, process, inFlowToFlow, flow, laneSet,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UserTaskToStepAfterEvGwRule_31_6_greenBFBBBFFFFFBBB(
			Lane lane, Actor actor, SequenceFlow inFlow, bpmn2.Process process,
			Flow flow, ModelgeneratorRuleResult ruleResult, CSP csp) {
		UserTask task = Bpmn2Factory.eINSTANCE.createUserTask();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		FlowNodeToStep taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("task", "id");
		Object _localVariable_1 = csp.getValue("task", "name");
		Object _localVariable_2 = csp.getValue("normalStep", "name");
		Object _localVariable_3 = csp.getValue("normalStep", "label");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		lane.getFlowNodeRefs().add(task);
		inFlow.setTargetRef(task);
		process.getFlowElements().add(task);
		ruleResult.getSourceObjects().add(task);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(task);
		ruleResult.getSourceObjects().add(outFlow);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ruleResult.getTargetObjects().add(normalStep);
		taskToNormalStep.setSource(task);
		taskToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(taskToNormalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		ruleResult.getCorrObjects().add(outFlowToFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		String task_id_prime = (String) _localVariable_0;
		String task_name_prime = (String) _localVariable_1;
		String normalStep_name_prime = (String) _localVariable_2;
		String normalStep_label_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		task.setId(task_id_prime);
		task.setName(task_name_prime);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { lane, task, actor, inFlow, process, outFlow,
				normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UserTaskToStepAfterEvGwRule_31_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserTaskToStepAfterEvGwRuleImpl
