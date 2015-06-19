/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
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
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.UseCase;
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
		// initial bindings
		Object[] result1_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_0_1_blackBBBBBBBBBB(this,
						match, process, inFlow, eventBasedGateway, outFlow,
						intermediateCatchEvent, lane, laneSet, ceFlow);
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
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[eventBasedGateway] = "
							+ eventBasedGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[ceFlow] = " + ceFlow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_0_2_bindingAndBlackFBBBBBBBBBB(
						this, match, process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, lane, laneSet, ceFlow);
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
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[eventBasedGateway] = "
							+ eventBasedGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[ceFlow] = " + ceFlow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_4_blackBBBBBBBBB(
							match, process, inFlow, eventBasedGateway, outFlow,
							intermediateCatchEvent, lane, laneSet, ceFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[eventBasedGateway] = "
								+ eventBasedGateway
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[intermediateCatchEvent] = "
								+ intermediateCatchEvent
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[ceFlow] = " + ceFlow + ".");
			}
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_4_greenBBBBBBBFFFFFFFFFF(
							match, process, eventBasedGateway, outFlow,
							intermediateCatchEvent, lane, ceFlow);
			// EMoflonEdge process__ceFlow____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__intermediateCatchEvent____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__eventBasedGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge eventBasedGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge outFlow__intermediateCatchEvent____targetRef = (EMoflonEdge) result4_green[12];
			// EMoflonEdge intermediateCatchEvent__outFlow____incoming = (EMoflonEdge) result4_green[13];
			// EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = (EMoflonEdge) result4_green[14];
			// EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = (EMoflonEdge) result4_green[15];
			// EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = (EMoflonEdge) result4_green[16];

			// collect context elements
			Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_5_blackBBBBBBBBB(
							match, process, inFlow, eventBasedGateway, outFlow,
							intermediateCatchEvent, lane, laneSet, ceFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = "
								+ match
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[eventBasedGateway] = "
								+ eventBasedGateway
								+ ", "
								+ "[outFlow] = "
								+ outFlow
								+ ", "
								+ "[intermediateCatchEvent] = "
								+ intermediateCatchEvent
								+ ", "
								+ "[lane] = "
								+ lane
								+ ", "
								+ "[laneSet] = "
								+ laneSet
								+ ", "
								+ "[ceFlow] = " + ceFlow + ".");
			}
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_5_greenBBBBBBFFFFFF(
							match, process, inFlow, eventBasedGateway, lane,
							laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result5_green[8];
			// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result5_green[9];
			// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result5_green[10];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[11];

			// register objects to match
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_6_expressionBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow);
			return CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_7_expressionF();
		} else {
			return CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result1_bindingAndBlack[2];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[3];
		IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[8];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[9];
		FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result1_bindingAndBlack[10];
		Lane lane = (Lane) result1_bindingAndBlack[11];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[12];
		SequenceFlow ceFlow = (SequenceFlow) result1_bindingAndBlack[13];
		CSP csp = (CSP) result1_bindingAndBlack[14];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_1_greenBBBBFFFFBFB(
						outFlow, intermediateCatchEvent, useCase, normalStep,
						ceFlow, csp);
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[4];
		SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result1_green[5];
		AlternativeFlow alternativeFlow = (AlternativeFlow) result1_green[6];
		ICEToAltFlow iceToAltFlow = (ICEToAltFlow) result1_green[7];
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = (SequenceFlowToUCFlow) result1_green[9];

		// collect translated elements
		Object[] result2_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_2_blackBBBBBBBB(
						outFlow, intermediateCatchEvent, alt, outFlowToAlt,
						alternativeFlow, iceToAltFlow, ceFlow,
						ceFlowToAlternativeFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[alt] = "
							+ alt
							+ ", "
							+ "[outFlowToAlt] = "
							+ outFlowToAlt
							+ ", "
							+ "[alternativeFlow] = "
							+ alternativeFlow
							+ ", "
							+ "[iceToAltFlow] = "
							+ iceToAltFlow
							+ ", "
							+ "[ceFlow] = "
							+ ceFlow
							+ ", "
							+ "[ceFlowToAlternativeFlow] = "
							+ ceFlowToAlternativeFlow + ".");
		}
		Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_2_greenFBBBBBBBB(
						outFlow, intermediateCatchEvent, alt, outFlowToAlt,
						alternativeFlow, iceToAltFlow, ceFlow,
						ceFlowToAlternativeFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_3_blackBBBBBBBBBBBBBBBBBBBB(
						ruleresult, process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, useCase,
						processToUseCase, flow, inFlowToFlow, normalStep,
						ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
						iceToAltFlow, lane, laneSet, ceFlow,
						ceFlowToAlternativeFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[eventBasedGateway] = "
							+ eventBasedGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[processToUseCase] = "
							+ processToUseCase
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[inFlowToFlow] = "
							+ inFlowToFlow
							+ ", "
							+ "[normalStep] = "
							+ normalStep
							+ ", "
							+ "[ebgToNormalStep] = "
							+ ebgToNormalStep
							+ ", "
							+ "[alt] = "
							+ alt
							+ ", "
							+ "[outFlowToAlt] = "
							+ outFlowToAlt
							+ ", "
							+ "[alternativeFlow] = "
							+ alternativeFlow
							+ ", "
							+ "[iceToAltFlow] = "
							+ iceToAltFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[ceFlow] = "
							+ ceFlow
							+ ", "
							+ "[ceFlowToAlternativeFlow] = "
							+ ceFlowToAlternativeFlow + ".");
		}
		CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
						ruleresult, process, eventBasedGateway, outFlow,
						intermediateCatchEvent, useCase, normalStep, alt,
						outFlowToAlt, alternativeFlow, iceToAltFlow, lane,
						ceFlow, ceFlowToAlternativeFlow);
		// EMoflonEdge process__ceFlow____flowElements = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__intermediateCatchEvent____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__eventBasedGateway____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge eventBasedGateway__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlow__intermediateCatchEvent____targetRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge intermediateCatchEvent__outFlow____incoming = (EMoflonEdge) result3_green[20];
		// EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[23];
		// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[24];
		// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[25];
		// EMoflonEdge outFlowToAlt__outFlow____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge outFlowToAlt__alt____target = (EMoflonEdge) result3_green[27];
		// EMoflonEdge iceToAltFlow__intermediateCatchEvent____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge iceToAltFlow__alternativeFlow____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = (EMoflonEdge) result3_green[30];
		// EMoflonEdge ceFlowToAlternativeFlow__ceFlow____source = (EMoflonEdge) result3_green[31];
		// EMoflonEdge ceFlowToAlternativeFlow__alternativeFlow____target = (EMoflonEdge) result3_green[32];

		// perform postprocessing story node is empty
		// register objects
		CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, useCase,
						processToUseCase, flow, inFlowToFlow, normalStep,
						ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
						iceToAltFlow, lane, laneSet, ceFlow,
						ceFlowToAlternativeFlow);
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_2_2_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_binding[2];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[3];
		IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_binding[4];
		Lane lane = (Lane) result2_binding[5];
		LaneSet laneSet = (LaneSet) result2_binding[6];
		SequenceFlow ceFlow = (SequenceFlow) result2_binding[7];
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_2_2_blackBBBBBFFFFFFBBBB(
						process, inFlow, eventBasedGateway, outFlow,
						intermediateCatchEvent, lane, laneSet, ceFlow, match)) {
			UseCase useCase = (UseCase) result2_black[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[6];
			Flow flow = (Flow) result2_black[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[8];
			NormalStep normalStep = (NormalStep) result2_black[9];
			FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_2_3_blackBBBBBBBBBBBBBB(
							process, inFlow, eventBasedGateway, outFlow,
							intermediateCatchEvent, useCase, processToUseCase,
							flow, inFlowToFlow, normalStep, ebgToNormalStep,
							lane, laneSet, ceFlow)) {
				Object[] result3_green = CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_2_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
								process, inFlow, eventBasedGateway, outFlow,
								intermediateCatchEvent, useCase,
								processToUseCase, flow, inFlowToFlow,
								normalStep, ebgToNormalStep, lane, laneSet,
								ceFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[14];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__ceFlow____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__intermediateCatchEvent____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge outFlow__eventBasedGateway____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge eventBasedGateway__outFlow____outgoing = (EMoflonEdge) result3_green[24];
				// EMoflonEdge outFlow__intermediateCatchEvent____targetRef = (EMoflonEdge) result3_green[25];
				// EMoflonEdge intermediateCatchEvent__outFlow____incoming = (EMoflonEdge) result3_green[26];
				// EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = (EMoflonEdge) result3_green[28];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[29];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[30];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[31];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[32];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[33];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[34];
				// EMoflonEdge ebgToNormalStep__eventBasedGateway____source = (EMoflonEdge) result3_green[35];
				// EMoflonEdge ebgToNormalStep__normalStep____target = (EMoflonEdge) result3_green[36];
				// EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = (EMoflonEdge) result3_green[37];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[38];

				// solve CSP
				Object[] result4_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow,
								eventBasedGateway, outFlow,
								intermediateCatchEvent, useCase,
								processToUseCase, flow, inFlowToFlow,
								normalStep, ebgToNormalStep, lane, laneSet,
								ceFlow);
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
									+ "[inFlow] = "
									+ inFlow
									+ ", "
									+ "[eventBasedGateway] = "
									+ eventBasedGateway
									+ ", "
									+ "[outFlow] = "
									+ outFlow
									+ ", "
									+ "[intermediateCatchEvent] = "
									+ intermediateCatchEvent
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[processToUseCase] = "
									+ processToUseCase
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[inFlowToFlow] = "
									+ inFlowToFlow
									+ ", "
									+ "[normalStep] = "
									+ normalStep
									+ ", "
									+ "[ebgToNormalStep] = "
									+ ebgToNormalStep
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = "
									+ laneSet
									+ ", "
									+ "[ceFlow] = " + ceFlow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_2_7_expressionFB(ruleresult);
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
			LaneSet laneSet, SequenceFlow ceFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

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
			SequenceFlow ceFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", true, csp);
		var_intermediateCatchEvent_id.setValue(intermediateCatchEvent.getId());
		var_intermediateCatchEvent_id.setType("String");
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", true, csp);
		var_intermediateCatchEvent_name.setValue(intermediateCatchEvent
				.getName());
		var_intermediateCatchEvent_name.setType("String");

		// Create unbound variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

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
		// initial bindings
		Object[] result1_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_10_1_blackBBBBBBB(this,
						match, useCase, flow, normalStep, alt, alternativeFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[useCase] = "
							+ useCase + ", " + "[flow] = " + flow + ", "
							+ "[normalStep] = " + normalStep + ", "
							+ "[alt] = " + alt + ", " + "[alternativeFlow] = "
							+ alternativeFlow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_10_2_bindingAndBlackFBBBBBBB(
						this, match, useCase, flow, normalStep, alt,
						alternativeFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[useCase] = "
							+ useCase + ", " + "[flow] = " + flow + ", "
							+ "[normalStep] = " + normalStep + ", "
							+ "[alt] = " + alt + ", " + "[alternativeFlow] = "
							+ alternativeFlow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_4_blackBBBBBB(
							match, useCase, flow, normalStep, alt,
							alternativeFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCase] = " + useCase + ", " + "[flow] = "
								+ flow + ", " + "[normalStep] = " + normalStep
								+ ", " + "[alt] = " + alt + ", "
								+ "[alternativeFlow] = " + alternativeFlow
								+ ".");
			}
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_4_greenBBBBBFFF(
							match, useCase, normalStep, alt, alternativeFlow);
			// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result4_green[6];
			// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_5_blackBBBBBB(
							match, useCase, flow, normalStep, alt,
							alternativeFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCase] = " + useCase + ", " + "[flow] = "
								+ flow + ", " + "[normalStep] = " + normalStep
								+ ", " + "[alt] = " + alt + ", "
								+ "[alternativeFlow] = " + alternativeFlow
								+ ".");
			}
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_5_greenBBBBFF(
							match, useCase, flow, normalStep);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_6_expressionBBBBBBB(
							this, match, useCase, flow, normalStep, alt,
							alternativeFlow);
			return CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_7_expressionF();
		} else {
			return CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EventBasedGateway eventBasedGateway = (EventBasedGateway) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[6];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[7];
		FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result1_bindingAndBlack[8];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[9];
		AlternativeFlow alternativeFlow = (AlternativeFlow) result1_bindingAndBlack[10];
		Lane lane = (Lane) result1_bindingAndBlack[11];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_1_greenBBFFBFBFBFFB(
						process, eventBasedGateway, alt, alternativeFlow, lane,
						csp);
		SequenceFlow outFlow = (SequenceFlow) result1_green[2];
		IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result1_green[3];
		SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result1_green[5];
		ICEToAltFlow iceToAltFlow = (ICEToAltFlow) result1_green[7];
		SequenceFlow ceFlow = (SequenceFlow) result1_green[9];
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = (SequenceFlowToUCFlow) result1_green[10];

		// collect translated elements
		Object[] result2_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_2_blackBBBBBBBB(
						outFlow, intermediateCatchEvent, alt, outFlowToAlt,
						alternativeFlow, iceToAltFlow, ceFlow,
						ceFlowToAlternativeFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[alt] = "
							+ alt
							+ ", "
							+ "[outFlowToAlt] = "
							+ outFlowToAlt
							+ ", "
							+ "[alternativeFlow] = "
							+ alternativeFlow
							+ ", "
							+ "[iceToAltFlow] = "
							+ iceToAltFlow
							+ ", "
							+ "[ceFlow] = "
							+ ceFlow
							+ ", "
							+ "[ceFlowToAlternativeFlow] = "
							+ ceFlowToAlternativeFlow + ".");
		}
		Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_2_greenFBBBBBBBB(
						outFlow, intermediateCatchEvent, alt, outFlowToAlt,
						alternativeFlow, iceToAltFlow, ceFlow,
						ceFlowToAlternativeFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_3_blackBBBBBBBBBBBBBBBBBBBB(
						ruleresult, process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, useCase,
						processToUseCase, flow, inFlowToFlow, normalStep,
						ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
						iceToAltFlow, lane, laneSet, ceFlow,
						ceFlowToAlternativeFlow);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[inFlow] = "
							+ inFlow
							+ ", "
							+ "[eventBasedGateway] = "
							+ eventBasedGateway
							+ ", "
							+ "[outFlow] = "
							+ outFlow
							+ ", "
							+ "[intermediateCatchEvent] = "
							+ intermediateCatchEvent
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[processToUseCase] = "
							+ processToUseCase
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[inFlowToFlow] = "
							+ inFlowToFlow
							+ ", "
							+ "[normalStep] = "
							+ normalStep
							+ ", "
							+ "[ebgToNormalStep] = "
							+ ebgToNormalStep
							+ ", "
							+ "[alt] = "
							+ alt
							+ ", "
							+ "[outFlowToAlt] = "
							+ outFlowToAlt
							+ ", "
							+ "[alternativeFlow] = "
							+ alternativeFlow
							+ ", "
							+ "[iceToAltFlow] = "
							+ iceToAltFlow
							+ ", "
							+ "[lane] = "
							+ lane
							+ ", "
							+ "[laneSet] = "
							+ laneSet
							+ ", "
							+ "[ceFlow] = "
							+ ceFlow
							+ ", "
							+ "[ceFlowToAlternativeFlow] = "
							+ ceFlowToAlternativeFlow + ".");
		}
		CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
						ruleresult, process, eventBasedGateway, outFlow,
						intermediateCatchEvent, useCase, normalStep, alt,
						outFlowToAlt, alternativeFlow, iceToAltFlow, lane,
						ceFlow, ceFlowToAlternativeFlow);
		// EMoflonEdge process__ceFlow____flowElements = (EMoflonEdge) result3_green[14];
		// EMoflonEdge process__intermediateCatchEvent____flowElements = (EMoflonEdge) result3_green[15];
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[16];
		// EMoflonEdge outFlow__eventBasedGateway____sourceRef = (EMoflonEdge) result3_green[17];
		// EMoflonEdge eventBasedGateway__outFlow____outgoing = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlow__intermediateCatchEvent____targetRef = (EMoflonEdge) result3_green[19];
		// EMoflonEdge intermediateCatchEvent__outFlow____incoming = (EMoflonEdge) result3_green[20];
		// EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = (EMoflonEdge) result3_green[21];
		// EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = (EMoflonEdge) result3_green[22];
		// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[23];
		// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[24];
		// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[25];
		// EMoflonEdge outFlowToAlt__outFlow____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge outFlowToAlt__alt____target = (EMoflonEdge) result3_green[27];
		// EMoflonEdge iceToAltFlow__intermediateCatchEvent____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge iceToAltFlow__alternativeFlow____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = (EMoflonEdge) result3_green[30];
		// EMoflonEdge ceFlowToAlternativeFlow__ceFlow____source = (EMoflonEdge) result3_green[31];
		// EMoflonEdge ceFlowToAlternativeFlow__alternativeFlow____target = (EMoflonEdge) result3_green[32];

		// perform postprocessing story node is empty
		// register objects
		CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, useCase,
						processToUseCase, flow, inFlowToFlow, normalStep,
						ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
						iceToAltFlow, lane, laneSet, ceFlow,
						ceFlowToAlternativeFlow);
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		NormalStep normalStep = (NormalStep) result2_binding[2];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[3];
		AlternativeFlow alternativeFlow = (AlternativeFlow) result2_binding[4];
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_12_2_blackFFFBFBFBFBBB(
						useCase, flow, normalStep, alt, alternativeFlow, match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[6];
			FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_12_3_blackBBBBBBBBBBBFF(
							process, inFlow, eventBasedGateway, useCase,
							processToUseCase, flow, inFlowToFlow, normalStep,
							ebgToNormalStep, alt, alternativeFlow)) {
				Lane lane = (Lane) result3_black[11];
				LaneSet laneSet = (LaneSet) result3_black[12];
				Object[] result3_green = CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_12_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
								process, inFlow, eventBasedGateway, useCase,
								processToUseCase, flow, inFlowToFlow,
								normalStep, ebgToNormalStep, alt,
								alternativeFlow, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__eventBasedGateway____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge inFlow__eventBasedGateway____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eventBasedGateway__inFlow____incoming = (EMoflonEdge) result3_green[18];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[19];
				// EMoflonEdge useCase__alternativeFlow____flows = (EMoflonEdge) result3_green[20];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge flow__normalStep____steps = (EMoflonEdge) result3_green[23];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[25];
				// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[26];
				// EMoflonEdge ebgToNormalStep__eventBasedGateway____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge ebgToNormalStep__normalStep____target = (EMoflonEdge) result3_green[28];
				// EMoflonEdge alt__alternativeFlow____ref = (EMoflonEdge) result3_green[29];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[30];

				// solve CSP
				Object[] result4_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow,
								eventBasedGateway, useCase, processToUseCase,
								flow, inFlowToFlow, normalStep,
								ebgToNormalStep, alt, alternativeFlow, lane,
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
									+ "[process] = "
									+ process
									+ ", "
									+ "[inFlow] = "
									+ inFlow
									+ ", "
									+ "[eventBasedGateway] = "
									+ eventBasedGateway
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[processToUseCase] = "
									+ processToUseCase
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[inFlowToFlow] = "
									+ inFlowToFlow
									+ ", "
									+ "[normalStep] = "
									+ normalStep
									+ ", "
									+ "[ebgToNormalStep] = "
									+ ebgToNormalStep
									+ ", "
									+ "[alt] = "
									+ alt
									+ ", "
									+ "[alternativeFlow] = "
									+ alternativeFlow
									+ ", "
									+ "[lane] = "
									+ lane
									+ ", "
									+ "[laneSet] = " + laneSet + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_12_7_expressionFB(ruleresult);
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
			AlternativeFlow alternativeFlow) {// Create CSP
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
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", true, csp);
		var_alternativeFlow_name.setValue(alternativeFlow.getName());
		var_alternativeFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", csp);
		var_intermediateCatchEvent_id.setType("String");
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", csp);
		var_intermediateCatchEvent_name.setType("String");

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_253(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_20_2_blackFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_20_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_254(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_21_2_blackFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_21_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_255(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_22_2_blackFFFFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_22_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_256(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_23_2_blackFFFFFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_23_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_257(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_24_2_blackFFFFFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_24_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_258(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_25_2_blackFFFFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_25_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_259(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_26_2_blackFFFFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_26_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_260(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_27_2_blackFFFFFFFFB(_edge_sourceRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_27_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_261(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_28_2_blackFFFFFFFFB(_edge_outgoing)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_28_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_823(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_29_2_blackFFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[4];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_29_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep, alt,
							alternativeFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_824(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_30_2_blackFFFFFB(_edge_stepAlternative)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[4];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_30_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep, alt,
							alternativeFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_825(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_31_2_blackFFFFFB(_edge_ref)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			NormalStep normalStep = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result2_black[4];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_31_3_expressionFBBBBBBB(
							this, match, useCase, flow, normalStep, alt,
							alternativeFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_262(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_32_2_blackFFFFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[2];
			SequenceFlow outFlow = (SequenceFlow) result2_black[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result2_black[4];
			Lane lane = (Lane) result2_black[5];
			LaneSet laneSet = (LaneSet) result2_black[6];
			SequenceFlow ceFlow = (SequenceFlow) result2_black[7];
			Object[] result2_green = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_32_3_expressionFBBBBBBBBBB(
							this, match, process, inFlow, eventBasedGateway,
							outFlow, intermediateCatchEvent, lane, laneSet,
							ceFlow)) {
				// Ensure that the correct types of elements are matched
				if (CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_32_6_expressionFB(__result);
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
			FlowNodeToStep ebgToNormalStepParameter) {
		// create result
		Object[] result1_black = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_35_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_35_2_blackFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList ebgToNormalStepList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			LaneSet laneSet = (LaneSet) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			SequenceFlow inFlow = (SequenceFlow) result2_black[4];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result2_black[5];
			FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result2_black[6];
			NormalStep normalStep = (NormalStep) result2_black[7];
			Flow flow = (Flow) result2_black[8];
			UseCase useCase = (UseCase) result2_black[9];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[10];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[11];

			// solve CSP
			Object[] result3_bindingAndBlack = CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_35_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, process, inFlow,
							eventBasedGateway, useCase, processToUseCase, flow,
							inFlowToFlow, normalStep, ebgToNormalStep, lane,
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
								+ "[process] = "
								+ process
								+ ", "
								+ "[inFlow] = "
								+ inFlow
								+ ", "
								+ "[eventBasedGateway] = "
								+ eventBasedGateway
								+ ", "
								+ "[useCase] = "
								+ useCase
								+ ", "
								+ "[processToUseCase] = "
								+ processToUseCase
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[inFlowToFlow] = "
								+ inFlowToFlow
								+ ", "
								+ "[normalStep] = "
								+ normalStep
								+ ", "
								+ "[ebgToNormalStep] = "
								+ ebgToNormalStep
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
			if (CatchEventAfterEBGToStepRuleImpl
					.pattern_CatchEventAfterEBGToStepRule_35_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = CatchEventAfterEBGToStepRuleImpl
						.pattern_CatchEventAfterEBGToStepRule_35_5_blackBBBBBBBBBBB(
								process, inFlow, eventBasedGateway, useCase,
								processToUseCase, flow, inFlowToFlow,
								normalStep, ebgToNormalStep, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_35_6_blackBBBBBBBBBBBB(
									process, inFlow, eventBasedGateway,
									useCase, processToUseCase, flow,
									inFlowToFlow, normalStep, ebgToNormalStep,
									lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[process] = "
										+ process
										+ ", "
										+ "[inFlow] = "
										+ inFlow
										+ ", "
										+ "[eventBasedGateway] = "
										+ eventBasedGateway
										+ ", "
										+ "[useCase] = "
										+ useCase
										+ ", "
										+ "[processToUseCase] = "
										+ processToUseCase
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[inFlowToFlow] = "
										+ inFlowToFlow
										+ ", "
										+ "[normalStep] = "
										+ normalStep
										+ ", "
										+ "[ebgToNormalStep] = "
										+ ebgToNormalStep
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
					CatchEventAfterEBGToStepRuleImpl
							.pattern_CatchEventAfterEBGToStepRule_35_6_greenBBFFBBFFFFBFFBB(
									process, eventBasedGateway, useCase,
									normalStep, lane, ruleResult, csp);
					// SequenceFlow outFlow = (SequenceFlow) result6_green[2];
					// IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result6_green[3];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[6];
					// SeqFlowToAltFlowAlt outFlowToAlt = (SeqFlowToAltFlowAlt) result6_green[7];
					// AlternativeFlow alternativeFlow = (AlternativeFlow) result6_green[8];
					// ICEToAltFlow iceToAltFlow = (ICEToAltFlow) result6_green[9];
					// SequenceFlow ceFlow = (SequenceFlow) result6_green[11];
					// SequenceFlowToUCFlow ceFlowToAlternativeFlow = (SequenceFlowToUCFlow) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return CatchEventAfterEBGToStepRuleImpl
				.pattern_CatchEventAfterEBGToStepRule_35_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("");

		// Create attribute variables
		Variable var_eventBasedGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("eventBasedGateway.gatewayDirection", true, csp);
		var_eventBasedGateway_gatewayDirection.setValue(eventBasedGateway
				.getGatewayDirection());
		var_eventBasedGateway_gatewayDirection
				.setType("bpmn2.GatewayDirection");

		// Create unbound variables
		Variable var_intermediateCatchEvent_id = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.id", csp);
		var_intermediateCatchEvent_id.setType("String");
		Variable var_alternativeFlow_name = CSPFactoryHelper.eINSTANCE
				.createVariable("alternativeFlow.name", csp);
		var_alternativeFlow_name.setType("String");
		Variable var_intermediateCatchEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("intermediateCatchEvent.name", csp);
		var_intermediateCatchEvent_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

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
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_253__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_253((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_254__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_254((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_255__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_255((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_256__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_256((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_257__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_257((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_258__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_258((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_259__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_259((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_260__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_260((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_261__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_261((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_823__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_823((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_824__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_824((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_825__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_825((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_262__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_262((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowNodeToStep) arguments.get(1));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
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
					(Lane) arguments.get(10), (LaneSet) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_1_blackBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					return new Object[] { _this, match, process, inFlow,
							eventBasedGateway, outFlow, intermediateCatchEvent,
							lane, laneSet, ceFlow };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_2_bindingFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow,
					eventBasedGateway, outFlow, intermediateCatchEvent, lane,
					laneSet, ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_2_bindingAndBlackFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_0_2_binding = pattern_CatchEventAfterEBGToStepRule_0_2_bindingFBBBBBBBBBB(
				_this, match, process, inFlow, eventBasedGateway, outFlow,
				intermediateCatchEvent, lane, laneSet, ceFlow);
		if (result_pattern_CatchEventAfterEBGToStepRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_0_2_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_0_2_black = pattern_CatchEventAfterEBGToStepRule_0_2_blackB(csp);
			if (result_pattern_CatchEventAfterEBGToStepRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow,
						eventBasedGateway, outFlow, intermediateCatchEvent,
						lane, laneSet, ceFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_0_3_expressionFBB(
			CatchEventAfterEBGToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_4_blackBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					return new Object[] { match, process, inFlow,
							eventBasedGateway, outFlow, intermediateCatchEvent,
							lane, laneSet, ceFlow };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_4_greenBBBBBBBFFFFFFFFFF(
			Match match, bpmn2.Process process,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			SequenceFlow ceFlow) {
		EMoflonEdge process__ceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__intermediateCatchEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__eventBasedGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__intermediateCatchEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__outFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(outFlow);
		match.getToBeTranslatedNodes().add(intermediateCatchEvent);
		match.getToBeTranslatedNodes().add(ceFlow);
		String process__ceFlow____flowElements_name_prime = "flowElements";
		String process__intermediateCatchEvent____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__eventBasedGateway____sourceRef_name_prime = "sourceRef";
		String eventBasedGateway__outFlow____outgoing_name_prime = "outgoing";
		String outFlow__intermediateCatchEvent____targetRef_name_prime = "targetRef";
		String intermediateCatchEvent__outFlow____incoming_name_prime = "incoming";
		String ceFlow__intermediateCatchEvent____sourceRef_name_prime = "sourceRef";
		String intermediateCatchEvent__ceFlow____outgoing_name_prime = "outgoing";
		String lane__intermediateCatchEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		process__ceFlow____flowElements.setSrc(process);
		process__ceFlow____flowElements.setTrg(ceFlow);
		match.getToBeTranslatedEdges().add(process__ceFlow____flowElements);
		process__intermediateCatchEvent____flowElements.setSrc(process);
		process__intermediateCatchEvent____flowElements
				.setTrg(intermediateCatchEvent);
		match.getToBeTranslatedEdges().add(
				process__intermediateCatchEvent____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__eventBasedGateway____sourceRef.setSrc(outFlow);
		outFlow__eventBasedGateway____sourceRef.setTrg(eventBasedGateway);
		match.getToBeTranslatedEdges().add(
				outFlow__eventBasedGateway____sourceRef);
		eventBasedGateway__outFlow____outgoing.setSrc(eventBasedGateway);
		eventBasedGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				eventBasedGateway__outFlow____outgoing);
		outFlow__intermediateCatchEvent____targetRef.setSrc(outFlow);
		outFlow__intermediateCatchEvent____targetRef
				.setTrg(intermediateCatchEvent);
		match.getToBeTranslatedEdges().add(
				outFlow__intermediateCatchEvent____targetRef);
		intermediateCatchEvent__outFlow____incoming
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__outFlow____incoming.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(
				intermediateCatchEvent__outFlow____incoming);
		ceFlow__intermediateCatchEvent____sourceRef.setSrc(ceFlow);
		ceFlow__intermediateCatchEvent____sourceRef
				.setTrg(intermediateCatchEvent);
		match.getToBeTranslatedEdges().add(
				ceFlow__intermediateCatchEvent____sourceRef);
		intermediateCatchEvent__ceFlow____outgoing
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__ceFlow____outgoing.setTrg(ceFlow);
		match.getToBeTranslatedEdges().add(
				intermediateCatchEvent__ceFlow____outgoing);
		lane__intermediateCatchEvent____flowNodeRefs.setSrc(lane);
		lane__intermediateCatchEvent____flowNodeRefs
				.setTrg(intermediateCatchEvent);
		match.getToBeTranslatedEdges().add(
				lane__intermediateCatchEvent____flowNodeRefs);
		process__ceFlow____flowElements
				.setName(process__ceFlow____flowElements_name_prime);
		process__intermediateCatchEvent____flowElements
				.setName(process__intermediateCatchEvent____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__eventBasedGateway____sourceRef
				.setName(outFlow__eventBasedGateway____sourceRef_name_prime);
		eventBasedGateway__outFlow____outgoing
				.setName(eventBasedGateway__outFlow____outgoing_name_prime);
		outFlow__intermediateCatchEvent____targetRef
				.setName(outFlow__intermediateCatchEvent____targetRef_name_prime);
		intermediateCatchEvent__outFlow____incoming
				.setName(intermediateCatchEvent__outFlow____incoming_name_prime);
		ceFlow__intermediateCatchEvent____sourceRef
				.setName(ceFlow__intermediateCatchEvent____sourceRef_name_prime);
		intermediateCatchEvent__ceFlow____outgoing
				.setName(intermediateCatchEvent__ceFlow____outgoing_name_prime);
		lane__intermediateCatchEvent____flowNodeRefs
				.setName(lane__intermediateCatchEvent____flowNodeRefs_name_prime);
		return new Object[] { match, process, eventBasedGateway, outFlow,
				intermediateCatchEvent, lane, ceFlow,
				process__ceFlow____flowElements,
				process__intermediateCatchEvent____flowElements,
				process__outFlow____flowElements,
				outFlow__eventBasedGateway____sourceRef,
				eventBasedGateway__outFlow____outgoing,
				outFlow__intermediateCatchEvent____targetRef,
				intermediateCatchEvent__outFlow____incoming,
				ceFlow__intermediateCatchEvent____sourceRef,
				intermediateCatchEvent__ceFlow____outgoing,
				lane__intermediateCatchEvent____flowNodeRefs };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_5_blackBBBBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					return new Object[] { match, process, inFlow,
							eventBasedGateway, outFlow, intermediateCatchEvent,
							lane, laneSet, ceFlow };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_0_5_greenBBBBBBFFFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, Lane lane, LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(eventBasedGateway);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String laneSet__lane____lanes_name_prime = "lanes";
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		match.getContextEdges().add(process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		match.getContextEdges().add(inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		match.getContextEdges().add(eventBasedGateway__inFlow____incoming);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, process, inFlow, eventBasedGateway, lane,
				laneSet, process__laneSet____laneSets,
				process__inFlow____flowElements,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming, laneSet__lane____lanes };
	}

	public static final void pattern_CatchEventAfterEBGToStepRule_0_6_expressionBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, lane,
				laneSet, ceFlow);

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_1_bindingFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("eventBasedGateway");
		EObject _localVariable_3 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("intermediateCatchEvent");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("ebgToNormalStep");
		EObject _localVariable_11 = isApplicableMatch.getObject("lane");
		EObject _localVariable_12 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_13 = isApplicableMatch.getObject("ceFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEventBasedGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpIntermediateCatchEvent = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpProcessToUseCase = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpInFlowToFlow = _localVariable_8;
		EObject tmpNormalStep = _localVariable_9;
		EObject tmpEbgToNormalStep = _localVariable_10;
		EObject tmpLane = _localVariable_11;
		EObject tmpLaneSet = _localVariable_12;
		EObject tmpCeFlow = _localVariable_13;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEventBasedGateway instanceof EventBasedGateway) {
					EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpProcessToUseCase instanceof ProcessToUseCase) {
									ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
											SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
											if (tmpNormalStep instanceof NormalStep) {
												NormalStep normalStep = (NormalStep) tmpNormalStep;
												if (tmpEbgToNormalStep instanceof FlowNodeToStep) {
													FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) tmpEbgToNormalStep;
													if (tmpLane instanceof Lane) {
														Lane lane = (Lane) tmpLane;
														if (tmpLaneSet instanceof LaneSet) {
															LaneSet laneSet = (LaneSet) tmpLaneSet;
															if (tmpCeFlow instanceof SequenceFlow) {
																SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
																return new Object[] {
																		process,
																		inFlow,
																		eventBasedGateway,
																		outFlow,
																		intermediateCatchEvent,
																		useCase,
																		processToUseCase,
																		flow,
																		inFlowToFlow,
																		normalStep,
																		ebgToNormalStep,
																		lane,
																		laneSet,
																		ceFlow,
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
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_1_blackBBBBBBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow, CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { process, inFlow,
									eventBasedGateway, outFlow,
									intermediateCatchEvent, useCase,
									processToUseCase, flow, inFlowToFlow,
									normalStep, ebgToNormalStep, lane, laneSet,
									ceFlow, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_1_1_binding = pattern_CatchEventAfterEBGToStepRule_1_1_bindingFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_CatchEventAfterEBGToStepRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[2];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[3];
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[6];
			Flow flow = (Flow) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[7];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[8];
			NormalStep normalStep = (NormalStep) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[9];
			FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[10];
			Lane lane = (Lane) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[11];
			LaneSet laneSet = (LaneSet) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[12];
			SequenceFlow ceFlow = (SequenceFlow) result_pattern_CatchEventAfterEBGToStepRule_1_1_binding[13];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_1_1_black = pattern_CatchEventAfterEBGToStepRule_1_1_blackBBBBBBBBBBBBBBFBB(
					process, inFlow, eventBasedGateway, outFlow,
					intermediateCatchEvent, useCase, processToUseCase, flow,
					inFlowToFlow, normalStep, ebgToNormalStep, lane, laneSet,
					ceFlow, _this, isApplicableMatch);
			if (result_pattern_CatchEventAfterEBGToStepRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_1_1_black[14];

				return new Object[] { process, inFlow, eventBasedGateway,
						outFlow, intermediateCatchEvent, useCase,
						processToUseCase, flow, inFlowToFlow, normalStep,
						ebgToNormalStep, lane, laneSet, ceFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_1_greenBBBBFFFFBFB(
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			NormalStep normalStep, SequenceFlow ceFlow, CSP csp) {
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		AlternativeFlow alternativeFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		ICEToAltFlow iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createICEToAltFlow();
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("alternativeFlow", "name");
		normalStep.getStepAlternative().add(alt);
		outFlowToAlt.setSource(outFlow);
		outFlowToAlt.setTarget(alt);
		useCase.getFlows().add(alternativeFlow);
		alt.setRef(alternativeFlow);
		iceToAltFlow.setSource(intermediateCatchEvent);
		iceToAltFlow.setTarget(alternativeFlow);
		ceFlowToAlternativeFlow.setSource(ceFlow);
		ceFlowToAlternativeFlow.setTarget(alternativeFlow);
		String alt_condition_prime = (String) _localVariable_0;
		String alternativeFlow_name_prime = (String) _localVariable_1;
		alt.setCondition(alt_condition_prime);
		alternativeFlow.setName(alternativeFlow_name_prime);
		return new Object[] { outFlow, intermediateCatchEvent, useCase,
				normalStep, alt, outFlowToAlt, alternativeFlow, iceToAltFlow,
				ceFlow, ceFlowToAlternativeFlow, csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_2_blackBBBBBBBB(
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			AlternativeFlow alternativeFlow, ICEToAltFlow iceToAltFlow,
			SequenceFlow ceFlow, SequenceFlowToUCFlow ceFlowToAlternativeFlow) {
		if (!ceFlow.equals(outFlow)) {
			return new Object[] { outFlow, intermediateCatchEvent, alt,
					outFlowToAlt, alternativeFlow, iceToAltFlow, ceFlow,
					ceFlowToAlternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_2_greenFBBBBBBBB(
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			AlternativeFlow alternativeFlow, ICEToAltFlow iceToAltFlow,
			SequenceFlow ceFlow, SequenceFlowToUCFlow ceFlowToAlternativeFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getTranslatedElements().add(intermediateCatchEvent);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(outFlowToAlt);
		ruleresult.getCreatedElements().add(alternativeFlow);
		ruleresult.getCreatedLinkElements().add(iceToAltFlow);
		ruleresult.getTranslatedElements().add(ceFlow);
		ruleresult.getCreatedLinkElements().add(ceFlowToAlternativeFlow);
		return new Object[] { ruleresult, outFlow, intermediateCatchEvent, alt,
				outFlowToAlt, alternativeFlow, iceToAltFlow, ceFlow,
				ceFlowToAlternativeFlow };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_3_blackBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject eventBasedGateway, EObject outFlow,
			EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(outFlow)) {
						if (!inFlow.equals(intermediateCatchEvent)) {
							if (!inFlow.equals(useCase)) {
								if (!inFlow.equals(processToUseCase)) {
									if (!inFlow.equals(inFlowToFlow)) {
										if (!inFlow.equals(normalStep)) {
											if (!inFlow.equals(outFlowToAlt)) {
												if (!inFlow.equals(lane)) {
													if (!inFlow.equals(laneSet)) {
														if (!eventBasedGateway
																.equals(process)) {
															if (!eventBasedGateway
																	.equals(inFlow)) {
																if (!eventBasedGateway
																		.equals(outFlow)) {
																	if (!eventBasedGateway
																			.equals(intermediateCatchEvent)) {
																		if (!eventBasedGateway
																				.equals(useCase)) {
																			if (!eventBasedGateway
																					.equals(processToUseCase)) {
																				if (!eventBasedGateway
																						.equals(flow)) {
																					if (!eventBasedGateway
																							.equals(inFlowToFlow)) {
																						if (!eventBasedGateway
																								.equals(normalStep)) {
																							if (!eventBasedGateway
																									.equals(outFlowToAlt)) {
																								if (!eventBasedGateway
																										.equals(iceToAltFlow)) {
																									if (!eventBasedGateway
																											.equals(lane)) {
																										if (!eventBasedGateway
																												.equals(laneSet)) {
																											if (!outFlow
																													.equals(process)) {
																												if (!outFlow
																														.equals(useCase)) {
																													if (!outFlow
																															.equals(processToUseCase)) {
																														if (!outFlow
																																.equals(outFlowToAlt)) {
																															if (!intermediateCatchEvent
																																	.equals(process)) {
																																if (!intermediateCatchEvent
																																		.equals(outFlow)) {
																																	if (!intermediateCatchEvent
																																			.equals(useCase)) {
																																		if (!intermediateCatchEvent
																																				.equals(processToUseCase)) {
																																			if (!intermediateCatchEvent
																																					.equals(normalStep)) {
																																				if (!intermediateCatchEvent
																																						.equals(outFlowToAlt)) {
																																					if (!intermediateCatchEvent
																																							.equals(lane)) {
																																						if (!intermediateCatchEvent
																																								.equals(laneSet)) {
																																							if (!processToUseCase
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(process)) {
																																									if (!flow
																																											.equals(inFlow)) {
																																										if (!flow
																																												.equals(outFlow)) {
																																											if (!flow
																																													.equals(intermediateCatchEvent)) {
																																												if (!flow
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(processToUseCase)) {
																																														if (!flow
																																																.equals(inFlowToFlow)) {
																																															if (!flow
																																																	.equals(normalStep)) {
																																																if (!flow
																																																		.equals(outFlowToAlt)) {
																																																	if (!flow
																																																			.equals(iceToAltFlow)) {
																																																		if (!flow
																																																				.equals(lane)) {
																																																			if (!flow
																																																					.equals(laneSet)) {
																																																				if (!inFlowToFlow
																																																						.equals(process)) {
																																																					if (!inFlowToFlow
																																																							.equals(outFlow)) {
																																																						if (!inFlowToFlow
																																																								.equals(intermediateCatchEvent)) {
																																																							if (!inFlowToFlow
																																																									.equals(useCase)) {
																																																								if (!inFlowToFlow
																																																										.equals(processToUseCase)) {
																																																									if (!inFlowToFlow
																																																											.equals(normalStep)) {
																																																										if (!inFlowToFlow
																																																												.equals(outFlowToAlt)) {
																																																											if (!inFlowToFlow
																																																													.equals(lane)) {
																																																												if (!inFlowToFlow
																																																														.equals(laneSet)) {
																																																													if (!normalStep
																																																															.equals(process)) {
																																																														if (!normalStep
																																																																.equals(outFlow)) {
																																																															if (!normalStep
																																																																	.equals(useCase)) {
																																																																if (!normalStep
																																																																		.equals(processToUseCase)) {
																																																																	if (!normalStep
																																																																			.equals(outFlowToAlt)) {
																																																																		if (!ebgToNormalStep
																																																																				.equals(process)) {
																																																																			if (!ebgToNormalStep
																																																																					.equals(inFlow)) {
																																																																				if (!ebgToNormalStep
																																																																						.equals(eventBasedGateway)) {
																																																																					if (!ebgToNormalStep
																																																																							.equals(outFlow)) {
																																																																						if (!ebgToNormalStep
																																																																								.equals(intermediateCatchEvent)) {
																																																																							if (!ebgToNormalStep
																																																																									.equals(useCase)) {
																																																																								if (!ebgToNormalStep
																																																																										.equals(processToUseCase)) {
																																																																									if (!ebgToNormalStep
																																																																											.equals(flow)) {
																																																																										if (!ebgToNormalStep
																																																																												.equals(inFlowToFlow)) {
																																																																											if (!ebgToNormalStep
																																																																													.equals(normalStep)) {
																																																																												if (!ebgToNormalStep
																																																																														.equals(outFlowToAlt)) {
																																																																													if (!ebgToNormalStep
																																																																															.equals(iceToAltFlow)) {
																																																																														if (!ebgToNormalStep
																																																																																.equals(lane)) {
																																																																															if (!ebgToNormalStep
																																																																																	.equals(laneSet)) {
																																																																																if (!alt.equals(process)) {
																																																																																	if (!alt.equals(inFlow)) {
																																																																																		if (!alt.equals(eventBasedGateway)) {
																																																																																			if (!alt.equals(outFlow)) {
																																																																																				if (!alt.equals(intermediateCatchEvent)) {
																																																																																					if (!alt.equals(useCase)) {
																																																																																						if (!alt.equals(processToUseCase)) {
																																																																																							if (!alt.equals(flow)) {
																																																																																								if (!alt.equals(inFlowToFlow)) {
																																																																																									if (!alt.equals(normalStep)) {
																																																																																										if (!alt.equals(ebgToNormalStep)) {
																																																																																											if (!alt.equals(outFlowToAlt)) {
																																																																																												if (!alt.equals(alternativeFlow)) {
																																																																																													if (!alt.equals(iceToAltFlow)) {
																																																																																														if (!alt.equals(lane)) {
																																																																																															if (!alt.equals(laneSet)) {
																																																																																																if (!alt.equals(ceFlow)) {
																																																																																																	if (!alt.equals(ceFlowToAlternativeFlow)) {
																																																																																																		if (!outFlowToAlt
																																																																																																				.equals(process)) {
																																																																																																			if (!outFlowToAlt
																																																																																																					.equals(useCase)) {
																																																																																																				if (!outFlowToAlt
																																																																																																						.equals(processToUseCase)) {
																																																																																																					if (!alternativeFlow
																																																																																																							.equals(process)) {
																																																																																																						if (!alternativeFlow
																																																																																																								.equals(inFlow)) {
																																																																																																							if (!alternativeFlow
																																																																																																									.equals(eventBasedGateway)) {
																																																																																																								if (!alternativeFlow
																																																																																																										.equals(outFlow)) {
																																																																																																									if (!alternativeFlow
																																																																																																											.equals(intermediateCatchEvent)) {
																																																																																																										if (!alternativeFlow
																																																																																																												.equals(useCase)) {
																																																																																																											if (!alternativeFlow
																																																																																																													.equals(processToUseCase)) {
																																																																																																												if (!alternativeFlow
																																																																																																														.equals(flow)) {
																																																																																																													if (!alternativeFlow
																																																																																																															.equals(inFlowToFlow)) {
																																																																																																														if (!alternativeFlow
																																																																																																																.equals(normalStep)) {
																																																																																																															if (!alternativeFlow
																																																																																																																	.equals(ebgToNormalStep)) {
																																																																																																																if (!alternativeFlow
																																																																																																																		.equals(outFlowToAlt)) {
																																																																																																																	if (!alternativeFlow
																																																																																																																			.equals(iceToAltFlow)) {
																																																																																																																		if (!alternativeFlow
																																																																																																																				.equals(lane)) {
																																																																																																																			if (!alternativeFlow
																																																																																																																					.equals(laneSet)) {
																																																																																																																				if (!alternativeFlow
																																																																																																																						.equals(ceFlow)) {
																																																																																																																					if (!alternativeFlow
																																																																																																																							.equals(ceFlowToAlternativeFlow)) {
																																																																																																																						if (!iceToAltFlow
																																																																																																																								.equals(process)) {
																																																																																																																							if (!iceToAltFlow
																																																																																																																									.equals(inFlow)) {
																																																																																																																								if (!iceToAltFlow
																																																																																																																										.equals(outFlow)) {
																																																																																																																									if (!iceToAltFlow
																																																																																																																											.equals(intermediateCatchEvent)) {
																																																																																																																										if (!iceToAltFlow
																																																																																																																												.equals(useCase)) {
																																																																																																																											if (!iceToAltFlow
																																																																																																																													.equals(processToUseCase)) {
																																																																																																																												if (!iceToAltFlow
																																																																																																																														.equals(inFlowToFlow)) {
																																																																																																																													if (!iceToAltFlow
																																																																																																																															.equals(normalStep)) {
																																																																																																																														if (!iceToAltFlow
																																																																																																																																.equals(outFlowToAlt)) {
																																																																																																																															if (!iceToAltFlow
																																																																																																																																	.equals(lane)) {
																																																																																																																																if (!iceToAltFlow
																																																																																																																																		.equals(laneSet)) {
																																																																																																																																	if (!lane
																																																																																																																																			.equals(process)) {
																																																																																																																																		if (!lane
																																																																																																																																				.equals(outFlow)) {
																																																																																																																																			if (!lane
																																																																																																																																					.equals(useCase)) {
																																																																																																																																				if (!lane
																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																					if (!lane
																																																																																																																																							.equals(normalStep)) {
																																																																																																																																						if (!lane
																																																																																																																																								.equals(outFlowToAlt)) {
																																																																																																																																							if (!lane
																																																																																																																																									.equals(laneSet)) {
																																																																																																																																								if (!laneSet
																																																																																																																																										.equals(process)) {
																																																																																																																																									if (!laneSet
																																																																																																																																											.equals(outFlow)) {
																																																																																																																																										if (!laneSet
																																																																																																																																												.equals(useCase)) {
																																																																																																																																											if (!laneSet
																																																																																																																																													.equals(processToUseCase)) {
																																																																																																																																												if (!laneSet
																																																																																																																																														.equals(normalStep)) {
																																																																																																																																													if (!laneSet
																																																																																																																																															.equals(outFlowToAlt)) {
																																																																																																																																														if (!ceFlow
																																																																																																																																																.equals(process)) {
																																																																																																																																															if (!ceFlow
																																																																																																																																																	.equals(inFlow)) {
																																																																																																																																																if (!ceFlow
																																																																																																																																																		.equals(eventBasedGateway)) {
																																																																																																																																																	if (!ceFlow
																																																																																																																																																			.equals(outFlow)) {
																																																																																																																																																		if (!ceFlow
																																																																																																																																																				.equals(intermediateCatchEvent)) {
																																																																																																																																																			if (!ceFlow
																																																																																																																																																					.equals(useCase)) {
																																																																																																																																																				if (!ceFlow
																																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																																					if (!ceFlow
																																																																																																																																																							.equals(flow)) {
																																																																																																																																																						if (!ceFlow
																																																																																																																																																								.equals(inFlowToFlow)) {
																																																																																																																																																							if (!ceFlow
																																																																																																																																																									.equals(normalStep)) {
																																																																																																																																																								if (!ceFlow
																																																																																																																																																										.equals(ebgToNormalStep)) {
																																																																																																																																																									if (!ceFlow
																																																																																																																																																											.equals(outFlowToAlt)) {
																																																																																																																																																										if (!ceFlow
																																																																																																																																																												.equals(iceToAltFlow)) {
																																																																																																																																																											if (!ceFlow
																																																																																																																																																													.equals(lane)) {
																																																																																																																																																												if (!ceFlow
																																																																																																																																																														.equals(laneSet)) {
																																																																																																																																																													if (!ceFlow
																																																																																																																																																															.equals(ceFlowToAlternativeFlow)) {
																																																																																																																																																														if (!ceFlowToAlternativeFlow
																																																																																																																																																																.equals(process)) {
																																																																																																																																																															if (!ceFlowToAlternativeFlow
																																																																																																																																																																	.equals(inFlow)) {
																																																																																																																																																																if (!ceFlowToAlternativeFlow
																																																																																																																																																																		.equals(eventBasedGateway)) {
																																																																																																																																																																	if (!ceFlowToAlternativeFlow
																																																																																																																																																																			.equals(outFlow)) {
																																																																																																																																																																		if (!ceFlowToAlternativeFlow
																																																																																																																																																																				.equals(intermediateCatchEvent)) {
																																																																																																																																																																			if (!ceFlowToAlternativeFlow
																																																																																																																																																																					.equals(useCase)) {
																																																																																																																																																																				if (!ceFlowToAlternativeFlow
																																																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																																																					if (!ceFlowToAlternativeFlow
																																																																																																																																																																							.equals(flow)) {
																																																																																																																																																																						if (!ceFlowToAlternativeFlow
																																																																																																																																																																								.equals(inFlowToFlow)) {
																																																																																																																																																																							if (!ceFlowToAlternativeFlow
																																																																																																																																																																									.equals(normalStep)) {
																																																																																																																																																																								if (!ceFlowToAlternativeFlow
																																																																																																																																																																										.equals(ebgToNormalStep)) {
																																																																																																																																																																									if (!ceFlowToAlternativeFlow
																																																																																																																																																																											.equals(outFlowToAlt)) {
																																																																																																																																																																										if (!ceFlowToAlternativeFlow
																																																																																																																																																																												.equals(iceToAltFlow)) {
																																																																																																																																																																											if (!ceFlowToAlternativeFlow
																																																																																																																																																																													.equals(lane)) {
																																																																																																																																																																												if (!ceFlowToAlternativeFlow
																																																																																																																																																																														.equals(laneSet)) {
																																																																																																																																																																													return new Object[] {
																																																																																																																																																																															ruleresult,
																																																																																																																																																																															process,
																																																																																																																																																																															inFlow,
																																																																																																																																																																															eventBasedGateway,
																																																																																																																																																																															outFlow,
																																																																																																																																																																															intermediateCatchEvent,
																																																																																																																																																																															useCase,
																																																																																																																																																																															processToUseCase,
																																																																																																																																																																															flow,
																																																																																																																																																																															inFlowToFlow,
																																																																																																																																																																															normalStep,
																																																																																																																																																																															ebgToNormalStep,
																																																																																																																																																																															alt,
																																																																																																																																																																															outFlowToAlt,
																																																																																																																																																																															alternativeFlow,
																																																																																																																																																																															iceToAltFlow,
																																																																																																																																																																															lane,
																																																																																																																																																																															laneSet,
																																																																																																																																																																															ceFlow,
																																																																																																																																																																															ceFlowToAlternativeFlow };
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_1_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process,
			EObject eventBasedGateway, EObject outFlow,
			EObject intermediateCatchEvent, EObject useCase,
			EObject normalStep, EObject alt, EObject outFlowToAlt,
			EObject alternativeFlow, EObject iceToAltFlow, EObject lane,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		EMoflonEdge process__ceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__intermediateCatchEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__eventBasedGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__intermediateCatchEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__outFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToAltFlow__intermediateCatchEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToAltFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlowToAlternativeFlow__ceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlowToAlternativeFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CatchEventAfterEBGToStepRule";
		String process__ceFlow____flowElements_name_prime = "flowElements";
		String process__intermediateCatchEvent____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__eventBasedGateway____sourceRef_name_prime = "sourceRef";
		String eventBasedGateway__outFlow____outgoing_name_prime = "outgoing";
		String outFlow__intermediateCatchEvent____targetRef_name_prime = "targetRef";
		String intermediateCatchEvent__outFlow____incoming_name_prime = "incoming";
		String ceFlow__intermediateCatchEvent____sourceRef_name_prime = "sourceRef";
		String intermediateCatchEvent__ceFlow____outgoing_name_prime = "outgoing";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String outFlowToAlt__outFlow____source_name_prime = "source";
		String outFlowToAlt__alt____target_name_prime = "target";
		String iceToAltFlow__intermediateCatchEvent____source_name_prime = "source";
		String iceToAltFlow__alternativeFlow____target_name_prime = "target";
		String lane__intermediateCatchEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String ceFlowToAlternativeFlow__ceFlow____source_name_prime = "source";
		String ceFlowToAlternativeFlow__alternativeFlow____target_name_prime = "target";
		process__ceFlow____flowElements.setSrc(process);
		process__ceFlow____flowElements.setTrg(ceFlow);
		ruleresult.getTranslatedEdges().add(process__ceFlow____flowElements);
		process__intermediateCatchEvent____flowElements.setSrc(process);
		process__intermediateCatchEvent____flowElements
				.setTrg(intermediateCatchEvent);
		ruleresult.getTranslatedEdges().add(
				process__intermediateCatchEvent____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		outFlow__eventBasedGateway____sourceRef.setSrc(outFlow);
		outFlow__eventBasedGateway____sourceRef.setTrg(eventBasedGateway);
		ruleresult.getTranslatedEdges().add(
				outFlow__eventBasedGateway____sourceRef);
		eventBasedGateway__outFlow____outgoing.setSrc(eventBasedGateway);
		eventBasedGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				eventBasedGateway__outFlow____outgoing);
		outFlow__intermediateCatchEvent____targetRef.setSrc(outFlow);
		outFlow__intermediateCatchEvent____targetRef
				.setTrg(intermediateCatchEvent);
		ruleresult.getTranslatedEdges().add(
				outFlow__intermediateCatchEvent____targetRef);
		intermediateCatchEvent__outFlow____incoming
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__outFlow____incoming.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(
				intermediateCatchEvent__outFlow____incoming);
		ceFlow__intermediateCatchEvent____sourceRef.setSrc(ceFlow);
		ceFlow__intermediateCatchEvent____sourceRef
				.setTrg(intermediateCatchEvent);
		ruleresult.getTranslatedEdges().add(
				ceFlow__intermediateCatchEvent____sourceRef);
		intermediateCatchEvent__ceFlow____outgoing
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__ceFlow____outgoing.setTrg(ceFlow);
		ruleresult.getTranslatedEdges().add(
				intermediateCatchEvent__ceFlow____outgoing);
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		ruleresult.getCreatedEdges().add(normalStep__alt____stepAlternative);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(alt__alternativeFlow____ref);
		outFlowToAlt__outFlow____source.setSrc(outFlowToAlt);
		outFlowToAlt__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToAlt__outFlow____source);
		outFlowToAlt__alt____target.setSrc(outFlowToAlt);
		outFlowToAlt__alt____target.setTrg(alt);
		ruleresult.getCreatedEdges().add(outFlowToAlt__alt____target);
		iceToAltFlow__intermediateCatchEvent____source.setSrc(iceToAltFlow);
		iceToAltFlow__intermediateCatchEvent____source
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				iceToAltFlow__intermediateCatchEvent____source);
		iceToAltFlow__alternativeFlow____target.setSrc(iceToAltFlow);
		iceToAltFlow__alternativeFlow____target.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				iceToAltFlow__alternativeFlow____target);
		lane__intermediateCatchEvent____flowNodeRefs.setSrc(lane);
		lane__intermediateCatchEvent____flowNodeRefs
				.setTrg(intermediateCatchEvent);
		ruleresult.getTranslatedEdges().add(
				lane__intermediateCatchEvent____flowNodeRefs);
		ceFlowToAlternativeFlow__ceFlow____source
				.setSrc(ceFlowToAlternativeFlow);
		ceFlowToAlternativeFlow__ceFlow____source.setTrg(ceFlow);
		ruleresult.getCreatedEdges().add(
				ceFlowToAlternativeFlow__ceFlow____source);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setSrc(ceFlowToAlternativeFlow);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				ceFlowToAlternativeFlow__alternativeFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__ceFlow____flowElements
				.setName(process__ceFlow____flowElements_name_prime);
		process__intermediateCatchEvent____flowElements
				.setName(process__intermediateCatchEvent____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__eventBasedGateway____sourceRef
				.setName(outFlow__eventBasedGateway____sourceRef_name_prime);
		eventBasedGateway__outFlow____outgoing
				.setName(eventBasedGateway__outFlow____outgoing_name_prime);
		outFlow__intermediateCatchEvent____targetRef
				.setName(outFlow__intermediateCatchEvent____targetRef_name_prime);
		intermediateCatchEvent__outFlow____incoming
				.setName(intermediateCatchEvent__outFlow____incoming_name_prime);
		ceFlow__intermediateCatchEvent____sourceRef
				.setName(ceFlow__intermediateCatchEvent____sourceRef_name_prime);
		intermediateCatchEvent__ceFlow____outgoing
				.setName(intermediateCatchEvent__ceFlow____outgoing_name_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		outFlowToAlt__outFlow____source
				.setName(outFlowToAlt__outFlow____source_name_prime);
		outFlowToAlt__alt____target
				.setName(outFlowToAlt__alt____target_name_prime);
		iceToAltFlow__intermediateCatchEvent____source
				.setName(iceToAltFlow__intermediateCatchEvent____source_name_prime);
		iceToAltFlow__alternativeFlow____target
				.setName(iceToAltFlow__alternativeFlow____target_name_prime);
		lane__intermediateCatchEvent____flowNodeRefs
				.setName(lane__intermediateCatchEvent____flowNodeRefs_name_prime);
		ceFlowToAlternativeFlow__ceFlow____source
				.setName(ceFlowToAlternativeFlow__ceFlow____source_name_prime);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setName(ceFlowToAlternativeFlow__alternativeFlow____target_name_prime);
		return new Object[] { ruleresult, process, eventBasedGateway, outFlow,
				intermediateCatchEvent, useCase, normalStep, alt, outFlowToAlt,
				alternativeFlow, iceToAltFlow, lane, ceFlow,
				ceFlowToAlternativeFlow, process__ceFlow____flowElements,
				process__intermediateCatchEvent____flowElements,
				process__outFlow____flowElements,
				outFlow__eventBasedGateway____sourceRef,
				eventBasedGateway__outFlow____outgoing,
				outFlow__intermediateCatchEvent____targetRef,
				intermediateCatchEvent__outFlow____incoming,
				ceFlow__intermediateCatchEvent____sourceRef,
				intermediateCatchEvent__ceFlow____outgoing,
				useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative,
				alt__alternativeFlow____ref, outFlowToAlt__outFlow____source,
				outFlowToAlt__alt____target,
				iceToAltFlow__intermediateCatchEvent____source,
				iceToAltFlow__alternativeFlow____target,
				lane__intermediateCatchEvent____flowNodeRefs,
				ceFlowToAlternativeFlow__ceFlow____source,
				ceFlowToAlternativeFlow__alternativeFlow____target };
	}

	public static final void pattern_CatchEventAfterEBGToStepRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		_this.registerObjects_FWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				iceToAltFlow, lane, laneSet, ceFlow, ceFlowToAlternativeFlow);

	}

	public static final PerformRuleResult pattern_CatchEventAfterEBGToStepRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_1_blackFBB(
			EClass eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_2_1_binding = pattern_CatchEventAfterEBGToStepRule_2_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_2_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_2_1_black = pattern_CatchEventAfterEBGToStepRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "CatchEventAfterEBGToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_2_bindingFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("eventBasedGateway");
		EObject _localVariable_3 = match.getObject("outFlow");
		EObject _localVariable_4 = match.getObject("intermediateCatchEvent");
		EObject _localVariable_5 = match.getObject("lane");
		EObject _localVariable_6 = match.getObject("laneSet");
		EObject _localVariable_7 = match.getObject("ceFlow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEventBasedGateway = _localVariable_2;
		EObject tmpOutFlow = _localVariable_3;
		EObject tmpIntermediateCatchEvent = _localVariable_4;
		EObject tmpLane = _localVariable_5;
		EObject tmpLaneSet = _localVariable_6;
		EObject tmpCeFlow = _localVariable_7;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEventBasedGateway instanceof EventBasedGateway) {
					EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
					if (tmpOutFlow instanceof SequenceFlow) {
						SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
						if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
							if (tmpLane instanceof Lane) {
								Lane lane = (Lane) tmpLane;
								if (tmpLaneSet instanceof LaneSet) {
									LaneSet laneSet = (LaneSet) tmpLaneSet;
									if (tmpCeFlow instanceof SequenceFlow) {
										SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
										return new Object[] { process, inFlow,
												eventBasedGateway, outFlow,
												intermediateCatchEvent, lane,
												laneSet, ceFlow, match };
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

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_2_2_blackBBBBBFFFFFFBBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					for (ProcessToUseCase processToUseCase : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(process,
									ProcessToUseCase.class, "source")) {
						UseCase useCase = processToUseCase.getTarget();
						if (useCase != null) {
							for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(inFlow,
											SequenceFlowToUCFlow.class,
											"source")) {
								Flow flow = inFlowToFlow.getTarget();
								if (flow != null) {
									for (FlowNodeToStep ebgToNormalStep : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													eventBasedGateway,
													FlowNodeToStep.class,
													"source")) {
										Step tmpNormalStep = ebgToNormalStep
												.getTarget();
										if (tmpNormalStep instanceof NormalStep) {
											NormalStep normalStep = (NormalStep) tmpNormalStep;
											_result.add(new Object[] { process,
													inFlow, eventBasedGateway,
													outFlow,
													intermediateCatchEvent,
													useCase, processToUseCase,
													flow, inFlowToFlow,
													normalStep,
													ebgToNormalStep, lane,
													laneSet, ceFlow, match });
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

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_2_3_blackBBBBBBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!ceFlow.equals(inFlow)) {
				if (!ceFlow.equals(outFlow)) {
					if (process.getLaneSets().contains(laneSet)) {
						if (process.getFlowElements().contains(ceFlow)) {
							if (process.getFlowElements().contains(inFlow)) {
								if (process.getFlowElements().contains(
										intermediateCatchEvent)) {
									if (process.getFlowElements().contains(
											outFlow)) {
										if (process.getFlowElements().contains(
												eventBasedGateway)) {
											if (eventBasedGateway.equals(inFlow
													.getTargetRef())) {
												if (eventBasedGateway
														.equals(outFlow
																.getSourceRef())) {
													if (intermediateCatchEvent
															.equals(outFlow
																	.getTargetRef())) {
														if (intermediateCatchEvent
																.equals(ceFlow
																		.getSourceRef())) {
															if (useCase
																	.getFlows()
																	.contains(
																			flow)) {
																if (process
																		.equals(processToUseCase
																				.getSource())) {
																	if (useCase
																			.equals(processToUseCase
																					.getTarget())) {
																		if (flow.getSteps()
																				.contains(
																						normalStep)) {
																			if (inFlow
																					.equals(inFlowToFlow
																							.getSource())) {
																				if (flow.equals(inFlowToFlow
																						.getTarget())) {
																					if (eventBasedGateway
																							.equals(ebgToNormalStep
																									.getSource())) {
																						if (normalStep
																								.equals(ebgToNormalStep
																										.getTarget())) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								if (laneSet
																										.getLanes()
																										.contains(
																												lane)) {
																									_result.add(new Object[] {
																											process,
																											inFlow,
																											eventBasedGateway,
																											outFlow,
																											intermediateCatchEvent,
																											useCase,
																											processToUseCase,
																											flow,
																											inFlowToFlow,
																											normalStep,
																											ebgToNormalStep,
																											lane,
																											laneSet,
																											ceFlow });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__ceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__intermediateCatchEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__eventBasedGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__intermediateCatchEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__outFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__eventBasedGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__ceFlow____flowElements_name_prime = "flowElements";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__intermediateCatchEvent____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__eventBasedGateway____sourceRef_name_prime = "sourceRef";
		String eventBasedGateway__outFlow____outgoing_name_prime = "outgoing";
		String outFlow__intermediateCatchEvent____targetRef_name_prime = "targetRef";
		String intermediateCatchEvent__outFlow____incoming_name_prime = "incoming";
		String ceFlow__intermediateCatchEvent____sourceRef_name_prime = "sourceRef";
		String intermediateCatchEvent__ceFlow____outgoing_name_prime = "outgoing";
		String useCase__flow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String ebgToNormalStep__eventBasedGateway____source_name_prime = "source";
		String ebgToNormalStep__normalStep____target_name_prime = "target";
		String lane__intermediateCatchEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(intermediateCatchEvent);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(ebgToNormalStep);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(ceFlow);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__ceFlow____flowElements.setSrc(process);
		process__ceFlow____flowElements.setTrg(ceFlow);
		isApplicableMatch.getAllContextElements().add(
				process__ceFlow____flowElements);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__intermediateCatchEvent____flowElements.setSrc(process);
		process__intermediateCatchEvent____flowElements
				.setTrg(intermediateCatchEvent);
		isApplicableMatch.getAllContextElements().add(
				process__intermediateCatchEvent____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				eventBasedGateway__inFlow____incoming);
		outFlow__eventBasedGateway____sourceRef.setSrc(outFlow);
		outFlow__eventBasedGateway____sourceRef.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__eventBasedGateway____sourceRef);
		eventBasedGateway__outFlow____outgoing.setSrc(eventBasedGateway);
		eventBasedGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				eventBasedGateway__outFlow____outgoing);
		outFlow__intermediateCatchEvent____targetRef.setSrc(outFlow);
		outFlow__intermediateCatchEvent____targetRef
				.setTrg(intermediateCatchEvent);
		isApplicableMatch.getAllContextElements().add(
				outFlow__intermediateCatchEvent____targetRef);
		intermediateCatchEvent__outFlow____incoming
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__outFlow____incoming.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				intermediateCatchEvent__outFlow____incoming);
		ceFlow__intermediateCatchEvent____sourceRef.setSrc(ceFlow);
		ceFlow__intermediateCatchEvent____sourceRef
				.setTrg(intermediateCatchEvent);
		isApplicableMatch.getAllContextElements().add(
				ceFlow__intermediateCatchEvent____sourceRef);
		intermediateCatchEvent__ceFlow____outgoing
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__ceFlow____outgoing.setTrg(ceFlow);
		isApplicableMatch.getAllContextElements().add(
				intermediateCatchEvent__ceFlow____outgoing);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
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
		ebgToNormalStep__eventBasedGateway____source.setSrc(ebgToNormalStep);
		ebgToNormalStep__eventBasedGateway____source.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				ebgToNormalStep__eventBasedGateway____source);
		ebgToNormalStep__normalStep____target.setSrc(ebgToNormalStep);
		ebgToNormalStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				ebgToNormalStep__normalStep____target);
		lane__intermediateCatchEvent____flowNodeRefs.setSrc(lane);
		lane__intermediateCatchEvent____flowNodeRefs
				.setTrg(intermediateCatchEvent);
		isApplicableMatch.getAllContextElements().add(
				lane__intermediateCatchEvent____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__ceFlow____flowElements
				.setName(process__ceFlow____flowElements_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__intermediateCatchEvent____flowElements
				.setName(process__intermediateCatchEvent____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		outFlow__eventBasedGateway____sourceRef
				.setName(outFlow__eventBasedGateway____sourceRef_name_prime);
		eventBasedGateway__outFlow____outgoing
				.setName(eventBasedGateway__outFlow____outgoing_name_prime);
		outFlow__intermediateCatchEvent____targetRef
				.setName(outFlow__intermediateCatchEvent____targetRef_name_prime);
		intermediateCatchEvent__outFlow____incoming
				.setName(intermediateCatchEvent__outFlow____incoming_name_prime);
		ceFlow__intermediateCatchEvent____sourceRef
				.setName(ceFlow__intermediateCatchEvent____sourceRef_name_prime);
		intermediateCatchEvent__ceFlow____outgoing
				.setName(intermediateCatchEvent__ceFlow____outgoing_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		ebgToNormalStep__eventBasedGateway____source
				.setName(ebgToNormalStep__eventBasedGateway____source_name_prime);
		ebgToNormalStep__normalStep____target
				.setName(ebgToNormalStep__normalStep____target_name_prime);
		lane__intermediateCatchEvent____flowNodeRefs
				.setName(lane__intermediateCatchEvent____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { process, inFlow, eventBasedGateway, outFlow,
				intermediateCatchEvent, useCase, processToUseCase, flow,
				inFlowToFlow, normalStep, ebgToNormalStep, lane, laneSet,
				ceFlow, isApplicableMatch, process__laneSet____laneSets,
				process__ceFlow____flowElements,
				process__inFlow____flowElements,
				process__intermediateCatchEvent____flowElements,
				process__outFlow____flowElements,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming,
				outFlow__eventBasedGateway____sourceRef,
				eventBasedGateway__outFlow____outgoing,
				outFlow__intermediateCatchEvent____targetRef,
				intermediateCatchEvent__outFlow____incoming,
				ceFlow__intermediateCatchEvent____sourceRef,
				intermediateCatchEvent__ceFlow____outgoing,
				useCase__flow____flows, processToUseCase__process____source,
				processToUseCase__useCase____target, flow__normalStep____steps,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				ebgToNormalStep__eventBasedGateway____source,
				ebgToNormalStep__normalStep____target,
				lane__intermediateCatchEvent____flowNodeRefs,
				laneSet__lane____lanes };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_4_bindingFBBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, inFlow, eventBasedGateway, outFlow,
				intermediateCatchEvent, useCase, processToUseCase, flow,
				inFlowToFlow, normalStep, ebgToNormalStep, lane, laneSet,
				ceFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
					useCase, processToUseCase, flow, inFlowToFlow, normalStep,
					ebgToNormalStep, lane, laneSet, ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			SequenceFlow ceFlow) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_2_4_binding = pattern_CatchEventAfterEBGToStepRule_2_4_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, eventBasedGateway,
				outFlow, intermediateCatchEvent, useCase, processToUseCase,
				flow, inFlowToFlow, normalStep, ebgToNormalStep, lane, laneSet,
				ceFlow);
		if (result_pattern_CatchEventAfterEBGToStepRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_2_4_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_2_4_black = pattern_CatchEventAfterEBGToStepRule_2_4_blackB(csp);
			if (result_pattern_CatchEventAfterEBGToStepRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, eventBasedGateway, outFlow,
						intermediateCatchEvent, useCase, processToUseCase,
						flow, inFlowToFlow, normalStep, ebgToNormalStep, lane,
						laneSet, ceFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_2_5_expressionFBB(
			CatchEventAfterEBGToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CatchEventAfterEBGToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CatchEventAfterEBGToStepRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_1_blackBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { _this, match, useCase, flow, normalStep, alt,
					alternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_2_bindingFBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase,
				flow, normalStep, alt, alternativeFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow, normalStep,
					alt, alternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_2_bindingAndBlackFBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_10_2_binding = pattern_CatchEventAfterEBGToStepRule_10_2_bindingFBBBBBBB(
				_this, match, useCase, flow, normalStep, alt, alternativeFlow);
		if (result_pattern_CatchEventAfterEBGToStepRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_10_2_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_10_2_black = pattern_CatchEventAfterEBGToStepRule_10_2_blackB(csp);
			if (result_pattern_CatchEventAfterEBGToStepRule_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow,
						normalStep, alt, alternativeFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_10_3_expressionFBB(
			CatchEventAfterEBGToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_4_blackBBBBBB(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlowAlternative alt, AlternativeFlow alternativeFlow) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { match, useCase, flow, normalStep, alt,
					alternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_4_greenBBBBBFFF(
			Match match, UseCase useCase, NormalStep normalStep,
			AlternativeFlowAlternative alt, AlternativeFlow alternativeFlow) {
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(alt);
		match.getToBeTranslatedNodes().add(alternativeFlow);
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__alternativeFlow____ref_name_prime = "ref";
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		match.getToBeTranslatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		match.getToBeTranslatedEdges().add(normalStep__alt____stepAlternative);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		match.getToBeTranslatedEdges().add(alt__alternativeFlow____ref);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		return new Object[] { match, useCase, normalStep, alt, alternativeFlow,
				useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative, alt__alternativeFlow____ref };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_5_blackBBBBBB(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlowAlternative alt, AlternativeFlow alternativeFlow) {
		if (!alternativeFlow.equals(flow)) {
			return new Object[] { match, useCase, flow, normalStep, alt,
					alternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_10_5_greenBBBBFF(
			Match match, UseCase useCase, Flow flow, NormalStep normalStep) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(normalStep);
		String useCase__flow____flows_name_prime = "flows";
		String flow__normalStep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__normalStep____steps.setSrc(flow);
		flow__normalStep____steps.setTrg(normalStep);
		match.getContextEdges().add(flow__normalStep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		return new Object[] { match, useCase, flow, normalStep,
				useCase__flow____flows, flow__normalStep____steps };
	}

	public static final void pattern_CatchEventAfterEBGToStepRule_10_6_expressionBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		_this.registerObjectsToMatch_BWD(match, useCase, flow, normalStep, alt,
				alternativeFlow);

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("eventBasedGateway");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("ebgToNormalStep");
		EObject _localVariable_9 = isApplicableMatch.getObject("alt");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("alternativeFlow");
		EObject _localVariable_11 = isApplicableMatch.getObject("lane");
		EObject _localVariable_12 = isApplicableMatch.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEventBasedGateway = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpProcessToUseCase = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpInFlowToFlow = _localVariable_6;
		EObject tmpNormalStep = _localVariable_7;
		EObject tmpEbgToNormalStep = _localVariable_8;
		EObject tmpAlt = _localVariable_9;
		EObject tmpAlternativeFlow = _localVariable_10;
		EObject tmpLane = _localVariable_11;
		EObject tmpLaneSet = _localVariable_12;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEventBasedGateway instanceof EventBasedGateway) {
					EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpProcessToUseCase instanceof ProcessToUseCase) {
							ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
									SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
									if (tmpNormalStep instanceof NormalStep) {
										NormalStep normalStep = (NormalStep) tmpNormalStep;
										if (tmpEbgToNormalStep instanceof FlowNodeToStep) {
											FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) tmpEbgToNormalStep;
											if (tmpAlt instanceof AlternativeFlowAlternative) {
												AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
												if (tmpAlternativeFlow instanceof AlternativeFlow) {
													AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
													if (tmpLane instanceof Lane) {
														Lane lane = (Lane) tmpLane;
														if (tmpLaneSet instanceof LaneSet) {
															LaneSet laneSet = (LaneSet) tmpLaneSet;
															return new Object[] {
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_1_blackBBBBBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet,
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!alternativeFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, inFlow, eventBasedGateway,
							useCase, processToUseCase, flow, inFlowToFlow,
							normalStep, ebgToNormalStep, alt, alternativeFlow,
							lane, laneSet, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_11_1_binding = pattern_CatchEventAfterEBGToStepRule_11_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_CatchEventAfterEBGToStepRule_11_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[1];
			EventBasedGateway eventBasedGateway = (EventBasedGateway) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[3];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[4];
			Flow flow = (Flow) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[6];
			NormalStep normalStep = (NormalStep) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[7];
			FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[8];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[9];
			AlternativeFlow alternativeFlow = (AlternativeFlow) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[10];
			Lane lane = (Lane) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[11];
			LaneSet laneSet = (LaneSet) result_pattern_CatchEventAfterEBGToStepRule_11_1_binding[12];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_11_1_black = pattern_CatchEventAfterEBGToStepRule_11_1_blackBBBBBBBBBBBBBFBB(
					process, inFlow, eventBasedGateway, useCase,
					processToUseCase, flow, inFlowToFlow, normalStep,
					ebgToNormalStep, alt, alternativeFlow, lane, laneSet,
					_this, isApplicableMatch);
			if (result_pattern_CatchEventAfterEBGToStepRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_11_1_black[13];

				return new Object[] { process, inFlow, eventBasedGateway,
						useCase, processToUseCase, flow, inFlowToFlow,
						normalStep, ebgToNormalStep, alt, alternativeFlow,
						lane, laneSet, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_1_greenBBFFBFBFBFFB(
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			AlternativeFlowAlternative alt, AlternativeFlow alternativeFlow,
			Lane lane, CSP csp) {
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		IntermediateCatchEvent intermediateCatchEvent = Bpmn2Factory.eINSTANCE
				.createIntermediateCatchEvent();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		ICEToAltFlow iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createICEToAltFlow();
		SequenceFlow ceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("intermediateCatchEvent", "id");
		Object _localVariable_1 = csp
				.getValue("intermediateCatchEvent", "name");
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(eventBasedGateway);
		process.getFlowElements().add(intermediateCatchEvent);
		outFlow.setTargetRef(intermediateCatchEvent);
		lane.getFlowNodeRefs().add(intermediateCatchEvent);
		outFlowToAlt.setSource(outFlow);
		outFlowToAlt.setTarget(alt);
		iceToAltFlow.setSource(intermediateCatchEvent);
		iceToAltFlow.setTarget(alternativeFlow);
		process.getFlowElements().add(ceFlow);
		ceFlow.setSourceRef(intermediateCatchEvent);
		ceFlowToAlternativeFlow.setSource(ceFlow);
		ceFlowToAlternativeFlow.setTarget(alternativeFlow);
		String intermediateCatchEvent_id_prime = (String) _localVariable_0;
		String intermediateCatchEvent_name_prime = (String) _localVariable_1;
		intermediateCatchEvent.setId(intermediateCatchEvent_id_prime);
		intermediateCatchEvent.setName(intermediateCatchEvent_name_prime);
		return new Object[] { process, eventBasedGateway, outFlow,
				intermediateCatchEvent, alt, outFlowToAlt, alternativeFlow,
				iceToAltFlow, lane, ceFlow, ceFlowToAlternativeFlow, csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_2_blackBBBBBBBB(
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			AlternativeFlow alternativeFlow, ICEToAltFlow iceToAltFlow,
			SequenceFlow ceFlow, SequenceFlowToUCFlow ceFlowToAlternativeFlow) {
		if (!ceFlow.equals(outFlow)) {
			return new Object[] { outFlow, intermediateCatchEvent, alt,
					outFlowToAlt, alternativeFlow, iceToAltFlow, ceFlow,
					ceFlowToAlternativeFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_2_greenFBBBBBBBB(
			SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent,
			AlternativeFlowAlternative alt, SeqFlowToAltFlowAlt outFlowToAlt,
			AlternativeFlow alternativeFlow, ICEToAltFlow iceToAltFlow,
			SequenceFlow ceFlow, SequenceFlowToUCFlow ceFlowToAlternativeFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(outFlow);
		ruleresult.getCreatedElements().add(intermediateCatchEvent);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(outFlowToAlt);
		ruleresult.getTranslatedElements().add(alternativeFlow);
		ruleresult.getCreatedLinkElements().add(iceToAltFlow);
		ruleresult.getCreatedElements().add(ceFlow);
		ruleresult.getCreatedLinkElements().add(ceFlowToAlternativeFlow);
		return new Object[] { ruleresult, outFlow, intermediateCatchEvent, alt,
				outFlowToAlt, alternativeFlow, iceToAltFlow, ceFlow,
				ceFlowToAlternativeFlow };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_3_blackBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject eventBasedGateway, EObject outFlow,
			EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(outFlow)) {
						if (!inFlow.equals(intermediateCatchEvent)) {
							if (!inFlow.equals(useCase)) {
								if (!inFlow.equals(processToUseCase)) {
									if (!inFlow.equals(inFlowToFlow)) {
										if (!inFlow.equals(normalStep)) {
											if (!inFlow.equals(outFlowToAlt)) {
												if (!inFlow.equals(lane)) {
													if (!inFlow.equals(laneSet)) {
														if (!eventBasedGateway
																.equals(process)) {
															if (!eventBasedGateway
																	.equals(inFlow)) {
																if (!eventBasedGateway
																		.equals(outFlow)) {
																	if (!eventBasedGateway
																			.equals(intermediateCatchEvent)) {
																		if (!eventBasedGateway
																				.equals(useCase)) {
																			if (!eventBasedGateway
																					.equals(processToUseCase)) {
																				if (!eventBasedGateway
																						.equals(flow)) {
																					if (!eventBasedGateway
																							.equals(inFlowToFlow)) {
																						if (!eventBasedGateway
																								.equals(normalStep)) {
																							if (!eventBasedGateway
																									.equals(outFlowToAlt)) {
																								if (!eventBasedGateway
																										.equals(iceToAltFlow)) {
																									if (!eventBasedGateway
																											.equals(lane)) {
																										if (!eventBasedGateway
																												.equals(laneSet)) {
																											if (!outFlow
																													.equals(process)) {
																												if (!outFlow
																														.equals(useCase)) {
																													if (!outFlow
																															.equals(processToUseCase)) {
																														if (!outFlow
																																.equals(outFlowToAlt)) {
																															if (!intermediateCatchEvent
																																	.equals(process)) {
																																if (!intermediateCatchEvent
																																		.equals(outFlow)) {
																																	if (!intermediateCatchEvent
																																			.equals(useCase)) {
																																		if (!intermediateCatchEvent
																																				.equals(processToUseCase)) {
																																			if (!intermediateCatchEvent
																																					.equals(normalStep)) {
																																				if (!intermediateCatchEvent
																																						.equals(outFlowToAlt)) {
																																					if (!intermediateCatchEvent
																																							.equals(lane)) {
																																						if (!intermediateCatchEvent
																																								.equals(laneSet)) {
																																							if (!processToUseCase
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(process)) {
																																									if (!flow
																																											.equals(inFlow)) {
																																										if (!flow
																																												.equals(outFlow)) {
																																											if (!flow
																																													.equals(intermediateCatchEvent)) {
																																												if (!flow
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(processToUseCase)) {
																																														if (!flow
																																																.equals(inFlowToFlow)) {
																																															if (!flow
																																																	.equals(normalStep)) {
																																																if (!flow
																																																		.equals(outFlowToAlt)) {
																																																	if (!flow
																																																			.equals(iceToAltFlow)) {
																																																		if (!flow
																																																				.equals(lane)) {
																																																			if (!flow
																																																					.equals(laneSet)) {
																																																				if (!inFlowToFlow
																																																						.equals(process)) {
																																																					if (!inFlowToFlow
																																																							.equals(outFlow)) {
																																																						if (!inFlowToFlow
																																																								.equals(intermediateCatchEvent)) {
																																																							if (!inFlowToFlow
																																																									.equals(useCase)) {
																																																								if (!inFlowToFlow
																																																										.equals(processToUseCase)) {
																																																									if (!inFlowToFlow
																																																											.equals(normalStep)) {
																																																										if (!inFlowToFlow
																																																												.equals(outFlowToAlt)) {
																																																											if (!inFlowToFlow
																																																													.equals(lane)) {
																																																												if (!inFlowToFlow
																																																														.equals(laneSet)) {
																																																													if (!normalStep
																																																															.equals(process)) {
																																																														if (!normalStep
																																																																.equals(outFlow)) {
																																																															if (!normalStep
																																																																	.equals(useCase)) {
																																																																if (!normalStep
																																																																		.equals(processToUseCase)) {
																																																																	if (!normalStep
																																																																			.equals(outFlowToAlt)) {
																																																																		if (!ebgToNormalStep
																																																																				.equals(process)) {
																																																																			if (!ebgToNormalStep
																																																																					.equals(inFlow)) {
																																																																				if (!ebgToNormalStep
																																																																						.equals(eventBasedGateway)) {
																																																																					if (!ebgToNormalStep
																																																																							.equals(outFlow)) {
																																																																						if (!ebgToNormalStep
																																																																								.equals(intermediateCatchEvent)) {
																																																																							if (!ebgToNormalStep
																																																																									.equals(useCase)) {
																																																																								if (!ebgToNormalStep
																																																																										.equals(processToUseCase)) {
																																																																									if (!ebgToNormalStep
																																																																											.equals(flow)) {
																																																																										if (!ebgToNormalStep
																																																																												.equals(inFlowToFlow)) {
																																																																											if (!ebgToNormalStep
																																																																													.equals(normalStep)) {
																																																																												if (!ebgToNormalStep
																																																																														.equals(outFlowToAlt)) {
																																																																													if (!ebgToNormalStep
																																																																															.equals(iceToAltFlow)) {
																																																																														if (!ebgToNormalStep
																																																																																.equals(lane)) {
																																																																															if (!ebgToNormalStep
																																																																																	.equals(laneSet)) {
																																																																																if (!alt.equals(process)) {
																																																																																	if (!alt.equals(inFlow)) {
																																																																																		if (!alt.equals(eventBasedGateway)) {
																																																																																			if (!alt.equals(outFlow)) {
																																																																																				if (!alt.equals(intermediateCatchEvent)) {
																																																																																					if (!alt.equals(useCase)) {
																																																																																						if (!alt.equals(processToUseCase)) {
																																																																																							if (!alt.equals(flow)) {
																																																																																								if (!alt.equals(inFlowToFlow)) {
																																																																																									if (!alt.equals(normalStep)) {
																																																																																										if (!alt.equals(ebgToNormalStep)) {
																																																																																											if (!alt.equals(outFlowToAlt)) {
																																																																																												if (!alt.equals(alternativeFlow)) {
																																																																																													if (!alt.equals(iceToAltFlow)) {
																																																																																														if (!alt.equals(lane)) {
																																																																																															if (!alt.equals(laneSet)) {
																																																																																																if (!alt.equals(ceFlow)) {
																																																																																																	if (!alt.equals(ceFlowToAlternativeFlow)) {
																																																																																																		if (!outFlowToAlt
																																																																																																				.equals(process)) {
																																																																																																			if (!outFlowToAlt
																																																																																																					.equals(useCase)) {
																																																																																																				if (!outFlowToAlt
																																																																																																						.equals(processToUseCase)) {
																																																																																																					if (!alternativeFlow
																																																																																																							.equals(process)) {
																																																																																																						if (!alternativeFlow
																																																																																																								.equals(inFlow)) {
																																																																																																							if (!alternativeFlow
																																																																																																									.equals(eventBasedGateway)) {
																																																																																																								if (!alternativeFlow
																																																																																																										.equals(outFlow)) {
																																																																																																									if (!alternativeFlow
																																																																																																											.equals(intermediateCatchEvent)) {
																																																																																																										if (!alternativeFlow
																																																																																																												.equals(useCase)) {
																																																																																																											if (!alternativeFlow
																																																																																																													.equals(processToUseCase)) {
																																																																																																												if (!alternativeFlow
																																																																																																														.equals(flow)) {
																																																																																																													if (!alternativeFlow
																																																																																																															.equals(inFlowToFlow)) {
																																																																																																														if (!alternativeFlow
																																																																																																																.equals(normalStep)) {
																																																																																																															if (!alternativeFlow
																																																																																																																	.equals(ebgToNormalStep)) {
																																																																																																																if (!alternativeFlow
																																																																																																																		.equals(outFlowToAlt)) {
																																																																																																																	if (!alternativeFlow
																																																																																																																			.equals(iceToAltFlow)) {
																																																																																																																		if (!alternativeFlow
																																																																																																																				.equals(lane)) {
																																																																																																																			if (!alternativeFlow
																																																																																																																					.equals(laneSet)) {
																																																																																																																				if (!alternativeFlow
																																																																																																																						.equals(ceFlow)) {
																																																																																																																					if (!alternativeFlow
																																																																																																																							.equals(ceFlowToAlternativeFlow)) {
																																																																																																																						if (!iceToAltFlow
																																																																																																																								.equals(process)) {
																																																																																																																							if (!iceToAltFlow
																																																																																																																									.equals(inFlow)) {
																																																																																																																								if (!iceToAltFlow
																																																																																																																										.equals(outFlow)) {
																																																																																																																									if (!iceToAltFlow
																																																																																																																											.equals(intermediateCatchEvent)) {
																																																																																																																										if (!iceToAltFlow
																																																																																																																												.equals(useCase)) {
																																																																																																																											if (!iceToAltFlow
																																																																																																																													.equals(processToUseCase)) {
																																																																																																																												if (!iceToAltFlow
																																																																																																																														.equals(inFlowToFlow)) {
																																																																																																																													if (!iceToAltFlow
																																																																																																																															.equals(normalStep)) {
																																																																																																																														if (!iceToAltFlow
																																																																																																																																.equals(outFlowToAlt)) {
																																																																																																																															if (!iceToAltFlow
																																																																																																																																	.equals(lane)) {
																																																																																																																																if (!iceToAltFlow
																																																																																																																																		.equals(laneSet)) {
																																																																																																																																	if (!lane
																																																																																																																																			.equals(process)) {
																																																																																																																																		if (!lane
																																																																																																																																				.equals(outFlow)) {
																																																																																																																																			if (!lane
																																																																																																																																					.equals(useCase)) {
																																																																																																																																				if (!lane
																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																					if (!lane
																																																																																																																																							.equals(normalStep)) {
																																																																																																																																						if (!lane
																																																																																																																																								.equals(outFlowToAlt)) {
																																																																																																																																							if (!lane
																																																																																																																																									.equals(laneSet)) {
																																																																																																																																								if (!laneSet
																																																																																																																																										.equals(process)) {
																																																																																																																																									if (!laneSet
																																																																																																																																											.equals(outFlow)) {
																																																																																																																																										if (!laneSet
																																																																																																																																												.equals(useCase)) {
																																																																																																																																											if (!laneSet
																																																																																																																																													.equals(processToUseCase)) {
																																																																																																																																												if (!laneSet
																																																																																																																																														.equals(normalStep)) {
																																																																																																																																													if (!laneSet
																																																																																																																																															.equals(outFlowToAlt)) {
																																																																																																																																														if (!ceFlow
																																																																																																																																																.equals(process)) {
																																																																																																																																															if (!ceFlow
																																																																																																																																																	.equals(inFlow)) {
																																																																																																																																																if (!ceFlow
																																																																																																																																																		.equals(eventBasedGateway)) {
																																																																																																																																																	if (!ceFlow
																																																																																																																																																			.equals(outFlow)) {
																																																																																																																																																		if (!ceFlow
																																																																																																																																																				.equals(intermediateCatchEvent)) {
																																																																																																																																																			if (!ceFlow
																																																																																																																																																					.equals(useCase)) {
																																																																																																																																																				if (!ceFlow
																																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																																					if (!ceFlow
																																																																																																																																																							.equals(flow)) {
																																																																																																																																																						if (!ceFlow
																																																																																																																																																								.equals(inFlowToFlow)) {
																																																																																																																																																							if (!ceFlow
																																																																																																																																																									.equals(normalStep)) {
																																																																																																																																																								if (!ceFlow
																																																																																																																																																										.equals(ebgToNormalStep)) {
																																																																																																																																																									if (!ceFlow
																																																																																																																																																											.equals(outFlowToAlt)) {
																																																																																																																																																										if (!ceFlow
																																																																																																																																																												.equals(iceToAltFlow)) {
																																																																																																																																																											if (!ceFlow
																																																																																																																																																													.equals(lane)) {
																																																																																																																																																												if (!ceFlow
																																																																																																																																																														.equals(laneSet)) {
																																																																																																																																																													if (!ceFlow
																																																																																																																																																															.equals(ceFlowToAlternativeFlow)) {
																																																																																																																																																														if (!ceFlowToAlternativeFlow
																																																																																																																																																																.equals(process)) {
																																																																																																																																																															if (!ceFlowToAlternativeFlow
																																																																																																																																																																	.equals(inFlow)) {
																																																																																																																																																																if (!ceFlowToAlternativeFlow
																																																																																																																																																																		.equals(eventBasedGateway)) {
																																																																																																																																																																	if (!ceFlowToAlternativeFlow
																																																																																																																																																																			.equals(outFlow)) {
																																																																																																																																																																		if (!ceFlowToAlternativeFlow
																																																																																																																																																																				.equals(intermediateCatchEvent)) {
																																																																																																																																																																			if (!ceFlowToAlternativeFlow
																																																																																																																																																																					.equals(useCase)) {
																																																																																																																																																																				if (!ceFlowToAlternativeFlow
																																																																																																																																																																						.equals(processToUseCase)) {
																																																																																																																																																																					if (!ceFlowToAlternativeFlow
																																																																																																																																																																							.equals(flow)) {
																																																																																																																																																																						if (!ceFlowToAlternativeFlow
																																																																																																																																																																								.equals(inFlowToFlow)) {
																																																																																																																																																																							if (!ceFlowToAlternativeFlow
																																																																																																																																																																									.equals(normalStep)) {
																																																																																																																																																																								if (!ceFlowToAlternativeFlow
																																																																																																																																																																										.equals(ebgToNormalStep)) {
																																																																																																																																																																									if (!ceFlowToAlternativeFlow
																																																																																																																																																																											.equals(outFlowToAlt)) {
																																																																																																																																																																										if (!ceFlowToAlternativeFlow
																																																																																																																																																																												.equals(iceToAltFlow)) {
																																																																																																																																																																											if (!ceFlowToAlternativeFlow
																																																																																																																																																																													.equals(lane)) {
																																																																																																																																																																												if (!ceFlowToAlternativeFlow
																																																																																																																																																																														.equals(laneSet)) {
																																																																																																																																																																													return new Object[] {
																																																																																																																																																																															ruleresult,
																																																																																																																																																																															process,
																																																																																																																																																																															inFlow,
																																																																																																																																																																															eventBasedGateway,
																																																																																																																																																																															outFlow,
																																																																																																																																																																															intermediateCatchEvent,
																																																																																																																																																																															useCase,
																																																																																																																																																																															processToUseCase,
																																																																																																																																																																															flow,
																																																																																																																																																																															inFlowToFlow,
																																																																																																																																																																															normalStep,
																																																																																																																																																																															ebgToNormalStep,
																																																																																																																																																																															alt,
																																																																																																																																																																															outFlowToAlt,
																																																																																																																																																																															alternativeFlow,
																																																																																																																																																																															iceToAltFlow,
																																																																																																																																																																															lane,
																																																																																																																																																																															laneSet,
																																																																																																																																																																															ceFlow,
																																																																																																																																																																															ceFlowToAlternativeFlow };
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_11_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process,
			EObject eventBasedGateway, EObject outFlow,
			EObject intermediateCatchEvent, EObject useCase,
			EObject normalStep, EObject alt, EObject outFlowToAlt,
			EObject alternativeFlow, EObject iceToAltFlow, EObject lane,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		EMoflonEdge process__ceFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__intermediateCatchEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__eventBasedGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__intermediateCatchEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__outFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlow__intermediateCatchEvent____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge intermediateCatchEvent__ceFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToAltFlow__intermediateCatchEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToAltFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__intermediateCatchEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlowToAlternativeFlow__ceFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ceFlowToAlternativeFlow__alternativeFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CatchEventAfterEBGToStepRule";
		String process__ceFlow____flowElements_name_prime = "flowElements";
		String process__intermediateCatchEvent____flowElements_name_prime = "flowElements";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String outFlow__eventBasedGateway____sourceRef_name_prime = "sourceRef";
		String eventBasedGateway__outFlow____outgoing_name_prime = "outgoing";
		String outFlow__intermediateCatchEvent____targetRef_name_prime = "targetRef";
		String intermediateCatchEvent__outFlow____incoming_name_prime = "incoming";
		String ceFlow__intermediateCatchEvent____sourceRef_name_prime = "sourceRef";
		String intermediateCatchEvent__ceFlow____outgoing_name_prime = "outgoing";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String outFlowToAlt__outFlow____source_name_prime = "source";
		String outFlowToAlt__alt____target_name_prime = "target";
		String iceToAltFlow__intermediateCatchEvent____source_name_prime = "source";
		String iceToAltFlow__alternativeFlow____target_name_prime = "target";
		String lane__intermediateCatchEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String ceFlowToAlternativeFlow__ceFlow____source_name_prime = "source";
		String ceFlowToAlternativeFlow__alternativeFlow____target_name_prime = "target";
		process__ceFlow____flowElements.setSrc(process);
		process__ceFlow____flowElements.setTrg(ceFlow);
		ruleresult.getCreatedEdges().add(process__ceFlow____flowElements);
		process__intermediateCatchEvent____flowElements.setSrc(process);
		process__intermediateCatchEvent____flowElements
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				process__intermediateCatchEvent____flowElements);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(process__outFlow____flowElements);
		outFlow__eventBasedGateway____sourceRef.setSrc(outFlow);
		outFlow__eventBasedGateway____sourceRef.setTrg(eventBasedGateway);
		ruleresult.getCreatedEdges().add(
				outFlow__eventBasedGateway____sourceRef);
		eventBasedGateway__outFlow____outgoing.setSrc(eventBasedGateway);
		eventBasedGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(eventBasedGateway__outFlow____outgoing);
		outFlow__intermediateCatchEvent____targetRef.setSrc(outFlow);
		outFlow__intermediateCatchEvent____targetRef
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				outFlow__intermediateCatchEvent____targetRef);
		intermediateCatchEvent__outFlow____incoming
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__outFlow____incoming.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(
				intermediateCatchEvent__outFlow____incoming);
		ceFlow__intermediateCatchEvent____sourceRef.setSrc(ceFlow);
		ceFlow__intermediateCatchEvent____sourceRef
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				ceFlow__intermediateCatchEvent____sourceRef);
		intermediateCatchEvent__ceFlow____outgoing
				.setSrc(intermediateCatchEvent);
		intermediateCatchEvent__ceFlow____outgoing.setTrg(ceFlow);
		ruleresult.getCreatedEdges().add(
				intermediateCatchEvent__ceFlow____outgoing);
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		ruleresult.getTranslatedEdges().add(useCase__alternativeFlow____flows);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		ruleresult.getTranslatedEdges().add(normalStep__alt____stepAlternative);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		ruleresult.getTranslatedEdges().add(alt__alternativeFlow____ref);
		outFlowToAlt__outFlow____source.setSrc(outFlowToAlt);
		outFlowToAlt__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToAlt__outFlow____source);
		outFlowToAlt__alt____target.setSrc(outFlowToAlt);
		outFlowToAlt__alt____target.setTrg(alt);
		ruleresult.getCreatedEdges().add(outFlowToAlt__alt____target);
		iceToAltFlow__intermediateCatchEvent____source.setSrc(iceToAltFlow);
		iceToAltFlow__intermediateCatchEvent____source
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				iceToAltFlow__intermediateCatchEvent____source);
		iceToAltFlow__alternativeFlow____target.setSrc(iceToAltFlow);
		iceToAltFlow__alternativeFlow____target.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				iceToAltFlow__alternativeFlow____target);
		lane__intermediateCatchEvent____flowNodeRefs.setSrc(lane);
		lane__intermediateCatchEvent____flowNodeRefs
				.setTrg(intermediateCatchEvent);
		ruleresult.getCreatedEdges().add(
				lane__intermediateCatchEvent____flowNodeRefs);
		ceFlowToAlternativeFlow__ceFlow____source
				.setSrc(ceFlowToAlternativeFlow);
		ceFlowToAlternativeFlow__ceFlow____source.setTrg(ceFlow);
		ruleresult.getCreatedEdges().add(
				ceFlowToAlternativeFlow__ceFlow____source);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setSrc(ceFlowToAlternativeFlow);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setTrg(alternativeFlow);
		ruleresult.getCreatedEdges().add(
				ceFlowToAlternativeFlow__alternativeFlow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__ceFlow____flowElements
				.setName(process__ceFlow____flowElements_name_prime);
		process__intermediateCatchEvent____flowElements
				.setName(process__intermediateCatchEvent____flowElements_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		outFlow__eventBasedGateway____sourceRef
				.setName(outFlow__eventBasedGateway____sourceRef_name_prime);
		eventBasedGateway__outFlow____outgoing
				.setName(eventBasedGateway__outFlow____outgoing_name_prime);
		outFlow__intermediateCatchEvent____targetRef
				.setName(outFlow__intermediateCatchEvent____targetRef_name_prime);
		intermediateCatchEvent__outFlow____incoming
				.setName(intermediateCatchEvent__outFlow____incoming_name_prime);
		ceFlow__intermediateCatchEvent____sourceRef
				.setName(ceFlow__intermediateCatchEvent____sourceRef_name_prime);
		intermediateCatchEvent__ceFlow____outgoing
				.setName(intermediateCatchEvent__ceFlow____outgoing_name_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		outFlowToAlt__outFlow____source
				.setName(outFlowToAlt__outFlow____source_name_prime);
		outFlowToAlt__alt____target
				.setName(outFlowToAlt__alt____target_name_prime);
		iceToAltFlow__intermediateCatchEvent____source
				.setName(iceToAltFlow__intermediateCatchEvent____source_name_prime);
		iceToAltFlow__alternativeFlow____target
				.setName(iceToAltFlow__alternativeFlow____target_name_prime);
		lane__intermediateCatchEvent____flowNodeRefs
				.setName(lane__intermediateCatchEvent____flowNodeRefs_name_prime);
		ceFlowToAlternativeFlow__ceFlow____source
				.setName(ceFlowToAlternativeFlow__ceFlow____source_name_prime);
		ceFlowToAlternativeFlow__alternativeFlow____target
				.setName(ceFlowToAlternativeFlow__alternativeFlow____target_name_prime);
		return new Object[] { ruleresult, process, eventBasedGateway, outFlow,
				intermediateCatchEvent, useCase, normalStep, alt, outFlowToAlt,
				alternativeFlow, iceToAltFlow, lane, ceFlow,
				ceFlowToAlternativeFlow, process__ceFlow____flowElements,
				process__intermediateCatchEvent____flowElements,
				process__outFlow____flowElements,
				outFlow__eventBasedGateway____sourceRef,
				eventBasedGateway__outFlow____outgoing,
				outFlow__intermediateCatchEvent____targetRef,
				intermediateCatchEvent__outFlow____incoming,
				ceFlow__intermediateCatchEvent____sourceRef,
				intermediateCatchEvent__ceFlow____outgoing,
				useCase__alternativeFlow____flows,
				normalStep__alt____stepAlternative,
				alt__alternativeFlow____ref, outFlowToAlt__outFlow____source,
				outFlowToAlt__alt____target,
				iceToAltFlow__intermediateCatchEvent____source,
				iceToAltFlow__alternativeFlow____target,
				lane__intermediateCatchEvent____flowNodeRefs,
				ceFlowToAlternativeFlow__ceFlow____source,
				ceFlowToAlternativeFlow__alternativeFlow____target };
	}

	public static final void pattern_CatchEventAfterEBGToStepRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject eventBasedGateway,
			EObject outFlow, EObject intermediateCatchEvent, EObject useCase,
			EObject processToUseCase, EObject flow, EObject inFlowToFlow,
			EObject normalStep, EObject ebgToNormalStep, EObject alt,
			EObject outFlowToAlt, EObject alternativeFlow,
			EObject iceToAltFlow, EObject lane, EObject laneSet,
			EObject ceFlow, EObject ceFlowToAlternativeFlow) {
		_this.registerObjects_BWD(ruleresult, process, inFlow,
				eventBasedGateway, outFlow, intermediateCatchEvent, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, outFlowToAlt, alternativeFlow,
				iceToAltFlow, lane, laneSet, ceFlow, ceFlowToAlternativeFlow);

	}

	public static final PerformRuleResult pattern_CatchEventAfterEBGToStepRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_1_blackFBB(
			EClass eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_12_1_binding = pattern_CatchEventAfterEBGToStepRule_12_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_12_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_12_1_black = pattern_CatchEventAfterEBGToStepRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "CatchEventAfterEBGToStepRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("normalStep");
		EObject _localVariable_3 = match.getObject("alt");
		EObject _localVariable_4 = match.getObject("alternativeFlow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpNormalStep = _localVariable_2;
		EObject tmpAlt = _localVariable_3;
		EObject tmpAlternativeFlow = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpNormalStep instanceof NormalStep) {
					NormalStep normalStep = (NormalStep) tmpNormalStep;
					if (tmpAlt instanceof AlternativeFlowAlternative) {
						AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
						if (tmpAlternativeFlow instanceof AlternativeFlow) {
							AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
							return new Object[] { useCase, flow, normalStep,
									alt, alternativeFlow, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_12_2_blackFFFBFBFBFBBB(
			UseCase useCase, Flow flow, NormalStep normalStep,
			AlternativeFlowAlternative alt, AlternativeFlow alternativeFlow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!alternativeFlow.equals(flow)) {
			for (ProcessToUseCase processToUseCase : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(useCase, ProcessToUseCase.class,
							"target")) {
				bpmn2.Process process = processToUseCase.getSource();
				if (process != null) {
					for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									SequenceFlowToUCFlow.class, "target")) {
						SequenceFlow inFlow = inFlowToFlow.getSource();
						if (inFlow != null) {
							for (FlowNodeToStep ebgToNormalStep : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(normalStep,
											FlowNodeToStep.class, "target")) {
								FlowNode tmpEventBasedGateway = ebgToNormalStep
										.getSource();
								if (tmpEventBasedGateway instanceof EventBasedGateway) {
									EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
									_result.add(new Object[] { process, inFlow,
											eventBasedGateway, useCase,
											processToUseCase, flow,
											inFlowToFlow, normalStep,
											ebgToNormalStep, alt,
											alternativeFlow, match });
								}

							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_12_3_blackBBBBBBBBBBBFF(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!alternativeFlow.equals(flow)) {
			if (process.getFlowElements().contains(inFlow)) {
				if (process.getFlowElements().contains(eventBasedGateway)) {
					if (eventBasedGateway.equals(inFlow.getTargetRef())) {
						if (useCase.getFlows().contains(flow)) {
							if (useCase.getFlows().contains(alternativeFlow)) {
								if (process
										.equals(processToUseCase.getSource())) {
									if (useCase.equals(processToUseCase
											.getTarget())) {
										if (flow.getSteps()
												.contains(normalStep)) {
											if (inFlow.equals(inFlowToFlow
													.getSource())) {
												if (flow.equals(inFlowToFlow
														.getTarget())) {
													if (normalStep
															.getStepAlternative()
															.contains(alt)) {
														if (eventBasedGateway
																.equals(ebgToNormalStep
																		.getSource())) {
															if (normalStep
																	.equals(ebgToNormalStep
																			.getTarget())) {
																if (alternativeFlow
																		.equals(alt
																				.getRef())) {
																	for (LaneSet laneSet : process
																			.getLaneSets()) {
																		for (Lane lane : laneSet
																				.getLanes()) {
																			_result.add(new Object[] {
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
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventBasedGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__eventBasedGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventBasedGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__alternativeFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__eventBasedGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ebgToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__alternativeFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__eventBasedGateway____flowElements_name_prime = "flowElements";
		String inFlow__eventBasedGateway____targetRef_name_prime = "targetRef";
		String eventBasedGateway__inFlow____incoming_name_prime = "incoming";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__alternativeFlow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String flow__normalStep____steps_name_prime = "steps";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String ebgToNormalStep__eventBasedGateway____source_name_prime = "source";
		String ebgToNormalStep__normalStep____target_name_prime = "target";
		String alt__alternativeFlow____ref_name_prime = "ref";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(ebgToNormalStep);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__eventBasedGateway____flowElements.setSrc(process);
		process__eventBasedGateway____flowElements.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				process__eventBasedGateway____flowElements);
		inFlow__eventBasedGateway____targetRef.setSrc(inFlow);
		inFlow__eventBasedGateway____targetRef.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__eventBasedGateway____targetRef);
		eventBasedGateway__inFlow____incoming.setSrc(eventBasedGateway);
		eventBasedGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				eventBasedGateway__inFlow____incoming);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__alternativeFlow____flows.setSrc(useCase);
		useCase__alternativeFlow____flows.setTrg(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(
				useCase__alternativeFlow____flows);
		processToUseCase__process____source.setSrc(processToUseCase);
		processToUseCase__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__process____source);
		processToUseCase__useCase____target.setSrc(processToUseCase);
		processToUseCase__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				processToUseCase__useCase____target);
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
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				normalStep__alt____stepAlternative);
		ebgToNormalStep__eventBasedGateway____source.setSrc(ebgToNormalStep);
		ebgToNormalStep__eventBasedGateway____source.setTrg(eventBasedGateway);
		isApplicableMatch.getAllContextElements().add(
				ebgToNormalStep__eventBasedGateway____source);
		ebgToNormalStep__normalStep____target.setSrc(ebgToNormalStep);
		ebgToNormalStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				ebgToNormalStep__normalStep____target);
		alt__alternativeFlow____ref.setSrc(alt);
		alt__alternativeFlow____ref.setTrg(alternativeFlow);
		isApplicableMatch.getAllContextElements().add(
				alt__alternativeFlow____ref);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__eventBasedGateway____flowElements
				.setName(process__eventBasedGateway____flowElements_name_prime);
		inFlow__eventBasedGateway____targetRef
				.setName(inFlow__eventBasedGateway____targetRef_name_prime);
		eventBasedGateway__inFlow____incoming
				.setName(eventBasedGateway__inFlow____incoming_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__alternativeFlow____flows
				.setName(useCase__alternativeFlow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		flow__normalStep____steps.setName(flow__normalStep____steps_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		ebgToNormalStep__eventBasedGateway____source
				.setName(ebgToNormalStep__eventBasedGateway____source_name_prime);
		ebgToNormalStep__normalStep____target
				.setName(ebgToNormalStep__normalStep____target_name_prime);
		alt__alternativeFlow____ref
				.setName(alt__alternativeFlow____ref_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { process, inFlow, eventBasedGateway, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, alternativeFlow, lane, laneSet,
				isApplicableMatch, process__laneSet____laneSets,
				process__inFlow____flowElements,
				process__eventBasedGateway____flowElements,
				inFlow__eventBasedGateway____targetRef,
				eventBasedGateway__inFlow____incoming, useCase__flow____flows,
				useCase__alternativeFlow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target, flow__normalStep____steps,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				normalStep__alt____stepAlternative,
				ebgToNormalStep__eventBasedGateway____source,
				ebgToNormalStep__normalStep____target,
				alt__alternativeFlow____ref, laneSet__lane____lanes };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_4_bindingFBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			UseCase useCase, ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, process, inFlow, eventBasedGateway, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, alternativeFlow, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, eventBasedGateway, useCase, processToUseCase, flow,
					inFlowToFlow, normalStep, ebgToNormalStep, alt,
					alternativeFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			UseCase useCase, ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_12_4_binding = pattern_CatchEventAfterEBGToStepRule_12_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, eventBasedGateway,
				useCase, processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, alt, alternativeFlow, lane, laneSet);
		if (result_pattern_CatchEventAfterEBGToStepRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_12_4_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_12_4_black = pattern_CatchEventAfterEBGToStepRule_12_4_blackB(csp);
			if (result_pattern_CatchEventAfterEBGToStepRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, eventBasedGateway, useCase, processToUseCase,
						flow, inFlowToFlow, normalStep, ebgToNormalStep, alt,
						alternativeFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_12_5_expressionFBB(
			CatchEventAfterEBGToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CatchEventAfterEBGToStepRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CatchEventAfterEBGToStepRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_20_1_binding = pattern_CatchEventAfterEBGToStepRule_20_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_20_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_20_1_black = pattern_CatchEventAfterEBGToStepRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_111586 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_830683 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_20_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpCeFlow = _edge_flowElements.getTrg();
			if (tmpCeFlow instanceof SequenceFlow) {
				SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
				if (process.getFlowElements().contains(ceFlow)) {
					FlowNode tmpIntermediateCatchEvent = ceFlow.getSourceRef();
					if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
						if (process.getFlowElements().contains(
								intermediateCatchEvent)) {
							if (pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_1B(ceFlow) == null) {
								if (pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_3BB(
										ceFlow, intermediateCatchEvent) == null) {
									for (LaneSet laneSet : process
											.getLaneSets()) {
										for (FlowElement tmpInFlow : process
												.getFlowElements()) {
											if (tmpInFlow instanceof SequenceFlow) {
												SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
												if (!ceFlow.equals(inFlow)) {
													FlowNode tmpEventBasedGateway = inFlow
															.getTargetRef();
													if (tmpEventBasedGateway instanceof EventBasedGateway) {
														EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
														if (process
																.getFlowElements()
																.contains(
																		eventBasedGateway)) {
															if (pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_2BB(
																	inFlow,
																	intermediateCatchEvent) == null) {
																for (FlowElement tmpOutFlow : process
																		.getFlowElements()) {
																	if (tmpOutFlow instanceof SequenceFlow) {
																		SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																		if (!inFlow
																				.equals(outFlow)) {
																			if (!ceFlow
																					.equals(outFlow)) {
																				if (eventBasedGateway
																						.equals(outFlow
																								.getSourceRef())) {
																					if (intermediateCatchEvent
																							.equals(outFlow
																									.getTargetRef())) {
																						if (pattern_CatchEventAfterEBGToStepRule_20_2_black_nac_0B(outFlow) == null) {
																							for (Lane lane : laneSet
																									.getLanes()) {
																								if (lane.getFlowNodeRefs()
																										.contains(
																												intermediateCatchEvent)) {
																									_result.add(new Object[] {
																											process,
																											inFlow,
																											eventBasedGateway,
																											outFlow,
																											intermediateCatchEvent,
																											lane,
																											laneSet,
																											ceFlow,
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_20_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_20_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_21_1_binding = pattern_CatchEventAfterEBGToStepRule_21_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_21_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_21_1_black = pattern_CatchEventAfterEBGToStepRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_514665 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_735297 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_21_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpIntermediateCatchEvent = _edge_flowElements.getTrg();
			if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
				if (process.getFlowElements().contains(intermediateCatchEvent)) {
					for (LaneSet laneSet : process.getLaneSets()) {
						for (FlowElement tmpCeFlow : process.getFlowElements()) {
							if (tmpCeFlow instanceof SequenceFlow) {
								SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
								if (intermediateCatchEvent.equals(ceFlow
										.getSourceRef())) {
									if (pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_1B(ceFlow) == null) {
										if (pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_3BB(
												ceFlow, intermediateCatchEvent) == null) {
											for (FlowElement tmpInFlow : process
													.getFlowElements()) {
												if (tmpInFlow instanceof SequenceFlow) {
													SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
													if (!ceFlow.equals(inFlow)) {
														FlowNode tmpEventBasedGateway = inFlow
																.getTargetRef();
														if (tmpEventBasedGateway instanceof EventBasedGateway) {
															EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
															if (process
																	.getFlowElements()
																	.contains(
																			eventBasedGateway)) {
																if (pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_2BB(
																		inFlow,
																		intermediateCatchEvent) == null) {
																	for (FlowElement tmpOutFlow : process
																			.getFlowElements()) {
																		if (tmpOutFlow instanceof SequenceFlow) {
																			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																			if (!inFlow
																					.equals(outFlow)) {
																				if (!ceFlow
																						.equals(outFlow)) {
																					if (eventBasedGateway
																							.equals(outFlow
																									.getSourceRef())) {
																						if (intermediateCatchEvent
																								.equals(outFlow
																										.getTargetRef())) {
																							if (pattern_CatchEventAfterEBGToStepRule_21_2_black_nac_0B(outFlow) == null) {
																								for (Lane lane : laneSet
																										.getLanes()) {
																									if (lane.getFlowNodeRefs()
																											.contains(
																													intermediateCatchEvent)) {
																										_result.add(new Object[] {
																												process,
																												inFlow,
																												eventBasedGateway,
																												outFlow,
																												intermediateCatchEvent,
																												lane,
																												laneSet,
																												ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_21_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_21_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_22_1_binding = pattern_CatchEventAfterEBGToStepRule_22_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_22_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_22_1_black = pattern_CatchEventAfterEBGToStepRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_495247 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_447364 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_22_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpEventBasedGateway = outFlow.getSourceRef();
					if (tmpEventBasedGateway instanceof EventBasedGateway) {
						EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
						if (process.getFlowElements().contains(
								eventBasedGateway)) {
							FlowNode tmpIntermediateCatchEvent = outFlow
									.getTargetRef();
							if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
								IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
								if (process.getFlowElements().contains(
										intermediateCatchEvent)) {
									if (pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_0B(outFlow) == null) {
										for (LaneSet laneSet : process
												.getLaneSets()) {
											for (FlowElement tmpCeFlow : process
													.getFlowElements()) {
												if (tmpCeFlow instanceof SequenceFlow) {
													SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
													if (!ceFlow.equals(outFlow)) {
														if (intermediateCatchEvent
																.equals(ceFlow
																		.getSourceRef())) {
															if (pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_1B(ceFlow) == null) {
																if (pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_3BB(
																		ceFlow,
																		intermediateCatchEvent) == null) {
																	for (FlowElement tmpInFlow : process
																			.getFlowElements()) {
																		if (tmpInFlow instanceof SequenceFlow) {
																			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																			if (!inFlow
																					.equals(outFlow)) {
																				if (!ceFlow
																						.equals(inFlow)) {
																					if (eventBasedGateway
																							.equals(inFlow
																									.getTargetRef())) {
																						if (pattern_CatchEventAfterEBGToStepRule_22_2_black_nac_2BB(
																								inFlow,
																								intermediateCatchEvent) == null) {
																							for (Lane lane : laneSet
																									.getLanes()) {
																								if (lane.getFlowNodeRefs()
																										.contains(
																												intermediateCatchEvent)) {
																									_result.add(new Object[] {
																											process,
																											inFlow,
																											eventBasedGateway,
																											outFlow,
																											intermediateCatchEvent,
																											lane,
																											laneSet,
																											ceFlow,
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_22_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_22_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_23_1_binding = pattern_CatchEventAfterEBGToStepRule_23_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_23_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_23_1_black = pattern_CatchEventAfterEBGToStepRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_228864 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_386395 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_23_2_blackFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpEventBasedGateway = _edge_sourceRef.getTrg();
			if (tmpEventBasedGateway instanceof EventBasedGateway) {
				EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
				if (eventBasedGateway.equals(outFlow.getSourceRef())) {
					FlowNode tmpIntermediateCatchEvent = outFlow.getTargetRef();
					if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
						if (pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_0B(outFlow) == null) {
							for (SequenceFlow inFlow : eventBasedGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_2BB(
											inFlow, intermediateCatchEvent) == null) {
										for (SequenceFlow ceFlow : intermediateCatchEvent
												.getOutgoing()) {
											if (!ceFlow.equals(inFlow)) {
												if (!ceFlow.equals(outFlow)) {
													if (pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_1B(ceFlow) == null) {
														if (pattern_CatchEventAfterEBGToStepRule_23_2_black_nac_3BB(
																ceFlow,
																intermediateCatchEvent) == null) {
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
																					ceFlow)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							intermediateCatchEvent)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								eventBasedGateway)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_23_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_23_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_24_1_binding = pattern_CatchEventAfterEBGToStepRule_24_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_24_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_24_1_black = pattern_CatchEventAfterEBGToStepRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_491201 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_938710 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_24_2_blackFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEventBasedGateway = _edge_outgoing.getSrc();
		if (tmpEventBasedGateway instanceof EventBasedGateway) {
			EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (eventBasedGateway.equals(outFlow.getSourceRef())) {
					FlowNode tmpIntermediateCatchEvent = outFlow.getTargetRef();
					if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
						if (pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_0B(outFlow) == null) {
							for (SequenceFlow inFlow : eventBasedGateway
									.getIncoming()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_2BB(
											inFlow, intermediateCatchEvent) == null) {
										for (SequenceFlow ceFlow : intermediateCatchEvent
												.getOutgoing()) {
											if (!ceFlow.equals(inFlow)) {
												if (!ceFlow.equals(outFlow)) {
													if (pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_1B(ceFlow) == null) {
														if (pattern_CatchEventAfterEBGToStepRule_24_2_black_nac_3BB(
																ceFlow,
																intermediateCatchEvent) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			eventBasedGateway,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					ceFlow)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							intermediateCatchEvent)) {
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
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_24_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_24_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_25_1_binding = pattern_CatchEventAfterEBGToStepRule_25_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_25_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_25_1_black = pattern_CatchEventAfterEBGToStepRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_6745 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_480356 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_25_2_blackFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_targetRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpIntermediateCatchEvent = _edge_targetRef.getTrg();
			if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
				if (intermediateCatchEvent.equals(outFlow.getTargetRef())) {
					FlowNode tmpEventBasedGateway = outFlow.getSourceRef();
					if (tmpEventBasedGateway instanceof EventBasedGateway) {
						EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
						if (pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_0B(outFlow) == null) {
							for (SequenceFlow ceFlow : intermediateCatchEvent
									.getOutgoing()) {
								if (!ceFlow.equals(outFlow)) {
									if (pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_1B(ceFlow) == null) {
										if (pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_3BB(
												ceFlow, intermediateCatchEvent) == null) {
											for (SequenceFlow inFlow : eventBasedGateway
													.getIncoming()) {
												if (!inFlow.equals(outFlow)) {
													if (!ceFlow.equals(inFlow)) {
														if (pattern_CatchEventAfterEBGToStepRule_25_2_black_nac_2BB(
																inFlow,
																intermediateCatchEvent) == null) {
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
																					ceFlow)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							intermediateCatchEvent)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								eventBasedGateway)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_25_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_25_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_26_1_binding = pattern_CatchEventAfterEBGToStepRule_26_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_26_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_26_1_black = pattern_CatchEventAfterEBGToStepRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_183580 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_516996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_26_2_blackFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpIntermediateCatchEvent = _edge_incoming.getSrc();
		if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
			EObject tmpOutFlow = _edge_incoming.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (intermediateCatchEvent.equals(outFlow.getTargetRef())) {
					FlowNode tmpEventBasedGateway = outFlow.getSourceRef();
					if (tmpEventBasedGateway instanceof EventBasedGateway) {
						EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
						if (pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_0B(outFlow) == null) {
							for (SequenceFlow ceFlow : intermediateCatchEvent
									.getOutgoing()) {
								if (!ceFlow.equals(outFlow)) {
									if (pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_1B(ceFlow) == null) {
										if (pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_3BB(
												ceFlow, intermediateCatchEvent) == null) {
											for (SequenceFlow inFlow : eventBasedGateway
													.getIncoming()) {
												if (!inFlow.equals(outFlow)) {
													if (!ceFlow.equals(inFlow)) {
														if (pattern_CatchEventAfterEBGToStepRule_26_2_black_nac_2BB(
																inFlow,
																intermediateCatchEvent) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			intermediateCatchEvent,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					ceFlow)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								eventBasedGateway)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_26_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_26_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_27_1_binding = pattern_CatchEventAfterEBGToStepRule_27_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_27_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_27_1_black = pattern_CatchEventAfterEBGToStepRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_542838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_401474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_27_2_blackFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCeFlow = _edge_sourceRef.getSrc();
		if (tmpCeFlow instanceof SequenceFlow) {
			SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
			EObject tmpIntermediateCatchEvent = _edge_sourceRef.getTrg();
			if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
				if (intermediateCatchEvent.equals(ceFlow.getSourceRef())) {
					if (pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_1B(ceFlow) == null) {
						if (pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_3BB(
								ceFlow, intermediateCatchEvent) == null) {
							for (SequenceFlow outFlow : intermediateCatchEvent
									.getIncoming()) {
								if (!ceFlow.equals(outFlow)) {
									FlowNode tmpEventBasedGateway = outFlow
											.getSourceRef();
									if (tmpEventBasedGateway instanceof EventBasedGateway) {
										EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
										if (pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_0B(outFlow) == null) {
											for (SequenceFlow inFlow : eventBasedGateway
													.getIncoming()) {
												if (!inFlow.equals(outFlow)) {
													if (!ceFlow.equals(inFlow)) {
														if (pattern_CatchEventAfterEBGToStepRule_27_2_black_nac_2BB(
																inFlow,
																intermediateCatchEvent) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			ceFlow,
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
																						intermediateCatchEvent)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								eventBasedGateway)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_27_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_27_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_28_1_binding = pattern_CatchEventAfterEBGToStepRule_28_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_28_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_28_1_black = pattern_CatchEventAfterEBGToStepRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_374041 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_86028 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_28_2_blackFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpIntermediateCatchEvent = _edge_outgoing.getSrc();
		if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
			EObject tmpCeFlow = _edge_outgoing.getTrg();
			if (tmpCeFlow instanceof SequenceFlow) {
				SequenceFlow ceFlow = (SequenceFlow) tmpCeFlow;
				if (intermediateCatchEvent.equals(ceFlow.getSourceRef())) {
					if (pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_1B(ceFlow) == null) {
						if (pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_3BB(
								ceFlow, intermediateCatchEvent) == null) {
							for (SequenceFlow outFlow : intermediateCatchEvent
									.getIncoming()) {
								if (!ceFlow.equals(outFlow)) {
									FlowNode tmpEventBasedGateway = outFlow
											.getSourceRef();
									if (tmpEventBasedGateway instanceof EventBasedGateway) {
										EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
										if (pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_0B(outFlow) == null) {
											for (SequenceFlow inFlow : eventBasedGateway
													.getIncoming()) {
												if (!inFlow.equals(outFlow)) {
													if (!ceFlow.equals(inFlow)) {
														if (pattern_CatchEventAfterEBGToStepRule_28_2_black_nac_2BB(
																inFlow,
																intermediateCatchEvent) == null) {
															for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			intermediateCatchEvent,
																			FlowElementsContainer.class,
																			"flowElements")) {
																if (tmpProcess instanceof bpmn2.Process) {
																	bpmn2.Process process = (bpmn2.Process) tmpProcess;
																	if (process
																			.getFlowElements()
																			.contains(
																					ceFlow)) {
																		if (process
																				.getFlowElements()
																				.contains(
																						inFlow)) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				if (process
																						.getFlowElements()
																						.contains(
																								eventBasedGateway)) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (Lane lane : laneSet
																								.getLanes()) {
																							if (lane.getFlowNodeRefs()
																									.contains(
																											intermediateCatchEvent)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_28_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_28_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_29_1_binding = pattern_CatchEventAfterEBGToStepRule_29_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_29_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_29_1_black = pattern_CatchEventAfterEBGToStepRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_29_2_blackFFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAlternativeFlow = _edge_flows.getTrg();
			if (tmpAlternativeFlow instanceof AlternativeFlow) {
				AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
				if (useCase.getFlows().contains(alternativeFlow)) {
					for (Flow flow : useCase.getFlows()) {
						if (!alternativeFlow.equals(flow)) {
							for (Step tmpNormalStep : flow.getSteps()) {
								if (tmpNormalStep instanceof NormalStep) {
									NormalStep normalStep = (NormalStep) tmpNormalStep;
									for (StepAlternative tmpAlt : normalStep
											.getStepAlternative()) {
										if (tmpAlt instanceof AlternativeFlowAlternative) {
											AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
											if (alternativeFlow.equals(alt
													.getRef())) {
												_result.add(new Object[] {
														useCase, flow,
														normalStep, alt,
														alternativeFlow,
														_edge_flows });
											}
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_29_3_expressionFBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alt, alternativeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_29_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_30_1_binding = pattern_CatchEventAfterEBGToStepRule_30_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_30_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_30_1_black = pattern_CatchEventAfterEBGToStepRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_30_2_blackFFFFFB(
			EMoflonEdge _edge_stepAlternative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNormalStep = _edge_stepAlternative.getSrc();
		if (tmpNormalStep instanceof NormalStep) {
			NormalStep normalStep = (NormalStep) tmpNormalStep;
			EObject tmpAlt = _edge_stepAlternative.getTrg();
			if (tmpAlt instanceof AlternativeFlowAlternative) {
				AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
				if (normalStep.getStepAlternative().contains(alt)) {
					NamedFlow tmpAlternativeFlow = alt.getRef();
					if (tmpAlternativeFlow instanceof AlternativeFlow) {
						AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(normalStep,
										Flow.class, "steps")) {
							if (!alternativeFlow.equals(flow)) {
								for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												alternativeFlow, UseCase.class,
												"flows")) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { useCase,
												flow, normalStep, alt,
												alternativeFlow,
												_edge_stepAlternative });
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_30_3_expressionFBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alt, alternativeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_30_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_31_1_binding = pattern_CatchEventAfterEBGToStepRule_31_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_31_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_31_1_black = pattern_CatchEventAfterEBGToStepRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_31_2_blackFFFFFB(
			EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof AlternativeFlowAlternative) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
			EObject tmpAlternativeFlow = _edge_ref.getTrg();
			if (tmpAlternativeFlow instanceof AlternativeFlow) {
				AlternativeFlow alternativeFlow = (AlternativeFlow) tmpAlternativeFlow;
				if (alternativeFlow.equals(alt.getRef())) {
					for (NormalStep normalStep : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(alt, NormalStep.class,
									"stepAlternative")) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(alternativeFlow,
										UseCase.class, "flows")) {
							for (Flow flow : useCase.getFlows()) {
								if (!alternativeFlow.equals(flow)) {
									if (flow.getSteps().contains(normalStep)) {
										_result.add(new Object[] { useCase,
												flow, normalStep, alt,
												alternativeFlow, _edge_ref });
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

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_31_3_expressionFBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match, UseCase useCase,
			Flow flow, NormalStep normalStep, AlternativeFlowAlternative alt,
			AlternativeFlow alternativeFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase,
				flow, normalStep, alt, alternativeFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_31_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_1_bindingFB(
			CatchEventAfterEBGToStepRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_1_blackFBB(
			EClass __eClass, CatchEventAfterEBGToStepRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_1_bindingAndBlackFFB(
			CatchEventAfterEBGToStepRule _this) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_32_1_binding = pattern_CatchEventAfterEBGToStepRule_32_1_bindingFB(_this);
		if (result_pattern_CatchEventAfterEBGToStepRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_CatchEventAfterEBGToStepRule_32_1_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_32_1_black = pattern_CatchEventAfterEBGToStepRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_CatchEventAfterEBGToStepRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CatchEventAfterEBGToStepRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_0B(
			SequenceFlow outFlow) {
		for (ExclusiveGateway __DEC_outFlow_default_86779 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { outFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_1B(
			SequenceFlow ceFlow) {
		for (ExclusiveGateway __DEC_ceFlow_default_795000 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ceFlow, ExclusiveGateway.class,
						"default")) {
			return new Object[] { ceFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_2BB(
			SequenceFlow inFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(inFlow.getTargetRef())) {
			return new Object[] { inFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_3BB(
			SequenceFlow ceFlow, IntermediateCatchEvent intermediateCatchEvent) {
		if (intermediateCatchEvent.equals(ceFlow.getTargetRef())) {
			return new Object[] { ceFlow, intermediateCatchEvent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_32_2_blackFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpIntermediateCatchEvent = _edge_flowNodeRefs.getTrg();
			if (tmpIntermediateCatchEvent instanceof IntermediateCatchEvent) {
				IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) tmpIntermediateCatchEvent;
				if (lane.getFlowNodeRefs().contains(intermediateCatchEvent)) {
					for (SequenceFlow outFlow : intermediateCatchEvent
							.getIncoming()) {
						FlowNode tmpEventBasedGateway = outFlow.getSourceRef();
						if (tmpEventBasedGateway instanceof EventBasedGateway) {
							EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
							if (pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_0B(outFlow) == null) {
								for (SequenceFlow ceFlow : intermediateCatchEvent
										.getOutgoing()) {
									if (!ceFlow.equals(outFlow)) {
										if (pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_1B(ceFlow) == null) {
											if (pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_3BB(
													ceFlow,
													intermediateCatchEvent) == null) {
												for (SequenceFlow inFlow : eventBasedGateway
														.getIncoming()) {
													if (!inFlow.equals(outFlow)) {
														if (!ceFlow
																.equals(inFlow)) {
															if (pattern_CatchEventAfterEBGToStepRule_32_2_black_nac_2BB(
																	inFlow,
																	intermediateCatchEvent) == null) {
																for (LaneSet laneSet : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				lane,
																				LaneSet.class,
																				"lanes")) {
																	for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					intermediateCatchEvent,
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
																								ceFlow)) {
																					if (process
																							.getFlowElements()
																							.contains(
																									inFlow)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										outFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											eventBasedGateway)) {
																								_result.add(new Object[] {
																										process,
																										inFlow,
																										eventBasedGateway,
																										outFlow,
																										intermediateCatchEvent,
																										lane,
																										laneSet,
																										ceFlow,
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

		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_32_3_expressionFBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this, Match match,
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, SequenceFlow outFlow,
			IntermediateCatchEvent intermediateCatchEvent, Lane lane,
			LaneSet laneSet, SequenceFlow ceFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, eventBasedGateway, outFlow, intermediateCatchEvent,
				lane, laneSet, ceFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_32_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_CatchEventAfterEBGToStepRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_1_blackB(
			CatchEventAfterEBGToStepRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			EventBasedGateway eventBasedGateway) {
		if (ruleResult.getSourceObjects().contains(eventBasedGateway)) {
			return new Object[] { ruleResult, eventBasedGateway };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, FlowNodeToStep ebgToNormalStep) {
		if (ruleResult.getCorrObjects().contains(ebgToNormalStep)) {
			return new Object[] { ruleResult, ebgToNormalStep };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, NormalStep normalStep) {
		if (ruleResult.getTargetObjects().contains(normalStep)) {
			return new Object[] { ruleResult, normalStep };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CatchEventAfterEBGToStepRule_35_2_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ebgToNormalStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpEbgToNormalStep : ebgToNormalStepList
					.getEntryObjects()) {
				if (tmpEbgToNormalStep instanceof FlowNodeToStep) {
					FlowNodeToStep ebgToNormalStep = (FlowNodeToStep) tmpEbgToNormalStep;
					FlowNode tmpEventBasedGateway = ebgToNormalStep.getSource();
					if (tmpEventBasedGateway instanceof EventBasedGateway) {
						EventBasedGateway eventBasedGateway = (EventBasedGateway) tmpEventBasedGateway;
						Step tmpNormalStep = ebgToNormalStep.getTarget();
						if (tmpNormalStep instanceof NormalStep) {
							NormalStep normalStep = (NormalStep) tmpNormalStep;
							if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_5BB(
									ruleResult, ebgToNormalStep) == null) {
								if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_4BB(
										ruleResult, eventBasedGateway) == null) {
									if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_6BB(
											ruleResult, normalStep) == null) {
										for (SequenceFlow inFlow : eventBasedGateway
												.getIncoming()) {
											if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_3BB(
													ruleResult, inFlow) == null) {
												for (FlowElementsContainer tmpProcess : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																eventBasedGateway,
																FlowElementsContainer.class,
																"flowElements")) {
													if (tmpProcess instanceof bpmn2.Process) {
														bpmn2.Process process = (bpmn2.Process) tmpProcess;
														if (process
																.getFlowElements()
																.contains(
																		inFlow)) {
															if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_0BB(
																	ruleResult,
																	process) == null) {
																for (LaneSet laneSet : process
																		.getLaneSets()) {
																	if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_1BB(
																			ruleResult,
																			laneSet) == null) {
																		for (Lane lane : laneSet
																				.getLanes()) {
																			if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_2BB(
																					ruleResult,
																					lane) == null) {
																				for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								normalStep,
																								Flow.class,
																								"steps")) {
																					if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_7BB(
																							ruleResult,
																							flow) == null) {
																						for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										inFlow,
																										SequenceFlowToUCFlow.class,
																										"source")) {
																							if (flow.equals(inFlowToFlow
																									.getTarget())) {
																								if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_10BB(
																										ruleResult,
																										inFlowToFlow) == null) {
																									for (ProcessToUseCase processToUseCase : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													process,
																													ProcessToUseCase.class,
																													"source")) {
																										UseCase useCase = processToUseCase
																												.getTarget();
																										if (useCase != null) {
																											if (useCase
																													.getFlows()
																													.contains(
																															flow)) {
																												if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_9BB(
																														ruleResult,
																														processToUseCase) == null) {
																													if (pattern_CatchEventAfterEBGToStepRule_35_2_black_nac_8BB(
																															ruleResult,
																															useCase) == null) {
																														_result.add(new Object[] {
																																ebgToNormalStepList,
																																process,
																																laneSet,
																																lane,
																																inFlow,
																																eventBasedGateway,
																																ebgToNormalStep,
																																normalStep,
																																flow,
																																useCase,
																																processToUseCase,
																																inFlowToFlow,
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
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_3_bindingFBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			UseCase useCase, ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, inFlow, eventBasedGateway, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, eventBasedGateway, useCase, processToUseCase, flow,
					inFlowToFlow, normalStep, ebgToNormalStep, lane, laneSet,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_3_bindingAndBlackFBBBBBBBBBBBBBB(
			CatchEventAfterEBGToStepRule _this,
			IsApplicableMatch isApplicableMatch, bpmn2.Process process,
			SequenceFlow inFlow, EventBasedGateway eventBasedGateway,
			UseCase useCase, ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_CatchEventAfterEBGToStepRule_35_3_binding = pattern_CatchEventAfterEBGToStepRule_35_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, eventBasedGateway,
				useCase, processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, lane, laneSet, ruleResult);
		if (result_pattern_CatchEventAfterEBGToStepRule_35_3_binding != null) {
			CSP csp = (CSP) result_pattern_CatchEventAfterEBGToStepRule_35_3_binding[0];

			Object[] result_pattern_CatchEventAfterEBGToStepRule_35_3_black = pattern_CatchEventAfterEBGToStepRule_35_3_blackB(csp);
			if (result_pattern_CatchEventAfterEBGToStepRule_35_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, eventBasedGateway, useCase, processToUseCase,
						flow, inFlowToFlow, normalStep, ebgToNormalStep, lane,
						laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_CatchEventAfterEBGToStepRule_35_4_expressionFBB(
			CatchEventAfterEBGToStepRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_5_blackBBBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet) {
		return new Object[] { process, inFlow, eventBasedGateway, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, lane, laneSet };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_6_blackBBBBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow,
			EventBasedGateway eventBasedGateway, UseCase useCase,
			ProcessToUseCase processToUseCase, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep normalStep,
			FlowNodeToStep ebgToNormalStep, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, inFlow, eventBasedGateway, useCase,
				processToUseCase, flow, inFlowToFlow, normalStep,
				ebgToNormalStep, lane, laneSet, ruleResult };
	}

	public static final Object[] pattern_CatchEventAfterEBGToStepRule_35_6_greenBBFFBBFFFFBFFBB(
			bpmn2.Process process, EventBasedGateway eventBasedGateway,
			UseCase useCase, NormalStep normalStep, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		IntermediateCatchEvent intermediateCatchEvent = Bpmn2Factory.eINSTANCE
				.createIntermediateCatchEvent();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		SeqFlowToAltFlowAlt outFlowToAlt = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSeqFlowToAltFlowAlt();
		AlternativeFlow alternativeFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		ICEToAltFlow iceToAltFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createICEToAltFlow();
		SequenceFlow ceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		SequenceFlowToUCFlow ceFlowToAlternativeFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		Object _localVariable_0 = csp.getValue("intermediateCatchEvent", "id");
		Object _localVariable_1 = csp
				.getValue("intermediateCatchEvent", "name");
		Object _localVariable_2 = csp.getValue("alt", "condition");
		Object _localVariable_3 = csp.getValue("alternativeFlow", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(eventBasedGateway);
		ruleResult.getSourceObjects().add(outFlow);
		process.getFlowElements().add(intermediateCatchEvent);
		outFlow.setTargetRef(intermediateCatchEvent);
		lane.getFlowNodeRefs().add(intermediateCatchEvent);
		ruleResult.getSourceObjects().add(intermediateCatchEvent);
		normalStep.getStepAlternative().add(alt);
		ruleResult.getTargetObjects().add(alt);
		outFlowToAlt.setSource(outFlow);
		outFlowToAlt.setTarget(alt);
		ruleResult.getCorrObjects().add(outFlowToAlt);
		useCase.getFlows().add(alternativeFlow);
		alt.setRef(alternativeFlow);
		ruleResult.getTargetObjects().add(alternativeFlow);
		iceToAltFlow.setSource(intermediateCatchEvent);
		iceToAltFlow.setTarget(alternativeFlow);
		ruleResult.getCorrObjects().add(iceToAltFlow);
		process.getFlowElements().add(ceFlow);
		ceFlow.setSourceRef(intermediateCatchEvent);
		ruleResult.getSourceObjects().add(ceFlow);
		ceFlowToAlternativeFlow.setSource(ceFlow);
		ceFlowToAlternativeFlow.setTarget(alternativeFlow);
		ruleResult.getCorrObjects().add(ceFlowToAlternativeFlow);
		String intermediateCatchEvent_id_prime = (String) _localVariable_0;
		String intermediateCatchEvent_name_prime = (String) _localVariable_1;
		String alt_condition_prime = (String) _localVariable_2;
		String alternativeFlow_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		intermediateCatchEvent.setId(intermediateCatchEvent_id_prime);
		intermediateCatchEvent.setName(intermediateCatchEvent_name_prime);
		alt.setCondition(alt_condition_prime);
		alternativeFlow.setName(alternativeFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, eventBasedGateway, outFlow,
				intermediateCatchEvent, useCase, normalStep, alt, outFlowToAlt,
				alternativeFlow, iceToAltFlow, lane, ceFlow,
				ceFlowToAlternativeFlow, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_CatchEventAfterEBGToStepRule_35_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CatchEventAfterEBGToStepRuleImpl
