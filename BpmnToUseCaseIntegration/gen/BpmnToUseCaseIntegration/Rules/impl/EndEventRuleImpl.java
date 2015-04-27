/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.EndEventRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

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
import UseCaseDSL.UseCase;

import bpmn2.Bpmn2Factory;
import bpmn2.EndEvent;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
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
 * An implementation of the model object '<em><b>End Event Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEventRuleImpl extends AbstractRuleImpl implements EndEventRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEventRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = EndEventRuleImpl
				.pattern_EndEventRule_0_1_blackBBBBBBB(this, match, process,
						inFlow, endEvent, lane, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_0_2_bindingAndBlackFBBBBBBB(this, match,
						process, inFlow, endEvent, lane, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEventRuleImpl.pattern_EndEventRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEventRuleImpl
					.pattern_EndEventRule_0_4_blackBBBBBB(match, process,
							inFlow, endEvent, lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			EndEventRuleImpl.pattern_EndEventRule_0_4_greenBBBBBFFFF(match,
					process, inFlow, endEvent, lane);
			// EMoflonEdge process__endEvent____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge inFlow__endEvent____targetRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge endEvent__inFlow____incoming = (EMoflonEdge) result4_green[7];
			// EMoflonEdge lane__endEvent____flowNodeRefs = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = EndEventRuleImpl
					.pattern_EndEventRule_0_5_blackBBBBBB(match, process,
							inFlow, endEvent, lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			EndEventRuleImpl.pattern_EndEventRule_0_5_greenBBBBBFFF(match,
					process, inFlow, lane, laneSet);
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[7];

			// register objects to match
			EndEventRuleImpl.pattern_EndEventRule_0_6_expressionBBBBBBB(this,
					match, process, inFlow, endEvent, lane, laneSet);
			return EndEventRuleImpl.pattern_EndEventRule_0_7_expressionF();
		} else {
			return EndEventRuleImpl.pattern_EndEventRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_1_1_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		EndEvent endEvent = (EndEvent) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[6];
		Lane lane = (Lane) result1_bindingAndBlack[7];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_1_1_greenBBF(endEvent, flow);
		EndEventToFlow endEventToFlow = (EndEventToFlow) result1_green[2];

		// collect translated elements
		Object[] result2_black = EndEventRuleImpl
				.pattern_EndEventRule_1_2_blackBB(endEvent, endEventToFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = EndEventRuleImpl
				.pattern_EndEventRule_1_2_greenFBB(endEvent, endEventToFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEventRuleImpl
				.pattern_EndEventRule_1_3_blackBBBBBBBBBBB(ruleresult, process,
						inFlow, endEvent, flow, inFlowToFlow, endEventToFlow,
						useCase, processToUseCase, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		EndEventRuleImpl.pattern_EndEventRule_1_3_greenBBBBBBBFFFFFF(
				ruleresult, process, inFlow, endEvent, flow, endEventToFlow,
				lane);
		// EMoflonEdge process__endEvent____flowElements = (EMoflonEdge) result3_green[7];
		// EMoflonEdge inFlow__endEvent____targetRef = (EMoflonEdge) result3_green[8];
		// EMoflonEdge endEvent__inFlow____incoming = (EMoflonEdge) result3_green[9];
		// EMoflonEdge endEventToFlow__endEvent____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge endEventToFlow__flow____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge lane__endEvent____flowNodeRefs = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EndEventRuleImpl.pattern_EndEventRule_1_5_expressionBBBBBBBBBBBB(this,
				ruleresult, process, inFlow, endEvent, flow, inFlowToFlow,
				endEventToFlow, useCase, processToUseCase, lane, laneSet);
		return EndEventRuleImpl
				.pattern_EndEventRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEventRuleImpl
				.pattern_EndEventRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		bpmn2.Process process = (bpmn2.Process) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		EndEvent endEvent = (EndEvent) result2_binding[2];
		Lane lane = (Lane) result2_binding[3];
		LaneSet laneSet = (LaneSet) result2_binding[4];
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_2_2_blackBBBFFFFBBB(process, inFlow,
						endEvent, lane, laneSet, match)) {
			Flow flow = (Flow) result2_black[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : EndEventRuleImpl
					.pattern_EndEventRule_2_3_blackBBBBBBBBB(process, inFlow,
							endEvent, flow, inFlowToFlow, useCase,
							processToUseCase, lane, laneSet)) {
				Object[] result3_green = EndEventRuleImpl
						.pattern_EndEventRule_2_3_greenBBBBBBBBBFFFFFFFFFFFFF(
								process, inFlow, endEvent, flow, inFlowToFlow,
								useCase, processToUseCase, lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__endEvent____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlow__endEvent____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge endEvent__inFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[17];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge lane__endEvent____flowNodeRefs = (EMoflonEdge) result3_green[20];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEventRuleImpl
						.pattern_EndEventRule_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow,
								endEvent, flow, inFlowToFlow, useCase,
								processToUseCase, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEventRuleImpl.pattern_EndEventRule_2_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEventRuleImpl
							.pattern_EndEventRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("endEvent", endEvent);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {// Create CSP
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
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", true, csp);
		var_endEvent_name.setValue(endEvent.getName());
		var_endEvent_name.setType("String");
		Variable var_flow_finalState = CSPFactoryHelper.eINSTANCE
				.createVariable("flow.finalState", true, csp);
		var_flow_finalState.setValue(flow.getFinalState());
		var_flow_finalState.setType("String");

		// Create unbound variables

		// Create constraints
		SetCheckEqStr setCheckEqStr = new SetCheckEqStr();

		csp.getConstraints().add(setCheckEqStr);

		// Solve CSP
		setCheckEqStr.setRuleName("");
		setCheckEqStr.solve(var_endEvent_name, var_flow_finalState);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("endEvent", endEvent);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
			EObject process, EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject endEventToFlow, EObject useCase,
			EObject processToUseCase, EObject lane, EObject laneSet) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("endEvent", endEvent);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("endEventToFlow", endEventToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("endEvent").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getEndEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_10_2_blackFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_10_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_10_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_10_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_10_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_11_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_11_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_11_2_blackFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_11_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_11_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_11_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_11_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_11_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_11_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_31(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_12_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_12_2_blackFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_12_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_12_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_12_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_12_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_12_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_12_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_13_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_13_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_13_2_blackFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_13_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_13_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_13_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_13_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_13_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_13_6_expressionFB(__result);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowParameter) {
		// create result
		Object[] result1_black = EndEventRuleImpl
				.pattern_EndEventRule_15_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_15_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_15_2_blackFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList inFlowToFlowList = (RuleEntryList) result2_black[0];
			bpmn2.Process process = (bpmn2.Process) result2_black[1];
			LaneSet laneSet = (LaneSet) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			SequenceFlow inFlow = (SequenceFlow) result2_black[4];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			Flow flow = (Flow) result2_black[6];
			UseCase useCase = (UseCase) result2_black[7];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = EndEventRuleImpl
					.pattern_EndEventRule_15_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, process, inFlow, flow,
							inFlowToFlow, useCase, processToUseCase, lane,
							laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EndEventRuleImpl.pattern_EndEventRule_15_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = EndEventRuleImpl
						.pattern_EndEventRule_15_5_blackBBBBBBBB(process,
								inFlow, flow, inFlowToFlow, useCase,
								processToUseCase, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EndEventRuleImpl
							.pattern_EndEventRule_15_6_blackBBBBBBBBB(process,
									inFlow, flow, inFlowToFlow, useCase,
									processToUseCase, lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_15_6_greenBBFBFBBB(
							process, inFlow, flow, lane, ruleResult, csp);
					// EndEvent endEvent = (EndEvent) result6_green[2];
					// EndEventToFlow endEventToFlow = (EndEventToFlow) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_15_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_flow_finalState = CSPFactoryHelper.eINSTANCE
				.createVariable("flow.finalState", true, csp);
		var_flow_finalState.setValue(flow.getFinalState());
		var_flow_finalState.setType("String");

		// Create unbound variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", csp);
		var_endEvent_name.setType("String");

		// Create constraints
		SetCheckEqStr setCheckEqStr = new SetCheckEqStr();

		csp.getConstraints().add(setCheckEqStr);

		// Solve CSP
		setCheckEqStr.setRuleName("");
		setCheckEqStr.solve(var_endEvent_name, var_flow_finalState);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
		case RulesPackage.END_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
			return null;
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Lane) arguments.get(4),
					(LaneSet) arguments.get(5));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(EndEvent) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Lane) arguments.get(8), (LaneSet) arguments.get(9));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.END_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Flow) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(UseCase) arguments.get(5),
					(ProcessToUseCase) arguments.get(6),
					(Lane) arguments.get(7), (LaneSet) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.END_EVENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EndEventRule_0_1_blackBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		return new Object[] { _this, match, process, inFlow, endEvent, lane,
				laneSet };
	}

	public static final Object[] pattern_EndEventRule_0_2_bindingFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow, endEvent,
					lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_0_2_bindingAndBlackFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_EndEventRule_0_2_binding = pattern_EndEventRule_0_2_bindingFBBBBBBB(
				_this, match, process, inFlow, endEvent, lane, laneSet);
		if (result_pattern_EndEventRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_0_2_binding[0];

			Object[] result_pattern_EndEventRule_0_2_black = pattern_EndEventRule_0_2_blackB(csp);
			if (result_pattern_EndEventRule_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow,
						endEvent, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_0_3_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_0_4_blackBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EndEvent endEvent, Lane lane, LaneSet laneSet) {
		return new Object[] { match, process, inFlow, endEvent, lane, laneSet };
	}

	public static final Object[] pattern_EndEventRule_0_4_greenBBBBBFFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EndEvent endEvent, Lane lane) {
		EMoflonEdge process__endEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__endEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEvent__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__endEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(endEvent);
		String process__endEvent____flowElements_name_prime = "flowElements";
		String inFlow__endEvent____targetRef_name_prime = "targetRef";
		String endEvent__inFlow____incoming_name_prime = "incoming";
		String lane__endEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		process__endEvent____flowElements.setSrc(process);
		process__endEvent____flowElements.setTrg(endEvent);
		match.getToBeTranslatedEdges().add(process__endEvent____flowElements);
		inFlow__endEvent____targetRef.setSrc(inFlow);
		inFlow__endEvent____targetRef.setTrg(endEvent);
		match.getToBeTranslatedEdges().add(inFlow__endEvent____targetRef);
		endEvent__inFlow____incoming.setSrc(endEvent);
		endEvent__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(endEvent__inFlow____incoming);
		lane__endEvent____flowNodeRefs.setSrc(lane);
		lane__endEvent____flowNodeRefs.setTrg(endEvent);
		match.getToBeTranslatedEdges().add(lane__endEvent____flowNodeRefs);
		process__endEvent____flowElements
				.setName(process__endEvent____flowElements_name_prime);
		inFlow__endEvent____targetRef
				.setName(inFlow__endEvent____targetRef_name_prime);
		endEvent__inFlow____incoming
				.setName(endEvent__inFlow____incoming_name_prime);
		lane__endEvent____flowNodeRefs
				.setName(lane__endEvent____flowNodeRefs_name_prime);
		return new Object[] { match, process, inFlow, endEvent, lane,
				process__endEvent____flowElements,
				inFlow__endEvent____targetRef, endEvent__inFlow____incoming,
				lane__endEvent____flowNodeRefs };
	}

	public static final Object[] pattern_EndEventRule_0_5_blackBBBBBB(
			Match match, bpmn2.Process process, SequenceFlow inFlow,
			EndEvent endEvent, Lane lane, LaneSet laneSet) {
		return new Object[] { match, process, inFlow, endEvent, lane, laneSet };
	}

	public static final Object[] pattern_EndEventRule_0_5_greenBBBBBFFF(
			Match match, bpmn2.Process process, SequenceFlow inFlow, Lane lane,
			LaneSet laneSet) {
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
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
		return new Object[] { match, process, inFlow, lane, laneSet,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_EndEventRule_0_6_expressionBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow, endEvent,
				lane, laneSet);

	}

	public static final boolean pattern_EndEventRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEventRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("endEvent");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("lane");
		EObject _localVariable_8 = isApplicableMatch.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEndEvent = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpInFlowToFlow = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpProcessToUseCase = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEndEvent instanceof EndEvent) {
					EndEvent endEvent = (EndEvent) tmpEndEvent;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
							SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpProcessToUseCase instanceof ProcessToUseCase) {
									ProcessToUseCase processToUseCase = (ProcessToUseCase) tmpProcessToUseCase;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											return new Object[] { process,
													inFlow, endEvent, flow,
													inFlowToFlow, useCase,
													processToUseCase, lane,
													laneSet, isApplicableMatch };
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

	public static final Object[] pattern_EndEventRule_1_1_blackBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			EndEventRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, inFlow, endEvent, flow,
						inFlowToFlow, useCase, processToUseCase, lane, laneSet,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEventRule_1_1_binding = pattern_EndEventRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_EndEventRule_1_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_EndEventRule_1_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEventRule_1_1_binding[1];
			EndEvent endEvent = (EndEvent) result_pattern_EndEventRule_1_1_binding[2];
			Flow flow = (Flow) result_pattern_EndEventRule_1_1_binding[3];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_EndEventRule_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_EndEventRule_1_1_binding[5];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_EndEventRule_1_1_binding[6];
			Lane lane = (Lane) result_pattern_EndEventRule_1_1_binding[7];
			LaneSet laneSet = (LaneSet) result_pattern_EndEventRule_1_1_binding[8];

			Object[] result_pattern_EndEventRule_1_1_black = pattern_EndEventRule_1_1_blackBBBBBBBBBFBB(
					process, inFlow, endEvent, flow, inFlowToFlow, useCase,
					processToUseCase, lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_EndEventRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEventRule_1_1_black[9];

				return new Object[] { process, inFlow, endEvent, flow,
						inFlowToFlow, useCase, processToUseCase, lane, laneSet,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_1_1_greenBBF(
			EndEvent endEvent, Flow flow) {
		EndEventToFlow endEventToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createEndEventToFlow();
		endEventToFlow.setSource(endEvent);
		endEventToFlow.setTarget(flow);
		return new Object[] { endEvent, flow, endEventToFlow };
	}

	public static final Object[] pattern_EndEventRule_1_2_blackBB(
			EndEvent endEvent, EndEventToFlow endEventToFlow) {
		return new Object[] { endEvent, endEventToFlow };
	}

	public static final Object[] pattern_EndEventRule_1_2_greenFBB(
			EndEvent endEvent, EndEventToFlow endEventToFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(endEvent);
		ruleresult.getCreatedLinkElements().add(endEventToFlow);
		return new Object[] { ruleresult, endEvent, endEventToFlow };
	}

	public static final Object[] pattern_EndEventRule_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject inFlowToFlow,
			EObject endEventToFlow, EObject useCase, EObject processToUseCase,
			EObject lane, EObject laneSet) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(inFlowToFlow)) {
						if (!inFlow.equals(useCase)) {
							if (!inFlow.equals(processToUseCase)) {
								if (!inFlow.equals(lane)) {
									if (!inFlow.equals(laneSet)) {
										if (!endEvent.equals(process)) {
											if (!endEvent.equals(inFlow)) {
												if (!endEvent.equals(flow)) {
													if (!endEvent
															.equals(inFlowToFlow)) {
														if (!endEvent
																.equals(endEventToFlow)) {
															if (!endEvent
																	.equals(useCase)) {
																if (!endEvent
																		.equals(processToUseCase)) {
																	if (!endEvent
																			.equals(lane)) {
																		if (!endEvent
																				.equals(laneSet)) {
																			if (!flow
																					.equals(process)) {
																				if (!flow
																						.equals(inFlow)) {
																					if (!flow
																							.equals(inFlowToFlow)) {
																						if (!flow
																								.equals(useCase)) {
																							if (!flow
																									.equals(processToUseCase)) {
																								if (!flow
																										.equals(lane)) {
																									if (!flow
																											.equals(laneSet)) {
																										if (!inFlowToFlow
																												.equals(process)) {
																											if (!inFlowToFlow
																													.equals(useCase)) {
																												if (!inFlowToFlow
																														.equals(processToUseCase)) {
																													if (!inFlowToFlow
																															.equals(lane)) {
																														if (!inFlowToFlow
																																.equals(laneSet)) {
																															if (!endEventToFlow
																																	.equals(process)) {
																																if (!endEventToFlow
																																		.equals(inFlow)) {
																																	if (!endEventToFlow
																																			.equals(flow)) {
																																		if (!endEventToFlow
																																				.equals(inFlowToFlow)) {
																																			if (!endEventToFlow
																																					.equals(useCase)) {
																																				if (!endEventToFlow
																																						.equals(processToUseCase)) {
																																					if (!endEventToFlow
																																							.equals(lane)) {
																																						if (!endEventToFlow
																																								.equals(laneSet)) {
																																							if (!processToUseCase
																																									.equals(useCase)) {
																																								if (!lane
																																										.equals(process)) {
																																									if (!lane
																																											.equals(useCase)) {
																																										if (!lane
																																												.equals(processToUseCase)) {
																																											if (!lane
																																													.equals(laneSet)) {
																																												if (!laneSet
																																														.equals(process)) {
																																													if (!laneSet
																																															.equals(useCase)) {
																																														if (!laneSet
																																																.equals(processToUseCase)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	process,
																																																	inFlow,
																																																	endEvent,
																																																	flow,
																																																	inFlowToFlow,
																																																	endEventToFlow,
																																																	useCase,
																																																	processToUseCase,
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
		return null;
	}

	public static final Object[] pattern_EndEventRule_1_3_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject endEventToFlow, EObject lane) {
		EMoflonEdge process__endEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__endEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEvent__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToFlow__endEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__endEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEventRule";
		String process__endEvent____flowElements_name_prime = "flowElements";
		String inFlow__endEvent____targetRef_name_prime = "targetRef";
		String endEvent__inFlow____incoming_name_prime = "incoming";
		String endEventToFlow__endEvent____source_name_prime = "source";
		String endEventToFlow__flow____target_name_prime = "target";
		String lane__endEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		process__endEvent____flowElements.setSrc(process);
		process__endEvent____flowElements.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(process__endEvent____flowElements);
		inFlow__endEvent____targetRef.setSrc(inFlow);
		inFlow__endEvent____targetRef.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(inFlow__endEvent____targetRef);
		endEvent__inFlow____incoming.setSrc(endEvent);
		endEvent__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(endEvent__inFlow____incoming);
		endEventToFlow__endEvent____source.setSrc(endEventToFlow);
		endEventToFlow__endEvent____source.setTrg(endEvent);
		ruleresult.getCreatedEdges().add(endEventToFlow__endEvent____source);
		endEventToFlow__flow____target.setSrc(endEventToFlow);
		endEventToFlow__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(endEventToFlow__flow____target);
		lane__endEvent____flowNodeRefs.setSrc(lane);
		lane__endEvent____flowNodeRefs.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(lane__endEvent____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__endEvent____flowElements
				.setName(process__endEvent____flowElements_name_prime);
		inFlow__endEvent____targetRef
				.setName(inFlow__endEvent____targetRef_name_prime);
		endEvent__inFlow____incoming
				.setName(endEvent__inFlow____incoming_name_prime);
		endEventToFlow__endEvent____source
				.setName(endEventToFlow__endEvent____source_name_prime);
		endEventToFlow__flow____target
				.setName(endEventToFlow__flow____target_name_prime);
		lane__endEvent____flowNodeRefs
				.setName(lane__endEvent____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, process, inFlow, endEvent, flow,
				endEventToFlow, lane, process__endEvent____flowElements,
				inFlow__endEvent____targetRef, endEvent__inFlow____incoming,
				endEventToFlow__endEvent____source,
				endEventToFlow__flow____target, lane__endEvent____flowNodeRefs };
	}

	public static final void pattern_EndEventRule_1_5_expressionBBBBBBBBBBBB(
			EndEventRule _this, PerformRuleResult ruleresult, EObject process,
			EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject endEventToFlow, EObject useCase,
			EObject processToUseCase, EObject lane, EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, endEventToFlow, useCase, processToUseCase, lane,
				laneSet);

	}

	public static final PerformRuleResult pattern_EndEventRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_2_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_2_1_blackFBB(
			EClass eClass, EndEventRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_2_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_2_1_binding = pattern_EndEventRule_2_1_bindingFB(_this);
		if (result_pattern_EndEventRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEventRule_2_1_binding[0];

			Object[] result_pattern_EndEventRule_2_1_black = pattern_EndEventRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEventRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEventRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEventRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEventRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("endEvent");
		EObject _localVariable_3 = match.getObject("lane");
		EObject _localVariable_4 = match.getObject("laneSet");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEndEvent = _localVariable_2;
		EObject tmpLane = _localVariable_3;
		EObject tmpLaneSet = _localVariable_4;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEndEvent instanceof EndEvent) {
					EndEvent endEvent = (EndEvent) tmpEndEvent;
					if (tmpLane instanceof Lane) {
						Lane lane = (Lane) tmpLane;
						if (tmpLaneSet instanceof LaneSet) {
							LaneSet laneSet = (LaneSet) tmpLaneSet;
							return new Object[] { process, inFlow, endEvent,
									lane, laneSet, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_2_2_blackBBBFFFFBBB(
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Lane lane, LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SequenceFlowToUCFlow.class,
						"source")) {
			Flow flow = inFlowToFlow.getTarget();
			if (flow != null) {
				for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(process,
								ProcessToUseCase.class, "source")) {
					UseCase useCase = processToUseCase.getTarget();
					if (useCase != null) {
						_result.add(new Object[] { process, inFlow, endEvent,
								flow, inFlowToFlow, useCase, processToUseCase,
								lane, laneSet, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_2_3_blackBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getLaneSets().contains(laneSet)) {
			if (process.getFlowElements().contains(inFlow)) {
				if (process.getFlowElements().contains(endEvent)) {
					if (endEvent.equals(inFlow.getTargetRef())) {
						if (inFlow.equals(inFlowToFlow.getSource())) {
							if (flow.equals(inFlowToFlow.getTarget())) {
								if (useCase.getFlows().contains(flow)) {
									if (process.equals(processToUseCase
											.getSource())) {
										if (useCase.equals(processToUseCase
												.getTarget())) {
											if (lane.getFlowNodeRefs()
													.contains(endEvent)) {
												if (laneSet.getLanes()
														.contains(lane)) {
													_result.add(new Object[] {
															process, inFlow,
															endEvent, flow,
															inFlowToFlow,
															useCase,
															processToUseCase,
															lane, laneSet });
												}
											}
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

	public static final Object[] pattern_EndEventRule_2_3_greenBBBBBBBBBFFFFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__endEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__endEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEvent__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__process____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge processToUseCase__useCase____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__endEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__endEvent____flowElements_name_prime = "flowElements";
		String inFlow__endEvent____targetRef_name_prime = "targetRef";
		String endEvent__inFlow____incoming_name_prime = "incoming";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String lane__endEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(endEvent);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
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
		process__endEvent____flowElements.setSrc(process);
		process__endEvent____flowElements.setTrg(endEvent);
		isApplicableMatch.getAllContextElements().add(
				process__endEvent____flowElements);
		inFlow__endEvent____targetRef.setSrc(inFlow);
		inFlow__endEvent____targetRef.setTrg(endEvent);
		isApplicableMatch.getAllContextElements().add(
				inFlow__endEvent____targetRef);
		endEvent__inFlow____incoming.setSrc(endEvent);
		endEvent__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				endEvent__inFlow____incoming);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
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
		lane__endEvent____flowNodeRefs.setSrc(lane);
		lane__endEvent____flowNodeRefs.setTrg(endEvent);
		isApplicableMatch.getAllContextElements().add(
				lane__endEvent____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__endEvent____flowElements
				.setName(process__endEvent____flowElements_name_prime);
		inFlow__endEvent____targetRef
				.setName(inFlow__endEvent____targetRef_name_prime);
		endEvent__inFlow____incoming
				.setName(endEvent__inFlow____incoming_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		lane__endEvent____flowNodeRefs
				.setName(lane__endEvent____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { process, inFlow, endEvent, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, isApplicableMatch,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__endEvent____flowElements,
				inFlow__endEvent____targetRef, endEvent__inFlow____incoming,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				useCase__flow____flows, processToUseCase__process____source,
				processToUseCase__useCase____target,
				lane__endEvent____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_EndEventRule_2_4_bindingFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, process, inFlow, endEvent, flow,
				inFlowToFlow, useCase, processToUseCase, lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, endEvent, flow, inFlowToFlow, useCase,
					processToUseCase, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, EndEvent endEvent,
			Flow flow, SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_EndEventRule_2_4_binding = pattern_EndEventRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, endEvent, flow,
				inFlowToFlow, useCase, processToUseCase, lane, laneSet);
		if (result_pattern_EndEventRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_2_4_binding[0];

			Object[] result_pattern_EndEventRule_2_4_black = pattern_EndEventRule_2_4_blackB(csp);
			if (result_pattern_EndEventRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, endEvent, flow, inFlowToFlow, useCase,
						processToUseCase, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_2_5_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEventRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEventRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEventRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_10_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_10_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_10_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_10_1_binding = pattern_EndEventRule_10_1_bindingFB(_this);
		if (result_pattern_EndEventRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_10_1_binding[0];

			Object[] result_pattern_EndEventRule_10_1_black = pattern_EndEventRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_10_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpEndEvent = _edge_flowElements.getTrg();
			if (tmpEndEvent instanceof EndEvent) {
				EndEvent endEvent = (EndEvent) tmpEndEvent;
				if (process.getFlowElements().contains(endEvent)) {
					for (LaneSet laneSet : process.getLaneSets()) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (endEvent.equals(inFlow.getTargetRef())) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												endEvent)) {
											_result.add(new Object[] { process,
													inFlow, endEvent, lane,
													laneSet, _edge_flowElements });
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

	public static final Object[] pattern_EndEventRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_10_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_10_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_11_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_11_1_binding = pattern_EndEventRule_11_1_bindingFB(_this);
		if (result_pattern_EndEventRule_11_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_11_1_binding[0];

			Object[] result_pattern_EndEventRule_11_1_black = pattern_EndEventRule_11_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_11_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_11_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_11_2_blackFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEndEvent = _edge_targetRef.getTrg();
			if (tmpEndEvent instanceof EndEvent) {
				EndEvent endEvent = (EndEvent) tmpEndEvent;
				if (endEvent.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(inFlow,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(endEvent)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												endEvent)) {
											_result.add(new Object[] { process,
													inFlow, endEvent, lane,
													laneSet, _edge_targetRef });
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

	public static final Object[] pattern_EndEventRule_11_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_11_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_11_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_11_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_11_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_11_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_12_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_12_1_binding = pattern_EndEventRule_12_1_bindingFB(_this);
		if (result_pattern_EndEventRule_12_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_12_1_binding[0];

			Object[] result_pattern_EndEventRule_12_1_black = pattern_EndEventRule_12_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_12_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_12_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_12_2_blackFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEndEvent = _edge_incoming.getSrc();
		if (tmpEndEvent instanceof EndEvent) {
			EndEvent endEvent = (EndEvent) tmpEndEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (endEvent.equals(inFlow.getTargetRef())) {
					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(endEvent,
									FlowElementsContainer.class, "flowElements")) {
						if (tmpProcess instanceof bpmn2.Process) {
							bpmn2.Process process = (bpmn2.Process) tmpProcess;
							if (process.getFlowElements().contains(inFlow)) {
								for (LaneSet laneSet : process.getLaneSets()) {
									for (Lane lane : laneSet.getLanes()) {
										if (lane.getFlowNodeRefs().contains(
												endEvent)) {
											_result.add(new Object[] { process,
													inFlow, endEvent, lane,
													laneSet, _edge_incoming });
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

	public static final Object[] pattern_EndEventRule_12_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_12_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_12_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_12_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_12_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_12_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_13_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_13_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_13_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_13_1_binding = pattern_EndEventRule_13_1_bindingFB(_this);
		if (result_pattern_EndEventRule_13_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_13_1_binding[0];

			Object[] result_pattern_EndEventRule_13_1_black = pattern_EndEventRule_13_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_13_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_13_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_13_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_13_2_blackFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpEndEvent = _edge_flowNodeRefs.getTrg();
			if (tmpEndEvent instanceof EndEvent) {
				EndEvent endEvent = (EndEvent) tmpEndEvent;
				if (lane.getFlowNodeRefs().contains(endEvent)) {
					for (SequenceFlow inFlow : endEvent.getIncoming()) {
						for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(lane, LaneSet.class,
										"lanes")) {
							for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(endEvent,
											FlowElementsContainer.class,
											"flowElements")) {
								if (tmpProcess instanceof bpmn2.Process) {
									bpmn2.Process process = (bpmn2.Process) tmpProcess;
									if (process.getLaneSets().contains(laneSet)) {
										if (process.getFlowElements().contains(
												inFlow)) {
											_result.add(new Object[] { process,
													inFlow, endEvent, lane,
													laneSet, _edge_flowNodeRefs });
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

	public static final Object[] pattern_EndEventRule_13_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_13_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_13_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_13_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_13_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_13_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_15_1_blackB(
			EndEventRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEventRule_15_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_15_2_blackFFFFFFFFFBB(
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
							if (pattern_EndEventRule_15_2_black_nac_4BB(
									ruleResult, inFlowToFlow) == null) {
								if (pattern_EndEventRule_15_2_black_nac_3BB(
										ruleResult, inFlow) == null) {
									if (pattern_EndEventRule_15_2_black_nac_5BB(
											ruleResult, flow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_EndEventRule_15_2_black_nac_0BB(
														ruleResult, process) == null) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														if (pattern_EndEventRule_15_2_black_nac_1BB(
																ruleResult,
																laneSet) == null) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (pattern_EndEventRule_15_2_black_nac_2BB(
																		ruleResult,
																		lane) == null) {
																	for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					flow,
																					UseCase.class,
																					"flows")) {
																		if (pattern_EndEventRule_15_2_black_nac_6BB(
																				ruleResult,
																				useCase) == null) {
																			for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							process,
																							ProcessToUseCase.class,
																							"source")) {
																				if (useCase
																						.equals(processToUseCase
																								.getTarget())) {
																					if (pattern_EndEventRule_15_2_black_nac_7BB(
																							ruleResult,
																							processToUseCase) == null) {
																						_result.add(new Object[] {
																								inFlowToFlowList,
																								process,
																								laneSet,
																								lane,
																								inFlow,
																								inFlowToFlow,
																								flow,
																								useCase,
																								processToUseCase,
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
		return _result;
	}

	public static final Object[] pattern_EndEventRule_15_3_bindingFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, flow, inFlowToFlow, useCase, processToUseCase,
					lane, laneSet, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_15_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_15_3_bindingAndBlackFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EndEventRule_15_3_binding = pattern_EndEventRule_15_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, ruleResult);
		if (result_pattern_EndEventRule_15_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_15_3_binding[0];

			Object[] result_pattern_EndEventRule_15_3_black = pattern_EndEventRule_15_3_blackB(csp);
			if (result_pattern_EndEventRule_15_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						lane, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_15_4_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_15_5_blackBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		return new Object[] { process, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, lane, laneSet };
	}

	public static final Object[] pattern_EndEventRule_15_6_blackBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, lane, laneSet, ruleResult };
	}

	public static final Object[] pattern_EndEventRule_15_6_greenBBFBFBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		EndEvent endEvent = Bpmn2Factory.eINSTANCE.createEndEvent();
		EndEventToFlow endEventToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createEndEventToFlow();
		Object _localVariable_0 = csp.getValue("endEvent", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(endEvent);
		inFlow.setTargetRef(endEvent);
		lane.getFlowNodeRefs().add(endEvent);
		ruleResult.getSourceObjects().add(endEvent);
		endEventToFlow.setSource(endEvent);
		endEventToFlow.setTarget(flow);
		ruleResult.getCorrObjects().add(endEventToFlow);
		String endEvent_name_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		endEvent.setName(endEvent_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, inFlow, endEvent, flow, endEventToFlow,
				lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EndEventRule_15_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEventRuleImpl
