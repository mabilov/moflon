/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.EndEventToUCCondition;
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
import UseCaseDSL.UCCondition;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

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
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_1_1_greenBBFFB(endEvent, flow, csp);
		UCCondition postcond = (UCCondition) result1_green[2];
		EndEventToUCCondition endEventToPostcond = (EndEventToUCCondition) result1_green[3];

		// collect translated elements
		Object[] result2_black = EndEventRuleImpl
				.pattern_EndEventRule_1_2_blackBBB(endEvent, postcond,
						endEventToPostcond);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = EndEventRuleImpl
				.pattern_EndEventRule_1_2_greenFBBB(endEvent, postcond,
						endEventToPostcond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEventRuleImpl
				.pattern_EndEventRule_1_3_blackBBBBBBBBBBBB(ruleresult,
						process, inFlow, endEvent, flow, inFlowToFlow, useCase,
						processToUseCase, lane, laneSet, postcond,
						endEventToPostcond);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		EndEventRuleImpl.pattern_EndEventRule_1_3_greenBBBBBBBBFFFFFFF(
				ruleresult, process, inFlow, endEvent, flow, lane, postcond,
				endEventToPostcond);
		// EMoflonEdge process__endEvent____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge inFlow__endEvent____targetRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge endEvent__inFlow____incoming = (EMoflonEdge) result3_green[10];
		// EMoflonEdge flow__postcond____finalState = (EMoflonEdge) result3_green[11];
		// EMoflonEdge lane__endEvent____flowNodeRefs = (EMoflonEdge) result3_green[12];
		// EMoflonEdge endEventToPostcond__endEvent____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge endEventToPostcond__postcond____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		EndEventRuleImpl.pattern_EndEventRule_1_5_expressionBBBBBBBBBBBBB(this,
				ruleresult, process, inFlow, endEvent, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, postcond,
				endEventToPostcond);
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

		// Create unbound variables
		Variable var_postcond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"postcond.name", csp);
		var_postcond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_endEvent_name, var_postcond_name);

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
			EObject inFlowToFlow, EObject useCase, EObject processToUseCase,
			EObject lane, EObject laneSet, EObject postcond,
			EObject endEventToPostcond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("endEvent", endEvent);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("postcond", postcond);
		ruleresult.registerObject("endEventToPostcond", endEventToPostcond);

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
	public boolean isAppropriate_BWD(Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		// initial bindings
		Object[] result1_black = EndEventRuleImpl
				.pattern_EndEventRule_10_1_blackBBBBB(this, match, flow,
						useCase, postcond);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_10_2_bindingAndBlackFBBBBB(this, match,
						flow, useCase, postcond);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEventRuleImpl.pattern_EndEventRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEventRuleImpl
					.pattern_EndEventRule_10_4_blackBBBB(match, flow, useCase,
							postcond);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			EndEventRuleImpl.pattern_EndEventRule_10_4_greenBBBF(match, flow,
					postcond);
			// EMoflonEdge flow__postcond____finalState = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = EndEventRuleImpl
					.pattern_EndEventRule_10_5_blackBBBB(match, flow, useCase,
							postcond);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			EndEventRuleImpl.pattern_EndEventRule_10_5_greenBBBF(match, flow,
					useCase);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[3];

			// register objects to match
			EndEventRuleImpl.pattern_EndEventRule_10_6_expressionBBBBB(this,
					match, flow, useCase, postcond);
			return EndEventRuleImpl.pattern_EndEventRule_10_7_expressionF();
		} else {
			return EndEventRuleImpl.pattern_EndEventRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_11_1_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[3];
		UseCase useCase = (UseCase) result1_bindingAndBlack[4];
		ProcessToUseCase processToUseCase = (ProcessToUseCase) result1_bindingAndBlack[5];
		Lane lane = (Lane) result1_bindingAndBlack[6];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[7];
		UCCondition postcond = (UCCondition) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_11_1_greenBBFBBFB(process, inFlow, lane,
						postcond, csp);
		EndEvent endEvent = (EndEvent) result1_green[2];
		EndEventToUCCondition endEventToPostcond = (EndEventToUCCondition) result1_green[5];

		// collect translated elements
		Object[] result2_black = EndEventRuleImpl
				.pattern_EndEventRule_11_2_blackBBB(endEvent, postcond,
						endEventToPostcond);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = EndEventRuleImpl
				.pattern_EndEventRule_11_2_greenFBBB(endEvent, postcond,
						endEventToPostcond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEventRuleImpl
				.pattern_EndEventRule_11_3_blackBBBBBBBBBBBB(ruleresult,
						process, inFlow, endEvent, flow, inFlowToFlow, useCase,
						processToUseCase, lane, laneSet, postcond,
						endEventToPostcond);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		EndEventRuleImpl.pattern_EndEventRule_11_3_greenBBBBBBBBFFFFFFF(
				ruleresult, process, inFlow, endEvent, flow, lane, postcond,
				endEventToPostcond);
		// EMoflonEdge process__endEvent____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge inFlow__endEvent____targetRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge endEvent__inFlow____incoming = (EMoflonEdge) result3_green[10];
		// EMoflonEdge flow__postcond____finalState = (EMoflonEdge) result3_green[11];
		// EMoflonEdge lane__endEvent____flowNodeRefs = (EMoflonEdge) result3_green[12];
		// EMoflonEdge endEventToPostcond__endEvent____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge endEventToPostcond__postcond____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		EndEventRuleImpl.pattern_EndEventRule_11_5_expressionBBBBBBBBBBBBB(
				this, ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, useCase, processToUseCase, lane, laneSet,
				postcond, endEventToPostcond);
		return EndEventRuleImpl
				.pattern_EndEventRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEventRuleImpl
				.pattern_EndEventRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Flow flow = (Flow) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		UCCondition postcond = (UCCondition) result2_binding[2];
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_12_2_blackFFBFBFBB(flow, useCase,
						postcond, match)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[3];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EndEventRuleImpl
					.pattern_EndEventRule_12_3_blackBBBBBBFFB(process, inFlow,
							flow, inFlowToFlow, useCase, processToUseCase,
							postcond)) {
				Lane lane = (Lane) result3_black[6];
				LaneSet laneSet = (LaneSet) result3_black[7];
				Object[] result3_green = EndEventRuleImpl
						.pattern_EndEventRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
								process, inFlow, flow, inFlowToFlow, useCase,
								processToUseCase, lane, laneSet, postcond);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__postcond____finalState = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge processToUseCase__process____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge processToUseCase__useCase____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEventRuleImpl
						.pattern_EndEventRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, process, inFlow, flow,
								inFlowToFlow, useCase, processToUseCase, lane,
								laneSet, postcond);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEventRuleImpl.pattern_EndEventRule_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEventRuleImpl
							.pattern_EndEventRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Flow flow,
			UseCase useCase, UCCondition postcond) {
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("postcond", postcond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow,
			UseCase useCase, UCCondition postcond) {// Create CSP
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
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			UCCondition postcond) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_postcond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"postcond.name", true, csp);
		var_postcond_name.setValue(postcond.getName());
		var_postcond_name.setType("String");

		// Create unbound variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", csp);
		var_endEvent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_endEvent_name, var_postcond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("postcond", postcond);
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
			EObject process, EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject useCase, EObject processToUseCase,
			EObject lane, EObject laneSet, EObject postcond,
			EObject endEventToPostcond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("endEvent", endEvent);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("postcond", postcond);
		ruleresult.registerObject("endEventToPostcond", endEventToPostcond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("postcond")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUCCondition());
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
				.pattern_EndEventRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_20_2_blackFFFFFB(_edge_flowElements)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_20_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_20_6_expressionFB(__result);
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
				.pattern_EndEventRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_21_2_blackFFFFFB(_edge_targetRef)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_21_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_21_6_expressionFB(__result);
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
				.pattern_EndEventRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_22_2_blackFFFFFB(_edge_incoming)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_22_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_22_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(
			EMoflonEdge _edge_finalState) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEventRuleImpl
				.pattern_EndEventRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_23_2_blackFFFB(_edge_finalState)) {
			Flow flow = (Flow) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			UCCondition postcond = (UCCondition) result2_black[2];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_23_3_expressionFBBBBB(
					this, match, flow, useCase, postcond)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_23_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_23_6_expressionFB(__result);
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
				.pattern_EndEventRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_24_2_blackFFFFFB(_edge_flowNodeRefs)) {
			bpmn2.Process process = (bpmn2.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent endEvent = (EndEvent) result2_black[2];
			Lane lane = (Lane) result2_black[3];
			LaneSet laneSet = (LaneSet) result2_black[4];
			Object[] result2_green = EndEventRuleImpl
					.pattern_EndEventRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEventRuleImpl.pattern_EndEventRule_24_3_expressionFBBBBBBB(
					this, match, process, inFlow, endEvent, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (EndEventRuleImpl.pattern_EndEventRule_24_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEventRuleImpl
							.pattern_EndEventRule_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_24_6_expressionFB(__result);
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
		Object[] result1_black = EndEventRuleImpl
				.pattern_EndEventRule_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = EndEventRuleImpl
				.pattern_EndEventRule_27_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EndEventRuleImpl
				.pattern_EndEventRule_27_2_blackFFFFFFFFFBB(ruleEntryContainer,
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
					.pattern_EndEventRule_27_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, process, inFlow, flow,
							inFlowToFlow, useCase, processToUseCase, lane,
							laneSet, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EndEventRuleImpl.pattern_EndEventRule_27_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = EndEventRuleImpl
						.pattern_EndEventRule_27_5_blackBBBBBBBB(process,
								inFlow, flow, inFlowToFlow, useCase,
								processToUseCase, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EndEventRuleImpl
							.pattern_EndEventRule_27_6_blackBBBBBBBBB(process,
									inFlow, flow, inFlowToFlow, useCase,
									processToUseCase, lane, laneSet, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					EndEventRuleImpl.pattern_EndEventRule_27_6_greenBBFBBFFBB(
							process, inFlow, flow, lane, ruleResult, csp);
					// EndEvent endEvent = (EndEvent) result6_green[2];
					// UCCondition postcond = (UCCondition) result6_green[5];
					// EndEventToUCCondition endEventToPostcond = (EndEventToUCCondition) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return EndEventRuleImpl
				.pattern_EndEventRule_27_7_expressionFB(ruleResult);
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

		// Create unbound variables
		Variable var_endEvent_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"endEvent.name", csp);
		var_endEvent_name.setType("String");
		Variable var_postcond_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"postcond.name", csp);
		var_postcond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_endEvent_name, var_postcond_name);

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
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.END_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_BWD__MATCH_FLOW_USECASE_UCCONDITION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(UCCondition) arguments.get(3));
		case RulesPackage.END_EVENT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_USECASE_UCCONDITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(UCCondition) arguments.get(3));
			return null;
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_USECASE_UCCONDITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Flow) arguments.get(1), (UseCase) arguments.get(2),
					(UCCondition) arguments.get(3));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_LANE_LANESET_UCCONDITION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (Flow) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(UseCase) arguments.get(5),
					(ProcessToUseCase) arguments.get(6),
					(Lane) arguments.get(7), (LaneSet) arguments.get(8),
					(UCCondition) arguments.get(9));
		case RulesPackage.END_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.END_EVENT_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.END_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
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

	public static final Object[] pattern_EndEventRule_1_1_greenBBFFB(
			EndEvent endEvent, Flow flow, CSP csp) {
		UCCondition postcond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		EndEventToUCCondition endEventToPostcond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createEndEventToUCCondition();
		Object _localVariable_0 = csp.getValue("postcond", "name");
		flow.setFinalState(postcond);
		endEventToPostcond.setSource(endEvent);
		endEventToPostcond.setTarget(postcond);
		String postcond_name_prime = (String) _localVariable_0;
		postcond.setName(postcond_name_prime);
		return new Object[] { endEvent, flow, postcond, endEventToPostcond, csp };
	}

	public static final Object[] pattern_EndEventRule_1_2_blackBBB(
			EndEvent endEvent, UCCondition postcond,
			EndEventToUCCondition endEventToPostcond) {
		return new Object[] { endEvent, postcond, endEventToPostcond };
	}

	public static final Object[] pattern_EndEventRule_1_2_greenFBBB(
			EndEvent endEvent, UCCondition postcond,
			EndEventToUCCondition endEventToPostcond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(endEvent);
		ruleresult.getCreatedElements().add(postcond);
		ruleresult.getCreatedLinkElements().add(endEventToPostcond);
		return new Object[] { ruleresult, endEvent, postcond,
				endEventToPostcond };
	}

	public static final Object[] pattern_EndEventRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject laneSet, EObject postcond, EObject endEventToPostcond) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(inFlowToFlow)) {
						if (!inFlow.equals(useCase)) {
							if (!inFlow.equals(processToUseCase)) {
								if (!inFlow.equals(lane)) {
									if (!inFlow.equals(laneSet)) {
										if (!inFlow.equals(postcond)) {
											if (!endEvent.equals(process)) {
												if (!endEvent.equals(inFlow)) {
													if (!endEvent.equals(flow)) {
														if (!endEvent
																.equals(inFlowToFlow)) {
															if (!endEvent
																	.equals(useCase)) {
																if (!endEvent
																		.equals(processToUseCase)) {
																	if (!endEvent
																			.equals(lane)) {
																		if (!endEvent
																				.equals(laneSet)) {
																			if (!endEvent
																					.equals(postcond)) {
																				if (!endEvent
																						.equals(endEventToPostcond)) {
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
																												if (!flow
																														.equals(postcond)) {
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
																																		if (!inFlowToFlow
																																				.equals(postcond)) {
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
																																								if (!lane
																																										.equals(postcond)) {
																																									if (!laneSet
																																											.equals(process)) {
																																										if (!laneSet
																																												.equals(useCase)) {
																																											if (!laneSet
																																													.equals(processToUseCase)) {
																																												if (!laneSet
																																														.equals(postcond)) {
																																													if (!postcond
																																															.equals(process)) {
																																														if (!postcond
																																																.equals(useCase)) {
																																															if (!postcond
																																																	.equals(processToUseCase)) {
																																																if (!endEventToPostcond
																																																		.equals(process)) {
																																																	if (!endEventToPostcond
																																																			.equals(inFlow)) {
																																																		if (!endEventToPostcond
																																																				.equals(flow)) {
																																																			if (!endEventToPostcond
																																																					.equals(inFlowToFlow)) {
																																																				if (!endEventToPostcond
																																																						.equals(useCase)) {
																																																					if (!endEventToPostcond
																																																							.equals(processToUseCase)) {
																																																						if (!endEventToPostcond
																																																								.equals(lane)) {
																																																							if (!endEventToPostcond
																																																									.equals(laneSet)) {
																																																								if (!endEventToPostcond
																																																										.equals(postcond)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											process,
																																																											inFlow,
																																																											endEvent,
																																																											flow,
																																																											inFlowToFlow,
																																																											useCase,
																																																											processToUseCase,
																																																											lane,
																																																											laneSet,
																																																											postcond,
																																																											endEventToPostcond };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEventRule_1_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject lane, EObject postcond,
			EObject endEventToPostcond) {
		EMoflonEdge process__endEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__endEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEvent__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__postcond____finalState = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__endEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToPostcond__endEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToPostcond__postcond____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEventRule";
		String process__endEvent____flowElements_name_prime = "flowElements";
		String inFlow__endEvent____targetRef_name_prime = "targetRef";
		String endEvent__inFlow____incoming_name_prime = "incoming";
		String flow__postcond____finalState_name_prime = "finalState";
		String lane__endEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String endEventToPostcond__endEvent____source_name_prime = "source";
		String endEventToPostcond__postcond____target_name_prime = "target";
		process__endEvent____flowElements.setSrc(process);
		process__endEvent____flowElements.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(process__endEvent____flowElements);
		inFlow__endEvent____targetRef.setSrc(inFlow);
		inFlow__endEvent____targetRef.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(inFlow__endEvent____targetRef);
		endEvent__inFlow____incoming.setSrc(endEvent);
		endEvent__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(endEvent__inFlow____incoming);
		flow__postcond____finalState.setSrc(flow);
		flow__postcond____finalState.setTrg(postcond);
		ruleresult.getCreatedEdges().add(flow__postcond____finalState);
		lane__endEvent____flowNodeRefs.setSrc(lane);
		lane__endEvent____flowNodeRefs.setTrg(endEvent);
		ruleresult.getTranslatedEdges().add(lane__endEvent____flowNodeRefs);
		endEventToPostcond__endEvent____source.setSrc(endEventToPostcond);
		endEventToPostcond__endEvent____source.setTrg(endEvent);
		ruleresult.getCreatedEdges()
				.add(endEventToPostcond__endEvent____source);
		endEventToPostcond__postcond____target.setSrc(endEventToPostcond);
		endEventToPostcond__postcond____target.setTrg(postcond);
		ruleresult.getCreatedEdges()
				.add(endEventToPostcond__postcond____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__endEvent____flowElements
				.setName(process__endEvent____flowElements_name_prime);
		inFlow__endEvent____targetRef
				.setName(inFlow__endEvent____targetRef_name_prime);
		endEvent__inFlow____incoming
				.setName(endEvent__inFlow____incoming_name_prime);
		flow__postcond____finalState
				.setName(flow__postcond____finalState_name_prime);
		lane__endEvent____flowNodeRefs
				.setName(lane__endEvent____flowNodeRefs_name_prime);
		endEventToPostcond__endEvent____source
				.setName(endEventToPostcond__endEvent____source_name_prime);
		endEventToPostcond__postcond____target
				.setName(endEventToPostcond__postcond____target_name_prime);
		return new Object[] { ruleresult, process, inFlow, endEvent, flow,
				lane, postcond, endEventToPostcond,
				process__endEvent____flowElements,
				inFlow__endEvent____targetRef, endEvent__inFlow____incoming,
				flow__postcond____finalState, lane__endEvent____flowNodeRefs,
				endEventToPostcond__endEvent____source,
				endEventToPostcond__postcond____target };
	}

	public static final void pattern_EndEventRule_1_5_expressionBBBBBBBBBBBBB(
			EndEventRule _this, PerformRuleResult ruleresult, EObject process,
			EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject useCase, EObject processToUseCase,
			EObject lane, EObject laneSet, EObject postcond,
			EObject endEventToPostcond) {
		_this.registerObjects_FWD(ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, useCase, processToUseCase, lane, laneSet,
				postcond, endEventToPostcond);

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

	public static final Object[] pattern_EndEventRule_10_1_blackBBBBB(
			EndEventRule _this, Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		return new Object[] { _this, match, flow, useCase, postcond };
	}

	public static final Object[] pattern_EndEventRule_10_2_bindingFBBBBB(
			EndEventRule _this, Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow,
				useCase, postcond);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, useCase, postcond };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_10_2_bindingAndBlackFBBBBB(
			EndEventRule _this, Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		Object[] result_pattern_EndEventRule_10_2_binding = pattern_EndEventRule_10_2_bindingFBBBBB(
				_this, match, flow, useCase, postcond);
		if (result_pattern_EndEventRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_10_2_binding[0];

			Object[] result_pattern_EndEventRule_10_2_black = pattern_EndEventRule_10_2_blackB(csp);
			if (result_pattern_EndEventRule_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, useCase,
						postcond };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_10_3_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_10_4_blackBBBB(
			Match match, Flow flow, UseCase useCase, UCCondition postcond) {
		return new Object[] { match, flow, useCase, postcond };
	}

	public static final Object[] pattern_EndEventRule_10_4_greenBBBF(
			Match match, Flow flow, UCCondition postcond) {
		EMoflonEdge flow__postcond____finalState = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(postcond);
		String flow__postcond____finalState_name_prime = "finalState";
		flow__postcond____finalState.setSrc(flow);
		flow__postcond____finalState.setTrg(postcond);
		match.getToBeTranslatedEdges().add(flow__postcond____finalState);
		flow__postcond____finalState
				.setName(flow__postcond____finalState_name_prime);
		return new Object[] { match, flow, postcond,
				flow__postcond____finalState };
	}

	public static final Object[] pattern_EndEventRule_10_5_blackBBBB(
			Match match, Flow flow, UseCase useCase, UCCondition postcond) {
		return new Object[] { match, flow, useCase, postcond };
	}

	public static final Object[] pattern_EndEventRule_10_5_greenBBBF(
			Match match, Flow flow, UseCase useCase) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		String useCase__flow____flows_name_prime = "flows";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, flow, useCase, useCase__flow____flows };
	}

	public static final void pattern_EndEventRule_10_6_expressionBBBBB(
			EndEventRule _this, Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		_this.registerObjectsToMatch_BWD(match, flow, useCase, postcond);

	}

	public static final boolean pattern_EndEventRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEventRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("processToUseCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("lane");
		EObject _localVariable_7 = isApplicableMatch.getObject("laneSet");
		EObject _localVariable_8 = isApplicableMatch.getObject("postcond");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpInFlowToFlow = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpProcessToUseCase = _localVariable_5;
		EObject tmpLane = _localVariable_6;
		EObject tmpLaneSet = _localVariable_7;
		EObject tmpPostcond = _localVariable_8;
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
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
										if (tmpPostcond instanceof UCCondition) {
											UCCondition postcond = (UCCondition) tmpPostcond;
											return new Object[] { process,
													inFlow, flow, inFlowToFlow,
													useCase, processToUseCase,
													lane, laneSet, postcond,
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
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_blackBBBBBBBBBFBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			UCCondition postcond, EndEventRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, inFlow, flow, inFlowToFlow,
						useCase, processToUseCase, lane, laneSet, postcond,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEventRule_11_1_binding = pattern_EndEventRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_EndEventRule_11_1_binding != null) {
			bpmn2.Process process = (bpmn2.Process) result_pattern_EndEventRule_11_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEventRule_11_1_binding[1];
			Flow flow = (Flow) result_pattern_EndEventRule_11_1_binding[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_EndEventRule_11_1_binding[3];
			UseCase useCase = (UseCase) result_pattern_EndEventRule_11_1_binding[4];
			ProcessToUseCase processToUseCase = (ProcessToUseCase) result_pattern_EndEventRule_11_1_binding[5];
			Lane lane = (Lane) result_pattern_EndEventRule_11_1_binding[6];
			LaneSet laneSet = (LaneSet) result_pattern_EndEventRule_11_1_binding[7];
			UCCondition postcond = (UCCondition) result_pattern_EndEventRule_11_1_binding[8];

			Object[] result_pattern_EndEventRule_11_1_black = pattern_EndEventRule_11_1_blackBBBBBBBBBFBB(
					process, inFlow, flow, inFlowToFlow, useCase,
					processToUseCase, lane, laneSet, postcond, _this,
					isApplicableMatch);
			if (result_pattern_EndEventRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEventRule_11_1_black[9];

				return new Object[] { process, inFlow, flow, inFlowToFlow,
						useCase, processToUseCase, lane, laneSet, postcond,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_11_1_greenBBFBBFB(
			bpmn2.Process process, SequenceFlow inFlow, Lane lane,
			UCCondition postcond, CSP csp) {
		EndEvent endEvent = Bpmn2Factory.eINSTANCE.createEndEvent();
		EndEventToUCCondition endEventToPostcond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createEndEventToUCCondition();
		Object _localVariable_0 = csp.getValue("endEvent", "name");
		process.getFlowElements().add(endEvent);
		inFlow.setTargetRef(endEvent);
		lane.getFlowNodeRefs().add(endEvent);
		endEventToPostcond.setSource(endEvent);
		endEventToPostcond.setTarget(postcond);
		String endEvent_name_prime = (String) _localVariable_0;
		endEvent.setName(endEvent_name_prime);
		return new Object[] { process, inFlow, endEvent, lane, postcond,
				endEventToPostcond, csp };
	}

	public static final Object[] pattern_EndEventRule_11_2_blackBBB(
			EndEvent endEvent, UCCondition postcond,
			EndEventToUCCondition endEventToPostcond) {
		return new Object[] { endEvent, postcond, endEventToPostcond };
	}

	public static final Object[] pattern_EndEventRule_11_2_greenFBBB(
			EndEvent endEvent, UCCondition postcond,
			EndEventToUCCondition endEventToPostcond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(endEvent);
		ruleresult.getTranslatedElements().add(postcond);
		ruleresult.getCreatedLinkElements().add(endEventToPostcond);
		return new Object[] { ruleresult, endEvent, postcond,
				endEventToPostcond };
	}

	public static final Object[] pattern_EndEventRule_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject inFlowToFlow,
			EObject useCase, EObject processToUseCase, EObject lane,
			EObject laneSet, EObject postcond, EObject endEventToPostcond) {
		if (!process.equals(useCase)) {
			if (!process.equals(processToUseCase)) {
				if (!inFlow.equals(process)) {
					if (!inFlow.equals(inFlowToFlow)) {
						if (!inFlow.equals(useCase)) {
							if (!inFlow.equals(processToUseCase)) {
								if (!inFlow.equals(lane)) {
									if (!inFlow.equals(laneSet)) {
										if (!inFlow.equals(postcond)) {
											if (!endEvent.equals(process)) {
												if (!endEvent.equals(inFlow)) {
													if (!endEvent.equals(flow)) {
														if (!endEvent
																.equals(inFlowToFlow)) {
															if (!endEvent
																	.equals(useCase)) {
																if (!endEvent
																		.equals(processToUseCase)) {
																	if (!endEvent
																			.equals(lane)) {
																		if (!endEvent
																				.equals(laneSet)) {
																			if (!endEvent
																					.equals(postcond)) {
																				if (!endEvent
																						.equals(endEventToPostcond)) {
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
																												if (!flow
																														.equals(postcond)) {
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
																																		if (!inFlowToFlow
																																				.equals(postcond)) {
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
																																								if (!lane
																																										.equals(postcond)) {
																																									if (!laneSet
																																											.equals(process)) {
																																										if (!laneSet
																																												.equals(useCase)) {
																																											if (!laneSet
																																													.equals(processToUseCase)) {
																																												if (!laneSet
																																														.equals(postcond)) {
																																													if (!postcond
																																															.equals(process)) {
																																														if (!postcond
																																																.equals(useCase)) {
																																															if (!postcond
																																																	.equals(processToUseCase)) {
																																																if (!endEventToPostcond
																																																		.equals(process)) {
																																																	if (!endEventToPostcond
																																																			.equals(inFlow)) {
																																																		if (!endEventToPostcond
																																																				.equals(flow)) {
																																																			if (!endEventToPostcond
																																																					.equals(inFlowToFlow)) {
																																																				if (!endEventToPostcond
																																																						.equals(useCase)) {
																																																					if (!endEventToPostcond
																																																							.equals(processToUseCase)) {
																																																						if (!endEventToPostcond
																																																								.equals(lane)) {
																																																							if (!endEventToPostcond
																																																									.equals(laneSet)) {
																																																								if (!endEventToPostcond
																																																										.equals(postcond)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											process,
																																																											inFlow,
																																																											endEvent,
																																																											flow,
																																																											inFlowToFlow,
																																																											useCase,
																																																											processToUseCase,
																																																											lane,
																																																											laneSet,
																																																											postcond,
																																																											endEventToPostcond };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEventRule_11_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject inFlow,
			EObject endEvent, EObject flow, EObject lane, EObject postcond,
			EObject endEventToPostcond) {
		EMoflonEdge process__endEvent____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__endEvent____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEvent__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__postcond____finalState = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__endEvent____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToPostcond__endEvent____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge endEventToPostcond__postcond____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEventRule";
		String process__endEvent____flowElements_name_prime = "flowElements";
		String inFlow__endEvent____targetRef_name_prime = "targetRef";
		String endEvent__inFlow____incoming_name_prime = "incoming";
		String flow__postcond____finalState_name_prime = "finalState";
		String lane__endEvent____flowNodeRefs_name_prime = "flowNodeRefs";
		String endEventToPostcond__endEvent____source_name_prime = "source";
		String endEventToPostcond__postcond____target_name_prime = "target";
		process__endEvent____flowElements.setSrc(process);
		process__endEvent____flowElements.setTrg(endEvent);
		ruleresult.getCreatedEdges().add(process__endEvent____flowElements);
		inFlow__endEvent____targetRef.setSrc(inFlow);
		inFlow__endEvent____targetRef.setTrg(endEvent);
		ruleresult.getCreatedEdges().add(inFlow__endEvent____targetRef);
		endEvent__inFlow____incoming.setSrc(endEvent);
		endEvent__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(endEvent__inFlow____incoming);
		flow__postcond____finalState.setSrc(flow);
		flow__postcond____finalState.setTrg(postcond);
		ruleresult.getTranslatedEdges().add(flow__postcond____finalState);
		lane__endEvent____flowNodeRefs.setSrc(lane);
		lane__endEvent____flowNodeRefs.setTrg(endEvent);
		ruleresult.getCreatedEdges().add(lane__endEvent____flowNodeRefs);
		endEventToPostcond__endEvent____source.setSrc(endEventToPostcond);
		endEventToPostcond__endEvent____source.setTrg(endEvent);
		ruleresult.getCreatedEdges()
				.add(endEventToPostcond__endEvent____source);
		endEventToPostcond__postcond____target.setSrc(endEventToPostcond);
		endEventToPostcond__postcond____target.setTrg(postcond);
		ruleresult.getCreatedEdges()
				.add(endEventToPostcond__postcond____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__endEvent____flowElements
				.setName(process__endEvent____flowElements_name_prime);
		inFlow__endEvent____targetRef
				.setName(inFlow__endEvent____targetRef_name_prime);
		endEvent__inFlow____incoming
				.setName(endEvent__inFlow____incoming_name_prime);
		flow__postcond____finalState
				.setName(flow__postcond____finalState_name_prime);
		lane__endEvent____flowNodeRefs
				.setName(lane__endEvent____flowNodeRefs_name_prime);
		endEventToPostcond__endEvent____source
				.setName(endEventToPostcond__endEvent____source_name_prime);
		endEventToPostcond__postcond____target
				.setName(endEventToPostcond__postcond____target_name_prime);
		return new Object[] { ruleresult, process, inFlow, endEvent, flow,
				lane, postcond, endEventToPostcond,
				process__endEvent____flowElements,
				inFlow__endEvent____targetRef, endEvent__inFlow____incoming,
				flow__postcond____finalState, lane__endEvent____flowNodeRefs,
				endEventToPostcond__endEvent____source,
				endEventToPostcond__postcond____target };
	}

	public static final void pattern_EndEventRule_11_5_expressionBBBBBBBBBBBBB(
			EndEventRule _this, PerformRuleResult ruleresult, EObject process,
			EObject inFlow, EObject endEvent, EObject flow,
			EObject inFlowToFlow, EObject useCase, EObject processToUseCase,
			EObject lane, EObject laneSet, EObject postcond,
			EObject endEventToPostcond) {
		_this.registerObjects_BWD(ruleresult, process, inFlow, endEvent, flow,
				inFlowToFlow, useCase, processToUseCase, lane, laneSet,
				postcond, endEventToPostcond);

	}

	public static final PerformRuleResult pattern_EndEventRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_12_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_blackFBB(
			EClass eClass, EndEventRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_12_1_binding = pattern_EndEventRule_12_1_bindingFB(_this);
		if (result_pattern_EndEventRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEventRule_12_1_binding[0];

			Object[] result_pattern_EndEventRule_12_1_black = pattern_EndEventRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEventRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEventRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_1_greenBF(
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

	public static final Object[] pattern_EndEventRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("postcond");
		EObject tmpFlow = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpPostcond = _localVariable_2;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpPostcond instanceof UCCondition) {
					UCCondition postcond = (UCCondition) tmpPostcond;
					return new Object[] { flow, useCase, postcond, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_12_2_blackFFBFBFBB(
			Flow flow, UseCase useCase, UCCondition postcond, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, SequenceFlowToUCFlow.class,
						"target")) {
			SequenceFlow inFlow = inFlowToFlow.getSource();
			if (inFlow != null) {
				for (ProcessToUseCase processToUseCase : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(useCase,
								ProcessToUseCase.class, "target")) {
					bpmn2.Process process = processToUseCase.getSource();
					if (process != null) {
						_result.add(new Object[] { process, inFlow, flow,
								inFlowToFlow, useCase, processToUseCase,
								postcond, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_12_3_blackBBBBBBFFB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, UCCondition postcond) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(inFlow)) {
			if (postcond.equals(flow.getFinalState())) {
				if (inFlow.equals(inFlowToFlow.getSource())) {
					if (flow.equals(inFlowToFlow.getTarget())) {
						if (useCase.getFlows().contains(flow)) {
							if (process.equals(processToUseCase.getSource())) {
								if (useCase
										.equals(processToUseCase.getTarget())) {
									for (LaneSet laneSet : process
											.getLaneSets()) {
										for (Lane lane : laneSet.getLanes()) {
											_result.add(new Object[] { process,
													inFlow, flow, inFlowToFlow,
													useCase, processToUseCase,
													lane, laneSet, postcond });
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

	public static final Object[] pattern_EndEventRule_12_3_greenBBBBBBBBBFFFFFFFFFF(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			UCCondition postcond) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__postcond____finalState = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String flow__postcond____finalState_name_prime = "finalState";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String processToUseCase__process____source_name_prime = "source";
		String processToUseCase__useCase____target_name_prime = "target";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(processToUseCase);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		isApplicableMatch.getAllContextElements().add(postcond);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		flow__postcond____finalState.setSrc(flow);
		flow__postcond____finalState.setTrg(postcond);
		isApplicableMatch.getAllContextElements().add(
				flow__postcond____finalState);
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
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		flow__postcond____finalState
				.setName(flow__postcond____finalState_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		processToUseCase__process____source
				.setName(processToUseCase__process____source_name_prime);
		processToUseCase__useCase____target
				.setName(processToUseCase__useCase____target_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { process, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, lane, laneSet, postcond, isApplicableMatch,
				process__laneSet____laneSets, process__inFlow____flowElements,
				flow__postcond____finalState, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, useCase__flow____flows,
				processToUseCase__process____source,
				processToUseCase__useCase____target, laneSet__lane____lanes };
	}

	public static final Object[] pattern_EndEventRule_12_4_bindingFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			UCCondition postcond) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, postcond);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process,
					inFlow, flow, inFlowToFlow, useCase, processToUseCase,
					lane, laneSet, postcond };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			UCCondition postcond) {
		Object[] result_pattern_EndEventRule_12_4_binding = pattern_EndEventRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, postcond);
		if (result_pattern_EndEventRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_12_4_binding[0];

			Object[] result_pattern_EndEventRule_12_4_black = pattern_EndEventRule_12_4_blackB(csp);
			if (result_pattern_EndEventRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						lane, laneSet, postcond };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_12_5_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEventRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEventRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEventRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_20_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_20_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_20_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_20_1_binding = pattern_EndEventRule_20_1_bindingFB(_this);
		if (result_pattern_EndEventRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_20_1_binding[0];

			Object[] result_pattern_EndEventRule_20_1_black = pattern_EndEventRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_20_2_blackFFFFFB(
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

	public static final Object[] pattern_EndEventRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_20_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_20_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_21_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_21_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_21_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_21_1_binding = pattern_EndEventRule_21_1_bindingFB(_this);
		if (result_pattern_EndEventRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_21_1_binding[0];

			Object[] result_pattern_EndEventRule_21_1_black = pattern_EndEventRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_21_2_blackFFFFFB(
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

	public static final Object[] pattern_EndEventRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_21_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_21_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_22_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_22_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_22_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_22_1_binding = pattern_EndEventRule_22_1_bindingFB(_this);
		if (result_pattern_EndEventRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_22_1_binding[0];

			Object[] result_pattern_EndEventRule_22_1_black = pattern_EndEventRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_22_2_blackFFFFFB(
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

	public static final Object[] pattern_EndEventRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_22_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_22_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_23_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_23_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_23_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_23_1_binding = pattern_EndEventRule_23_1_bindingFB(_this);
		if (result_pattern_EndEventRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_23_1_binding[0];

			Object[] result_pattern_EndEventRule_23_1_black = pattern_EndEventRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEventRule_23_2_black_nac_0BB(
			UCCondition postcond, Flow flow) {
		for (Flow __DEC_postcond_finalState_203053 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(postcond, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_postcond_finalState_203053)) {
				return new Object[] { postcond, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_23_2_black_nac_1BB(
			UCCondition postcond, UseCase useCase) {
		for (UseCase __DEC_postcond_preconditions_916790 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(postcond, UseCase.class,
						"preconditions")) {
			if (!useCase.equals(__DEC_postcond_preconditions_916790)) {
				return new Object[] { postcond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_23_2_black_nac_2BB(
			UseCase useCase, UCCondition postcond) {
		if (useCase.getPreconditions().contains(postcond)) {
			return new Object[] { useCase, postcond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_23_2_blackFFFB(
			EMoflonEdge _edge_finalState) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_finalState.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpPostcond = _edge_finalState.getTrg();
			if (tmpPostcond instanceof UCCondition) {
				UCCondition postcond = (UCCondition) tmpPostcond;
				if (postcond.equals(flow.getFinalState())) {
					if (pattern_EndEventRule_23_2_black_nac_0BB(postcond, flow) == null) {
						for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							if (pattern_EndEventRule_23_2_black_nac_1BB(
									postcond, useCase) == null) {
								if (pattern_EndEventRule_23_2_black_nac_2BB(
										useCase, postcond) == null) {
									_result.add(new Object[] { flow, useCase,
											postcond, _edge_finalState });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEventRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_23_3_expressionFBBBBB(
			EndEventRule _this, Match match, Flow flow, UseCase useCase,
			UCCondition postcond) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow,
				useCase, postcond);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_23_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_24_1_bindingFB(
			EndEventRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_24_1_blackFBB(
			EClass __eClass, EndEventRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_24_1_bindingAndBlackFFB(
			EndEventRule _this) {
		Object[] result_pattern_EndEventRule_24_1_binding = pattern_EndEventRule_24_1_bindingFB(_this);
		if (result_pattern_EndEventRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEventRule_24_1_binding[0];

			Object[] result_pattern_EndEventRule_24_1_black = pattern_EndEventRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEventRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEventRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEventRule_24_2_blackFFFFFB(
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

	public static final Object[] pattern_EndEventRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEventRule_24_3_expressionFBBBBBBB(
			EndEventRule _this, Match match, bpmn2.Process process,
			SequenceFlow inFlow, EndEvent endEvent, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process,
				inFlow, endEvent, lane, laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEventRule_24_4_expressionFBB(
			EndEventRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEventRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEventRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEventRule_27_1_blackB(
			EndEventRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEventRule_27_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_EndEventRule_27_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			ProcessToUseCase processToUseCase) {
		if (ruleResult.getCorrObjects().contains(processToUseCase)) {
			return new Object[] { ruleResult, processToUseCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEventRule_27_2_blackFFFFFFFFFBB(
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
							if (pattern_EndEventRule_27_2_black_nac_4BB(
									ruleResult, inFlowToFlow) == null) {
								if (pattern_EndEventRule_27_2_black_nac_3BB(
										ruleResult, inFlow) == null) {
									if (pattern_EndEventRule_27_2_black_nac_5BB(
											ruleResult, flow) == null) {
										for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														inFlow,
														FlowElementsContainer.class,
														"flowElements")) {
											if (tmpProcess instanceof bpmn2.Process) {
												bpmn2.Process process = (bpmn2.Process) tmpProcess;
												if (pattern_EndEventRule_27_2_black_nac_0BB(
														ruleResult, process) == null) {
													for (LaneSet laneSet : process
															.getLaneSets()) {
														if (pattern_EndEventRule_27_2_black_nac_1BB(
																ruleResult,
																laneSet) == null) {
															for (Lane lane : laneSet
																	.getLanes()) {
																if (pattern_EndEventRule_27_2_black_nac_2BB(
																		ruleResult,
																		lane) == null) {
																	for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					flow,
																					UseCase.class,
																					"flows")) {
																		if (pattern_EndEventRule_27_2_black_nac_6BB(
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
																					if (pattern_EndEventRule_27_2_black_nac_7BB(
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

	public static final Object[] pattern_EndEventRule_27_3_bindingFBBBBBBBBBBB(
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

	public static final Object[] pattern_EndEventRule_27_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEventRule_27_3_bindingAndBlackFBBBBBBBBBBB(
			EndEventRule _this, IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EndEventRule_27_3_binding = pattern_EndEventRule_27_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, process, inFlow, flow, inFlowToFlow,
				useCase, processToUseCase, lane, laneSet, ruleResult);
		if (result_pattern_EndEventRule_27_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEventRule_27_3_binding[0];

			Object[] result_pattern_EndEventRule_27_3_black = pattern_EndEventRule_27_3_blackB(csp);
			if (result_pattern_EndEventRule_27_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process,
						inFlow, flow, inFlowToFlow, useCase, processToUseCase,
						lane, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEventRule_27_4_expressionFBB(
			EndEventRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEventRule_27_5_blackBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet) {
		return new Object[] { process, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, lane, laneSet };
	}

	public static final Object[] pattern_EndEventRule_27_6_blackBBBBBBBBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow, UseCase useCase,
			ProcessToUseCase processToUseCase, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, inFlow, flow, inFlowToFlow, useCase,
				processToUseCase, lane, laneSet, ruleResult };
	}

	public static final Object[] pattern_EndEventRule_27_6_greenBBFBBFFBB(
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Lane lane,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		EndEvent endEvent = Bpmn2Factory.eINSTANCE.createEndEvent();
		UCCondition postcond = UseCaseDSLFactory.eINSTANCE.createUCCondition();
		EndEventToUCCondition endEventToPostcond = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createEndEventToUCCondition();
		Object _localVariable_0 = csp.getValue("endEvent", "name");
		Object _localVariable_1 = csp.getValue("postcond", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(endEvent);
		inFlow.setTargetRef(endEvent);
		lane.getFlowNodeRefs().add(endEvent);
		ruleResult.getSourceObjects().add(endEvent);
		flow.setFinalState(postcond);
		ruleResult.getTargetObjects().add(postcond);
		endEventToPostcond.setSource(endEvent);
		endEventToPostcond.setTarget(postcond);
		ruleResult.getCorrObjects().add(endEventToPostcond);
		String endEvent_name_prime = (String) _localVariable_0;
		String postcond_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		endEvent.setName(endEvent_name_prime);
		postcond.setName(postcond_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, inFlow, endEvent, flow, lane, postcond,
				endEventToPostcond, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EndEventRule_27_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEventRuleImpl
