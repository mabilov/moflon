/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.ProcessToActor;

import BpmnToUseCaseIntegration.Rules.ICEToStepAfterExConvGwRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

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
import UseCaseDSL.Step;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCaseDSLFactory;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.SequenceFlow;

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
 * An implementation of the model object '<em><b>ICE To Step After Ex Conv Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ICEToStepAfterExConvGwRuleImpl extends AbstractRuleImpl implements
		ICEToStepAfterExConvGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICEToStepAfterExConvGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getICEToStepAfterExConvGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway flowNode,
			IntermediateCatchEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_0_1_blackBBBBBBBBB(this,
						match, flowNode, event, inFlow, process, outFlow, lane,
						laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_0_2_bindingAndBlackFBBBBBBBBB(
						this, match, flowNode, event, inFlow, process, outFlow,
						lane, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_4_blackBBBBBBBB(
							match, flowNode, event, inFlow, process, outFlow,
							lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_4_greenBBBBBBFFFFFFF(
							match, event, inFlow, process, outFlow, lane);
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__event____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__event____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge event__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge lane__event____flowNodeRefs = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_5_blackBBBBBBBB(
							match, flowNode, event, inFlow, process, outFlow,
							lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_5_greenBBBBBBFFFFF(
							match, flowNode, inFlow, process, lane, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result5_green[8];
			// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result5_green[9];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[10];

			// register objects to match
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_6_expressionBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet);
			return ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_7_expressionF();
		} else {
			return ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExclusiveGateway flowNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		IntermediateCatchEvent event = (IntermediateCatchEvent) result1_bindingAndBlack[1];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[4];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[5];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[6];
		Actor actor = (Actor) result1_bindingAndBlack[7];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[8];
		Flow flow = (Flow) result1_bindingAndBlack[9];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[10];
		Lane lane = (Lane) result1_bindingAndBlack[11];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_1_greenFBBBFBFB(prevStep,
						outFlow, actor, flow, csp);
		NormalStep normalStep = (NormalStep) result1_green[0];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[4];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[6];

		// collect translated elements
		Object[] result2_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_2_blackBBBBB(event,
						normalStep, outFlow, outFlowToNormalStep, outFlowToFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_2_greenFBBBBB(event,
						normalStep, outFlow, outFlowToNormalStep, outFlowToFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, event, normalStep, inFlow,
						prevStep, inFlowToPrevStep, process, outFlow, actor,
						processToActor, outFlowToNormalStep, flow,
						inFlowToFlow, outFlowToFlow, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, event, normalStep, inFlow, prevStep,
						process, outFlow, actor, outFlowToNormalStep, flow,
						outFlowToFlow, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[12];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[13];
		// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[14];
		// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__event____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge event__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge lane__event____flowNodeRefs = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, event, normalStep, inFlow,
						prevStep, inFlowToPrevStep, process, outFlow, actor,
						processToActor, outFlowToNormalStep, flow,
						inFlowToFlow, outFlowToFlow, lane, laneSet);
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExclusiveGateway flowNode = (ExclusiveGateway) result2_binding[0];
		IntermediateCatchEvent event = (IntermediateCatchEvent) result2_binding[1];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[2];
		bpmn2.Process process = (bpmn2.Process) result2_binding[3];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[4];
		Lane lane = (Lane) result2_binding[5];
		LaneSet laneSet = (LaneSet) result2_binding[6];
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_2_2_blackBBBFFBBFFFFBBB(
						flowNode, event, inFlow, process, outFlow, lane,
						laneSet, match)) {
			Step prevStep = (Step) result2_black[3];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[4];
			Actor actor = (Actor) result2_black[7];
			ProcessToActor processToActor = (ProcessToActor) result2_black[8];
			Flow flow = (Flow) result2_black[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_2_3_blackBBBBBBBBBBBBB(
							flowNode, event, inFlow, prevStep,
							inFlowToPrevStep, process, outFlow, actor,
							processToActor, flow, inFlowToFlow, lane, laneSet)) {
				Object[] result3_green = ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
								flowNode, event, inFlow, prevStep,
								inFlowToPrevStep, process, outFlow, actor,
								processToActor, flow, inFlowToFlow, lane,
								laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge outFlow__event____sourceRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge event__outFlow____outgoing = (EMoflonEdge) result3_green[23];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[25];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result3_green[28];
				// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result3_green[29];
				// EMoflonEdge lane__event____flowNodeRefs = (EMoflonEdge) result3_green[30];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[31];

				// solve CSP
				Object[] result4_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, event,
								inFlow, prevStep, inFlowToPrevStep, process,
								outFlow, actor, processToActor, flow,
								inFlowToFlow, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		match.registerObject("flowNode", flowNode);
		match.registerObject("event", event);
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables
		Variable var_flowNode_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("flowNode.gatewayDirection", true, csp);
		var_flowNode_gatewayDirection.setValue(flowNode.getGatewayDirection());
		var_flowNode_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_flowNode_gatewayDirection, literal0);
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
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("WAIT");
		literal0.setType("");

		// Create attribute variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", true, csp);
		var_event_name.setValue(event.getName());
		var_event_name.setType("String");

		// Create unbound variables
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", csp);
		var_normalStep_type.setType("UseCaseDSL.StepType");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");

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
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("event", event);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("outFlow", outFlow);
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
			EObject flowNode, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject process, EObject outFlow, EObject actor,
			EObject processToActor, EObject outFlowToNormalStep, EObject flow,
			EObject inFlowToFlow, EObject outFlowToFlow, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
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
								.getIntermediateCatchEvent())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep normalStep,
			Step prevStep, Actor actor, Flow flow) {
		// initial bindings
		Object[] result1_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_10_1_blackBBBBBB(this,
						match, normalStep, prevStep, actor, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_10_2_bindingAndBlackFBBBBBB(
						this, match, normalStep, prevStep, actor, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_4_blackBBBBB(match,
							normalStep, prevStep, actor, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_4_greenBBBBBFFF(
							match, normalStep, prevStep, actor, flow);
			// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result4_green[5];
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[6];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_5_blackBBBBB(match,
							normalStep, prevStep, actor, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_5_greenBBBB(match,
							prevStep, actor, flow);

			// register objects to match
			ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_6_expressionBBBBBB(
							this, match, normalStep, prevStep, actor, flow);
			return ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_7_expressionF();
		} else {
			return ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExclusiveGateway flowNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[1];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[4];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[5];
		Actor actor = (Actor) result1_bindingAndBlack[6];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[9];
		Lane lane = (Lane) result1_bindingAndBlack[10];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_1_greenFBBBFFBFBB(
						normalStep, inFlow, process, flow, lane, csp);
		IntermediateCatchEvent event = (IntermediateCatchEvent) result1_green[0];
		SequenceFlow outFlow = (SequenceFlow) result1_green[4];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[5];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[7];

		// collect translated elements
		Object[] result2_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_2_blackBBBBB(event,
						normalStep, outFlow, outFlowToNormalStep, outFlowToFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_2_greenFBBBBB(event,
						normalStep, outFlow, outFlowToNormalStep, outFlowToFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, flowNode, event, normalStep, inFlow,
						prevStep, inFlowToPrevStep, process, outFlow, actor,
						processToActor, outFlowToNormalStep, flow,
						inFlowToFlow, outFlowToFlow, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, event, normalStep, inFlow, prevStep,
						process, outFlow, actor, outFlowToNormalStep, flow,
						outFlowToFlow, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[12];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[13];
		// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[14];
		// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__event____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge event__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[22];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[24];
		// EMoflonEdge lane__event____flowNodeRefs = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, flowNode, event, normalStep, inFlow,
						prevStep, inFlowToPrevStep, process, outFlow, actor,
						processToActor, outFlowToNormalStep, flow,
						inFlowToFlow, outFlowToFlow, lane, laneSet);
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		NormalStep normalStep = (NormalStep) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		Actor actor = (Actor) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_12_2_blackBFBFFBFBFB(
						normalStep, prevStep, actor, flow, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[3];
			bpmn2.Process process = (bpmn2.Process) result2_black[4];
			ProcessToActor processToActor = (ProcessToActor) result2_black[6];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_12_3_blackFBBBBBBBBBFF(
							normalStep, inFlow, prevStep, inFlowToPrevStep,
							process, actor, processToActor, flow, inFlowToFlow)) {
				ExclusiveGateway flowNode = (ExclusiveGateway) result3_black[0];
				Lane lane = (Lane) result3_black[10];
				LaneSet laneSet = (LaneSet) result3_black[11];
				Object[] result3_green = ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
								flowNode, normalStep, inFlow, prevStep,
								inFlowToPrevStep, process, actor,
								processToActor, flow, inFlowToFlow, lane,
								laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[21];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge inFlow__flowNode____sourceRef = (EMoflonEdge) result3_green[24];
				// EMoflonEdge flowNode__inFlow____outgoing = (EMoflonEdge) result3_green[25];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch, flowNode, normalStep,
								inFlow, prevStep, inFlowToPrevStep, process,
								actor, processToActor, flow, inFlowToFlow,
								lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep normalStep,
			Step prevStep, Actor actor, Flow flow) {
		match.registerObject("normalStep", normalStep);
		match.registerObject("prevStep", prevStep);
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep normalStep,
			Step prevStep, Actor actor, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("WAIT");
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
			ExclusiveGateway flowNode, NormalStep normalStep,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables
		Variable var_flowNode_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("flowNode.gatewayDirection", true, csp);
		var_flowNode_gatewayDirection.setValue(flowNode.getGatewayDirection());
		var_flowNode_gatewayDirection.setType("bpmn2.GatewayDirection");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		var_normalStep_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());
		var_normalStep_label.setType("String");

		// Create unbound variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", csp);
		var_event_id.setType("String");
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", csp);
		var_event_name.setType("String");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_flowNode_gatewayDirection, literal0);
		eq.setRuleName("");
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
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
			EObject flowNode, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject process, EObject outFlow, EObject actor,
			EObject processToActor, EObject outFlowToNormalStep, EObject flow,
			EObject inFlowToFlow, EObject outFlowToFlow, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_49(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_20_2_blackFFFFB(_edge_next)) {
			NormalStep normalStep = (NormalStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_20_3_expressionFBBBBBB(
							this, match, normalStep, prevStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_158(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_21_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_21_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_159(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_22_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_22_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_160(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_23_2_blackFFFFFFFB(_edge_targetRef)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_23_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_161(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_24_2_blackFFFFFFFB(_edge_incoming)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_24_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_162(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_25_2_blackFFFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_25_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_163(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_26_2_blackFFFFFFFB(_edge_outgoing)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_26_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_27_2_blackFFFFB(_edge_actor)) {
			NormalStep normalStep = (NormalStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_27_3_expressionFBBBBBB(
							this, match, normalStep, prevStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_51(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_28_2_blackFFFFB(_edge_steps)) {
			NormalStep normalStep = (NormalStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Actor actor = (Actor) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_28_3_expressionFBBBBBB(
							this, match, normalStep, prevStep, actor, flow)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_164(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_29_2_blackFFFFFFFB(_edge_flowNodeRefs)) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			SequenceFlow outFlow = (SequenceFlow) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Object[] result2_green = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_29_3_expressionFBBBBBBBBB(
							this, match, flowNode, event, inFlow, process,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_29_6_expressionFB(__result);
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
			SequenceFlowToStep inFlowToPrevStepParameter) {
		// create result
		Object[] result1_black = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_32_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_32_2_blackFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToPrevStepList = (RuleEntryList) result2_black[0];
			ExclusiveGateway flowNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[3];
			Step prevStep = (Step) result2_black[4];
			bpmn2.Process process = (bpmn2.Process) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			ProcessToActor processToActor = (ProcessToActor) result2_black[8];
			Actor actor = (Actor) result2_black[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[10];
			Flow flow = (Flow) result2_black[11];

			// solve CSP
			Object[] result3_bindingAndBlack = ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_32_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, flowNode, inFlow,
							prevStep, inFlowToPrevStep, process, actor,
							processToActor, flow, inFlowToFlow, lane, laneSet,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ICEToStepAfterExConvGwRuleImpl
					.pattern_ICEToStepAfterExConvGwRule_32_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ICEToStepAfterExConvGwRuleImpl
						.pattern_ICEToStepAfterExConvGwRule_32_5_blackBBBBBBBBBBB(
								flowNode, inFlow, prevStep, inFlowToPrevStep,
								process, actor, processToActor, flow,
								inFlowToFlow, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_32_6_blackBBBBBBBBBBBB(
									flowNode, inFlow, prevStep,
									inFlowToPrevStep, process, actor,
									processToActor, flow, inFlowToFlow, lane,
									laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ICEToStepAfterExConvGwRuleImpl
							.pattern_ICEToStepAfterExConvGwRule_32_6_greenFFBBBFBFBFBBB(
									inFlow, prevStep, process, actor, flow,
									lane, ruleResult, csp);
					// IntermediateCatchEvent event = (IntermediateCatchEvent) result6_green[0];
					// NormalStep normalStep = (NormalStep) result6_green[1];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[5];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[7];
					// SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return ICEToStepAfterExConvGwRuleImpl
				.pattern_ICEToStepAfterExConvGwRule_32_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ExclusiveGateway flowNode, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("WAIT");
		literal1.setType("");

		// Create attribute variables
		Variable var_flowNode_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("flowNode.gatewayDirection", true, csp);
		var_flowNode_gatewayDirection.setValue(flowNode.getGatewayDirection());
		var_flowNode_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", csp);
		var_normalStep_type.setType("UseCaseDSL.StepType");
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.id", csp);
		var_event_id.setType("String");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_event_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"event.name", csp);
		var_event_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_flowNode_gatewayDirection, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal1);
		eq.setRuleName("");
		eq.solve(var_event_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_event_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
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
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(IntermediateCatchEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(IntermediateCatchEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
			return null;
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(IntermediateCatchEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Lane) arguments.get(6),
					(LaneSet) arguments.get(7));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(IntermediateCatchEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Step) arguments.get(4),
					(SequenceFlowToStep) arguments.get(5),
					(bpmn2.Process) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Actor) arguments.get(8),
					(ProcessToActor) arguments.get(9),
					(Flow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(Lane) arguments.get(12), (LaneSet) arguments.get(13));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_STEP_ACTOR_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Step) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_STEP_ACTOR_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Step) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_STEP_ACTOR_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Step) arguments.get(2),
					(Actor) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_NORMALSTEP_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(NormalStep) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Step) arguments.get(4),
					(SequenceFlowToStep) arguments.get(5),
					(bpmn2.Process) arguments.get(6), (Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Flow) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10),
					(Lane) arguments.get(11), (LaneSet) arguments.get(12));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_49((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_158((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_159__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_159((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_160__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_160((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_161__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_161((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_162__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_162((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_163__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_163((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_51((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_164__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_164((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Step) arguments.get(3),
					(SequenceFlowToStep) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Actor) arguments.get(6),
					(ProcessToActor) arguments.get(7), (Flow) arguments.get(8),
					(SequenceFlowToUCFlow) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_1_blackBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { _this, match, flowNode, event, inFlow,
					process, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_2_bindingFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				flowNode, event, inFlow, process, outFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flowNode, event, inFlow,
					process, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_2_bindingAndBlackFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_0_2_binding = pattern_ICEToStepAfterExConvGwRule_0_2_bindingFBBBBBBBBB(
				_this, match, flowNode, event, inFlow, process, outFlow, lane,
				laneSet);
		if (result_pattern_ICEToStepAfterExConvGwRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_0_2_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_0_2_black = pattern_ICEToStepAfterExConvGwRule_0_2_blackB(csp);
			if (result_pattern_ICEToStepAfterExConvGwRule_0_2_black != null) {

				return new Object[] { csp, _this, match, flowNode, event,
						inFlow, process, outFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_0_3_expressionFBB(
			ICEToStepAfterExConvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_4_blackBBBBBBBB(
			Match match, ExclusiveGateway flowNode,
			IntermediateCatchEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, flowNode, event, inFlow, process,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_4_greenBBBBBBFFFFFFF(
			Match match, IntermediateCatchEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__event____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__event____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(event);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String outFlow__event____sourceRef_name_prime = "sourceRef";
		String event__outFlow____outgoing_name_prime = "outgoing";
		String lane__event____flowNodeRefs_name_prime = "flowNodeRefs";
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		match.getToBeTranslatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		match.getToBeTranslatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(event__inFlow____incoming);
		outFlow__event____sourceRef.setSrc(outFlow);
		outFlow__event____sourceRef.setTrg(event);
		match.getToBeTranslatedEdges().add(outFlow__event____sourceRef);
		event__outFlow____outgoing.setSrc(event);
		event__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(event__outFlow____outgoing);
		lane__event____flowNodeRefs.setSrc(lane);
		lane__event____flowNodeRefs.setTrg(event);
		match.getToBeTranslatedEdges().add(lane__event____flowNodeRefs);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__event____flowElements
				.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef
				.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		outFlow__event____sourceRef
				.setName(outFlow__event____sourceRef_name_prime);
		event__outFlow____outgoing
				.setName(event__outFlow____outgoing_name_prime);
		lane__event____flowNodeRefs
				.setName(lane__event____flowNodeRefs_name_prime);
		return new Object[] { match, event, inFlow, process, outFlow, lane,
				process__outFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, outFlow__event____sourceRef,
				event__outFlow____outgoing, lane__event____flowNodeRefs };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_5_blackBBBBBBBB(
			Match match, ExclusiveGateway flowNode,
			IntermediateCatchEvent event, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, flowNode, event, inFlow, process,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_0_5_greenBBBBBBFFFFF(
			Match match, ExclusiveGateway flowNode, SequenceFlow inFlow,
			bpmn2.Process process, Lane lane, LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(flowNode);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		match.getContextEdges().add(inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		match.getContextEdges().add(flowNode__inFlow____outgoing);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, flowNode, inFlow, process, lane, laneSet,
				process__laneSet____laneSets, process__inFlow____flowElements,
				inFlow__flowNode____sourceRef, flowNode__inFlow____outgoing,
				laneSet__lane____lanes };
	}

	public static final void pattern_ICEToStepAfterExConvGwRule_0_6_expressionBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, flowNode, event, inFlow,
				process, outFlow, lane, laneSet);

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("event");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("actor");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject _localVariable_10 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_11 = isApplicableMatch.getObject("lane");
		EObject _localVariable_12 = isApplicableMatch.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpEvent = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpInFlowToPrevStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpActor = _localVariable_7;
		EObject tmpProcessToActor = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		EObject tmpInFlowToFlow = _localVariable_10;
		EObject tmpLane = _localVariable_11;
		EObject tmpLaneSet = _localVariable_12;
		if (tmpFlowNode instanceof ExclusiveGateway) {
			ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
							SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
							if (tmpProcess instanceof bpmn2.Process) {
								bpmn2.Process process = (bpmn2.Process) tmpProcess;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpActor instanceof Actor) {
										Actor actor = (Actor) tmpActor;
										if (tmpProcessToActor instanceof ProcessToActor) {
											ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
											if (tmpFlow instanceof Flow) {
												Flow flow = (Flow) tmpFlow;
												if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
													SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
													if (tmpLane instanceof Lane) {
														Lane lane = (Lane) tmpLane;
														if (tmpLaneSet instanceof LaneSet) {
															LaneSet laneSet = (LaneSet) tmpLaneSet;
															return new Object[] {
																	flowNode,
																	event,
																	inFlow,
																	prevStep,
																	inFlowToPrevStep,
																	process,
																	outFlow,
																	actor,
																	processToActor,
																	flow,
																	inFlowToFlow,
																	lane,
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

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet, ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { flowNode, event, inFlow, prevStep,
							inFlowToPrevStep, process, outFlow, actor,
							processToActor, flow, inFlowToFlow, lane, laneSet,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_1_1_binding = pattern_ICEToStepAfterExConvGwRule_1_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ICEToStepAfterExConvGwRule_1_1_binding != null) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[0];
			IntermediateCatchEvent event = (IntermediateCatchEvent) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[1];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[2];
			Step prevStep = (Step) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[3];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[4];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[5];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[6];
			Actor actor = (Actor) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[7];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[8];
			Flow flow = (Flow) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[10];
			Lane lane = (Lane) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[11];
			LaneSet laneSet = (LaneSet) result_pattern_ICEToStepAfterExConvGwRule_1_1_binding[12];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_1_1_black = pattern_ICEToStepAfterExConvGwRule_1_1_blackBBBBBBBBBBBBBFBB(
					flowNode, event, inFlow, prevStep, inFlowToPrevStep,
					process, outFlow, actor, processToActor, flow,
					inFlowToFlow, lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_ICEToStepAfterExConvGwRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_1_1_black[13];

				return new Object[] { flowNode, event, inFlow, prevStep,
						inFlowToPrevStep, process, outFlow, actor,
						processToActor, flow, inFlowToFlow, lane, laneSet, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_1_greenFBBBFBFB(
			Step prevStep, SequenceFlow outFlow, Actor actor, Flow flow, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("normalStep", "type");
		Object _localVariable_1 = csp.getValue("normalStep", "name");
		Object _localVariable_2 = csp.getValue("normalStep", "label");
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		StepType normalStep_type_prime = (StepType) _localVariable_0;
		String normalStep_name_prime = (String) _localVariable_1;
		String normalStep_label_prime = (String) _localVariable_2;
		normalStep.setType(normalStep_type_prime);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		return new Object[] { normalStep, prevStep, outFlow, actor,
				outFlowToNormalStep, flow, outFlowToFlow, csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_2_blackBBBBB(
			IntermediateCatchEvent event, NormalStep normalStep,
			SequenceFlow outFlow, SequenceFlowToStep outFlowToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow) {
		return new Object[] { event, normalStep, outFlow, outFlowToNormalStep,
				outFlowToFlow };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_2_greenFBBBBB(
			IntermediateCatchEvent event, NormalStep normalStep,
			SequenceFlow outFlow, SequenceFlowToStep outFlowToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(event);
		ruleresult.getCreatedElements().add(normalStep);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		return new Object[] { ruleresult, event, normalStep, outFlow,
				outFlowToNormalStep, outFlowToFlow };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject event,
			EObject normalStep, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject process, EObject outFlow,
			EObject actor, EObject processToActor, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow,
			EObject lane, EObject laneSet) {
		if (!flowNode.equals(normalStep)) {
			if (!flowNode.equals(inFlow)) {
				if (!flowNode.equals(prevStep)) {
					if (!flowNode.equals(inFlowToPrevStep)) {
						if (!flowNode.equals(process)) {
							if (!flowNode.equals(outFlow)) {
								if (!flowNode.equals(processToActor)) {
									if (!flowNode.equals(outFlowToNormalStep)) {
										if (!flowNode.equals(inFlowToFlow)) {
											if (!flowNode.equals(outFlowToFlow)) {
												if (!flowNode.equals(lane)) {
													if (!flowNode
															.equals(laneSet)) {
														if (!event
																.equals(flowNode)) {
															if (!event
																	.equals(normalStep)) {
																if (!event
																		.equals(inFlow)) {
																	if (!event
																			.equals(prevStep)) {
																		if (!event
																				.equals(inFlowToPrevStep)) {
																			if (!event
																					.equals(process)) {
																				if (!event
																						.equals(outFlow)) {
																					if (!event
																							.equals(processToActor)) {
																						if (!event
																								.equals(outFlowToNormalStep)) {
																							if (!event
																									.equals(flow)) {
																								if (!event
																										.equals(inFlowToFlow)) {
																									if (!event
																											.equals(outFlowToFlow)) {
																										if (!event
																												.equals(lane)) {
																											if (!event
																													.equals(laneSet)) {
																												if (!normalStep
																														.equals(prevStep)) {
																													if (!normalStep
																															.equals(process)) {
																														if (!normalStep
																																.equals(outFlow)) {
																															if (!normalStep
																																	.equals(processToActor)) {
																																if (!normalStep
																																		.equals(outFlowToNormalStep)) {
																																	if (!normalStep
																																			.equals(outFlowToFlow)) {
																																		if (!inFlow
																																				.equals(normalStep)) {
																																			if (!inFlow
																																					.equals(prevStep)) {
																																				if (!inFlow
																																						.equals(inFlowToPrevStep)) {
																																					if (!inFlow
																																							.equals(process)) {
																																						if (!inFlow
																																								.equals(outFlow)) {
																																							if (!inFlow
																																									.equals(processToActor)) {
																																								if (!inFlow
																																										.equals(outFlowToNormalStep)) {
																																									if (!inFlow
																																											.equals(inFlowToFlow)) {
																																										if (!inFlow
																																												.equals(outFlowToFlow)) {
																																											if (!inFlow
																																													.equals(lane)) {
																																												if (!inFlow
																																														.equals(laneSet)) {
																																													if (!prevStep
																																															.equals(process)) {
																																														if (!prevStep
																																																.equals(processToActor)) {
																																															if (!inFlowToPrevStep
																																																	.equals(normalStep)) {
																																																if (!inFlowToPrevStep
																																																		.equals(prevStep)) {
																																																	if (!inFlowToPrevStep
																																																			.equals(process)) {
																																																		if (!inFlowToPrevStep
																																																				.equals(outFlow)) {
																																																			if (!inFlowToPrevStep
																																																					.equals(processToActor)) {
																																																				if (!inFlowToPrevStep
																																																						.equals(outFlowToNormalStep)) {
																																																					if (!inFlowToPrevStep
																																																							.equals(outFlowToFlow)) {
																																																						if (!inFlowToPrevStep
																																																								.equals(lane)) {
																																																							if (!inFlowToPrevStep
																																																									.equals(laneSet)) {
																																																								if (!process
																																																										.equals(processToActor)) {
																																																									if (!outFlow
																																																											.equals(prevStep)) {
																																																										if (!outFlow
																																																												.equals(process)) {
																																																											if (!outFlow
																																																													.equals(processToActor)) {
																																																												if (!outFlow
																																																														.equals(outFlowToNormalStep)) {
																																																													if (!outFlow
																																																															.equals(outFlowToFlow)) {
																																																														if (!actor
																																																																.equals(flowNode)) {
																																																															if (!actor
																																																																	.equals(event)) {
																																																																if (!actor
																																																																		.equals(normalStep)) {
																																																																	if (!actor
																																																																			.equals(inFlow)) {
																																																																		if (!actor
																																																																				.equals(prevStep)) {
																																																																			if (!actor
																																																																					.equals(inFlowToPrevStep)) {
																																																																				if (!actor
																																																																						.equals(process)) {
																																																																					if (!actor
																																																																							.equals(outFlow)) {
																																																																						if (!actor
																																																																								.equals(processToActor)) {
																																																																							if (!actor
																																																																									.equals(outFlowToNormalStep)) {
																																																																								if (!actor
																																																																										.equals(flow)) {
																																																																									if (!actor
																																																																											.equals(inFlowToFlow)) {
																																																																										if (!actor
																																																																												.equals(outFlowToFlow)) {
																																																																											if (!actor
																																																																													.equals(lane)) {
																																																																												if (!actor
																																																																														.equals(laneSet)) {
																																																																													if (!outFlowToNormalStep
																																																																															.equals(prevStep)) {
																																																																														if (!outFlowToNormalStep
																																																																																.equals(process)) {
																																																																															if (!outFlowToNormalStep
																																																																																	.equals(processToActor)) {
																																																																																if (!flow
																																																																																		.equals(flowNode)) {
																																																																																	if (!flow
																																																																																			.equals(normalStep)) {
																																																																																		if (!flow
																																																																																				.equals(inFlow)) {
																																																																																			if (!flow
																																																																																					.equals(prevStep)) {
																																																																																				if (!flow
																																																																																						.equals(inFlowToPrevStep)) {
																																																																																					if (!flow
																																																																																							.equals(process)) {
																																																																																						if (!flow
																																																																																								.equals(outFlow)) {
																																																																																							if (!flow
																																																																																									.equals(processToActor)) {
																																																																																								if (!flow
																																																																																										.equals(outFlowToNormalStep)) {
																																																																																									if (!flow
																																																																																											.equals(inFlowToFlow)) {
																																																																																										if (!flow
																																																																																												.equals(outFlowToFlow)) {
																																																																																											if (!flow
																																																																																													.equals(lane)) {
																																																																																												if (!flow
																																																																																														.equals(laneSet)) {
																																																																																													if (!inFlowToFlow
																																																																																															.equals(normalStep)) {
																																																																																														if (!inFlowToFlow
																																																																																																.equals(prevStep)) {
																																																																																															if (!inFlowToFlow
																																																																																																	.equals(inFlowToPrevStep)) {
																																																																																																if (!inFlowToFlow
																																																																																																		.equals(process)) {
																																																																																																	if (!inFlowToFlow
																																																																																																			.equals(outFlow)) {
																																																																																																		if (!inFlowToFlow
																																																																																																				.equals(processToActor)) {
																																																																																																			if (!inFlowToFlow
																																																																																																					.equals(outFlowToNormalStep)) {
																																																																																																				if (!inFlowToFlow
																																																																																																						.equals(outFlowToFlow)) {
																																																																																																					if (!inFlowToFlow
																																																																																																							.equals(lane)) {
																																																																																																						if (!inFlowToFlow
																																																																																																								.equals(laneSet)) {
																																																																																																							if (!outFlowToFlow
																																																																																																									.equals(prevStep)) {
																																																																																																								if (!outFlowToFlow
																																																																																																										.equals(process)) {
																																																																																																									if (!outFlowToFlow
																																																																																																											.equals(processToActor)) {
																																																																																																										if (!outFlowToFlow
																																																																																																												.equals(outFlowToNormalStep)) {
																																																																																																											if (!lane
																																																																																																													.equals(normalStep)) {
																																																																																																												if (!lane
																																																																																																														.equals(prevStep)) {
																																																																																																													if (!lane
																																																																																																															.equals(process)) {
																																																																																																														if (!lane
																																																																																																																.equals(outFlow)) {
																																																																																																															if (!lane
																																																																																																																	.equals(processToActor)) {
																																																																																																																if (!lane
																																																																																																																		.equals(outFlowToNormalStep)) {
																																																																																																																	if (!lane
																																																																																																																			.equals(outFlowToFlow)) {
																																																																																																																		if (!lane
																																																																																																																				.equals(laneSet)) {
																																																																																																																			if (!laneSet
																																																																																																																					.equals(normalStep)) {
																																																																																																																				if (!laneSet
																																																																																																																						.equals(prevStep)) {
																																																																																																																					if (!laneSet
																																																																																																																							.equals(process)) {
																																																																																																																						if (!laneSet
																																																																																																																								.equals(outFlow)) {
																																																																																																																							if (!laneSet
																																																																																																																									.equals(processToActor)) {
																																																																																																																								if (!laneSet
																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(outFlowToFlow)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												flowNode,
																																																																																																																												event,
																																																																																																																												normalStep,
																																																																																																																												inFlow,
																																																																																																																												prevStep,
																																																																																																																												inFlowToPrevStep,
																																																																																																																												process,
																																																																																																																												outFlow,
																																																																																																																												actor,
																																																																																																																												processToActor,
																																																																																																																												outFlowToNormalStep,
																																																																																																																												flow,
																																																																																																																												inFlowToFlow,
																																																																																																																												outFlowToFlow,
																																																																																																																												lane,
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
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject process, EObject outFlow,
			EObject actor, EObject outFlowToNormalStep, EObject flow,
			EObject outFlowToFlow, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__event____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__event____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ICEToStepAfterExConvGwRule";
		String prevStep__normalStep____next_name_prime = "next";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String outFlow__event____sourceRef_name_prime = "sourceRef";
		String event__outFlow____outgoing_name_prime = "outgoing";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String lane__event____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(prevStep__normalStep____next);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		ruleresult.getTranslatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		ruleresult.getTranslatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(event__inFlow____incoming);
		outFlow__event____sourceRef.setSrc(outFlow);
		outFlow__event____sourceRef.setTrg(event);
		ruleresult.getTranslatedEdges().add(outFlow__event____sourceRef);
		event__outFlow____outgoing.setSrc(event);
		event__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(event__outFlow____outgoing);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(normalStep__actor____actor);
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
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		lane__event____flowNodeRefs.setSrc(lane);
		lane__event____flowNodeRefs.setTrg(event);
		ruleresult.getTranslatedEdges().add(lane__event____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__event____flowElements
				.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef
				.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		outFlow__event____sourceRef
				.setName(outFlow__event____sourceRef_name_prime);
		event__outFlow____outgoing
				.setName(event__outFlow____outgoing_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		lane__event____flowNodeRefs
				.setName(lane__event____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, event, normalStep, inFlow, prevStep,
				process, outFlow, actor, outFlowToNormalStep, flow,
				outFlowToFlow, lane, prevStep__normalStep____next,
				process__outFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, outFlow__event____sourceRef,
				event__outFlow____outgoing, normalStep__actor____actor,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps, outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target, lane__event____flowNodeRefs };
	}

	public static final void pattern_ICEToStepAfterExConvGwRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject process, EObject outFlow, EObject actor,
			EObject processToActor, EObject outFlowToNormalStep, EObject flow,
			EObject inFlowToFlow, EObject outFlowToFlow, EObject lane,
			EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, flowNode, event, normalStep,
				inFlow, prevStep, inFlowToPrevStep, process, outFlow, actor,
				processToActor, outFlowToNormalStep, flow, inFlowToFlow,
				outFlowToFlow, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ICEToStepAfterExConvGwRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_1_blackFBB(
			EClass eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_2_1_binding = pattern_ICEToStepAfterExConvGwRule_2_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_2_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_2_1_black = pattern_ICEToStepAfterExConvGwRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ICEToStepAfterExConvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_2_bindingFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("flowNode");
		EObject _localVariable_1 = match.getObject("event");
		EObject _localVariable_2 = match.getObject("inFlow");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("outFlow");
		EObject _localVariable_5 = match.getObject("lane");
		EObject _localVariable_6 = match.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpEvent = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpOutFlow = _localVariable_4;
		EObject tmpLane = _localVariable_5;
		EObject tmpLaneSet = _localVariable_6;
		if (tmpFlowNode instanceof ExclusiveGateway) {
			ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpOutFlow instanceof SequenceFlow) {
							SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
							if (tmpLane instanceof Lane) {
								Lane lane = (Lane) tmpLane;
								if (tmpLaneSet instanceof LaneSet) {
									LaneSet laneSet = (LaneSet) tmpLaneSet;
									return new Object[] { flowNode, event,
											inFlow, process, outFlow, lane,
											laneSet, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_2_2_blackBBBFFBBFFFFBBB(
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			for (SequenceFlowToStep inFlowToPrevStep : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(inFlow,
							SequenceFlowToStep.class, "source")) {
				Step prevStep = inFlowToPrevStep.getTarget();
				if (prevStep != null) {
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
									_result.add(new Object[] { flowNode, event,
											inFlow, prevStep, inFlowToPrevStep,
											process, outFlow, actor,
											processToActor, flow, inFlowToFlow,
											lane, laneSet, match });
								}

							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_2_3_blackBBBBBBBBBBBBB(
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (inFlow.equals(inFlowToPrevStep.getSource())) {
				if (prevStep.equals(inFlowToPrevStep.getTarget())) {
					if (process.getLaneSets().contains(laneSet)) {
						if (process.getFlowElements().contains(inFlow)) {
							if (process.getFlowElements().contains(outFlow)) {
								if (process.getFlowElements().contains(event)) {
									if (event.equals(inFlow.getTargetRef())) {
										if (event
												.equals(outFlow.getSourceRef())) {
											if (process.equals(processToActor
													.getSource())) {
												if (actor.equals(processToActor
														.getTarget())) {
													if (inFlow
															.equals(inFlowToFlow
																	.getSource())) {
														if (flow.equals(inFlowToFlow
																.getTarget())) {
															if (flowNode
																	.equals(inFlow
																			.getSourceRef())) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				event)) {
																	if (laneSet
																			.getLanes()
																			.contains(
																					lane)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				prevStep,
																				inFlowToPrevStep,
																				process,
																				outFlow,
																				actor,
																				processToActor,
																				flow,
																				inFlowToFlow,
																				lane,
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
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__event____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__event____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String outFlow__event____sourceRef_name_prime = "sourceRef";
		String event__outFlow____outgoing_name_prime = "outgoing";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		String lane__event____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(event);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		inFlowToPrevStep__inFlow____source.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__inFlow____source);
		inFlowToPrevStep__prevStep____target.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__prevStep____target);
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
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		isApplicableMatch.getAllContextElements().add(
				process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		isApplicableMatch.getAllContextElements().add(
				inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements()
				.add(event__inFlow____incoming);
		outFlow__event____sourceRef.setSrc(outFlow);
		outFlow__event____sourceRef.setTrg(event);
		isApplicableMatch.getAllContextElements().add(
				outFlow__event____sourceRef);
		event__outFlow____outgoing.setSrc(event);
		event__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				event__outFlow____outgoing);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__inFlow____outgoing);
		lane__event____flowNodeRefs.setSrc(lane);
		lane__event____flowNodeRefs.setTrg(event);
		isApplicableMatch.getAllContextElements().add(
				lane__event____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__event____flowElements
				.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef
				.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		outFlow__event____sourceRef
				.setName(outFlow__event____sourceRef_name_prime);
		event__outFlow____outgoing
				.setName(event__outFlow____outgoing_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		lane__event____flowNodeRefs
				.setName(lane__event____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { flowNode, event, inFlow, prevStep,
				inFlowToPrevStep, process, outFlow, actor, processToActor,
				flow, inFlowToFlow, lane, laneSet, isApplicableMatch,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__outFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, outFlow__event____sourceRef,
				event__outFlow____outgoing, processToActor__process____source,
				processToActor__actor____target,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				inFlow__flowNode____sourceRef, flowNode__inFlow____outgoing,
				lane__event____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			IntermediateCatchEvent event, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, flowNode, event, inFlow, prevStep,
				inFlowToPrevStep, process, outFlow, actor, processToActor,
				flow, inFlowToFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					event, inFlow, prevStep, inFlowToPrevStep, process,
					outFlow, actor, processToActor, flow, inFlowToFlow, lane,
					laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			IntermediateCatchEvent event, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			SequenceFlow outFlow, Actor actor, ProcessToActor processToActor,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_2_4_binding = pattern_ICEToStepAfterExConvGwRule_2_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, event, inFlow, prevStep,
				inFlowToPrevStep, process, outFlow, actor, processToActor,
				flow, inFlowToFlow, lane, laneSet);
		if (result_pattern_ICEToStepAfterExConvGwRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_2_4_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_2_4_black = pattern_ICEToStepAfterExConvGwRule_2_4_blackB(csp);
			if (result_pattern_ICEToStepAfterExConvGwRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						event, inFlow, prevStep, inFlowToPrevStep, process,
						outFlow, actor, processToActor, flow, inFlowToFlow,
						lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_2_5_expressionFBB(
			ICEToStepAfterExConvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ICEToStepAfterExConvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ICEToStepAfterExConvGwRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_1_blackBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { _this, match, normalStep, prevStep, actor,
					flow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_2_bindingFBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				normalStep, prevStep, actor, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, normalStep, prevStep,
					actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_2_bindingAndBlackFBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_10_2_binding = pattern_ICEToStepAfterExConvGwRule_10_2_bindingFBBBBBB(
				_this, match, normalStep, prevStep, actor, flow);
		if (result_pattern_ICEToStepAfterExConvGwRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_10_2_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_10_2_black = pattern_ICEToStepAfterExConvGwRule_10_2_blackB(csp);
			if (result_pattern_ICEToStepAfterExConvGwRule_10_2_black != null) {

				return new Object[] { csp, _this, match, normalStep, prevStep,
						actor, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_10_3_expressionFBB(
			ICEToStepAfterExConvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_4_blackBBBBB(
			Match match, NormalStep normalStep, Step prevStep, Actor actor,
			Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, normalStep, prevStep, actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_4_greenBBBBBFFF(
			Match match, NormalStep normalStep, Step prevStep, Actor actor,
			Flow flow) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(normalStep);
		String prevStep__normalStep____next_name_prime = "next";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(prevStep__normalStep____next);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getToBeTranslatedEdges().add(flow__normalStep____steps);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, normalStep, prevStep, actor, flow,
				prevStep__normalStep____next, normalStep__actor____actor,
				flow__normalStep____steps };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_5_blackBBBBB(
			Match match, NormalStep normalStep, Step prevStep, Actor actor,
			Flow flow) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, normalStep, prevStep, actor, flow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_10_5_greenBBBB(
			Match match, Step prevStep, Actor actor, Flow flow) {
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		return new Object[] { match, prevStep, actor, flow };
	}

	public static final void pattern_ICEToStepAfterExConvGwRule_10_6_expressionBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, normalStep, prevStep, actor,
				flow);

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flowNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("actor");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject _localVariable_9 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_10 = isApplicableMatch.getObject("lane");
		EObject _localVariable_11 = isApplicableMatch.getObject("laneSet");
		EObject tmpFlowNode = _localVariable_0;
		EObject tmpNormalStep = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpInFlowToPrevStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpActor = _localVariable_6;
		EObject tmpProcessToActor = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		EObject tmpInFlowToFlow = _localVariable_9;
		EObject tmpLane = _localVariable_10;
		EObject tmpLaneSet = _localVariable_11;
		if (tmpFlowNode instanceof ExclusiveGateway) {
			ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
							SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
							if (tmpProcess instanceof bpmn2.Process) {
								bpmn2.Process process = (bpmn2.Process) tmpProcess;
								if (tmpActor instanceof Actor) {
									Actor actor = (Actor) tmpActor;
									if (tmpProcessToActor instanceof ProcessToActor) {
										ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
												SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
												if (tmpLane instanceof Lane) {
													Lane lane = (Lane) tmpLane;
													if (tmpLaneSet instanceof LaneSet) {
														LaneSet laneSet = (LaneSet) tmpLaneSet;
														return new Object[] {
																flowNode,
																normalStep,
																inFlow,
																prevStep,
																inFlowToPrevStep,
																process, actor,
																processToActor,
																flow,
																inFlowToFlow,
																lane, laneSet,
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

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_1_blackBBBBBBBBBBBBFBB(
			ExclusiveGateway flowNode, NormalStep normalStep,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!normalStep.equals(prevStep)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { flowNode, normalStep, inFlow,
							prevStep, inFlowToPrevStep, process, actor,
							processToActor, flow, inFlowToFlow, lane, laneSet,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_11_1_binding = pattern_ICEToStepAfterExConvGwRule_11_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ICEToStepAfterExConvGwRule_11_1_binding != null) {
			ExclusiveGateway flowNode = (ExclusiveGateway) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[0];
			NormalStep normalStep = (NormalStep) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[1];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[2];
			Step prevStep = (Step) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[3];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[4];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[5];
			Actor actor = (Actor) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[6];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[7];
			Flow flow = (Flow) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[8];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[9];
			Lane lane = (Lane) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[10];
			LaneSet laneSet = (LaneSet) result_pattern_ICEToStepAfterExConvGwRule_11_1_binding[11];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_11_1_black = pattern_ICEToStepAfterExConvGwRule_11_1_blackBBBBBBBBBBBBFBB(
					flowNode, normalStep, inFlow, prevStep, inFlowToPrevStep,
					process, actor, processToActor, flow, inFlowToFlow, lane,
					laneSet, _this, isApplicableMatch);
			if (result_pattern_ICEToStepAfterExConvGwRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_11_1_black[12];

				return new Object[] { flowNode, normalStep, inFlow, prevStep,
						inFlowToPrevStep, process, actor, processToActor, flow,
						inFlowToFlow, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_1_greenFBBBFFBFBB(
			NormalStep normalStep, SequenceFlow inFlow, bpmn2.Process process,
			Flow flow, Lane lane, CSP csp) {
		IntermediateCatchEvent event = Bpmn2Factory.eINSTANCE
				.createIntermediateCatchEvent();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("event", "id");
		Object _localVariable_1 = csp.getValue("event", "name");
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		lane.getFlowNodeRefs().add(event);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(event);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		String event_id_prime = (String) _localVariable_0;
		String event_name_prime = (String) _localVariable_1;
		event.setId(event_id_prime);
		event.setName(event_name_prime);
		return new Object[] { event, normalStep, inFlow, process, outFlow,
				outFlowToNormalStep, flow, outFlowToFlow, lane, csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_2_blackBBBBB(
			IntermediateCatchEvent event, NormalStep normalStep,
			SequenceFlow outFlow, SequenceFlowToStep outFlowToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow) {
		return new Object[] { event, normalStep, outFlow, outFlowToNormalStep,
				outFlowToFlow };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_2_greenFBBBBB(
			IntermediateCatchEvent event, NormalStep normalStep,
			SequenceFlow outFlow, SequenceFlowToStep outFlowToNormalStep,
			SequenceFlowToUCFlow outFlowToFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(event);
		ruleresult.getTranslatedElements().add(normalStep);
		ruleresult.getCreatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		return new Object[] { ruleresult, event, normalStep, outFlow,
				outFlowToNormalStep, outFlowToFlow };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject flowNode, EObject event,
			EObject normalStep, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject process, EObject outFlow,
			EObject actor, EObject processToActor, EObject outFlowToNormalStep,
			EObject flow, EObject inFlowToFlow, EObject outFlowToFlow,
			EObject lane, EObject laneSet) {
		if (!flowNode.equals(normalStep)) {
			if (!flowNode.equals(inFlow)) {
				if (!flowNode.equals(prevStep)) {
					if (!flowNode.equals(inFlowToPrevStep)) {
						if (!flowNode.equals(process)) {
							if (!flowNode.equals(outFlow)) {
								if (!flowNode.equals(processToActor)) {
									if (!flowNode.equals(outFlowToNormalStep)) {
										if (!flowNode.equals(inFlowToFlow)) {
											if (!flowNode.equals(outFlowToFlow)) {
												if (!flowNode.equals(lane)) {
													if (!flowNode
															.equals(laneSet)) {
														if (!event
																.equals(flowNode)) {
															if (!event
																	.equals(normalStep)) {
																if (!event
																		.equals(inFlow)) {
																	if (!event
																			.equals(prevStep)) {
																		if (!event
																				.equals(inFlowToPrevStep)) {
																			if (!event
																					.equals(process)) {
																				if (!event
																						.equals(outFlow)) {
																					if (!event
																							.equals(processToActor)) {
																						if (!event
																								.equals(outFlowToNormalStep)) {
																							if (!event
																									.equals(flow)) {
																								if (!event
																										.equals(inFlowToFlow)) {
																									if (!event
																											.equals(outFlowToFlow)) {
																										if (!event
																												.equals(lane)) {
																											if (!event
																													.equals(laneSet)) {
																												if (!normalStep
																														.equals(prevStep)) {
																													if (!normalStep
																															.equals(process)) {
																														if (!normalStep
																																.equals(outFlow)) {
																															if (!normalStep
																																	.equals(processToActor)) {
																																if (!normalStep
																																		.equals(outFlowToNormalStep)) {
																																	if (!normalStep
																																			.equals(outFlowToFlow)) {
																																		if (!inFlow
																																				.equals(normalStep)) {
																																			if (!inFlow
																																					.equals(prevStep)) {
																																				if (!inFlow
																																						.equals(inFlowToPrevStep)) {
																																					if (!inFlow
																																							.equals(process)) {
																																						if (!inFlow
																																								.equals(outFlow)) {
																																							if (!inFlow
																																									.equals(processToActor)) {
																																								if (!inFlow
																																										.equals(outFlowToNormalStep)) {
																																									if (!inFlow
																																											.equals(inFlowToFlow)) {
																																										if (!inFlow
																																												.equals(outFlowToFlow)) {
																																											if (!inFlow
																																													.equals(lane)) {
																																												if (!inFlow
																																														.equals(laneSet)) {
																																													if (!prevStep
																																															.equals(process)) {
																																														if (!prevStep
																																																.equals(processToActor)) {
																																															if (!inFlowToPrevStep
																																																	.equals(normalStep)) {
																																																if (!inFlowToPrevStep
																																																		.equals(prevStep)) {
																																																	if (!inFlowToPrevStep
																																																			.equals(process)) {
																																																		if (!inFlowToPrevStep
																																																				.equals(outFlow)) {
																																																			if (!inFlowToPrevStep
																																																					.equals(processToActor)) {
																																																				if (!inFlowToPrevStep
																																																						.equals(outFlowToNormalStep)) {
																																																					if (!inFlowToPrevStep
																																																							.equals(outFlowToFlow)) {
																																																						if (!inFlowToPrevStep
																																																								.equals(lane)) {
																																																							if (!inFlowToPrevStep
																																																									.equals(laneSet)) {
																																																								if (!process
																																																										.equals(processToActor)) {
																																																									if (!outFlow
																																																											.equals(prevStep)) {
																																																										if (!outFlow
																																																												.equals(process)) {
																																																											if (!outFlow
																																																													.equals(processToActor)) {
																																																												if (!outFlow
																																																														.equals(outFlowToNormalStep)) {
																																																													if (!outFlow
																																																															.equals(outFlowToFlow)) {
																																																														if (!actor
																																																																.equals(flowNode)) {
																																																															if (!actor
																																																																	.equals(event)) {
																																																																if (!actor
																																																																		.equals(normalStep)) {
																																																																	if (!actor
																																																																			.equals(inFlow)) {
																																																																		if (!actor
																																																																				.equals(prevStep)) {
																																																																			if (!actor
																																																																					.equals(inFlowToPrevStep)) {
																																																																				if (!actor
																																																																						.equals(process)) {
																																																																					if (!actor
																																																																							.equals(outFlow)) {
																																																																						if (!actor
																																																																								.equals(processToActor)) {
																																																																							if (!actor
																																																																									.equals(outFlowToNormalStep)) {
																																																																								if (!actor
																																																																										.equals(flow)) {
																																																																									if (!actor
																																																																											.equals(inFlowToFlow)) {
																																																																										if (!actor
																																																																												.equals(outFlowToFlow)) {
																																																																											if (!actor
																																																																													.equals(lane)) {
																																																																												if (!actor
																																																																														.equals(laneSet)) {
																																																																													if (!outFlowToNormalStep
																																																																															.equals(prevStep)) {
																																																																														if (!outFlowToNormalStep
																																																																																.equals(process)) {
																																																																															if (!outFlowToNormalStep
																																																																																	.equals(processToActor)) {
																																																																																if (!flow
																																																																																		.equals(flowNode)) {
																																																																																	if (!flow
																																																																																			.equals(normalStep)) {
																																																																																		if (!flow
																																																																																				.equals(inFlow)) {
																																																																																			if (!flow
																																																																																					.equals(prevStep)) {
																																																																																				if (!flow
																																																																																						.equals(inFlowToPrevStep)) {
																																																																																					if (!flow
																																																																																							.equals(process)) {
																																																																																						if (!flow
																																																																																								.equals(outFlow)) {
																																																																																							if (!flow
																																																																																									.equals(processToActor)) {
																																																																																								if (!flow
																																																																																										.equals(outFlowToNormalStep)) {
																																																																																									if (!flow
																																																																																											.equals(inFlowToFlow)) {
																																																																																										if (!flow
																																																																																												.equals(outFlowToFlow)) {
																																																																																											if (!flow
																																																																																													.equals(lane)) {
																																																																																												if (!flow
																																																																																														.equals(laneSet)) {
																																																																																													if (!inFlowToFlow
																																																																																															.equals(normalStep)) {
																																																																																														if (!inFlowToFlow
																																																																																																.equals(prevStep)) {
																																																																																															if (!inFlowToFlow
																																																																																																	.equals(inFlowToPrevStep)) {
																																																																																																if (!inFlowToFlow
																																																																																																		.equals(process)) {
																																																																																																	if (!inFlowToFlow
																																																																																																			.equals(outFlow)) {
																																																																																																		if (!inFlowToFlow
																																																																																																				.equals(processToActor)) {
																																																																																																			if (!inFlowToFlow
																																																																																																					.equals(outFlowToNormalStep)) {
																																																																																																				if (!inFlowToFlow
																																																																																																						.equals(outFlowToFlow)) {
																																																																																																					if (!inFlowToFlow
																																																																																																							.equals(lane)) {
																																																																																																						if (!inFlowToFlow
																																																																																																								.equals(laneSet)) {
																																																																																																							if (!outFlowToFlow
																																																																																																									.equals(prevStep)) {
																																																																																																								if (!outFlowToFlow
																																																																																																										.equals(process)) {
																																																																																																									if (!outFlowToFlow
																																																																																																											.equals(processToActor)) {
																																																																																																										if (!outFlowToFlow
																																																																																																												.equals(outFlowToNormalStep)) {
																																																																																																											if (!lane
																																																																																																													.equals(normalStep)) {
																																																																																																												if (!lane
																																																																																																														.equals(prevStep)) {
																																																																																																													if (!lane
																																																																																																															.equals(process)) {
																																																																																																														if (!lane
																																																																																																																.equals(outFlow)) {
																																																																																																															if (!lane
																																																																																																																	.equals(processToActor)) {
																																																																																																																if (!lane
																																																																																																																		.equals(outFlowToNormalStep)) {
																																																																																																																	if (!lane
																																																																																																																			.equals(outFlowToFlow)) {
																																																																																																																		if (!lane
																																																																																																																				.equals(laneSet)) {
																																																																																																																			if (!laneSet
																																																																																																																					.equals(normalStep)) {
																																																																																																																				if (!laneSet
																																																																																																																						.equals(prevStep)) {
																																																																																																																					if (!laneSet
																																																																																																																							.equals(process)) {
																																																																																																																						if (!laneSet
																																																																																																																								.equals(outFlow)) {
																																																																																																																							if (!laneSet
																																																																																																																									.equals(processToActor)) {
																																																																																																																								if (!laneSet
																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(outFlowToFlow)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												flowNode,
																																																																																																																												event,
																																																																																																																												normalStep,
																																																																																																																												inFlow,
																																																																																																																												prevStep,
																																																																																																																												inFlowToPrevStep,
																																																																																																																												process,
																																																																																																																												outFlow,
																																																																																																																												actor,
																																																																																																																												processToActor,
																																																																																																																												outFlowToNormalStep,
																																																																																																																												flow,
																																																																																																																												inFlowToFlow,
																																																																																																																												outFlowToFlow,
																																																																																																																												lane,
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
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject process, EObject outFlow,
			EObject actor, EObject outFlowToNormalStep, EObject flow,
			EObject outFlowToFlow, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__event____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge event__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__event____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ICEToStepAfterExConvGwRule";
		String prevStep__normalStep____next_name_prime = "next";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String outFlow__event____sourceRef_name_prime = "sourceRef";
		String event__outFlow____outgoing_name_prime = "outgoing";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String lane__event____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(prevStep__normalStep____next);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		ruleresult.getCreatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		ruleresult.getCreatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(event__inFlow____incoming);
		outFlow__event____sourceRef.setSrc(outFlow);
		outFlow__event____sourceRef.setTrg(event);
		ruleresult.getCreatedEdges().add(outFlow__event____sourceRef);
		event__outFlow____outgoing.setSrc(event);
		event__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(event__outFlow____outgoing);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(normalStep__actor____actor);
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
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		lane__event____flowNodeRefs.setSrc(lane);
		lane__event____flowNodeRefs.setTrg(event);
		ruleresult.getCreatedEdges().add(lane__event____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__event____flowElements
				.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef
				.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		outFlow__event____sourceRef
				.setName(outFlow__event____sourceRef_name_prime);
		event__outFlow____outgoing
				.setName(event__outFlow____outgoing_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		lane__event____flowNodeRefs
				.setName(lane__event____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, event, normalStep, inFlow, prevStep,
				process, outFlow, actor, outFlowToNormalStep, flow,
				outFlowToFlow, lane, prevStep__normalStep____next,
				process__outFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, outFlow__event____sourceRef,
				event__outFlow____outgoing, normalStep__actor____actor,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps, outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target, lane__event____flowNodeRefs };
	}

	public static final void pattern_ICEToStepAfterExConvGwRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, PerformRuleResult ruleresult,
			EObject flowNode, EObject event, EObject normalStep,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject process, EObject outFlow, EObject actor,
			EObject processToActor, EObject outFlowToNormalStep, EObject flow,
			EObject inFlowToFlow, EObject outFlowToFlow, EObject lane,
			EObject laneSet) {
		_this.registerObjects_BWD(ruleresult, flowNode, event, normalStep,
				inFlow, prevStep, inFlowToPrevStep, process, outFlow, actor,
				processToActor, outFlowToNormalStep, flow, inFlowToFlow,
				outFlowToFlow, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ICEToStepAfterExConvGwRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_1_blackFBB(
			EClass eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_12_1_binding = pattern_ICEToStepAfterExConvGwRule_12_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_12_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_12_1_black = pattern_ICEToStepAfterExConvGwRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ICEToStepAfterExConvGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("normalStep");
		EObject _localVariable_1 = match.getObject("prevStep");
		EObject _localVariable_2 = match.getObject("actor");
		EObject _localVariable_3 = match.getObject("flow");
		EObject tmpNormalStep = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpActor = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpActor instanceof Actor) {
					Actor actor = (Actor) tmpActor;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						return new Object[] { normalStep, prevStep, actor,
								flow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_12_2_blackBFBFFBFBFB(
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			for (SequenceFlowToStep inFlowToPrevStep : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(prevStep,
							SequenceFlowToStep.class, "target")) {
				SequenceFlow inFlow = inFlowToPrevStep.getSource();
				if (inFlow != null) {
					for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(actor,
									ProcessToActor.class, "target")) {
						bpmn2.Process process = processToActor.getSource();
						if (process != null) {
							for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(flow,
											SequenceFlowToUCFlow.class,
											"target")) {
								if (inFlow.equals(inFlowToFlow.getSource())) {
									_result.add(new Object[] { normalStep,
											inFlow, prevStep, inFlowToPrevStep,
											process, actor, processToActor,
											flow, inFlowToFlow, match });
								}
							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_12_3_blackFBBBBBBBBBFF(
			NormalStep normalStep, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			if (normalStep.equals(prevStep.getNext())) {
				if (inFlow.equals(inFlowToPrevStep.getSource())) {
					if (prevStep.equals(inFlowToPrevStep.getTarget())) {
						if (process.getFlowElements().contains(inFlow)) {
							if (process.equals(processToActor.getSource())) {
								if (actor.equals(processToActor.getTarget())) {
									if (actor.equals(normalStep.getActor())) {
										if (flow.getSteps()
												.contains(normalStep)) {
											if (inFlow.equals(inFlowToFlow
													.getSource())) {
												if (flow.equals(inFlowToFlow
														.getTarget())) {
													FlowNode tmpFlowNode = inFlow
															.getSourceRef();
													if (tmpFlowNode instanceof ExclusiveGateway) {
														ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																_result.add(new Object[] {
																		flowNode,
																		normalStep,
																		inFlow,
																		prevStep,
																		inFlowToPrevStep,
																		process,
																		actor,
																		processToActor,
																		flow,
																		inFlowToFlow,
																		lane,
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
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			ExclusiveGateway flowNode, NormalStep normalStep,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__flowNode____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String prevStep__normalStep____next_name_prime = "next";
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String normalStep__actor____actor_name_prime = "actor";
		String flow__normalStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String inFlow__flowNode____sourceRef_name_prime = "sourceRef";
		String flowNode__inFlow____outgoing_name_prime = "outgoing";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(flowNode);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				prevStep__normalStep____next);
		inFlowToPrevStep__inFlow____source.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__inFlow____source);
		inFlowToPrevStep__prevStep____target.setSrc(inFlowToPrevStep);
		inFlowToPrevStep__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				inFlowToPrevStep__prevStep____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				normalStep__actor____actor);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		inFlow__flowNode____sourceRef.setSrc(inFlow);
		inFlow__flowNode____sourceRef.setTrg(flowNode);
		isApplicableMatch.getAllContextElements().add(
				inFlow__flowNode____sourceRef);
		flowNode__inFlow____outgoing.setSrc(flowNode);
		flowNode__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				flowNode__inFlow____outgoing);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		inFlow__flowNode____sourceRef
				.setName(inFlow__flowNode____sourceRef_name_prime);
		flowNode__inFlow____outgoing
				.setName(flowNode__inFlow____outgoing_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { flowNode, normalStep, inFlow, prevStep,
				inFlowToPrevStep, process, actor, processToActor, flow,
				inFlowToFlow, lane, laneSet, isApplicableMatch,
				prevStep__normalStep____next,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				process__laneSet____laneSets, process__inFlow____flowElements,
				processToActor__process____source,
				processToActor__actor____target, normalStep__actor____actor,
				flow__normalStep____steps, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, inFlow__flowNode____sourceRef,
				flowNode__inFlow____outgoing, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			NormalStep normalStep, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, flowNode, normalStep, inFlow, prevStep,
				inFlowToPrevStep, process, actor, processToActor, flow,
				inFlowToFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					normalStep, inFlow, prevStep, inFlowToPrevStep, process,
					actor, processToActor, flow, inFlowToFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			NormalStep normalStep, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_12_4_binding = pattern_ICEToStepAfterExConvGwRule_12_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, normalStep, inFlow,
				prevStep, inFlowToPrevStep, process, actor, processToActor,
				flow, inFlowToFlow, lane, laneSet);
		if (result_pattern_ICEToStepAfterExConvGwRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_12_4_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_12_4_black = pattern_ICEToStepAfterExConvGwRule_12_4_blackB(csp);
			if (result_pattern_ICEToStepAfterExConvGwRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						normalStep, inFlow, prevStep, inFlowToPrevStep,
						process, actor, processToActor, flow, inFlowToFlow,
						lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_12_5_expressionFBB(
			ICEToStepAfterExConvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ICEToStepAfterExConvGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ICEToStepAfterExConvGwRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_20_1_binding = pattern_ICEToStepAfterExConvGwRule_20_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_20_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_20_1_black = pattern_ICEToStepAfterExConvGwRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_20_2_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpNormalStep = _edge_next.getTrg();
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (!normalStep.equals(prevStep)) {
					if (normalStep.equals(prevStep.getNext())) {
						Actor actor = normalStep.getActor();
						if (actor != null) {
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { normalStep,
										prevStep, actor, flow, _edge_next });
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_20_3_expressionFBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, normalStep,
				prevStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_20_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_21_1_binding = pattern_ICEToStepAfterExConvGwRule_21_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_21_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_21_1_black = pattern_ICEToStepAfterExConvGwRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_633662 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_633662)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_21_2_blackFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpEvent = outFlow.getSourceRef();
					if (tmpEvent instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
						if (process.getFlowElements().contains(event)) {
							if (pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_1BB(
									outFlow, event) == null) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (FlowElement tmpInFlow : process
											.getFlowElements()) {
										if (tmpInFlow instanceof SequenceFlow) {
											SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
											if (!inFlow.equals(outFlow)) {
												if (event.equals(inFlow
														.getTargetRef())) {
													FlowNode tmpFlowNode = inFlow
															.getSourceRef();
													if (tmpFlowNode instanceof ExclusiveGateway) {
														ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
														if (pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_0BB(
																outFlow,
																flowNode) == null) {
															if (pattern_ICEToStepAfterExConvGwRule_21_2_black_nac_2BB(
																	flowNode,
																	outFlow) == null) {
																for (Lane lane : laneSet
																		.getLanes()) {
																	if (lane.getFlowNodeRefs()
																			.contains(
																					event)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_21_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_21_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_22_1_binding = pattern_ICEToStepAfterExConvGwRule_22_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_22_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_22_1_black = pattern_ICEToStepAfterExConvGwRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_347817 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_347817)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_22_2_blackFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpEvent = _edge_flowElements.getTrg();
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (process.getFlowElements().contains(event)) {
					for (LaneSet laneSet : process.getLaneSets()) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (event.equals(inFlow.getTargetRef())) {
									FlowNode tmpFlowNode = inFlow
											.getSourceRef();
									if (tmpFlowNode instanceof ExclusiveGateway) {
										ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
										for (FlowElement tmpOutFlow : process
												.getFlowElements()) {
											if (tmpOutFlow instanceof SequenceFlow) {
												SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
												if (!inFlow.equals(outFlow)) {
													if (event.equals(outFlow
															.getSourceRef())) {
														if (pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_0BB(
																outFlow,
																flowNode) == null) {
															if (pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_1BB(
																	outFlow,
																	event) == null) {
																if (pattern_ICEToStepAfterExConvGwRule_22_2_black_nac_2BB(
																		flowNode,
																		outFlow) == null) {
																	for (Lane lane : laneSet
																			.getLanes()) {
																		if (lane.getFlowNodeRefs()
																				.contains(
																						event)) {
																			_result.add(new Object[] {
																					flowNode,
																					event,
																					inFlow,
																					process,
																					outFlow,
																					lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_22_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_22_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_23_1_binding = pattern_ICEToStepAfterExConvGwRule_23_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_23_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_23_1_black = pattern_ICEToStepAfterExConvGwRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_623975 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_623975)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_23_2_blackFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEvent = _edge_targetRef.getTrg();
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof ExclusiveGateway) {
						ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
						for (SequenceFlow outFlow : event.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_0BB(
										outFlow, flowNode) == null) {
									if (pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_1BB(
											outFlow, event) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_23_2_black_nac_2BB(
												flowNode, outFlow) == null) {
											for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															inFlow,
															FlowElementsContainer.class,
															"flowElements")) {
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														if (process
																.getFlowElements()
																.contains(event)) {
															for (LaneSet laneSet : process
																	.getLaneSets()) {
																for (Lane lane : laneSet
																		.getLanes()) {
																	if (lane.getFlowNodeRefs()
																			.contains(
																					event)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_23_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_23_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_24_1_binding = pattern_ICEToStepAfterExConvGwRule_24_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_24_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_24_1_black = pattern_ICEToStepAfterExConvGwRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_616288 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_616288)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_24_2_blackFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_incoming.getSrc();
		if (tmpEvent instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpFlowNode = inFlow.getSourceRef();
					if (tmpFlowNode instanceof ExclusiveGateway) {
						ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
						for (SequenceFlow outFlow : event.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_0BB(
										outFlow, flowNode) == null) {
									if (pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_1BB(
											outFlow, event) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_24_2_black_nac_2BB(
												flowNode, outFlow) == null) {
											for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															event,
															FlowElementsContainer.class,
															"flowElements")) {
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													if (process
															.getFlowElements()
															.contains(inFlow)) {
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
																					event)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_24_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_24_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_25_1_binding = pattern_ICEToStepAfterExConvGwRule_25_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_25_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_25_1_black = pattern_ICEToStepAfterExConvGwRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_100883 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_100883)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_25_2_blackFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpEvent = _edge_sourceRef.getTrg();
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (event.equals(outFlow.getSourceRef())) {
					if (pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_1BB(
							outFlow, event) == null) {
						for (SequenceFlow inFlow : event.getIncoming()) {
							if (!inFlow.equals(outFlow)) {
								FlowNode tmpFlowNode = inFlow.getSourceRef();
								if (tmpFlowNode instanceof ExclusiveGateway) {
									ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
									if (pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_0BB(
											outFlow, flowNode) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_25_2_black_nac_2BB(
												flowNode, outFlow) == null) {
											for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															outFlow,
															FlowElementsContainer.class,
															"flowElements")) {
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													if (process
															.getFlowElements()
															.contains(inFlow)) {
														if (process
																.getFlowElements()
																.contains(event)) {
															for (LaneSet laneSet : process
																	.getLaneSets()) {
																for (Lane lane : laneSet
																		.getLanes()) {
																	if (lane.getFlowNodeRefs()
																			.contains(
																					event)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_25_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_25_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_26_1_binding = pattern_ICEToStepAfterExConvGwRule_26_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_26_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_26_1_black = pattern_ICEToStepAfterExConvGwRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_995824 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_995824)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_26_2_blackFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_outgoing.getSrc();
		if (tmpEvent instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (event.equals(outFlow.getSourceRef())) {
					if (pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_1BB(
							outFlow, event) == null) {
						for (SequenceFlow inFlow : event.getIncoming()) {
							if (!inFlow.equals(outFlow)) {
								FlowNode tmpFlowNode = inFlow.getSourceRef();
								if (tmpFlowNode instanceof ExclusiveGateway) {
									ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
									if (pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_0BB(
											outFlow, flowNode) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_26_2_black_nac_2BB(
												flowNode, outFlow) == null) {
											for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															event,
															FlowElementsContainer.class,
															"flowElements")) {
												if (tmpProcess instanceof bpmn2.Process) {
													bpmn2.Process process = (bpmn2.Process) tmpProcess;
													if (process
															.getFlowElements()
															.contains(inFlow)) {
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
																					event)) {
																		_result.add(new Object[] {
																				flowNode,
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_26_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_26_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_27_1_binding = pattern_ICEToStepAfterExConvGwRule_27_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_27_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_27_1_black = pattern_ICEToStepAfterExConvGwRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_27_2_blackFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_actor.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(normalStep.getActor())) {
					for (Step prevStep : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(normalStep, Step.class,
									"next")) {
						if (!normalStep.equals(prevStep)) {
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { normalStep,
										prevStep, actor, flow, _edge_actor });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_27_3_expressionFBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, normalStep,
				prevStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_27_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_28_1_binding = pattern_ICEToStepAfterExConvGwRule_28_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_28_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_28_1_black = pattern_ICEToStepAfterExConvGwRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_28_2_blackFFFFB(
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
						for (Step prevStep : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(normalStep,
										Step.class, "next")) {
							if (!normalStep.equals(prevStep)) {
								_result.add(new Object[] { normalStep,
										prevStep, actor, flow, _edge_steps });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_28_3_expressionFBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			NormalStep normalStep, Step prevStep, Actor actor, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, normalStep,
				prevStep, actor, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_28_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_1_bindingFB(
			ICEToStepAfterExConvGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_1_blackFBB(
			EClass __eClass, ICEToStepAfterExConvGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_1_bindingAndBlackFFB(
			ICEToStepAfterExConvGwRule _this) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_29_1_binding = pattern_ICEToStepAfterExConvGwRule_29_1_bindingFB(_this);
		if (result_pattern_ICEToStepAfterExConvGwRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ICEToStepAfterExConvGwRule_29_1_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_29_1_black = pattern_ICEToStepAfterExConvGwRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ICEToStepAfterExConvGwRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ICEToStepAfterExConvGwRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway flowNode) {
		for (ExclusiveGateway __DEC_outFlow_default_200283 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!flowNode.equals(__DEC_outFlow_default_200283)) {
				return new Object[] { outFlow, flowNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_1BB(
			SequenceFlow outFlow, IntermediateCatchEvent event) {
		if (event.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_2BB(
			ExclusiveGateway flowNode, SequenceFlow outFlow) {
		if (outFlow.equals(flowNode.getDefault())) {
			return new Object[] { flowNode, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_29_2_blackFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpEvent = _edge_flowNodeRefs.getTrg();
			if (tmpEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent event = (IntermediateCatchEvent) tmpEvent;
				if (lane.getFlowNodeRefs().contains(event)) {
					for (SequenceFlow inFlow : event.getIncoming()) {
						FlowNode tmpFlowNode = inFlow.getSourceRef();
						if (tmpFlowNode instanceof ExclusiveGateway) {
							ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
							for (SequenceFlow outFlow : event.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_0BB(
											outFlow, flowNode) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_1BB(
												outFlow, event) == null) {
											if (pattern_ICEToStepAfterExConvGwRule_29_2_black_nac_2BB(
													flowNode, outFlow) == null) {
												for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																lane,
																LaneSet.class,
																"lanes")) {
													for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	event,
																	FlowElementsContainer.class,
																	"flowElements")) {
														if (tmpProcess instanceof bpmn2.Process) {
															bpmn2.Process process = (bpmn2.Process) tmpProcess;
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
																				event,
																				inFlow,
																				process,
																				outFlow,
																				lane,
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

		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_29_3_expressionFBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this, Match match,
			ExclusiveGateway flowNode, IntermediateCatchEvent event,
			SequenceFlow inFlow, bpmn2.Process process, SequenceFlow outFlow,
			Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, flowNode,
				event, inFlow, process, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_29_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ICEToStepAfterExConvGwRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_1_blackB(
			ICEToStepAfterExConvGwRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ExclusiveGateway flowNode) {
		if (ruleResult.getSourceObjects().contains(flowNode)) {
			return new Object[] { ruleResult, flowNode };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToStep inFlowToPrevStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToPrevStep)) {
			return new Object[] { ruleResult, inFlowToPrevStep };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Step prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ProcessToActor processToActor) {
		if (ruleResult.getCorrObjects().contains(processToActor)) {
			return new Object[] { ruleResult, processToActor };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ICEToStepAfterExConvGwRule_32_2_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToPrevStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToPrevStep : inFlowToPrevStepList
					.getEntryObjects()) {
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					SequenceFlow inFlow = inFlowToPrevStep.getSource();
					if (inFlow != null) {
						Step prevStep = inFlowToPrevStep.getTarget();
						if (prevStep != null) {
							FlowNode tmpFlowNode = inFlow.getSourceRef();
							if (tmpFlowNode instanceof ExclusiveGateway) {
								ExclusiveGateway flowNode = (ExclusiveGateway) tmpFlowNode;
								if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_2BB(
										ruleResult, inFlowToPrevStep) == null) {
									if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_1BB(
											ruleResult, inFlow) == null) {
										if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_3BB(
												ruleResult, prevStep) == null) {
											if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_0BB(
													ruleResult, flowNode) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																inFlow,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_4BB(
																ruleResult,
																process) == null) {
															for (LaneSet laneSet : process
																	.getLaneSets()) {
																if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_5BB(
																		ruleResult,
																		laneSet) == null) {
																	for (Lane lane : laneSet
																			.getLanes()) {
																		if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_6BB(
																				ruleResult,
																				lane) == null) {
																			for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							inFlow,
																							SequenceFlowToUCFlow.class,
																							"source")) {
																				Flow flow = inFlowToFlow
																						.getTarget();
																				if (flow != null) {
																					if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_9BB(
																							ruleResult,
																							inFlowToFlow) == null) {
																						if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_10BB(
																								ruleResult,
																								flow) == null) {
																							for (ProcessToActor processToActor : org.moflon.util.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											process,
																											ProcessToActor.class,
																											"source")) {
																								Actor actor = processToActor
																										.getTarget();
																								if (actor != null) {
																									if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_7BB(
																											ruleResult,
																											processToActor) == null) {
																										if (pattern_ICEToStepAfterExConvGwRule_32_2_black_nac_8BB(
																												ruleResult,
																												actor) == null) {
																											_result.add(new Object[] {
																													inFlowToPrevStepList,
																													flowNode,
																													inFlow,
																													inFlowToPrevStep,
																													prevStep,
																													process,
																													laneSet,
																													lane,
																													processToActor,
																													actor,
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
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_3_bindingFBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, flowNode, inFlow, prevStep,
				inFlowToPrevStep, process, actor, processToActor, flow,
				inFlowToFlow, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flowNode,
					inFlow, prevStep, inFlowToPrevStep, process, actor,
					processToActor, flow, inFlowToFlow, lane, laneSet,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_3_bindingAndBlackFBBBBBBBBBBBBBB(
			ICEToStepAfterExConvGwRule _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway flowNode,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ICEToStepAfterExConvGwRule_32_3_binding = pattern_ICEToStepAfterExConvGwRule_32_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, flowNode, inFlow, prevStep,
				inFlowToPrevStep, process, actor, processToActor, flow,
				inFlowToFlow, lane, laneSet, ruleResult);
		if (result_pattern_ICEToStepAfterExConvGwRule_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_ICEToStepAfterExConvGwRule_32_3_binding[0];

			Object[] result_pattern_ICEToStepAfterExConvGwRule_32_3_black = pattern_ICEToStepAfterExConvGwRule_32_3_blackB(csp);
			if (result_pattern_ICEToStepAfterExConvGwRule_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flowNode,
						inFlow, prevStep, inFlowToPrevStep, process, actor,
						processToActor, flow, inFlowToFlow, lane, laneSet,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ICEToStepAfterExConvGwRule_32_4_expressionFBB(
			ICEToStepAfterExConvGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_5_blackBBBBBBBBBBB(
			ExclusiveGateway flowNode, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet) {
		return new Object[] { flowNode, inFlow, prevStep, inFlowToPrevStep,
				process, actor, processToActor, flow, inFlowToFlow, lane,
				laneSet };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_6_blackBBBBBBBBBBBB(
			ExclusiveGateway flowNode, SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, bpmn2.Process process,
			Actor actor, ProcessToActor processToActor, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { flowNode, inFlow, prevStep, inFlowToPrevStep,
				process, actor, processToActor, flow, inFlowToFlow, lane,
				laneSet, ruleResult };
	}

	public static final Object[] pattern_ICEToStepAfterExConvGwRule_32_6_greenFFBBBFBFBFBBB(
			SequenceFlow inFlow, Step prevStep, bpmn2.Process process,
			Actor actor, Flow flow, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		IntermediateCatchEvent event = Bpmn2Factory.eINSTANCE
				.createIntermediateCatchEvent();
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("event", "id");
		Object _localVariable_1 = csp.getValue("event", "name");
		Object _localVariable_2 = csp.getValue("normalStep", "type");
		Object _localVariable_3 = csp.getValue("normalStep", "name");
		Object _localVariable_4 = csp.getValue("normalStep", "label");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		lane.getFlowNodeRefs().add(event);
		ruleResult.getSourceObjects().add(event);
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ruleResult.getTargetObjects().add(normalStep);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(event);
		ruleResult.getSourceObjects().add(outFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		ruleResult.getCorrObjects().add(outFlowToFlow);
		String event_id_prime = (String) _localVariable_0;
		String event_name_prime = (String) _localVariable_1;
		StepType normalStep_type_prime = (StepType) _localVariable_2;
		String normalStep_name_prime = (String) _localVariable_3;
		String normalStep_label_prime = (String) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		event.setId(event_id_prime);
		event.setName(event_name_prime);
		normalStep.setType(normalStep_type_prime);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { event, normalStep, inFlow, prevStep, process,
				outFlow, actor, outFlowToNormalStep, flow, outFlowToFlow, lane,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ICEToStepAfterExConvGwRule_32_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ICEToStepAfterExConvGwRuleImpl
