/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;

import BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayTwoInputsRule;
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

import UseCaseDSL.Flow;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;

import bpmn2.Bpmn2Factory;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.GatewayDirection;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
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
 * An implementation of the model object '<em><b>Parallel Converging Gateway Two Inputs Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelConvergingGatewayTwoInputsRuleImpl extends
		AbstractRuleImpl implements ParallelConvergingGatewayTwoInputsRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelConvergingGatewayTwoInputsRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE
				.getParallelConvergingGatewayTwoInputsRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		// initial bindings
		Object[] result1_black = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_0_1_blackBBBBBBBBBBBB(
						this, match, process, inFlow1, parallelConvGateway,
						parallelGateway, divergeFlow1, inFlow, outFlow, lane,
						laneSet, divergeFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[inFlow1] = "
							+ inFlow1
							+ ", "
							+ "[parallelConvGateway] = "
							+ parallelConvGateway
							+ ", "
							+ "[parallelGateway] = "
							+ parallelGateway
							+ ", "
							+ "[divergeFlow1] = "
							+ divergeFlow1
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[divergeFlow] = " + divergeFlow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_0_2_bindingAndBlackFBBBBBBBBBBBB(
						this, match, process, inFlow1, parallelConvGateway,
						parallelGateway, divergeFlow1, inFlow, outFlow, lane,
						laneSet, divergeFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[inFlow1] = "
							+ inFlow1
							+ ", "
							+ "[parallelConvGateway] = "
							+ parallelConvGateway
							+ ", "
							+ "[parallelGateway] = "
							+ parallelGateway
							+ ", "
							+ "[divergeFlow1] = "
							+ divergeFlow1
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[divergeFlow] = " + divergeFlow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_4_blackBBBBBBBBBBB(
							match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow1] = "
								+ inFlow1
								+ ", "
								+ "[parallelConvGateway] = "
								+ parallelConvGateway
								+ ", "
								+ "[parallelGateway] = "
								+ parallelGateway
								+ ", "
								+ "[divergeFlow1] = "
								+ divergeFlow1
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[divergeFlow] = " + divergeFlow + ".");
			}
			ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_4_greenBBBBBBBFFFFFFFFF(
							match, process, inFlow1, parallelConvGateway,
							inFlow, outFlow, lane);
			// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow1__parallelConvGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge parallelConvGateway__inFlow1____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[10];
			// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result4_green[11];
			// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result4_green[12];
			// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result4_green[13];
			// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result4_green[14];
			// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result4_green[15];

			// collect context elements
			Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_5_blackBBBBBBBBBBB(
							match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow1] = "
								+ inFlow1
								+ ", "
								+ "[parallelConvGateway] = "
								+ parallelConvGateway
								+ ", "
								+ "[parallelGateway] = "
								+ parallelGateway
								+ ", "
								+ "[divergeFlow1] = "
								+ divergeFlow1
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[divergeFlow] = " + divergeFlow + ".");
			}
			ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_5_greenBBBBBBBBBFFFFFFFFFFF(
							match, process, inFlow1, parallelGateway,
							divergeFlow1, inFlow, lane, laneSet, divergeFlow);
			// EMoflonEdge process__inFlow1____flowElements = (EMoflonEdge) result5_green[9];
			// EMoflonEdge process__divergeFlow1____flowElements = (EMoflonEdge) result5_green[10];
			// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result5_green[11];
			// EMoflonEdge divergeFlow1__parallelGateway____sourceRef = (EMoflonEdge) result5_green[12];
			// EMoflonEdge parallelGateway__divergeFlow1____outgoing = (EMoflonEdge) result5_green[13];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[14];
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[15];
			// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result5_green[16];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[17];
			// EMoflonEdge divergeFlow__parallelGateway____sourceRef = (EMoflonEdge) result5_green[18];
			// EMoflonEdge parallelGateway__divergeFlow____outgoing = (EMoflonEdge) result5_green[19];

			// register objects to match
			ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_6_expressionBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow);
			return ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_7_expressionF();
		} else {
			return ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow1 = (SequenceFlow) result1_bindingAndBlack[1];
		ParallelGateway parallelConvGateway = (ParallelGateway) result1_bindingAndBlack[2];
		ParallelGateway parallelGateway = (ParallelGateway) result1_bindingAndBlack[3];
		SequenceFlow divergeFlow1 = (SequenceFlow) result1_bindingAndBlack[4];
		ParallelFlow flow1 = (ParallelFlow) result1_bindingAndBlack[5];
		SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) result1_bindingAndBlack[6];
		Step step1 = (Step) result1_bindingAndBlack[7];
		SequenceFlowToStep inFlow1ToStep1 = (SequenceFlowToStep) result1_bindingAndBlack[8];
		ParallelStep parallelStep = (ParallelStep) result1_bindingAndBlack[9];
		SequenceFlowToUCFlow divergeFlow1ToFlow1 = (SequenceFlowToUCFlow) result1_bindingAndBlack[10];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[11];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[12];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[13];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[14];
		Step step = (Step) result1_bindingAndBlack[15];
		SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result1_bindingAndBlack[16];
		Flow initFlow = (Flow) result1_bindingAndBlack[17];
		Lane lane = (Lane) result1_bindingAndBlack[18];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[19];
		SequenceFlow divergeFlow = (SequenceFlow) result1_bindingAndBlack[20];
		SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[21];
		// CSP csp = (CSP) result1_bindingAndBlack[22];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_1_greenBBBFF(
						parallelStep, outFlow, initFlow);
		SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result1_green[3];
		SequenceFlowToStep outFlowToParallelStep = (SequenceFlowToStep) result1_green[4];

		// collect translated elements
		Object[] result2_black = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_2_blackBBBB(
						parallelConvGateway, outFlow, outFlowToInitFlow,
						outFlowToParallelStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[parallelConvGateway] = "
							+ parallelConvGateway + ", " + "[outFlow] = "
							+ outFlow + ", " + "[outFlowToInitFlow] = "
							+ outFlowToInitFlow + ", "
							+ "[outFlowToParallelStep] = "
							+ outFlowToParallelStep + ".");
		}
		Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_2_greenFBBBB(
						parallelConvGateway, outFlow, outFlowToInitFlow,
						outFlowToParallelStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, process, inFlow1, parallelConvGateway,
						parallelGateway, divergeFlow1, flow1, inFlow1ToFlow1,
						step1, inFlow1ToStep1, parallelStep,
						divergeFlow1ToFlow1, inFlow, outFlow, flow,
						inFlowToFlow, step, inFlowToStep, initFlow,
						outFlowToInitFlow, outFlowToParallelStep, lane,
						laneSet, divergeFlow, divergeFlowToFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[inFlow1] = "
							+ inFlow1
							+ ", "
							+ "[parallelConvGateway] = "
							+ parallelConvGateway
							+ ", "
							+ "[parallelGateway] = "
							+ parallelGateway
							+ ", "
							+ "[divergeFlow1] = "
							+ divergeFlow1
							+ ", "
							+ "[flow1] = "
							+ flow1
							+ ", "
							+ "[inFlow1ToFlow1] = "
							+ inFlow1ToFlow1
							+ ", "
							+ "[step1] = "
							+ step1
							+ ", "
							+ "[inFlow1ToStep1] = "
							+ inFlow1ToStep1
							+ ", "
							+ "[parallelStep] = "
							+ parallelStep
							+ ", "
							+ "[divergeFlow1ToFlow1] = "
							+ divergeFlow1ToFlow1
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[inFlowToFlow] = "
							+ inFlowToFlow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[inFlowToStep] = "
							+ inFlowToStep
							+ ", "
							+ "[initFlow] = "
							+ initFlow
							+ ", "
							+ "[outFlowToInitFlow] = "
							+ outFlowToInitFlow
							+ ", "
							+ "[outFlowToParallelStep] = "
							+ outFlowToParallelStep
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[divergeFlow] = "
							+ divergeFlow
							+ ", "
							+ "[divergeFlowToFlow] = "
							+ divergeFlowToFlow
							+ ".");
		}
		ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, process, inFlow1, parallelConvGateway,
						parallelStep, inFlow, outFlow, initFlow,
						outFlowToInitFlow, outFlowToParallelStep, lane);
		// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge inFlow1__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[12];
		// EMoflonEdge parallelConvGateway__inFlow1____incoming = (EMoflonEdge) result3_green[13];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[14];
		// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlowToInitFlow__outFlow____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToInitFlow__initFlow____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToParallelStep__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToParallelStep__parallelStep____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, process, inFlow1,
						parallelConvGateway, parallelGateway, divergeFlow1,
						flow1, inFlow1ToFlow1, step1, inFlow1ToStep1,
						parallelStep, divergeFlow1ToFlow1, inFlow, outFlow,
						flow, inFlowToFlow, step, inFlowToStep, initFlow,
						outFlowToInitFlow, outFlowToParallelStep, lane,
						laneSet, divergeFlow, divergeFlowToFlow);
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_2_2_bindingFFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		SequenceFlow inFlow1 = (SequenceFlow) result2_binding[1];
		ParallelGateway parallelConvGateway = (ParallelGateway) result2_binding[2];
		ParallelGateway parallelGateway = (ParallelGateway) result2_binding[3];
		SequenceFlow divergeFlow1 = (SequenceFlow) result2_binding[4];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[5];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[6];
		Lane lane = (Lane) result2_binding[7];
		LaneSet laneSet = (LaneSet) result2_binding[8];
		SequenceFlow divergeFlow = (SequenceFlow) result2_binding[9];
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_2_2_blackBBBBBFFFFFBBFFFFBBBFB(
						process, inFlow1, parallelConvGateway, parallelGateway,
						divergeFlow1, inFlow, outFlow, lane, laneSet,
						divergeFlow, match)) {
			ParallelFlow flow1 = (ParallelFlow) result2_black[5];
			SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) result2_black[6];
			Step step1 = (Step) result2_black[7];
			SequenceFlowToStep inFlow1ToStep1 = (SequenceFlowToStep) result2_black[8];
			SequenceFlowToUCFlow divergeFlow1ToFlow1 = (SequenceFlowToUCFlow) result2_black[9];
			ParallelFlow flow = (ParallelFlow) result2_black[12];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[13];
			Step step = (Step) result2_black[14];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[15];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[19];
			// ForEach find context
			for (Object[] result3_black : ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_2_3_blackBBBBBBBBBFBBBBBBBFBBBB(
							process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, flow1,
							inFlow1ToFlow1, step1, inFlow1ToStep1,
							divergeFlow1ToFlow1, inFlow, outFlow, flow,
							inFlowToFlow, step, inFlowToStep, lane, laneSet,
							divergeFlow, divergeFlowToFlow)) {
				ParallelStep parallelStep = (ParallelStep) result3_black[9];
				Flow initFlow = (Flow) result3_black[17];
				Object[] result3_green = ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_2_3_greenBBBBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								process, inFlow1, parallelConvGateway,
								parallelGateway, divergeFlow1, flow1,
								inFlow1ToFlow1, step1, inFlow1ToStep1,
								parallelStep, divergeFlow1ToFlow1, inFlow,
								outFlow, flow, inFlowToFlow, step,
								inFlowToStep, initFlow, lane, laneSet,
								divergeFlow, divergeFlowToFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[22];
				// EMoflonEdge process__inFlow1____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__parallelConvGateway____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__divergeFlow1____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__parallelGateway____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge inFlow1__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge parallelConvGateway__inFlow1____incoming = (EMoflonEdge) result3_green[28];
				// EMoflonEdge divergeFlow1__parallelGateway____sourceRef = (EMoflonEdge) result3_green[29];
				// EMoflonEdge parallelGateway__divergeFlow1____outgoing = (EMoflonEdge) result3_green[30];
				// EMoflonEdge flow1__step1____steps = (EMoflonEdge) result3_green[31];
				// EMoflonEdge inFlow1ToFlow1__inFlow1____source = (EMoflonEdge) result3_green[32];
				// EMoflonEdge inFlow1ToFlow1__flow1____target = (EMoflonEdge) result3_green[33];
				// EMoflonEdge inFlow1ToStep1__inFlow1____source = (EMoflonEdge) result3_green[34];
				// EMoflonEdge inFlow1ToStep1__step1____target = (EMoflonEdge) result3_green[35];
				// EMoflonEdge parallelStep__flow1____invokedFlows = (EMoflonEdge) result3_green[36];
				// EMoflonEdge divergeFlow1ToFlow1__divergeFlow1____source = (EMoflonEdge) result3_green[37];
				// EMoflonEdge divergeFlow1ToFlow1__flow1____target = (EMoflonEdge) result3_green[38];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[39];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[40];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[41];
				// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result3_green[42];
				// EMoflonEdge inFlow__parallelConvGateway____targetRef = (EMoflonEdge) result3_green[43];
				// EMoflonEdge parallelConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[44];
				// EMoflonEdge outFlow__parallelConvGateway____sourceRef = (EMoflonEdge) result3_green[45];
				// EMoflonEdge parallelConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[46];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[47];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[48];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[49];
				// EMoflonEdge inFlowToStep__inFlow____source = (EMoflonEdge) result3_green[50];
				// EMoflonEdge inFlowToStep__step____target = (EMoflonEdge) result3_green[51];
				// EMoflonEdge initFlow__parallelStep____steps = (EMoflonEdge) result3_green[52];
				// EMoflonEdge parallelStep__flow____invokedFlows = (EMoflonEdge) result3_green[53];
				// EMoflonEdge lane__parallelConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[54];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[55];
				// EMoflonEdge divergeFlow__parallelGateway____sourceRef = (EMoflonEdge) result3_green[56];
				// EMoflonEdge parallelGateway__divergeFlow____outgoing = (EMoflonEdge) result3_green[57];
				// EMoflonEdge divergeFlowToFlow__divergeFlow____source = (EMoflonEdge) result3_green[58];
				// EMoflonEdge divergeFlowToFlow__flow____target = (EMoflonEdge) result3_green[59];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow1,
								parallelConvGateway, parallelGateway,
								divergeFlow1, flow1, inFlow1ToFlow1, step1,
								inFlow1ToStep1, parallelStep,
								divergeFlow1ToFlow1, inFlow, outFlow, flow,
								inFlowToFlow, step, inFlowToStep, initFlow,
								lane, laneSet, divergeFlow, divergeFlowToFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[inFlow1] = "
									+ inFlow1
									+ ", "
									+ "[parallelConvGateway] = "
									+ parallelConvGateway
									+ ", "
									+ "[parallelGateway] = "
									+ parallelGateway
									+ ", "
									+ "[divergeFlow1] = "
									+ divergeFlow1
									+ ", "
									+ "[flow1] = "
									+ flow1
									+ ", "
									+ "[inFlow1ToFlow1] = "
									+ inFlow1ToFlow1
									+ ", "
									+ "[step1] = "
									+ step1
									+ ", "
									+ "[inFlow1ToStep1] = "
									+ inFlow1ToStep1
									+ ", "
									+ "[parallelStep] = "
									+ parallelStep
									+ ", "
									+ "[divergeFlow1ToFlow1] = "
									+ divergeFlow1ToFlow1
									+ ", "
									+ "[inFlow] = "
									+ inFlow
									+ ", "
									+ "[outFlow] = "
									+ outFlow
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[inFlowToFlow] = "
									+ inFlowToFlow
									+ ", "
									+ "[step] = "
									+ step
									+ ", "
									+ "[inFlowToStep] = "
									+ inFlowToStep
									+ ", "
									+ "[initFlow] = "
									+ initFlow
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = "
									+ laneSet
									+ ", "
									+ "[divergeFlow] = "
									+ divergeFlow
									+ ", "
									+ "[divergeFlowToFlow] = "
									+ divergeFlowToFlow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow1", inFlow1);
		match.registerObject("parallelConvGateway", parallelConvGateway);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("divergeFlow1", divergeFlow1);
		match.registerObject("inFlow", inFlow);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);
		match.registerObject("divergeFlow", divergeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");
		literal1.setType("");

		// Create attribute variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", true,
						csp);
		var_parallelConvGateway_gatewayDirection.setValue(parallelConvGateway
				.getGatewayDirection());
		var_parallelConvGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_parallelConvGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelGateway_gatewayDirection,
				literal1);
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
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow1", inFlow1);
		isApplicableMatch.registerObject("parallelConvGateway",
				parallelConvGateway);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("divergeFlow1", divergeFlow1);
		isApplicableMatch.registerObject("flow1", flow1);
		isApplicableMatch.registerObject("inFlow1ToFlow1", inFlow1ToFlow1);
		isApplicableMatch.registerObject("step1", step1);
		isApplicableMatch.registerObject("inFlow1ToStep1", inFlow1ToStep1);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("divergeFlow1ToFlow1",
				divergeFlow1ToFlow1);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
			EObject process, EObject inFlow1, EObject parallelConvGateway,
			EObject parallelGateway, EObject divergeFlow1, EObject flow1,
			EObject inFlow1ToFlow1, EObject step1, EObject inFlow1ToStep1,
			EObject parallelStep, EObject divergeFlow1ToFlow1, EObject inFlow,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow1", inFlow1);
		ruleresult.registerObject("parallelConvGateway", parallelConvGateway);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("divergeFlow1", divergeFlow1);
		ruleresult.registerObject("flow1", flow1);
		ruleresult.registerObject("inFlow1ToFlow1", inFlow1ToFlow1);
		ruleresult.registerObject("step1", step1);
		ruleresult.registerObject("inFlow1ToStep1", inFlow1ToStep1);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("divergeFlow1ToFlow1", divergeFlow1ToFlow1);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToParallelStep",
				outFlowToParallelStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("divergeFlowToFlow", divergeFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("parallelConvGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getParallelGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_296(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_10_2_blackFFFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_10_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_10_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_10_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_10_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_297(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_11_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_11_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_11_2_blackFFFFFFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_11_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_11_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_11_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_11_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_11_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_11_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_298(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_12_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_12_2_blackFFFFFFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_12_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_12_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_12_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_12_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_12_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_12_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_299(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_13_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_13_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_13_2_blackFFFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_13_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_13_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_13_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_13_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_13_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_13_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_300(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_14_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_14_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_14_2_blackFFFFFFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_14_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_14_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_14_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_14_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_14_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_14_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_301(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_15_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_15_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_15_2_blackFFFFFFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_15_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_15_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_15_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_15_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_15_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_15_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_302(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_16_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_16_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_16_2_blackFFFFFFFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_16_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_16_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_16_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_16_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_16_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_16_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_303(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_17_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_17_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_17_2_blackFFFFFFFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_17_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_17_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_17_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_17_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_17_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_304(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_18_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_18_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_18_2_blackFFFFFFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result2_black[2];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[4];
			SequenceFlow inFlow = (SequenceFlow) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[9];
			Object[] result2_green = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_18_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_18_3_expressionFBBBBBBBBBBBB(
							this, match, process, inFlow1, parallelConvGateway,
							parallelGateway, divergeFlow1, inFlow, outFlow,
							lane, laneSet, divergeFlow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_18_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_18_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_18_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_18_6_expressionFB(__result);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlow1ToFlow1Parameter) {
		// create result
		Object[] result1_black = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_20_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_20_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_20_2_blackFFFFFFFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlow1ToFlow1List = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow inFlow1 = (SequenceFlow) result2_black[2];
			SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) result2_black[3];
			ParallelFlow flow1 = (ParallelFlow) result2_black[4];
			Step step1 = (Step) result2_black[5];
			SequenceFlowToStep inFlow1ToStep1 = (SequenceFlowToStep) result2_black[6];
			ParallelStep parallelStep = (ParallelStep) result2_black[7];
			ParallelFlow flow = (ParallelFlow) result2_black[8];
			Step step = (Step) result2_black[9];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[10];
			SequenceFlow inFlow = (SequenceFlow) result2_black[11];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[12];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[13];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[14];
			ParallelGateway parallelGateway = (ParallelGateway) result2_black[15];
			SequenceFlow divergeFlow1 = (SequenceFlow) result2_black[16];
			SequenceFlowToUCFlow divergeFlow1ToFlow1 = (SequenceFlowToUCFlow) result2_black[17];
			Flow initFlow = (Flow) result2_black[18];
			LaneSet laneSet = (LaneSet) result2_black[19];
			Lane lane = (Lane) result2_black[20];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_20_3_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBBBB(
							this, isApplicableMatch, process, inFlow1,
							parallelGateway, divergeFlow1, flow1,
							inFlow1ToFlow1, step1, inFlow1ToStep1,
							parallelStep, divergeFlow1ToFlow1, inFlow, flow,
							inFlowToFlow, step, inFlowToStep, initFlow, lane,
							laneSet, divergeFlow, divergeFlowToFlow, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow1] = "
								+ inFlow1
								+ ", "
								+ "[parallelGateway] = "
								+ parallelGateway
								+ ", "
								+ "[divergeFlow1] = "
								+ divergeFlow1
								+ ", "
								+ "[flow1] = "
								+ flow1
								+ ", "
								+ "[inFlow1ToFlow1] = "
								+ inFlow1ToFlow1
								+ ", "
								+ "[step1] = "
								+ step1
								+ ", "
								+ "[inFlow1ToStep1] = "
								+ inFlow1ToStep1
								+ ", "
								+ "[parallelStep] = "
								+ parallelStep
								+ ", "
								+ "[divergeFlow1ToFlow1] = "
								+ divergeFlow1ToFlow1
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[inFlowToFlow] = "
								+ inFlowToFlow
								+ ", "
								+ "[step] = "
								+ step
								+ ", "
								+ "[inFlowToStep] = "
								+ inFlowToStep
								+ ", "
								+ "[initFlow] = "
								+ initFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[divergeFlow] = "
								+ divergeFlow
								+ ", "
								+ "[divergeFlowToFlow] = "
								+ divergeFlowToFlow
								+ ", "
								+ "[ruleResult] = "
								+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelConvergingGatewayTwoInputsRuleImpl
					.pattern_ParallelConvergingGatewayTwoInputsRule_20_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelConvergingGatewayTwoInputsRuleImpl
						.pattern_ParallelConvergingGatewayTwoInputsRule_20_5_blackBBBBBBBBBBBBBBBBBBBB(
								step, process, inFlow1, parallelGateway,
								divergeFlow1, flow1, inFlow1ToFlow1, step1,
								inFlow1ToStep1, parallelStep,
								divergeFlow1ToFlow1, inFlow, flow,
								inFlowToFlow, inFlowToStep, initFlow, lane,
								laneSet, divergeFlow, divergeFlowToFlow);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_20_6_blackBBBBBBBBBBBBBBBBBBBBB(
									process, inFlow1, parallelGateway,
									divergeFlow1, flow1, inFlow1ToFlow1, step1,
									inFlow1ToStep1, parallelStep,
									divergeFlow1ToFlow1, inFlow, flow,
									inFlowToFlow, step, inFlowToStep, initFlow,
									lane, laneSet, divergeFlow,
									divergeFlowToFlow, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[process] = "
										+ process
										+ ", "
										+ "[inFlow1] = "
										+ inFlow1
										+ ", "
										+ "[parallelGateway] = "
										+ parallelGateway
										+ ", "
										+ "[divergeFlow1] = "
										+ divergeFlow1
										+ ", "
										+ "[flow1] = "
										+ flow1
										+ ", "
										+ "[inFlow1ToFlow1] = "
										+ inFlow1ToFlow1
										+ ", "
										+ "[step1] = "
										+ step1
										+ ", "
										+ "[inFlow1ToStep1] = "
										+ inFlow1ToStep1
										+ ", "
										+ "[parallelStep] = "
										+ parallelStep
										+ ", "
										+ "[divergeFlow1ToFlow1] = "
										+ divergeFlow1ToFlow1
										+ ", "
										+ "[inFlow] = "
										+ inFlow
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[inFlowToFlow] = "
										+ inFlowToFlow
										+ ", "
										+ "[step] = "
										+ step
										+ ", "
										+ "[inFlowToStep] = "
										+ inFlowToStep
										+ ", "
										+ "[initFlow] = "
										+ initFlow
										+ ", "
										+ "[lane] = "
										+ lane
										+ ", "
										+ "[laneSet] = "
										+ laneSet
										+ ", "
										+ "[divergeFlow] = "
										+ divergeFlow
										+ ", "
										+ "[divergeFlowToFlow] = "
										+ divergeFlowToFlow
										+ ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					ParallelConvergingGatewayTwoInputsRuleImpl
							.pattern_ParallelConvergingGatewayTwoInputsRule_20_6_greenBBFBBFBFFBBB(
									process, inFlow1, parallelStep, inFlow,
									initFlow, lane, ruleResult, csp);
					// ParallelGateway parallelConvGateway = (ParallelGateway) result6_green[2];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[5];
					// SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result6_green[7];
					// SequenceFlowToStep outFlowToParallelStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ParallelConvergingGatewayTwoInputsRuleImpl
				.pattern_ParallelConvergingGatewayTwoInputsRule_20_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
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
		literal1.setValue("Diverging");
		literal1.setType("");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", csp);
		var_parallelConvGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal1);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelConvGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow1", inFlow1);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("divergeFlow1", divergeFlow1);
		isApplicableMatch.registerObject("flow1", flow1);
		isApplicableMatch.registerObject("inFlow1ToFlow1", inFlow1ToFlow1);
		isApplicableMatch.registerObject("step1", step1);
		isApplicableMatch.registerObject("inFlow1ToStep1", inFlow1ToStep1);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("divergeFlow1ToFlow1",
				divergeFlow1ToFlow1);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_SEQUENCEFLOW_LANE_LANESET_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(ParallelGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9),
					(SequenceFlow) arguments.get(10));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_SEQUENCEFLOW_LANE_LANESET_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(ParallelGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9),
					(SequenceFlow) arguments.get(10));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_SEQUENCEFLOW_LANE_LANESET_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(ParallelGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(SequenceFlow) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9),
					(SequenceFlow) arguments.get(10));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_PARALLELSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOW_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_LANE_LANESET_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(ParallelGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ParallelFlow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(Step) arguments.get(8),
					(SequenceFlowToStep) arguments.get(9),
					(ParallelStep) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(SequenceFlow) arguments.get(12),
					(SequenceFlow) arguments.get(13),
					(ParallelFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(Step) arguments.get(16),
					(SequenceFlowToStep) arguments.get(17),
					(Flow) arguments.get(18), (Lane) arguments.get(19),
					(LaneSet) arguments.get(20),
					(SequenceFlow) arguments.get(21),
					(SequenceFlowToUCFlow) arguments.get(22));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20),
					(EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23), (EObject) arguments.get(24));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_296__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_296((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_297__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_297((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_298__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_298((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_299__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_299((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_300__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_300((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_301__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_301((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_302__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_302((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_303__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_303((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_304__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_304((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_PARALLELSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_LANE_LANESET_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(ParallelStep) arguments.get(9),
					(SequenceFlowToUCFlow) arguments.get(10),
					(SequenceFlow) arguments.get(11),
					(ParallelFlow) arguments.get(12),
					(SequenceFlowToUCFlow) arguments.get(13),
					(Step) arguments.get(14),
					(SequenceFlowToStep) arguments.get(15),
					(Flow) arguments.get(16), (Lane) arguments.get(17),
					(LaneSet) arguments.get(18),
					(SequenceFlow) arguments.get(19),
					(SequenceFlowToUCFlow) arguments.get(20),
					(ModelgeneratorRuleResult) arguments.get(21));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_1_blackBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!inFlow.equals(inFlow1)) {
								if (!inFlow.equals(outFlow)) {
									if (!divergeFlow.equals(inFlow1)) {
										if (!divergeFlow.equals(divergeFlow1)) {
											if (!divergeFlow.equals(inFlow)) {
												if (!divergeFlow
														.equals(outFlow)) {
													return new Object[] {
															_this,
															match,
															process,
															inFlow1,
															parallelConvGateway,
															parallelGateway,
															divergeFlow1,
															inFlow, outFlow,
															lane, laneSet,
															divergeFlow };
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_2_bindingFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow1,
					parallelConvGateway, parallelGateway, divergeFlow1, inFlow,
					outFlow, lane, laneSet, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_2_bindingAndBlackFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_0_2_binding = pattern_ParallelConvergingGatewayTwoInputsRule_0_2_bindingFBBBBBBBBBBBB(
				_this, match, process, inFlow1, parallelConvGateway,
				parallelGateway, divergeFlow1, inFlow, outFlow, lane, laneSet,
				divergeFlow);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayTwoInputsRule_0_2_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_0_2_black = pattern_ParallelConvergingGatewayTwoInputsRule_0_2_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow1,
						parallelConvGateway, parallelGateway, divergeFlow1,
						inFlow, outFlow, lane, laneSet, divergeFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_0_3_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_4_blackBBBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!inFlow.equals(inFlow1)) {
								if (!inFlow.equals(outFlow)) {
									if (!divergeFlow.equals(inFlow1)) {
										if (!divergeFlow.equals(divergeFlow1)) {
											if (!divergeFlow.equals(inFlow)) {
												if (!divergeFlow
														.equals(outFlow)) {
													return new Object[] {
															match,
															process,
															inFlow1,
															parallelConvGateway,
															parallelGateway,
															divergeFlow1,
															inFlow, outFlow,
															lane, laneSet,
															divergeFlow };
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_4_greenBBBBBBBFFFFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway, SequenceFlow inFlow,
			SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parallelConvGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String inFlow1__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow1____incoming_name_prime = "incoming";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				process__parallelConvGateway____flowElements);
		inFlow1__parallelConvGateway____targetRef.setSrc(inFlow1);
		inFlow1__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				inFlow1__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow1____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow1____incoming.setTrg(inFlow1);
		match.getToBeTranslatedEdges().add(
				parallelConvGateway__inFlow1____incoming);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				parallelConvGateway__outFlow____outgoing);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		match.getToBeTranslatedEdges().add(
				lane__parallelConvGateway____flowNodeRefs);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		inFlow1__parallelConvGateway____targetRef
				.setName(inFlow1__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow1____incoming
				.setName(parallelConvGateway__inFlow1____incoming_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		return new Object[] { match, process, inFlow1, parallelConvGateway,
				inFlow, outFlow, lane,
				process__parallelConvGateway____flowElements,
				inFlow1__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow1____incoming,
				process__outFlow____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing,
				lane__parallelConvGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_5_blackBBBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!inFlow.equals(inFlow1)) {
								if (!inFlow.equals(outFlow)) {
									if (!divergeFlow.equals(inFlow1)) {
										if (!divergeFlow.equals(divergeFlow1)) {
											if (!divergeFlow.equals(inFlow)) {
												if (!divergeFlow
														.equals(outFlow)) {
													return new Object[] {
															match,
															process,
															inFlow1,
															parallelConvGateway,
															parallelGateway,
															divergeFlow1,
															inFlow, outFlow,
															lane, laneSet,
															divergeFlow };
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_0_5_greenBBBBBBBBBFFFFFFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, Lane lane, LaneSet laneSet,
			SequenceFlow divergeFlow) {
		EMoflonEdge process__inFlow1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow1__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow1);
		match.getContextNodes().add(parallelGateway);
		match.getContextNodes().add(divergeFlow1);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		match.getContextNodes().add(divergeFlow);
		String process__inFlow1____flowElements_name_prime = "flowElements";
		String process__divergeFlow1____flowElements_name_prime = "flowElements";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String divergeFlow1__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow1____outgoing_name_prime = "outgoing";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		String divergeFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow____outgoing_name_prime = "outgoing";
		process__inFlow1____flowElements.setSrc(process);
		process__inFlow1____flowElements.setTrg(inFlow1);
		match.getContextEdges().add(process__inFlow1____flowElements);
		process__divergeFlow1____flowElements.setSrc(process);
		process__divergeFlow1____flowElements.setTrg(divergeFlow1);
		match.getContextEdges().add(process__divergeFlow1____flowElements);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		match.getContextEdges().add(process__parallelGateway____flowElements);
		divergeFlow1__parallelGateway____sourceRef.setSrc(divergeFlow1);
		divergeFlow1__parallelGateway____sourceRef.setTrg(parallelGateway);
		match.getContextEdges().add(divergeFlow1__parallelGateway____sourceRef);
		parallelGateway__divergeFlow1____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow1____outgoing.setTrg(divergeFlow1);
		match.getContextEdges().add(parallelGateway__divergeFlow1____outgoing);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		match.getContextEdges().add(process__divergeFlow____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		divergeFlow__parallelGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		match.getContextEdges().add(divergeFlow__parallelGateway____sourceRef);
		parallelGateway__divergeFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		match.getContextEdges().add(parallelGateway__divergeFlow____outgoing);
		process__inFlow1____flowElements
				.setName(process__inFlow1____flowElements_name_prime);
		process__divergeFlow1____flowElements
				.setName(process__divergeFlow1____flowElements_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		divergeFlow1__parallelGateway____sourceRef
				.setName(divergeFlow1__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow1____outgoing
				.setName(parallelGateway__divergeFlow1____outgoing_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		divergeFlow__parallelGateway____sourceRef
				.setName(divergeFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow____outgoing
				.setName(parallelGateway__divergeFlow____outgoing_name_prime);
		return new Object[] { match, process, inFlow1, parallelGateway,
				divergeFlow1, inFlow, lane, laneSet, divergeFlow,
				process__inFlow1____flowElements,
				process__divergeFlow1____flowElements,
				process__parallelGateway____flowElements,
				divergeFlow1__parallelGateway____sourceRef,
				parallelGateway__divergeFlow1____outgoing,
				process__inFlow____flowElements, process__laneSet____laneSets,
				process__divergeFlow____flowElements, laneSet__lane____lanes,
				divergeFlow__parallelGateway____sourceRef,
				parallelGateway__divergeFlow____outgoing };
	}

	public static final void pattern_ParallelConvergingGatewayTwoInputsRule_0_6_expressionBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow1,
				parallelConvGateway, parallelGateway, divergeFlow1, inFlow,
				outFlow, lane, laneSet, divergeFlow);

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_1_bindingFFFFFFFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow1");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("parallelConvGateway");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("parallelGateway");
		EObject _localVariable_4 = isApplicableMatch.getObject("divergeFlow1");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow1");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("inFlow1ToFlow1");
		EObject _localVariable_7 = isApplicableMatch.getObject("step1");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("inFlow1ToStep1");
		EObject _localVariable_9 = isApplicableMatch.getObject("parallelStep");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("divergeFlow1ToFlow1");
		EObject _localVariable_11 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_12 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_13 = isApplicableMatch.getObject("flow");
		EObject _localVariable_14 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_15 = isApplicableMatch.getObject("step");
		EObject _localVariable_16 = isApplicableMatch.getObject("inFlowToStep");
		EObject _localVariable_17 = isApplicableMatch.getObject("initFlow");
		EObject _localVariable_18 = isApplicableMatch.getObject("lane");
		EObject _localVariable_19 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_20 = isApplicableMatch.getObject("divergeFlow");
		EObject _localVariable_21 = isApplicableMatch
				.getObject("divergeFlowToFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow1 = _localVariable_1;
		EObject tmpParallelConvGateway = _localVariable_2;
		EObject tmpParallelGateway = _localVariable_3;
		EObject tmpDivergeFlow1 = _localVariable_4;
		EObject tmpFlow1 = _localVariable_5;
		EObject tmpInFlow1ToFlow1 = _localVariable_6;
		EObject tmpStep1 = _localVariable_7;
		EObject tmpInFlow1ToStep1 = _localVariable_8;
		EObject tmpParallelStep = _localVariable_9;
		EObject tmpDivergeFlow1ToFlow1 = _localVariable_10;
		EObject tmpInFlow = _localVariable_11;
		EObject tmpOutFlow = _localVariable_12;
		EObject tmpFlow = _localVariable_13;
		EObject tmpInFlowToFlow = _localVariable_14;
		EObject tmpStep = _localVariable_15;
		EObject tmpInFlowToStep = _localVariable_16;
		EObject tmpInitFlow = _localVariable_17;
		EObject tmpLane = _localVariable_18;
		EObject tmpLaneSet = _localVariable_19;
		EObject tmpDivergeFlow = _localVariable_20;
		EObject tmpDivergeFlowToFlow = _localVariable_21;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow1 instanceof SequenceFlow) {
				SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
				if (tmpParallelConvGateway instanceof ParallelGateway) {
					ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
					if (tmpParallelGateway instanceof ParallelGateway) {
						ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
						if (tmpDivergeFlow1 instanceof SequenceFlow) {
							SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
							if (tmpFlow1 instanceof ParallelFlow) {
								ParallelFlow flow1 = (ParallelFlow) tmpFlow1;
								if (tmpInFlow1ToFlow1 instanceof SequenceFlowToUCFlow) {
									SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) tmpInFlow1ToFlow1;
									if (tmpStep1 instanceof Step) {
										Step step1 = (Step) tmpStep1;
										if (tmpInFlow1ToStep1 instanceof SequenceFlowToStep) {
											SequenceFlowToStep inFlow1ToStep1 = (SequenceFlowToStep) tmpInFlow1ToStep1;
											if (tmpParallelStep instanceof ParallelStep) {
												ParallelStep parallelStep = (ParallelStep) tmpParallelStep;
												if (tmpDivergeFlow1ToFlow1 instanceof SequenceFlowToUCFlow) {
													SequenceFlowToUCFlow divergeFlow1ToFlow1 = (SequenceFlowToUCFlow) tmpDivergeFlow1ToFlow1;
													if (tmpInFlow instanceof SequenceFlow) {
														SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
														if (tmpOutFlow instanceof SequenceFlow) {
															SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
															if (tmpFlow instanceof ParallelFlow) {
																ParallelFlow flow = (ParallelFlow) tmpFlow;
																if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
																	SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
																	if (tmpStep instanceof Step) {
																		Step step = (Step) tmpStep;
																		if (tmpInFlowToStep instanceof SequenceFlowToStep) {
																			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
																			if (tmpInitFlow instanceof Flow) {
																				Flow initFlow = (Flow) tmpInitFlow;
																				if (tmpLane instanceof Lane) {
																					Lane lane = (Lane) tmpLane;
																					if (tmpLaneSet instanceof LaneSet) {
																						LaneSet laneSet = (LaneSet) tmpLaneSet;
																						if (tmpDivergeFlow instanceof SequenceFlow) {
																							SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																							if (tmpDivergeFlowToFlow instanceof SequenceFlowToUCFlow) {
																								SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) tmpDivergeFlowToFlow;
																								return new Object[] {
																										process,
																										inFlow1,
																										parallelConvGateway,
																										parallelGateway,
																										divergeFlow1,
																										flow1,
																										inFlow1ToFlow1,
																										step1,
																										inFlow1ToStep1,
																										parallelStep,
																										divergeFlow1ToFlow1,
																										inFlow,
																										outFlow,
																										flow,
																										inFlowToFlow,
																										step,
																										inFlowToStep,
																										initFlow,
																										lane,
																										laneSet,
																										divergeFlow,
																										divergeFlowToFlow,
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_1_blackBBBBBBBBBBBBBBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!flow1.equals(initFlow)) {
								if (!inFlow1ToFlow1.equals(inFlowToFlow)) {
									if (!inFlow1ToStep1.equals(inFlowToStep)) {
										if (!parallelStep.equals(step1)) {
											if (!parallelStep.equals(step)) {
												if (!divergeFlow1ToFlow1
														.equals(inFlow1ToFlow1)) {
													if (!divergeFlow1ToFlow1
															.equals(inFlowToFlow)) {
														if (!divergeFlow1ToFlow1
																.equals(divergeFlowToFlow)) {
															if (!inFlow
																	.equals(inFlow1)) {
																if (!inFlow
																		.equals(outFlow)) {
																	if (!flow
																			.equals(flow1)) {
																		if (!flow
																				.equals(initFlow)) {
																			if (!step
																					.equals(step1)) {
																				if (!divergeFlow
																						.equals(inFlow1)) {
																					if (!divergeFlow
																							.equals(divergeFlow1)) {
																						if (!divergeFlow
																								.equals(inFlow)) {
																							if (!divergeFlow
																									.equals(outFlow)) {
																								if (!divergeFlowToFlow
																										.equals(inFlow1ToFlow1)) {
																									if (!divergeFlowToFlow
																											.equals(inFlowToFlow)) {
																										for (EObject tmpCsp : isApplicableMatch
																												.getAttributeInfo()) {
																											if (tmpCsp instanceof CSP) {
																												CSP csp = (CSP) tmpCsp;
																												return new Object[] {
																														process,
																														inFlow1,
																														parallelConvGateway,
																														parallelGateway,
																														divergeFlow1,
																														flow1,
																														inFlow1ToFlow1,
																														step1,
																														inFlow1ToStep1,
																														parallelStep,
																														divergeFlow1ToFlow1,
																														inFlow,
																														outFlow,
																														flow,
																														inFlowToFlow,
																														step,
																														inFlowToStep,
																														initFlow,
																														lane,
																														laneSet,
																														divergeFlow,
																														divergeFlowToFlow,
																														csp,
																														_this,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFFFFFBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_1_1_bindingFFFFFFFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[0];
			SequenceFlow inFlow1 = (SequenceFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[1];
			ParallelGateway parallelConvGateway = (ParallelGateway) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[2];
			ParallelGateway parallelGateway = (ParallelGateway) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[3];
			SequenceFlow divergeFlow1 = (SequenceFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[4];
			ParallelFlow flow1 = (ParallelFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[5];
			SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[6];
			Step step1 = (Step) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[7];
			SequenceFlowToStep inFlow1ToStep1 = (SequenceFlowToStep) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[8];
			ParallelStep parallelStep = (ParallelStep) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[9];
			SequenceFlowToUCFlow divergeFlow1ToFlow1 = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[10];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[11];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[12];
			ParallelFlow flow = (ParallelFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[13];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[14];
			Step step = (Step) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[15];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[16];
			Flow initFlow = (Flow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[17];
			Lane lane = (Lane) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[18];
			LaneSet laneSet = (LaneSet) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[19];
			SequenceFlow divergeFlow = (SequenceFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[20];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_binding[21];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_1_1_blackBBBBBBBBBBBBBBBBBBBBBBFBB(
					process, inFlow1, parallelConvGateway, parallelGateway,
					divergeFlow1, flow1, inFlow1ToFlow1, step1, inFlow1ToStep1,
					parallelStep, divergeFlow1ToFlow1, inFlow, outFlow, flow,
					inFlowToFlow, step, inFlowToStep, initFlow, lane, laneSet,
					divergeFlow, divergeFlowToFlow, _this, isApplicableMatch);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelConvergingGatewayTwoInputsRule_1_1_black[22];

				return new Object[] { process, inFlow1, parallelConvGateway,
						parallelGateway, divergeFlow1, flow1, inFlow1ToFlow1,
						step1, inFlow1ToStep1, parallelStep,
						divergeFlow1ToFlow1, inFlow, outFlow, flow,
						inFlowToFlow, step, inFlowToStep, initFlow, lane,
						laneSet, divergeFlow, divergeFlowToFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_1_greenBBBFF(
			ParallelStep parallelStep, SequenceFlow outFlow, Flow initFlow) {
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		outFlowToParallelStep.setSource(outFlow);
		outFlowToParallelStep.setTarget(parallelStep);
		return new Object[] { parallelStep, outFlow, initFlow,
				outFlowToInitFlow, outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_2_blackBBBB(
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep) {
		return new Object[] { parallelConvGateway, outFlow, outFlowToInitFlow,
				outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_2_greenFBBBB(
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parallelConvGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToInitFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToParallelStep);
		return new Object[] { ruleresult, parallelConvGateway, outFlow,
				outFlowToInitFlow, outFlowToParallelStep };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow1,
			EObject parallelConvGateway, EObject parallelGateway,
			EObject divergeFlow1, EObject flow1, EObject inFlow1ToFlow1,
			EObject step1, EObject inFlow1ToStep1, EObject parallelStep,
			EObject divergeFlow1ToFlow1, EObject inFlow, EObject outFlow,
			EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		if (!process.equals(step1)) {
			if (!process.equals(step)) {
				if (!inFlow1.equals(process)) {
					if (!inFlow1.equals(parallelConvGateway)) {
						if (!inFlow1.equals(parallelGateway)) {
							if (!inFlow1.equals(inFlow1ToFlow1)) {
								if (!inFlow1.equals(step1)) {
									if (!inFlow1.equals(inFlow1ToStep1)) {
										if (!inFlow1.equals(parallelStep)) {
											if (!inFlow1.equals(outFlow)) {
												if (!inFlow1
														.equals(inFlowToFlow)) {
													if (!inFlow1.equals(step)) {
														if (!inFlow1
																.equals(inFlowToStep)) {
															if (!inFlow1
																	.equals(initFlow)) {
																if (!inFlow1
																		.equals(outFlowToInitFlow)) {
																	if (!inFlow1
																			.equals(outFlowToParallelStep)) {
																		if (!inFlow1
																				.equals(lane)) {
																			if (!inFlow1
																					.equals(laneSet)) {
																				if (!parallelConvGateway
																						.equals(process)) {
																					if (!parallelConvGateway
																							.equals(parallelGateway)) {
																						if (!parallelConvGateway
																								.equals(step1)) {
																							if (!parallelConvGateway
																									.equals(parallelStep)) {
																								if (!parallelConvGateway
																										.equals(step)) {
																									if (!parallelGateway
																											.equals(process)) {
																										if (!parallelGateway
																												.equals(step1)) {
																											if (!parallelGateway
																													.equals(parallelStep)) {
																												if (!parallelGateway
																														.equals(step)) {
																													if (!divergeFlow1
																															.equals(process)) {
																														if (!divergeFlow1
																																.equals(inFlow1)) {
																															if (!divergeFlow1
																																	.equals(parallelConvGateway)) {
																																if (!divergeFlow1
																																		.equals(parallelGateway)) {
																																	if (!divergeFlow1
																																			.equals(flow1)) {
																																		if (!divergeFlow1
																																				.equals(inFlow1ToFlow1)) {
																																			if (!divergeFlow1
																																					.equals(step1)) {
																																				if (!divergeFlow1
																																						.equals(inFlow1ToStep1)) {
																																					if (!divergeFlow1
																																							.equals(parallelStep)) {
																																						if (!divergeFlow1
																																								.equals(divergeFlow1ToFlow1)) {
																																							if (!divergeFlow1
																																									.equals(inFlow)) {
																																								if (!divergeFlow1
																																										.equals(outFlow)) {
																																									if (!divergeFlow1
																																											.equals(flow)) {
																																										if (!divergeFlow1
																																												.equals(inFlowToFlow)) {
																																											if (!divergeFlow1
																																													.equals(step)) {
																																												if (!divergeFlow1
																																														.equals(inFlowToStep)) {
																																													if (!divergeFlow1
																																															.equals(initFlow)) {
																																														if (!divergeFlow1
																																																.equals(outFlowToInitFlow)) {
																																															if (!divergeFlow1
																																																	.equals(outFlowToParallelStep)) {
																																																if (!divergeFlow1
																																																		.equals(lane)) {
																																																	if (!divergeFlow1
																																																			.equals(laneSet)) {
																																																		if (!divergeFlow1
																																																				.equals(divergeFlowToFlow)) {
																																																			if (!flow1
																																																					.equals(process)) {
																																																				if (!flow1
																																																						.equals(inFlow1)) {
																																																					if (!flow1
																																																							.equals(parallelConvGateway)) {
																																																						if (!flow1
																																																								.equals(parallelGateway)) {
																																																							if (!flow1
																																																									.equals(inFlow1ToFlow1)) {
																																																								if (!flow1
																																																										.equals(step1)) {
																																																									if (!flow1
																																																											.equals(inFlow1ToStep1)) {
																																																										if (!flow1
																																																												.equals(parallelStep)) {
																																																											if (!flow1
																																																													.equals(inFlow)) {
																																																												if (!flow1
																																																														.equals(outFlow)) {
																																																													if (!flow1
																																																															.equals(inFlowToFlow)) {
																																																														if (!flow1
																																																																.equals(step)) {
																																																															if (!flow1
																																																																	.equals(inFlowToStep)) {
																																																																if (!flow1
																																																																		.equals(initFlow)) {
																																																																	if (!flow1
																																																																			.equals(outFlowToInitFlow)) {
																																																																		if (!flow1
																																																																				.equals(outFlowToParallelStep)) {
																																																																			if (!flow1
																																																																					.equals(lane)) {
																																																																				if (!flow1
																																																																						.equals(laneSet)) {
																																																																					if (!inFlow1ToFlow1
																																																																							.equals(process)) {
																																																																						if (!inFlow1ToFlow1
																																																																								.equals(parallelConvGateway)) {
																																																																							if (!inFlow1ToFlow1
																																																																									.equals(parallelGateway)) {
																																																																								if (!inFlow1ToFlow1
																																																																										.equals(step1)) {
																																																																									if (!inFlow1ToFlow1
																																																																											.equals(inFlow1ToStep1)) {
																																																																										if (!inFlow1ToFlow1
																																																																												.equals(parallelStep)) {
																																																																											if (!inFlow1ToFlow1
																																																																													.equals(outFlow)) {
																																																																												if (!inFlow1ToFlow1
																																																																														.equals(inFlowToFlow)) {
																																																																													if (!inFlow1ToFlow1
																																																																															.equals(step)) {
																																																																														if (!inFlow1ToFlow1
																																																																																.equals(inFlowToStep)) {
																																																																															if (!inFlow1ToFlow1
																																																																																	.equals(initFlow)) {
																																																																																if (!inFlow1ToFlow1
																																																																																		.equals(outFlowToInitFlow)) {
																																																																																	if (!inFlow1ToFlow1
																																																																																			.equals(outFlowToParallelStep)) {
																																																																																		if (!inFlow1ToFlow1
																																																																																				.equals(lane)) {
																																																																																			if (!inFlow1ToFlow1
																																																																																					.equals(laneSet)) {
																																																																																				if (!inFlow1ToStep1
																																																																																						.equals(process)) {
																																																																																					if (!inFlow1ToStep1
																																																																																							.equals(parallelConvGateway)) {
																																																																																						if (!inFlow1ToStep1
																																																																																								.equals(parallelGateway)) {
																																																																																							if (!inFlow1ToStep1
																																																																																									.equals(step1)) {
																																																																																								if (!inFlow1ToStep1
																																																																																										.equals(parallelStep)) {
																																																																																									if (!inFlow1ToStep1
																																																																																											.equals(outFlow)) {
																																																																																										if (!inFlow1ToStep1
																																																																																												.equals(inFlowToFlow)) {
																																																																																											if (!inFlow1ToStep1
																																																																																													.equals(step)) {
																																																																																												if (!inFlow1ToStep1
																																																																																														.equals(inFlowToStep)) {
																																																																																													if (!inFlow1ToStep1
																																																																																															.equals(initFlow)) {
																																																																																														if (!inFlow1ToStep1
																																																																																																.equals(outFlowToInitFlow)) {
																																																																																															if (!inFlow1ToStep1
																																																																																																	.equals(outFlowToParallelStep)) {
																																																																																																if (!inFlow1ToStep1
																																																																																																		.equals(lane)) {
																																																																																																	if (!inFlow1ToStep1
																																																																																																			.equals(laneSet)) {
																																																																																																		if (!parallelStep
																																																																																																				.equals(process)) {
																																																																																																			if (!parallelStep
																																																																																																					.equals(step1)) {
																																																																																																				if (!parallelStep
																																																																																																						.equals(step)) {
																																																																																																					if (!divergeFlow1ToFlow1
																																																																																																							.equals(process)) {
																																																																																																						if (!divergeFlow1ToFlow1
																																																																																																								.equals(inFlow1)) {
																																																																																																							if (!divergeFlow1ToFlow1
																																																																																																									.equals(parallelConvGateway)) {
																																																																																																								if (!divergeFlow1ToFlow1
																																																																																																										.equals(parallelGateway)) {
																																																																																																									if (!divergeFlow1ToFlow1
																																																																																																											.equals(flow1)) {
																																																																																																										if (!divergeFlow1ToFlow1
																																																																																																												.equals(inFlow1ToFlow1)) {
																																																																																																											if (!divergeFlow1ToFlow1
																																																																																																													.equals(step1)) {
																																																																																																												if (!divergeFlow1ToFlow1
																																																																																																														.equals(inFlow1ToStep1)) {
																																																																																																													if (!divergeFlow1ToFlow1
																																																																																																															.equals(parallelStep)) {
																																																																																																														if (!divergeFlow1ToFlow1
																																																																																																																.equals(inFlow)) {
																																																																																																															if (!divergeFlow1ToFlow1
																																																																																																																	.equals(outFlow)) {
																																																																																																																if (!divergeFlow1ToFlow1
																																																																																																																		.equals(flow)) {
																																																																																																																	if (!divergeFlow1ToFlow1
																																																																																																																			.equals(inFlowToFlow)) {
																																																																																																																		if (!divergeFlow1ToFlow1
																																																																																																																				.equals(step)) {
																																																																																																																			if (!divergeFlow1ToFlow1
																																																																																																																					.equals(inFlowToStep)) {
																																																																																																																				if (!divergeFlow1ToFlow1
																																																																																																																						.equals(initFlow)) {
																																																																																																																					if (!divergeFlow1ToFlow1
																																																																																																																							.equals(outFlowToInitFlow)) {
																																																																																																																						if (!divergeFlow1ToFlow1
																																																																																																																								.equals(outFlowToParallelStep)) {
																																																																																																																							if (!divergeFlow1ToFlow1
																																																																																																																									.equals(lane)) {
																																																																																																																								if (!divergeFlow1ToFlow1
																																																																																																																										.equals(laneSet)) {
																																																																																																																									if (!divergeFlow1ToFlow1
																																																																																																																											.equals(divergeFlowToFlow)) {
																																																																																																																										if (!inFlow
																																																																																																																												.equals(process)) {
																																																																																																																											if (!inFlow
																																																																																																																													.equals(inFlow1)) {
																																																																																																																												if (!inFlow
																																																																																																																														.equals(parallelConvGateway)) {
																																																																																																																													if (!inFlow
																																																																																																																															.equals(parallelGateway)) {
																																																																																																																														if (!inFlow
																																																																																																																																.equals(inFlow1ToFlow1)) {
																																																																																																																															if (!inFlow
																																																																																																																																	.equals(step1)) {
																																																																																																																																if (!inFlow
																																																																																																																																		.equals(inFlow1ToStep1)) {
																																																																																																																																	if (!inFlow
																																																																																																																																			.equals(parallelStep)) {
																																																																																																																																		if (!inFlow
																																																																																																																																				.equals(outFlow)) {
																																																																																																																																			if (!inFlow
																																																																																																																																					.equals(inFlowToFlow)) {
																																																																																																																																				if (!inFlow
																																																																																																																																						.equals(step)) {
																																																																																																																																					if (!inFlow
																																																																																																																																							.equals(inFlowToStep)) {
																																																																																																																																						if (!inFlow
																																																																																																																																								.equals(initFlow)) {
																																																																																																																																							if (!inFlow
																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																								if (!inFlow
																																																																																																																																										.equals(outFlowToParallelStep)) {
																																																																																																																																									if (!inFlow
																																																																																																																																											.equals(lane)) {
																																																																																																																																										if (!inFlow
																																																																																																																																												.equals(laneSet)) {
																																																																																																																																											if (!outFlow
																																																																																																																																													.equals(process)) {
																																																																																																																																												if (!outFlow
																																																																																																																																														.equals(parallelConvGateway)) {
																																																																																																																																													if (!outFlow
																																																																																																																																															.equals(parallelGateway)) {
																																																																																																																																														if (!outFlow
																																																																																																																																																.equals(step1)) {
																																																																																																																																															if (!outFlow
																																																																																																																																																	.equals(parallelStep)) {
																																																																																																																																																if (!outFlow
																																																																																																																																																		.equals(step)) {
																																																																																																																																																	if (!outFlow
																																																																																																																																																			.equals(outFlowToInitFlow)) {
																																																																																																																																																		if (!outFlow
																																																																																																																																																				.equals(outFlowToParallelStep)) {
																																																																																																																																																			if (!flow
																																																																																																																																																					.equals(process)) {
																																																																																																																																																				if (!flow
																																																																																																																																																						.equals(inFlow1)) {
																																																																																																																																																					if (!flow
																																																																																																																																																							.equals(parallelConvGateway)) {
																																																																																																																																																						if (!flow
																																																																																																																																																								.equals(parallelGateway)) {
																																																																																																																																																							if (!flow
																																																																																																																																																									.equals(flow1)) {
																																																																																																																																																								if (!flow
																																																																																																																																																										.equals(inFlow1ToFlow1)) {
																																																																																																																																																									if (!flow
																																																																																																																																																											.equals(step1)) {
																																																																																																																																																										if (!flow
																																																																																																																																																												.equals(inFlow1ToStep1)) {
																																																																																																																																																											if (!flow
																																																																																																																																																													.equals(parallelStep)) {
																																																																																																																																																												if (!flow
																																																																																																																																																														.equals(inFlow)) {
																																																																																																																																																													if (!flow
																																																																																																																																																															.equals(outFlow)) {
																																																																																																																																																														if (!flow
																																																																																																																																																																.equals(inFlowToFlow)) {
																																																																																																																																																															if (!flow
																																																																																																																																																																	.equals(step)) {
																																																																																																																																																																if (!flow
																																																																																																																																																																		.equals(inFlowToStep)) {
																																																																																																																																																																	if (!flow
																																																																																																																																																																			.equals(initFlow)) {
																																																																																																																																																																		if (!flow
																																																																																																																																																																				.equals(outFlowToInitFlow)) {
																																																																																																																																																																			if (!flow
																																																																																																																																																																					.equals(outFlowToParallelStep)) {
																																																																																																																																																																				if (!flow
																																																																																																																																																																						.equals(lane)) {
																																																																																																																																																																					if (!flow
																																																																																																																																																																							.equals(laneSet)) {
																																																																																																																																																																						if (!inFlowToFlow
																																																																																																																																																																								.equals(process)) {
																																																																																																																																																																							if (!inFlowToFlow
																																																																																																																																																																									.equals(parallelConvGateway)) {
																																																																																																																																																																								if (!inFlowToFlow
																																																																																																																																																																										.equals(parallelGateway)) {
																																																																																																																																																																									if (!inFlowToFlow
																																																																																																																																																																											.equals(step1)) {
																																																																																																																																																																										if (!inFlowToFlow
																																																																																																																																																																												.equals(parallelStep)) {
																																																																																																																																																																											if (!inFlowToFlow
																																																																																																																																																																													.equals(outFlow)) {
																																																																																																																																																																												if (!inFlowToFlow
																																																																																																																																																																														.equals(step)) {
																																																																																																																																																																													if (!inFlowToFlow
																																																																																																																																																																															.equals(inFlowToStep)) {
																																																																																																																																																																														if (!inFlowToFlow
																																																																																																																																																																																.equals(initFlow)) {
																																																																																																																																																																															if (!inFlowToFlow
																																																																																																																																																																																	.equals(outFlowToInitFlow)) {
																																																																																																																																																																																if (!inFlowToFlow
																																																																																																																																																																																		.equals(outFlowToParallelStep)) {
																																																																																																																																																																																	if (!inFlowToFlow
																																																																																																																																																																																			.equals(lane)) {
																																																																																																																																																																																		if (!inFlowToFlow
																																																																																																																																																																																				.equals(laneSet)) {
																																																																																																																																																																																			if (!step
																																																																																																																																																																																					.equals(step1)) {
																																																																																																																																																																																				if (!inFlowToStep
																																																																																																																																																																																						.equals(process)) {
																																																																																																																																																																																					if (!inFlowToStep
																																																																																																																																																																																							.equals(parallelConvGateway)) {
																																																																																																																																																																																						if (!inFlowToStep
																																																																																																																																																																																								.equals(parallelGateway)) {
																																																																																																																																																																																							if (!inFlowToStep
																																																																																																																																																																																									.equals(step1)) {
																																																																																																																																																																																								if (!inFlowToStep
																																																																																																																																																																																										.equals(parallelStep)) {
																																																																																																																																																																																									if (!inFlowToStep
																																																																																																																																																																																											.equals(outFlow)) {
																																																																																																																																																																																										if (!inFlowToStep
																																																																																																																																																																																												.equals(step)) {
																																																																																																																																																																																											if (!inFlowToStep
																																																																																																																																																																																													.equals(initFlow)) {
																																																																																																																																																																																												if (!inFlowToStep
																																																																																																																																																																																														.equals(outFlowToInitFlow)) {
																																																																																																																																																																																													if (!inFlowToStep
																																																																																																																																																																																															.equals(outFlowToParallelStep)) {
																																																																																																																																																																																														if (!inFlowToStep
																																																																																																																																																																																																.equals(lane)) {
																																																																																																																																																																																															if (!inFlowToStep
																																																																																																																																																																																																	.equals(laneSet)) {
																																																																																																																																																																																																if (!initFlow
																																																																																																																																																																																																		.equals(process)) {
																																																																																																																																																																																																	if (!initFlow
																																																																																																																																																																																																			.equals(parallelConvGateway)) {
																																																																																																																																																																																																		if (!initFlow
																																																																																																																																																																																																				.equals(parallelGateway)) {
																																																																																																																																																																																																			if (!initFlow
																																																																																																																																																																																																					.equals(step1)) {
																																																																																																																																																																																																				if (!initFlow
																																																																																																																																																																																																						.equals(parallelStep)) {
																																																																																																																																																																																																					if (!initFlow
																																																																																																																																																																																																							.equals(outFlow)) {
																																																																																																																																																																																																						if (!initFlow
																																																																																																																																																																																																								.equals(step)) {
																																																																																																																																																																																																							if (!initFlow
																																																																																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																								if (!initFlow
																																																																																																																																																																																																										.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																									if (!initFlow
																																																																																																																																																																																																											.equals(lane)) {
																																																																																																																																																																																																										if (!initFlow
																																																																																																																																																																																																												.equals(laneSet)) {
																																																																																																																																																																																																											if (!outFlowToInitFlow
																																																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																																																												if (!outFlowToInitFlow
																																																																																																																																																																																																														.equals(parallelConvGateway)) {
																																																																																																																																																																																																													if (!outFlowToInitFlow
																																																																																																																																																																																																															.equals(parallelGateway)) {
																																																																																																																																																																																																														if (!outFlowToInitFlow
																																																																																																																																																																																																																.equals(step1)) {
																																																																																																																																																																																																															if (!outFlowToInitFlow
																																																																																																																																																																																																																	.equals(parallelStep)) {
																																																																																																																																																																																																																if (!outFlowToInitFlow
																																																																																																																																																																																																																		.equals(step)) {
																																																																																																																																																																																																																	if (!outFlowToInitFlow
																																																																																																																																																																																																																			.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																																		if (!outFlowToParallelStep
																																																																																																																																																																																																																				.equals(process)) {
																																																																																																																																																																																																																			if (!outFlowToParallelStep
																																																																																																																																																																																																																					.equals(parallelConvGateway)) {
																																																																																																																																																																																																																				if (!outFlowToParallelStep
																																																																																																																																																																																																																						.equals(parallelGateway)) {
																																																																																																																																																																																																																					if (!outFlowToParallelStep
																																																																																																																																																																																																																							.equals(step1)) {
																																																																																																																																																																																																																						if (!outFlowToParallelStep
																																																																																																																																																																																																																								.equals(parallelStep)) {
																																																																																																																																																																																																																							if (!outFlowToParallelStep
																																																																																																																																																																																																																									.equals(step)) {
																																																																																																																																																																																																																								if (!lane
																																																																																																																																																																																																																										.equals(process)) {
																																																																																																																																																																																																																									if (!lane
																																																																																																																																																																																																																											.equals(parallelConvGateway)) {
																																																																																																																																																																																																																										if (!lane
																																																																																																																																																																																																																												.equals(parallelGateway)) {
																																																																																																																																																																																																																											if (!lane
																																																																																																																																																																																																																													.equals(step1)) {
																																																																																																																																																																																																																												if (!lane
																																																																																																																																																																																																																														.equals(parallelStep)) {
																																																																																																																																																																																																																													if (!lane
																																																																																																																																																																																																																															.equals(outFlow)) {
																																																																																																																																																																																																																														if (!lane
																																																																																																																																																																																																																																.equals(step)) {
																																																																																																																																																																																																																															if (!lane
																																																																																																																																																																																																																																	.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																if (!lane
																																																																																																																																																																																																																																		.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																																																	if (!lane
																																																																																																																																																																																																																																			.equals(laneSet)) {
																																																																																																																																																																																																																																		if (!laneSet
																																																																																																																																																																																																																																				.equals(process)) {
																																																																																																																																																																																																																																			if (!laneSet
																																																																																																																																																																																																																																					.equals(parallelConvGateway)) {
																																																																																																																																																																																																																																				if (!laneSet
																																																																																																																																																																																																																																						.equals(parallelGateway)) {
																																																																																																																																																																																																																																					if (!laneSet
																																																																																																																																																																																																																																							.equals(step1)) {
																																																																																																																																																																																																																																						if (!laneSet
																																																																																																																																																																																																																																								.equals(parallelStep)) {
																																																																																																																																																																																																																																							if (!laneSet
																																																																																																																																																																																																																																									.equals(outFlow)) {
																																																																																																																																																																																																																																								if (!laneSet
																																																																																																																																																																																																																																										.equals(step)) {
																																																																																																																																																																																																																																									if (!laneSet
																																																																																																																																																																																																																																											.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																										if (!laneSet
																																																																																																																																																																																																																																												.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																																																											if (!divergeFlow
																																																																																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																																																																																												if (!divergeFlow
																																																																																																																																																																																																																																														.equals(inFlow1)) {
																																																																																																																																																																																																																																													if (!divergeFlow
																																																																																																																																																																																																																																															.equals(parallelConvGateway)) {
																																																																																																																																																																																																																																														if (!divergeFlow
																																																																																																																																																																																																																																																.equals(parallelGateway)) {
																																																																																																																																																																																																																																															if (!divergeFlow
																																																																																																																																																																																																																																																	.equals(divergeFlow1)) {
																																																																																																																																																																																																																																																if (!divergeFlow
																																																																																																																																																																																																																																																		.equals(flow1)) {
																																																																																																																																																																																																																																																	if (!divergeFlow
																																																																																																																																																																																																																																																			.equals(inFlow1ToFlow1)) {
																																																																																																																																																																																																																																																		if (!divergeFlow
																																																																																																																																																																																																																																																				.equals(step1)) {
																																																																																																																																																																																																																																																			if (!divergeFlow
																																																																																																																																																																																																																																																					.equals(inFlow1ToStep1)) {
																																																																																																																																																																																																																																																				if (!divergeFlow
																																																																																																																																																																																																																																																						.equals(parallelStep)) {
																																																																																																																																																																																																																																																					if (!divergeFlow
																																																																																																																																																																																																																																																							.equals(divergeFlow1ToFlow1)) {
																																																																																																																																																																																																																																																						if (!divergeFlow
																																																																																																																																																																																																																																																								.equals(inFlow)) {
																																																																																																																																																																																																																																																							if (!divergeFlow
																																																																																																																																																																																																																																																									.equals(outFlow)) {
																																																																																																																																																																																																																																																								if (!divergeFlow
																																																																																																																																																																																																																																																										.equals(flow)) {
																																																																																																																																																																																																																																																									if (!divergeFlow
																																																																																																																																																																																																																																																											.equals(inFlowToFlow)) {
																																																																																																																																																																																																																																																										if (!divergeFlow
																																																																																																																																																																																																																																																												.equals(step)) {
																																																																																																																																																																																																																																																											if (!divergeFlow
																																																																																																																																																																																																																																																													.equals(inFlowToStep)) {
																																																																																																																																																																																																																																																												if (!divergeFlow
																																																																																																																																																																																																																																																														.equals(initFlow)) {
																																																																																																																																																																																																																																																													if (!divergeFlow
																																																																																																																																																																																																																																																															.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																																														if (!divergeFlow
																																																																																																																																																																																																																																																																.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																																																																															if (!divergeFlow
																																																																																																																																																																																																																																																																	.equals(lane)) {
																																																																																																																																																																																																																																																																if (!divergeFlow
																																																																																																																																																																																																																																																																		.equals(laneSet)) {
																																																																																																																																																																																																																																																																	if (!divergeFlow
																																																																																																																																																																																																																																																																			.equals(divergeFlowToFlow)) {
																																																																																																																																																																																																																																																																		if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																				.equals(process)) {
																																																																																																																																																																																																																																																																			if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																					.equals(inFlow1)) {
																																																																																																																																																																																																																																																																				if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																						.equals(parallelConvGateway)) {
																																																																																																																																																																																																																																																																					if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																							.equals(parallelGateway)) {
																																																																																																																																																																																																																																																																						if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																								.equals(flow1)) {
																																																																																																																																																																																																																																																																							if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																									.equals(inFlow1ToFlow1)) {
																																																																																																																																																																																																																																																																								if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																										.equals(step1)) {
																																																																																																																																																																																																																																																																									if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																											.equals(inFlow1ToStep1)) {
																																																																																																																																																																																																																																																																										if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																												.equals(parallelStep)) {
																																																																																																																																																																																																																																																																											if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																													.equals(inFlow)) {
																																																																																																																																																																																																																																																																												if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																														.equals(outFlow)) {
																																																																																																																																																																																																																																																																													if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																															.equals(flow)) {
																																																																																																																																																																																																																																																																														if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																.equals(inFlowToFlow)) {
																																																																																																																																																																																																																																																																															if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																	.equals(step)) {
																																																																																																																																																																																																																																																																																if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																		.equals(inFlowToStep)) {
																																																																																																																																																																																																																																																																																	if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																			.equals(initFlow)) {
																																																																																																																																																																																																																																																																																		if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																				.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																																																																			if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																					.equals(outFlowToParallelStep)) {
																																																																																																																																																																																																																																																																																				if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																						.equals(lane)) {
																																																																																																																																																																																																																																																																																					if (!divergeFlowToFlow
																																																																																																																																																																																																																																																																																							.equals(laneSet)) {
																																																																																																																																																																																																																																																																																						return new Object[] {
																																																																																																																																																																																																																																																																																								ruleresult,
																																																																																																																																																																																																																																																																																								process,
																																																																																																																																																																																																																																																																																								inFlow1,
																																																																																																																																																																																																																																																																																								parallelConvGateway,
																																																																																																																																																																																																																																																																																								parallelGateway,
																																																																																																																																																																																																																																																																																								divergeFlow1,
																																																																																																																																																																																																																																																																																								flow1,
																																																																																																																																																																																																																																																																																								inFlow1ToFlow1,
																																																																																																																																																																																																																																																																																								step1,
																																																																																																																																																																																																																																																																																								inFlow1ToStep1,
																																																																																																																																																																																																																																																																																								parallelStep,
																																																																																																																																																																																																																																																																																								divergeFlow1ToFlow1,
																																																																																																																																																																																																																																																																																								inFlow,
																																																																																																																																																																																																																																																																																								outFlow,
																																																																																																																																																																																																																																																																																								flow,
																																																																																																																																																																																																																																																																																								inFlowToFlow,
																																																																																																																																																																																																																																																																																								step,
																																																																																																																																																																																																																																																																																								inFlowToStep,
																																																																																																																																																																																																																																																																																								initFlow,
																																																																																																																																																																																																																																																																																								outFlowToInitFlow,
																																																																																																																																																																																																																																																																																								outFlowToParallelStep,
																																																																																																																																																																																																																																																																																								lane,
																																																																																																																																																																																																																																																																																								laneSet,
																																																																																																																																																																																																																																																																																								divergeFlow,
																																																																																																																																																																																																																																																																																								divergeFlowToFlow };
																																																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject inFlow1,
			EObject parallelConvGateway, EObject parallelStep, EObject inFlow,
			EObject outFlow, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane) {
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__initFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToParallelStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToParallelStep__parallelStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelConvergingGatewayTwoInputsRule";
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String inFlow1__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow1____incoming_name_prime = "incoming";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String outFlowToInitFlow__outFlow____source_name_prime = "source";
		String outFlowToInitFlow__initFlow____target_name_prime = "target";
		String outFlowToParallelStep__outFlow____source_name_prime = "source";
		String outFlowToParallelStep__parallelStep____target_name_prime = "target";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				process__parallelConvGateway____flowElements);
		inFlow1__parallelConvGateway____targetRef.setSrc(inFlow1);
		inFlow1__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow1__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow1____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow1____incoming.setTrg(inFlow1);
		ruleresult.getTranslatedEdges().add(
				parallelConvGateway__inFlow1____incoming);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				parallelConvGateway__outFlow____outgoing);
		outFlowToInitFlow__outFlow____source.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__outFlow____source);
		outFlowToInitFlow__initFlow____target.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__initFlow____target.setTrg(initFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__initFlow____target);
		outFlowToParallelStep__outFlow____source.setSrc(outFlowToParallelStep);
		outFlowToParallelStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(
				outFlowToParallelStep__outFlow____source);
		outFlowToParallelStep__parallelStep____target
				.setSrc(outFlowToParallelStep);
		outFlowToParallelStep__parallelStep____target.setTrg(parallelStep);
		ruleresult.getCreatedEdges().add(
				outFlowToParallelStep__parallelStep____target);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		ruleresult.getTranslatedEdges().add(
				lane__parallelConvGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		inFlow1__parallelConvGateway____targetRef
				.setName(inFlow1__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow1____incoming
				.setName(parallelConvGateway__inFlow1____incoming_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		outFlowToInitFlow__outFlow____source
				.setName(outFlowToInitFlow__outFlow____source_name_prime);
		outFlowToInitFlow__initFlow____target
				.setName(outFlowToInitFlow__initFlow____target_name_prime);
		outFlowToParallelStep__outFlow____source
				.setName(outFlowToParallelStep__outFlow____source_name_prime);
		outFlowToParallelStep__parallelStep____target
				.setName(outFlowToParallelStep__parallelStep____target_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, process, inFlow1,
				parallelConvGateway, parallelStep, inFlow, outFlow, initFlow,
				outFlowToInitFlow, outFlowToParallelStep, lane,
				process__parallelConvGateway____flowElements,
				inFlow1__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow1____incoming,
				process__outFlow____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing,
				outFlowToInitFlow__outFlow____source,
				outFlowToInitFlow__initFlow____target,
				outFlowToParallelStep__outFlow____source,
				outFlowToParallelStep__parallelStep____target,
				lane__parallelConvGateway____flowNodeRefs };
	}

	public static final void pattern_ParallelConvergingGatewayTwoInputsRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			PerformRuleResult ruleresult, EObject process, EObject inFlow1,
			EObject parallelConvGateway, EObject parallelGateway,
			EObject divergeFlow1, EObject flow1, EObject inFlow1ToFlow1,
			EObject step1, EObject inFlow1ToStep1, EObject parallelStep,
			EObject divergeFlow1ToFlow1, EObject inFlow, EObject outFlow,
			EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		_this.registerObjects_FWD(ruleresult, process, inFlow1,
				parallelConvGateway, parallelGateway, divergeFlow1, flow1,
				inFlow1ToFlow1, step1, inFlow1ToStep1, parallelStep,
				divergeFlow1ToFlow1, inFlow, outFlow, flow, inFlowToFlow, step,
				inFlowToStep, initFlow, outFlowToInitFlow,
				outFlowToParallelStep, lane, laneSet, divergeFlow,
				divergeFlowToFlow);

	}

	public static final PerformRuleResult pattern_ParallelConvergingGatewayTwoInputsRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_1_blackFBB(
			EClass eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_2_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelConvergingGatewayTwoInputsRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_2_bindingFFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow1");
		EObject _localVariable_2 = match.getObject("parallelConvGateway");
		EObject _localVariable_3 = match.getObject("parallelGateway");
		EObject _localVariable_4 = match.getObject("divergeFlow1");
		EObject _localVariable_5 = match.getObject("inFlow");
		EObject _localVariable_6 = match.getObject("outFlow");
		EObject _localVariable_7 = match.getObject("lane");
		EObject _localVariable_8 = match.getObject("laneSet");
		EObject _localVariable_9 = match.getObject("divergeFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow1 = _localVariable_1;
		EObject tmpParallelConvGateway = _localVariable_2;
		EObject tmpParallelGateway = _localVariable_3;
		EObject tmpDivergeFlow1 = _localVariable_4;
		EObject tmpInFlow = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		EObject tmpDivergeFlow = _localVariable_9;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow1 instanceof SequenceFlow) {
				SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
				if (tmpParallelConvGateway instanceof ParallelGateway) {
					ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
					if (tmpParallelGateway instanceof ParallelGateway) {
						ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
						if (tmpDivergeFlow1 instanceof SequenceFlow) {
							SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											if (tmpDivergeFlow instanceof SequenceFlow) {
												SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
												return new Object[] { process,
														inFlow1,
														parallelConvGateway,
														parallelGateway,
														divergeFlow1, inFlow,
														outFlow, lane, laneSet,
														divergeFlow, match };
											}
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

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_2_2_blackBBBBBFFFFFBBFFFFBBBFB(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!inFlow.equals(inFlow1)) {
								if (!inFlow.equals(outFlow)) {
									if (!divergeFlow.equals(inFlow1)) {
										if (!divergeFlow.equals(divergeFlow1)) {
											if (!divergeFlow.equals(inFlow)) {
												if (!divergeFlow
														.equals(outFlow)) {
													for (SequenceFlowToUCFlow inFlow1ToFlow1 : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	inFlow1,
																	SequenceFlowToUCFlow.class,
																	"source")) {
														Flow tmpFlow1 = inFlow1ToFlow1
																.getTarget();
														if (tmpFlow1 instanceof ParallelFlow) {
															ParallelFlow flow1 = (ParallelFlow) tmpFlow1;
															for (SequenceFlowToStep inFlow1ToStep1 : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			inFlow1,
																			SequenceFlowToStep.class,
																			"source")) {
																Step step1 = inFlow1ToStep1
																		.getTarget();
																if (step1 != null) {
																	for (SequenceFlowToUCFlow divergeFlow1ToFlow1 : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					divergeFlow1,
																					SequenceFlowToUCFlow.class,
																					"source")) {
																		if (!divergeFlow1ToFlow1
																				.equals(inFlow1ToFlow1)) {
																			if (flow1
																					.equals(divergeFlow1ToFlow1
																							.getTarget())) {
																				for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								inFlow,
																								SequenceFlowToUCFlow.class,
																								"source")) {
																					if (!inFlow1ToFlow1
																							.equals(inFlowToFlow)) {
																						if (!divergeFlow1ToFlow1
																								.equals(inFlowToFlow)) {
																							Flow tmpFlow = inFlowToFlow
																									.getTarget();
																							if (tmpFlow instanceof ParallelFlow) {
																								ParallelFlow flow = (ParallelFlow) tmpFlow;
																								if (!flow
																										.equals(flow1)) {
																									for (SequenceFlowToStep inFlowToStep : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													inFlow,
																													SequenceFlowToStep.class,
																													"source")) {
																										if (!inFlow1ToStep1
																												.equals(inFlowToStep)) {
																											Step step = inFlowToStep
																													.getTarget();
																											if (step != null) {
																												if (!step
																														.equals(step1)) {
																													for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	divergeFlow,
																																	SequenceFlowToUCFlow.class,
																																	"source")) {
																														if (!divergeFlow1ToFlow1
																																.equals(divergeFlowToFlow)) {
																															if (!divergeFlowToFlow
																																	.equals(inFlow1ToFlow1)) {
																																if (!divergeFlowToFlow
																																		.equals(inFlowToFlow)) {
																																	if (flow.equals(divergeFlowToFlow
																																			.getTarget())) {
																																		_result.add(new Object[] {
																																				process,
																																				inFlow1,
																																				parallelConvGateway,
																																				parallelGateway,
																																				divergeFlow1,
																																				flow1,
																																				inFlow1ToFlow1,
																																				step1,
																																				inFlow1ToStep1,
																																				divergeFlow1ToFlow1,
																																				inFlow,
																																				outFlow,
																																				flow,
																																				inFlowToFlow,
																																				step,
																																				inFlowToStep,
																																				lane,
																																				laneSet,
																																				divergeFlow,
																																				divergeFlowToFlow,
																																				match });
																																	}
																																}
																															}
																														}
																													}
																												}
																											}

																										}
																									}
																								}
																							}

																						}
																					}
																				}
																			}
																		}
																	}
																}

															}
														}

													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_3_black_nac_0BBB(
			Step step, Step step1, ParallelStep parallelStep) {
		if (!step.equals(step1)) {
			if (!parallelStep.equals(step)) {
				if (!parallelStep.equals(step1)) {
					Step nextStep = step.getNext();
					if (nextStep != null) {
						if (!step.equals(nextStep)) {
							if (!step1.equals(nextStep)) {
								if (!parallelStep.equals(nextStep)) {
									return new Object[] { step, step1,
											parallelStep };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_2_3_blackBBBBBBBBBFBBBBBBBFBBBB(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Lane lane, LaneSet laneSet,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow1.equals(outFlow)) {
			if (!parallelConvGateway.equals(parallelGateway)) {
				if (!divergeFlow1.equals(inFlow1)) {
					if (!divergeFlow1.equals(inFlow)) {
						if (!divergeFlow1.equals(outFlow)) {
							if (!inFlow1ToFlow1.equals(inFlowToFlow)) {
								if (!inFlow1ToStep1.equals(inFlowToStep)) {
									if (!divergeFlow1ToFlow1
											.equals(inFlow1ToFlow1)) {
										if (!divergeFlow1ToFlow1
												.equals(inFlowToFlow)) {
											if (!divergeFlow1ToFlow1
													.equals(divergeFlowToFlow)) {
												if (!inFlow.equals(inFlow1)) {
													if (!inFlow.equals(outFlow)) {
														if (!flow.equals(flow1)) {
															if (!step
																	.equals(step1)) {
																if (!divergeFlow
																		.equals(inFlow1)) {
																	if (!divergeFlow
																			.equals(divergeFlow1)) {
																		if (!divergeFlow
																				.equals(inFlow)) {
																			if (!divergeFlow
																					.equals(outFlow)) {
																				if (!divergeFlowToFlow
																						.equals(inFlow1ToFlow1)) {
																					if (!divergeFlowToFlow
																							.equals(inFlowToFlow)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										inFlow1)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											parallelConvGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												divergeFlow1)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													parallelGateway)) {
																										if (parallelConvGateway
																												.equals(inFlow1
																														.getTargetRef())) {
																											if (parallelGateway
																													.equals(divergeFlow1
																															.getSourceRef())) {
																												if (flow1
																														.getSteps()
																														.contains(
																																step1)) {
																													if (inFlow1
																															.equals(inFlow1ToFlow1
																																	.getSource())) {
																														if (flow1
																																.equals(inFlow1ToFlow1
																																		.getTarget())) {
																															if (inFlow1
																																	.equals(inFlow1ToStep1
																																			.getSource())) {
																																if (step1
																																		.equals(inFlow1ToStep1
																																				.getTarget())) {
																																	if (divergeFlow1
																																			.equals(divergeFlow1ToFlow1
																																					.getSource())) {
																																		if (flow1
																																				.equals(divergeFlow1ToFlow1
																																						.getTarget())) {
																																			if (process
																																					.getFlowElements()
																																					.contains(
																																							inFlow)) {
																																				if (process
																																						.getLaneSets()
																																						.contains(
																																								laneSet)) {
																																					if (process
																																							.getFlowElements()
																																							.contains(
																																									outFlow)) {
																																						if (process
																																								.getFlowElements()
																																								.contains(
																																										divergeFlow)) {
																																							if (parallelConvGateway
																																									.equals(inFlow
																																											.getTargetRef())) {
																																								if (parallelConvGateway
																																										.equals(outFlow
																																												.getSourceRef())) {
																																									if (flow.getSteps()
																																											.contains(
																																													step)) {
																																										if (inFlow
																																												.equals(inFlowToFlow
																																														.getSource())) {
																																											if (flow.equals(inFlowToFlow
																																													.getTarget())) {
																																												if (inFlow
																																														.equals(inFlowToStep
																																																.getSource())) {
																																													if (step.equals(inFlowToStep
																																															.getTarget())) {
																																														if (lane.getFlowNodeRefs()
																																																.contains(
																																																		parallelConvGateway)) {
																																															if (laneSet
																																																	.getLanes()
																																																	.contains(
																																																			lane)) {
																																																if (parallelGateway
																																																		.equals(divergeFlow
																																																				.getSourceRef())) {
																																																	if (divergeFlow
																																																			.equals(divergeFlowToFlow
																																																					.getSource())) {
																																																		if (flow.equals(divergeFlowToFlow
																																																				.getTarget())) {
																																																			for (ParallelStep parallelStep : org.moflon.core.utilities.eMoflonEMFUtil
																																																					.getOppositeReferenceTyped(
																																																							flow1,
																																																							ParallelStep.class,
																																																							"invokedFlows")) {
																																																				if (!parallelStep
																																																						.equals(step1)) {
																																																					if (!parallelStep
																																																							.equals(step)) {
																																																						if (parallelStep
																																																								.getInvokedFlows()
																																																								.contains(
																																																										flow)) {
																																																							if (pattern_ParallelConvergingGatewayTwoInputsRule_2_3_black_nac_0BBB(
																																																									step,
																																																									step1,
																																																									parallelStep) == null) {
																																																								for (Flow initFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																																										.getOppositeReferenceTyped(
																																																												parallelStep,
																																																												Flow.class,
																																																												"steps")) {
																																																									if (!flow1
																																																											.equals(initFlow)) {
																																																										if (!flow
																																																												.equals(initFlow)) {
																																																											_result.add(new Object[] {
																																																													process,
																																																													inFlow1,
																																																													parallelConvGateway,
																																																													parallelGateway,
																																																													divergeFlow1,
																																																													flow1,
																																																													inFlow1ToFlow1,
																																																													step1,
																																																													inFlow1ToStep1,
																																																													parallelStep,
																																																													divergeFlow1ToFlow1,
																																																													inFlow,
																																																													outFlow,
																																																													flow,
																																																													inFlowToFlow,
																																																													step,
																																																													inFlowToStep,
																																																													initFlow,
																																																													lane,
																																																													laneSet,
																																																													divergeFlow,
																																																													divergeFlowToFlow });
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_3_greenBBBBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__inFlow1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__parallelGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow1__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow1__step1____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1ToFlow1__inFlow1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1ToFlow1__flow1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1ToStep1__inFlow1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow1ToStep1__step1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__flow1____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow1ToFlow1__divergeFlow1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow1ToFlow1__flow1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__parallelConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__parallelConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge initFlow__parallelStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__parallelConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__parallelGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parallelGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__divergeFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__inFlow1____flowElements_name_prime = "flowElements";
		String process__parallelConvGateway____flowElements_name_prime = "flowElements";
		String process__divergeFlow1____flowElements_name_prime = "flowElements";
		String process__parallelGateway____flowElements_name_prime = "flowElements";
		String inFlow1__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow1____incoming_name_prime = "incoming";
		String divergeFlow1__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow1____outgoing_name_prime = "outgoing";
		String flow1__step1____steps_name_prime = "steps";
		String inFlow1ToFlow1__inFlow1____source_name_prime = "source";
		String inFlow1ToFlow1__flow1____target_name_prime = "target";
		String inFlow1ToStep1__inFlow1____source_name_prime = "source";
		String inFlow1ToStep1__step1____target_name_prime = "target";
		String parallelStep__flow1____invokedFlows_name_prime = "invokedFlows";
		String divergeFlow1ToFlow1__divergeFlow1____source_name_prime = "source";
		String divergeFlow1ToFlow1__flow1____target_name_prime = "target";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String inFlow__parallelConvGateway____targetRef_name_prime = "targetRef";
		String parallelConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__parallelConvGateway____sourceRef_name_prime = "sourceRef";
		String parallelConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String flow__step____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String inFlowToStep__inFlow____source_name_prime = "source";
		String inFlowToStep__step____target_name_prime = "target";
		String initFlow__parallelStep____steps_name_prime = "steps";
		String parallelStep__flow____invokedFlows_name_prime = "invokedFlows";
		String lane__parallelConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		String divergeFlow__parallelGateway____sourceRef_name_prime = "sourceRef";
		String parallelGateway__divergeFlow____outgoing_name_prime = "outgoing";
		String divergeFlowToFlow__divergeFlow____source_name_prime = "source";
		String divergeFlowToFlow__flow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow1);
		isApplicableMatch.getAllContextElements().add(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(parallelGateway);
		isApplicableMatch.getAllContextElements().add(divergeFlow1);
		isApplicableMatch.getAllContextElements().add(flow1);
		isApplicableMatch.getAllContextElements().add(inFlow1ToFlow1);
		isApplicableMatch.getAllContextElements().add(step1);
		isApplicableMatch.getAllContextElements().add(inFlow1ToStep1);
		isApplicableMatch.getAllContextElements().add(parallelStep);
		isApplicableMatch.getAllContextElements().add(divergeFlow1ToFlow1);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(inFlowToStep);
		isApplicableMatch.getAllContextElements().add(initFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(divergeFlow);
		isApplicableMatch.getAllContextElements().add(divergeFlowToFlow);
		process__inFlow1____flowElements.setSrc(process);
		process__inFlow1____flowElements.setTrg(inFlow1);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow1____flowElements);
		process__parallelConvGateway____flowElements.setSrc(process);
		process__parallelConvGateway____flowElements
				.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelConvGateway____flowElements);
		process__divergeFlow1____flowElements.setSrc(process);
		process__divergeFlow1____flowElements.setTrg(divergeFlow1);
		isApplicableMatch.getAllContextElements().add(
				process__divergeFlow1____flowElements);
		process__parallelGateway____flowElements.setSrc(process);
		process__parallelGateway____flowElements.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				process__parallelGateway____flowElements);
		inFlow1__parallelConvGateway____targetRef.setSrc(inFlow1);
		inFlow1__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow1__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow1____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow1____incoming.setTrg(inFlow1);
		isApplicableMatch.getAllContextElements().add(
				parallelConvGateway__inFlow1____incoming);
		divergeFlow1__parallelGateway____sourceRef.setSrc(divergeFlow1);
		divergeFlow1__parallelGateway____sourceRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow1__parallelGateway____sourceRef);
		parallelGateway__divergeFlow1____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow1____outgoing.setTrg(divergeFlow1);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__divergeFlow1____outgoing);
		flow1__step1____steps.setSrc(flow1);
		flow1__step1____steps.setTrg(step1);
		isApplicableMatch.getAllContextElements().add(flow1__step1____steps);
		inFlow1ToFlow1__inFlow1____source.setSrc(inFlow1ToFlow1);
		inFlow1ToFlow1__inFlow1____source.setTrg(inFlow1);
		isApplicableMatch.getAllContextElements().add(
				inFlow1ToFlow1__inFlow1____source);
		inFlow1ToFlow1__flow1____target.setSrc(inFlow1ToFlow1);
		inFlow1ToFlow1__flow1____target.setTrg(flow1);
		isApplicableMatch.getAllContextElements().add(
				inFlow1ToFlow1__flow1____target);
		inFlow1ToStep1__inFlow1____source.setSrc(inFlow1ToStep1);
		inFlow1ToStep1__inFlow1____source.setTrg(inFlow1);
		isApplicableMatch.getAllContextElements().add(
				inFlow1ToStep1__inFlow1____source);
		inFlow1ToStep1__step1____target.setSrc(inFlow1ToStep1);
		inFlow1ToStep1__step1____target.setTrg(step1);
		isApplicableMatch.getAllContextElements().add(
				inFlow1ToStep1__step1____target);
		parallelStep__flow1____invokedFlows.setSrc(parallelStep);
		parallelStep__flow1____invokedFlows.setTrg(flow1);
		isApplicableMatch.getAllContextElements().add(
				parallelStep__flow1____invokedFlows);
		divergeFlow1ToFlow1__divergeFlow1____source.setSrc(divergeFlow1ToFlow1);
		divergeFlow1ToFlow1__divergeFlow1____source.setTrg(divergeFlow1);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow1ToFlow1__divergeFlow1____source);
		divergeFlow1ToFlow1__flow1____target.setSrc(divergeFlow1ToFlow1);
		divergeFlow1ToFlow1__flow1____target.setTrg(flow1);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow1ToFlow1__flow1____target);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				process__divergeFlow____flowElements);
		inFlow__parallelConvGateway____targetRef.setSrc(inFlow);
		inFlow__parallelConvGateway____targetRef.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__parallelConvGateway____targetRef);
		parallelConvGateway__inFlow____incoming.setSrc(parallelConvGateway);
		parallelConvGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelConvGateway__inFlow____incoming);
		outFlow__parallelConvGateway____sourceRef.setSrc(outFlow);
		outFlow__parallelConvGateway____sourceRef.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__parallelConvGateway____sourceRef);
		parallelConvGateway__outFlow____outgoing.setSrc(parallelConvGateway);
		parallelConvGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelConvGateway__outFlow____outgoing);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		inFlowToStep__inFlow____source.setSrc(inFlowToStep);
		inFlowToStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__inFlow____source);
		inFlowToStep__step____target.setSrc(inFlowToStep);
		inFlowToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__step____target);
		initFlow__parallelStep____steps.setSrc(initFlow);
		initFlow__parallelStep____steps.setTrg(parallelStep);
		isApplicableMatch.getAllContextElements().add(
				initFlow__parallelStep____steps);
		parallelStep__flow____invokedFlows.setSrc(parallelStep);
		parallelStep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				parallelStep__flow____invokedFlows);
		lane__parallelConvGateway____flowNodeRefs.setSrc(lane);
		lane__parallelConvGateway____flowNodeRefs.setTrg(parallelConvGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__parallelConvGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		divergeFlow__parallelGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__parallelGateway____sourceRef.setTrg(parallelGateway);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow__parallelGateway____sourceRef);
		parallelGateway__divergeFlow____outgoing.setSrc(parallelGateway);
		parallelGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				parallelGateway__divergeFlow____outgoing);
		divergeFlowToFlow__divergeFlow____source.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__divergeFlow____source.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__divergeFlow____source);
		divergeFlowToFlow__flow____target.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__flow____target);
		process__inFlow1____flowElements
				.setName(process__inFlow1____flowElements_name_prime);
		process__parallelConvGateway____flowElements
				.setName(process__parallelConvGateway____flowElements_name_prime);
		process__divergeFlow1____flowElements
				.setName(process__divergeFlow1____flowElements_name_prime);
		process__parallelGateway____flowElements
				.setName(process__parallelGateway____flowElements_name_prime);
		inFlow1__parallelConvGateway____targetRef
				.setName(inFlow1__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow1____incoming
				.setName(parallelConvGateway__inFlow1____incoming_name_prime);
		divergeFlow1__parallelGateway____sourceRef
				.setName(divergeFlow1__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow1____outgoing
				.setName(parallelGateway__divergeFlow1____outgoing_name_prime);
		flow1__step1____steps.setName(flow1__step1____steps_name_prime);
		inFlow1ToFlow1__inFlow1____source
				.setName(inFlow1ToFlow1__inFlow1____source_name_prime);
		inFlow1ToFlow1__flow1____target
				.setName(inFlow1ToFlow1__flow1____target_name_prime);
		inFlow1ToStep1__inFlow1____source
				.setName(inFlow1ToStep1__inFlow1____source_name_prime);
		inFlow1ToStep1__step1____target
				.setName(inFlow1ToStep1__step1____target_name_prime);
		parallelStep__flow1____invokedFlows
				.setName(parallelStep__flow1____invokedFlows_name_prime);
		divergeFlow1ToFlow1__divergeFlow1____source
				.setName(divergeFlow1ToFlow1__divergeFlow1____source_name_prime);
		divergeFlow1ToFlow1__flow1____target
				.setName(divergeFlow1ToFlow1__flow1____target_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		inFlow__parallelConvGateway____targetRef
				.setName(inFlow__parallelConvGateway____targetRef_name_prime);
		parallelConvGateway__inFlow____incoming
				.setName(parallelConvGateway__inFlow____incoming_name_prime);
		outFlow__parallelConvGateway____sourceRef
				.setName(outFlow__parallelConvGateway____sourceRef_name_prime);
		parallelConvGateway__outFlow____outgoing
				.setName(parallelConvGateway__outFlow____outgoing_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		inFlowToStep__inFlow____source
				.setName(inFlowToStep__inFlow____source_name_prime);
		inFlowToStep__step____target
				.setName(inFlowToStep__step____target_name_prime);
		initFlow__parallelStep____steps
				.setName(initFlow__parallelStep____steps_name_prime);
		parallelStep__flow____invokedFlows
				.setName(parallelStep__flow____invokedFlows_name_prime);
		lane__parallelConvGateway____flowNodeRefs
				.setName(lane__parallelConvGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		divergeFlow__parallelGateway____sourceRef
				.setName(divergeFlow__parallelGateway____sourceRef_name_prime);
		parallelGateway__divergeFlow____outgoing
				.setName(parallelGateway__divergeFlow____outgoing_name_prime);
		divergeFlowToFlow__divergeFlow____source
				.setName(divergeFlowToFlow__divergeFlow____source_name_prime);
		divergeFlowToFlow__flow____target
				.setName(divergeFlowToFlow__flow____target_name_prime);
		return new Object[] { process, inFlow1, parallelConvGateway,
				parallelGateway, divergeFlow1, flow1, inFlow1ToFlow1, step1,
				inFlow1ToStep1, parallelStep, divergeFlow1ToFlow1, inFlow,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
				lane, laneSet, divergeFlow, divergeFlowToFlow,
				isApplicableMatch, process__inFlow1____flowElements,
				process__parallelConvGateway____flowElements,
				process__divergeFlow1____flowElements,
				process__parallelGateway____flowElements,
				inFlow1__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow1____incoming,
				divergeFlow1__parallelGateway____sourceRef,
				parallelGateway__divergeFlow1____outgoing,
				flow1__step1____steps, inFlow1ToFlow1__inFlow1____source,
				inFlow1ToFlow1__flow1____target,
				inFlow1ToStep1__inFlow1____source,
				inFlow1ToStep1__step1____target,
				parallelStep__flow1____invokedFlows,
				divergeFlow1ToFlow1__divergeFlow1____source,
				divergeFlow1ToFlow1__flow1____target,
				process__inFlow____flowElements, process__laneSet____laneSets,
				process__outFlow____flowElements,
				process__divergeFlow____flowElements,
				inFlow__parallelConvGateway____targetRef,
				parallelConvGateway__inFlow____incoming,
				outFlow__parallelConvGateway____sourceRef,
				parallelConvGateway__outFlow____outgoing, flow__step____steps,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				inFlowToStep__inFlow____source, inFlowToStep__step____target,
				initFlow__parallelStep____steps,
				parallelStep__flow____invokedFlows,
				lane__parallelConvGateway____flowNodeRefs,
				laneSet__lane____lanes,
				divergeFlow__parallelGateway____sourceRef,
				parallelGateway__divergeFlow____outgoing,
				divergeFlowToFlow__divergeFlow____source,
				divergeFlowToFlow__flow____target };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_4_bindingFBBBBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, inFlow1, parallelConvGateway,
				parallelGateway, divergeFlow1, flow1, inFlow1ToFlow1, step1,
				inFlow1ToStep1, parallelStep, divergeFlow1ToFlow1, inFlow,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, initFlow,
				lane, laneSet, divergeFlow, divergeFlowToFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow1, parallelConvGateway, parallelGateway,
					divergeFlow1, flow1, inFlow1ToFlow1, step1, inFlow1ToStep1,
					parallelStep, divergeFlow1ToFlow1, inFlow, outFlow, flow,
					inFlowToFlow, step, inFlowToStep, initFlow, lane, laneSet,
					divergeFlow, divergeFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			SequenceFlow outFlow, ParallelFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_2_4_binding = pattern_ParallelConvergingGatewayTwoInputsRule_2_4_bindingFBBBBBBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow1,
				parallelConvGateway, parallelGateway, divergeFlow1, flow1,
				inFlow1ToFlow1, step1, inFlow1ToStep1, parallelStep,
				divergeFlow1ToFlow1, inFlow, outFlow, flow, inFlowToFlow, step,
				inFlowToStep, initFlow, lane, laneSet, divergeFlow,
				divergeFlowToFlow);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayTwoInputsRule_2_4_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_2_4_black = pattern_ParallelConvergingGatewayTwoInputsRule_2_4_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow1, parallelConvGateway, parallelGateway,
						divergeFlow1, flow1, inFlow1ToFlow1, step1,
						inFlow1ToStep1, parallelStep, divergeFlow1ToFlow1,
						inFlow, outFlow, flow, inFlowToFlow, step,
						inFlowToStep, initFlow, lane, laneSet, divergeFlow,
						divergeFlowToFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_2_5_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelConvergingGatewayTwoInputsRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelConvergingGatewayTwoInputsRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_10_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_785269 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_10_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpParallelConvGateway = _edge_flowElements.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (process.getFlowElements().contains(parallelConvGateway)) {
					for (FlowElement tmpInFlow1 : process.getFlowElements()) {
						if (tmpInFlow1 instanceof SequenceFlow) {
							SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
							if (parallelConvGateway.equals(inFlow1
									.getTargetRef())) {
								for (FlowElement tmpDivergeFlow1 : process
										.getFlowElements()) {
									if (tmpDivergeFlow1 instanceof SequenceFlow) {
										SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
										if (!divergeFlow1.equals(inFlow1)) {
											FlowNode tmpParallelGateway = divergeFlow1
													.getSourceRef();
											if (tmpParallelGateway instanceof ParallelGateway) {
												ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
												if (!parallelConvGateway
														.equals(parallelGateway)) {
													if (process
															.getFlowElements()
															.contains(
																	parallelGateway)) {
														if (pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_1BB(
																divergeFlow1,
																parallelConvGateway) == null) {
															for (FlowElement tmpInFlow : process
																	.getFlowElements()) {
																if (tmpInFlow instanceof SequenceFlow) {
																	SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																	if (!divergeFlow1
																			.equals(inFlow)) {
																		if (!inFlow
																				.equals(inFlow1)) {
																			if (parallelConvGateway
																					.equals(inFlow
																							.getTargetRef())) {
																				for (LaneSet laneSet : process
																						.getLaneSets()) {
																					for (FlowElement tmpOutFlow : process
																							.getFlowElements()) {
																						if (tmpOutFlow instanceof SequenceFlow) {
																							SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																							if (!inFlow1
																									.equals(outFlow)) {
																								if (!divergeFlow1
																										.equals(outFlow)) {
																									if (!inFlow
																											.equals(outFlow)) {
																										if (parallelConvGateway
																												.equals(outFlow
																														.getSourceRef())) {
																											if (pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_0B(outFlow) == null) {
																												if (pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_2BB(
																														outFlow,
																														parallelConvGateway) == null) {
																													for (FlowElement tmpDivergeFlow : process
																															.getFlowElements()) {
																														if (tmpDivergeFlow instanceof SequenceFlow) {
																															SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																															if (!divergeFlow
																																	.equals(inFlow1)) {
																																if (!divergeFlow
																																		.equals(divergeFlow1)) {
																																	if (!divergeFlow
																																			.equals(inFlow)) {
																																		if (!divergeFlow
																																				.equals(outFlow)) {
																																			if (parallelGateway
																																					.equals(divergeFlow
																																							.getSourceRef())) {
																																				if (pattern_ParallelConvergingGatewayTwoInputsRule_10_2_black_nac_3BB(
																																						divergeFlow,
																																						parallelConvGateway) == null) {
																																					for (Lane lane : laneSet
																																							.getLanes()) {
																																						if (lane.getFlowNodeRefs()
																																								.contains(
																																										parallelConvGateway)) {
																																							_result.add(new Object[] {
																																									process,
																																									inFlow1,
																																									parallelConvGateway,
																																									parallelGateway,
																																									divergeFlow1,
																																									inFlow,
																																									outFlow,
																																									lane,
																																									laneSet,
																																									divergeFlow,
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
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_10_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_10_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_11_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_11_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_11_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_382894 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_11_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow1 = _edge_targetRef.getSrc();
		if (tmpInFlow1 instanceof SequenceFlow) {
			SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
			EObject tmpParallelConvGateway = _edge_targetRef.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (parallelConvGateway.equals(inFlow1.getTargetRef())) {
					for (SequenceFlow inFlow : parallelConvGateway
							.getIncoming()) {
						if (!inFlow.equals(inFlow1)) {
							for (SequenceFlow outFlow : parallelConvGateway
									.getOutgoing()) {
								if (!inFlow1.equals(outFlow)) {
									if (!inFlow.equals(outFlow)) {
										if (pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_0B(outFlow) == null) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_2BB(
													outFlow,
													parallelConvGateway) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																inFlow1,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		parallelConvGateway)) {
															if (process
																	.getFlowElements()
																	.contains(
																			inFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_11_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_11_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_11_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_11_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_11_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_12_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_12_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_12_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_776585 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_12_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelConvGateway = _edge_incoming.getSrc();
		if (tmpParallelConvGateway instanceof ParallelGateway) {
			ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
			EObject tmpInFlow1 = _edge_incoming.getTrg();
			if (tmpInFlow1 instanceof SequenceFlow) {
				SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
				if (parallelConvGateway.equals(inFlow1.getTargetRef())) {
					for (SequenceFlow inFlow : parallelConvGateway
							.getIncoming()) {
						if (!inFlow.equals(inFlow1)) {
							for (SequenceFlow outFlow : parallelConvGateway
									.getOutgoing()) {
								if (!inFlow1.equals(outFlow)) {
									if (!inFlow.equals(outFlow)) {
										if (pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_0B(outFlow) == null) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_2BB(
													outFlow,
													parallelConvGateway) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																parallelConvGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow1)) {
															if (process
																	.getFlowElements()
																	.contains(
																			inFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_12_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_12_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_12_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_12_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_12_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_13_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_13_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_13_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_466209 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_13_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpParallelConvGateway = outFlow.getSourceRef();
					if (tmpParallelConvGateway instanceof ParallelGateway) {
						ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
						if (process.getFlowElements().contains(
								parallelConvGateway)) {
							if (pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_0B(outFlow) == null) {
								if (pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_2BB(
										outFlow, parallelConvGateway) == null) {
									for (FlowElement tmpInFlow1 : process
											.getFlowElements()) {
										if (tmpInFlow1 instanceof SequenceFlow) {
											SequenceFlow inFlow1 = (SequenceFlow) tmpInFlow1;
											if (!inFlow1.equals(outFlow)) {
												if (parallelConvGateway
														.equals(inFlow1
																.getTargetRef())) {
													for (FlowElement tmpDivergeFlow1 : process
															.getFlowElements()) {
														if (tmpDivergeFlow1 instanceof SequenceFlow) {
															SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
															if (!divergeFlow1
																	.equals(inFlow1)) {
																if (!divergeFlow1
																		.equals(outFlow)) {
																	FlowNode tmpParallelGateway = divergeFlow1
																			.getSourceRef();
																	if (tmpParallelGateway instanceof ParallelGateway) {
																		ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																		if (!parallelConvGateway
																				.equals(parallelGateway)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							parallelGateway)) {
																				if (pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_1BB(
																						divergeFlow1,
																						parallelConvGateway) == null) {
																					for (FlowElement tmpInFlow : process
																							.getFlowElements()) {
																						if (tmpInFlow instanceof SequenceFlow) {
																							SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																							if (!divergeFlow1
																									.equals(inFlow)) {
																								if (!inFlow
																										.equals(inFlow1)) {
																									if (!inFlow
																											.equals(outFlow)) {
																										if (parallelConvGateway
																												.equals(inFlow
																														.getTargetRef())) {
																											for (LaneSet laneSet : process
																													.getLaneSets()) {
																												for (FlowElement tmpDivergeFlow : process
																														.getFlowElements()) {
																													if (tmpDivergeFlow instanceof SequenceFlow) {
																														SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																														if (!divergeFlow
																																.equals(inFlow1)) {
																															if (!divergeFlow
																																	.equals(divergeFlow1)) {
																																if (!divergeFlow
																																		.equals(inFlow)) {
																																	if (!divergeFlow
																																			.equals(outFlow)) {
																																		if (parallelGateway
																																				.equals(divergeFlow
																																						.getSourceRef())) {
																																			if (pattern_ParallelConvergingGatewayTwoInputsRule_13_2_black_nac_3BB(
																																					divergeFlow,
																																					parallelConvGateway) == null) {
																																				for (Lane lane : laneSet
																																						.getLanes()) {
																																					if (lane.getFlowNodeRefs()
																																							.contains(
																																									parallelConvGateway)) {
																																						_result.add(new Object[] {
																																								process,
																																								inFlow1,
																																								parallelConvGateway,
																																								parallelGateway,
																																								divergeFlow1,
																																								inFlow,
																																								outFlow,
																																								lane,
																																								laneSet,
																																								divergeFlow,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_13_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_13_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_13_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_13_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_14_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_14_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_14_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_967996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_14_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpParallelConvGateway = _edge_targetRef.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (parallelConvGateway.equals(inFlow.getTargetRef())) {
					for (SequenceFlow inFlow1 : parallelConvGateway
							.getIncoming()) {
						if (!inFlow.equals(inFlow1)) {
							for (SequenceFlow outFlow : parallelConvGateway
									.getOutgoing()) {
								if (!inFlow1.equals(outFlow)) {
									if (!inFlow.equals(outFlow)) {
										if (pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_0B(outFlow) == null) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_2BB(
													outFlow,
													parallelConvGateway) == null) {
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
																		inFlow1)) {
															if (process
																	.getFlowElements()
																	.contains(
																			parallelConvGateway)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_14_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_14_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_14_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_14_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_14_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_15_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_15_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_15_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_906562 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_15_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelConvGateway = _edge_incoming.getSrc();
		if (tmpParallelConvGateway instanceof ParallelGateway) {
			ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (parallelConvGateway.equals(inFlow.getTargetRef())) {
					for (SequenceFlow inFlow1 : parallelConvGateway
							.getIncoming()) {
						if (!inFlow.equals(inFlow1)) {
							for (SequenceFlow outFlow : parallelConvGateway
									.getOutgoing()) {
								if (!inFlow1.equals(outFlow)) {
									if (!inFlow.equals(outFlow)) {
										if (pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_0B(outFlow) == null) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_2BB(
													outFlow,
													parallelConvGateway) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																parallelConvGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow1)) {
															if (process
																	.getFlowElements()
																	.contains(
																			inFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_15_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_15_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_15_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_15_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_15_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_16_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_16_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_16_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_394350 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_16_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpParallelConvGateway = _edge_sourceRef.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (parallelConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_0B(outFlow) == null) {
						if (pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_2BB(
								outFlow, parallelConvGateway) == null) {
							for (SequenceFlow inFlow1 : parallelConvGateway
									.getIncoming()) {
								if (!inFlow1.equals(outFlow)) {
									for (SequenceFlow inFlow : parallelConvGateway
											.getIncoming()) {
										if (!inFlow.equals(inFlow1)) {
											if (!inFlow.equals(outFlow)) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																outFlow,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow1)) {
															if (process
																	.getFlowElements()
																	.contains(
																			parallelConvGateway)) {
																if (process
																		.getFlowElements()
																		.contains(
																				inFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_16_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_16_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_16_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_16_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_16_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_17_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_17_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_17_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_790590 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_17_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParallelConvGateway = _edge_outgoing.getSrc();
		if (tmpParallelConvGateway instanceof ParallelGateway) {
			ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (parallelConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_0B(outFlow) == null) {
						if (pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_2BB(
								outFlow, parallelConvGateway) == null) {
							for (SequenceFlow inFlow1 : parallelConvGateway
									.getIncoming()) {
								if (!inFlow1.equals(outFlow)) {
									for (SequenceFlow inFlow : parallelConvGateway
											.getIncoming()) {
										if (!inFlow.equals(inFlow1)) {
											if (!inFlow.equals(outFlow)) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																parallelConvGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow1)) {
															if (process
																	.getFlowElements()
																	.contains(
																			inFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				outFlow)) {
																	for (FlowElement tmpDivergeFlow1 : process
																			.getFlowElements()) {
																		if (tmpDivergeFlow1 instanceof SequenceFlow) {
																			SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																			if (!divergeFlow1
																					.equals(inFlow1)) {
																				if (!divergeFlow1
																						.equals(inFlow)) {
																					if (!divergeFlow1
																							.equals(outFlow)) {
																						FlowNode tmpParallelGateway = divergeFlow1
																								.getSourceRef();
																						if (tmpParallelGateway instanceof ParallelGateway) {
																							ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																							if (!parallelConvGateway
																									.equals(parallelGateway)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												parallelGateway)) {
																									if (pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_1BB(
																											divergeFlow1,
																											parallelConvGateway) == null) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (FlowElement tmpDivergeFlow : process
																													.getFlowElements()) {
																												if (tmpDivergeFlow instanceof SequenceFlow) {
																													SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																													if (!divergeFlow
																															.equals(inFlow1)) {
																														if (!divergeFlow
																																.equals(divergeFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_17_2_black_nac_3BB(
																																				divergeFlow,
																																				parallelConvGateway) == null) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								parallelConvGateway)) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_17_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_17_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_17_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_1_bindingFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_1_blackFBB(
			EClass __eClass, ParallelConvergingGatewayTwoInputsRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_1_bindingAndBlackFFB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_binding = pattern_ParallelConvergingGatewayTwoInputsRule_18_1_bindingFB(_this);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_black = pattern_ParallelConvergingGatewayTwoInputsRule_18_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelConvergingGatewayTwoInputsRule_18_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_557797 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_1BB(
			SequenceFlow divergeFlow1, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow1.getTargetRef())) {
			return new Object[] { divergeFlow1, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_2BB(
			SequenceFlow outFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_3BB(
			SequenceFlow divergeFlow, ParallelGateway parallelConvGateway) {
		if (parallelConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, parallelConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_18_2_blackFFFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpParallelConvGateway = _edge_flowNodeRefs.getTrg();
			if (tmpParallelConvGateway instanceof ParallelGateway) {
				ParallelGateway parallelConvGateway = (ParallelGateway) tmpParallelConvGateway;
				if (lane.getFlowNodeRefs().contains(parallelConvGateway)) {
					for (SequenceFlow inFlow1 : parallelConvGateway
							.getIncoming()) {
						for (SequenceFlow inFlow : parallelConvGateway
								.getIncoming()) {
							if (!inFlow.equals(inFlow1)) {
								for (SequenceFlow outFlow : parallelConvGateway
										.getOutgoing()) {
									if (!inFlow1.equals(outFlow)) {
										if (!inFlow.equals(outFlow)) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_0B(outFlow) == null) {
												if (pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_2BB(
														outFlow,
														parallelConvGateway) == null) {
													for (LaneSet laneSet : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	lane,
																	LaneSet.class,
																	"lanes")) {
														for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		parallelConvGateway,
																		FlowElementsContainer.class,
																		"flowElements")) {
															if (tmpProcess instanceof bpmn2.Process) {
																bpmn2.Process process = (bpmn2.Process) tmpProcess;
																if (process
																		.getFlowElements()
																		.contains(
																				inFlow1)) {
																	if (process
																			.getFlowElements()
																			.contains(
																					inFlow)) {
																		if (process
																				.getLaneSets()
																				.contains(
																						laneSet)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				for (FlowElement tmpDivergeFlow1 : process
																						.getFlowElements()) {
																					if (tmpDivergeFlow1 instanceof SequenceFlow) {
																						SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																						if (!divergeFlow1
																								.equals(inFlow1)) {
																							if (!divergeFlow1
																									.equals(inFlow)) {
																								if (!divergeFlow1
																										.equals(outFlow)) {
																									FlowNode tmpParallelGateway = divergeFlow1
																											.getSourceRef();
																									if (tmpParallelGateway instanceof ParallelGateway) {
																										ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																										if (!parallelConvGateway
																												.equals(parallelGateway)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															parallelGateway)) {
																												if (pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_1BB(
																														divergeFlow1,
																														parallelConvGateway) == null) {
																													for (FlowElement tmpDivergeFlow : process
																															.getFlowElements()) {
																														if (tmpDivergeFlow instanceof SequenceFlow) {
																															SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																															if (!divergeFlow
																																	.equals(inFlow1)) {
																																if (!divergeFlow
																																		.equals(divergeFlow1)) {
																																	if (!divergeFlow
																																			.equals(inFlow)) {
																																		if (!divergeFlow
																																				.equals(outFlow)) {
																																			if (parallelGateway
																																					.equals(divergeFlow
																																							.getSourceRef())) {
																																				if (pattern_ParallelConvergingGatewayTwoInputsRule_18_2_black_nac_3BB(
																																						divergeFlow,
																																						parallelConvGateway) == null) {
																																					_result.add(new Object[] {
																																							process,
																																							inFlow1,
																																							parallelConvGateway,
																																							parallelGateway,
																																							divergeFlow1,
																																							inFlow,
																																							outFlow,
																																							lane,
																																							laneSet,
																																							divergeFlow,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_18_3_expressionFBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelConvGateway,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			SequenceFlow inFlow, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow1, parallelConvGateway, parallelGateway, divergeFlow1,
				inFlow, outFlow, lane, laneSet, divergeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_18_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_18_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelConvergingGatewayTwoInputsRule_18_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_1_blackB(
			ParallelConvergingGatewayTwoInputsRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow1) {
		if (ruleResult.getSourceObjects().contains(inFlow1)) {
			return new Object[] { ruleResult, inFlow1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlow1ToFlow1) {
		if (ruleResult.getCorrObjects().contains(inFlow1ToFlow1)) {
			return new Object[] { ruleResult, inFlow1ToFlow1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ParallelFlow flow1) {
		if (ruleResult.getTargetObjects().contains(flow1)) {
			return new Object[] { ruleResult, flow1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Step step1) {
		if (ruleResult.getTargetObjects().contains(step1)) {
			return new Object[] { ruleResult, step1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToStep inFlow1ToStep1) {
		if (ruleResult.getCorrObjects().contains(inFlow1ToStep1)) {
			return new Object[] { ruleResult, inFlow1ToStep1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ParallelStep parallelStep) {
		if (ruleResult.getTargetObjects().contains(parallelStep)) {
			return new Object[] { ruleResult, parallelStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ParallelFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlowToStep inFlowToStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToStep)) {
			return new Object[] { ruleResult, inFlowToStep };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(divergeFlowToFlow)) {
			return new Object[] { ruleResult, divergeFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow divergeFlow) {
		if (ruleResult.getSourceObjects().contains(divergeFlow)) {
			return new Object[] { ruleResult, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_14BB(
			ModelgeneratorRuleResult ruleResult, ParallelGateway parallelGateway) {
		if (ruleResult.getSourceObjects().contains(parallelGateway)) {
			return new Object[] { ruleResult, parallelGateway };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_15BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow divergeFlow1) {
		if (ruleResult.getSourceObjects().contains(divergeFlow1)) {
			return new Object[] { ruleResult, divergeFlow1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_16BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow divergeFlow1ToFlow1) {
		if (ruleResult.getCorrObjects().contains(divergeFlow1ToFlow1)) {
			return new Object[] { ruleResult, divergeFlow1ToFlow1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_17BB(
			ModelgeneratorRuleResult ruleResult, Flow initFlow) {
		if (ruleResult.getTargetObjects().contains(initFlow)) {
			return new Object[] { ruleResult, initFlow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_18BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_19BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelConvergingGatewayTwoInputsRule_20_2_blackFFFFFFFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlow1ToFlow1List : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlow1ToFlow1 : inFlow1ToFlow1List
					.getEntryObjects()) {
				if (tmpInFlow1ToFlow1 instanceof SequenceFlowToUCFlow) {
					SequenceFlowToUCFlow inFlow1ToFlow1 = (SequenceFlowToUCFlow) tmpInFlow1ToFlow1;
					SequenceFlow inFlow1 = inFlow1ToFlow1.getSource();
					if (inFlow1 != null) {
						Flow tmpFlow1 = inFlow1ToFlow1.getTarget();
						if (tmpFlow1 instanceof ParallelFlow) {
							ParallelFlow flow1 = (ParallelFlow) tmpFlow1;
							if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_2BB(
									ruleResult, inFlow1ToFlow1) == null) {
								if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_1BB(
										ruleResult, inFlow1) == null) {
									if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_3BB(
											ruleResult, flow1) == null) {
										for (Step step1 : flow1.getSteps()) {
											if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_4BB(
													ruleResult, step1) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																inFlow1,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_0BB(
																ruleResult,
																process) == null) {
															for (FlowElement tmpInFlow : process
																	.getFlowElements()) {
																if (tmpInFlow instanceof SequenceFlow) {
																	SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																	if (!inFlow
																			.equals(inFlow1)) {
																		if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_10BB(
																				ruleResult,
																				inFlow) == null) {
																			for (FlowElement tmpParallelGateway : process
																					.getFlowElements()) {
																				if (tmpParallelGateway instanceof ParallelGateway) {
																					ParallelGateway parallelGateway = (ParallelGateway) tmpParallelGateway;
																					if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_14BB(
																							ruleResult,
																							parallelGateway) == null) {
																						for (FlowElement tmpDivergeFlow1 : process
																								.getFlowElements()) {
																							if (tmpDivergeFlow1 instanceof SequenceFlow) {
																								SequenceFlow divergeFlow1 = (SequenceFlow) tmpDivergeFlow1;
																								if (!divergeFlow1
																										.equals(inFlow1)) {
																									if (!divergeFlow1
																											.equals(inFlow)) {
																										if (parallelGateway
																												.equals(divergeFlow1
																														.getSourceRef())) {
																											if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_15BB(
																													ruleResult,
																													divergeFlow1) == null) {
																												for (FlowElement tmpDivergeFlow : process
																														.getFlowElements()) {
																													if (tmpDivergeFlow instanceof SequenceFlow) {
																														SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																														if (!divergeFlow
																																.equals(inFlow1)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(divergeFlow1)) {
																																	if (parallelGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_13BB(
																																				ruleResult,
																																				divergeFlow) == null) {
																																			for (LaneSet laneSet : process
																																					.getLaneSets()) {
																																				if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_18BB(
																																						ruleResult,
																																						laneSet) == null) {
																																					for (Lane lane : laneSet
																																							.getLanes()) {
																																						if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_19BB(
																																								ruleResult,
																																								lane) == null) {
																																							for (SequenceFlowToStep inFlow1ToStep1 : org.moflon.core.utilities.eMoflonEMFUtil
																																									.getOppositeReferenceTyped(
																																											inFlow1,
																																											SequenceFlowToStep.class,
																																											"source")) {
																																								if (step1
																																										.equals(inFlow1ToStep1
																																												.getTarget())) {
																																									if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_5BB(
																																											ruleResult,
																																											inFlow1ToStep1) == null) {
																																										for (ParallelStep parallelStep : org.moflon.core.utilities.eMoflonEMFUtil
																																												.getOppositeReferenceTyped(
																																														flow1,
																																														ParallelStep.class,
																																														"invokedFlows")) {
																																											if (!parallelStep
																																													.equals(step1)) {
																																												if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_6BB(
																																														ruleResult,
																																														parallelStep) == null) {
																																													for (ParallelFlow flow : parallelStep
																																															.getInvokedFlows()) {
																																														if (!flow
																																																.equals(flow1)) {
																																															if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_7BB(
																																																	ruleResult,
																																																	flow) == null) {
																																																for (Step step : flow
																																																		.getSteps()) {
																																																	if (!parallelStep
																																																			.equals(step)) {
																																																		if (!step
																																																				.equals(step1)) {
																																																			if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_8BB(
																																																					ruleResult,
																																																					step) == null) {
																																																				for (SequenceFlowToUCFlow divergeFlow1ToFlow1 : org.moflon.core.utilities.eMoflonEMFUtil
																																																						.getOppositeReferenceTyped(
																																																								flow1,
																																																								SequenceFlowToUCFlow.class,
																																																								"target")) {
																																																					if (!divergeFlow1ToFlow1
																																																							.equals(inFlow1ToFlow1)) {
																																																						if (divergeFlow1
																																																								.equals(divergeFlow1ToFlow1
																																																										.getSource())) {
																																																							if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_16BB(
																																																									ruleResult,
																																																									divergeFlow1ToFlow1) == null) {
																																																								for (SequenceFlowToStep inFlowToStep : org.moflon.core.utilities.eMoflonEMFUtil
																																																										.getOppositeReferenceTyped(
																																																												inFlow,
																																																												SequenceFlowToStep.class,
																																																												"source")) {
																																																									if (!inFlow1ToStep1
																																																											.equals(inFlowToStep)) {
																																																										if (step.equals(inFlowToStep
																																																												.getTarget())) {
																																																											if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_9BB(
																																																													ruleResult,
																																																													inFlowToStep) == null) {
																																																												for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																																														.getOppositeReferenceTyped(
																																																																inFlow,
																																																																SequenceFlowToUCFlow.class,
																																																																"source")) {
																																																													if (!inFlow1ToFlow1
																																																															.equals(inFlowToFlow)) {
																																																														if (!divergeFlow1ToFlow1
																																																																.equals(inFlowToFlow)) {
																																																															if (flow.equals(inFlowToFlow
																																																																	.getTarget())) {
																																																																if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_11BB(
																																																																		ruleResult,
																																																																		inFlowToFlow) == null) {
																																																																	for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																																																			.getOppositeReferenceTyped(
																																																																					divergeFlow,
																																																																					SequenceFlowToUCFlow.class,
																																																																					"source")) {
																																																																		if (!divergeFlowToFlow
																																																																				.equals(inFlow1ToFlow1)) {
																																																																			if (!divergeFlowToFlow
																																																																					.equals(inFlowToFlow)) {
																																																																				if (!divergeFlow1ToFlow1
																																																																						.equals(divergeFlowToFlow)) {
																																																																					if (flow.equals(divergeFlowToFlow
																																																																							.getTarget())) {
																																																																						if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_12BB(
																																																																								ruleResult,
																																																																								divergeFlowToFlow) == null) {
																																																																							for (Flow initFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																																																									.getOppositeReferenceTyped(
																																																																											parallelStep,
																																																																											Flow.class,
																																																																											"steps")) {
																																																																								if (!flow1
																																																																										.equals(initFlow)) {
																																																																									if (!flow
																																																																											.equals(initFlow)) {
																																																																										if (pattern_ParallelConvergingGatewayTwoInputsRule_20_2_black_nac_17BB(
																																																																												ruleResult,
																																																																												initFlow) == null) {
																																																																											_result.add(new Object[] {
																																																																													inFlow1ToFlow1List,
																																																																													process,
																																																																													inFlow1,
																																																																													inFlow1ToFlow1,
																																																																													flow1,
																																																																													step1,
																																																																													inFlow1ToStep1,
																																																																													parallelStep,
																																																																													flow,
																																																																													step,
																																																																													inFlowToStep,
																																																																													inFlow,
																																																																													inFlowToFlow,
																																																																													divergeFlowToFlow,
																																																																													divergeFlow,
																																																																													parallelGateway,
																																																																													divergeFlow1,
																																																																													divergeFlow1ToFlow1,
																																																																													initFlow,
																																																																													laneSet,
																																																																													lane,
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
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_3_bindingFBBBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow1, ParallelFlow flow1,
			SequenceFlowToUCFlow inFlow1ToFlow1, Step step1,
			SequenceFlowToStep inFlow1ToStep1, ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, inFlow1, parallelGateway,
				divergeFlow1, flow1, inFlow1ToFlow1, step1, inFlow1ToStep1,
				parallelStep, divergeFlow1ToFlow1, inFlow, flow, inFlowToFlow,
				step, inFlowToStep, initFlow, lane, laneSet, divergeFlow,
				divergeFlowToFlow, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow1, parallelGateway, divergeFlow1, flow1,
					inFlow1ToFlow1, step1, inFlow1ToStep1, parallelStep,
					divergeFlow1ToFlow1, inFlow, flow, inFlowToFlow, step,
					inFlowToStep, initFlow, lane, laneSet, divergeFlow,
					divergeFlowToFlow, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_3_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBBBB(
			ParallelConvergingGatewayTwoInputsRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow1, ParallelGateway parallelGateway,
			SequenceFlow divergeFlow1, ParallelFlow flow1,
			SequenceFlowToUCFlow inFlow1ToFlow1, Step step1,
			SequenceFlowToStep inFlow1ToStep1, ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_20_3_binding = pattern_ParallelConvergingGatewayTwoInputsRule_20_3_bindingFBBBBBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow1, parallelGateway,
				divergeFlow1, flow1, inFlow1ToFlow1, step1, inFlow1ToStep1,
				parallelStep, divergeFlow1ToFlow1, inFlow, flow, inFlowToFlow,
				step, inFlowToStep, initFlow, lane, laneSet, divergeFlow,
				divergeFlowToFlow, ruleResult);
		if (result_pattern_ParallelConvergingGatewayTwoInputsRule_20_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelConvergingGatewayTwoInputsRule_20_3_binding[0];

			Object[] result_pattern_ParallelConvergingGatewayTwoInputsRule_20_3_black = pattern_ParallelConvergingGatewayTwoInputsRule_20_3_blackB(csp);
			if (result_pattern_ParallelConvergingGatewayTwoInputsRule_20_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow1, parallelGateway, divergeFlow1, flow1,
						inFlow1ToFlow1, step1, inFlow1ToStep1, parallelStep,
						divergeFlow1ToFlow1, inFlow, flow, inFlowToFlow, step,
						inFlowToStep, initFlow, lane, laneSet, divergeFlow,
						divergeFlowToFlow, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelConvergingGatewayTwoInputsRule_20_4_expressionFBB(
			ParallelConvergingGatewayTwoInputsRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_5_black_nac_0BBB(
			Step step, Step step1, ParallelStep parallelStep) {
		if (!step.equals(step1)) {
			if (!parallelStep.equals(step)) {
				if (!parallelStep.equals(step1)) {
					Step nextStep = step.getNext();
					if (nextStep != null) {
						if (!step.equals(nextStep)) {
							if (!step1.equals(nextStep)) {
								if (!parallelStep.equals(nextStep)) {
									return new Object[] { step, step1,
											parallelStep };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_5_blackBBBBBBBBBBBBBBBBBBBB(
			Step step, bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		if (!step.equals(step1)) {
			if (!divergeFlow1.equals(inFlow1)) {
				if (!divergeFlow1.equals(inFlow)) {
					if (!flow1.equals(initFlow)) {
						if (!inFlow1ToFlow1.equals(inFlowToFlow)) {
							if (!inFlow1ToStep1.equals(inFlowToStep)) {
								if (!parallelStep.equals(step)) {
									if (!parallelStep.equals(step1)) {
										if (!divergeFlow1ToFlow1
												.equals(inFlow1ToFlow1)) {
											if (!divergeFlow1ToFlow1
													.equals(inFlowToFlow)) {
												if (!divergeFlow1ToFlow1
														.equals(divergeFlowToFlow)) {
													if (!inFlow.equals(inFlow1)) {
														if (!flow.equals(flow1)) {
															if (!flow
																	.equals(initFlow)) {
																if (!divergeFlow
																		.equals(inFlow1)) {
																	if (!divergeFlow
																			.equals(divergeFlow1)) {
																		if (!divergeFlow
																				.equals(inFlow)) {
																			if (!divergeFlowToFlow
																					.equals(inFlow1ToFlow1)) {
																				if (!divergeFlowToFlow
																						.equals(inFlowToFlow)) {
																					if (pattern_ParallelConvergingGatewayTwoInputsRule_20_5_black_nac_0BBB(
																							step,
																							step1,
																							parallelStep) == null) {
																						return new Object[] {
																								step,
																								process,
																								inFlow1,
																								parallelGateway,
																								divergeFlow1,
																								flow1,
																								inFlow1ToFlow1,
																								step1,
																								inFlow1ToStep1,
																								parallelStep,
																								divergeFlow1ToFlow1,
																								inFlow,
																								flow,
																								inFlowToFlow,
																								inFlowToStep,
																								initFlow,
																								lane,
																								laneSet,
																								divergeFlow,
																								divergeFlowToFlow };
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_6_blackBBBBBBBBBBBBBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow1,
			ParallelFlow flow1, SequenceFlowToUCFlow inFlow1ToFlow1,
			Step step1, SequenceFlowToStep inFlow1ToStep1,
			ParallelStep parallelStep,
			SequenceFlowToUCFlow divergeFlow1ToFlow1, SequenceFlow inFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow, Lane lane,
			LaneSet laneSet, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		if (!divergeFlow1.equals(inFlow1)) {
			if (!divergeFlow1.equals(inFlow)) {
				if (!flow1.equals(initFlow)) {
					if (!inFlow1ToFlow1.equals(inFlowToFlow)) {
						if (!inFlow1ToStep1.equals(inFlowToStep)) {
							if (!parallelStep.equals(step1)) {
								if (!parallelStep.equals(step)) {
									if (!divergeFlow1ToFlow1
											.equals(inFlow1ToFlow1)) {
										if (!divergeFlow1ToFlow1
												.equals(inFlowToFlow)) {
											if (!divergeFlow1ToFlow1
													.equals(divergeFlowToFlow)) {
												if (!inFlow.equals(inFlow1)) {
													if (!flow.equals(flow1)) {
														if (!flow
																.equals(initFlow)) {
															if (!step
																	.equals(step1)) {
																if (!divergeFlow
																		.equals(inFlow1)) {
																	if (!divergeFlow
																			.equals(divergeFlow1)) {
																		if (!divergeFlow
																				.equals(inFlow)) {
																			if (!divergeFlowToFlow
																					.equals(inFlow1ToFlow1)) {
																				if (!divergeFlowToFlow
																						.equals(inFlowToFlow)) {
																					return new Object[] {
																							process,
																							inFlow1,
																							parallelGateway,
																							divergeFlow1,
																							flow1,
																							inFlow1ToFlow1,
																							step1,
																							inFlow1ToStep1,
																							parallelStep,
																							divergeFlow1ToFlow1,
																							inFlow,
																							flow,
																							inFlowToFlow,
																							step,
																							inFlowToStep,
																							initFlow,
																							lane,
																							laneSet,
																							divergeFlow,
																							divergeFlowToFlow,
																							ruleResult };
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelConvergingGatewayTwoInputsRule_20_6_greenBBFBBFBFFBBB(
			bpmn2.Process process, SequenceFlow inFlow1,
			ParallelStep parallelStep, SequenceFlow inFlow, Flow initFlow,
			Lane lane, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelGateway parallelConvGateway = Bpmn2Factory.eINSTANCE
				.createParallelGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("parallelConvGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(parallelConvGateway);
		inFlow1.setTargetRef(parallelConvGateway);
		inFlow.setTargetRef(parallelConvGateway);
		lane.getFlowNodeRefs().add(parallelConvGateway);
		ruleResult.getSourceObjects().add(parallelConvGateway);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(parallelConvGateway);
		ruleResult.getSourceObjects().add(outFlow);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		ruleResult.getCorrObjects().add(outFlowToInitFlow);
		outFlowToParallelStep.setSource(outFlow);
		outFlowToParallelStep.setTarget(parallelStep);
		ruleResult.getCorrObjects().add(outFlowToParallelStep);
		GatewayDirection parallelConvGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		parallelConvGateway
				.setGatewayDirection(parallelConvGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, inFlow1, parallelConvGateway,
				parallelStep, inFlow, outFlow, initFlow, outFlowToInitFlow,
				outFlowToParallelStep, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelConvergingGatewayTwoInputsRule_20_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelConvergingGatewayTwoInputsRuleImpl
