/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;

import BpmnToUseCaseIntegration.Rules.ExcConvGwAfterExDivGwRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
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

import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;

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
 * An implementation of the model object '<em><b>Exc Conv Gw After Ex Div Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExcConvGwAfterExDivGwRuleImpl extends AbstractRuleImpl implements
		ExcConvGwAfterExDivGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcConvGwAfterExDivGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExcConvGwAfterExDivGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_0_1_blackBBBBBBBBBBB(this,
						match, inFlow, process, defaultFlow, exclusiveGateway,
						divergeFlow, exConvGateway, outFlow, lane, laneSet);
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
							+ "[defaultFlow] = "
							+ defaultFlow
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[divergeFlow] = "
							+ divergeFlow
							+ ", "
							+ "[exConvGateway] = "
							+ exConvGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane + ", " + "[laneSet] = " + laneSet + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
						this, match, inFlow, process, defaultFlow,
						exclusiveGateway, divergeFlow, exConvGateway, outFlow,
						lane, laneSet);
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
							+ "[defaultFlow] = "
							+ defaultFlow
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[divergeFlow] = "
							+ divergeFlow
							+ ", "
							+ "[exConvGateway] = "
							+ exConvGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[lane] = "
							+ lane + ", " + "[laneSet] = " + laneSet + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_4_blackBBBBBBBBBB(
							match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[defaultFlow] = "
								+ defaultFlow
								+ ", "
								+ "[exclusiveGateway] = "
								+ exclusiveGateway
								+ ", "
								+ "[divergeFlow] = "
								+ divergeFlow
								+ ", "
								+ "[exConvGateway] = "
								+ exConvGateway
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet + ".");
			}
			ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_4_greenBBBBBBFFFFFFF(
							match, inFlow, process, exConvGateway, outFlow,
							lane);
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_5_blackBBBBBBBBBB(
							match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[defaultFlow] = "
								+ defaultFlow
								+ ", "
								+ "[exclusiveGateway] = "
								+ exclusiveGateway
								+ ", "
								+ "[divergeFlow] = "
								+ divergeFlow
								+ ", "
								+ "[exConvGateway] = "
								+ exConvGateway
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet + ".");
			}
			ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_5_greenBBBBBBBBFFFFFFFFF(
							match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, lane, laneSet);
			// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result5_green[8];
			// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result5_green[9];
			// EMoflonEdge process__defaultFlow____flowElements = (EMoflonEdge) result5_green[10];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[11];
			// EMoflonEdge exclusiveGateway__defaultFlow____default = (EMoflonEdge) result5_green[12];
			// EMoflonEdge divergeFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result5_green[13];
			// EMoflonEdge exclusiveGateway__divergeFlow____outgoing = (EMoflonEdge) result5_green[14];
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[15];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[16];

			// register objects to match
			ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_6_expressionBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet);
			return ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_7_expressionF();
		} else {
			return ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		Step step = (Step) result1_bindingAndBlack[1];
		SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result1_bindingAndBlack[2];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[3];
		SequenceFlow defaultFlow = (SequenceFlow) result1_bindingAndBlack[4];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result1_bindingAndBlack[5];
		SequenceFlow divergeFlow = (SequenceFlow) result1_bindingAndBlack[6];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[7];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[8];
		Flow initFlow = (Flow) result1_bindingAndBlack[9];
		SequenceFlowToUCFlow defaultFlowToInitFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[10];
		FlowNodeToStep egwToStep = (FlowNodeToStep) result1_bindingAndBlack[11];
		SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result1_bindingAndBlack[12];
		AlternativeFlow flow = (AlternativeFlow) result1_bindingAndBlack[13];
		SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[14];
		ExclusiveGateway exConvGateway = (ExclusiveGateway) result1_bindingAndBlack[15];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[16];
		Lane lane = (Lane) result1_bindingAndBlack[17];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[18];
		// CSP csp = (CSP) result1_bindingAndBlack[19];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_1_greenBBBBFFF(normalStep,
						initFlow, exConvGateway, outFlow);
		FlowNodeToStep ecgwToStep = (FlowNodeToStep) result1_green[4];
		SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result1_green[5];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_2_blackBBBBB(
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[exConvGateway] = "
							+ exConvGateway + ", " + "[outFlow] = " + outFlow
							+ ", " + "[ecgwToStep] = " + ecgwToStep + ", "
							+ "[outFlowToInitFlow] = " + outFlowToInitFlow
							+ ", " + "[outFlowToNormalStep] = "
							+ outFlowToNormalStep + ".");
		}
		Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_2_greenFBBBBB(
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, inFlow, step, inFlowToStep, process,
						defaultFlow, exclusiveGateway, divergeFlow, normalStep,
						alt, initFlow, defaultFlowToInitFlow, egwToStep,
						divergeFlowToAlt, flow, divergeFlowToFlow,
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[inFlowToStep] = "
							+ inFlowToStep
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[defaultFlow] = "
							+ defaultFlow
							+ ", "
							+ "[exclusiveGateway] = "
							+ exclusiveGateway
							+ ", "
							+ "[divergeFlow] = "
							+ divergeFlow
							+ ", "
							+ "[normalStep] = "
							+ normalStep
							+ ", "
							+ "[alt] = "
							+ alt
							+ ", "
							+ "[initFlow] = "
							+ initFlow
							+ ", "
							+ "[defaultFlowToInitFlow] = "
							+ defaultFlowToInitFlow
							+ ", "
							+ "[egwToStep] = "
							+ egwToStep
							+ ", "
							+ "[divergeFlowToAlt] = "
							+ divergeFlowToAlt
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[divergeFlowToFlow] = "
							+ divergeFlowToFlow
							+ ", "
							+ "[exConvGateway] = "
							+ exConvGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[ecgwToStep] = "
							+ ecgwToStep
							+ ", "
							+ "[outFlowToInitFlow] = "
							+ outFlowToInitFlow
							+ ", "
							+ "[outFlowToNormalStep] = "
							+ outFlowToNormalStep
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", " + "[laneSet] = " + laneSet + ".");
		}
		ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, inFlow, process, normalStep, initFlow,
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep, lane);
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[16];
		// EMoflonEdge ecgwToStep__exConvGateway____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge ecgwToStep__normalStep____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlowToInitFlow__outFlow____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToInitFlow__initFlow____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, inFlow, step, inFlowToStep, process,
						defaultFlow, exclusiveGateway, divergeFlow, normalStep,
						alt, initFlow, defaultFlowToInitFlow, egwToStep,
						divergeFlowToAlt, flow, divergeFlowToFlow,
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep, lane, laneSet);
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_2_2_bindingFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SequenceFlow inFlow = (SequenceFlow) result2_binding[0];
		bpmn2.Process process = (bpmn2.Process) result2_binding[1];
		SequenceFlow defaultFlow = (SequenceFlow) result2_binding[2];
		ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_binding[3];
		SequenceFlow divergeFlow = (SequenceFlow) result2_binding[4];
		ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_binding[5];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[6];
		Lane lane = (Lane) result2_binding[7];
		LaneSet laneSet = (LaneSet) result2_binding[8];
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_2_2_blackBFFBBBBFFFFFFFFBBBBB(
						inFlow, process, defaultFlow, exclusiveGateway,
						divergeFlow, exConvGateway, outFlow, lane, laneSet,
						match)) {
			Step step = (Step) result2_black[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[2];
			NormalStep normalStep = (NormalStep) result2_black[7];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[8];
			Flow initFlow = (Flow) result2_black[9];
			SequenceFlowToUCFlow defaultFlowToInitFlow = (SequenceFlowToUCFlow) result2_black[10];
			FlowNodeToStep egwToStep = (FlowNodeToStep) result2_black[11];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result2_black[12];
			AlternativeFlow flow = (AlternativeFlow) result2_black[13];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[14];
			// ForEach find context
			for (Object[] result3_black : ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_2_3_blackBBBBBBBBBBBBBBBBBBB(
							inFlow, step, inFlowToStep, process, defaultFlow,
							exclusiveGateway, divergeFlow, normalStep, alt,
							initFlow, defaultFlowToInitFlow, egwToStep,
							divergeFlowToAlt, flow, divergeFlowToFlow,
							exConvGateway, outFlow, lane, laneSet)) {
				Object[] result3_green = ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_2_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								inFlow, step, inFlowToStep, process,
								defaultFlow, exclusiveGateway, divergeFlow,
								normalStep, alt, initFlow,
								defaultFlowToInitFlow, egwToStep,
								divergeFlowToAlt, flow, divergeFlowToFlow,
								exConvGateway, outFlow, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[19];
				// EMoflonEdge inFlowToStep__inFlow____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlowToStep__step____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__exclusiveGateway____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__defaultFlow____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge exclusiveGateway__defaultFlow____default = (EMoflonEdge) result3_green[26];
				// EMoflonEdge divergeFlow__exclusiveGateway____sourceRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge exclusiveGateway__divergeFlow____outgoing = (EMoflonEdge) result3_green[28];
				// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[29];
				// EMoflonEdge alt__flow____ref = (EMoflonEdge) result3_green[30];
				// EMoflonEdge initFlow__normalStep____steps = (EMoflonEdge) result3_green[31];
				// EMoflonEdge defaultFlowToInitFlow__defaultFlow____source = (EMoflonEdge) result3_green[32];
				// EMoflonEdge defaultFlowToInitFlow__initFlow____target = (EMoflonEdge) result3_green[33];
				// EMoflonEdge egwToStep__exclusiveGateway____source = (EMoflonEdge) result3_green[34];
				// EMoflonEdge egwToStep__normalStep____target = (EMoflonEdge) result3_green[35];
				// EMoflonEdge divergeFlowToAlt__divergeFlow____source = (EMoflonEdge) result3_green[36];
				// EMoflonEdge divergeFlowToAlt__alt____target = (EMoflonEdge) result3_green[37];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[38];
				// EMoflonEdge divergeFlowToFlow__divergeFlow____source = (EMoflonEdge) result3_green[39];
				// EMoflonEdge divergeFlowToFlow__flow____target = (EMoflonEdge) result3_green[40];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[41];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[42];
				// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result3_green[43];
				// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result3_green[44];
				// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[45];
				// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result3_green[46];
				// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[47];
				// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[48];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[49];

				// solve CSP
				Object[] result4_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, step,
								inFlowToStep, process, defaultFlow,
								exclusiveGateway, divergeFlow, normalStep, alt,
								initFlow, defaultFlowToInitFlow, egwToStep,
								divergeFlowToAlt, flow, divergeFlowToFlow,
								exConvGateway, outFlow, lane, laneSet);
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
									+ "[step] = "
									+ step
									+ ", "
									+ "[inFlowToStep] = "
									+ inFlowToStep
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[defaultFlow] = "
									+ defaultFlow
									+ ", "
									+ "[exclusiveGateway] = "
									+ exclusiveGateway
									+ ", "
									+ "[divergeFlow] = "
									+ divergeFlow
									+ ", "
									+ "[normalStep] = "
									+ normalStep
									+ ", "
									+ "[alt] = "
									+ alt
									+ ", "
									+ "[initFlow] = "
									+ initFlow
									+ ", "
									+ "[defaultFlowToInitFlow] = "
									+ defaultFlowToInitFlow
									+ ", "
									+ "[egwToStep] = "
									+ egwToStep
									+ ", "
									+ "[divergeFlowToAlt] = "
									+ divergeFlowToAlt
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[divergeFlowToFlow] = "
									+ divergeFlowToFlow
									+ ", "
									+ "[exConvGateway] = "
									+ exConvGateway
									+ ", "
									+ "[outFlow] = "
									+ outFlow
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = " + laneSet + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("defaultFlow", defaultFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("divergeFlow", divergeFlow);
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
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Converging");
		literal1.setType("");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", true, csp);
		var_exConvGateway_gatewayDirection.setValue(exConvGateway
				.getGatewayDirection());
		var_exConvGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0
				.solve(var_exConvGateway_gatewayDirection, literal1);
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
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		isApplicableMatch.registerObject("egwToStep", egwToStep);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
		isApplicableMatch.registerObject("exConvGateway", exConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
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
			EObject inFlow, EObject step, EObject inFlowToStep,
			EObject process, EObject defaultFlow, EObject exclusiveGateway,
			EObject divergeFlow, EObject normalStep, EObject alt,
			EObject initFlow, EObject defaultFlowToInitFlow, EObject egwToStep,
			EObject divergeFlowToAlt, EObject flow, EObject divergeFlowToFlow,
			EObject exConvGateway, EObject outFlow, EObject ecgwToStep,
			EObject outFlowToInitFlow, EObject outFlowToNormalStep,
			EObject lane, EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("divergeFlowToFlow", divergeFlowToFlow);
		ruleresult.registerObject("exConvGateway", exConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_305(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_10_2_blackFFFFFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_10_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_10_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_10_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_10_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_306(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_11_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_11_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_11_2_blackFFFFFFFFFB(_edge_flowElements)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_11_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_11_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_11_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_11_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_11_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_11_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_307(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_12_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_12_2_blackFFFFFFFFFB(_edge_targetRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_12_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_12_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_12_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_12_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_12_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_12_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_308(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_13_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_13_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_13_2_blackFFFFFFFFFB(_edge_incoming)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_13_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_13_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_13_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_13_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_13_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_13_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_309(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_14_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_14_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_14_2_blackFFFFFFFFFB(_edge_sourceRef)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_14_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_14_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_14_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_14_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_14_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_14_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_310(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_15_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_15_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_15_2_blackFFFFFFFFFB(_edge_outgoing)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_15_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_15_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_15_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_15_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_15_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_15_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_311(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_16_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_16_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_16_2_blackFFFFFFFFFB(_edge_flowNodeRefs)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[2];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_16_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_16_3_expressionFBBBBBBBBBBB(
							this, match, inFlow, process, defaultFlow,
							exclusiveGateway, divergeFlow, exConvGateway,
							outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_16_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_16_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_16_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_16_6_expressionFB(__result);
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
			SequenceFlowToStep inFlowToStepParameter) {
		// create result
		Object[] result1_black = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_18_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_18_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_18_2_blackFFFFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList inFlowToStepList = (RuleEntryList) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result2_black[2];
			Step step = (Step) result2_black[3];
			AlternativeFlow flow = (AlternativeFlow) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			NormalStep normalStep = (NormalStep) result2_black[6];
			Flow initFlow = (Flow) result2_black[7];
			SequenceFlowToUCFlow defaultFlowToInitFlow = (SequenceFlowToUCFlow) result2_black[8];
			SequenceFlow defaultFlow = (SequenceFlow) result2_black[9];
			bpmn2.Process process = (bpmn2.Process) result2_black[10];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result2_black[11];
			FlowNodeToStep egwToStep = (FlowNodeToStep) result2_black[12];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[13];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result2_black[14];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result2_black[15];
			LaneSet laneSet = (LaneSet) result2_black[16];
			Lane lane = (Lane) result2_black[17];

			// solve CSP
			Object[] result3_bindingAndBlack = ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBBBBB(
							this, isApplicableMatch, inFlow, step,
							inFlowToStep, process, defaultFlow,
							exclusiveGateway, divergeFlow, normalStep, alt,
							initFlow, defaultFlowToInitFlow, egwToStep,
							divergeFlowToAlt, flow, divergeFlowToFlow, lane,
							laneSet, ruleResult);
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
								+ "[step] = "
								+ step
								+ ", "
								+ "[inFlowToStep] = "
								+ inFlowToStep
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[defaultFlow] = "
								+ defaultFlow
								+ ", "
								+ "[exclusiveGateway] = "
								+ exclusiveGateway
								+ ", "
								+ "[divergeFlow] = "
								+ divergeFlow
								+ ", "
								+ "[normalStep] = "
								+ normalStep
								+ ", "
								+ "[alt] = "
								+ alt
								+ ", "
								+ "[initFlow] = "
								+ initFlow
								+ ", "
								+ "[defaultFlowToInitFlow] = "
								+ defaultFlowToInitFlow
								+ ", "
								+ "[egwToStep] = "
								+ egwToStep
								+ ", "
								+ "[divergeFlowToAlt] = "
								+ divergeFlowToAlt
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[divergeFlowToFlow] = "
								+ divergeFlowToFlow
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ExcConvGwAfterExDivGwRuleImpl
					.pattern_ExcConvGwAfterExDivGwRule_18_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = ExcConvGwAfterExDivGwRuleImpl
						.pattern_ExcConvGwAfterExDivGwRule_18_5_blackBBBBBBBBBBBBBBBBB(
								step, inFlow, inFlowToStep, process,
								defaultFlow, exclusiveGateway, divergeFlow,
								normalStep, alt, initFlow,
								defaultFlowToInitFlow, egwToStep,
								divergeFlowToAlt, flow, divergeFlowToFlow,
								lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_18_6_blackBBBBBBBBBBBBBBBBBB(
									inFlow, step, inFlowToStep, process,
									defaultFlow, exclusiveGateway, divergeFlow,
									normalStep, alt, initFlow,
									defaultFlowToInitFlow, egwToStep,
									divergeFlowToAlt, flow, divergeFlowToFlow,
									lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[inFlow] = "
										+ inFlow
										+ ", "
										+ "[step] = "
										+ step
										+ ", "
										+ "[inFlowToStep] = "
										+ inFlowToStep
										+ ", "
										+ "[process] = "
										+ process
										+ ", "
										+ "[defaultFlow] = "
										+ defaultFlow
										+ ", "
										+ "[exclusiveGateway] = "
										+ exclusiveGateway
										+ ", "
										+ "[divergeFlow] = "
										+ divergeFlow
										+ ", "
										+ "[normalStep] = "
										+ normalStep
										+ ", "
										+ "[alt] = "
										+ alt
										+ ", "
										+ "[initFlow] = "
										+ initFlow
										+ ", "
										+ "[defaultFlowToInitFlow] = "
										+ defaultFlowToInitFlow
										+ ", "
										+ "[egwToStep] = "
										+ egwToStep
										+ ", "
										+ "[divergeFlowToAlt] = "
										+ divergeFlowToAlt
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[divergeFlowToFlow] = "
										+ divergeFlowToFlow
										+ ", "
										+ "[lane] = "
										+ lane
										+ ", "
										+ "[laneSet] = "
										+ laneSet
										+ ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					ExcConvGwAfterExDivGwRuleImpl
							.pattern_ExcConvGwAfterExDivGwRule_18_6_greenBBBBFFFFFBBB(
									inFlow, process, normalStep, initFlow,
									lane, ruleResult, csp);
					// ExclusiveGateway exConvGateway = (ExclusiveGateway) result6_green[4];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[5];
					// FlowNodeToStep ecgwToStep = (FlowNodeToStep) result6_green[6];
					// SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result6_green[7];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ExcConvGwAfterExDivGwRuleImpl
				.pattern_ExcConvGwAfterExDivGwRule_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			Lane lane, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Converging");
		literal1.setType("");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", csp);
		var_exConvGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0
				.solve(var_exConvGateway_gatewayDirection, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		isApplicableMatch.registerObject("egwToStep", egwToStep);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(Flow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SeqFlowToAltFlowAlt) arguments.get(13),
					(AlternativeFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(ExclusiveGateway) arguments.get(16),
					(SequenceFlow) arguments.get(17), (Lane) arguments.get(18),
					(LaneSet) arguments.get(19));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_305__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_305((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_306__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_306((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_307__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_307((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_308__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_308((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_309__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_309((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_310__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_310((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_311__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_311((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(Flow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SeqFlowToAltFlowAlt) arguments.get(13),
					(AlternativeFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(Lane) arguments.get(16), (LaneSet) arguments.get(17),
					(ModelgeneratorRuleResult) arguments.get(18));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_1_blackBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!exConvGateway.equals(exclusiveGateway)) {
									return new Object[] { _this, match, inFlow,
											process, defaultFlow,
											exclusiveGateway, divergeFlow,
											exConvGateway, outFlow, lane,
											laneSet };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_2_bindingFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, inFlow, process,
					defaultFlow, exclusiveGateway, divergeFlow, exConvGateway,
					outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_2_bindingAndBlackFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_0_2_binding = pattern_ExcConvGwAfterExDivGwRule_0_2_bindingFBBBBBBBBBBB(
				_this, match, inFlow, process, defaultFlow, exclusiveGateway,
				divergeFlow, exConvGateway, outFlow, lane, laneSet);
		if (result_pattern_ExcConvGwAfterExDivGwRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExcConvGwAfterExDivGwRule_0_2_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_0_2_black = pattern_ExcConvGwAfterExDivGwRule_0_2_blackB(csp);
			if (result_pattern_ExcConvGwAfterExDivGwRule_0_2_black != null) {

				return new Object[] { csp, _this, match, inFlow, process,
						defaultFlow, exclusiveGateway, divergeFlow,
						exConvGateway, outFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_0_3_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_4_blackBBBBBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!exConvGateway.equals(exclusiveGateway)) {
									return new Object[] { match, inFlow,
											process, defaultFlow,
											exclusiveGateway, divergeFlow,
											exConvGateway, outFlow, lane,
											laneSet };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_4_greenBBBBBBFFFFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(exConvGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(exConvGateway__outFlow____outgoing);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(lane__exConvGateway____flowNodeRefs);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		return new Object[] { match, inFlow, process, exConvGateway, outFlow,
				lane, process__outFlow____flowElements,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				lane__exConvGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_5_blackBBBBBBBBBB(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!exConvGateway.equals(exclusiveGateway)) {
									return new Object[] { match, inFlow,
											process, defaultFlow,
											exclusiveGateway, divergeFlow,
											exConvGateway, outFlow, lane,
											laneSet };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_0_5_greenBBBBBBBBFFFFFFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, Lane lane, LaneSet laneSet) {
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__defaultFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(defaultFlow);
		match.getContextNodes().add(exclusiveGateway);
		match.getContextNodes().add(divergeFlow);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__defaultFlow____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String exclusiveGateway__defaultFlow____default_name_prime = "default";
		String divergeFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__divergeFlow____outgoing_name_prime = "outgoing";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		match.getContextEdges().add(process__exclusiveGateway____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		match.getContextEdges().add(process__divergeFlow____flowElements);
		process__defaultFlow____flowElements.setSrc(process);
		process__defaultFlow____flowElements.setTrg(defaultFlow);
		match.getContextEdges().add(process__defaultFlow____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		exclusiveGateway__defaultFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____default.setTrg(defaultFlow);
		match.getContextEdges().add(exclusiveGateway__defaultFlow____default);
		divergeFlow__exclusiveGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		match.getContextEdges().add(divergeFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__divergeFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		match.getContextEdges().add(exclusiveGateway__divergeFlow____outgoing);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__defaultFlow____flowElements
				.setName(process__defaultFlow____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		exclusiveGateway__defaultFlow____default
				.setName(exclusiveGateway__defaultFlow____default_name_prime);
		divergeFlow__exclusiveGateway____sourceRef
				.setName(divergeFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__divergeFlow____outgoing
				.setName(exclusiveGateway__divergeFlow____outgoing_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, inFlow, process, defaultFlow,
				exclusiveGateway, divergeFlow, lane, laneSet,
				process__exclusiveGateway____flowElements,
				process__divergeFlow____flowElements,
				process__defaultFlow____flowElements,
				process__inFlow____flowElements,
				exclusiveGateway__defaultFlow____default,
				divergeFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__divergeFlow____outgoing,
				process__laneSet____laneSets, laneSet__lane____lanes };
	}

	public static final void pattern_ExcConvGwAfterExDivGwRule_0_6_expressionBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, inFlow, process, defaultFlow,
				exclusiveGateway, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_1_bindingFFFFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("inFlowToStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("defaultFlow");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("exclusiveGateway");
		EObject _localVariable_6 = isApplicableMatch.getObject("divergeFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_8 = isApplicableMatch.getObject("alt");
		EObject _localVariable_9 = isApplicableMatch.getObject("initFlow");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("defaultFlowToInitFlow");
		EObject _localVariable_11 = isApplicableMatch.getObject("egwToStep");
		EObject _localVariable_12 = isApplicableMatch
				.getObject("divergeFlowToAlt");
		EObject _localVariable_13 = isApplicableMatch.getObject("flow");
		EObject _localVariable_14 = isApplicableMatch
				.getObject("divergeFlowToFlow");
		EObject _localVariable_15 = isApplicableMatch
				.getObject("exConvGateway");
		EObject _localVariable_16 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_17 = isApplicableMatch.getObject("lane");
		EObject _localVariable_18 = isApplicableMatch.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpInFlowToStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpDefaultFlow = _localVariable_4;
		EObject tmpExclusiveGateway = _localVariable_5;
		EObject tmpDivergeFlow = _localVariable_6;
		EObject tmpNormalStep = _localVariable_7;
		EObject tmpAlt = _localVariable_8;
		EObject tmpInitFlow = _localVariable_9;
		EObject tmpDefaultFlowToInitFlow = _localVariable_10;
		EObject tmpEgwToStep = _localVariable_11;
		EObject tmpDivergeFlowToAlt = _localVariable_12;
		EObject tmpFlow = _localVariable_13;
		EObject tmpDivergeFlowToFlow = _localVariable_14;
		EObject tmpExConvGateway = _localVariable_15;
		EObject tmpOutFlow = _localVariable_16;
		EObject tmpLane = _localVariable_17;
		EObject tmpLaneSet = _localVariable_18;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpInFlowToStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
					if (tmpProcess instanceof bpmn2.Process) {
						bpmn2.Process process = (bpmn2.Process) tmpProcess;
						if (tmpDefaultFlow instanceof SequenceFlow) {
							SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
							if (tmpExclusiveGateway instanceof ExclusiveGateway) {
								ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
								if (tmpDivergeFlow instanceof SequenceFlow) {
									SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
									if (tmpNormalStep instanceof NormalStep) {
										NormalStep normalStep = (NormalStep) tmpNormalStep;
										if (tmpAlt instanceof AlternativeFlowAlternative) {
											AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
											if (tmpInitFlow instanceof Flow) {
												Flow initFlow = (Flow) tmpInitFlow;
												if (tmpDefaultFlowToInitFlow instanceof SequenceFlowToUCFlow) {
													SequenceFlowToUCFlow defaultFlowToInitFlow = (SequenceFlowToUCFlow) tmpDefaultFlowToInitFlow;
													if (tmpEgwToStep instanceof FlowNodeToStep) {
														FlowNodeToStep egwToStep = (FlowNodeToStep) tmpEgwToStep;
														if (tmpDivergeFlowToAlt instanceof SeqFlowToAltFlowAlt) {
															SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) tmpDivergeFlowToAlt;
															if (tmpFlow instanceof AlternativeFlow) {
																AlternativeFlow flow = (AlternativeFlow) tmpFlow;
																if (tmpDivergeFlowToFlow instanceof SequenceFlowToUCFlow) {
																	SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) tmpDivergeFlowToFlow;
																	if (tmpExConvGateway instanceof ExclusiveGateway) {
																		ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
																		if (tmpOutFlow instanceof SequenceFlow) {
																			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																			if (tmpLane instanceof Lane) {
																				Lane lane = (Lane) tmpLane;
																				if (tmpLaneSet instanceof LaneSet) {
																					LaneSet laneSet = (LaneSet) tmpLaneSet;
																					return new Object[] {
																							inFlow,
																							step,
																							inFlowToStep,
																							process,
																							defaultFlow,
																							exclusiveGateway,
																							divergeFlow,
																							normalStep,
																							alt,
																							initFlow,
																							defaultFlowToInitFlow,
																							egwToStep,
																							divergeFlowToAlt,
																							flow,
																							divergeFlowToFlow,
																							exConvGateway,
																							outFlow,
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_1_blackBBBBBBBBBBBBBBBBBBBFBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet, ExcConvGwAfterExDivGwRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!normalStep.equals(step)) {
									if (!defaultFlowToInitFlow
											.equals(divergeFlowToFlow)) {
										if (!flow.equals(initFlow)) {
											if (!exConvGateway
													.equals(exclusiveGateway)) {
												for (EObject tmpCsp : isApplicableMatch
														.getAttributeInfo()) {
													if (tmpCsp instanceof CSP) {
														CSP csp = (CSP) tmpCsp;
														return new Object[] {
																inFlow,
																step,
																inFlowToStep,
																process,
																defaultFlow,
																exclusiveGateway,
																divergeFlow,
																normalStep,
																alt,
																initFlow,
																defaultFlowToInitFlow,
																egwToStep,
																divergeFlowToAlt,
																flow,
																divergeFlowToFlow,
																exConvGateway,
																outFlow, lane,
																laneSet, csp,
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
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFFFBB(
			ExcConvGwAfterExDivGwRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding = pattern_ExcConvGwAfterExDivGwRule_1_1_bindingFFFFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[0];
			Step step = (Step) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[1];
			SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[2];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[3];
			SequenceFlow defaultFlow = (SequenceFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[4];
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[5];
			SequenceFlow divergeFlow = (SequenceFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[6];
			NormalStep normalStep = (NormalStep) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[7];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[8];
			Flow initFlow = (Flow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[9];
			SequenceFlowToUCFlow defaultFlowToInitFlow = (SequenceFlowToUCFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[10];
			FlowNodeToStep egwToStep = (FlowNodeToStep) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[11];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[12];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[13];
			SequenceFlowToUCFlow divergeFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[14];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[15];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[16];
			Lane lane = (Lane) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[17];
			LaneSet laneSet = (LaneSet) result_pattern_ExcConvGwAfterExDivGwRule_1_1_binding[18];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_1_1_black = pattern_ExcConvGwAfterExDivGwRule_1_1_blackBBBBBBBBBBBBBBBBBBBFBB(
					inFlow, step, inFlowToStep, process, defaultFlow,
					exclusiveGateway, divergeFlow, normalStep, alt, initFlow,
					defaultFlowToInitFlow, egwToStep, divergeFlowToAlt, flow,
					divergeFlowToFlow, exConvGateway, outFlow, lane, laneSet,
					_this, isApplicableMatch);
			if (result_pattern_ExcConvGwAfterExDivGwRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ExcConvGwAfterExDivGwRule_1_1_black[19];

				return new Object[] { inFlow, step, inFlowToStep, process,
						defaultFlow, exclusiveGateway, divergeFlow, normalStep,
						alt, initFlow, defaultFlowToInitFlow, egwToStep,
						divergeFlowToAlt, flow, divergeFlowToFlow,
						exConvGateway, outFlow, lane, laneSet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_1_greenBBBBFFF(
			NormalStep normalStep, Flow initFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		FlowNodeToStep ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		ecgwToStep.setSource(exConvGateway);
		ecgwToStep.setTarget(normalStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		return new Object[] { normalStep, initFlow, exConvGateway, outFlow,
				ecgwToStep, outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_2_blackBBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			FlowNodeToStep ecgwToStep, SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { exConvGateway, outFlow, ecgwToStep,
				outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_2_greenFBBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			FlowNodeToStep ecgwToStep, SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(exConvGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		ruleresult.getCreatedLinkElements().add(outFlowToInitFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, exConvGateway, outFlow, ecgwToStep,
				outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_3_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject step,
			EObject inFlowToStep, EObject process, EObject defaultFlow,
			EObject exclusiveGateway, EObject divergeFlow, EObject normalStep,
			EObject alt, EObject initFlow, EObject defaultFlowToInitFlow,
			EObject egwToStep, EObject divergeFlowToAlt, EObject flow,
			EObject divergeFlowToFlow, EObject exConvGateway, EObject outFlow,
			EObject ecgwToStep, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane, EObject laneSet) {
		if (!inFlow.equals(step)) {
			if (!inFlow.equals(inFlowToStep)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(normalStep)) {
						if (!inFlow.equals(initFlow)) {
							if (!inFlow.equals(outFlow)) {
								if (!inFlow.equals(outFlowToInitFlow)) {
									if (!inFlow.equals(outFlowToNormalStep)) {
										if (!inFlow.equals(lane)) {
											if (!inFlow.equals(laneSet)) {
												if (!inFlowToStep.equals(step)) {
													if (!inFlowToStep
															.equals(process)) {
														if (!inFlowToStep
																.equals(normalStep)) {
															if (!inFlowToStep
																	.equals(initFlow)) {
																if (!inFlowToStep
																		.equals(outFlow)) {
																	if (!inFlowToStep
																			.equals(outFlowToInitFlow)) {
																		if (!inFlowToStep
																				.equals(outFlowToNormalStep)) {
																			if (!inFlowToStep
																					.equals(lane)) {
																				if (!inFlowToStep
																						.equals(laneSet)) {
																					if (!process
																							.equals(step)) {
																						if (!defaultFlow
																								.equals(inFlow)) {
																							if (!defaultFlow
																									.equals(step)) {
																								if (!defaultFlow
																										.equals(inFlowToStep)) {
																									if (!defaultFlow
																											.equals(process)) {
																										if (!defaultFlow
																												.equals(exclusiveGateway)) {
																											if (!defaultFlow
																													.equals(divergeFlow)) {
																												if (!defaultFlow
																														.equals(normalStep)) {
																													if (!defaultFlow
																															.equals(initFlow)) {
																														if (!defaultFlow
																																.equals(defaultFlowToInitFlow)) {
																															if (!defaultFlow
																																	.equals(egwToStep)) {
																																if (!defaultFlow
																																		.equals(divergeFlowToAlt)) {
																																	if (!defaultFlow
																																			.equals(flow)) {
																																		if (!defaultFlow
																																				.equals(divergeFlowToFlow)) {
																																			if (!defaultFlow
																																					.equals(exConvGateway)) {
																																				if (!defaultFlow
																																						.equals(outFlow)) {
																																					if (!defaultFlow
																																							.equals(ecgwToStep)) {
																																						if (!defaultFlow
																																								.equals(outFlowToInitFlow)) {
																																							if (!defaultFlow
																																									.equals(outFlowToNormalStep)) {
																																								if (!defaultFlow
																																										.equals(lane)) {
																																									if (!defaultFlow
																																											.equals(laneSet)) {
																																										if (!exclusiveGateway
																																												.equals(inFlow)) {
																																											if (!exclusiveGateway
																																													.equals(step)) {
																																												if (!exclusiveGateway
																																														.equals(inFlowToStep)) {
																																													if (!exclusiveGateway
																																															.equals(process)) {
																																														if (!exclusiveGateway
																																																.equals(normalStep)) {
																																															if (!exclusiveGateway
																																																	.equals(initFlow)) {
																																																if (!exclusiveGateway
																																																		.equals(flow)) {
																																																	if (!exclusiveGateway
																																																			.equals(outFlow)) {
																																																		if (!exclusiveGateway
																																																				.equals(outFlowToInitFlow)) {
																																																			if (!exclusiveGateway
																																																					.equals(outFlowToNormalStep)) {
																																																				if (!exclusiveGateway
																																																						.equals(lane)) {
																																																					if (!exclusiveGateway
																																																							.equals(laneSet)) {
																																																						if (!divergeFlow
																																																								.equals(inFlow)) {
																																																							if (!divergeFlow
																																																									.equals(step)) {
																																																								if (!divergeFlow
																																																										.equals(inFlowToStep)) {
																																																									if (!divergeFlow
																																																											.equals(process)) {
																																																										if (!divergeFlow
																																																												.equals(exclusiveGateway)) {
																																																											if (!divergeFlow
																																																													.equals(normalStep)) {
																																																												if (!divergeFlow
																																																														.equals(initFlow)) {
																																																													if (!divergeFlow
																																																															.equals(egwToStep)) {
																																																														if (!divergeFlow
																																																																.equals(divergeFlowToAlt)) {
																																																															if (!divergeFlow
																																																																	.equals(flow)) {
																																																																if (!divergeFlow
																																																																		.equals(divergeFlowToFlow)) {
																																																																	if (!divergeFlow
																																																																			.equals(exConvGateway)) {
																																																																		if (!divergeFlow
																																																																				.equals(outFlow)) {
																																																																			if (!divergeFlow
																																																																					.equals(ecgwToStep)) {
																																																																				if (!divergeFlow
																																																																						.equals(outFlowToInitFlow)) {
																																																																					if (!divergeFlow
																																																																							.equals(outFlowToNormalStep)) {
																																																																						if (!divergeFlow
																																																																								.equals(lane)) {
																																																																							if (!divergeFlow
																																																																									.equals(laneSet)) {
																																																																								if (!normalStep
																																																																										.equals(step)) {
																																																																									if (!normalStep
																																																																											.equals(process)) {
																																																																										if (!normalStep
																																																																												.equals(outFlow)) {
																																																																											if (!normalStep
																																																																													.equals(outFlowToInitFlow)) {
																																																																												if (!normalStep
																																																																														.equals(outFlowToNormalStep)) {
																																																																													if (!alt.equals(inFlow)) {
																																																																														if (!alt.equals(step)) {
																																																																															if (!alt.equals(inFlowToStep)) {
																																																																																if (!alt.equals(process)) {
																																																																																	if (!alt.equals(defaultFlow)) {
																																																																																		if (!alt.equals(exclusiveGateway)) {
																																																																																			if (!alt.equals(divergeFlow)) {
																																																																																				if (!alt.equals(normalStep)) {
																																																																																					if (!alt.equals(initFlow)) {
																																																																																						if (!alt.equals(defaultFlowToInitFlow)) {
																																																																																							if (!alt.equals(egwToStep)) {
																																																																																								if (!alt.equals(divergeFlowToAlt)) {
																																																																																									if (!alt.equals(flow)) {
																																																																																										if (!alt.equals(divergeFlowToFlow)) {
																																																																																											if (!alt.equals(exConvGateway)) {
																																																																																												if (!alt.equals(outFlow)) {
																																																																																													if (!alt.equals(ecgwToStep)) {
																																																																																														if (!alt.equals(outFlowToInitFlow)) {
																																																																																															if (!alt.equals(outFlowToNormalStep)) {
																																																																																																if (!alt.equals(lane)) {
																																																																																																	if (!alt.equals(laneSet)) {
																																																																																																		if (!initFlow
																																																																																																				.equals(step)) {
																																																																																																			if (!initFlow
																																																																																																					.equals(process)) {
																																																																																																				if (!initFlow
																																																																																																						.equals(normalStep)) {
																																																																																																					if (!initFlow
																																																																																																							.equals(outFlow)) {
																																																																																																						if (!initFlow
																																																																																																								.equals(outFlowToInitFlow)) {
																																																																																																							if (!initFlow
																																																																																																									.equals(outFlowToNormalStep)) {
																																																																																																								if (!initFlow
																																																																																																										.equals(lane)) {
																																																																																																									if (!initFlow
																																																																																																											.equals(laneSet)) {
																																																																																																										if (!defaultFlowToInitFlow
																																																																																																												.equals(inFlow)) {
																																																																																																											if (!defaultFlowToInitFlow
																																																																																																													.equals(step)) {
																																																																																																												if (!defaultFlowToInitFlow
																																																																																																														.equals(inFlowToStep)) {
																																																																																																													if (!defaultFlowToInitFlow
																																																																																																															.equals(process)) {
																																																																																																														if (!defaultFlowToInitFlow
																																																																																																																.equals(exclusiveGateway)) {
																																																																																																															if (!defaultFlowToInitFlow
																																																																																																																	.equals(divergeFlow)) {
																																																																																																																if (!defaultFlowToInitFlow
																																																																																																																		.equals(normalStep)) {
																																																																																																																	if (!defaultFlowToInitFlow
																																																																																																																			.equals(initFlow)) {
																																																																																																																		if (!defaultFlowToInitFlow
																																																																																																																				.equals(egwToStep)) {
																																																																																																																			if (!defaultFlowToInitFlow
																																																																																																																					.equals(divergeFlowToAlt)) {
																																																																																																																				if (!defaultFlowToInitFlow
																																																																																																																						.equals(flow)) {
																																																																																																																					if (!defaultFlowToInitFlow
																																																																																																																							.equals(divergeFlowToFlow)) {
																																																																																																																						if (!defaultFlowToInitFlow
																																																																																																																								.equals(exConvGateway)) {
																																																																																																																							if (!defaultFlowToInitFlow
																																																																																																																									.equals(outFlow)) {
																																																																																																																								if (!defaultFlowToInitFlow
																																																																																																																										.equals(ecgwToStep)) {
																																																																																																																									if (!defaultFlowToInitFlow
																																																																																																																											.equals(outFlowToInitFlow)) {
																																																																																																																										if (!defaultFlowToInitFlow
																																																																																																																												.equals(outFlowToNormalStep)) {
																																																																																																																											if (!defaultFlowToInitFlow
																																																																																																																													.equals(lane)) {
																																																																																																																												if (!defaultFlowToInitFlow
																																																																																																																														.equals(laneSet)) {
																																																																																																																													if (!egwToStep
																																																																																																																															.equals(inFlow)) {
																																																																																																																														if (!egwToStep
																																																																																																																																.equals(step)) {
																																																																																																																															if (!egwToStep
																																																																																																																																	.equals(inFlowToStep)) {
																																																																																																																																if (!egwToStep
																																																																																																																																		.equals(process)) {
																																																																																																																																	if (!egwToStep
																																																																																																																																			.equals(exclusiveGateway)) {
																																																																																																																																		if (!egwToStep
																																																																																																																																				.equals(normalStep)) {
																																																																																																																																			if (!egwToStep
																																																																																																																																					.equals(initFlow)) {
																																																																																																																																				if (!egwToStep
																																																																																																																																						.equals(flow)) {
																																																																																																																																					if (!egwToStep
																																																																																																																																							.equals(exConvGateway)) {
																																																																																																																																						if (!egwToStep
																																																																																																																																								.equals(outFlow)) {
																																																																																																																																							if (!egwToStep
																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																								if (!egwToStep
																																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																																									if (!egwToStep
																																																																																																																																											.equals(lane)) {
																																																																																																																																										if (!egwToStep
																																																																																																																																												.equals(laneSet)) {
																																																																																																																																											if (!divergeFlowToAlt
																																																																																																																																													.equals(inFlow)) {
																																																																																																																																												if (!divergeFlowToAlt
																																																																																																																																														.equals(step)) {
																																																																																																																																													if (!divergeFlowToAlt
																																																																																																																																															.equals(inFlowToStep)) {
																																																																																																																																														if (!divergeFlowToAlt
																																																																																																																																																.equals(process)) {
																																																																																																																																															if (!divergeFlowToAlt
																																																																																																																																																	.equals(exclusiveGateway)) {
																																																																																																																																																if (!divergeFlowToAlt
																																																																																																																																																		.equals(normalStep)) {
																																																																																																																																																	if (!divergeFlowToAlt
																																																																																																																																																			.equals(initFlow)) {
																																																																																																																																																		if (!divergeFlowToAlt
																																																																																																																																																				.equals(egwToStep)) {
																																																																																																																																																			if (!divergeFlowToAlt
																																																																																																																																																					.equals(flow)) {
																																																																																																																																																				if (!divergeFlowToAlt
																																																																																																																																																						.equals(divergeFlowToFlow)) {
																																																																																																																																																					if (!divergeFlowToAlt
																																																																																																																																																							.equals(exConvGateway)) {
																																																																																																																																																						if (!divergeFlowToAlt
																																																																																																																																																								.equals(outFlow)) {
																																																																																																																																																							if (!divergeFlowToAlt
																																																																																																																																																									.equals(ecgwToStep)) {
																																																																																																																																																								if (!divergeFlowToAlt
																																																																																																																																																										.equals(outFlowToInitFlow)) {
																																																																																																																																																									if (!divergeFlowToAlt
																																																																																																																																																											.equals(outFlowToNormalStep)) {
																																																																																																																																																										if (!divergeFlowToAlt
																																																																																																																																																												.equals(lane)) {
																																																																																																																																																											if (!divergeFlowToAlt
																																																																																																																																																													.equals(laneSet)) {
																																																																																																																																																												if (!flow
																																																																																																																																																														.equals(inFlow)) {
																																																																																																																																																													if (!flow
																																																																																																																																																															.equals(step)) {
																																																																																																																																																														if (!flow
																																																																																																																																																																.equals(inFlowToStep)) {
																																																																																																																																																															if (!flow
																																																																																																																																																																	.equals(process)) {
																																																																																																																																																																if (!flow
																																																																																																																																																																		.equals(normalStep)) {
																																																																																																																																																																	if (!flow
																																																																																																																																																																			.equals(initFlow)) {
																																																																																																																																																																		if (!flow
																																																																																																																																																																				.equals(outFlow)) {
																																																																																																																																																																			if (!flow
																																																																																																																																																																					.equals(outFlowToInitFlow)) {
																																																																																																																																																																				if (!flow
																																																																																																																																																																						.equals(outFlowToNormalStep)) {
																																																																																																																																																																					if (!flow
																																																																																																																																																																							.equals(lane)) {
																																																																																																																																																																						if (!flow
																																																																																																																																																																								.equals(laneSet)) {
																																																																																																																																																																							if (!divergeFlowToFlow
																																																																																																																																																																									.equals(inFlow)) {
																																																																																																																																																																								if (!divergeFlowToFlow
																																																																																																																																																																										.equals(step)) {
																																																																																																																																																																									if (!divergeFlowToFlow
																																																																																																																																																																											.equals(inFlowToStep)) {
																																																																																																																																																																										if (!divergeFlowToFlow
																																																																																																																																																																												.equals(process)) {
																																																																																																																																																																											if (!divergeFlowToFlow
																																																																																																																																																																													.equals(exclusiveGateway)) {
																																																																																																																																																																												if (!divergeFlowToFlow
																																																																																																																																																																														.equals(normalStep)) {
																																																																																																																																																																													if (!divergeFlowToFlow
																																																																																																																																																																															.equals(initFlow)) {
																																																																																																																																																																														if (!divergeFlowToFlow
																																																																																																																																																																																.equals(egwToStep)) {
																																																																																																																																																																															if (!divergeFlowToFlow
																																																																																																																																																																																	.equals(flow)) {
																																																																																																																																																																																if (!divergeFlowToFlow
																																																																																																																																																																																		.equals(exConvGateway)) {
																																																																																																																																																																																	if (!divergeFlowToFlow
																																																																																																																																																																																			.equals(outFlow)) {
																																																																																																																																																																																		if (!divergeFlowToFlow
																																																																																																																																																																																				.equals(ecgwToStep)) {
																																																																																																																																																																																			if (!divergeFlowToFlow
																																																																																																																																																																																					.equals(outFlowToInitFlow)) {
																																																																																																																																																																																				if (!divergeFlowToFlow
																																																																																																																																																																																						.equals(outFlowToNormalStep)) {
																																																																																																																																																																																					if (!divergeFlowToFlow
																																																																																																																																																																																							.equals(lane)) {
																																																																																																																																																																																						if (!divergeFlowToFlow
																																																																																																																																																																																								.equals(laneSet)) {
																																																																																																																																																																																							if (!exConvGateway
																																																																																																																																																																																									.equals(inFlow)) {
																																																																																																																																																																																								if (!exConvGateway
																																																																																																																																																																																										.equals(step)) {
																																																																																																																																																																																									if (!exConvGateway
																																																																																																																																																																																											.equals(inFlowToStep)) {
																																																																																																																																																																																										if (!exConvGateway
																																																																																																																																																																																												.equals(process)) {
																																																																																																																																																																																											if (!exConvGateway
																																																																																																																																																																																													.equals(exclusiveGateway)) {
																																																																																																																																																																																												if (!exConvGateway
																																																																																																																																																																																														.equals(normalStep)) {
																																																																																																																																																																																													if (!exConvGateway
																																																																																																																																																																																															.equals(initFlow)) {
																																																																																																																																																																																														if (!exConvGateway
																																																																																																																																																																																																.equals(flow)) {
																																																																																																																																																																																															if (!exConvGateway
																																																																																																																																																																																																	.equals(outFlow)) {
																																																																																																																																																																																																if (!exConvGateway
																																																																																																																																																																																																		.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																	if (!exConvGateway
																																																																																																																																																																																																			.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																		if (!exConvGateway
																																																																																																																																																																																																				.equals(lane)) {
																																																																																																																																																																																																			if (!exConvGateway
																																																																																																																																																																																																					.equals(laneSet)) {
																																																																																																																																																																																																				if (!outFlow
																																																																																																																																																																																																						.equals(step)) {
																																																																																																																																																																																																					if (!outFlow
																																																																																																																																																																																																							.equals(process)) {
																																																																																																																																																																																																						if (!outFlow
																																																																																																																																																																																																								.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																							if (!outFlow
																																																																																																																																																																																																									.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																								if (!ecgwToStep
																																																																																																																																																																																																										.equals(inFlow)) {
																																																																																																																																																																																																									if (!ecgwToStep
																																																																																																																																																																																																											.equals(step)) {
																																																																																																																																																																																																										if (!ecgwToStep
																																																																																																																																																																																																												.equals(inFlowToStep)) {
																																																																																																																																																																																																											if (!ecgwToStep
																																																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																																																												if (!ecgwToStep
																																																																																																																																																																																																														.equals(exclusiveGateway)) {
																																																																																																																																																																																																													if (!ecgwToStep
																																																																																																																																																																																																															.equals(normalStep)) {
																																																																																																																																																																																																														if (!ecgwToStep
																																																																																																																																																																																																																.equals(initFlow)) {
																																																																																																																																																																																																															if (!ecgwToStep
																																																																																																																																																																																																																	.equals(egwToStep)) {
																																																																																																																																																																																																																if (!ecgwToStep
																																																																																																																																																																																																																		.equals(flow)) {
																																																																																																																																																																																																																	if (!ecgwToStep
																																																																																																																																																																																																																			.equals(exConvGateway)) {
																																																																																																																																																																																																																		if (!ecgwToStep
																																																																																																																																																																																																																				.equals(outFlow)) {
																																																																																																																																																																																																																			if (!ecgwToStep
																																																																																																																																																																																																																					.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																				if (!ecgwToStep
																																																																																																																																																																																																																						.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																																					if (!ecgwToStep
																																																																																																																																																																																																																							.equals(lane)) {
																																																																																																																																																																																																																						if (!ecgwToStep
																																																																																																																																																																																																																								.equals(laneSet)) {
																																																																																																																																																																																																																							if (!outFlowToInitFlow
																																																																																																																																																																																																																									.equals(step)) {
																																																																																																																																																																																																																								if (!outFlowToInitFlow
																																																																																																																																																																																																																										.equals(process)) {
																																																																																																																																																																																																																									if (!outFlowToInitFlow
																																																																																																																																																																																																																											.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																																										if (!outFlowToNormalStep
																																																																																																																																																																																																																												.equals(step)) {
																																																																																																																																																																																																																											if (!outFlowToNormalStep
																																																																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																																																																												if (!lane
																																																																																																																																																																																																																														.equals(step)) {
																																																																																																																																																																																																																													if (!lane
																																																																																																																																																																																																																															.equals(process)) {
																																																																																																																																																																																																																														if (!lane
																																																																																																																																																																																																																																.equals(normalStep)) {
																																																																																																																																																																																																																															if (!lane
																																																																																																																																																																																																																																	.equals(outFlow)) {
																																																																																																																																																																																																																																if (!lane
																																																																																																																																																																																																																																		.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																	if (!lane
																																																																																																																																																																																																																																			.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																																																		if (!lane
																																																																																																																																																																																																																																				.equals(laneSet)) {
																																																																																																																																																																																																																																			if (!laneSet
																																																																																																																																																																																																																																					.equals(step)) {
																																																																																																																																																																																																																																				if (!laneSet
																																																																																																																																																																																																																																						.equals(process)) {
																																																																																																																																																																																																																																					if (!laneSet
																																																																																																																																																																																																																																							.equals(normalStep)) {
																																																																																																																																																																																																																																						if (!laneSet
																																																																																																																																																																																																																																								.equals(outFlow)) {
																																																																																																																																																																																																																																							if (!laneSet
																																																																																																																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																																																																																																																								if (!laneSet
																																																																																																																																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											inFlow,
																																																																																																																																																																																																																																											step,
																																																																																																																																																																																																																																											inFlowToStep,
																																																																																																																																																																																																																																											process,
																																																																																																																																																																																																																																											defaultFlow,
																																																																																																																																																																																																																																											exclusiveGateway,
																																																																																																																																																																																																																																											divergeFlow,
																																																																																																																																																																																																																																											normalStep,
																																																																																																																																																																																																																																											alt,
																																																																																																																																																																																																																																											initFlow,
																																																																																																																																																																																																																																											defaultFlowToInitFlow,
																																																																																																																																																																																																																																											egwToStep,
																																																																																																																																																																																																																																											divergeFlowToAlt,
																																																																																																																																																																																																																																											flow,
																																																																																																																																																																																																																																											divergeFlowToFlow,
																																																																																																																																																																																																																																											exConvGateway,
																																																																																																																																																																																																																																											outFlow,
																																																																																																																																																																																																																																											ecgwToStep,
																																																																																																																																																																																																																																											outFlowToInitFlow,
																																																																																																																																																																																																																																											outFlowToNormalStep,
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
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject process,
			EObject normalStep, EObject initFlow, EObject exConvGateway,
			EObject outFlow, EObject ecgwToStep, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane) {
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ecgwToStep__exConvGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ecgwToStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__initFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExcConvGwAfterExDivGwRule";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String ecgwToStep__exConvGateway____source_name_prime = "source";
		String ecgwToStep__normalStep____target_name_prime = "target";
		String outFlowToInitFlow__outFlow____source_name_prime = "source";
		String outFlowToInitFlow__initFlow____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges().add(inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges()
				.add(outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(exConvGateway__outFlow____outgoing);
		ecgwToStep__exConvGateway____source.setSrc(ecgwToStep);
		ecgwToStep__exConvGateway____source.setTrg(exConvGateway);
		ruleresult.getCreatedEdges().add(ecgwToStep__exConvGateway____source);
		ecgwToStep__normalStep____target.setSrc(ecgwToStep);
		ecgwToStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(ecgwToStep__normalStep____target);
		outFlowToInitFlow__outFlow____source.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__outFlow____source);
		outFlowToInitFlow__initFlow____target.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__initFlow____target.setTrg(initFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__initFlow____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges()
				.add(lane__exConvGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		ecgwToStep__exConvGateway____source
				.setName(ecgwToStep__exConvGateway____source_name_prime);
		ecgwToStep__normalStep____target
				.setName(ecgwToStep__normalStep____target_name_prime);
		outFlowToInitFlow__outFlow____source
				.setName(outFlowToInitFlow__outFlow____source_name_prime);
		outFlowToInitFlow__initFlow____target
				.setName(outFlowToInitFlow__initFlow____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, process, normalStep,
				initFlow, exConvGateway, outFlow, ecgwToStep,
				outFlowToInitFlow, outFlowToNormalStep, lane,
				process__outFlow____flowElements,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				ecgwToStep__exConvGateway____source,
				ecgwToStep__normalStep____target,
				outFlowToInitFlow__outFlow____source,
				outFlowToInitFlow__initFlow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				lane__exConvGateway____flowNodeRefs };
	}

	public static final void pattern_ExcConvGwAfterExDivGwRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject step, EObject inFlowToStep,
			EObject process, EObject defaultFlow, EObject exclusiveGateway,
			EObject divergeFlow, EObject normalStep, EObject alt,
			EObject initFlow, EObject defaultFlowToInitFlow, EObject egwToStep,
			EObject divergeFlowToAlt, EObject flow, EObject divergeFlowToFlow,
			EObject exConvGateway, EObject outFlow, EObject ecgwToStep,
			EObject outFlowToInitFlow, EObject outFlowToNormalStep,
			EObject lane, EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, inFlow, step, inFlowToStep,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				normalStep, alt, initFlow, defaultFlowToInitFlow, egwToStep,
				divergeFlowToAlt, flow, divergeFlowToFlow, exConvGateway,
				outFlow, ecgwToStep, outFlowToInitFlow, outFlowToNormalStep,
				lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExcConvGwAfterExDivGwRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_1_blackFBB(
			EClass eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_2_1_binding = pattern_ExcConvGwAfterExDivGwRule_2_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_2_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_2_1_black = pattern_ExcConvGwAfterExDivGwRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExcConvGwAfterExDivGwRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_2_bindingFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("inFlow");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("defaultFlow");
		EObject _localVariable_3 = match.getObject("exclusiveGateway");
		EObject _localVariable_4 = match.getObject("divergeFlow");
		EObject _localVariable_5 = match.getObject("exConvGateway");
		EObject _localVariable_6 = match.getObject("outFlow");
		EObject _localVariable_7 = match.getObject("lane");
		EObject _localVariable_8 = match.getObject("laneSet");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpDefaultFlow = _localVariable_2;
		EObject tmpExclusiveGateway = _localVariable_3;
		EObject tmpDivergeFlow = _localVariable_4;
		EObject tmpExConvGateway = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpProcess instanceof bpmn2.Process) {
				bpmn2.Process process = (bpmn2.Process) tmpProcess;
				if (tmpDefaultFlow instanceof SequenceFlow) {
					SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
					if (tmpExclusiveGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
						if (tmpDivergeFlow instanceof SequenceFlow) {
							SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
							if (tmpExConvGateway instanceof ExclusiveGateway) {
								ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											return new Object[] { inFlow,
													process, defaultFlow,
													exclusiveGateway,
													divergeFlow, exConvGateway,
													outFlow, lane, laneSet,
													match };
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

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_2_2_blackBFFBBBBFFFFFFFFBBBBB(
			SequenceFlow inFlow, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!exConvGateway.equals(exclusiveGateway)) {
									for (SequenceFlowToStep inFlowToStep : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(inFlow,
													SequenceFlowToStep.class,
													"source")) {
										Step step = inFlowToStep.getTarget();
										if (step != null) {
											for (SequenceFlowToUCFlow defaultFlowToInitFlow : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															defaultFlow,
															SequenceFlowToUCFlow.class,
															"source")) {
												Flow initFlow = defaultFlowToInitFlow
														.getTarget();
												if (initFlow != null) {
													for (FlowNodeToStep egwToStep : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	exclusiveGateway,
																	FlowNodeToStep.class,
																	"source")) {
														Step tmpNormalStep = egwToStep
																.getTarget();
														if (tmpNormalStep instanceof NormalStep) {
															NormalStep normalStep = (NormalStep) tmpNormalStep;
															if (!normalStep
																	.equals(step)) {
																for (SeqFlowToAltFlowAlt divergeFlowToAlt : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				divergeFlow,
																				SeqFlowToAltFlowAlt.class,
																				"source")) {
																	AlternativeFlowAlternative alt = divergeFlowToAlt
																			.getTarget();
																	if (alt != null) {
																		for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						divergeFlow,
																						SequenceFlowToUCFlow.class,
																						"source")) {
																			if (!defaultFlowToInitFlow
																					.equals(divergeFlowToFlow)) {
																				Flow tmpFlow = divergeFlowToFlow
																						.getTarget();
																				if (tmpFlow instanceof AlternativeFlow) {
																					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
																					if (!flow
																							.equals(initFlow)) {
																						_result.add(new Object[] {
																								inFlow,
																								step,
																								inFlowToStep,
																								process,
																								defaultFlow,
																								exclusiveGateway,
																								divergeFlow,
																								normalStep,
																								alt,
																								initFlow,
																								defaultFlowToInitFlow,
																								egwToStep,
																								divergeFlowToAlt,
																								flow,
																								divergeFlowToFlow,
																								exConvGateway,
																								outFlow,
																								lane,
																								laneSet,
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
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_3_black_nac_0BB(
			Step step, NormalStep normalStep) {
		if (!normalStep.equals(step)) {
			Step nextStep = step.getNext();
			if (nextStep != null) {
				if (!step.equals(nextStep)) {
					if (!normalStep.equals(nextStep)) {
						return new Object[] { step, normalStep };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_2_3_blackBBBBBBBBBBBBBBBBBBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								if (!normalStep.equals(step)) {
									if (!defaultFlowToInitFlow
											.equals(divergeFlowToFlow)) {
										if (!flow.equals(initFlow)) {
											if (!exConvGateway
													.equals(exclusiveGateway)) {
												if (inFlow.equals(inFlowToStep
														.getSource())) {
													if (step.equals(inFlowToStep
															.getTarget())) {
														if (process
																.getFlowElements()
																.contains(
																		exclusiveGateway)) {
															if (process
																	.getFlowElements()
																	.contains(
																			divergeFlow)) {
																if (process
																		.getFlowElements()
																		.contains(
																				defaultFlow)) {
																	if (process
																			.getFlowElements()
																			.contains(
																					inFlow)) {
																		if (defaultFlow
																				.equals(exclusiveGateway
																						.getDefault())) {
																			if (exclusiveGateway
																					.equals(divergeFlow
																							.getSourceRef())) {
																				if (normalStep
																						.getStepAlternative()
																						.contains(
																								alt)) {
																					if (flow.equals(alt
																							.getRef())) {
																						if (initFlow
																								.getSteps()
																								.contains(
																										normalStep)) {
																							if (defaultFlow
																									.equals(defaultFlowToInitFlow
																											.getSource())) {
																								if (initFlow
																										.equals(defaultFlowToInitFlow
																												.getTarget())) {
																									if (exclusiveGateway
																											.equals(egwToStep
																													.getSource())) {
																										if (normalStep
																												.equals(egwToStep
																														.getTarget())) {
																											if (divergeFlow
																													.equals(divergeFlowToAlt
																															.getSource())) {
																												if (alt.equals(divergeFlowToAlt
																														.getTarget())) {
																													if (flow.getSteps()
																															.contains(
																																	step)) {
																														if (divergeFlow
																																.equals(divergeFlowToFlow
																																		.getSource())) {
																															if (flow.equals(divergeFlowToFlow
																																	.getTarget())) {
																																if (process
																																		.getFlowElements()
																																		.contains(
																																				outFlow)) {
																																	if (process
																																			.getLaneSets()
																																			.contains(
																																					laneSet)) {
																																		if (process
																																				.getFlowElements()
																																				.contains(
																																						exConvGateway)) {
																																			if (exConvGateway
																																					.equals(inFlow
																																							.getTargetRef())) {
																																				if (exConvGateway
																																						.equals(outFlow
																																								.getSourceRef())) {
																																					if (lane.getFlowNodeRefs()
																																							.contains(
																																									exConvGateway)) {
																																						if (laneSet
																																								.getLanes()
																																								.contains(
																																										lane)) {
																																							if (pattern_ExcConvGwAfterExDivGwRule_2_3_black_nac_0BB(
																																									step,
																																									normalStep) == null) {
																																								_result.add(new Object[] {
																																										inFlow,
																																										step,
																																										inFlowToStep,
																																										process,
																																										defaultFlow,
																																										exclusiveGateway,
																																										divergeFlow,
																																										normalStep,
																																										alt,
																																										initFlow,
																																										defaultFlowToInitFlow,
																																										egwToStep,
																																										divergeFlowToAlt,
																																										flow,
																																										divergeFlowToFlow,
																																										exConvGateway,
																																										outFlow,
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
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_3_greenBBBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlowToStep__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exclusiveGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__defaultFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__defaultFlow____default = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__exclusiveGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exclusiveGateway__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge initFlow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToInitFlow__defaultFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge defaultFlowToInitFlow__initFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge egwToStep__exclusiveGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge egwToStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToAlt__divergeFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__divergeFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlowToStep__inFlow____source_name_prime = "source";
		String inFlowToStep__step____target_name_prime = "target";
		String process__exclusiveGateway____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__defaultFlow____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String exclusiveGateway__defaultFlow____default_name_prime = "default";
		String divergeFlow__exclusiveGateway____sourceRef_name_prime = "sourceRef";
		String exclusiveGateway__divergeFlow____outgoing_name_prime = "outgoing";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__flow____ref_name_prime = "ref";
		String initFlow__normalStep____steps_name_prime = "steps";
		String defaultFlowToInitFlow__defaultFlow____source_name_prime = "source";
		String defaultFlowToInitFlow__initFlow____target_name_prime = "target";
		String egwToStep__exclusiveGateway____source_name_prime = "source";
		String egwToStep__normalStep____target_name_prime = "target";
		String divergeFlowToAlt__divergeFlow____source_name_prime = "source";
		String divergeFlowToAlt__alt____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String divergeFlowToFlow__divergeFlow____source_name_prime = "source";
		String divergeFlowToFlow__flow____target_name_prime = "target";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(inFlowToStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(defaultFlow);
		isApplicableMatch.getAllContextElements().add(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(divergeFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(initFlow);
		isApplicableMatch.getAllContextElements().add(defaultFlowToInitFlow);
		isApplicableMatch.getAllContextElements().add(egwToStep);
		isApplicableMatch.getAllContextElements().add(divergeFlowToAlt);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(divergeFlowToFlow);
		isApplicableMatch.getAllContextElements().add(exConvGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		inFlowToStep__inFlow____source.setSrc(inFlowToStep);
		inFlowToStep__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__inFlow____source);
		inFlowToStep__step____target.setSrc(inFlowToStep);
		inFlowToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				inFlowToStep__step____target);
		process__exclusiveGateway____flowElements.setSrc(process);
		process__exclusiveGateway____flowElements.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exclusiveGateway____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				process__divergeFlow____flowElements);
		process__defaultFlow____flowElements.setSrc(process);
		process__defaultFlow____flowElements.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				process__defaultFlow____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		exclusiveGateway__defaultFlow____default.setSrc(exclusiveGateway);
		exclusiveGateway__defaultFlow____default.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__defaultFlow____default);
		divergeFlow__exclusiveGateway____sourceRef.setSrc(divergeFlow);
		divergeFlow__exclusiveGateway____sourceRef.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow__exclusiveGateway____sourceRef);
		exclusiveGateway__divergeFlow____outgoing.setSrc(exclusiveGateway);
		exclusiveGateway__divergeFlow____outgoing.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				exclusiveGateway__divergeFlow____outgoing);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				normalStep__alt____stepAlternative);
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(alt__flow____ref);
		initFlow__normalStep____steps.setSrc(initFlow);
		initFlow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				initFlow__normalStep____steps);
		defaultFlowToInitFlow__defaultFlow____source
				.setSrc(defaultFlowToInitFlow);
		defaultFlowToInitFlow__defaultFlow____source.setTrg(defaultFlow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToInitFlow__defaultFlow____source);
		defaultFlowToInitFlow__initFlow____target.setSrc(defaultFlowToInitFlow);
		defaultFlowToInitFlow__initFlow____target.setTrg(initFlow);
		isApplicableMatch.getAllContextElements().add(
				defaultFlowToInitFlow__initFlow____target);
		egwToStep__exclusiveGateway____source.setSrc(egwToStep);
		egwToStep__exclusiveGateway____source.setTrg(exclusiveGateway);
		isApplicableMatch.getAllContextElements().add(
				egwToStep__exclusiveGateway____source);
		egwToStep__normalStep____target.setSrc(egwToStep);
		egwToStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				egwToStep__normalStep____target);
		divergeFlowToAlt__divergeFlow____source.setSrc(divergeFlowToAlt);
		divergeFlowToAlt__divergeFlow____source.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToAlt__divergeFlow____source);
		divergeFlowToAlt__alt____target.setSrc(divergeFlowToAlt);
		divergeFlowToAlt__alt____target.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToAlt__alt____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		divergeFlowToFlow__divergeFlow____source.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__divergeFlow____source.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__divergeFlow____source);
		divergeFlowToFlow__flow____target.setSrc(divergeFlowToFlow);
		divergeFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToFlow__flow____target);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exConvGateway__outFlow____outgoing);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__exConvGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlowToStep__inFlow____source
				.setName(inFlowToStep__inFlow____source_name_prime);
		inFlowToStep__step____target
				.setName(inFlowToStep__step____target_name_prime);
		process__exclusiveGateway____flowElements
				.setName(process__exclusiveGateway____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__defaultFlow____flowElements
				.setName(process__defaultFlow____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		exclusiveGateway__defaultFlow____default
				.setName(exclusiveGateway__defaultFlow____default_name_prime);
		divergeFlow__exclusiveGateway____sourceRef
				.setName(divergeFlow__exclusiveGateway____sourceRef_name_prime);
		exclusiveGateway__divergeFlow____outgoing
				.setName(exclusiveGateway__divergeFlow____outgoing_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		initFlow__normalStep____steps
				.setName(initFlow__normalStep____steps_name_prime);
		defaultFlowToInitFlow__defaultFlow____source
				.setName(defaultFlowToInitFlow__defaultFlow____source_name_prime);
		defaultFlowToInitFlow__initFlow____target
				.setName(defaultFlowToInitFlow__initFlow____target_name_prime);
		egwToStep__exclusiveGateway____source
				.setName(egwToStep__exclusiveGateway____source_name_prime);
		egwToStep__normalStep____target
				.setName(egwToStep__normalStep____target_name_prime);
		divergeFlowToAlt__divergeFlow____source
				.setName(divergeFlowToAlt__divergeFlow____source_name_prime);
		divergeFlowToAlt__alt____target
				.setName(divergeFlowToAlt__alt____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		divergeFlowToFlow__divergeFlow____source
				.setName(divergeFlowToFlow__divergeFlow____source_name_prime);
		divergeFlowToFlow__flow____target
				.setName(divergeFlowToFlow__flow____target_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { inFlow, step, inFlowToStep, process, defaultFlow,
				exclusiveGateway, divergeFlow, normalStep, alt, initFlow,
				defaultFlowToInitFlow, egwToStep, divergeFlowToAlt, flow,
				divergeFlowToFlow, exConvGateway, outFlow, lane, laneSet,
				isApplicableMatch, inFlowToStep__inFlow____source,
				inFlowToStep__step____target,
				process__exclusiveGateway____flowElements,
				process__divergeFlow____flowElements,
				process__defaultFlow____flowElements,
				process__inFlow____flowElements,
				exclusiveGateway__defaultFlow____default,
				divergeFlow__exclusiveGateway____sourceRef,
				exclusiveGateway__divergeFlow____outgoing,
				normalStep__alt____stepAlternative, alt__flow____ref,
				initFlow__normalStep____steps,
				defaultFlowToInitFlow__defaultFlow____source,
				defaultFlowToInitFlow__initFlow____target,
				egwToStep__exclusiveGateway____source,
				egwToStep__normalStep____target,
				divergeFlowToAlt__divergeFlow____source,
				divergeFlowToAlt__alt____target, flow__step____steps,
				divergeFlowToFlow__divergeFlow____source,
				divergeFlowToFlow__flow____target,
				process__outFlow____flowElements, process__laneSet____laneSets,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				lane__exConvGateway____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_4_bindingFBBBBBBBBBBBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, inFlow, step, inFlowToStep, process,
				defaultFlow, exclusiveGateway, divergeFlow, normalStep, alt,
				initFlow, defaultFlowToInitFlow, egwToStep, divergeFlowToAlt,
				flow, divergeFlowToFlow, exConvGateway, outFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow, step,
					inFlowToStep, process, defaultFlow, exclusiveGateway,
					divergeFlow, normalStep, alt, initFlow,
					defaultFlowToInitFlow, egwToStep, divergeFlowToAlt, flow,
					divergeFlowToFlow, exConvGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_2_4_binding = pattern_ExcConvGwAfterExDivGwRule_2_4_bindingFBBBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, step, inFlowToStep, process,
				defaultFlow, exclusiveGateway, divergeFlow, normalStep, alt,
				initFlow, defaultFlowToInitFlow, egwToStep, divergeFlowToAlt,
				flow, divergeFlowToFlow, exConvGateway, outFlow, lane, laneSet);
		if (result_pattern_ExcConvGwAfterExDivGwRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExcConvGwAfterExDivGwRule_2_4_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_2_4_black = pattern_ExcConvGwAfterExDivGwRule_2_4_blackB(csp);
			if (result_pattern_ExcConvGwAfterExDivGwRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						step, inFlowToStep, process, defaultFlow,
						exclusiveGateway, divergeFlow, normalStep, alt,
						initFlow, defaultFlowToInitFlow, egwToStep,
						divergeFlowToAlt, flow, divergeFlowToFlow,
						exConvGateway, outFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_2_5_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExcConvGwAfterExDivGwRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExcConvGwAfterExDivGwRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_10_1_binding = pattern_ExcConvGwAfterExDivGwRule_10_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_10_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_10_1_black = pattern_ExcConvGwAfterExDivGwRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_999796 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_999796 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_999796)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_999796)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_999796)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_999796)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_589446 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_589446)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_589446)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_10_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpExConvGateway = outFlow.getSourceRef();
					if (tmpExConvGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
						if (process.getFlowElements().contains(exConvGateway)) {
							if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_5BB(
									exConvGateway, outFlow) == null) {
								if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_8BB(
										outFlow, exConvGateway) == null) {
									for (FlowElement tmpExclusiveGateway : process
											.getFlowElements()) {
										if (tmpExclusiveGateway instanceof ExclusiveGateway) {
											ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
											if (!exConvGateway
													.equals(exclusiveGateway)) {
												SequenceFlow defaultFlow = exclusiveGateway
														.getDefault();
												if (defaultFlow != null) {
													if (!defaultFlow
															.equals(outFlow)) {
														if (process
																.getFlowElements()
																.contains(
																		defaultFlow)) {
															if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_1BBB(
																	outFlow,
																	exclusiveGateway,
																	exConvGateway) == null) {
																if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_9BB(
																		exclusiveGateway,
																		outFlow) == null) {
																	if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_3BB(
																			exConvGateway,
																			defaultFlow) == null) {
																		if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_6BB(
																				defaultFlow,
																				exConvGateway) == null) {
																			for (FlowElement tmpDivergeFlow : process
																					.getFlowElements()) {
																				if (tmpDivergeFlow instanceof SequenceFlow) {
																					SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																					if (!defaultFlow
																							.equals(divergeFlow)) {
																						if (!divergeFlow
																								.equals(outFlow)) {
																							if (exclusiveGateway
																									.equals(divergeFlow
																											.getSourceRef())) {
																								if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_4BB(
																										exConvGateway,
																										divergeFlow) == null) {
																									if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_7BB(
																											divergeFlow,
																											exConvGateway) == null) {
																										for (FlowElement tmpInFlow : process
																												.getFlowElements()) {
																											if (tmpInFlow instanceof SequenceFlow) {
																												SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																												if (!inFlow
																														.equals(outFlow)) {
																													if (!defaultFlow
																															.equals(inFlow)) {
																														if (!divergeFlow
																																.equals(inFlow)) {
																															if (exConvGateway
																																	.equals(inFlow
																																			.getTargetRef())) {
																																if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_0BBBBB(
																																		exConvGateway,
																																		inFlow,
																																		defaultFlow,
																																		divergeFlow,
																																		outFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_10_2_black_nac_2BB(
																																			exConvGateway,
																																			inFlow) == null) {
																																		for (LaneSet laneSet : process
																																				.getLaneSets()) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								exConvGateway)) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																			}
																		}
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_10_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_10_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_11_1_binding = pattern_ExcConvGwAfterExDivGwRule_11_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_11_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_11_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_11_1_black = pattern_ExcConvGwAfterExDivGwRule_11_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_11_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_11_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_814681 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_814681 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_814681)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_814681)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_814681)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_814681)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_552870 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_552870)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_552870)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_11_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpExConvGateway = _edge_flowElements.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (process.getFlowElements().contains(exConvGateway)) {
					for (FlowElement tmpExclusiveGateway : process
							.getFlowElements()) {
						if (tmpExclusiveGateway instanceof ExclusiveGateway) {
							ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
							if (!exConvGateway.equals(exclusiveGateway)) {
								SequenceFlow defaultFlow = exclusiveGateway
										.getDefault();
								if (defaultFlow != null) {
									if (process.getFlowElements().contains(
											defaultFlow)) {
										if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_3BB(
												exConvGateway, defaultFlow) == null) {
											if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_6BB(
													defaultFlow, exConvGateway) == null) {
												for (FlowElement tmpDivergeFlow : process
														.getFlowElements()) {
													if (tmpDivergeFlow instanceof SequenceFlow) {
														SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
														if (!defaultFlow
																.equals(divergeFlow)) {
															if (exclusiveGateway
																	.equals(divergeFlow
																			.getSourceRef())) {
																if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_4BB(
																		exConvGateway,
																		divergeFlow) == null) {
																	if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_7BB(
																			divergeFlow,
																			exConvGateway) == null) {
																		for (FlowElement tmpInFlow : process
																				.getFlowElements()) {
																			if (tmpInFlow instanceof SequenceFlow) {
																				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																				if (!defaultFlow
																						.equals(inFlow)) {
																					if (!divergeFlow
																							.equals(inFlow)) {
																						if (exConvGateway
																								.equals(inFlow
																										.getTargetRef())) {
																							if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_2BB(
																									exConvGateway,
																									inFlow) == null) {
																								for (FlowElement tmpOutFlow : process
																										.getFlowElements()) {
																									if (tmpOutFlow instanceof SequenceFlow) {
																										SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																										if (!inFlow
																												.equals(outFlow)) {
																											if (!defaultFlow
																													.equals(outFlow)) {
																												if (!divergeFlow
																														.equals(outFlow)) {
																													if (exConvGateway
																															.equals(outFlow
																																	.getSourceRef())) {
																														if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_0BBBBB(
																																exConvGateway,
																																inFlow,
																																defaultFlow,
																																divergeFlow,
																																outFlow) == null) {
																															if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_1BBB(
																																	outFlow,
																																	exclusiveGateway,
																																	exConvGateway) == null) {
																																if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_5BB(
																																		exConvGateway,
																																		outFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_8BB(
																																			outFlow,
																																			exConvGateway) == null) {
																																		if (pattern_ExcConvGwAfterExDivGwRule_11_2_black_nac_9BB(
																																				exclusiveGateway,
																																				outFlow) == null) {
																																			for (LaneSet laneSet : process
																																					.getLaneSets()) {
																																				for (Lane lane : laneSet
																																						.getLanes()) {
																																					if (lane.getFlowNodeRefs()
																																							.contains(
																																									exConvGateway)) {
																																						_result.add(new Object[] {
																																								inFlow,
																																								process,
																																								defaultFlow,
																																								exclusiveGateway,
																																								divergeFlow,
																																								exConvGateway,
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
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_11_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_11_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_11_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_11_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_12_1_binding = pattern_ExcConvGwAfterExDivGwRule_12_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_12_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_12_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_12_1_black = pattern_ExcConvGwAfterExDivGwRule_12_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_12_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_12_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_965055 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_965055 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_965055)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_965055)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_965055)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_965055)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_797068 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_797068)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_797068)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_12_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpExConvGateway = _edge_targetRef.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (exConvGateway.equals(inFlow.getTargetRef())) {
					if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_2BB(
							exConvGateway, inFlow) == null) {
						for (SequenceFlow outFlow : exConvGateway.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_5BB(
										exConvGateway, outFlow) == null) {
									if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_8BB(
											outFlow, exConvGateway) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(outFlow)) {
													if (process
															.getFlowElements()
															.contains(
																	exConvGateway)) {
														for (FlowElement tmpExclusiveGateway : process
																.getFlowElements()) {
															if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																if (!exConvGateway
																		.equals(exclusiveGateway)) {
																	SequenceFlow defaultFlow = exclusiveGateway
																			.getDefault();
																	if (defaultFlow != null) {
																		if (!defaultFlow
																				.equals(inFlow)) {
																			if (!defaultFlow
																					.equals(outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								defaultFlow)) {
																					if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_1BBB(
																							outFlow,
																							exclusiveGateway,
																							exConvGateway) == null) {
																						if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_9BB(
																								exclusiveGateway,
																								outFlow) == null) {
																							if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_3BB(
																									exConvGateway,
																									defaultFlow) == null) {
																								if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_6BB(
																										defaultFlow,
																										exConvGateway) == null) {
																									for (FlowElement tmpDivergeFlow : process
																											.getFlowElements()) {
																										if (tmpDivergeFlow instanceof SequenceFlow) {
																											SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																											if (!defaultFlow
																													.equals(divergeFlow)) {
																												if (!divergeFlow
																														.equals(inFlow)) {
																													if (!divergeFlow
																															.equals(outFlow)) {
																														if (exclusiveGateway
																																.equals(divergeFlow
																																		.getSourceRef())) {
																															if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_0BBBBB(
																																	exConvGateway,
																																	inFlow,
																																	defaultFlow,
																																	divergeFlow,
																																	outFlow) == null) {
																																if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_4BB(
																																		exConvGateway,
																																		divergeFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_12_2_black_nac_7BB(
																																			divergeFlow,
																																			exConvGateway) == null) {
																																		for (LaneSet laneSet : process
																																				.getLaneSets()) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								exConvGateway)) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_12_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_12_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_12_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_12_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_13_1_binding = pattern_ExcConvGwAfterExDivGwRule_13_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_13_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_13_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_13_1_black = pattern_ExcConvGwAfterExDivGwRule_13_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_13_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_13_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_525401 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_525401 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_525401)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_525401)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_525401)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_525401)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_189307 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_189307)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_189307)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_13_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExConvGateway = _edge_incoming.getSrc();
		if (tmpExConvGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (exConvGateway.equals(inFlow.getTargetRef())) {
					if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_2BB(
							exConvGateway, inFlow) == null) {
						for (SequenceFlow outFlow : exConvGateway.getOutgoing()) {
							if (!inFlow.equals(outFlow)) {
								if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_5BB(
										exConvGateway, outFlow) == null) {
									if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_8BB(
											outFlow, exConvGateway) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exConvGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (FlowElement tmpExclusiveGateway : process
																.getFlowElements()) {
															if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																if (!exConvGateway
																		.equals(exclusiveGateway)) {
																	SequenceFlow defaultFlow = exclusiveGateway
																			.getDefault();
																	if (defaultFlow != null) {
																		if (!defaultFlow
																				.equals(inFlow)) {
																			if (!defaultFlow
																					.equals(outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								defaultFlow)) {
																					if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_1BBB(
																							outFlow,
																							exclusiveGateway,
																							exConvGateway) == null) {
																						if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_9BB(
																								exclusiveGateway,
																								outFlow) == null) {
																							if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_3BB(
																									exConvGateway,
																									defaultFlow) == null) {
																								if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_6BB(
																										defaultFlow,
																										exConvGateway) == null) {
																									for (FlowElement tmpDivergeFlow : process
																											.getFlowElements()) {
																										if (tmpDivergeFlow instanceof SequenceFlow) {
																											SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																											if (!defaultFlow
																													.equals(divergeFlow)) {
																												if (!divergeFlow
																														.equals(inFlow)) {
																													if (!divergeFlow
																															.equals(outFlow)) {
																														if (exclusiveGateway
																																.equals(divergeFlow
																																		.getSourceRef())) {
																															if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_0BBBBB(
																																	exConvGateway,
																																	inFlow,
																																	defaultFlow,
																																	divergeFlow,
																																	outFlow) == null) {
																																if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_4BB(
																																		exConvGateway,
																																		divergeFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_13_2_black_nac_7BB(
																																			divergeFlow,
																																			exConvGateway) == null) {
																																		for (LaneSet laneSet : process
																																				.getLaneSets()) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								exConvGateway)) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_13_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_13_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_13_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_13_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_14_1_binding = pattern_ExcConvGwAfterExDivGwRule_14_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_14_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_14_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_14_1_black = pattern_ExcConvGwAfterExDivGwRule_14_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_14_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_14_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_399005 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_399005 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_399005)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_399005)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_399005)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_399005)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_908353 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_908353)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_908353)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_14_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpExConvGateway = _edge_sourceRef.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (exConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_5BB(
							exConvGateway, outFlow) == null) {
						if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_8BB(
								outFlow, exConvGateway) == null) {
							for (SequenceFlow inFlow : exConvGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_2BB(
											exConvGateway, inFlow) == null) {
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
																	exConvGateway)) {
														for (FlowElement tmpExclusiveGateway : process
																.getFlowElements()) {
															if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																if (!exConvGateway
																		.equals(exclusiveGateway)) {
																	SequenceFlow defaultFlow = exclusiveGateway
																			.getDefault();
																	if (defaultFlow != null) {
																		if (!defaultFlow
																				.equals(inFlow)) {
																			if (!defaultFlow
																					.equals(outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								defaultFlow)) {
																					if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_1BBB(
																							outFlow,
																							exclusiveGateway,
																							exConvGateway) == null) {
																						if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_9BB(
																								exclusiveGateway,
																								outFlow) == null) {
																							if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_3BB(
																									exConvGateway,
																									defaultFlow) == null) {
																								if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_6BB(
																										defaultFlow,
																										exConvGateway) == null) {
																									for (FlowElement tmpDivergeFlow : process
																											.getFlowElements()) {
																										if (tmpDivergeFlow instanceof SequenceFlow) {
																											SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																											if (!defaultFlow
																													.equals(divergeFlow)) {
																												if (!divergeFlow
																														.equals(inFlow)) {
																													if (!divergeFlow
																															.equals(outFlow)) {
																														if (exclusiveGateway
																																.equals(divergeFlow
																																		.getSourceRef())) {
																															if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_0BBBBB(
																																	exConvGateway,
																																	inFlow,
																																	defaultFlow,
																																	divergeFlow,
																																	outFlow) == null) {
																																if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_4BB(
																																		exConvGateway,
																																		divergeFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_14_2_black_nac_7BB(
																																			divergeFlow,
																																			exConvGateway) == null) {
																																		for (LaneSet laneSet : process
																																				.getLaneSets()) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								exConvGateway)) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_14_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_14_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_14_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_14_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_15_1_binding = pattern_ExcConvGwAfterExDivGwRule_15_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_15_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_15_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_15_1_black = pattern_ExcConvGwAfterExDivGwRule_15_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_15_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_15_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_685396 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_685396 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_685396)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_685396)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_685396)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_685396)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_698289 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_698289)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_698289)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_15_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExConvGateway = _edge_outgoing.getSrc();
		if (tmpExConvGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_5BB(
							exConvGateway, outFlow) == null) {
						if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_8BB(
								outFlow, exConvGateway) == null) {
							for (SequenceFlow inFlow : exConvGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_2BB(
											exConvGateway, inFlow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														exConvGateway,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (process.getFlowElements()
														.contains(inFlow)) {
													if (process
															.getFlowElements()
															.contains(outFlow)) {
														for (FlowElement tmpExclusiveGateway : process
																.getFlowElements()) {
															if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																if (!exConvGateway
																		.equals(exclusiveGateway)) {
																	SequenceFlow defaultFlow = exclusiveGateway
																			.getDefault();
																	if (defaultFlow != null) {
																		if (!defaultFlow
																				.equals(inFlow)) {
																			if (!defaultFlow
																					.equals(outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								defaultFlow)) {
																					if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_1BBB(
																							outFlow,
																							exclusiveGateway,
																							exConvGateway) == null) {
																						if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_9BB(
																								exclusiveGateway,
																								outFlow) == null) {
																							if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_3BB(
																									exConvGateway,
																									defaultFlow) == null) {
																								if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_6BB(
																										defaultFlow,
																										exConvGateway) == null) {
																									for (FlowElement tmpDivergeFlow : process
																											.getFlowElements()) {
																										if (tmpDivergeFlow instanceof SequenceFlow) {
																											SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																											if (!defaultFlow
																													.equals(divergeFlow)) {
																												if (!divergeFlow
																														.equals(inFlow)) {
																													if (!divergeFlow
																															.equals(outFlow)) {
																														if (exclusiveGateway
																																.equals(divergeFlow
																																		.getSourceRef())) {
																															if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_0BBBBB(
																																	exConvGateway,
																																	inFlow,
																																	defaultFlow,
																																	divergeFlow,
																																	outFlow) == null) {
																																if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_4BB(
																																		exConvGateway,
																																		divergeFlow) == null) {
																																	if (pattern_ExcConvGwAfterExDivGwRule_15_2_black_nac_7BB(
																																			divergeFlow,
																																			exConvGateway) == null) {
																																		for (LaneSet laneSet : process
																																				.getLaneSets()) {
																																			for (Lane lane : laneSet
																																					.getLanes()) {
																																				if (lane.getFlowNodeRefs()
																																						.contains(
																																								exConvGateway)) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_15_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_15_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_15_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_15_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_1_bindingFB(
			ExcConvGwAfterExDivGwRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_1_blackFBB(
			EClass __eClass, ExcConvGwAfterExDivGwRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_1_bindingAndBlackFFB(
			ExcConvGwAfterExDivGwRule _this) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_16_1_binding = pattern_ExcConvGwAfterExDivGwRule_16_1_bindingFB(_this);
		if (result_pattern_ExcConvGwAfterExDivGwRule_16_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExcConvGwAfterExDivGwRule_16_1_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_16_1_black = pattern_ExcConvGwAfterExDivGwRule_16_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExcConvGwAfterExDivGwRule_16_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExcConvGwAfterExDivGwRule_16_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_0BBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow defaultFlow, SequenceFlow divergeFlow,
			SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!defaultFlow.equals(inFlow)) {
				if (!defaultFlow.equals(divergeFlow)) {
					if (!defaultFlow.equals(outFlow)) {
						if (!divergeFlow.equals(inFlow)) {
							if (!divergeFlow.equals(outFlow)) {
								SequenceFlow __DEC_exConvGateway_default_383113 = exConvGateway
										.getDefault();
								if (__DEC_exConvGateway_default_383113 != null) {
									if (!inFlow
											.equals(__DEC_exConvGateway_default_383113)) {
										if (!defaultFlow
												.equals(__DEC_exConvGateway_default_383113)) {
											if (!divergeFlow
													.equals(__DEC_exConvGateway_default_383113)) {
												if (!outFlow
														.equals(__DEC_exConvGateway_default_383113)) {
													return new Object[] {
															exConvGateway,
															inFlow,
															defaultFlow,
															divergeFlow,
															outFlow };
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_1BBB(
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			ExclusiveGateway exConvGateway) {
		if (!exConvGateway.equals(exclusiveGateway)) {
			for (ExclusiveGateway __DEC_outFlow_default_119749 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
							"default")) {
				if (!exclusiveGateway.equals(__DEC_outFlow_default_119749)) {
					if (!exConvGateway.equals(__DEC_outFlow_default_119749)) {
						return new Object[] { outFlow, exclusiveGateway,
								exConvGateway };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow defaultFlow) {
		if (defaultFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_5BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_6BB(
			SequenceFlow defaultFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(defaultFlow.getTargetRef())) {
			return new Object[] { defaultFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_7BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_8BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_9BB(
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exclusiveGateway.getDefault())) {
			return new Object[] { exclusiveGateway, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_16_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpExConvGateway = _edge_flowNodeRefs.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (lane.getFlowNodeRefs().contains(exConvGateway)) {
					for (SequenceFlow inFlow : exConvGateway.getIncoming()) {
						if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_2BB(
								exConvGateway, inFlow) == null) {
							for (SequenceFlow outFlow : exConvGateway
									.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_5BB(
											exConvGateway, outFlow) == null) {
										if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_8BB(
												outFlow, exConvGateway) == null) {
											for (LaneSet laneSet : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															lane,
															LaneSet.class,
															"lanes")) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																exConvGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow)) {
															if (process
																	.getFlowElements()
																	.contains(
																			outFlow)) {
																if (process
																		.getLaneSets()
																		.contains(
																				laneSet)) {
																	for (FlowElement tmpExclusiveGateway : process
																			.getFlowElements()) {
																		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																			if (!exConvGateway
																					.equals(exclusiveGateway)) {
																				SequenceFlow defaultFlow = exclusiveGateway
																						.getDefault();
																				if (defaultFlow != null) {
																					if (!defaultFlow
																							.equals(inFlow)) {
																						if (!defaultFlow
																								.equals(outFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											defaultFlow)) {
																								if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_1BBB(
																										outFlow,
																										exclusiveGateway,
																										exConvGateway) == null) {
																									if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_9BB(
																											exclusiveGateway,
																											outFlow) == null) {
																										if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_3BB(
																												exConvGateway,
																												defaultFlow) == null) {
																											if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_6BB(
																													defaultFlow,
																													exConvGateway) == null) {
																												for (FlowElement tmpDivergeFlow : process
																														.getFlowElements()) {
																													if (tmpDivergeFlow instanceof SequenceFlow) {
																														SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																														if (!defaultFlow
																																.equals(divergeFlow)) {
																															if (!divergeFlow
																																	.equals(inFlow)) {
																																if (!divergeFlow
																																		.equals(outFlow)) {
																																	if (exclusiveGateway
																																			.equals(divergeFlow
																																					.getSourceRef())) {
																																		if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_0BBBBB(
																																				exConvGateway,
																																				inFlow,
																																				defaultFlow,
																																				divergeFlow,
																																				outFlow) == null) {
																																			if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_4BB(
																																					exConvGateway,
																																					divergeFlow) == null) {
																																				if (pattern_ExcConvGwAfterExDivGwRule_16_2_black_nac_7BB(
																																						divergeFlow,
																																						exConvGateway) == null) {
																																					_result.add(new Object[] {
																																							inFlow,
																																							process,
																																							defaultFlow,
																																							exclusiveGateway,
																																							divergeFlow,
																																							exConvGateway,
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
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_16_3_expressionFBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this, Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, inFlow,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_16_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_16_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExcConvGwAfterExDivGwRule_16_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_1_blackB(
			ExcConvGwAfterExDivGwRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlowToStep inFlowToStep) {
		if (ruleResult.getCorrObjects().contains(inFlowToStep)) {
			return new Object[] { ruleResult, inFlowToStep };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlowAlternative alt) {
		if (ruleResult.getTargetObjects().contains(alt)) {
			return new Object[] { ruleResult, alt };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, NormalStep normalStep) {
		if (ruleResult.getTargetObjects().contains(normalStep)) {
			return new Object[] { ruleResult, normalStep };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Flow initFlow) {
		if (ruleResult.getTargetObjects().contains(initFlow)) {
			return new Object[] { ruleResult, initFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow defaultFlowToInitFlow) {
		if (ruleResult.getCorrObjects().contains(defaultFlowToInitFlow)) {
			return new Object[] { ruleResult, defaultFlowToInitFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow defaultFlow) {
		if (ruleResult.getSourceObjects().contains(defaultFlow)) {
			return new Object[] { ruleResult, defaultFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult,
			ExclusiveGateway exclusiveGateway) {
		if (ruleResult.getSourceObjects().contains(exclusiveGateway)) {
			return new Object[] { ruleResult, exclusiveGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, FlowNodeToStep egwToStep) {
		if (ruleResult.getCorrObjects().contains(egwToStep)) {
			return new Object[] { ruleResult, egwToStep };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow divergeFlow) {
		if (ruleResult.getSourceObjects().contains(divergeFlow)) {
			return new Object[] { ruleResult, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult,
			SeqFlowToAltFlowAlt divergeFlowToAlt) {
		if (ruleResult.getCorrObjects().contains(divergeFlowToAlt)) {
			return new Object[] { ruleResult, divergeFlowToAlt };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_14BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow divergeFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(divergeFlowToFlow)) {
			return new Object[] { ruleResult, divergeFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_15BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_16BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExcConvGwAfterExDivGwRule_18_2_blackFFFFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList inFlowToStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpInFlowToStep : inFlowToStepList.getEntryObjects()) {
				if (tmpInFlowToStep instanceof SequenceFlowToStep) {
					SequenceFlowToStep inFlowToStep = (SequenceFlowToStep) tmpInFlowToStep;
					SequenceFlow inFlow = inFlowToStep.getSource();
					if (inFlow != null) {
						Step step = inFlowToStep.getTarget();
						if (step != null) {
							if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_1BB(
									ruleResult, inFlowToStep) == null) {
								if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_0BB(
										ruleResult, inFlow) == null) {
									if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_2BB(
											ruleResult, step) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_9BB(
														ruleResult, process) == null) {
													for (FlowElement tmpDefaultFlow : process
															.getFlowElements()) {
														if (tmpDefaultFlow instanceof SequenceFlow) {
															SequenceFlow defaultFlow = (SequenceFlow) tmpDefaultFlow;
															if (!defaultFlow
																	.equals(inFlow)) {
																if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_8BB(
																		ruleResult,
																		defaultFlow) == null) {
																	for (FlowElement tmpExclusiveGateway : process
																			.getFlowElements()) {
																		if (tmpExclusiveGateway instanceof ExclusiveGateway) {
																			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) tmpExclusiveGateway;
																			if (defaultFlow
																					.equals(exclusiveGateway
																							.getDefault())) {
																				if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_10BB(
																						ruleResult,
																						exclusiveGateway) == null) {
																					for (FlowElement tmpDivergeFlow : process
																							.getFlowElements()) {
																						if (tmpDivergeFlow instanceof SequenceFlow) {
																							SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
																							if (!defaultFlow
																									.equals(divergeFlow)) {
																								if (!divergeFlow
																										.equals(inFlow)) {
																									if (exclusiveGateway
																											.equals(divergeFlow
																													.getSourceRef())) {
																										if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_12BB(
																												ruleResult,
																												divergeFlow) == null) {
																											for (LaneSet laneSet : process
																													.getLaneSets()) {
																												if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_15BB(
																														ruleResult,
																														laneSet) == null) {
																													for (Lane lane : laneSet
																															.getLanes()) {
																														if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_16BB(
																																ruleResult,
																																lane) == null) {
																															for (Flow tmpFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			step,
																																			Flow.class,
																																			"steps")) {
																																if (tmpFlow instanceof AlternativeFlow) {
																																	AlternativeFlow flow = (AlternativeFlow) tmpFlow;
																																	if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_3BB(
																																			ruleResult,
																																			flow) == null) {
																																		for (SequenceFlowToUCFlow defaultFlowToInitFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																				.getOppositeReferenceTyped(
																																						defaultFlow,
																																						SequenceFlowToUCFlow.class,
																																						"source")) {
																																			Flow initFlow = defaultFlowToInitFlow
																																					.getTarget();
																																			if (initFlow != null) {
																																				if (!flow
																																						.equals(initFlow)) {
																																					if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_7BB(
																																							ruleResult,
																																							defaultFlowToInitFlow) == null) {
																																						if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_6BB(
																																								ruleResult,
																																								initFlow) == null) {
																																							for (Step tmpNormalStep : initFlow
																																									.getSteps()) {
																																								if (tmpNormalStep instanceof NormalStep) {
																																									NormalStep normalStep = (NormalStep) tmpNormalStep;
																																									if (!normalStep
																																											.equals(step)) {
																																										if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_5BB(
																																												ruleResult,
																																												normalStep) == null) {
																																											for (StepAlternative tmpAlt : normalStep
																																													.getStepAlternative()) {
																																												if (tmpAlt instanceof AlternativeFlowAlternative) {
																																													AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
																																													if (flow.equals(alt
																																															.getRef())) {
																																														if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_4BB(
																																																ruleResult,
																																																alt) == null) {
																																															for (FlowNodeToStep egwToStep : org.moflon.core.utilities.eMoflonEMFUtil
																																																	.getOppositeReferenceTyped(
																																																			exclusiveGateway,
																																																			FlowNodeToStep.class,
																																																			"source")) {
																																																if (normalStep
																																																		.equals(egwToStep
																																																				.getTarget())) {
																																																	if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_11BB(
																																																			ruleResult,
																																																			egwToStep) == null) {
																																																		for (SeqFlowToAltFlowAlt divergeFlowToAlt : org.moflon.core.utilities.eMoflonEMFUtil
																																																				.getOppositeReferenceTyped(
																																																						divergeFlow,
																																																						SeqFlowToAltFlowAlt.class,
																																																						"source")) {
																																																			if (alt.equals(divergeFlowToAlt
																																																					.getTarget())) {
																																																				if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_13BB(
																																																						ruleResult,
																																																						divergeFlowToAlt) == null) {
																																																					for (SequenceFlowToUCFlow divergeFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																																																							.getOppositeReferenceTyped(
																																																									divergeFlow,
																																																									SequenceFlowToUCFlow.class,
																																																									"source")) {
																																																						if (!defaultFlowToInitFlow
																																																								.equals(divergeFlowToFlow)) {
																																																							if (flow.equals(divergeFlowToFlow
																																																									.getTarget())) {
																																																								if (pattern_ExcConvGwAfterExDivGwRule_18_2_black_nac_14BB(
																																																										ruleResult,
																																																										divergeFlowToFlow) == null) {
																																																									_result.add(new Object[] {
																																																											inFlowToStepList,
																																																											inFlow,
																																																											inFlowToStep,
																																																											step,
																																																											flow,
																																																											alt,
																																																											normalStep,
																																																											initFlow,
																																																											defaultFlowToInitFlow,
																																																											defaultFlow,
																																																											process,
																																																											exclusiveGateway,
																																																											egwToStep,
																																																											divergeFlow,
																																																											divergeFlowToAlt,
																																																											divergeFlowToFlow,
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
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_3_bindingFBBBBBBBBBBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			Lane lane, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlow, step, inFlowToStep, process,
				defaultFlow, exclusiveGateway, divergeFlow, normalStep, alt,
				initFlow, defaultFlowToInitFlow, egwToStep, divergeFlowToAlt,
				flow, divergeFlowToFlow, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow, step,
					inFlowToStep, process, defaultFlow, exclusiveGateway,
					divergeFlow, normalStep, alt, initFlow,
					defaultFlowToInitFlow, egwToStep, divergeFlowToAlt, flow,
					divergeFlowToFlow, lane, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBBBBB(
			ExcConvGwAfterExDivGwRule _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow inFlow,
			Step step, SequenceFlowToStep inFlowToStep, bpmn2.Process process,
			SequenceFlow defaultFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow divergeFlow, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			Lane lane, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ExcConvGwAfterExDivGwRule_18_3_binding = pattern_ExcConvGwAfterExDivGwRule_18_3_bindingFBBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, step, inFlowToStep, process,
				defaultFlow, exclusiveGateway, divergeFlow, normalStep, alt,
				initFlow, defaultFlowToInitFlow, egwToStep, divergeFlowToAlt,
				flow, divergeFlowToFlow, lane, laneSet, ruleResult);
		if (result_pattern_ExcConvGwAfterExDivGwRule_18_3_binding != null) {
			CSP csp = (CSP) result_pattern_ExcConvGwAfterExDivGwRule_18_3_binding[0];

			Object[] result_pattern_ExcConvGwAfterExDivGwRule_18_3_black = pattern_ExcConvGwAfterExDivGwRule_18_3_blackB(csp);
			if (result_pattern_ExcConvGwAfterExDivGwRule_18_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						step, inFlowToStep, process, defaultFlow,
						exclusiveGateway, divergeFlow, normalStep, alt,
						initFlow, defaultFlowToInitFlow, egwToStep,
						divergeFlowToAlt, flow, divergeFlowToFlow, lane,
						laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ExcConvGwAfterExDivGwRule_18_4_expressionFBB(
			ExcConvGwAfterExDivGwRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_5_black_nac_0BB(
			Step step, NormalStep normalStep) {
		if (!normalStep.equals(step)) {
			Step nextStep = step.getNext();
			if (nextStep != null) {
				if (!step.equals(nextStep)) {
					if (!normalStep.equals(nextStep)) {
						return new Object[] { step, normalStep };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_5_blackBBBBBBBBBBBBBBBBB(
			Step step, SequenceFlow inFlow, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			Lane lane, LaneSet laneSet) {
		if (!defaultFlow.equals(inFlow)) {
			if (!defaultFlow.equals(divergeFlow)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!normalStep.equals(step)) {
						if (!defaultFlowToInitFlow.equals(divergeFlowToFlow)) {
							if (!flow.equals(initFlow)) {
								if (pattern_ExcConvGwAfterExDivGwRule_18_5_black_nac_0BB(
										step, normalStep) == null) {
									return new Object[] { step, inFlow,
											inFlowToStep, process, defaultFlow,
											exclusiveGateway, divergeFlow,
											normalStep, alt, initFlow,
											defaultFlowToInitFlow, egwToStep,
											divergeFlowToAlt, flow,
											divergeFlowToFlow, lane, laneSet };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_6_blackBBBBBBBBBBBBBBBBBB(
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			Lane lane, LaneSet laneSet, ModelgeneratorRuleResult ruleResult) {
		if (!defaultFlow.equals(inFlow)) {
			if (!defaultFlow.equals(divergeFlow)) {
				if (!divergeFlow.equals(inFlow)) {
					if (!normalStep.equals(step)) {
						if (!defaultFlowToInitFlow.equals(divergeFlowToFlow)) {
							if (!flow.equals(initFlow)) {
								return new Object[] { inFlow, step,
										inFlowToStep, process, defaultFlow,
										exclusiveGateway, divergeFlow,
										normalStep, alt, initFlow,
										defaultFlowToInitFlow, egwToStep,
										divergeFlowToAlt, flow,
										divergeFlowToFlow, lane, laneSet,
										ruleResult };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExcConvGwAfterExDivGwRule_18_6_greenBBBBFFFFFBBB(
			SequenceFlow inFlow, bpmn2.Process process, NormalStep normalStep,
			Flow initFlow, Lane lane, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		ExclusiveGateway exConvGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("exConvGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(exConvGateway);
		inFlow.setTargetRef(exConvGateway);
		lane.getFlowNodeRefs().add(exConvGateway);
		ruleResult.getSourceObjects().add(exConvGateway);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exConvGateway);
		ruleResult.getSourceObjects().add(outFlow);
		ecgwToStep.setSource(exConvGateway);
		ecgwToStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(ecgwToStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		ruleResult.getCorrObjects().add(outFlowToInitFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		GatewayDirection exConvGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		exConvGateway.setGatewayDirection(exConvGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { inFlow, process, normalStep, initFlow,
				exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
				outFlowToNormalStep, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ExcConvGwAfterExDivGwRule_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExcConvGwAfterExDivGwRuleImpl
