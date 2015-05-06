/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToActor;

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterEvGwRule;

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
import UseCaseDSL.StepType;
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
import bpmn2.ServiceTask;

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
 * An implementation of the model object '<em><b>Service Task To Step After Ev Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceTaskToStepAfterEvGwRuleImpl extends AbstractRuleImpl
		implements ServiceTaskToStepAfterEvGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskToStepAfterEvGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getServiceTaskToStepAfterEvGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		// initial bindings
		Object[] result1_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_0_1_blackBBBBBBBBBBB(
						this, match, flowNode, iceInFlow, evGw, process, task,
						inFlow, outFlow, laneSet, lane);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
						this, match, flowNode, iceInFlow, evGw, process, task,
						inFlow, outFlow, laneSet, lane);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_4_blackBBBBBBBBBB(
							match, flowNode, iceInFlow, evGw, process, task,
							inFlow, outFlow, laneSet, lane);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_4_greenBBBBBBFFFFFFF(
							match, process, task, inFlow, outFlow, lane);
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_5_blackBBBBBBBBBB(
							match, flowNode, iceInFlow, evGw, process, task,
							inFlow, outFlow, laneSet, lane);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_5_greenBBBBBBBBFFFFFFFFFF(
							match, flowNode, iceInFlow, evGw, process, inFlow,
							laneSet, lane);
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
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_6_expressionBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane);
			return ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_7_expressionF();
		} else {
			return ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result1_bindingAndBlack[0];
		SequenceFlow iceInFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway evGw = (EventBasedGateway) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		Actor actor = (Actor) result1_bindingAndBlack[4];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[5];
		ServiceTask task = (ServiceTask) result1_bindingAndBlack[6];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[7];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[8];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[9];
		Flow flow = (Flow) result1_bindingAndBlack[10];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[11];
		Lane lane = (Lane) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_1_greenBBBFFFFBB(
						actor, task, outFlow, flow, csp);
		NormalStep normalStep = (NormalStep) result1_green[3];
		FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result1_green[4];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[5];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_2_blackBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_2_greenFBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_3_blackBBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, iceInFlow, evGw, process, actor,
						processToActor, task, inFlow, outFlow, normalStep,
						taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
						inFlowToFlow, flow, laneSet, lane);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, process, actor, task, inFlow, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, flow, lane);
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[16];
		// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[17];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[18];
		// EMoflonEdge taskToNormalStep__task____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge taskToNormalStep__normalStep____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[25];
		// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, iceInFlow, evGw, process,
						actor, processToActor, task, inFlow, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet, lane);
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_2_2_bindingFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_binding[0];
		SequenceFlow iceInFlow = (SequenceFlow) result2_binding[1];
		EventBasedGateway evGw = (EventBasedGateway) result2_binding[2];
		bpmn2.Process process = (bpmn2.Process) result2_binding[3];
		ServiceTask task = (ServiceTask) result2_binding[4];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[5];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[6];
		LaneSet laneSet = (LaneSet) result2_binding[7];
		Lane lane = (Lane) result2_binding[8];
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_2_2_blackBBBBFFBBBFFBBB(
						flowNode, iceInFlow, evGw, process, task, inFlow,
						outFlow, laneSet, lane, match)) {
			Actor actor = (Actor) result2_black[4];
			ProcessToActor processToActor = (ProcessToActor) result2_black[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[9];
			Flow flow = (Flow) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_2_3_blackBBBBBBBBBBBBB(
							flowNode, iceInFlow, evGw, process, actor,
							processToActor, task, inFlow, outFlow,
							inFlowToFlow, flow, laneSet, lane)) {
				Object[] result3_green = ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
								flowNode, iceInFlow, evGw, process, actor,
								processToActor, task, inFlow, outFlow,
								inFlowToFlow, flow, laneSet, lane);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge iceInFlow__flowNode____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flowNode__iceInFlow____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge iceInFlow__evGw____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge evGw__iceInFlow____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__flowNode____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[28];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[29];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[30];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[31];
				// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[32];
				// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result3_green[33];
				// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result3_green[34];

				// solve CSP
				Object[] result4_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, iceInFlow,
								evGw, process, actor, processToActor, task,
								inFlow, outFlow, inFlowToFlow, flow, laneSet,
								lane);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		match.registerObject("flowNode", flowNode);
		match.registerObject("iceInFlow", iceInFlow);
		match.registerObject("evGw", evGw);
		match.registerObject("process", process);
		match.registerObject("task", task);
		match.registerObject("inFlow", inFlow);
		match.registerObject("outFlow", outFlow);
		match.registerObject("laneSet", laneSet);
		match.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {// Create CSP
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
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERFORM");
		literal0.setType("");

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
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", csp);
		var_normalStep_type.setType("UseCaseDSL.StepType");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_task_name, var_normalStep_label);
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("iceInFlow", iceInFlow);
		isApplicableMatch.registerObject("evGw", evGw);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("task", task);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject process,
			EObject actor, EObject processToActor, EObject task,
			EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet, EObject lane) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("iceInFlow", iceInFlow);
		ruleresult.registerObject("evGw", evGw);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("taskToNormalStep", taskToNormalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("task").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getServiceTask())
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
		Object[] result1_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_10_1_blackBBBBB(this,
						match, actor, normalStep, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_10_2_bindingAndBlackFBBBBB(
						this, match, actor, normalStep, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_4_blackBBBB(
							match, actor, normalStep, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_4_greenBBBBFF(
							match, actor, normalStep, flow);
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_5_blackBBBB(
							match, actor, normalStep, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_5_greenBBB(
							match, actor, flow);

			// register objects to match
			ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_6_expressionBBBBB(
							this, match, actor, normalStep, flow);
			return ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_7_expressionF();
		} else {
			return ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result1_bindingAndBlack[0];
		SequenceFlow iceInFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway evGw = (EventBasedGateway) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		Actor actor = (Actor) result1_bindingAndBlack[4];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[5];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[6];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[7];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[8];
		Flow flow = (Flow) result1_bindingAndBlack[9];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[10];
		Lane lane = (Lane) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_1_greenBFBFBFFFBBB(
						process, inFlow, normalStep, flow, lane, csp);
		ServiceTask task = (ServiceTask) result1_green[1];
		SequenceFlow outFlow = (SequenceFlow) result1_green[3];
		FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result1_green[5];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[6];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[7];

		// collect translated elements
		Object[] result2_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_2_blackBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_2_greenFBBBBBB(task,
						outFlow, normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_3_blackBBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, iceInFlow, evGw, process, actor,
						processToActor, task, inFlow, outFlow, normalStep,
						taskToNormalStep, outFlowToFlow, outFlowToNormalStep,
						inFlowToFlow, flow, laneSet, lane);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, process, actor, task, inFlow, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, flow, lane);
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__task____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge task__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlow__task____sourceRef = (EMoflonEdge) result3_green[16];
		// EMoflonEdge task__outFlow____outgoing = (EMoflonEdge) result3_green[17];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[18];
		// EMoflonEdge taskToNormalStep__task____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge taskToNormalStep__normalStep____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[25];
		// EMoflonEdge lane__task____flowNodeRefs = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, iceInFlow, evGw, process,
						actor, processToActor, task, inFlow, outFlow,
						normalStep, taskToNormalStep, outFlowToFlow,
						outFlowToNormalStep, inFlowToFlow, flow, laneSet, lane);
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		NormalStep normalStep = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_12_2_blackFBFFBFBB(
						actor, normalStep, flow, match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			ProcessToActor processToActor = (ProcessToActor) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_12_3_blackFFFBBBBBBBFF(
							process, actor, processToActor, inFlow, normalStep,
							inFlowToFlow, flow)) {
				IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result3_black[0];
				SequenceFlow iceInFlow = (SequenceFlow) result3_black[1];
				EventBasedGateway evGw = (EventBasedGateway) result3_black[2];
				LaneSet laneSet = (LaneSet) result3_black[10];
				Lane lane = (Lane) result3_black[11];
				Object[] result3_green = ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								flowNode, iceInFlow, evGw, process, actor,
								processToActor, inFlow, normalStep,
								inFlowToFlow, flow, laneSet, lane);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge iceInFlow__flowNode____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flowNode__iceInFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge iceInFlow__evGw____sourceRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge evGw__iceInFlow____outgoing = (EMoflonEdge) result3_green[16];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[18];
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
				Object[] result4_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, iceInFlow,
								evGw, process, actor, processToActor, inFlow,
								normalStep, inFlowToFlow, flow, laneSet, lane);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_12_7_expressionFB(ruleresult);
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
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERFORM");
		literal0.setType("");

		// Create attribute variables
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", true, csp);
		var_normalStep_type.setValue(normalStep.getType());
		var_normalStep_type.setType("UseCaseDSL.StepType");

		// Create unbound variables

		// Create constraints
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal0);
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
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, Lane lane) {// Create CSP
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
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject process,
			EObject actor, EObject processToActor, EObject task,
			EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet, EObject lane) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("iceInFlow", iceInFlow);
		ruleresult.registerObject("evGw", evGw);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("taskToNormalStep", taskToNormalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("lane", lane);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_193(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_20_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_20_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_194(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_21_2_blackFFFFFFFFFB(_edge_targetRef)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_21_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_195(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_22_2_blackFFFFFFFFFB(_edge_incoming)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_22_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_196(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_23_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_23_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_197(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_24_2_blackFFFFFFFFFB(_edge_sourceRef)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_24_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_198(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_25_2_blackFFFFFFFFFB(_edge_outgoing)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_25_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_61(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_26_2_blackFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_26_3_expressionFBBBBB(
							this, match, actor, normalStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_62(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_27_2_blackFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_27_3_expressionFBBBBB(
							this, match, actor, normalStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_199(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_28_2_blackFFFFFFFFFB(_edge_flowNodeRefs)) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			ServiceTask task = (ServiceTask) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			Object[] result2_green = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_28_3_expressionFBBBBBBBBBBB(
							this, match, flowNode, iceInFlow, evGw, process,
							task, inFlow, outFlow, laneSet, lane)) {
				// Ensure that the correct types of elements are matched
				if (ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_28_6_expressionFB(__result);
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
			SequenceFlowToUCFlow inFlowToFlowParameter) {
		// create result
		Object[] result1_black = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_31_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_31_2_blackFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow iceInFlow = (SequenceFlow) result2_black[2];
			EventBasedGateway evGw = (EventBasedGateway) result2_black[3];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Lane lane = (Lane) result2_black[6];
			SequenceFlow inFlow = (SequenceFlow) result2_black[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[8];
			Flow flow = (Flow) result2_black[9];
			ProcessToActor processToActor = (ProcessToActor) result2_black[10];
			Actor actor = (Actor) result2_black[11];

			// solve CSP
			Object[] result3_bindingAndBlack = ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_31_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, flowNode, iceInFlow, evGw,
							process, actor, processToActor, inFlow,
							inFlowToFlow, flow, laneSet, lane, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ServiceTaskToStepAfterEvGwRuleImpl
					.pattern_ServiceTaskToStepAfterEvGwRule_31_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ServiceTaskToStepAfterEvGwRuleImpl
						.pattern_ServiceTaskToStepAfterEvGwRule_31_5_blackBBBBBBBBBBB(
								flowNode, iceInFlow, evGw, process, actor,
								processToActor, inFlow, inFlowToFlow, flow,
								laneSet, lane);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_31_6_blackBBBBBBBBBBBB(
									flowNode, iceInFlow, evGw, process, actor,
									processToActor, inFlow, inFlowToFlow, flow,
									laneSet, lane, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ServiceTaskToStepAfterEvGwRuleImpl
							.pattern_ServiceTaskToStepAfterEvGwRule_31_6_greenBBFBFFFFFBBBB(
									process, actor, inFlow, flow, lane,
									ruleResult, csp);
					// ServiceTask task = (ServiceTask) result6_green[2];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[4];
					// NormalStep normalStep = (NormalStep) result6_green[5];
					// FlowNodeToStep taskToNormalStep = (FlowNodeToStep) result6_green[6];
					// SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result6_green[7];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ServiceTaskToStepAfterEvGwRuleImpl
				.pattern_ServiceTaskToStepAfterEvGwRule_31_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERFORM");
		literal0.setType("");

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
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", csp);
		var_normalStep_type.setType("UseCaseDSL.StepType");

		// Create constraints
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal0);
		eq.setRuleName("");
		eq.solve(var_task_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_task_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("iceInFlow", iceInFlow);
		isApplicableMatch.registerObject("evGw", evGw);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("lane", lane);
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
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_LANESET_LANE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(ServiceTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(LaneSet) arguments.get(8), (Lane) arguments.get(9));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_LANESET_LANE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(ServiceTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(LaneSet) arguments.get(8), (Lane) arguments.get(9));
			return null;
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_LANESET_LANE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(ServiceTask) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(LaneSet) arguments.get(8), (Lane) arguments.get(9));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_ACTOR_PROCESSTOACTOR_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET_LANE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4), (Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6),
					(ServiceTask) arguments.get(7),
					(SequenceFlow) arguments.get(8),
					(SequenceFlow) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10),
					(Flow) arguments.get(11), (LaneSet) arguments.get(12),
					(Lane) arguments.get(13));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET_LANE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4), (Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Flow) arguments.get(10), (LaneSet) arguments.get(11),
					(Lane) arguments.get(12));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_193__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_193((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_194__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_194((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_195__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_195((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_196__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_196((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_197__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_197((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_198__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_198((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_61__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_61((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_62((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_199__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_199((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_EVENTBASEDGATEWAY_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANESET_LANE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EventBasedGateway) arguments.get(3),
					(bpmn2.Process) arguments.get(4), (Actor) arguments.get(5),
					(ProcessToActor) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(SequenceFlowToUCFlow) arguments.get(8),
					(Flow) arguments.get(9), (LaneSet) arguments.get(10),
					(Lane) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_1_blackBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { _this, match, flowNode, iceInFlow,
							evGw, process, task, inFlow, outFlow, laneSet, lane };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_2_bindingFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				flowNode, iceInFlow, evGw, process, task, inFlow, outFlow,
				laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flowNode, iceInFlow, evGw,
					process, task, inFlow, outFlow, laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_0_2_binding = pattern_ServiceTaskToStepAfterEvGwRule_0_2_bindingFBBBBBBBBBBB(
				_this, match, flowNode, iceInFlow, evGw, process, task, inFlow,
				outFlow, laneSet, lane);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_0_2_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_0_2_black = pattern_ServiceTaskToStepAfterEvGwRule_0_2_blackB(csp);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_0_2_black != null) {

				return new Object[] { csp, _this, match, flowNode, iceInFlow,
						evGw, process, task, inFlow, outFlow, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_0_3_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_4_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw,
			bpmn2.Process process, ServiceTask task, SequenceFlow inFlow,
			SequenceFlow outFlow, LaneSet laneSet, Lane lane) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { match, flowNode, iceInFlow, evGw,
							process, task, inFlow, outFlow, laneSet, lane };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_4_greenBBBBBBFFFFFFF(
			Match match, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(task);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__task____flowElements_name_prime = "flowElements";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		match.getToBeTranslatedEdges().add(process__task____flowElements);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		match.getToBeTranslatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(task__inFlow____incoming);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__task____sourceRef.setSrc(outFlow);
		outFlow__task____sourceRef.setTrg(task);
		match.getToBeTranslatedEdges().add(outFlow__task____sourceRef);
		task__outFlow____outgoing.setSrc(task);
		task__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(task__outFlow____outgoing);
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		match.getToBeTranslatedEdges().add(lane__task____flowNodeRefs);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__task____sourceRef
				.setName(outFlow__task____sourceRef_name_prime);
		task__outFlow____outgoing.setName(task__outFlow____outgoing_name_prime);
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		return new Object[] { match, process, task, inFlow, outFlow, lane,
				process__task____flowElements, inFlow__task____targetRef,
				task__inFlow____incoming, process__outFlow____flowElements,
				outFlow__task____sourceRef, task__outFlow____outgoing,
				lane__task____flowNodeRefs };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_5_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw,
			bpmn2.Process process, ServiceTask task, SequenceFlow inFlow,
			SequenceFlow outFlow, LaneSet laneSet, Lane lane) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					return new Object[] { match, flowNode, iceInFlow, evGw,
							process, task, inFlow, outFlow, laneSet, lane };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_0_5_greenBBBBBBBBFFFFFFFFFF(
			Match match, IntermediateCatchEvent flowNode,
			SequenceFlow iceInFlow, EventBasedGateway evGw,
			bpmn2.Process process, SequenceFlow inFlow, LaneSet laneSet,
			Lane lane) {
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
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(laneSet);
		match.getContextNodes().add(lane);
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
		return new Object[] { match, flowNode, iceInFlow, evGw, process,
				inFlow, laneSet, lane, iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing };
	}

	public static final void pattern_ServiceTaskToStepAfterEvGwRule_0_6_expressionBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		_this.registerObjectsToMatch_FWD(match, flowNode, iceInFlow, evGw,
				process, task, inFlow, outFlow, laneSet, lane);

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("iceInFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("evGw");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("actor");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_6 = isApplicableMatch.getObject("task");
		EObject _localVariable_7 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_8 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_10 = isApplicableMatch.getObject("flow");
		EObject _localVariable_11 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_12 = isApplicableMatch.getObject("lane");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpActor = _localVariable_4;
		EObject tmpProcessToActor = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		EObject tmpInFlow = _localVariable_7;
		EObject tmpOutFlow = _localVariable_8;
		EObject tmpInFlowToFlow = _localVariable_9;
		EObject tmpFlow = _localVariable_10;
		EObject tmpLaneSet = _localVariable_11;
		EObject tmpLane = _localVariable_12;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpActor instanceof Actor) {
							Actor actor = (Actor) tmpActor;
							if (tmpProcessToActor instanceof ProcessToActor) {
								ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
								if (tmpTask instanceof ServiceTask) {
									ServiceTask task = (ServiceTask) tmpTask;
									if (tmpInFlow instanceof SequenceFlow) {
										SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
										if (tmpOutFlow instanceof SequenceFlow) {
											SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
											if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
												SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
												if (tmpFlow instanceof Flow) {
													Flow flow = (Flow) tmpFlow;
													if (tmpLaneSet instanceof LaneSet) {
														LaneSet laneSet = (LaneSet) tmpLaneSet;
														if (tmpLane instanceof Lane) {
															Lane lane = (Lane) tmpLane;
															return new Object[] {
																	flowNode,
																	iceInFlow,
																	evGw,
																	process,
																	actor,
																	processToActor,
																	task,
																	inFlow,
																	outFlow,
																	inFlowToFlow,
																	flow,
																	laneSet,
																	lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane, ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { flowNode, iceInFlow, evGw,
									process, actor, processToActor, task,
									inFlow, outFlow, inFlowToFlow, flow,
									laneSet, lane, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_1_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding != null) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[0];
			SequenceFlow iceInFlow = (SequenceFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[1];
			EventBasedGateway evGw = (EventBasedGateway) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[3];
			Actor actor = (Actor) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[4];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[5];
			ServiceTask task = (ServiceTask) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[6];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[7];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[8];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[9];
			Flow flow = (Flow) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[10];
			LaneSet laneSet = (LaneSet) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[11];
			Lane lane = (Lane) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_binding[12];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_black = pattern_ServiceTaskToStepAfterEvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
					flowNode, iceInFlow, evGw, process, actor, processToActor,
					task, inFlow, outFlow, inFlowToFlow, flow, laneSet, lane,
					_this, isApplicableMatch);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_1_1_black[13];

				return new Object[] { flowNode, iceInFlow, evGw, process,
						actor, processToActor, task, inFlow, outFlow,
						inFlowToFlow, flow, laneSet, lane, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_1_greenBBBFFFFBB(
			Actor actor, ServiceTask task, SequenceFlow outFlow, Flow flow,
			CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		FlowNodeToStep taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		Object _localVariable_2 = csp.getValue("normalStep", "type");
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
		StepType normalStep_type_prime = (StepType) _localVariable_2;
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		normalStep.setType(normalStep_type_prime);
		return new Object[] { actor, task, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep, flow, csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_2_blackBBBBBB(
			ServiceTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { task, outFlow, normalStep, taskToNormalStep,
				outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_2_greenFBBBBBB(
			ServiceTask task, SequenceFlow outFlow, NormalStep normalStep,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_3_blackBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject iceInFlow,
			EObject evGw, EObject process, EObject actor,
			EObject processToActor, EObject task, EObject inFlow,
			EObject outFlow, EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep,
			EObject inFlowToFlow, EObject flow, EObject laneSet, EObject lane) {
		if (!flowNode.equals(iceInFlow)) {
			if (!flowNode.equals(process)) {
				if (!flowNode.equals(processToActor)) {
					if (!flowNode.equals(task)) {
						if (!flowNode.equals(inFlow)) {
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
														if (!flowNode
																.equals(lane)) {
															if (!iceInFlow
																	.equals(process)) {
																if (!iceInFlow
																		.equals(processToActor)) {
																	if (!iceInFlow
																			.equals(task)) {
																		if (!iceInFlow
																				.equals(inFlow)) {
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
																										if (!iceInFlow
																												.equals(lane)) {
																											if (!evGw
																													.equals(flowNode)) {
																												if (!evGw
																														.equals(iceInFlow)) {
																													if (!evGw
																															.equals(process)) {
																														if (!evGw
																																.equals(processToActor)) {
																															if (!evGw
																																	.equals(task)) {
																																if (!evGw
																																		.equals(inFlow)) {
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
																																									if (!evGw
																																											.equals(lane)) {
																																										if (!process
																																												.equals(processToActor)) {
																																											if (!process
																																													.equals(task)) {
																																												if (!process
																																														.equals(taskToNormalStep)) {
																																													if (!actor
																																															.equals(flowNode)) {
																																														if (!actor
																																																.equals(iceInFlow)) {
																																															if (!actor
																																																	.equals(evGw)) {
																																																if (!actor
																																																		.equals(process)) {
																																																	if (!actor
																																																			.equals(processToActor)) {
																																																		if (!actor
																																																				.equals(task)) {
																																																			if (!actor
																																																					.equals(inFlow)) {
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
																																																												if (!actor
																																																														.equals(lane)) {
																																																													if (!processToActor
																																																															.equals(task)) {
																																																														if (!processToActor
																																																																.equals(taskToNormalStep)) {
																																																															if (!task
																																																																	.equals(taskToNormalStep)) {
																																																																if (!inFlow
																																																																		.equals(process)) {
																																																																	if (!inFlow
																																																																			.equals(processToActor)) {
																																																																		if (!inFlow
																																																																				.equals(task)) {
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
																																																																										if (!inFlow
																																																																												.equals(lane)) {
																																																																											if (!outFlow
																																																																													.equals(process)) {
																																																																												if (!outFlow
																																																																														.equals(processToActor)) {
																																																																													if (!outFlow
																																																																															.equals(task)) {
																																																																														if (!outFlow
																																																																																.equals(taskToNormalStep)) {
																																																																															if (!outFlow
																																																																																	.equals(outFlowToFlow)) {
																																																																																if (!outFlow
																																																																																		.equals(outFlowToNormalStep)) {
																																																																																	if (!normalStep
																																																																																			.equals(process)) {
																																																																																		if (!normalStep
																																																																																				.equals(processToActor)) {
																																																																																			if (!normalStep
																																																																																					.equals(task)) {
																																																																																				if (!normalStep
																																																																																						.equals(outFlow)) {
																																																																																					if (!normalStep
																																																																																							.equals(taskToNormalStep)) {
																																																																																						if (!normalStep
																																																																																								.equals(outFlowToFlow)) {
																																																																																							if (!normalStep
																																																																																									.equals(outFlowToNormalStep)) {
																																																																																								if (!outFlowToFlow
																																																																																										.equals(process)) {
																																																																																									if (!outFlowToFlow
																																																																																											.equals(processToActor)) {
																																																																																										if (!outFlowToFlow
																																																																																												.equals(task)) {
																																																																																											if (!outFlowToFlow
																																																																																													.equals(taskToNormalStep)) {
																																																																																												if (!outFlowToFlow
																																																																																														.equals(outFlowToNormalStep)) {
																																																																																													if (!outFlowToNormalStep
																																																																																															.equals(process)) {
																																																																																														if (!outFlowToNormalStep
																																																																																																.equals(processToActor)) {
																																																																																															if (!outFlowToNormalStep
																																																																																																	.equals(task)) {
																																																																																																if (!outFlowToNormalStep
																																																																																																		.equals(taskToNormalStep)) {
																																																																																																	if (!inFlowToFlow
																																																																																																			.equals(process)) {
																																																																																																		if (!inFlowToFlow
																																																																																																				.equals(processToActor)) {
																																																																																																			if (!inFlowToFlow
																																																																																																					.equals(task)) {
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
																																																																																																										if (!inFlowToFlow
																																																																																																												.equals(lane)) {
																																																																																																											if (!flow
																																																																																																													.equals(flowNode)) {
																																																																																																												if (!flow
																																																																																																														.equals(iceInFlow)) {
																																																																																																													if (!flow
																																																																																																															.equals(process)) {
																																																																																																														if (!flow
																																																																																																																.equals(processToActor)) {
																																																																																																															if (!flow
																																																																																																																	.equals(task)) {
																																																																																																																if (!flow
																																																																																																																		.equals(inFlow)) {
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
																																																																																																																								if (!flow
																																																																																																																										.equals(lane)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(process)) {
																																																																																																																										if (!laneSet
																																																																																																																												.equals(processToActor)) {
																																																																																																																											if (!laneSet
																																																																																																																													.equals(task)) {
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
																																																																																																																																	if (!lane
																																																																																																																																			.equals(process)) {
																																																																																																																																		if (!lane
																																																																																																																																				.equals(processToActor)) {
																																																																																																																																			if (!lane
																																																																																																																																					.equals(task)) {
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
																																																																																																																																										return new Object[] {
																																																																																																																																												ruleresult,
																																																																																																																																												flowNode,
																																																																																																																																												iceInFlow,
																																																																																																																																												evGw,
																																																																																																																																												process,
																																																																																																																																												actor,
																																																																																																																																												processToActor,
																																																																																																																																												task,
																																																																																																																																												inFlow,
																																																																																																																																												outFlow,
																																																																																																																																												normalStep,
																																																																																																																																												taskToNormalStep,
																																																																																																																																												outFlowToFlow,
																																																																																																																																												outFlowToNormalStep,
																																																																																																																																												inFlowToFlow,
																																																																																																																																												flow,
																																																																																																																																												laneSet,
																																																																																																																																												lane };
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject actor,
			EObject task, EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject flow, EObject lane) {
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ServiceTaskToStepAfterEvGwRule";
		String process__task____flowElements_name_prime = "flowElements";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
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
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getTranslatedEdges().add(process__task____flowElements);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(task__inFlow____incoming);
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
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		ruleresult.getTranslatedEdges().add(lane__task____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
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
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, process, actor, task, inFlow,
				outFlow, normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, lane, process__task____flowElements,
				inFlow__task____targetRef, task__inFlow____incoming,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, normalStep__actor____actor,
				taskToNormalStep__task____source,
				taskToNormalStep__normalStep____target,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps, lane__task____flowNodeRefs };
	}

	public static final void pattern_ServiceTaskToStepAfterEvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject process,
			EObject actor, EObject processToActor, EObject task,
			EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet, EObject lane) {
		_this.registerObjects_FWD(ruleresult, flowNode, iceInFlow, evGw,
				process, actor, processToActor, task, inFlow, outFlow,
				normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, inFlowToFlow, flow, laneSet, lane);

	}

	public static final PerformRuleResult pattern_ServiceTaskToStepAfterEvGwRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_1_blackFBB(
			EClass eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_2_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_black = pattern_ServiceTaskToStepAfterEvGwRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ServiceTaskToStepAfterEvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_2_bindingFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("flowNode");
		EObject _localVariable_1 = match.getObject("iceInFlow");
		EObject _localVariable_2 = match.getObject("evGw");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("task");
		EObject _localVariable_5 = match.getObject("inFlow");
		EObject _localVariable_6 = match.getObject("outFlow");
		EObject _localVariable_7 = match.getObject("laneSet");
		EObject _localVariable_8 = match.getObject("lane");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpTask = _localVariable_4;
		EObject tmpInFlow = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpLaneSet = _localVariable_7;
		EObject tmpLane = _localVariable_8;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpTask instanceof ServiceTask) {
							ServiceTask task = (ServiceTask) tmpTask;
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpLaneSet instanceof LaneSet) {
										LaneSet laneSet = (LaneSet) tmpLaneSet;
										if (tmpLane instanceof Lane) {
											Lane lane = (Lane) tmpLane;
											return new Object[] { flowNode,
													iceInFlow, evGw, process,
													task, inFlow, outFlow,
													laneSet, lane, match };
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

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_2_2_blackBBBBFFBBBFFBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(process,
									ProcessToActor.class, "source")) {
						Actor actor = processToActor.getTarget();
						if (actor != null) {
							for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(inFlow,
											SequenceFlowToUCFlow.class,
											"source")) {
								Flow flow = inFlowToFlow.getTarget();
								if (flow != null) {
									_result.add(new Object[] { flowNode,
											iceInFlow, evGw, process, actor,
											processToActor, task, inFlow,
											outFlow, inFlowToFlow, flow,
											laneSet, lane, match });
								}

							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_2_3_blackBBBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!iceInFlow.equals(inFlow)) {
			if (!iceInFlow.equals(outFlow)) {
				if (!inFlow.equals(outFlow)) {
					if (flowNode.equals(iceInFlow.getTargetRef())) {
						if (evGw.equals(iceInFlow.getSourceRef())) {
							if (process.getFlowElements().contains(task)) {
								if (process.equals(processToActor.getSource())) {
									if (actor
											.equals(processToActor.getTarget())) {
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
																			if (lane.getFlowNodeRefs()
																					.contains(
																							task)) {
																				if (flowNode
																						.equals(inFlow
																								.getSourceRef())) {
																					_result.add(new Object[] {
																							flowNode,
																							iceInFlow,
																							evGw,
																							process,
																							actor,
																							processToActor,
																							task,
																							inFlow,
																							outFlow,
																							inFlowToFlow,
																							flow,
																							laneSet,
																							lane });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {
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
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String iceInFlow__flowNode____targetRef_name_prime = "targetRef";
		String flowNode__iceInFlow____incoming_name_prime = "incoming";
		String iceInFlow__evGw____sourceRef_name_prime = "sourceRef";
		String evGw__iceInFlow____outgoing_name_prime = "outgoing";
		String process__task____flowElements_name_prime = "flowElements";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
		String process__flowNode____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__task____sourceRef_name_prime = "sourceRef";
		String task__outFlow____outgoing_name_prime = "outgoing";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(iceInFlow);
		isApplicableMatch.getAllContextElements().add(evGw);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(lane);
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
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				process__task____flowElements);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
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
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				lane__task____flowNodeRefs);
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
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
		process__flowNode____flowElements
				.setName(process__flowNode____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
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
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		return new Object[] { flowNode, iceInFlow, evGw, process, actor,
				processToActor, task, inFlow, outFlow, inFlowToFlow, flow,
				laneSet, lane, isApplicableMatch,
				iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, process__task____flowElements,
				processToActor__process____source,
				processToActor__actor____target, inFlow__task____targetRef,
				task__inFlow____incoming, process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, laneSet__lane____lanes,
				lane__task____flowNodeRefs, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, process, actor,
				processToActor, task, inFlow, outFlow, inFlowToFlow, flow,
				laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, process, actor, processToActor, task,
					inFlow, outFlow, inFlowToFlow, flow, laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_2_4_binding = pattern_ServiceTaskToStepAfterEvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, process,
				actor, processToActor, task, inFlow, outFlow, inFlowToFlow,
				flow, laneSet, lane);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_2_4_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_2_4_black = pattern_ServiceTaskToStepAfterEvGwRule_2_4_blackB(csp);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, process, actor, processToActor, task,
						inFlow, outFlow, inFlowToFlow, flow, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_2_5_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ServiceTaskToStepAfterEvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ServiceTaskToStepAfterEvGwRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_1_blackBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		return new Object[] { _this, match, actor, normalStep, flow };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_2_bindingFBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, actor,
				normalStep, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, normalStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_2_bindingAndBlackFBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_10_2_binding = pattern_ServiceTaskToStepAfterEvGwRule_10_2_bindingFBBBBB(
				_this, match, actor, normalStep, flow);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_10_2_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_10_2_black = pattern_ServiceTaskToStepAfterEvGwRule_10_2_blackB(csp);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_10_2_black != null) {

				return new Object[] { csp, _this, match, actor, normalStep,
						flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_10_3_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_4_blackBBBB(
			Match match, Actor actor, NormalStep normalStep, Flow flow) {
		return new Object[] { match, actor, normalStep, flow };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_4_greenBBBBFF(
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_5_blackBBBB(
			Match match, Actor actor, NormalStep normalStep, Flow flow) {
		return new Object[] { match, actor, normalStep, flow };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_10_5_greenBBB(
			Match match, Actor actor, Flow flow) {
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		return new Object[] { match, actor, flow };
	}

	public static final void pattern_ServiceTaskToStepAfterEvGwRule_10_6_expressionBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, actor, normalStep, flow);

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("iceInFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("evGw");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("actor");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_8 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject _localVariable_10 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_11 = isApplicableMatch.getObject("lane");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpIceInFlow = _localVariable_1;
		EObject tmpEvGw = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpActor = _localVariable_4;
		EObject tmpProcessToActor = _localVariable_5;
		EObject tmpInFlow = _localVariable_6;
		EObject tmpNormalStep = _localVariable_7;
		EObject tmpInFlowToFlow = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		EObject tmpLaneSet = _localVariable_10;
		EObject tmpLane = _localVariable_11;
		if (tmpFlowNode instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
			if (tmpIceInFlow instanceof SequenceFlow) {
				SequenceFlow iceInFlow = (SequenceFlow) tmpIceInFlow;
				if (tmpEvGw instanceof EventBasedGateway) {
					EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpActor instanceof Actor) {
							Actor actor = (Actor) tmpActor;
							if (tmpProcessToActor instanceof ProcessToActor) {
								ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
								if (tmpInFlow instanceof SequenceFlow) {
									SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
									if (tmpNormalStep instanceof NormalStep) {
										NormalStep normalStep = (NormalStep) tmpNormalStep;
										if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
											SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
											if (tmpFlow instanceof Flow) {
												Flow flow = (Flow) tmpFlow;
												if (tmpLaneSet instanceof LaneSet) {
													LaneSet laneSet = (LaneSet) tmpLaneSet;
													if (tmpLane instanceof Lane) {
														Lane lane = (Lane) tmpLane;
														return new Object[] {
																flowNode,
																iceInFlow,
																evGw, process,
																actor,
																processToActor,
																inFlow,
																normalStep,
																inFlowToFlow,
																flow, laneSet,
																lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_1_blackBBBBBBBBBBBBFBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, Lane lane,
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!iceInFlow.equals(inFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { flowNode, iceInFlow, evGw, process,
							actor, processToActor, inFlow, normalStep,
							inFlowToFlow, flow, laneSet, lane, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_11_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding != null) {
			IntermediateCatchEvent flowNode = (IntermediateCatchEvent) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[0];
			SequenceFlow iceInFlow = (SequenceFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[1];
			EventBasedGateway evGw = (EventBasedGateway) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[3];
			Actor actor = (Actor) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[4];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[5];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[6];
			NormalStep normalStep = (NormalStep) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[8];
			Flow flow = (Flow) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[9];
			LaneSet laneSet = (LaneSet) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[10];
			Lane lane = (Lane) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_binding[11];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_black = pattern_ServiceTaskToStepAfterEvGwRule_11_1_blackBBBBBBBBBBBBFBB(
					flowNode, iceInFlow, evGw, process, actor, processToActor,
					inFlow, normalStep, inFlowToFlow, flow, laneSet, lane,
					_this, isApplicableMatch);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_11_1_black[12];

				return new Object[] { flowNode, iceInFlow, evGw, process,
						actor, processToActor, inFlow, normalStep,
						inFlowToFlow, flow, laneSet, lane, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_1_greenBFBFBFFFBBB(
			bpmn2.Process process, SequenceFlow inFlow, NormalStep normalStep,
			Flow flow, Lane lane, CSP csp) {
		ServiceTask task = Bpmn2Factory.eINSTANCE.createServiceTask();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep taskToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("task", "id");
		Object _localVariable_1 = csp.getValue("task", "name");
		process.getFlowElements().add(task);
		inFlow.setTargetRef(task);
		lane.getFlowNodeRefs().add(task);
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
		return new Object[] { process, task, inFlow, outFlow, normalStep,
				taskToNormalStep, outFlowToFlow, outFlowToNormalStep, flow,
				lane, csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_2_blackBBBBBB(
			ServiceTask task, SequenceFlow outFlow, NormalStep normalStep,
			FlowNodeToStep taskToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { task, outFlow, normalStep, taskToNormalStep,
				outFlowToFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_2_greenFBBBBBB(
			ServiceTask task, SequenceFlow outFlow, NormalStep normalStep,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_3_blackBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject iceInFlow,
			EObject evGw, EObject process, EObject actor,
			EObject processToActor, EObject task, EObject inFlow,
			EObject outFlow, EObject normalStep, EObject taskToNormalStep,
			EObject outFlowToFlow, EObject outFlowToNormalStep,
			EObject inFlowToFlow, EObject flow, EObject laneSet, EObject lane) {
		if (!flowNode.equals(iceInFlow)) {
			if (!flowNode.equals(process)) {
				if (!flowNode.equals(processToActor)) {
					if (!flowNode.equals(task)) {
						if (!flowNode.equals(inFlow)) {
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
														if (!flowNode
																.equals(lane)) {
															if (!iceInFlow
																	.equals(process)) {
																if (!iceInFlow
																		.equals(processToActor)) {
																	if (!iceInFlow
																			.equals(task)) {
																		if (!iceInFlow
																				.equals(inFlow)) {
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
																										if (!iceInFlow
																												.equals(lane)) {
																											if (!evGw
																													.equals(flowNode)) {
																												if (!evGw
																														.equals(iceInFlow)) {
																													if (!evGw
																															.equals(process)) {
																														if (!evGw
																																.equals(processToActor)) {
																															if (!evGw
																																	.equals(task)) {
																																if (!evGw
																																		.equals(inFlow)) {
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
																																									if (!evGw
																																											.equals(lane)) {
																																										if (!process
																																												.equals(processToActor)) {
																																											if (!process
																																													.equals(task)) {
																																												if (!process
																																														.equals(taskToNormalStep)) {
																																													if (!actor
																																															.equals(flowNode)) {
																																														if (!actor
																																																.equals(iceInFlow)) {
																																															if (!actor
																																																	.equals(evGw)) {
																																																if (!actor
																																																		.equals(process)) {
																																																	if (!actor
																																																			.equals(processToActor)) {
																																																		if (!actor
																																																				.equals(task)) {
																																																			if (!actor
																																																					.equals(inFlow)) {
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
																																																												if (!actor
																																																														.equals(lane)) {
																																																													if (!processToActor
																																																															.equals(task)) {
																																																														if (!processToActor
																																																																.equals(taskToNormalStep)) {
																																																															if (!task
																																																																	.equals(taskToNormalStep)) {
																																																																if (!inFlow
																																																																		.equals(process)) {
																																																																	if (!inFlow
																																																																			.equals(processToActor)) {
																																																																		if (!inFlow
																																																																				.equals(task)) {
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
																																																																										if (!inFlow
																																																																												.equals(lane)) {
																																																																											if (!outFlow
																																																																													.equals(process)) {
																																																																												if (!outFlow
																																																																														.equals(processToActor)) {
																																																																													if (!outFlow
																																																																															.equals(task)) {
																																																																														if (!outFlow
																																																																																.equals(taskToNormalStep)) {
																																																																															if (!outFlow
																																																																																	.equals(outFlowToFlow)) {
																																																																																if (!outFlow
																																																																																		.equals(outFlowToNormalStep)) {
																																																																																	if (!normalStep
																																																																																			.equals(process)) {
																																																																																		if (!normalStep
																																																																																				.equals(processToActor)) {
																																																																																			if (!normalStep
																																																																																					.equals(task)) {
																																																																																				if (!normalStep
																																																																																						.equals(outFlow)) {
																																																																																					if (!normalStep
																																																																																							.equals(taskToNormalStep)) {
																																																																																						if (!normalStep
																																																																																								.equals(outFlowToFlow)) {
																																																																																							if (!normalStep
																																																																																									.equals(outFlowToNormalStep)) {
																																																																																								if (!outFlowToFlow
																																																																																										.equals(process)) {
																																																																																									if (!outFlowToFlow
																																																																																											.equals(processToActor)) {
																																																																																										if (!outFlowToFlow
																																																																																												.equals(task)) {
																																																																																											if (!outFlowToFlow
																																																																																													.equals(taskToNormalStep)) {
																																																																																												if (!outFlowToFlow
																																																																																														.equals(outFlowToNormalStep)) {
																																																																																													if (!outFlowToNormalStep
																																																																																															.equals(process)) {
																																																																																														if (!outFlowToNormalStep
																																																																																																.equals(processToActor)) {
																																																																																															if (!outFlowToNormalStep
																																																																																																	.equals(task)) {
																																																																																																if (!outFlowToNormalStep
																																																																																																		.equals(taskToNormalStep)) {
																																																																																																	if (!inFlowToFlow
																																																																																																			.equals(process)) {
																																																																																																		if (!inFlowToFlow
																																																																																																				.equals(processToActor)) {
																																																																																																			if (!inFlowToFlow
																																																																																																					.equals(task)) {
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
																																																																																																										if (!inFlowToFlow
																																																																																																												.equals(lane)) {
																																																																																																											if (!flow
																																																																																																													.equals(flowNode)) {
																																																																																																												if (!flow
																																																																																																														.equals(iceInFlow)) {
																																																																																																													if (!flow
																																																																																																															.equals(process)) {
																																																																																																														if (!flow
																																																																																																																.equals(processToActor)) {
																																																																																																															if (!flow
																																																																																																																	.equals(task)) {
																																																																																																																if (!flow
																																																																																																																		.equals(inFlow)) {
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
																																																																																																																								if (!flow
																																																																																																																										.equals(lane)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(process)) {
																																																																																																																										if (!laneSet
																																																																																																																												.equals(processToActor)) {
																																																																																																																											if (!laneSet
																																																																																																																													.equals(task)) {
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
																																																																																																																																	if (!lane
																																																																																																																																			.equals(process)) {
																																																																																																																																		if (!lane
																																																																																																																																				.equals(processToActor)) {
																																																																																																																																			if (!lane
																																																																																																																																					.equals(task)) {
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
																																																																																																																																										return new Object[] {
																																																																																																																																												ruleresult,
																																																																																																																																												flowNode,
																																																																																																																																												iceInFlow,
																																																																																																																																												evGw,
																																																																																																																																												process,
																																																																																																																																												actor,
																																																																																																																																												processToActor,
																																																																																																																																												task,
																																																																																																																																												inFlow,
																																																																																																																																												outFlow,
																																																																																																																																												normalStep,
																																																																																																																																												taskToNormalStep,
																																																																																																																																												outFlowToFlow,
																																																																																																																																												outFlowToNormalStep,
																																																																																																																																												inFlowToFlow,
																																																																																																																																												flow,
																																																																																																																																												laneSet,
																																																																																																																																												lane };
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject actor,
			EObject task, EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject flow, EObject lane) {
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge lane__task____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ServiceTaskToStepAfterEvGwRule";
		String process__task____flowElements_name_prime = "flowElements";
		String inFlow__task____targetRef_name_prime = "targetRef";
		String task__inFlow____incoming_name_prime = "incoming";
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
		String lane__task____flowNodeRefs_name_prime = "flowNodeRefs";
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getCreatedEdges().add(process__task____flowElements);
		inFlow__task____targetRef.setSrc(inFlow);
		inFlow__task____targetRef.setTrg(task);
		ruleresult.getCreatedEdges().add(inFlow__task____targetRef);
		task__inFlow____incoming.setSrc(task);
		task__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(task__inFlow____incoming);
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
		lane__task____flowNodeRefs.setSrc(lane);
		lane__task____flowNodeRefs.setTrg(task);
		ruleresult.getCreatedEdges().add(lane__task____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		inFlow__task____targetRef.setName(inFlow__task____targetRef_name_prime);
		task__inFlow____incoming.setName(task__inFlow____incoming_name_prime);
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
		lane__task____flowNodeRefs
				.setName(lane__task____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, process, actor, task, inFlow,
				outFlow, normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, lane, process__task____flowElements,
				inFlow__task____targetRef, task__inFlow____incoming,
				process__outFlow____flowElements, outFlow__task____sourceRef,
				task__outFlow____outgoing, normalStep__actor____actor,
				taskToNormalStep__task____source,
				taskToNormalStep__normalStep____target,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps, lane__task____flowNodeRefs };
	}

	public static final void pattern_ServiceTaskToStepAfterEvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject iceInFlow, EObject evGw, EObject process,
			EObject actor, EObject processToActor, EObject task,
			EObject inFlow, EObject outFlow, EObject normalStep,
			EObject taskToNormalStep, EObject outFlowToFlow,
			EObject outFlowToNormalStep, EObject inFlowToFlow, EObject flow,
			EObject laneSet, EObject lane) {
		_this.registerObjects_BWD(ruleresult, flowNode, iceInFlow, evGw,
				process, actor, processToActor, task, inFlow, outFlow,
				normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, inFlowToFlow, flow, laneSet, lane);

	}

	public static final PerformRuleResult pattern_ServiceTaskToStepAfterEvGwRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_1_blackFBB(
			EClass eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_12_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_black = pattern_ServiceTaskToStepAfterEvGwRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ServiceTaskToStepAfterEvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_2_bindingFFFB(
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

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_12_2_blackFBFFBFBB(
			Actor actor, NormalStep normalStep, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(actor, ProcessToActor.class,
						"target")) {
			bpmn2.Process process = processToActor.getSource();
			if (process != null) {
				for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(flow,
								SequenceFlowToUCFlow.class, "target")) {
					SequenceFlow inFlow = inFlowToFlow.getSource();
					if (inFlow != null) {
						_result.add(new Object[] { process, actor,
								processToActor, inFlow, normalStep,
								inFlowToFlow, flow, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_12_3_blackFFFBBBBBBBFF(
			bpmn2.Process process, Actor actor, ProcessToActor processToActor,
			SequenceFlow inFlow, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.equals(processToActor.getSource())) {
			if (actor.equals(processToActor.getTarget())) {
				if (process.getFlowElements().contains(inFlow)) {
					if (actor.equals(normalStep.getActor())) {
						if (inFlow.equals(inFlowToFlow.getSource())) {
							if (flow.equals(inFlowToFlow.getTarget())) {
								if (flow.getSteps().contains(normalStep)) {
									FlowNode tmpFlowNode = inFlow
											.getSourceRef();
									if (tmpFlowNode instanceof IntermediateCatchEvent) {
										IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
										if (process.getFlowElements().contains(
												flowNode)) {
											for (LaneSet laneSet : process
													.getLaneSets()) {
												for (SequenceFlow iceInFlow : flowNode
														.getIncoming()) {
													if (!iceInFlow
															.equals(inFlow)) {
														FlowNode tmpEvGw = iceInFlow
																.getSourceRef();
														if (tmpEvGw instanceof EventBasedGateway) {
															EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
															for (Lane lane : laneSet
																	.getLanes()) {
																_result.add(new Object[] {
																		flowNode,
																		iceInFlow,
																		evGw,
																		process,
																		actor,
																		processToActor,
																		inFlow,
																		normalStep,
																		inFlowToFlow,
																		flow,
																		laneSet,
																		lane });
															}
														}

													}
												}
											}
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, Lane lane) {
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
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
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
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
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
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(lane);
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
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
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
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
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
		return new Object[] { flowNode, iceInFlow, evGw, process, actor,
				processToActor, inFlow, normalStep, inFlowToFlow, flow,
				laneSet, lane, isApplicableMatch,
				iceInFlow__flowNode____targetRef,
				flowNode__iceInFlow____incoming, iceInFlow__evGw____sourceRef,
				evGw__iceInFlow____outgoing, processToActor__process____source,
				processToActor__actor____target,
				process__flowNode____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				normalStep__actor____actor, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, flow__normalStep____steps,
				laneSet__lane____lanes, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, Lane lane) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, process, actor,
				processToActor, inFlow, normalStep, inFlowToFlow, flow,
				laneSet, lane);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, process, actor, processToActor, inFlow,
					normalStep, inFlowToFlow, flow, laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			Flow flow, LaneSet laneSet, Lane lane) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_12_4_binding = pattern_ServiceTaskToStepAfterEvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, process,
				actor, processToActor, inFlow, normalStep, inFlowToFlow, flow,
				laneSet, lane);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_12_4_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_12_4_black = pattern_ServiceTaskToStepAfterEvGwRule_12_4_blackB(csp);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, process, actor, processToActor,
						inFlow, normalStep, inFlowToFlow, flow, laneSet, lane };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_12_5_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ServiceTaskToStepAfterEvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ServiceTaskToStepAfterEvGwRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_20_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_black = pattern_ServiceTaskToStepAfterEvGwRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_510857 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_20_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof ServiceTask) {
				ServiceTask task = (ServiceTask) tmpTask;
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
																if (pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_0B(outFlow) == null) {
																	if (pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_2BB(
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
																						if (pattern_ServiceTaskToStepAfterEvGwRule_20_2_black_nac_1BB(
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
																											process,
																											task,
																											inFlow,
																											outFlow,
																											laneSet,
																											lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_20_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_20_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_21_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_black = pattern_ServiceTaskToStepAfterEvGwRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_947491 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_21_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof ServiceTask) {
				ServiceTask task = (ServiceTask) tmpTask;
				if (task.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
						for (SequenceFlow outFlow : task.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_0B(outFlow) == null) {
									if (pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_2BB(
											outFlow, task) == null) {
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_ServiceTaskToStepAfterEvGwRule_21_2_black_nac_1BB(
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
																					task)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						flowNode)) {
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
																									process,
																									task,
																									inFlow,
																									outFlow,
																									laneSet,
																									lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_21_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_21_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_22_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_black = pattern_ServiceTaskToStepAfterEvGwRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_414340 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_22_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof ServiceTask) {
			ServiceTask task = (ServiceTask) tmpTask;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (task.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
						for (SequenceFlow outFlow : task.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_0B(outFlow) == null) {
									if (pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_2BB(
											outFlow, task) == null) {
										for (SequenceFlow iceInFlow : flowNode
												.getIncoming()) {
											if (!iceInFlow.equals(inFlow)) {
												if (!iceInFlow.equals(outFlow)) {
													FlowNode tmpEvGw = iceInFlow
															.getSourceRef();
													if (tmpEvGw instanceof EventBasedGateway) {
														EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
														if (pattern_ServiceTaskToStepAfterEvGwRule_22_2_black_nac_1BB(
																iceInFlow, task) == null) {
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
																					for (Lane lane : laneSet
																							.getLanes()) {
																						if (lane.getFlowNodeRefs()
																								.contains(
																										task)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									process,
																									task,
																									inFlow,
																									outFlow,
																									laneSet,
																									lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_22_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_22_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_23_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_black = pattern_ServiceTaskToStepAfterEvGwRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_15852 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_23_2_blackFFFFFFFFFB(
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
					if (tmpTask instanceof ServiceTask) {
						ServiceTask task = (ServiceTask) tmpTask;
						if (process.getFlowElements().contains(task)) {
							if (pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_0B(outFlow) == null) {
								if (pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_2BB(
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
																					if (pattern_ServiceTaskToStepAfterEvGwRule_23_2_black_nac_1BB(
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
																										process,
																										task,
																										inFlow,
																										outFlow,
																										laneSet,
																										lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_23_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_23_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_24_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_black = pattern_ServiceTaskToStepAfterEvGwRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_509901 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_24_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpTask = _edge_sourceRef.getTrg();
			if (tmpTask instanceof ServiceTask) {
				ServiceTask task = (ServiceTask) tmpTask;
				if (task.equals(outFlow.getSourceRef())) {
					if (pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_0B(outFlow) == null) {
						if (pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_2BB(
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
														if (pattern_ServiceTaskToStepAfterEvGwRule_24_2_black_nac_1BB(
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
																					task)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						flowNode)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							inFlow)) {
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
																									process,
																									task,
																									inFlow,
																									outFlow,
																									laneSet,
																									lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_24_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_24_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_25_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_black = pattern_ServiceTaskToStepAfterEvGwRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_183222 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_25_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_outgoing.getSrc();
		if (tmpTask instanceof ServiceTask) {
			ServiceTask task = (ServiceTask) tmpTask;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (task.equals(outFlow.getSourceRef())) {
					if (pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_0B(outFlow) == null) {
						if (pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_2BB(
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
														if (pattern_ServiceTaskToStepAfterEvGwRule_25_2_black_nac_1BB(
																iceInFlow, task) == null) {
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
																					for (Lane lane : laneSet
																							.getLanes()) {
																						if (lane.getFlowNodeRefs()
																								.contains(
																										task)) {
																							_result.add(new Object[] {
																									flowNode,
																									iceInFlow,
																									evGw,
																									process,
																									task,
																									inFlow,
																									outFlow,
																									laneSet,
																									lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_25_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_25_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_26_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_black = pattern_ServiceTaskToStepAfterEvGwRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_26_2_blackFFFB(
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_26_3_expressionFBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, actor,
				normalStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_26_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_27_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_black = pattern_ServiceTaskToStepAfterEvGwRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_27_2_blackFFFB(
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_27_3_expressionFBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match, Actor actor,
			NormalStep normalStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, actor,
				normalStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_27_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_1_bindingFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_1_blackFBB(
			EClass __eClass, ServiceTaskToStepAfterEvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_1_bindingAndBlackFFB(
			ServiceTaskToStepAfterEvGwRule _this) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_binding = pattern_ServiceTaskToStepAfterEvGwRule_28_1_bindingFB(_this);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_black = pattern_ServiceTaskToStepAfterEvGwRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ServiceTaskToStepAfterEvGwRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_878151 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_1BB(
			SequenceFlow iceInFlow, ServiceTask task) {
		if (task.equals(iceInFlow.getTargetRef())) {
			return new Object[] { iceInFlow, task };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_2BB(
			SequenceFlow outFlow, ServiceTask task) {
		if (task.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_28_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpTask = _edge_flowNodeRefs.getTrg();
			if (tmpTask instanceof ServiceTask) {
				ServiceTask task = (ServiceTask) tmpTask;
				if (lane.getFlowNodeRefs().contains(task)) {
					for (SequenceFlow inFlow : task.getIncoming()) {
						FlowNode tmpFlowNode = inFlow.getSourceRef();
						if (tmpFlowNode instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
							for (SequenceFlow outFlow : task.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_0B(outFlow) == null) {
										if (pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_2BB(
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
															if (pattern_ServiceTaskToStepAfterEvGwRule_28_2_black_nac_1BB(
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
																									process,
																									task,
																									inFlow,
																									outFlow,
																									laneSet,
																									lane,
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

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_28_3_expressionFBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, ServiceTask task,
			SequenceFlow inFlow, SequenceFlow outFlow, LaneSet laneSet,
			Lane lane) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				iceInFlow, evGw, process, task, inFlow, outFlow, laneSet, lane);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_28_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ServiceTaskToStepAfterEvGwRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_1_blackB(
			ServiceTaskToStepAfterEvGwRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, IntermediateCatchEvent flowNode) {
		if (ruleResult.getSourceObjects().contains(flowNode)) {
			return new Object[] { ruleResult, flowNode };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow iceInFlow) {
		if (ruleResult.getSourceObjects().contains(iceInFlow)) {
			return new Object[] { ruleResult, iceInFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, EventBasedGateway evGw) {
		if (ruleResult.getSourceObjects().contains(evGw)) {
			return new Object[] { ruleResult, evGw };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, ProcessToActor processToActor) {
		if (ruleResult.getCorrObjects().contains(processToActor)) {
			return new Object[] { ruleResult, processToActor };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ServiceTaskToStepAfterEvGwRule_31_2_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToFlowList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToFlow : inFlowToFlowList.getEntryObjects()) {
				if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
					SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
					SequenceFlow inFlow = inFlowToFlow.getSource();
					if (inFlow != null) {
						Flow flow = inFlowToFlow.getTarget();
						if (flow != null) {
							FlowNode tmpFlowNode = inFlow.getSourceRef();
							if (tmpFlowNode instanceof IntermediateCatchEvent) {
								IntermediateCatchEvent flowNode = (IntermediateCatchEvent) tmpFlowNode;
								if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_7BB(
										ruleResult, inFlowToFlow) == null) {
									if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_6BB(
											ruleResult, inFlow) == null) {
										if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_8BB(
												ruleResult, flow) == null) {
											if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_0BB(
													ruleResult, flowNode) == null) {
												for (SequenceFlow iceInFlow : flowNode
														.getIncoming()) {
													if (!iceInFlow
															.equals(inFlow)) {
														FlowNode tmpEvGw = iceInFlow
																.getSourceRef();
														if (tmpEvGw instanceof EventBasedGateway) {
															EventBasedGateway evGw = (EventBasedGateway) tmpEvGw;
															if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_1BB(
																	ruleResult,
																	iceInFlow) == null) {
																if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_2BB(
																		ruleResult,
																		evGw) == null) {
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
																				if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_3BB(
																						ruleResult,
																						process) == null) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_4BB(
																								ruleResult,
																								laneSet) == null) {
																							for (Lane lane : laneSet
																									.getLanes()) {
																								if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_5BB(
																										ruleResult,
																										lane) == null) {
																									for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													process,
																													ProcessToActor.class,
																													"source")) {
																										Actor actor = processToActor
																												.getTarget();
																										if (actor != null) {
																											if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_9BB(
																													ruleResult,
																													processToActor) == null) {
																												if (pattern_ServiceTaskToStepAfterEvGwRule_31_2_black_nac_10BB(
																														ruleResult,
																														actor) == null) {
																													_result.add(new Object[] {
																															inFlowToFlowList,
																															flowNode,
																															iceInFlow,
																															evGw,
																															process,
																															laneSet,
																															lane,
																															inFlow,
																															inFlowToFlow,
																															flow,
																															processToActor,
																															actor,
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
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_3_bindingFBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, flowNode, iceInFlow, evGw, process, actor,
				processToActor, inFlow, inFlowToFlow, flow, laneSet, lane,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					iceInFlow, evGw, process, actor, processToActor, inFlow,
					inFlowToFlow, flow, laneSet, lane, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_3_bindingAndBlackFBBBBBBBBBBBBBB(
			ServiceTaskToStepAfterEvGwRule _this,
			IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_31_3_binding = pattern_ServiceTaskToStepAfterEvGwRule_31_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, iceInFlow, evGw, process,
				actor, processToActor, inFlow, inFlowToFlow, flow, laneSet,
				lane, ruleResult);
		if (result_pattern_ServiceTaskToStepAfterEvGwRule_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_ServiceTaskToStepAfterEvGwRule_31_3_binding[0];

			Object[] result_pattern_ServiceTaskToStepAfterEvGwRule_31_3_black = pattern_ServiceTaskToStepAfterEvGwRule_31_3_blackB(csp);
			if (result_pattern_ServiceTaskToStepAfterEvGwRule_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						iceInFlow, evGw, process, actor, processToActor,
						inFlow, inFlowToFlow, flow, laneSet, lane, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ServiceTaskToStepAfterEvGwRule_31_4_expressionFBB(
			ServiceTaskToStepAfterEvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_5_blackBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane) {
		if (!iceInFlow.equals(inFlow)) {
			return new Object[] { flowNode, iceInFlow, evGw, process, actor,
					processToActor, inFlow, inFlowToFlow, flow, laneSet, lane };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_6_blackBBBBBBBBBBBB(
			IntermediateCatchEvent flowNode, SequenceFlow iceInFlow,
			EventBasedGateway evGw, bpmn2.Process process, Actor actor,
			ProcessToActor processToActor, SequenceFlow inFlow,
			SequenceFlowToUCFlow inFlowToFlow, Flow flow, LaneSet laneSet,
			Lane lane, ModelgeneratorRuleResult ruleResult) {
		if (!iceInFlow.equals(inFlow)) {
			return new Object[] { flowNode, iceInFlow, evGw, process, actor,
					processToActor, inFlow, inFlowToFlow, flow, laneSet, lane,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ServiceTaskToStepAfterEvGwRule_31_6_greenBBFBFFFFFBBBB(
			bpmn2.Process process, Actor actor, SequenceFlow inFlow, Flow flow,
			Lane lane, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ServiceTask task = Bpmn2Factory.eINSTANCE.createServiceTask();
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
		Object _localVariable_4 = csp.getValue("normalStep", "type");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(task);
		inFlow.setTargetRef(task);
		lane.getFlowNodeRefs().add(task);
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
		StepType normalStep_type_prime = (StepType) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		task.setId(task_id_prime);
		task.setName(task_name_prime);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		normalStep.setType(normalStep_type_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, actor, task, inFlow, outFlow,
				normalStep, taskToNormalStep, outFlowToFlow,
				outFlowToNormalStep, flow, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ServiceTaskToStepAfterEvGwRule_31_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ServiceTaskToStepAfterEvGwRuleImpl
