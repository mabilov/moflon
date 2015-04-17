/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.FlowNodeToStep;

import BpmnToUseCaseIntegration.Rules.ContinuationRule;
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

import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;

import bpmn2.ExclusiveGateway;
import bpmn2.FlowNode;
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
 * An implementation of the model object '<em><b>Continuation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinuationRuleImpl extends AbstractRuleImpl implements
		ContinuationRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getContinuationRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		// initial bindings
		Object[] result1_black = ContinuationRuleImpl
				.pattern_ContinuationRule_0_1_blackBBBBBB(this, match, alt,
						flow, step, nextStep);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ContinuationRuleImpl
				.pattern_ContinuationRule_0_2_bindingAndBlackFBBBBBB(this,
						match, alt, flow, step, nextStep);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ContinuationRuleImpl.pattern_ContinuationRule_0_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ContinuationRuleImpl
					.pattern_ContinuationRule_0_4_blackBBBBB(match, alt, flow,
							step, nextStep);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ContinuationRuleImpl.pattern_ContinuationRule_0_4_greenBBBF(match,
					alt, nextStep);
			// EMoflonEdge alt__nextStep____continuation = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ContinuationRuleImpl
					.pattern_ContinuationRule_0_5_blackBBBBB(match, alt, flow,
							step, nextStep);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ContinuationRuleImpl.pattern_ContinuationRule_0_5_greenBBBBBFFF(
					match, alt, flow, step, nextStep);
			// EMoflonEdge alt__flow____ref = (EMoflonEdge) result5_green[5];
			// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result5_green[6];
			// EMoflonEdge step__nextStep____next = (EMoflonEdge) result5_green[7];

			// register objects to match
			ContinuationRuleImpl.pattern_ContinuationRule_0_6_expressionBBBBBB(
					this, match, alt, flow, step, nextStep);
			return ContinuationRuleImpl
					.pattern_ContinuationRule_0_7_expressionF();
		} else {
			return ContinuationRuleImpl
					.pattern_ContinuationRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ContinuationRuleImpl
				.pattern_ContinuationRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[0];
		ExclusiveGateway excConvGw = (ExclusiveGateway) result1_bindingAndBlack[1];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[2];
		FlowNode nextNode = (FlowNode) result1_bindingAndBlack[3];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[4];
		AlternativeFlow flow = (AlternativeFlow) result1_bindingAndBlack[5];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[6];
		NormalStep step = (NormalStep) result1_bindingAndBlack[7];
		FlowNodeToStep excConvGwToStep = (FlowNodeToStep) result1_bindingAndBlack[8];
		Step nextStep = (Step) result1_bindingAndBlack[9];
		FlowNodeToStep nextNodeToNextStep = (FlowNodeToStep) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[11];

		// collect translated elements
		Object[] result2_green = ContinuationRuleImpl
				.pattern_ContinuationRule_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ContinuationRuleImpl
				.pattern_ContinuationRule_1_3_blackBBBBBBBBBBBB(ruleresult,
						inFlow, excConvGw, outFlow, nextNode, alt, flow,
						inFlowToFlow, step, excConvGwToStep, nextStep,
						nextNodeToNextStep);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ContinuationRuleImpl.pattern_ContinuationRule_1_3_greenBBBF(ruleresult,
				alt, nextStep);
		// EMoflonEdge alt__nextStep____continuation = (EMoflonEdge) result3_green[3];

		// perform postprocessing story node is empty
		// register objects
		ContinuationRuleImpl
				.pattern_ContinuationRule_1_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, inFlow, excConvGw, outFlow, nextNode, alt,
						flow, inFlowToFlow, step, excConvGwToStep, nextStep,
						nextNodeToNextStep);
		return ContinuationRuleImpl
				.pattern_ContinuationRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinuationRuleImpl
				.pattern_ContinuationRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinuationRuleImpl
				.pattern_ContinuationRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ContinuationRuleImpl
				.pattern_ContinuationRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[0];
		AlternativeFlow flow = (AlternativeFlow) result2_binding[1];
		NormalStep step = (NormalStep) result2_binding[2];
		Step nextStep = (Step) result2_binding[3];
		for (Object[] result2_black : ContinuationRuleImpl
				.pattern_ContinuationRule_2_2_blackFFFBBFBFBFB(alt, flow, step,
						nextStep, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway excConvGw = (ExclusiveGateway) result2_black[1];
			FlowNode nextNode = (FlowNode) result2_black[2];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[5];
			FlowNodeToStep excConvGwToStep = (FlowNodeToStep) result2_black[7];
			FlowNodeToStep nextNodeToNextStep = (FlowNodeToStep) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : ContinuationRuleImpl
					.pattern_ContinuationRule_2_3_blackBBFBBBBBBBB(inFlow,
							excConvGw, nextNode, alt, flow, inFlowToFlow, step,
							excConvGwToStep, nextStep, nextNodeToNextStep)) {
				SequenceFlow outFlow = (SequenceFlow) result3_black[2];
				Object[] result3_green = ContinuationRuleImpl
						.pattern_ContinuationRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								inFlow, excConvGw, outFlow, nextNode, alt,
								flow, inFlowToFlow, step, excConvGwToStep,
								nextStep, nextNodeToNextStep);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge inFlow__excConvGw____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge excConvGw__inFlow____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge outFlow__excConvGw____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge excConvGw__outFlow____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge outFlow__nextNode____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge nextNode__outFlow____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge alt__flow____ref = (EMoflonEdge) result3_green[18];
				// EMoflonEdge alt__nextStep____continuation = (EMoflonEdge) result3_green[19];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[22];
				// EMoflonEdge step__nextStep____next = (EMoflonEdge) result3_green[23];
				// EMoflonEdge excConvGwToStep__excConvGw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge excConvGwToStep__step____target = (EMoflonEdge) result3_green[25];
				// EMoflonEdge nextNodeToNextStep__nextNode____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge nextNodeToNextStep__nextStep____target = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = ContinuationRuleImpl
						.pattern_ContinuationRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, inFlow, excConvGw,
								outFlow, nextNode, alt, flow, inFlowToFlow,
								step, excConvGwToStep, nextStep,
								nextNodeToNextStep);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ContinuationRuleImpl
						.pattern_ContinuationRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ContinuationRuleImpl
							.pattern_ContinuationRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ContinuationRuleImpl.pattern_ContinuationRule_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ContinuationRuleImpl
				.pattern_ContinuationRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		match.registerObject("alt", alt);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("nextStep", nextStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {// Create CSP
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
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables
		Variable var_excConvGw_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("excConvGw.gatewayDirection", true, csp);
		var_excConvGw_gatewayDirection
				.setValue(excConvGw.getGatewayDirection());
		var_excConvGw_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_excConvGw_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("excConvGw", excConvGw);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("nextNode", nextNode);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("excConvGwToStep", excConvGwToStep);
		isApplicableMatch.registerObject("nextStep", nextStep);
		isApplicableMatch.registerObject("nextNodeToNextStep",
				nextNodeToNextStep);
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
			EObject inFlow, EObject excConvGw, EObject outFlow,
			EObject nextNode, EObject alt, EObject flow, EObject inFlowToFlow,
			EObject step, EObject excConvGwToStep, EObject nextStep,
			EObject nextNodeToNextStep) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("excConvGw", excConvGw);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("nextNode", nextNode);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("excConvGwToStep", excConvGwToStep);
		ruleresult.registerObject("nextStep", nextStep);
		ruleresult.registerObject("nextNodeToNextStep", nextNodeToNextStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(
			EMoflonEdge _edge_continuation) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinuationRuleImpl
				.pattern_ContinuationRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinuationRuleImpl
				.pattern_ContinuationRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ContinuationRuleImpl
				.pattern_ContinuationRule_10_2_blackFFFFB(_edge_continuation)) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[0];
			AlternativeFlow flow = (AlternativeFlow) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			Step nextStep = (Step) result2_black[3];
			Object[] result2_green = ContinuationRuleImpl
					.pattern_ContinuationRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ContinuationRuleImpl
					.pattern_ContinuationRule_10_3_expressionFBBBBBB(this,
							match, alt, flow, step, nextStep)) {
				// Ensure that the correct types of elements are matched
				if (ContinuationRuleImpl
						.pattern_ContinuationRule_10_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ContinuationRuleImpl
							.pattern_ContinuationRule_10_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ContinuationRuleImpl
							.pattern_ContinuationRule_10_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ContinuationRuleImpl
				.pattern_ContinuationRule_10_6_expressionFB(__result);
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
			FlowNodeToStep excConvGwToStepParameter) {
		// create result
		Object[] result1_black = ContinuationRuleImpl
				.pattern_ContinuationRule_12_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ContinuationRuleImpl
				.pattern_ContinuationRule_12_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ContinuationRuleImpl
				.pattern_ContinuationRule_12_2_blackFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList excConvGwToStepList = (RuleEntryList) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			ExclusiveGateway excConvGw = (ExclusiveGateway) result2_black[2];
			FlowNodeToStep excConvGwToStep = (FlowNodeToStep) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow flow = (AlternativeFlow) result2_black[6];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[7];
			Step nextStep = (Step) result2_black[8];
			FlowNodeToStep nextNodeToNextStep = (FlowNodeToStep) result2_black[9];
			FlowNode nextNode = (FlowNode) result2_black[10];
			SequenceFlow outFlow = (SequenceFlow) result2_black[11];

			// solve CSP
			Object[] result3_bindingAndBlack = ContinuationRuleImpl
					.pattern_ContinuationRule_12_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, inFlow, excConvGw,
							outFlow, nextNode, alt, flow, inFlowToFlow, step,
							excConvGwToStep, nextStep, nextNodeToNextStep,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ContinuationRuleImpl
					.pattern_ContinuationRule_12_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ContinuationRuleImpl
						.pattern_ContinuationRule_12_5_blackBBBBBBBBBBB(inFlow,
								excConvGw, outFlow, nextNode, alt, flow,
								inFlowToFlow, step, excConvGwToStep, nextStep,
								nextNodeToNextStep);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ContinuationRuleImpl
							.pattern_ContinuationRule_12_6_blackBBBBBBBBBBBB(
									inFlow, excConvGw, outFlow, nextNode, alt,
									flow, inFlowToFlow, step, excConvGwToStep,
									nextStep, nextNodeToNextStep, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ContinuationRuleImpl
							.pattern_ContinuationRule_12_6_greenBBB(alt,
									nextStep, ruleResult);

				} else {
				}

			} else {
			}

		}
		return ContinuationRuleImpl
				.pattern_ContinuationRule_12_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables
		Variable var_excConvGw_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("excConvGw.gatewayDirection", true, csp);
		var_excConvGw_gatewayDirection
				.setValue(excConvGw.getGatewayDirection());
		var_excConvGw_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_excConvGw_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("excConvGw", excConvGw);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("nextNode", nextNode);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("excConvGwToStep", excConvGwToStep);
		isApplicableMatch.registerObject("nextStep", nextStep);
		isApplicableMatch.registerObject("nextNodeToNextStep",
				nextNodeToNextStep);
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
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.CONTINUATION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
			return null;
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_NORMALSTEP_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(AlternativeFlowAlternative) arguments.get(1),
					(AlternativeFlow) arguments.get(2),
					(NormalStep) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_STEP_FLOWNODETOSTEP:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(FlowNode) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5),
					(AlternativeFlow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(Step) arguments.get(10),
					(FlowNodeToStep) arguments.get(11));
		case RulesPackage.CONTINUATION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CONTINUATION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CONTINUATION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONTINUATION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowNodeToStep) arguments.get(1));
		case RulesPackage.CONTINUATION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_STEP_FLOWNODETOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(FlowNode) arguments.get(4),
					(AlternativeFlowAlternative) arguments.get(5),
					(AlternativeFlow) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(FlowNodeToStep) arguments.get(9),
					(Step) arguments.get(10),
					(FlowNodeToStep) arguments.get(11),
					(ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.CONTINUATION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ContinuationRule_0_1_blackBBBBBB(
			ContinuationRule _this, Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		if (!nextStep.equals(step)) {
			return new Object[] { _this, match, alt, flow, step, nextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_0_2_bindingFBBBBBB(
			ContinuationRule _this, Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, alt,
				flow, step, nextStep);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, alt, flow, step, nextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinuationRule_0_2_bindingAndBlackFBBBBBB(
			ContinuationRule _this, Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		Object[] result_pattern_ContinuationRule_0_2_binding = pattern_ContinuationRule_0_2_bindingFBBBBBB(
				_this, match, alt, flow, step, nextStep);
		if (result_pattern_ContinuationRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ContinuationRule_0_2_binding[0];

			Object[] result_pattern_ContinuationRule_0_2_black = pattern_ContinuationRule_0_2_blackB(csp);
			if (result_pattern_ContinuationRule_0_2_black != null) {

				return new Object[] { csp, _this, match, alt, flow, step,
						nextStep };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinuationRule_0_3_expressionFBB(
			ContinuationRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_0_4_blackBBBBB(
			Match match, AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		if (!nextStep.equals(step)) {
			return new Object[] { match, alt, flow, step, nextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_0_4_greenBBBF(
			Match match, AlternativeFlowAlternative alt, Step nextStep) {
		EMoflonEdge alt__nextStep____continuation = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String alt__nextStep____continuation_name_prime = "continuation";
		alt__nextStep____continuation.setSrc(alt);
		alt__nextStep____continuation.setTrg(nextStep);
		match.getToBeTranslatedEdges().add(alt__nextStep____continuation);
		alt__nextStep____continuation
				.setName(alt__nextStep____continuation_name_prime);
		return new Object[] { match, alt, nextStep,
				alt__nextStep____continuation };
	}

	public static final Object[] pattern_ContinuationRule_0_5_blackBBBBB(
			Match match, AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		if (!nextStep.equals(step)) {
			return new Object[] { match, alt, flow, step, nextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_0_5_greenBBBBBFFF(
			Match match, AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__nextStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(alt);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(step);
		match.getContextNodes().add(nextStep);
		String alt__flow____ref_name_prime = "ref";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__nextStep____next_name_prime = "next";
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		match.getContextEdges().add(alt__flow____ref);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		match.getContextEdges().add(step__alt____stepAlternative);
		step__nextStep____next.setSrc(step);
		step__nextStep____next.setTrg(nextStep);
		match.getContextEdges().add(step__nextStep____next);
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__nextStep____next.setName(step__nextStep____next_name_prime);
		return new Object[] { match, alt, flow, step, nextStep,
				alt__flow____ref, step__alt____stepAlternative,
				step__nextStep____next };
	}

	public static final void pattern_ContinuationRule_0_6_expressionBBBBBB(
			ContinuationRule _this, Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		_this.registerObjectsToMatch_BWD(match, alt, flow, step, nextStep);

	}

	public static final boolean pattern_ContinuationRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ContinuationRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("excConvGw");
		EObject _localVariable_2 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("nextNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("alt");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("excConvGwToStep");
		EObject _localVariable_9 = isApplicableMatch.getObject("nextStep");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("nextNodeToNextStep");
		EObject tmpInFlow = _localVariable_0;
		EObject tmpExcConvGw = _localVariable_1;
		EObject tmpOutFlow = _localVariable_2;
		EObject tmpNextNode = _localVariable_3;
		EObject tmpAlt = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpInFlowToFlow = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpExcConvGwToStep = _localVariable_8;
		EObject tmpNextStep = _localVariable_9;
		EObject tmpNextNodeToNextStep = _localVariable_10;
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			if (tmpExcConvGw instanceof ExclusiveGateway) {
				ExclusiveGateway excConvGw = (ExclusiveGateway) tmpExcConvGw;
				if (tmpOutFlow instanceof SequenceFlow) {
					SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
					if (tmpNextNode instanceof FlowNode) {
						FlowNode nextNode = (FlowNode) tmpNextNode;
						if (tmpAlt instanceof AlternativeFlowAlternative) {
							AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
							if (tmpFlow instanceof AlternativeFlow) {
								AlternativeFlow flow = (AlternativeFlow) tmpFlow;
								if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
									SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
									if (tmpStep instanceof NormalStep) {
										NormalStep step = (NormalStep) tmpStep;
										if (tmpExcConvGwToStep instanceof FlowNodeToStep) {
											FlowNodeToStep excConvGwToStep = (FlowNodeToStep) tmpExcConvGwToStep;
											if (tmpNextStep instanceof Step) {
												Step nextStep = (Step) tmpNextStep;
												if (tmpNextNodeToNextStep instanceof FlowNodeToStep) {
													FlowNodeToStep nextNodeToNextStep = (FlowNodeToStep) tmpNextNodeToNextStep;
													return new Object[] {
															inFlow, excConvGw,
															outFlow, nextNode,
															alt, flow,
															inFlowToFlow, step,
															excConvGwToStep,
															nextStep,
															nextNodeToNextStep,
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

	public static final Object[] pattern_ContinuationRule_1_1_blackBBBBBBBBBBBFBB(
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep, ContinuationRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			if (!excConvGw.equals(nextNode)) {
				if (!excConvGwToStep.equals(nextNodeToNextStep)) {
					if (!nextStep.equals(step)) {
						for (EObject tmpCsp : isApplicableMatch
								.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { inFlow, excConvGw,
										outFlow, nextNode, alt, flow,
										inFlowToFlow, step, excConvGwToStep,
										nextStep, nextNodeToNextStep, csp,
										_this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
			ContinuationRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ContinuationRule_1_1_binding = pattern_ContinuationRule_1_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ContinuationRule_1_1_binding != null) {
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ContinuationRule_1_1_binding[0];
			ExclusiveGateway excConvGw = (ExclusiveGateway) result_pattern_ContinuationRule_1_1_binding[1];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ContinuationRule_1_1_binding[2];
			FlowNode nextNode = (FlowNode) result_pattern_ContinuationRule_1_1_binding[3];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_ContinuationRule_1_1_binding[4];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_ContinuationRule_1_1_binding[5];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ContinuationRule_1_1_binding[6];
			NormalStep step = (NormalStep) result_pattern_ContinuationRule_1_1_binding[7];
			FlowNodeToStep excConvGwToStep = (FlowNodeToStep) result_pattern_ContinuationRule_1_1_binding[8];
			Step nextStep = (Step) result_pattern_ContinuationRule_1_1_binding[9];
			FlowNodeToStep nextNodeToNextStep = (FlowNodeToStep) result_pattern_ContinuationRule_1_1_binding[10];

			Object[] result_pattern_ContinuationRule_1_1_black = pattern_ContinuationRule_1_1_blackBBBBBBBBBBBFBB(
					inFlow, excConvGw, outFlow, nextNode, alt, flow,
					inFlowToFlow, step, excConvGwToStep, nextStep,
					nextNodeToNextStep, _this, isApplicableMatch);
			if (result_pattern_ContinuationRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ContinuationRule_1_1_black[11];

				return new Object[] { inFlow, excConvGw, outFlow, nextNode,
						alt, flow, inFlowToFlow, step, excConvGwToStep,
						nextStep, nextNodeToNextStep, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ContinuationRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject inFlow, EObject excConvGw,
			EObject outFlow, EObject nextNode, EObject alt, EObject flow,
			EObject inFlowToFlow, EObject step, EObject excConvGwToStep,
			EObject nextStep, EObject nextNodeToNextStep) {
		if (!inFlow.equals(outFlow)) {
			if (!inFlow.equals(nextNode)) {
				if (!inFlow.equals(inFlowToFlow)) {
					if (!inFlow.equals(step)) {
						if (!inFlow.equals(nextStep)) {
							if (!inFlow.equals(nextNodeToNextStep)) {
								if (!excConvGw.equals(inFlow)) {
									if (!excConvGw.equals(outFlow)) {
										if (!excConvGw.equals(nextNode)) {
											if (!excConvGw.equals(flow)) {
												if (!excConvGw
														.equals(inFlowToFlow)) {
													if (!excConvGw.equals(step)) {
														if (!excConvGw
																.equals(excConvGwToStep)) {
															if (!excConvGw
																	.equals(nextStep)) {
																if (!excConvGw
																		.equals(nextNodeToNextStep)) {
																	if (!outFlow
																			.equals(step)) {
																		if (!nextNode
																				.equals(outFlow)) {
																			if (!nextNode
																					.equals(step)) {
																				if (!nextNode
																						.equals(nextStep)) {
																					if (!nextNode
																							.equals(nextNodeToNextStep)) {
																						if (!alt.equals(inFlow)) {
																							if (!alt.equals(excConvGw)) {
																								if (!alt.equals(outFlow)) {
																									if (!alt.equals(nextNode)) {
																										if (!alt.equals(flow)) {
																											if (!alt.equals(inFlowToFlow)) {
																												if (!alt.equals(step)) {
																													if (!alt.equals(excConvGwToStep)) {
																														if (!alt.equals(nextStep)) {
																															if (!alt.equals(nextNodeToNextStep)) {
																																if (!flow
																																		.equals(inFlow)) {
																																	if (!flow
																																			.equals(outFlow)) {
																																		if (!flow
																																				.equals(nextNode)) {
																																			if (!flow
																																					.equals(inFlowToFlow)) {
																																				if (!flow
																																						.equals(step)) {
																																					if (!flow
																																							.equals(nextStep)) {
																																						if (!flow
																																								.equals(nextNodeToNextStep)) {
																																							if (!inFlowToFlow
																																									.equals(outFlow)) {
																																								if (!inFlowToFlow
																																										.equals(nextNode)) {
																																									if (!inFlowToFlow
																																											.equals(step)) {
																																										if (!inFlowToFlow
																																												.equals(nextStep)) {
																																											if (!inFlowToFlow
																																													.equals(nextNodeToNextStep)) {
																																												if (!excConvGwToStep
																																														.equals(inFlow)) {
																																													if (!excConvGwToStep
																																															.equals(outFlow)) {
																																														if (!excConvGwToStep
																																																.equals(nextNode)) {
																																															if (!excConvGwToStep
																																																	.equals(flow)) {
																																																if (!excConvGwToStep
																																																		.equals(inFlowToFlow)) {
																																																	if (!excConvGwToStep
																																																			.equals(step)) {
																																																		if (!excConvGwToStep
																																																				.equals(nextStep)) {
																																																			if (!excConvGwToStep
																																																					.equals(nextNodeToNextStep)) {
																																																				if (!nextStep
																																																						.equals(outFlow)) {
																																																					if (!nextStep
																																																							.equals(step)) {
																																																						if (!nextNodeToNextStep
																																																								.equals(outFlow)) {
																																																							if (!nextNodeToNextStep
																																																									.equals(step)) {
																																																								if (!nextNodeToNextStep
																																																										.equals(nextStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											inFlow,
																																																											excConvGw,
																																																											outFlow,
																																																											nextNode,
																																																											alt,
																																																											flow,
																																																											inFlowToFlow,
																																																											step,
																																																											excConvGwToStep,
																																																											nextStep,
																																																											nextNodeToNextStep };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ContinuationRule_1_3_greenBBBF(
			PerformRuleResult ruleresult, EObject alt, EObject nextStep) {
		EMoflonEdge alt__nextStep____continuation = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ContinuationRule";
		String alt__nextStep____continuation_name_prime = "continuation";
		alt__nextStep____continuation.setSrc(alt);
		alt__nextStep____continuation.setTrg(nextStep);
		ruleresult.getTranslatedEdges().add(alt__nextStep____continuation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		alt__nextStep____continuation
				.setName(alt__nextStep____continuation_name_prime);
		return new Object[] { ruleresult, alt, nextStep,
				alt__nextStep____continuation };
	}

	public static final void pattern_ContinuationRule_1_5_expressionBBBBBBBBBBBBB(
			ContinuationRule _this, PerformRuleResult ruleresult,
			EObject inFlow, EObject excConvGw, EObject outFlow,
			EObject nextNode, EObject alt, EObject flow, EObject inFlowToFlow,
			EObject step, EObject excConvGwToStep, EObject nextStep,
			EObject nextNodeToNextStep) {
		_this.registerObjects_BWD(ruleresult, inFlow, excConvGw, outFlow,
				nextNode, alt, flow, inFlowToFlow, step, excConvGwToStep,
				nextStep, nextNodeToNextStep);

	}

	public static final PerformRuleResult pattern_ContinuationRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_2_1_bindingFB(
			ContinuationRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_2_1_blackFBB(
			EClass eClass, ContinuationRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_2_1_bindingAndBlackFFB(
			ContinuationRule _this) {
		Object[] result_pattern_ContinuationRule_2_1_binding = pattern_ContinuationRule_2_1_bindingFB(_this);
		if (result_pattern_ContinuationRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ContinuationRule_2_1_binding[0];

			Object[] result_pattern_ContinuationRule_2_1_black = pattern_ContinuationRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ContinuationRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ContinuationRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ContinuationRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ContinuationRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("alt");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject _localVariable_3 = match.getObject("nextStep");
		EObject tmpAlt = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpNextStep = _localVariable_3;
		if (tmpAlt instanceof AlternativeFlowAlternative) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
			if (tmpFlow instanceof AlternativeFlow) {
				AlternativeFlow flow = (AlternativeFlow) tmpFlow;
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					if (tmpNextStep instanceof Step) {
						Step nextStep = (Step) tmpNextStep;
						return new Object[] { alt, flow, step, nextStep, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ContinuationRule_2_2_blackFFFBBFBFBFB(
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!nextStep.equals(step)) {
			for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow,
							SequenceFlowToUCFlow.class, "target")) {
				SequenceFlow inFlow = inFlowToFlow.getSource();
				if (inFlow != null) {
					for (FlowNodeToStep excConvGwToStep : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(step,
									FlowNodeToStep.class, "target")) {
						FlowNode tmpExcConvGw = excConvGwToStep.getSource();
						if (tmpExcConvGw instanceof ExclusiveGateway) {
							ExclusiveGateway excConvGw = (ExclusiveGateway) tmpExcConvGw;
							for (FlowNodeToStep nextNodeToNextStep : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(nextStep,
											FlowNodeToStep.class, "target")) {
								if (!excConvGwToStep.equals(nextNodeToNextStep)) {
									FlowNode nextNode = nextNodeToNextStep
											.getSource();
									if (nextNode != null) {
										if (!excConvGw.equals(nextNode)) {
											_result.add(new Object[] { inFlow,
													excConvGw, nextNode, alt,
													flow, inFlowToFlow, step,
													excConvGwToStep, nextStep,
													nextNodeToNextStep, match });
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

	public static final Iterable<Object[]> pattern_ContinuationRule_2_3_blackBBFBBBBBBBB(
			SequenceFlow inFlow, ExclusiveGateway excConvGw, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!excConvGw.equals(nextNode)) {
			if (!excConvGwToStep.equals(nextNodeToNextStep)) {
				if (!nextStep.equals(step)) {
					if (excConvGw.equals(inFlow.getTargetRef())) {
						if (flow.equals(alt.getRef())) {
							if (nextStep.equals(alt.getContinuation())) {
								if (inFlow.equals(inFlowToFlow.getSource())) {
									if (flow.equals(inFlowToFlow.getTarget())) {
										if (step.getStepAlternative().contains(
												alt)) {
											if (nextStep.equals(step.getNext())) {
												if (excConvGw
														.equals(excConvGwToStep
																.getSource())) {
													if (step.equals(excConvGwToStep
															.getTarget())) {
														if (nextNode
																.equals(nextNodeToNextStep
																		.getSource())) {
															if (nextStep
																	.equals(nextNodeToNextStep
																			.getTarget())) {
																for (SequenceFlow outFlow : excConvGw
																		.getOutgoing()) {
																	if (!inFlow
																			.equals(outFlow)) {
																		if (nextNode
																				.equals(outFlow
																						.getTargetRef())) {
																			_result.add(new Object[] {
																					inFlow,
																					excConvGw,
																					outFlow,
																					nextNode,
																					alt,
																					flow,
																					inFlowToFlow,
																					step,
																					excConvGwToStep,
																					nextStep,
																					nextNodeToNextStep });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ContinuationRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlow__excConvGw____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge excConvGw__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__excConvGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge excConvGw__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__nextNode____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextNode__outFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__nextStep____continuation = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__nextStep____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge excConvGwToStep__excConvGw____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge excConvGwToStep__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextNodeToNextStep__nextNode____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextNodeToNextStep__nextStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlow__excConvGw____targetRef_name_prime = "targetRef";
		String excConvGw__inFlow____incoming_name_prime = "incoming";
		String outFlow__excConvGw____sourceRef_name_prime = "sourceRef";
		String excConvGw__outFlow____outgoing_name_prime = "outgoing";
		String outFlow__nextNode____targetRef_name_prime = "targetRef";
		String nextNode__outFlow____incoming_name_prime = "incoming";
		String alt__flow____ref_name_prime = "ref";
		String alt__nextStep____continuation_name_prime = "continuation";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__nextStep____next_name_prime = "next";
		String excConvGwToStep__excConvGw____source_name_prime = "source";
		String excConvGwToStep__step____target_name_prime = "target";
		String nextNodeToNextStep__nextNode____source_name_prime = "source";
		String nextNodeToNextStep__nextStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(excConvGw);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(nextNode);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(excConvGwToStep);
		isApplicableMatch.getAllContextElements().add(nextStep);
		isApplicableMatch.getAllContextElements().add(nextNodeToNextStep);
		inFlow__excConvGw____targetRef.setSrc(inFlow);
		inFlow__excConvGw____targetRef.setTrg(excConvGw);
		isApplicableMatch.getAllContextElements().add(
				inFlow__excConvGw____targetRef);
		excConvGw__inFlow____incoming.setSrc(excConvGw);
		excConvGw__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				excConvGw__inFlow____incoming);
		outFlow__excConvGw____sourceRef.setSrc(outFlow);
		outFlow__excConvGw____sourceRef.setTrg(excConvGw);
		isApplicableMatch.getAllContextElements().add(
				outFlow__excConvGw____sourceRef);
		excConvGw__outFlow____outgoing.setSrc(excConvGw);
		excConvGw__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				excConvGw__outFlow____outgoing);
		outFlow__nextNode____targetRef.setSrc(outFlow);
		outFlow__nextNode____targetRef.setTrg(nextNode);
		isApplicableMatch.getAllContextElements().add(
				outFlow__nextNode____targetRef);
		nextNode__outFlow____incoming.setSrc(nextNode);
		nextNode__outFlow____incoming.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				nextNode__outFlow____incoming);
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(alt__flow____ref);
		alt__nextStep____continuation.setSrc(alt);
		alt__nextStep____continuation.setTrg(nextStep);
		isApplicableMatch.getAllContextElements().add(
				alt__nextStep____continuation);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				step__alt____stepAlternative);
		step__nextStep____next.setSrc(step);
		step__nextStep____next.setTrg(nextStep);
		isApplicableMatch.getAllContextElements().add(step__nextStep____next);
		excConvGwToStep__excConvGw____source.setSrc(excConvGwToStep);
		excConvGwToStep__excConvGw____source.setTrg(excConvGw);
		isApplicableMatch.getAllContextElements().add(
				excConvGwToStep__excConvGw____source);
		excConvGwToStep__step____target.setSrc(excConvGwToStep);
		excConvGwToStep__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				excConvGwToStep__step____target);
		nextNodeToNextStep__nextNode____source.setSrc(nextNodeToNextStep);
		nextNodeToNextStep__nextNode____source.setTrg(nextNode);
		isApplicableMatch.getAllContextElements().add(
				nextNodeToNextStep__nextNode____source);
		nextNodeToNextStep__nextStep____target.setSrc(nextNodeToNextStep);
		nextNodeToNextStep__nextStep____target.setTrg(nextStep);
		isApplicableMatch.getAllContextElements().add(
				nextNodeToNextStep__nextStep____target);
		inFlow__excConvGw____targetRef
				.setName(inFlow__excConvGw____targetRef_name_prime);
		excConvGw__inFlow____incoming
				.setName(excConvGw__inFlow____incoming_name_prime);
		outFlow__excConvGw____sourceRef
				.setName(outFlow__excConvGw____sourceRef_name_prime);
		excConvGw__outFlow____outgoing
				.setName(excConvGw__outFlow____outgoing_name_prime);
		outFlow__nextNode____targetRef
				.setName(outFlow__nextNode____targetRef_name_prime);
		nextNode__outFlow____incoming
				.setName(nextNode__outFlow____incoming_name_prime);
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		alt__nextStep____continuation
				.setName(alt__nextStep____continuation_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__nextStep____next.setName(step__nextStep____next_name_prime);
		excConvGwToStep__excConvGw____source
				.setName(excConvGwToStep__excConvGw____source_name_prime);
		excConvGwToStep__step____target
				.setName(excConvGwToStep__step____target_name_prime);
		nextNodeToNextStep__nextNode____source
				.setName(nextNodeToNextStep__nextNode____source_name_prime);
		nextNodeToNextStep__nextStep____target
				.setName(nextNodeToNextStep__nextStep____target_name_prime);
		return new Object[] { inFlow, excConvGw, outFlow, nextNode, alt, flow,
				inFlowToFlow, step, excConvGwToStep, nextStep,
				nextNodeToNextStep, isApplicableMatch,
				inFlow__excConvGw____targetRef, excConvGw__inFlow____incoming,
				outFlow__excConvGw____sourceRef,
				excConvGw__outFlow____outgoing, outFlow__nextNode____targetRef,
				nextNode__outFlow____incoming, alt__flow____ref,
				alt__nextStep____continuation, inFlowToFlow__inFlow____source,
				inFlowToFlow__flow____target, step__alt____stepAlternative,
				step__nextStep____next, excConvGwToStep__excConvGw____source,
				excConvGwToStep__step____target,
				nextNodeToNextStep__nextNode____source,
				nextNodeToNextStep__nextStep____target };
	}

	public static final Object[] pattern_ContinuationRule_2_4_bindingFBBBBBBBBBBBBB(
			ContinuationRule _this, IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, inFlow, excConvGw, outFlow, nextNode, alt,
				flow, inFlowToFlow, step, excConvGwToStep, nextStep,
				nextNodeToNextStep);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					excConvGw, outFlow, nextNode, alt, flow, inFlowToFlow,
					step, excConvGwToStep, nextStep, nextNodeToNextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinuationRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
			ContinuationRule _this, IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		Object[] result_pattern_ContinuationRule_2_4_binding = pattern_ContinuationRule_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, excConvGw, outFlow, nextNode,
				alt, flow, inFlowToFlow, step, excConvGwToStep, nextStep,
				nextNodeToNextStep);
		if (result_pattern_ContinuationRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ContinuationRule_2_4_binding[0];

			Object[] result_pattern_ContinuationRule_2_4_black = pattern_ContinuationRule_2_4_blackB(csp);
			if (result_pattern_ContinuationRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						excConvGw, outFlow, nextNode, alt, flow, inFlowToFlow,
						step, excConvGwToStep, nextStep, nextNodeToNextStep };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinuationRule_2_5_expressionFBB(
			ContinuationRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ContinuationRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ContinuationRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ContinuationRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_10_1_bindingFB(
			ContinuationRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_10_1_blackFBB(
			EClass __eClass, ContinuationRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_10_1_bindingAndBlackFFB(
			ContinuationRule _this) {
		Object[] result_pattern_ContinuationRule_10_1_binding = pattern_ContinuationRule_10_1_bindingFB(_this);
		if (result_pattern_ContinuationRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ContinuationRule_10_1_binding[0];

			Object[] result_pattern_ContinuationRule_10_1_black = pattern_ContinuationRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ContinuationRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ContinuationRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ContinuationRule_10_2_blackFFFFB(
			EMoflonEdge _edge_continuation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_continuation.getSrc();
		if (tmpAlt instanceof AlternativeFlowAlternative) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
			EObject tmpNextStep = _edge_continuation.getTrg();
			if (tmpNextStep instanceof Step) {
				Step nextStep = (Step) tmpNextStep;
				if (nextStep.equals(alt.getContinuation())) {
					NamedFlow tmpFlow = alt.getRef();
					if (tmpFlow instanceof AlternativeFlow) {
						AlternativeFlow flow = (AlternativeFlow) tmpFlow;
						for (NormalStep step : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(alt,
										NormalStep.class, "stepAlternative")) {
							if (!nextStep.equals(step)) {
								if (nextStep.equals(step.getNext())) {
									_result.add(new Object[] { alt, flow, step,
											nextStep, _edge_continuation });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ContinuationRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ContinuationRule_10_3_expressionFBBBBBB(
			ContinuationRule _this, Match match,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			NormalStep step, Step nextStep) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, flow,
				step, nextStep);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ContinuationRule_10_4_expressionFBB(
			ContinuationRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ContinuationRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ContinuationRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_12_1_blackB(
			ContinuationRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ContinuationRule_12_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ExclusiveGateway excConvGw) {
		if (ruleResult.getSourceObjects().contains(excConvGw)) {
			return new Object[] { ruleResult, excConvGw };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, FlowNodeToStep excConvGwToStep) {
		if (ruleResult.getCorrObjects().contains(excConvGwToStep)) {
			return new Object[] { ruleResult, excConvGwToStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, NormalStep step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlowAlternative alt) {
		if (ruleResult.getTargetObjects().contains(alt)) {
			return new Object[] { ruleResult, alt };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Step nextStep) {
		if (ruleResult.getTargetObjects().contains(nextStep)) {
			return new Object[] { ruleResult, nextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult,
			FlowNodeToStep nextNodeToNextStep) {
		if (ruleResult.getCorrObjects().contains(nextNodeToNextStep)) {
			return new Object[] { ruleResult, nextNodeToNextStep };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, FlowNode nextNode) {
		if (ruleResult.getSourceObjects().contains(nextNode)) {
			return new Object[] { ruleResult, nextNode };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow outFlow) {
		if (ruleResult.getSourceObjects().contains(outFlow)) {
			return new Object[] { ruleResult, outFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ContinuationRule_12_2_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList excConvGwToStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpExcConvGwToStep : excConvGwToStepList
					.getEntryObjects()) {
				if (tmpExcConvGwToStep instanceof FlowNodeToStep) {
					FlowNodeToStep excConvGwToStep = (FlowNodeToStep) tmpExcConvGwToStep;
					FlowNode tmpExcConvGw = excConvGwToStep.getSource();
					if (tmpExcConvGw instanceof ExclusiveGateway) {
						ExclusiveGateway excConvGw = (ExclusiveGateway) tmpExcConvGw;
						Step tmpStep = excConvGwToStep.getTarget();
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							Step nextStep = step.getNext();
							if (nextStep != null) {
								if (!nextStep.equals(step)) {
									if (pattern_ContinuationRule_12_2_black_nac_2BB(
											ruleResult, excConvGwToStep) == null) {
										if (pattern_ContinuationRule_12_2_black_nac_1BB(
												ruleResult, excConvGw) == null) {
											if (pattern_ContinuationRule_12_2_black_nac_3BB(
													ruleResult, step) == null) {
												if (pattern_ContinuationRule_12_2_black_nac_7BB(
														ruleResult, nextStep) == null) {
													for (SequenceFlow inFlow : excConvGw
															.getIncoming()) {
														if (pattern_ContinuationRule_12_2_black_nac_0BB(
																ruleResult,
																inFlow) == null) {
															for (SequenceFlow outFlow : excConvGw
																	.getOutgoing()) {
																if (!inFlow
																		.equals(outFlow)) {
																	FlowNode nextNode = outFlow
																			.getTargetRef();
																	if (nextNode != null) {
																		if (!excConvGw
																				.equals(nextNode)) {
																			if (pattern_ContinuationRule_12_2_black_nac_10BB(
																					ruleResult,
																					outFlow) == null) {
																				if (pattern_ContinuationRule_12_2_black_nac_9BB(
																						ruleResult,
																						nextNode) == null) {
																					for (StepAlternative tmpAlt : step
																							.getStepAlternative()) {
																						if (tmpAlt instanceof AlternativeFlowAlternative) {
																							AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
																							NamedFlow tmpFlow = alt
																									.getRef();
																							if (tmpFlow instanceof AlternativeFlow) {
																								AlternativeFlow flow = (AlternativeFlow) tmpFlow;
																								if (pattern_ContinuationRule_12_2_black_nac_4BB(
																										ruleResult,
																										alt) == null) {
																									if (pattern_ContinuationRule_12_2_black_nac_5BB(
																											ruleResult,
																											flow) == null) {
																										for (FlowNodeToStep nextNodeToNextStep : org.moflon.util.eMoflonEMFUtil
																												.getOppositeReferenceTyped(
																														nextStep,
																														FlowNodeToStep.class,
																														"target")) {
																											if (!excConvGwToStep
																													.equals(nextNodeToNextStep)) {
																												if (nextNode
																														.equals(nextNodeToNextStep
																																.getSource())) {
																													if (pattern_ContinuationRule_12_2_black_nac_8BB(
																															ruleResult,
																															nextNodeToNextStep) == null) {
																														for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
																																.getOppositeReferenceTyped(
																																		inFlow,
																																		SequenceFlowToUCFlow.class,
																																		"source")) {
																															if (flow.equals(inFlowToFlow
																																	.getTarget())) {
																																if (pattern_ContinuationRule_12_2_black_nac_6BB(
																																		ruleResult,
																																		inFlowToFlow) == null) {
																																	_result.add(new Object[] {
																																			excConvGwToStepList,
																																			inFlow,
																																			excConvGw,
																																			excConvGwToStep,
																																			step,
																																			alt,
																																			flow,
																																			inFlowToFlow,
																																			nextStep,
																																			nextNodeToNextStep,
																																			nextNode,
																																			outFlow,
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
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_12_3_bindingFBBBBBBBBBBBBBB(
			ContinuationRule _this, IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, inFlow, excConvGw, outFlow, nextNode, alt,
				flow, inFlowToFlow, step, excConvGwToStep, nextStep,
				nextNodeToNextStep, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, inFlow,
					excConvGw, outFlow, nextNode, alt, flow, inFlowToFlow,
					step, excConvGwToStep, nextStep, nextNodeToNextStep,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinuationRule_12_3_bindingAndBlackFBBBBBBBBBBBBBB(
			ContinuationRule _this, IsApplicableMatch isApplicableMatch,
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ContinuationRule_12_3_binding = pattern_ContinuationRule_12_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, inFlow, excConvGw, outFlow, nextNode,
				alt, flow, inFlowToFlow, step, excConvGwToStep, nextStep,
				nextNodeToNextStep, ruleResult);
		if (result_pattern_ContinuationRule_12_3_binding != null) {
			CSP csp = (CSP) result_pattern_ContinuationRule_12_3_binding[0];

			Object[] result_pattern_ContinuationRule_12_3_black = pattern_ContinuationRule_12_3_blackB(csp);
			if (result_pattern_ContinuationRule_12_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, inFlow,
						excConvGw, outFlow, nextNode, alt, flow, inFlowToFlow,
						step, excConvGwToStep, nextStep, nextNodeToNextStep,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinuationRule_12_4_expressionFBB(
			ContinuationRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinuationRule_12_5_blackBBBBBBBBBBB(
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep) {
		if (!inFlow.equals(outFlow)) {
			if (!excConvGw.equals(nextNode)) {
				if (!excConvGwToStep.equals(nextNodeToNextStep)) {
					if (!nextStep.equals(step)) {
						return new Object[] { inFlow, excConvGw, outFlow,
								nextNode, alt, flow, inFlowToFlow, step,
								excConvGwToStep, nextStep, nextNodeToNextStep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_6_blackBBBBBBBBBBBB(
			SequenceFlow inFlow, ExclusiveGateway excConvGw,
			SequenceFlow outFlow, FlowNode nextNode,
			AlternativeFlowAlternative alt, AlternativeFlow flow,
			SequenceFlowToUCFlow inFlowToFlow, NormalStep step,
			FlowNodeToStep excConvGwToStep, Step nextStep,
			FlowNodeToStep nextNodeToNextStep,
			ModelgeneratorRuleResult ruleResult) {
		if (!inFlow.equals(outFlow)) {
			if (!excConvGw.equals(nextNode)) {
				if (!excConvGwToStep.equals(nextNodeToNextStep)) {
					if (!nextStep.equals(step)) {
						return new Object[] { inFlow, excConvGw, outFlow,
								nextNode, alt, flow, inFlowToFlow, step,
								excConvGwToStep, nextStep, nextNodeToNextStep,
								ruleResult };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinuationRule_12_6_greenBBB(
			AlternativeFlowAlternative alt, Step nextStep,
			ModelgeneratorRuleResult ruleResult) {
		alt.setContinuation(nextStep);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { alt, nextStep, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ContinuationRule_12_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ContinuationRuleImpl
