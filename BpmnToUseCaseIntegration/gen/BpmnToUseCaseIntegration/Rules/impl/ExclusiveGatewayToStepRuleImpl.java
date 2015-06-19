/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ProcessToActor;

import BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule;
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
import bpmn2.GatewayDirection;
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
 * An implementation of the model object '<em><b>Exclusive Gateway To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExclusiveGatewayToStepRuleImpl extends AbstractRuleImpl implements
		ExclusiveGatewayToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExclusiveGatewayToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_0_1_blackBBBBBBBB(this,
						match, inFlow, process, exclusiveGateway, outFlow,
						lane, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = " + laneSet + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_0_2_bindingAndBlackFBBBBBBBB(
						this, match, inFlow, process, exclusiveGateway,
						outFlow, lane, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = " + laneSet + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_4_blackBBBBBBB(match,
							inFlow, process, exclusiveGateway, outFlow, lane,
							laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[inFlow] = " + inFlow + ", "
								+ "[process] = " + process + ", "
								+ "[exclusiveGateway] = " + exclusiveGateway
								+ ", " + "[outFlow] = " + outFlow + ", "
								+ "[lane] = " + lane + ", " + "[laneSet] = "
								+ laneSet + ".");
			}
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_4_greenBBBBBBFFFFFFFF(
							match, inFlow, process, exclusiveGateway, outFlow,
							lane);
			// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result4_green[12];
			// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_5_blackBBBBBBB(match,
							inFlow, process, exclusiveGateway, outFlow, lane,
							laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[inFlow] = " + inFlow + ", "
								+ "[process] = " + process + ", "
								+ "[exclusiveGateway] = " + exclusiveGateway
								+ ", " + "[outFlow] = " + outFlow + ", "
								+ "[lane] = " + lane + ", " + "[laneSet] = "
								+ laneSet + ".");
			}
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_5_greenBBBBBFFF(
							match, inFlow, process, lane, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_6_expressionBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet);
			return ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_7_expressionF();
		} else {
			return ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[3];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[4];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_bindingAndBlack[5];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		Actor actor = (Actor) result1_bindingAndBlack[8];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[9];
		Lane lane = (Lane) result1_bindingAndBlack[10];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_1_greenBFFBBFFBBB(
						prevStep, exclusiveGateway, outFlow, flow, actor, csp);
		NormalStep normalStep = (NormalStep) result1_green[1];
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[2];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_green[5];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_2_blackBBBBBB(normalStep,
						outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[normalStep] = " + normalStep
							+ ", " + "[outFlowToFlow] = " + outFlowToFlow
							+ ", " + "[exclusiveGateway] = " + exclusiveGateway
							+ ", " + "[outFlow] = " + outFlow + ", "
							+ "[exclusiveGatewayToNormalStep] = "
							+ exclusiveGatewayToNormalStep + ", "
							+ "[outFlowToNormalStep] = " + outFlowToNormalStep
							+ ".");
		}
		Object[] result2_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_2_greenFBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, outFlowToFlow, inFlowToFlow, process,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[prevStep] = "
							+ prevStep
							+ ", "
							+ "[inFlowToPrevStep] = "
							+ inFlowToPrevStep
							+ ", "
							+ "[normalStep] = "
							+ normalStep
							+ ", "
							+ "[outFlowToFlow] = "
							+ outFlowToFlow
							+ ", "
							+ "[inFlowToFlow] = "
							+ inFlowToFlow
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[exclusiveGatewayToNormalStep] = "
							+ exclusiveGatewayToNormalStep
							+ ", "
							+ "[outFlowToNormalStep] = "
							+ outFlowToNormalStep
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[processToActor] = "
							+ processToActor
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = " + laneSet + ".");
		}
		ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
						ruleresult, inFlow, prevStep, normalStep,
						outFlowToFlow, process, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[13];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[18];
		// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[23];
		// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[27];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[28];
		// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[29];

		// perform postprocessing story node is empty
		// register objects
		ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, outFlowToFlow, inFlowToFlow, process,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SequenceFlow inFlow = (SequenceFlow) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_binding[2];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[3];
		Lane lane = (Lane) result2_binding[4];
		LaneSet laneSet = (LaneSet) result2_binding[5];
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_2_2_blackBFFFBBBFFFBBB(
						inFlow, process, exclusiveGateway, outFlow, lane,
						laneSet, match)) {
			Step prevStep = (Step) result2_black[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[3];
			Flow flow = (Flow) result2_black[7];
			Actor actor = (Actor) result2_black[8];
			ProcessToActor processToActor = (ProcessToActor) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_2_3_blackBBBBBBBBBBBB(
							inFlow, prevStep, inFlowToPrevStep, inFlowToFlow,
							process, exclusiveGateway, outFlow, flow, actor,
							processToActor, lane, laneSet)) {
				Object[] result3_green = ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
								inFlow, prevStep, inFlowToPrevStep,
								inFlowToFlow, process, exclusiveGateway,
								outFlow, flow, actor, processToActor, lane,
								laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[24];
				// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[25];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[28];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[29];

				// solve CSP
				Object[] result4_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, prevStep,
								inFlowToPrevStep, inFlowToFlow, process,
								exclusiveGateway, outFlow, flow, actor,
								processToActor, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[inFlow] = "
									+ inFlow
									+ ", "
									+ "[prevStep] = "
									+ prevStep
									+ ", "
									+ "[inFlowToPrevStep] = "
									+ inFlowToPrevStep
									+ ", "
									+ "[inFlowToFlow] = "
									+ inFlowToFlow
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[exclusiveGateway] = "
									+ exclusiveGateway
									+ ", "
									+ "[outFlow] = "
									+ outFlow
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[processToActor] = "
									+ processToActor
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = " + laneSet + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
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
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ALT");
		literal0.setType("");

		// Create attribute variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", true, csp);
		var_exclusiveGateway_id.setValue(exclusiveGateway.getId());
		var_exclusiveGateway_id.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", true, csp);
		var_exclusiveGateway_name.setValue(exclusiveGateway.getName());
		var_exclusiveGateway_name.setType("String");

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
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
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
				&& match.getObject("exclusiveGateway")
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
	public boolean isAppropriate_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		// initial bindings
		Object[] result1_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_10_1_blackBBBBBB(this,
						match, prevStep, normalStep, flow, actor);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevStep] = "
							+ prevStep + ", " + "[normalStep] = " + normalStep
							+ ", " + "[flow] = " + flow + ", " + "[actor] = "
							+ actor + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_10_2_bindingAndBlackFBBBBBB(
						this, match, prevStep, normalStep, flow, actor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevStep] = "
							+ prevStep + ", " + "[normalStep] = " + normalStep
							+ ", " + "[flow] = " + flow + ", " + "[actor] = "
							+ actor + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_4_blackBBBBB(match,
							prevStep, normalStep, flow, actor);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[prevStep] = " + prevStep + ", "
								+ "[normalStep] = " + normalStep + ", "
								+ "[flow] = " + flow + ", " + "[actor] = "
								+ actor + ".");
			}
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_4_greenBBBBBFFF(
							match, prevStep, normalStep, flow, actor);
			// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result4_green[5];
			// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result4_green[6];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_5_blackBBBBB(match,
							prevStep, normalStep, flow, actor);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[prevStep] = " + prevStep + ", "
								+ "[normalStep] = " + normalStep + ", "
								+ "[flow] = " + flow + ", " + "[actor] = "
								+ actor + ".");
			}
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_5_greenBBBB(match,
							prevStep, flow, actor);

			// register objects to match
			ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_6_expressionBBBBBB(
							this, match, prevStep, normalStep, flow, actor);
			return ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_7_expressionF();
		} else {
			return ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[3];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[4];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[5];
		Flow flow = (Flow) result1_bindingAndBlack[6];
		Actor actor = (Actor) result1_bindingAndBlack[7];
		ProcessToActor processToActor = (ProcessToActor) result1_bindingAndBlack[8];
		Lane lane = (Lane) result1_bindingAndBlack[9];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_1_greenBBFBFFFFBBB(
						inFlow, normalStep, process, flow, lane, csp);
		SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result1_green[2];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_green[4];
		SequenceFlow outFlow = (SequenceFlow) result1_green[5];
		FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result1_green[6];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[7];

		// collect translated elements
		Object[] result2_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_2_blackBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[normalStep] = " + normalStep
							+ ", " + "[outFlowToFlow] = " + outFlowToFlow
							+ ", " + "[exclusiveGateway] = " + exclusiveGateway
							+ ", " + "[outFlow] = " + outFlow + ", "
							+ "[exclusiveGatewayToNormalStep] = "
							+ exclusiveGatewayToNormalStep + ", "
							+ "[outFlowToNormalStep] = " + outFlowToNormalStep
							+ ".");
		}
		Object[] result2_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_2_greenFBBBBBB(
						normalStep, outFlowToFlow, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, outFlowToFlow, inFlowToFlow, process,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[prevStep] = "
							+ prevStep
							+ ", "
							+ "[inFlowToPrevStep] = "
							+ inFlowToPrevStep
							+ ", "
							+ "[normalStep] = "
							+ normalStep
							+ ", "
							+ "[outFlowToFlow] = "
							+ outFlowToFlow
							+ ", "
							+ "[inFlowToFlow] = "
							+ inFlowToFlow
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[exclusiveGatewayToNormalStep] = "
							+ exclusiveGatewayToNormalStep
							+ ", "
							+ "[outFlowToNormalStep] = "
							+ outFlowToNormalStep
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[processToActor] = "
							+ processToActor
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = " + laneSet + ".");
		}
		ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
						ruleresult, inFlow, prevStep, normalStep,
						outFlowToFlow, process, exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, lane);
		// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[13];
		// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlowToFlow__outFlow____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge outFlowToFlow__flow____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[18];
		// EMoflonEdge inFlow__exclusiveGateway____targetRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge exclusiveGateway__inFlow____incoming = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge exclusiveGateway__outFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge exclusiveGateway__outFlow____default = (EMoflonEdge) result3_green[23];
		// EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[27];
		// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[28];
		// EMoflonEdge lane__exclusiveGateway____flowNodeRefs = (EMoflonEdge) result3_green[29];

		// perform postprocessing story node is empty
		// register objects
		ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, inFlow, prevStep, inFlowToPrevStep,
						normalStep, outFlowToFlow, inFlowToFlow, process,
						exclusiveGateway, outFlow,
						exclusiveGatewayToNormalStep, outFlowToNormalStep,
						flow, actor, processToActor, lane, laneSet);
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Step prevStep = (Step) result2_binding[0];
		NormalStep normalStep = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		Actor actor = (Actor) result2_binding[3];
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_12_2_blackFBFBFFBBFB(
						prevStep, normalStep, flow, actor, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			bpmn2.Process process = (bpmn2.Process) result2_black[5];
			ProcessToActor processToActor = (ProcessToActor) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_12_3_blackBBBBBBBBBFF(
							inFlow, prevStep, inFlowToPrevStep, normalStep,
							inFlowToFlow, process, flow, actor, processToActor)) {
				Lane lane = (Lane) result3_black[9];
				LaneSet laneSet = (LaneSet) result3_black[10];
				Object[] result3_green = ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
								inFlow, prevStep, inFlowToPrevStep, normalStep,
								inFlowToFlow, process, flow, actor,
								processToActor, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge prevStep__normalStep____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlowToPrevStep__inFlow____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlowToPrevStep__prevStep____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge normalStep__actor____actor = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[20];
				// EMoflonEdge processToActor__process____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge processToActor__actor____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, prevStep,
								inFlowToPrevStep, normalStep, inFlowToFlow,
								process, flow, actor, processToActor, lane,
								laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[inFlow] = "
									+ inFlow
									+ ", "
									+ "[prevStep] = "
									+ prevStep
									+ ", "
									+ "[inFlowToPrevStep] = "
									+ inFlowToPrevStep
									+ ", "
									+ "[normalStep] = "
									+ normalStep
									+ ", "
									+ "[inFlowToFlow] = "
									+ inFlowToFlow
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[processToActor] = "
									+ processToActor
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = "
									+ laneSet
									+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ALT");
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

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
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		var_exclusiveGateway_id.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		var_exclusiveGateway_name.setType("String");
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_826(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_20_2_blackFFFFB(_edge_next)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_20_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, flow, actor)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_827(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_21_2_blackFFFFB(_edge_actor)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_21_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, flow, actor)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_263(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_22_2_blackFFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_22_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_264(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_23_2_blackFFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_23_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_265(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_24_2_blackFFFFFFB(_edge_targetRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_24_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_266(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_25_2_blackFFFFFFB(_edge_incoming)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_25_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_267(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_26_2_blackFFFFFFB(_edge_sourceRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_26_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_268(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_27_2_blackFFFFFFB(_edge_outgoing)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_27_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_269(
			EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_28_2_blackFFFFFFB(_edge_default)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_28_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_828(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_29_2_blackFFFFB(_edge_steps)) {
			Step prevStep = (Step) result2_black[0];
			NormalStep normalStep = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_29_3_expressionFBBBBBB(
							this, match, prevStep, normalStep, flow, actor)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_270(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_30_2_blackFFFFFFB(_edge_flowNodeRefs)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			Lane lane = (Lane) result2_black[4];
			LaneSet laneSet = (LaneSet) result2_black[5];
			Object[] result2_green = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_30_3_expressionFBBBBBBBB(
							this, match, inFlow, process, exclusiveGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
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
		Object[] result1_black = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_33_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_33_2_blackFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToPrevStepList = (RuleEntryList) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			bpmn2.Process process = (bpmn2.Process) result2_black[6];
			LaneSet laneSet = (LaneSet) result2_black[7];
			Lane lane = (Lane) result2_black[8];
			ProcessToActor processToActor = (ProcessToActor) result2_black[9];
			Actor actor = (Actor) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_33_3_bindingAndBlackFBBBBBBBBBBBBB(
							this, isApplicableMatch, inFlow, prevStep,
							inFlowToPrevStep, inFlowToFlow, process, flow,
							actor, processToActor, lane, laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[prevStep] = "
								+ prevStep
								+ ", "
								+ "[inFlowToPrevStep] = "
								+ inFlowToPrevStep
								+ ", "
								+ "[inFlowToFlow] = "
								+ inFlowToFlow
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[actor] = "
								+ actor
								+ ", "
								+ "[processToActor] = "
								+ processToActor
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[ruleResult] = "
								+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ExclusiveGatewayToStepRuleImpl
					.pattern_ExclusiveGatewayToStepRule_33_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ExclusiveGatewayToStepRuleImpl
						.pattern_ExclusiveGatewayToStepRule_33_5_blackBBBBBBBBBB(
								inFlow, prevStep, inFlowToPrevStep,
								inFlowToFlow, process, flow, actor,
								processToActor, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_33_6_blackBBBBBBBBBBB(
									inFlow, prevStep, inFlowToPrevStep,
									inFlowToFlow, process, flow, actor,
									processToActor, lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[inFlow] = "
										+ inFlow
										+ ", "
										+ "[prevStep] = "
										+ prevStep
										+ ", "
										+ "[inFlowToPrevStep] = "
										+ inFlowToPrevStep
										+ ", "
										+ "[inFlowToFlow] = "
										+ inFlowToFlow
										+ ", "
										+ "[process] = "
										+ process
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[actor] = "
										+ actor
										+ ", "
										+ "[processToActor] = "
										+ processToActor
										+ ", "
										+ "[lane] = "
										+ lane
										+ ", "
										+ "[laneSet] = "
										+ laneSet
										+ ", "
										+ "[ruleResult] = "
										+ ruleResult + ".");
					}
					ExclusiveGatewayToStepRuleImpl
							.pattern_ExclusiveGatewayToStepRule_33_6_greenBBFFBFFFFBBBBB(
									inFlow, prevStep, process, flow, actor,
									lane, ruleResult, csp);
					// NormalStep normalStep = (NormalStep) result6_green[2];
					// SequenceFlowToUCFlow outFlowToFlow = (SequenceFlowToUCFlow) result6_green[3];
					// ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result6_green[5];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[6];
					// FlowNodeToStep exclusiveGatewayToNormalStep = (FlowNodeToStep) result6_green[7];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ExclusiveGatewayToStepRuleImpl
				.pattern_ExclusiveGatewayToStepRule_33_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ALT");
		literal1.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		var_exclusiveGateway_id.setType("String");
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		var_normalStep_name.setType("String");
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		var_exclusiveGateway_name.setType("String");
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		var_normalStep_label.setType("String");
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");
		Variable var_normalStep_type = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.type", csp);
		var_normalStep_type.setType("UseCaseDSL.StepType");

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
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_normalStep_type, literal1);
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(bpmn2.Process) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Flow) arguments.get(8),
					(Actor) arguments.get(9),
					(ProcessToActor) arguments.get(10),
					(Lane) arguments.get(11), (LaneSet) arguments.get(12));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(bpmn2.Process) arguments.get(6), (Flow) arguments.get(7),
					(Actor) arguments.get(8),
					(ProcessToActor) arguments.get(9),
					(Lane) arguments.get(10), (LaneSet) arguments.get(11));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_826__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_826((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_827__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_827((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_263__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_263((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_264__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_264((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_265__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_265((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_266__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_266((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_267__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_267((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_268__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_268((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_269__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_269((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_828__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_828((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_270__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_270((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_FLOW_ACTOR_PROCESSTOACTOR_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(bpmn2.Process) arguments.get(5), (Flow) arguments.get(6),
					(Actor) arguments.get(7),
					(ProcessToActor) arguments.get(8), (Lane) arguments.get(9),
					(LaneSet) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_1_blackBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { _this, match, inFlow, process,
					exclusiveGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_2_bindingFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, inFlow, process,
					exclusiveGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_2_bindingAndBlackFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_0_2_binding = pattern_ExclusiveGatewayToStepRule_0_2_bindingFBBBBBBBB(
				_this, match, inFlow, process, exclusiveGateway, outFlow, lane,
				laneSet);
		if (result_pattern_ExclusiveGatewayToStepRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_0_2_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_0_2_black = pattern_ExclusiveGatewayToStepRule_0_2_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepRule_0_2_black != null) {

				return new Object[] { csp, _this, match, inFlow, process,
						exclusiveGateway, outFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_0_3_expressionFBB(
			ExclusiveGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_4_blackBBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, inFlow, process, exclusiveGateway,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_4_greenBBBBBBFFFFFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(exclusiveGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges()
				.add(exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		match.getToBeTranslatedEdges()
				.add(exclusiveGateway__outFlow____default);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		match.getToBeTranslatedEdges().add(
				lane__exclusiveGateway____flowNodeRefs);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { match, inFlow, process, exclusiveGateway,
				outFlow, lane, process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_5_blackBBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			return new Object[] { match, inFlow, process, exclusiveGateway,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_0_5_greenBBBBBFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process, Lane lane,
			LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, inFlow, process, lane, laneSet,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_ExclusiveGatewayToStepRule_0_6_expressionBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, inFlow, process,
				exclusiveGateway, outFlow, lane, laneSet);

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("exclusiveGateway");
		EObject _localVariable_6 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("actor");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_10 = isApplicableMatch.getObject("lane");
		EObject _localVariable_11 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpInFlowToPrevStep = _localVariable_2;
		EObject tmpInFlowToFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpExclusiveGateway = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpActor = _localVariable_8;
		EObject tmpProcessToActor = _localVariable_9;
		EObject tmpLane = _localVariable_10;
		EObject tmpLaneSet = _localVariable_11;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
						SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (tmpExclusiveGateway instanceof ExclusiveGateway) {
								ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpActor instanceof Actor) {
											Actor actor = (Actor) tmpActor;
											if (tmpProcessToActor instanceof ProcessToActor) {
												ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
												if (tmpLane instanceof Lane) {
													Lane lane = (Lane) tmpLane;
													if (tmpLaneSet instanceof LaneSet) {
														LaneSet laneSet = (LaneSet) tmpLaneSet;
														return new Object[] {
																inFlow,
																prevStep,
																inFlowToPrevStep,
																inFlowToFlow,
																process,
																exclusiveGateway,
																outFlow, flow,
																actor,
																processToActor,
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

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_1_blackBBBBBBBBBBBBFBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { inFlow, prevStep, inFlowToPrevStep,
							inFlowToFlow, process, exclusiveGateway, outFlow,
							flow, actor, processToActor, lane, laneSet, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFFBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_1_1_binding = pattern_ExclusiveGatewayToStepRule_1_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExclusiveGatewayToStepRule_1_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[0];
			Step prevStep = (Step) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[3];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[4];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[5];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[6];
			Flow flow = (Flow) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[7];
			Actor actor = (Actor) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[8];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[9];
			Lane lane = (Lane) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[10];
			LaneSet laneSet = (LaneSet) result_pattern_ExclusiveGatewayToStepRule_1_1_binding[11];

			Object[] result_pattern_ExclusiveGatewayToStepRule_1_1_black = pattern_ExclusiveGatewayToStepRule_1_1_blackBBBBBBBBBBBBFBB(
					inFlow, prevStep, inFlowToPrevStep, inFlowToFlow, process,
					exclusiveGateway, outFlow, flow, actor, processToActor,
					lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_ExclusiveGatewayToStepRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_1_1_black[12];

				return new Object[] { inFlow, prevStep, inFlowToPrevStep,
						inFlowToFlow, process, exclusiveGateway, outFlow, flow,
						actor, processToActor, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_1_greenBFFBBFFBBB(
			Step prevStep, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		Object _localVariable_2 = csp.getValue("normalStep", "type");
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		outFlowToFlow.setSource(outFlow);
		outFlowToFlow.setTarget(flow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		StepType normalStep_type_prime = (StepType) _localVariable_2;
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		normalStep.setType(normalStep_type_prime);
		return new Object[] { prevStep, normalStep, outFlowToFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep, flow, actor, csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_2_blackBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { normalStep, outFlowToFlow, exclusiveGateway,
				outFlow, exclusiveGatewayToNormalStep, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_2_greenFBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getTranslatedElements().add(exclusiveGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(exclusiveGatewayToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, normalStep, outFlowToFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep,
			EObject outFlowToFlow, EObject inFlowToFlow, EObject process,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		if (!inFlow.equals(prevStep)) {
			if (!inFlow.equals(inFlowToPrevStep)) {
				if (!inFlow.equals(normalStep)) {
					if (!inFlow.equals(outFlowToFlow)) {
						if (!inFlow.equals(inFlowToFlow)) {
							if (!inFlow.equals(process)) {
								if (!inFlow.equals(outFlow)) {
									if (!inFlow.equals(outFlowToNormalStep)) {
										if (!inFlow.equals(processToActor)) {
											if (!inFlow.equals(lane)) {
												if (!inFlow.equals(laneSet)) {
													if (!prevStep
															.equals(process)) {
														if (!prevStep
																.equals(processToActor)) {
															if (!inFlowToPrevStep
																	.equals(prevStep)) {
																if (!inFlowToPrevStep
																		.equals(normalStep)) {
																	if (!inFlowToPrevStep
																			.equals(outFlowToFlow)) {
																		if (!inFlowToPrevStep
																				.equals(process)) {
																			if (!inFlowToPrevStep
																					.equals(outFlow)) {
																				if (!inFlowToPrevStep
																						.equals(outFlowToNormalStep)) {
																					if (!inFlowToPrevStep
																							.equals(processToActor)) {
																						if (!inFlowToPrevStep
																								.equals(lane)) {
																							if (!inFlowToPrevStep
																									.equals(laneSet)) {
																								if (!normalStep
																										.equals(prevStep)) {
																									if (!normalStep
																											.equals(outFlowToFlow)) {
																										if (!normalStep
																												.equals(process)) {
																											if (!normalStep
																													.equals(outFlow)) {
																												if (!normalStep
																														.equals(outFlowToNormalStep)) {
																													if (!normalStep
																															.equals(processToActor)) {
																														if (!outFlowToFlow
																																.equals(prevStep)) {
																															if (!outFlowToFlow
																																	.equals(process)) {
																																if (!outFlowToFlow
																																		.equals(outFlowToNormalStep)) {
																																	if (!outFlowToFlow
																																			.equals(processToActor)) {
																																		if (!inFlowToFlow
																																				.equals(prevStep)) {
																																			if (!inFlowToFlow
																																					.equals(inFlowToPrevStep)) {
																																				if (!inFlowToFlow
																																						.equals(normalStep)) {
																																					if (!inFlowToFlow
																																							.equals(outFlowToFlow)) {
																																						if (!inFlowToFlow
																																								.equals(process)) {
																																							if (!inFlowToFlow
																																									.equals(outFlow)) {
																																								if (!inFlowToFlow
																																										.equals(outFlowToNormalStep)) {
																																									if (!inFlowToFlow
																																											.equals(processToActor)) {
																																										if (!inFlowToFlow
																																												.equals(lane)) {
																																											if (!inFlowToFlow
																																													.equals(laneSet)) {
																																												if (!process
																																														.equals(processToActor)) {
																																													if (!exclusiveGateway
																																															.equals(inFlow)) {
																																														if (!exclusiveGateway
																																																.equals(prevStep)) {
																																															if (!exclusiveGateway
																																																	.equals(inFlowToPrevStep)) {
																																																if (!exclusiveGateway
																																																		.equals(normalStep)) {
																																																	if (!exclusiveGateway
																																																			.equals(outFlowToFlow)) {
																																																		if (!exclusiveGateway
																																																				.equals(inFlowToFlow)) {
																																																			if (!exclusiveGateway
																																																					.equals(process)) {
																																																				if (!exclusiveGateway
																																																						.equals(outFlow)) {
																																																					if (!exclusiveGateway
																																																							.equals(exclusiveGatewayToNormalStep)) {
																																																						if (!exclusiveGateway
																																																								.equals(outFlowToNormalStep)) {
																																																							if (!exclusiveGateway
																																																									.equals(flow)) {
																																																								if (!exclusiveGateway
																																																										.equals(processToActor)) {
																																																									if (!exclusiveGateway
																																																											.equals(lane)) {
																																																										if (!exclusiveGateway
																																																												.equals(laneSet)) {
																																																											if (!outFlow
																																																													.equals(prevStep)) {
																																																												if (!outFlow
																																																														.equals(outFlowToFlow)) {
																																																													if (!outFlow
																																																															.equals(process)) {
																																																														if (!outFlow
																																																																.equals(outFlowToNormalStep)) {
																																																															if (!outFlow
																																																																	.equals(processToActor)) {
																																																																if (!exclusiveGatewayToNormalStep
																																																																		.equals(inFlow)) {
																																																																	if (!exclusiveGatewayToNormalStep
																																																																			.equals(prevStep)) {
																																																																		if (!exclusiveGatewayToNormalStep
																																																																				.equals(inFlowToPrevStep)) {
																																																																			if (!exclusiveGatewayToNormalStep
																																																																					.equals(normalStep)) {
																																																																				if (!exclusiveGatewayToNormalStep
																																																																						.equals(outFlowToFlow)) {
																																																																					if (!exclusiveGatewayToNormalStep
																																																																							.equals(inFlowToFlow)) {
																																																																						if (!exclusiveGatewayToNormalStep
																																																																								.equals(process)) {
																																																																							if (!exclusiveGatewayToNormalStep
																																																																									.equals(outFlow)) {
																																																																								if (!exclusiveGatewayToNormalStep
																																																																										.equals(outFlowToNormalStep)) {
																																																																									if (!exclusiveGatewayToNormalStep
																																																																											.equals(flow)) {
																																																																										if (!exclusiveGatewayToNormalStep
																																																																												.equals(processToActor)) {
																																																																											if (!exclusiveGatewayToNormalStep
																																																																													.equals(lane)) {
																																																																												if (!exclusiveGatewayToNormalStep
																																																																														.equals(laneSet)) {
																																																																													if (!outFlowToNormalStep
																																																																															.equals(prevStep)) {
																																																																														if (!outFlowToNormalStep
																																																																																.equals(process)) {
																																																																															if (!outFlowToNormalStep
																																																																																	.equals(processToActor)) {
																																																																																if (!flow
																																																																																		.equals(inFlow)) {
																																																																																	if (!flow
																																																																																			.equals(prevStep)) {
																																																																																		if (!flow
																																																																																				.equals(inFlowToPrevStep)) {
																																																																																			if (!flow
																																																																																					.equals(normalStep)) {
																																																																																				if (!flow
																																																																																						.equals(outFlowToFlow)) {
																																																																																					if (!flow
																																																																																							.equals(inFlowToFlow)) {
																																																																																						if (!flow
																																																																																								.equals(process)) {
																																																																																							if (!flow
																																																																																									.equals(outFlow)) {
																																																																																								if (!flow
																																																																																										.equals(outFlowToNormalStep)) {
																																																																																									if (!flow
																																																																																											.equals(processToActor)) {
																																																																																										if (!flow
																																																																																												.equals(lane)) {
																																																																																											if (!flow
																																																																																													.equals(laneSet)) {
																																																																																												if (!actor
																																																																																														.equals(inFlow)) {
																																																																																													if (!actor
																																																																																															.equals(prevStep)) {
																																																																																														if (!actor
																																																																																																.equals(inFlowToPrevStep)) {
																																																																																															if (!actor
																																																																																																	.equals(normalStep)) {
																																																																																																if (!actor
																																																																																																		.equals(outFlowToFlow)) {
																																																																																																	if (!actor
																																																																																																			.equals(inFlowToFlow)) {
																																																																																																		if (!actor
																																																																																																				.equals(process)) {
																																																																																																			if (!actor
																																																																																																					.equals(exclusiveGateway)) {
																																																																																																				if (!actor
																																																																																																						.equals(outFlow)) {
																																																																																																					if (!actor
																																																																																																							.equals(exclusiveGatewayToNormalStep)) {
																																																																																																						if (!actor
																																																																																																								.equals(outFlowToNormalStep)) {
																																																																																																							if (!actor
																																																																																																									.equals(flow)) {
																																																																																																								if (!actor
																																																																																																										.equals(processToActor)) {
																																																																																																									if (!actor
																																																																																																											.equals(lane)) {
																																																																																																										if (!actor
																																																																																																												.equals(laneSet)) {
																																																																																																											if (!lane
																																																																																																													.equals(prevStep)) {
																																																																																																												if (!lane
																																																																																																														.equals(normalStep)) {
																																																																																																													if (!lane
																																																																																																															.equals(outFlowToFlow)) {
																																																																																																														if (!lane
																																																																																																																.equals(process)) {
																																																																																																															if (!lane
																																																																																																																	.equals(outFlow)) {
																																																																																																																if (!lane
																																																																																																																		.equals(outFlowToNormalStep)) {
																																																																																																																	if (!lane
																																																																																																																			.equals(processToActor)) {
																																																																																																																		if (!lane
																																																																																																																				.equals(laneSet)) {
																																																																																																																			if (!laneSet
																																																																																																																					.equals(prevStep)) {
																																																																																																																				if (!laneSet
																																																																																																																						.equals(normalStep)) {
																																																																																																																					if (!laneSet
																																																																																																																							.equals(outFlowToFlow)) {
																																																																																																																						if (!laneSet
																																																																																																																								.equals(process)) {
																																																																																																																							if (!laneSet
																																																																																																																									.equals(outFlow)) {
																																																																																																																								if (!laneSet
																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(processToActor)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												inFlow,
																																																																																																																												prevStep,
																																																																																																																												inFlowToPrevStep,
																																																																																																																												normalStep,
																																																																																																																												outFlowToFlow,
																																																																																																																												inFlowToFlow,
																																																																																																																												process,
																																																																																																																												exclusiveGateway,
																																																																																																																												outFlow,
																																																																																																																												exclusiveGatewayToNormalStep,
																																																																																																																												outFlowToNormalStep,
																																																																																																																												flow,
																																																																																																																												actor,
																																																																																																																												processToActor,
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

	public static final Object[] pattern_ExclusiveGatewayToStepRule_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject normalStep, EObject outFlowToFlow, EObject process,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExclusiveGatewayToStepRule";
		String prevStep__normalStep____next_name_prime = "next";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(prevStep__normalStep____next);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(normalStep__actor____actor);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				exclusiveGateway__outFlow____default);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__normalStep____target);
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
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		ruleresult.getTranslatedEdges().add(
				lane__exclusiveGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, prevStep, normalStep,
				outFlowToFlow, process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				lane, prevStep__normalStep____next, normalStep__actor____actor,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final void pattern_ExclusiveGatewayToStepRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, outFlowToFlow, inFlowToFlow,
				process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExclusiveGatewayToStepRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_1_blackFBB(
			EClass eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_2_1_binding = pattern_ExclusiveGatewayToStepRule_2_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_2_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_2_1_black = pattern_ExclusiveGatewayToStepRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExclusiveGatewayToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("inFlow");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("exclusiveGateway");
		EObject _localVariable_3 = match.getObject("outFlow");
		EObject _localVariable_4 = match.getObject("lane");
		EObject _localVariable_5 = match.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpExclusiveGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpLane = _localVariable_4;
		EObject tmpLaneSet = _localVariable_5;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpExclusiveGateway instanceof ExclusiveGateway) {
					ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpLane instanceof Lane) {
							Lane lane = (Lane) tmpLane;
							if (tmpLaneSet instanceof LaneSet) {
								LaneSet laneSet = (LaneSet) tmpLaneSet;
								return new Object[] { inFlow, process,
										exclusiveGateway, outFlow, lane,
										laneSet, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_2_2_blackBFFFBBBFFFBBB(
			SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			for (SequenceFlowToStep inFlowToPrevStep : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(inFlow,
							SequenceFlowToStep.class, "source")) {
				Step prevStep = inFlowToPrevStep.getTarget();
				if (prevStep != null) {
					for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(inFlow,
									SequenceFlowToUCFlow.class, "source")) {
						Flow flow = inFlowToFlow.getTarget();
						if (flow != null) {
							for (ProcessToActor processToActor : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(process,
											ProcessToActor.class, "source")) {
								Actor actor = processToActor.getTarget();
								if (actor != null) {
									_result.add(new Object[] { inFlow,
											prevStep, inFlowToPrevStep,
											inFlowToFlow, process,
											exclusiveGateway, outFlow, flow,
											actor, processToActor, lane,
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

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_2_3_blackBBBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (inFlow.equals(inFlowToPrevStep.getSource())) {
				if (prevStep.equals(inFlowToPrevStep.getTarget())) {
					if (inFlow.equals(inFlowToFlow.getSource())) {
						if (flow.equals(inFlowToFlow.getTarget())) {
							if (process.getLaneSets().contains(laneSet)) {
								if (process.getFlowElements().contains(inFlow)) {
									if (process.getFlowElements().contains(
											exclusiveGateway)) {
										if (process.getFlowElements().contains(
												outFlow)) {
											if (exclusiveGateway.equals(inFlow
													.getTargetRef())) {
												if (exclusiveGateway
														.equals(outFlow
																.getSourceRef())) {
													if (outFlow
															.equals(exclusiveGateway
																	.getDefault())) {
														if (process
																.equals(processToActor
																		.getSource())) {
															if (actor
																	.equals(processToActor
																			.getTarget())) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	if (laneSet
																			.getLanes()
																			.contains(
																					lane)) {
																		_result.add(new Object[] {
																				inFlow,
																				prevStep,
																				inFlowToPrevStep,
																				inFlowToFlow,
																				process,
																				exclusiveGateway,
																				outFlow,
																				flow,
																				actor,
																				processToActor,
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

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
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
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__outFlow____default);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__exclusiveGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, inFlowToFlow,
				process, exclusiveGateway, outFlow, flow, actor,
				processToActor, lane, laneSet, isApplicableMatch,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				processToActor__process____source,
				processToActor__actor____target,
				lane__exclusiveGateway____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_4_bindingFBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				inFlowToFlow, process, exclusiveGateway, outFlow, flow, actor,
				processToActor, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, inFlowToFlow, process,
					exclusiveGateway, outFlow, flow, actor, processToActor,
					lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_2_4_binding = pattern_ExclusiveGatewayToStepRule_2_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				inFlowToFlow, process, exclusiveGateway, outFlow, flow, actor,
				processToActor, lane, laneSet);
		if (result_pattern_ExclusiveGatewayToStepRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_2_4_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_2_4_black = pattern_ExclusiveGatewayToStepRule_2_4_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, inFlowToFlow, process,
						exclusiveGateway, outFlow, flow, actor, processToActor,
						lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_2_5_expressionFBB(
			ExclusiveGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExclusiveGatewayToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExclusiveGatewayToStepRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_1_blackBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { _this, match, prevStep, normalStep, flow,
					actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_2_bindingFBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				prevStep, normalStep, flow, actor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, normalStep,
					flow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_2_bindingAndBlackFBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_10_2_binding = pattern_ExclusiveGatewayToStepRule_10_2_bindingFBBBBBB(
				_this, match, prevStep, normalStep, flow, actor);
		if (result_pattern_ExclusiveGatewayToStepRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_10_2_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_10_2_black = pattern_ExclusiveGatewayToStepRule_10_2_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepRule_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, normalStep,
						flow, actor };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_10_3_expressionFBB(
			ExclusiveGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_4_blackBBBBB(
			Match match, Step prevStep, NormalStep normalStep, Flow flow,
			Actor actor) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, prevStep, normalStep, flow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_4_greenBBBBBFFF(
			Match match, Step prevStep, NormalStep normalStep, Flow flow,
			Actor actor) {
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
		return new Object[] { match, prevStep, normalStep, flow, actor,
				prevStep__normalStep____next, normalStep__actor____actor,
				flow__normalStep____steps };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_5_blackBBBBB(
			Match match, Step prevStep, NormalStep normalStep, Flow flow,
			Actor actor) {
		if (!normalStep.equals(prevStep)) {
			return new Object[] { match, prevStep, normalStep, flow, actor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_10_5_greenBBBB(
			Match match, Step prevStep, Flow flow, Actor actor) {
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(actor);
		return new Object[] { match, prevStep, flow, actor };
	}

	public static final void pattern_ExclusiveGatewayToStepRule_10_6_expressionBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		_this.registerObjectsToMatch_BWD(match, prevStep, normalStep, flow,
				actor);

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("inFlowToPrevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject _localVariable_7 = isApplicableMatch.getObject("actor");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("processToActor");
		EObject _localVariable_9 = isApplicableMatch.getObject("lane");
		EObject _localVariable_10 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpInFlowToPrevStep = _localVariable_2;
		EObject tmpNormalStep = _localVariable_3;
		EObject tmpInFlowToFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpActor = _localVariable_7;
		EObject tmpProcessToActor = _localVariable_8;
		EObject tmpLane = _localVariable_9;
		EObject tmpLaneSet = _localVariable_10;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpInFlowToPrevStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) tmpInFlowToPrevStep;
					if (tmpNormalStep instanceof NormalStep) {
						NormalStep normalStep = (NormalStep) tmpNormalStep;
						if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
							SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
							if (tmpProcess instanceof bpmn2.Process) {
								bpmn2.Process process = (bpmn2.Process) tmpProcess;
								if (tmpFlow instanceof Flow) {
									Flow flow = (Flow) tmpFlow;
									if (tmpActor instanceof Actor) {
										Actor actor = (Actor) tmpActor;
										if (tmpProcessToActor instanceof ProcessToActor) {
											ProcessToActor processToActor = (ProcessToActor) tmpProcessToActor;
											if (tmpLane instanceof Lane) {
												Lane lane = (Lane) tmpLane;
												if (tmpLaneSet instanceof LaneSet) {
													LaneSet laneSet = (LaneSet) tmpLaneSet;
													return new Object[] {
															inFlow, prevStep,
															inFlowToPrevStep,
															normalStep,
															inFlowToFlow,
															process, flow,
															actor,
															processToActor,
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
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_1_blackBBBBBBBBBBBFBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!normalStep.equals(prevStep)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { inFlow, prevStep, inFlowToPrevStep,
							normalStep, inFlowToFlow, process, flow, actor,
							processToActor, lane, laneSet, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_11_1_binding = pattern_ExclusiveGatewayToStepRule_11_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExclusiveGatewayToStepRule_11_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[0];
			Step prevStep = (Step) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[1];
			SequenceFlowToStep inFlowToPrevStep = (SequenceFlowToStep) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[2];
			NormalStep normalStep = (NormalStep) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[4];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[5];
			Flow flow = (Flow) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[6];
			Actor actor = (Actor) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[7];
			ProcessToActor processToActor = (ProcessToActor) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[8];
			Lane lane = (Lane) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[9];
			LaneSet laneSet = (LaneSet) result_pattern_ExclusiveGatewayToStepRule_11_1_binding[10];

			Object[] result_pattern_ExclusiveGatewayToStepRule_11_1_black = pattern_ExclusiveGatewayToStepRule_11_1_blackBBBBBBBBBBBFBB(
					inFlow, prevStep, inFlowToPrevStep, normalStep,
					inFlowToFlow, process, flow, actor, processToActor, lane,
					laneSet, _this, isApplicableMatch);
			if (result_pattern_ExclusiveGatewayToStepRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_11_1_black[11];

				return new Object[] { inFlow, prevStep, inFlowToPrevStep,
						normalStep, inFlowToFlow, process, flow, actor,
						processToActor, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_1_greenBBFBFFFFBBB(
			SequenceFlow inFlow, NormalStep normalStep, bpmn2.Process process,
			Flow flow, Lane lane, CSP csp) {
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		ExclusiveGateway exclusiveGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("exclusiveGateway", "id");
		Object _localVariable_1 = csp.getValue("exclusiveGateway", "name");
		Object _localVariable_2 = csp.getValue("exclusiveGateway",
				"gatewayDirection");
		outFlowToFlow.setTarget(flow);
		process.getFlowElements().add(exclusiveGateway);
		inFlow.setTargetRef(exclusiveGateway);
		lane.getFlowNodeRefs().add(exclusiveGateway);
		outFlowToFlow.setSource(outFlow);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		exclusiveGateway.setDefault(outFlow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		String exclusiveGateway_id_prime = (String) _localVariable_0;
		String exclusiveGateway_name_prime = (String) _localVariable_1;
		GatewayDirection exclusiveGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_2;
		exclusiveGateway.setId(exclusiveGateway_id_prime);
		exclusiveGateway.setName(exclusiveGateway_name_prime);
		exclusiveGateway
				.setGatewayDirection(exclusiveGateway_gatewayDirection_prime);
		return new Object[] { inFlow, normalStep, outFlowToFlow, process,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep, flow, lane, csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_2_blackBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { normalStep, outFlowToFlow, exclusiveGateway,
				outFlow, exclusiveGatewayToNormalStep, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_2_greenFBBBBBB(
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(normalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToFlow);
		ruleresult.getCreatedElements().add(exclusiveGateway);
		ruleresult.getCreatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(exclusiveGatewayToNormalStep);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, normalStep, outFlowToFlow,
				exclusiveGateway, outFlow, exclusiveGatewayToNormalStep,
				outFlowToNormalStep };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject inFlowToPrevStep, EObject normalStep,
			EObject outFlowToFlow, EObject inFlowToFlow, EObject process,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		if (!inFlow.equals(prevStep)) {
			if (!inFlow.equals(inFlowToPrevStep)) {
				if (!inFlow.equals(normalStep)) {
					if (!inFlow.equals(outFlowToFlow)) {
						if (!inFlow.equals(inFlowToFlow)) {
							if (!inFlow.equals(process)) {
								if (!inFlow.equals(outFlow)) {
									if (!inFlow.equals(outFlowToNormalStep)) {
										if (!inFlow.equals(processToActor)) {
											if (!inFlow.equals(lane)) {
												if (!inFlow.equals(laneSet)) {
													if (!prevStep
															.equals(process)) {
														if (!prevStep
																.equals(processToActor)) {
															if (!inFlowToPrevStep
																	.equals(prevStep)) {
																if (!inFlowToPrevStep
																		.equals(normalStep)) {
																	if (!inFlowToPrevStep
																			.equals(outFlowToFlow)) {
																		if (!inFlowToPrevStep
																				.equals(process)) {
																			if (!inFlowToPrevStep
																					.equals(outFlow)) {
																				if (!inFlowToPrevStep
																						.equals(outFlowToNormalStep)) {
																					if (!inFlowToPrevStep
																							.equals(processToActor)) {
																						if (!inFlowToPrevStep
																								.equals(lane)) {
																							if (!inFlowToPrevStep
																									.equals(laneSet)) {
																								if (!normalStep
																										.equals(prevStep)) {
																									if (!normalStep
																											.equals(outFlowToFlow)) {
																										if (!normalStep
																												.equals(process)) {
																											if (!normalStep
																													.equals(outFlow)) {
																												if (!normalStep
																														.equals(outFlowToNormalStep)) {
																													if (!normalStep
																															.equals(processToActor)) {
																														if (!outFlowToFlow
																																.equals(prevStep)) {
																															if (!outFlowToFlow
																																	.equals(process)) {
																																if (!outFlowToFlow
																																		.equals(outFlowToNormalStep)) {
																																	if (!outFlowToFlow
																																			.equals(processToActor)) {
																																		if (!inFlowToFlow
																																				.equals(prevStep)) {
																																			if (!inFlowToFlow
																																					.equals(inFlowToPrevStep)) {
																																				if (!inFlowToFlow
																																						.equals(normalStep)) {
																																					if (!inFlowToFlow
																																							.equals(outFlowToFlow)) {
																																						if (!inFlowToFlow
																																								.equals(process)) {
																																							if (!inFlowToFlow
																																									.equals(outFlow)) {
																																								if (!inFlowToFlow
																																										.equals(outFlowToNormalStep)) {
																																									if (!inFlowToFlow
																																											.equals(processToActor)) {
																																										if (!inFlowToFlow
																																												.equals(lane)) {
																																											if (!inFlowToFlow
																																													.equals(laneSet)) {
																																												if (!process
																																														.equals(processToActor)) {
																																													if (!exclusiveGateway
																																															.equals(inFlow)) {
																																														if (!exclusiveGateway
																																																.equals(prevStep)) {
																																															if (!exclusiveGateway
																																																	.equals(inFlowToPrevStep)) {
																																																if (!exclusiveGateway
																																																		.equals(normalStep)) {
																																																	if (!exclusiveGateway
																																																			.equals(outFlowToFlow)) {
																																																		if (!exclusiveGateway
																																																				.equals(inFlowToFlow)) {
																																																			if (!exclusiveGateway
																																																					.equals(process)) {
																																																				if (!exclusiveGateway
																																																						.equals(outFlow)) {
																																																					if (!exclusiveGateway
																																																							.equals(exclusiveGatewayToNormalStep)) {
																																																						if (!exclusiveGateway
																																																								.equals(outFlowToNormalStep)) {
																																																							if (!exclusiveGateway
																																																									.equals(flow)) {
																																																								if (!exclusiveGateway
																																																										.equals(processToActor)) {
																																																									if (!exclusiveGateway
																																																											.equals(lane)) {
																																																										if (!exclusiveGateway
																																																												.equals(laneSet)) {
																																																											if (!outFlow
																																																													.equals(prevStep)) {
																																																												if (!outFlow
																																																														.equals(outFlowToFlow)) {
																																																													if (!outFlow
																																																															.equals(process)) {
																																																														if (!outFlow
																																																																.equals(outFlowToNormalStep)) {
																																																															if (!outFlow
																																																																	.equals(processToActor)) {
																																																																if (!exclusiveGatewayToNormalStep
																																																																		.equals(inFlow)) {
																																																																	if (!exclusiveGatewayToNormalStep
																																																																			.equals(prevStep)) {
																																																																		if (!exclusiveGatewayToNormalStep
																																																																				.equals(inFlowToPrevStep)) {
																																																																			if (!exclusiveGatewayToNormalStep
																																																																					.equals(normalStep)) {
																																																																				if (!exclusiveGatewayToNormalStep
																																																																						.equals(outFlowToFlow)) {
																																																																					if (!exclusiveGatewayToNormalStep
																																																																							.equals(inFlowToFlow)) {
																																																																						if (!exclusiveGatewayToNormalStep
																																																																								.equals(process)) {
																																																																							if (!exclusiveGatewayToNormalStep
																																																																									.equals(outFlow)) {
																																																																								if (!exclusiveGatewayToNormalStep
																																																																										.equals(outFlowToNormalStep)) {
																																																																									if (!exclusiveGatewayToNormalStep
																																																																											.equals(flow)) {
																																																																										if (!exclusiveGatewayToNormalStep
																																																																												.equals(processToActor)) {
																																																																											if (!exclusiveGatewayToNormalStep
																																																																													.equals(lane)) {
																																																																												if (!exclusiveGatewayToNormalStep
																																																																														.equals(laneSet)) {
																																																																													if (!outFlowToNormalStep
																																																																															.equals(prevStep)) {
																																																																														if (!outFlowToNormalStep
																																																																																.equals(process)) {
																																																																															if (!outFlowToNormalStep
																																																																																	.equals(processToActor)) {
																																																																																if (!flow
																																																																																		.equals(inFlow)) {
																																																																																	if (!flow
																																																																																			.equals(prevStep)) {
																																																																																		if (!flow
																																																																																				.equals(inFlowToPrevStep)) {
																																																																																			if (!flow
																																																																																					.equals(normalStep)) {
																																																																																				if (!flow
																																																																																						.equals(outFlowToFlow)) {
																																																																																					if (!flow
																																																																																							.equals(inFlowToFlow)) {
																																																																																						if (!flow
																																																																																								.equals(process)) {
																																																																																							if (!flow
																																																																																									.equals(outFlow)) {
																																																																																								if (!flow
																																																																																										.equals(outFlowToNormalStep)) {
																																																																																									if (!flow
																																																																																											.equals(processToActor)) {
																																																																																										if (!flow
																																																																																												.equals(lane)) {
																																																																																											if (!flow
																																																																																													.equals(laneSet)) {
																																																																																												if (!actor
																																																																																														.equals(inFlow)) {
																																																																																													if (!actor
																																																																																															.equals(prevStep)) {
																																																																																														if (!actor
																																																																																																.equals(inFlowToPrevStep)) {
																																																																																															if (!actor
																																																																																																	.equals(normalStep)) {
																																																																																																if (!actor
																																																																																																		.equals(outFlowToFlow)) {
																																																																																																	if (!actor
																																																																																																			.equals(inFlowToFlow)) {
																																																																																																		if (!actor
																																																																																																				.equals(process)) {
																																																																																																			if (!actor
																																																																																																					.equals(exclusiveGateway)) {
																																																																																																				if (!actor
																																																																																																						.equals(outFlow)) {
																																																																																																					if (!actor
																																																																																																							.equals(exclusiveGatewayToNormalStep)) {
																																																																																																						if (!actor
																																																																																																								.equals(outFlowToNormalStep)) {
																																																																																																							if (!actor
																																																																																																									.equals(flow)) {
																																																																																																								if (!actor
																																																																																																										.equals(processToActor)) {
																																																																																																									if (!actor
																																																																																																											.equals(lane)) {
																																																																																																										if (!actor
																																																																																																												.equals(laneSet)) {
																																																																																																											if (!lane
																																																																																																													.equals(prevStep)) {
																																																																																																												if (!lane
																																																																																																														.equals(normalStep)) {
																																																																																																													if (!lane
																																																																																																															.equals(outFlowToFlow)) {
																																																																																																														if (!lane
																																																																																																																.equals(process)) {
																																																																																																															if (!lane
																																																																																																																	.equals(outFlow)) {
																																																																																																																if (!lane
																																																																																																																		.equals(outFlowToNormalStep)) {
																																																																																																																	if (!lane
																																																																																																																			.equals(processToActor)) {
																																																																																																																		if (!lane
																																																																																																																				.equals(laneSet)) {
																																																																																																																			if (!laneSet
																																																																																																																					.equals(prevStep)) {
																																																																																																																				if (!laneSet
																																																																																																																						.equals(normalStep)) {
																																																																																																																					if (!laneSet
																																																																																																																							.equals(outFlowToFlow)) {
																																																																																																																						if (!laneSet
																																																																																																																								.equals(process)) {
																																																																																																																							if (!laneSet
																																																																																																																									.equals(outFlow)) {
																																																																																																																								if (!laneSet
																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																									if (!laneSet
																																																																																																																											.equals(processToActor)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												inFlow,
																																																																																																																												prevStep,
																																																																																																																												inFlowToPrevStep,
																																																																																																																												normalStep,
																																																																																																																												outFlowToFlow,
																																																																																																																												inFlowToFlow,
																																																																																																																												process,
																																																																																																																												exclusiveGateway,
																																																																																																																												outFlow,
																																																																																																																												exclusiveGatewayToNormalStep,
																																																																																																																												outFlowToNormalStep,
																																																																																																																												flow,
																																																																																																																												actor,
																																																																																																																												processToActor,
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

	public static final Object[] pattern_ExclusiveGatewayToStepRule_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject prevStep,
			EObject normalStep, EObject outFlowToFlow, EObject process,
			EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject lane) {
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exclusiveGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__outFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGatewayToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exclusiveGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExclusiveGatewayToStepRule";
		String prevStep__normalStep____next_name_prime = "next";
		String normalStep__actor____actor_name_prime = "actor";
		String outFlowToFlow__outFlow____source_name_prime = "source";
		String outFlowToFlow__flow____target_name_prime = "target";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__exclusiveGateway____targetRef_name_prime = "targetRef";
		String exclusiveGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__outFlow____outgoing_name_prime = "outgoing";
		String exclusiveGateway__outFlow____default_name_prime = "default";
		String exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime = "source";
		String exclusiveGatewayToNormalStep__normalStep____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String lane__exclusiveGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		prevStep__normalStep____next.setSrc(prevStep);
		prevStep__normalStep____next.setTrg(normalStep);
		ruleresult.getTranslatedEdges().add(prevStep__normalStep____next);
		normalStep__actor____actor.setSrc(normalStep);
		normalStep__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(normalStep__actor____actor);
		outFlowToFlow__outFlow____source.setSrc(outFlowToFlow);
		outFlowToFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__outFlow____source);
		outFlowToFlow__flow____target.setSrc(outFlowToFlow);
		outFlowToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(outFlowToFlow__flow____target);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				process__exclusiveGateway____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		inFlow__exclusiveGateway____targetRef.setSrc(inFlow);
		inFlow__exclusiveGateway____targetRef.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(inFlow__exclusiveGateway____targetRef);
		exclusiveGateway__inFlow____incoming.setSrc(exclusiveGateway);
		exclusiveGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__inFlow____incoming);
		outFlow__exclusiveGateway____sourceRef.setSrc(outFlow);
		outFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges()
				.add(outFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__outFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__outFlow____outgoing);
		exclusiveGateway__outFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__outFlow____default.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(exclusiveGateway__outFlow____default);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__exclusiveGateway____source);
		exclusiveGatewayToNormalStep__normalStep____target
				.setSrc(exclusiveGatewayToNormalStep);
		exclusiveGatewayToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				exclusiveGatewayToNormalStep__normalStep____target);
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
		lane__exclusiveGateway____flowNodeRefs.setSrc(lane);
		lane__exclusiveGateway____flowNodeRefs.setTrg(exclusiveGateway);
		ruleresult.getCreatedEdges()
				.add(lane__exclusiveGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		outFlowToFlow__outFlow____source
				.setName(outFlowToFlow__outFlow____source_name_prime);
		outFlowToFlow__flow____target
				.setName(outFlowToFlow__flow____target_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__exclusiveGateway____targetRef
				.setName(inFlow__exclusiveGateway____targetRef_name_prime);
		exclusiveGateway__inFlow____incoming
				.setName(exclusiveGateway__inFlow____incoming_name_prime);
		outFlow__exclusiveGateway____sourceRef
				.setName(outFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__outFlow____outgoing
				.setName(exclusiveGateway__outFlow____outgoing_name_prime);
		exclusiveGateway__outFlow____default
				.setName(exclusiveGateway__outFlow____default_name_prime);
		exclusiveGatewayToNormalStep__exclusiveGateway____source
				.setName(exclusiveGatewayToNormalStep__exclusiveGateway____source_name_prime);
		exclusiveGatewayToNormalStep__normalStep____target
				.setName(exclusiveGatewayToNormalStep__normalStep____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		lane__exclusiveGateway____flowNodeRefs
				.setName(lane__exclusiveGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, prevStep, normalStep,
				outFlowToFlow, process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				lane, prevStep__normalStep____next, normalStep__actor____actor,
				outFlowToFlow__outFlow____source,
				outFlowToFlow__flow____target,
				process__exclusiveGateway____flowElements,
				process__outFlow____flowElements,
				inFlow__exclusiveGateway____targetRef,
				exclusiveGateway__inFlow____incoming,
				outFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__outFlow____outgoing,
				exclusiveGateway__outFlow____default,
				exclusiveGatewayToNormalStep__exclusiveGateway____source,
				exclusiveGatewayToNormalStep__normalStep____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				flow__normalStep____steps,
				lane__exclusiveGateway____flowNodeRefs };
	}

	public static final void pattern_ExclusiveGatewayToStepRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor, EObject lane,
			EObject laneSet) {
		_this.registerObjects_BWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, outFlowToFlow, inFlowToFlow,
				process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExclusiveGatewayToStepRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_1_blackFBB(
			EClass eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_12_1_binding = pattern_ExclusiveGatewayToStepRule_12_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_12_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_12_1_black = pattern_ExclusiveGatewayToStepRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExclusiveGatewayToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("normalStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("actor");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpNormalStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpActor = _localVariable_3;
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			if (tmpNormalStep instanceof NormalStep) {
				NormalStep normalStep = (NormalStep) tmpNormalStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpActor instanceof Actor) {
						Actor actor = (Actor) tmpActor;
						return new Object[] { prevStep, normalStep, flow,
								actor, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_12_2_blackFBFBFFBBFB(
			Step prevStep, NormalStep normalStep, Flow flow, Actor actor,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			for (SequenceFlowToStep inFlowToPrevStep : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(prevStep,
							SequenceFlowToStep.class, "target")) {
				SequenceFlow inFlow = inFlowToPrevStep.getSource();
				if (inFlow != null) {
					for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									SequenceFlowToUCFlow.class, "target")) {
						if (inFlow.equals(inFlowToFlow.getSource())) {
							for (ProcessToActor processToActor : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											ProcessToActor.class, "target")) {
								bpmn2.Process process = processToActor
										.getSource();
								if (process != null) {
									_result.add(new Object[] { inFlow,
											prevStep, inFlowToPrevStep,
											normalStep, inFlowToFlow, process,
											flow, actor, processToActor, match });
								}

							}
						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_12_3_blackBBBBBBBBBFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!normalStep.equals(prevStep)) {
			if (normalStep.equals(prevStep.getNext())) {
				if (inFlow.equals(inFlowToPrevStep.getSource())) {
					if (prevStep.equals(inFlowToPrevStep.getTarget())) {
						if (actor.equals(normalStep.getActor())) {
							if (inFlow.equals(inFlowToFlow.getSource())) {
								if (flow.equals(inFlowToFlow.getTarget())) {
									if (process.getFlowElements().contains(
											inFlow)) {
										if (flow.getSteps()
												.contains(normalStep)) {
											if (process.equals(processToActor
													.getSource())) {
												if (actor.equals(processToActor
														.getTarget())) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														for (Lane lane : laneSet
																.getLanes()) {
															_result.add(new Object[] {
																	inFlow,
																	prevStep,
																	inFlowToPrevStep,
																	normalStep,
																	inFlowToFlow,
																	process,
																	flow,
																	actor,
																	processToActor,
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
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge prevStep__normalStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToPrevStep__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToActor__actor____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String prevStep__normalStep____next_name_prime = "next";
		String inFlowToPrevStep__inFlow____source_name_prime = "source";
		String inFlowToPrevStep__prevStep____target_name_prime = "target";
		String normalStep__actor____actor_name_prime = "actor";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String flow__normalStep____steps_name_prime = "steps";
		String processToActor__process____source_name_prime = "source";
		String processToActor__actor____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(inFlowToPrevStep);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(processToActor);
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
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements()
				.add(flow__normalStep____steps);
		processToActor__process____source.setSrc(processToActor);
		processToActor__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToActor__process____source);
		processToActor__actor____target.setSrc(processToActor);
		processToActor__actor____target.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				processToActor__actor____target);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		prevStep__normalStep____next
				.setName(prevStep__normalStep____next_name_prime);
		inFlowToPrevStep__inFlow____source
				.setName(inFlowToPrevStep__inFlow____source_name_prime);
		inFlowToPrevStep__prevStep____target
				.setName(inFlowToPrevStep__prevStep____target_name_prime);
		normalStep__actor____actor
				.setName(normalStep__actor____actor_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		processToActor__process____source
				.setName(processToActor__process____source_name_prime);
		processToActor__actor____target
				.setName(processToActor__actor____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, normalStep,
				inFlowToFlow, process, flow, actor, processToActor, lane,
				laneSet, isApplicableMatch, prevStep__normalStep____next,
				inFlowToPrevStep__inFlow____source,
				inFlowToPrevStep__prevStep____target,
				normalStep__actor____actor, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, process__laneSet____laneSets,
				process__inFlow____flowElements, flow__normalStep____steps,
				processToActor__process____source,
				processToActor__actor____target, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_4_bindingFBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				normalStep, inFlowToFlow, process, flow, actor, processToActor,
				lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, normalStep, inFlowToFlow,
					process, flow, actor, processToActor, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, Flow flow, Actor actor,
			ProcessToActor processToActor, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_12_4_binding = pattern_ExclusiveGatewayToStepRule_12_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				normalStep, inFlowToFlow, process, flow, actor, processToActor,
				lane, laneSet);
		if (result_pattern_ExclusiveGatewayToStepRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_12_4_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_12_4_black = pattern_ExclusiveGatewayToStepRule_12_4_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, normalStep, inFlowToFlow,
						process, flow, actor, processToActor, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_12_5_expressionFBB(
			ExclusiveGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExclusiveGatewayToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExclusiveGatewayToStepRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_20_1_binding = pattern_ExclusiveGatewayToStepRule_20_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_20_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_20_1_black = pattern_ExclusiveGatewayToStepRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_20_2_blackFFFFB(
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
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { prevStep,
										normalStep, flow, actor, _edge_next });
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_20_3_expressionFBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, flow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_20_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_21_1_binding = pattern_ExclusiveGatewayToStepRule_21_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_21_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_21_1_black = pattern_ExclusiveGatewayToStepRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_21_2_blackFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_actor.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(normalStep.getActor())) {
					for (Step prevStep : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(normalStep, Step.class,
									"next")) {
						if (!normalStep.equals(prevStep)) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											Flow.class, "steps")) {
								_result.add(new Object[] { prevStep,
										normalStep, flow, actor, _edge_actor });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_21_3_expressionFBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, flow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_21_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_22_1_binding = pattern_ExclusiveGatewayToStepRule_22_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_22_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_22_1_black = pattern_ExclusiveGatewayToStepRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_464748 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_464748)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_22_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpExclusiveGateway = _edge_flowElements.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (process.getFlowElements().contains(exclusiveGateway)) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (process.getFlowElements().contains(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepRule_22_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepRule_22_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (LaneSet laneSet : process
												.getLaneSets()) {
											for (FlowElement tmpInFlow : process
													.getFlowElements()) {
												if (tmpInFlow instanceof SequenceFlow) {
													SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
													if (!inFlow.equals(outFlow)) {
														if (exclusiveGateway
																.equals(inFlow
																		.getTargetRef())) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_22_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_22_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_23_1_binding = pattern_ExclusiveGatewayToStepRule_23_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_23_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_23_1_black = pattern_ExclusiveGatewayToStepRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_115455 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_115455)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_23_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpExclusiveGateway = outFlow.getSourceRef();
					if (tmpExclusiveGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
						if (process.getFlowElements()
								.contains(exclusiveGateway)) {
							if (outFlow.equals(exclusiveGateway.getDefault())) {
								if (pattern_ExclusiveGatewayToStepRule_23_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepRule_23_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (LaneSet laneSet : process
												.getLaneSets()) {
											for (FlowElement tmpInFlow : process
													.getFlowElements()) {
												if (tmpInFlow instanceof SequenceFlow) {
													SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
													if (!inFlow.equals(outFlow)) {
														if (exclusiveGateway
																.equals(inFlow
																		.getTargetRef())) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_23_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_23_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_24_1_binding = pattern_ExclusiveGatewayToStepRule_24_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_24_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_24_1_black = pattern_ExclusiveGatewayToStepRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_554184 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_554184)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_24_2_blackFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpExclusiveGateway = _edge_targetRef.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (exclusiveGateway.equals(inFlow.getTargetRef())) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (!inFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepRule_24_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepRule_24_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process
														.getFlowElements()
														.contains(
																exclusiveGateway)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_24_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_24_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_25_1_binding = pattern_ExclusiveGatewayToStepRule_25_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_25_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_25_1_black = pattern_ExclusiveGatewayToStepRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_590472 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_590472)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_25_2_blackFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_incoming.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (exclusiveGateway.equals(inFlow.getTargetRef())) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (!inFlow.equals(outFlow)) {
							if (exclusiveGateway.equals(outFlow.getSourceRef())) {
								if (pattern_ExclusiveGatewayToStepRule_25_2_black_nac_0BB(
										outFlow, exclusiveGateway) == null) {
									if (pattern_ExclusiveGatewayToStepRule_25_2_black_nac_1BB(
											outFlow, exclusiveGateway) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_25_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_25_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_26_1_binding = pattern_ExclusiveGatewayToStepRule_26_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_26_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_26_1_black = pattern_ExclusiveGatewayToStepRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_818836 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_818836)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_26_2_blackFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpExclusiveGateway = _edge_sourceRef.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepRule_26_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepRule_26_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														outFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(
																	exclusiveGateway)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_26_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_26_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_27_1_binding = pattern_ExclusiveGatewayToStepRule_27_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_27_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_27_1_black = pattern_ExclusiveGatewayToStepRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_786642 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_786642)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_27_2_blackFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_outgoing.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepRule_27_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepRule_27_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_27_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_27_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_28_1_binding = pattern_ExclusiveGatewayToStepRule_28_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_28_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_28_1_black = pattern_ExclusiveGatewayToStepRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_279634 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_279634)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_28_2_blackFFFFFFB(
			EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExclusiveGateway = _edge_default.getSrc();
		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
			EObject tmpOutFlow = _edge_default.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exclusiveGateway.equals(outFlow.getSourceRef())) {
					if (outFlow.equals(exclusiveGateway.getDefault())) {
						if (pattern_ExclusiveGatewayToStepRule_28_2_black_nac_0BB(
								outFlow, exclusiveGateway) == null) {
							if (pattern_ExclusiveGatewayToStepRule_28_2_black_nac_1BB(
									outFlow, exclusiveGateway) == null) {
								for (SequenceFlow inFlow : exclusiveGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exclusiveGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (LaneSet laneSet : process
																.getLaneSets()) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (lane.getFlowNodeRefs()
																		.contains(
																				exclusiveGateway)) {
																	_result.add(new Object[] {
																			inFlow,
																			process,
																			exclusiveGateway,
																			outFlow,
																			lane,
																			laneSet,
																			_edge_default });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_28_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_28_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_29_1_binding = pattern_ExclusiveGatewayToStepRule_29_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_29_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_29_1_black = pattern_ExclusiveGatewayToStepRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_29_2_blackFFFFB(
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
						for (Step prevStep : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(normalStep,
										Step.class, "next")) {
							if (!normalStep.equals(prevStep)) {
								_result.add(new Object[] { prevStep,
										normalStep, flow, actor, _edge_steps });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_29_3_expressionFBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				normalStep, flow, actor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_29_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_1_bindingFB(
			ExclusiveGatewayToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_1_blackFBB(
			EClass __eClass, ExclusiveGatewayToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_1_bindingAndBlackFFB(
			ExclusiveGatewayToStepRule _this) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_30_1_binding = pattern_ExclusiveGatewayToStepRule_30_1_bindingFB(_this);
		if (result_pattern_ExclusiveGatewayToStepRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExclusiveGatewayToStepRule_30_1_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_30_1_black = pattern_ExclusiveGatewayToStepRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExclusiveGatewayToStepRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExclusiveGatewayToStepRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_2_black_nac_0BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_574383 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exclusiveGateway.equals(__DEC_outFlow_default_574383)) {
				return new Object[] { outFlow, exclusiveGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway) {
		if (exclusiveGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exclusiveGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_30_2_blackFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpExclusiveGateway = _edge_flowNodeRefs.getTrg();
			if (tmpExclusiveGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
				if (lane.getFlowNodeRefs().contains(exclusiveGateway)) {
					SequenceFlow outFlow = exclusiveGateway.getDefault();
					if (outFlow != null) {
						if (exclusiveGateway.equals(outFlow.getSourceRef())) {
							if (pattern_ExclusiveGatewayToStepRule_30_2_black_nac_0BB(
									outFlow, exclusiveGateway) == null) {
								if (pattern_ExclusiveGatewayToStepRule_30_2_black_nac_1BB(
										outFlow, exclusiveGateway) == null) {
									for (SequenceFlow inFlow : exclusiveGateway
											.getIncoming()) {
										if (!inFlow.equals(outFlow)) {
											for (LaneSet laneSet : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															lane,
															LaneSet.class,
															"lanes")) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																exclusiveGateway,
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
																			inFlow,
																			process,
																			exclusiveGateway,
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

		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_30_3_expressionFBBBBBBBB(
			ExclusiveGatewayToStepRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, exclusiveGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_30_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExclusiveGatewayToStepRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_1_blackB(
			ExclusiveGatewayToStepRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToStep inFlowToPrevStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToPrevStep)) {
			return new Object[] { ruleResult, inFlowToPrevStep };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, ProcessToActor processToActor) {
		if (ruleResult.getCorrObjects().contains(processToActor)) {
			return new Object[] { ruleResult, processToActor };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getTargetObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExclusiveGatewayToStepRule_33_2_blackFFFFFFFFFFFBB(
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
							if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_1BB(
									ruleResult, inFlowToPrevStep) == null) {
								if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_0BB(
										ruleResult, inFlow) == null) {
									if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_2BB(
											ruleResult, prevStep) == null) {
										for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														SequenceFlowToUCFlow.class,
														"source")) {
											Flow flow = inFlowToFlow
													.getTarget();
											if (flow != null) {
												if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_3BB(
														ruleResult,
														inFlowToFlow) == null) {
													if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_4BB(
															ruleResult, flow) == null) {
														for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		inFlow,
																		FlowElementsContainer.class,
																		"flowElements")) {
															if (tmpProcess instanceof bpmn2.Process) {
																bpmn2.Process process = (bpmn2.Process) tmpProcess;
																if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_5BB(
																		ruleResult,
																		process) == null) {
																	for (LaneSet laneSet : process
																			.getLaneSets()) {
																		if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_6BB(
																				ruleResult,
																				laneSet) == null) {
																			for (Lane lane : laneSet
																					.getLanes()) {
																				if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_7BB(
																						ruleResult,
																						lane) == null) {
																					for (ProcessToActor processToActor : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									process,
																									ProcessToActor.class,
																									"source")) {
																						Actor actor = processToActor
																								.getTarget();
																						if (actor != null) {
																							if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_8BB(
																									ruleResult,
																									processToActor) == null) {
																								if (pattern_ExclusiveGatewayToStepRule_33_2_black_nac_9BB(
																										ruleResult,
																										actor) == null) {
																									_result.add(new Object[] {
																											inFlowToPrevStepList,
																											inFlow,
																											inFlowToPrevStep,
																											prevStep,
																											inFlowToFlow,
																											flow,
																											process,
																											laneSet,
																											lane,
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
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_3_bindingFBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				inFlowToFlow, process, flow, actor, processToActor, lane,
				laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					prevStep, inFlowToPrevStep, inFlowToFlow, process, flow,
					actor, processToActor, lane, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_3_bindingAndBlackFBBBBBBBBBBBBB(
			ExclusiveGatewayToStepRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step prevStep, SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ExclusiveGatewayToStepRule_33_3_binding = pattern_ExclusiveGatewayToStepRule_33_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, prevStep, inFlowToPrevStep,
				inFlowToFlow, process, flow, actor, processToActor, lane,
				laneSet, ruleResult);
		if (result_pattern_ExclusiveGatewayToStepRule_33_3_binding != null) {
			CSP csp = (CSP) result_pattern_ExclusiveGatewayToStepRule_33_3_binding[0];

			Object[] result_pattern_ExclusiveGatewayToStepRule_33_3_black = pattern_ExclusiveGatewayToStepRule_33_3_blackB(csp);
			if (result_pattern_ExclusiveGatewayToStepRule_33_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						prevStep, inFlowToPrevStep, inFlowToFlow, process,
						flow, actor, processToActor, lane, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ExclusiveGatewayToStepRule_33_4_expressionFBB(
			ExclusiveGatewayToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_5_blackBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet) {
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, inFlowToFlow,
				process, flow, actor, processToActor, lane, laneSet };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_6_blackBBBBBBBBBBB(
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor, Lane lane,
			LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { inFlow, prevStep, inFlowToPrevStep, inFlowToFlow,
				process, flow, actor, processToActor, lane, laneSet, ruleResult };
	}

	public static final Object[] pattern_ExclusiveGatewayToStepRule_33_6_greenBBFFBFFFFBBBBB(
			SequenceFlow inFlow, Step prevStep, bpmn2.Process process,
			Flow flow, Actor actor, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		SequenceFlowToUCFlow outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		ExclusiveGateway exclusiveGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("normalStep", "name");
		Object _localVariable_1 = csp.getValue("normalStep", "label");
		Object _localVariable_2 = csp.getValue("normalStep", "type");
		Object _localVariable_3 = csp.getValue("exclusiveGateway", "id");
		Object _localVariable_4 = csp.getValue("exclusiveGateway", "name");
		Object _localVariable_5 = csp.getValue("exclusiveGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		prevStep.setNext(normalStep);
		normalStep.setActor(actor);
		flow.getSteps().add(normalStep);
		ruleResult.getTargetObjects().add(normalStep);
		outFlowToFlow.setTarget(flow);
		ruleResult.getCorrObjects().add(outFlowToFlow);
		process.getFlowElements().add(exclusiveGateway);
		inFlow.setTargetRef(exclusiveGateway);
		lane.getFlowNodeRefs().add(exclusiveGateway);
		ruleResult.getSourceObjects().add(exclusiveGateway);
		outFlowToFlow.setSource(outFlow);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exclusiveGateway);
		exclusiveGateway.setDefault(outFlow);
		ruleResult.getSourceObjects().add(outFlow);
		exclusiveGatewayToNormalStep.setSource(exclusiveGateway);
		exclusiveGatewayToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(exclusiveGatewayToNormalStep);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		String normalStep_name_prime = (String) _localVariable_0;
		String normalStep_label_prime = (String) _localVariable_1;
		StepType normalStep_type_prime = (StepType) _localVariable_2;
		String exclusiveGateway_id_prime = (String) _localVariable_3;
		String exclusiveGateway_name_prime = (String) _localVariable_4;
		GatewayDirection exclusiveGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		normalStep.setName(normalStep_name_prime);
		normalStep.setLabel(normalStep_label_prime);
		normalStep.setType(normalStep_type_prime);
		exclusiveGateway.setId(exclusiveGateway_id_prime);
		exclusiveGateway.setName(exclusiveGateway_name_prime);
		exclusiveGateway
				.setGatewayDirection(exclusiveGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { inFlow, prevStep, normalStep, outFlowToFlow,
				process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ExclusiveGatewayToStepRule_33_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveGatewayToStepRuleImpl
