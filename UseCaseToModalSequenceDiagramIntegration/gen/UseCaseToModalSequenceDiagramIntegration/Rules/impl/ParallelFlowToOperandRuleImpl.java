/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.ValueSpecification;

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
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;

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
 * An implementation of the model object '<em><b>Parallel Flow To Operand Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelFlowToOperandRuleImpl extends AbstractRuleImpl implements
		ParallelFlowToOperandRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelFlowToOperandRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelFlowToOperandRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		// initial bindings
		Object[] result1_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_0_1_blackBBBBBB(this, match,
						step, parFlow, useCase, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_0_2_bindingAndBlackFBBBBBB(
						this, match, step, parFlow, useCase, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_4_blackBBBBB(match,
							step, parFlow, useCase, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_4_greenBBBBFF(match,
							step, parFlow, useCase);
			// EMoflonEdge step__parFlow____invokedFlows = (EMoflonEdge) result4_green[4];
			// EMoflonEdge useCase__parFlow____flows = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_5_blackBBBBB(match,
							step, parFlow, useCase, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_5_greenBBBBFF(match,
							step, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_6_expressionBBBBBB(
							this, match, step, parFlow, useCase, flow);
			return ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_7_expressionF();
		} else {
			return ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[0];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[1];
		ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result1_bindingAndBlack[2];
		ParallelFlow parFlow = (ParallelFlow) result1_bindingAndBlack[3];
		UseCase useCase = (UseCase) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_1_greenBBFFFFB(combo,
						parFlow, csp);
		InteractionOperand operand = (InteractionOperand) result1_green[2];
		FlowToInteractionFragment parFlowToOperand = (FlowToInteractionFragment) result1_green[3];
		InteractionConstraint guard = (InteractionConstraint) result1_green[4];
		LiteralString spec = (LiteralString) result1_green[5];

		// collect translated elements
		Object[] result2_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_2_blackBBBBB(parFlow,
						operand, parFlowToOperand, guard, spec);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_2_greenFBBBBB(parFlow,
						operand, parFlowToOperand, guard, spec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_3_blackBBBBBBBBBBB(
						ruleresult, combo, step, stepToCombo, parFlow, useCase,
						flow, operand, parFlowToOperand, guard, spec);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_3_greenBBBBBBBBBFFFFFFF(
						ruleresult, combo, step, parFlow, useCase, operand,
						parFlowToOperand, guard, spec);
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[9];
		// EMoflonEdge step__parFlow____invokedFlows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__parFlow____flows = (EMoflonEdge) result3_green[11];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[12];
		// EMoflonEdge parFlowToOperand__parFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge parFlowToOperand__operand____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_5_expressionBBBBBBBBBBBB(
						this, ruleresult, combo, step, stepToCombo, parFlow,
						useCase, flow, operand, parFlowToOperand, guard, spec);
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ParallelStep step = (ParallelStep) result2_binding[0];
		ParallelFlow parFlow = (ParallelFlow) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_2_2_blackFBFBBBB(step,
						parFlow, useCase, flow, match)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_2_3_blackBBBBBB(combo,
							step, stepToCombo, parFlow, useCase, flow)) {
				Object[] result3_green = ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_2_3_greenBBBBBBFFFFFFF(
								combo, step, stepToCombo, parFlow, useCase,
								flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge step__parFlow____invokedFlows = (EMoflonEdge) result3_green[7];
				// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__parFlow____flows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, combo, step,
								stepToCombo, parFlow, useCase, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("parFlow", parFlow);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {// Create CSP
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
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"parFlow.name", true, csp);
		var_parFlow_name.setValue(parFlow.getName());
		var_parFlow_name.setType("String");

		// Create unbound variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parFlow_name, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("parFlow", parFlow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
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
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("parFlow", parFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("parFlowToOperand", parFlowToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("parFlow")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		// initial bindings
		Object[] result1_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_10_1_blackBBBBBB(this,
						match, combo, operand, guard, spec);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_10_2_bindingAndBlackFBBBBBB(
						this, match, combo, operand, guard, spec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_4_blackBBBBB(match,
							combo, operand, guard, spec);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_4_greenBBBBBFFF(
							match, combo, operand, guard, spec);
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result4_green[5];
			// EMoflonEdge operand__guard____guard = (EMoflonEdge) result4_green[6];
			// EMoflonEdge guard__spec____specification = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_5_blackBBBBB(match,
							combo, operand, guard, spec);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_5_greenBB(match,
							combo);

			// register objects to match
			ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_6_expressionBBBBBB(
							this, match, combo, operand, guard, spec);
			return ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_7_expressionF();
		} else {
			return ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_1_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[0];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[1];
		ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[5];
		InteractionConstraint guard = (InteractionConstraint) result1_bindingAndBlack[6];
		LiteralString spec = (LiteralString) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_1_greenBFBBFB(step,
						useCase, operand, csp);
		ParallelFlow parFlow = (ParallelFlow) result1_green[1];
		FlowToInteractionFragment parFlowToOperand = (FlowToInteractionFragment) result1_green[4];

		// collect translated elements
		Object[] result2_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_2_blackBBBBB(parFlow,
						operand, parFlowToOperand, guard, spec);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_2_greenFBBBBB(parFlow,
						operand, parFlowToOperand, guard, spec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_3_blackBBBBBBBBBBB(
						ruleresult, combo, step, stepToCombo, parFlow, useCase,
						flow, operand, parFlowToOperand, guard, spec);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_3_greenBBBBBBBBBFFFFFFF(
						ruleresult, combo, step, parFlow, useCase, operand,
						parFlowToOperand, guard, spec);
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[9];
		// EMoflonEdge step__parFlow____invokedFlows = (EMoflonEdge) result3_green[10];
		// EMoflonEdge useCase__parFlow____flows = (EMoflonEdge) result3_green[11];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[12];
		// EMoflonEdge parFlowToOperand__parFlow____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge parFlowToOperand__operand____target = (EMoflonEdge) result3_green[14];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_5_expressionBBBBBBBBBBBB(
						this, ruleresult, combo, step, stepToCombo, parFlow,
						useCase, flow, operand, parFlowToOperand, guard, spec);
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		CombinedFragment combo = (CombinedFragment) result2_binding[0];
		InteractionOperand operand = (InteractionOperand) result2_binding[1];
		InteractionConstraint guard = (InteractionConstraint) result2_binding[2];
		LiteralString spec = (LiteralString) result2_binding[3];
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_12_2_blackBFFBBBB(combo,
						operand, guard, spec, match)) {
			ParallelStep step = (ParallelStep) result2_black[1];
			ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_12_3_blackBBBFFBBB(
							combo, step, stepToCombo, operand, guard, spec)) {
				UseCase useCase = (UseCase) result3_black[3];
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_12_3_greenBBBBBBBBFFFFFFFF(
								combo, step, stepToCombo, useCase, flow,
								operand, guard, spec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[9];
				// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[14];
				// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_12_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, combo, step,
								stepToCombo, useCase, flow, operand, guard,
								spec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {// Create CSP
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
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("String");

		// Create unbound variables
		Variable var_parFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"parFlow.name", csp);
		var_parFlow_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parFlow_name, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("guard", guard);
		isApplicableMatch.registerObject("spec", spec);
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
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("parFlow", parFlow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("parFlowToOperand", parFlowToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("operand")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionOperand())
				&& match.getObject("guard")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getInteractionConstraint())
				&& match.getObject("spec")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getLiteralString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_77(
			EMoflonEdge _edge_operand) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_20_2_blackFFFFB(_edge_operand)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Object[] result2_green = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_20_3_expressionFBBBBBB(
							this, match, combo, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_233(
			EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_21_2_blackFFFFB(_edge_invokedFlows)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			ParallelFlow parFlow = (ParallelFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_21_3_expressionFBBBBBB(
							this, match, step, parFlow, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_234(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_22_2_blackFFFFB(_edge_flows)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			ParallelFlow parFlow = (ParallelFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			Flow flow = (Flow) result2_black[3];
			Object[] result2_green = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_22_3_expressionFBBBBBB(
							this, match, step, parFlow, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_78(
			EMoflonEdge _edge_guard) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_23_2_blackFFFFB(_edge_guard)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Object[] result2_green = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_23_3_expressionFBBBBBB(
							this, match, combo, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_79(
			EMoflonEdge _edge_specification) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_24_2_blackFFFFB(_edge_specification)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Object[] result2_green = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_24_3_expressionFBBBBBB(
							this, match, combo, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_24_6_expressionFB(__result);
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
			ParallelStepToCombinedFragment stepToComboParameter) {
		// create result
		Object[] result1_black = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_27_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_27_2_blackFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList stepToComboList = (RuleEntryList) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_27_3_bindingAndBlackFBBBBBBBB(
							this, isApplicableMatch, combo, step, stepToCombo,
							useCase, flow, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelFlowToOperandRuleImpl
					.pattern_ParallelFlowToOperandRule_27_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = ParallelFlowToOperandRuleImpl
						.pattern_ParallelFlowToOperandRule_27_5_blackBBBBB(
								combo, step, stepToCombo, useCase, flow);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_27_6_blackBBBBBB(
									combo, step, stepToCombo, useCase, flow,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ParallelFlowToOperandRuleImpl
							.pattern_ParallelFlowToOperandRule_27_6_greenBBFBFFFFBB(
									combo, step, useCase, ruleResult, csp);
					// ParallelFlow parFlow = (ParallelFlow) result6_green[2];
					// InteractionOperand operand = (InteractionOperand) result6_green[4];
					// FlowToInteractionFragment parFlowToOperand = (FlowToInteractionFragment) result6_green[5];
					// InteractionConstraint guard = (InteractionConstraint) result6_green[6];
					// LiteralString spec = (LiteralString) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ParallelFlowToOperandRuleImpl
				.pattern_ParallelFlowToOperandRule_27_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_parFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"parFlow.name", csp);
		var_parFlow_name.setType("String");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parFlow_name, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
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
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2),
					(UseCase) arguments.get(3), (Flow) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_PARALLELFLOW_USECASE_FLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(ParallelStep) arguments.get(2),
					(ParallelStepToCombinedFragment) arguments.get(3),
					(ParallelFlow) arguments.get(4),
					(UseCase) arguments.get(5), (Flow) arguments.get(6));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_USECASE_FLOW_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(ParallelStep) arguments.get(2),
					(ParallelStepToCombinedFragment) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_77((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_233__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_233((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_234__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_234((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_78((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_79((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PARALLELSTEPTOCOMBINEDFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(ParallelStepToCombinedFragment) arguments.get(1));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_USECASE_FLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(ParallelStep) arguments.get(2),
					(ParallelStepToCombinedFragment) arguments.get(3),
					(UseCase) arguments.get(4), (Flow) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_1_blackBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		if (!flow.equals(parFlow)) {
			return new Object[] { _this, match, step, parFlow, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_2_bindingFBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, step,
				parFlow, useCase, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, parFlow, useCase,
					flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_2_bindingAndBlackFBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		Object[] result_pattern_ParallelFlowToOperandRule_0_2_binding = pattern_ParallelFlowToOperandRule_0_2_bindingFBBBBBB(
				_this, match, step, parFlow, useCase, flow);
		if (result_pattern_ParallelFlowToOperandRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_0_2_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_0_2_black = pattern_ParallelFlowToOperandRule_0_2_blackB(csp);
			if (result_pattern_ParallelFlowToOperandRule_0_2_black != null) {

				return new Object[] { csp, _this, match, step, parFlow,
						useCase, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_0_3_expressionFBB(
			ParallelFlowToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_4_blackBBBBB(
			Match match, ParallelStep step, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {
		if (!flow.equals(parFlow)) {
			return new Object[] { match, step, parFlow, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_4_greenBBBBFF(
			Match match, ParallelStep step, ParallelFlow parFlow,
			UseCase useCase) {
		EMoflonEdge step__parFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parFlow);
		String step__parFlow____invokedFlows_name_prime = "invokedFlows";
		String useCase__parFlow____flows_name_prime = "flows";
		step__parFlow____invokedFlows.setSrc(step);
		step__parFlow____invokedFlows.setTrg(parFlow);
		match.getToBeTranslatedEdges().add(step__parFlow____invokedFlows);
		useCase__parFlow____flows.setSrc(useCase);
		useCase__parFlow____flows.setTrg(parFlow);
		match.getToBeTranslatedEdges().add(useCase__parFlow____flows);
		step__parFlow____invokedFlows
				.setName(step__parFlow____invokedFlows_name_prime);
		useCase__parFlow____flows.setName(useCase__parFlow____flows_name_prime);
		return new Object[] { match, step, parFlow, useCase,
				step__parFlow____invokedFlows, useCase__parFlow____flows };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_5_blackBBBBB(
			Match match, ParallelStep step, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {
		if (!flow.equals(parFlow)) {
			return new Object[] { match, step, parFlow, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_0_5_greenBBBBFF(
			Match match, ParallelStep step, UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(step);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, step, useCase, flow,
				useCase__flow____flows, flow__step____steps };
	}

	public static final void pattern_ParallelFlowToOperandRule_0_6_expressionBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		_this.registerObjectsToMatch_FWD(match, step, parFlow, useCase, flow);

	}

	public static final boolean pattern_ParallelFlowToOperandRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("combo");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("stepToCombo");
		EObject _localVariable_3 = isApplicableMatch.getObject("parFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject tmpCombo = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpStepToCombo = _localVariable_2;
		EObject tmpParFlow = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpStepToCombo instanceof ParallelStepToCombinedFragment) {
					ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) tmpStepToCombo;
					if (tmpParFlow instanceof ParallelFlow) {
						ParallelFlow parFlow = (ParallelFlow) tmpParFlow;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								return new Object[] { combo, step, stepToCombo,
										parFlow, useCase, flow,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_1_blackBBBBBBFBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, ParallelFlow parFlow,
			UseCase useCase, Flow flow, ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!flow.equals(parFlow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { combo, step, stepToCombo, parFlow,
							useCase, flow, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_1_bindingAndBlackFFFFFFFBB(
			ParallelFlowToOperandRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelFlowToOperandRule_1_1_binding = pattern_ParallelFlowToOperandRule_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelFlowToOperandRule_1_1_binding != null) {
			CombinedFragment combo = (CombinedFragment) result_pattern_ParallelFlowToOperandRule_1_1_binding[0];
			ParallelStep step = (ParallelStep) result_pattern_ParallelFlowToOperandRule_1_1_binding[1];
			ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result_pattern_ParallelFlowToOperandRule_1_1_binding[2];
			ParallelFlow parFlow = (ParallelFlow) result_pattern_ParallelFlowToOperandRule_1_1_binding[3];
			UseCase useCase = (UseCase) result_pattern_ParallelFlowToOperandRule_1_1_binding[4];
			Flow flow = (Flow) result_pattern_ParallelFlowToOperandRule_1_1_binding[5];

			Object[] result_pattern_ParallelFlowToOperandRule_1_1_black = pattern_ParallelFlowToOperandRule_1_1_blackBBBBBBFBB(
					combo, step, stepToCombo, parFlow, useCase, flow, _this,
					isApplicableMatch);
			if (result_pattern_ParallelFlowToOperandRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_1_1_black[6];

				return new Object[] { combo, step, stepToCombo, parFlow,
						useCase, flow, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_1_greenBBFFFFB(
			CombinedFragment combo, ParallelFlow parFlow, CSP csp) {
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		FlowToInteractionFragment parFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		Object _localVariable_0 = csp.getValue("spec", "value");
		combo.getOperand().add(operand);
		parFlowToOperand.setSource(parFlow);
		parFlowToOperand.setTarget(operand);
		operand.setGuard(guard);
		guard.setSpecification(spec);
		String spec_value_prime = (String) _localVariable_0;
		spec.setValue(spec_value_prime);
		return new Object[] { combo, parFlow, operand, parFlowToOperand, guard,
				spec, csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_2_blackBBBBB(
			ParallelFlow parFlow, InteractionOperand operand,
			FlowToInteractionFragment parFlowToOperand,
			InteractionConstraint guard, LiteralString spec) {
		return new Object[] { parFlow, operand, parFlowToOperand, guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_2_greenFBBBBB(
			ParallelFlow parFlow, InteractionOperand operand,
			FlowToInteractionFragment parFlowToOperand,
			InteractionConstraint guard, LiteralString spec) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parFlow);
		ruleresult.getCreatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(parFlowToOperand);
		ruleresult.getCreatedElements().add(guard);
		ruleresult.getCreatedElements().add(spec);
		return new Object[] { ruleresult, parFlow, operand, parFlowToOperand,
				guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject combo, EObject step,
			EObject stepToCombo, EObject parFlow, EObject useCase,
			EObject flow, EObject operand, EObject parFlowToOperand,
			EObject guard, EObject spec) {
		if (!combo.equals(step)) {
			if (!combo.equals(stepToCombo)) {
				if (!combo.equals(parFlow)) {
					if (!combo.equals(useCase)) {
						if (!combo.equals(flow)) {
							if (!combo.equals(operand)) {
								if (!combo.equals(parFlowToOperand)) {
									if (!combo.equals(guard)) {
										if (!combo.equals(spec)) {
											if (!step.equals(stepToCombo)) {
												if (!step.equals(useCase)) {
													if (!stepToCombo
															.equals(useCase)) {
														if (!parFlow
																.equals(step)) {
															if (!parFlow
																	.equals(stepToCombo)) {
																if (!parFlow
																		.equals(useCase)) {
																	if (!parFlow
																			.equals(parFlowToOperand)) {
																		if (!parFlow
																				.equals(spec)) {
																			if (!flow
																					.equals(step)) {
																				if (!flow
																						.equals(stepToCombo)) {
																					if (!flow
																							.equals(parFlow)) {
																						if (!flow
																								.equals(useCase)) {
																							if (!flow
																									.equals(operand)) {
																								if (!flow
																										.equals(parFlowToOperand)) {
																									if (!flow
																											.equals(guard)) {
																										if (!flow
																												.equals(spec)) {
																											if (!operand
																													.equals(step)) {
																												if (!operand
																														.equals(stepToCombo)) {
																													if (!operand
																															.equals(parFlow)) {
																														if (!operand
																																.equals(useCase)) {
																															if (!operand
																																	.equals(parFlowToOperand)) {
																																if (!operand
																																		.equals(spec)) {
																																	if (!parFlowToOperand
																																			.equals(step)) {
																																		if (!parFlowToOperand
																																				.equals(stepToCombo)) {
																																			if (!parFlowToOperand
																																					.equals(useCase)) {
																																				if (!parFlowToOperand
																																						.equals(spec)) {
																																					if (!guard
																																							.equals(step)) {
																																						if (!guard
																																								.equals(stepToCombo)) {
																																							if (!guard
																																									.equals(parFlow)) {
																																								if (!guard
																																										.equals(useCase)) {
																																									if (!guard
																																											.equals(operand)) {
																																										if (!guard
																																												.equals(parFlowToOperand)) {
																																											if (!guard
																																													.equals(spec)) {
																																												if (!spec
																																														.equals(step)) {
																																													if (!spec
																																															.equals(stepToCombo)) {
																																														if (!spec
																																																.equals(useCase)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	combo,
																																																	step,
																																																	stepToCombo,
																																																	parFlow,
																																																	useCase,
																																																	flow,
																																																	operand,
																																																	parFlowToOperand,
																																																	guard,
																																																	spec };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelFlowToOperandRule_1_3_greenBBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject combo, EObject step,
			EObject parFlow, EObject useCase, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__parFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parFlowToOperand__parFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelFlowToOperandRule";
		String combo__operand____operand_name_prime = "operand";
		String step__parFlow____invokedFlows_name_prime = "invokedFlows";
		String useCase__parFlow____flows_name_prime = "flows";
		String operand__guard____guard_name_prime = "guard";
		String parFlowToOperand__parFlow____source_name_prime = "source";
		String parFlowToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getCreatedEdges().add(combo__operand____operand);
		step__parFlow____invokedFlows.setSrc(step);
		step__parFlow____invokedFlows.setTrg(parFlow);
		ruleresult.getTranslatedEdges().add(step__parFlow____invokedFlows);
		useCase__parFlow____flows.setSrc(useCase);
		useCase__parFlow____flows.setTrg(parFlow);
		ruleresult.getTranslatedEdges().add(useCase__parFlow____flows);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getCreatedEdges().add(operand__guard____guard);
		parFlowToOperand__parFlow____source.setSrc(parFlowToOperand);
		parFlowToOperand__parFlow____source.setTrg(parFlow);
		ruleresult.getCreatedEdges().add(parFlowToOperand__parFlow____source);
		parFlowToOperand__operand____target.setSrc(parFlowToOperand);
		parFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(parFlowToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getCreatedEdges().add(guard__spec____specification);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		step__parFlow____invokedFlows
				.setName(step__parFlow____invokedFlows_name_prime);
		useCase__parFlow____flows.setName(useCase__parFlow____flows_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		parFlowToOperand__parFlow____source
				.setName(parFlowToOperand__parFlow____source_name_prime);
		parFlowToOperand__operand____target
				.setName(parFlowToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { ruleresult, combo, step, parFlow, useCase,
				operand, parFlowToOperand, guard, spec,
				combo__operand____operand, step__parFlow____invokedFlows,
				useCase__parFlow____flows, operand__guard____guard,
				parFlowToOperand__parFlow____source,
				parFlowToOperand__operand____target,
				guard__spec____specification };
	}

	public static final void pattern_ParallelFlowToOperandRule_1_5_expressionBBBBBBBBBBBB(
			ParallelFlowToOperandRule _this, PerformRuleResult ruleresult,
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		_this.registerObjects_FWD(ruleresult, combo, step, stepToCombo,
				parFlow, useCase, flow, operand, parFlowToOperand, guard, spec);

	}

	public static final PerformRuleResult pattern_ParallelFlowToOperandRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_1_blackFBB(
			EClass eClass, ParallelFlowToOperandRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_2_1_binding = pattern_ParallelFlowToOperandRule_2_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelFlowToOperandRule_2_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_2_1_black = pattern_ParallelFlowToOperandRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelFlowToOperandRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("parFlow");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject _localVariable_3 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpParFlow = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			if (tmpParFlow instanceof ParallelFlow) {
				ParallelFlow parFlow = (ParallelFlow) tmpParFlow;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						return new Object[] { step, parFlow, useCase, flow,
								match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_2_2_blackFBFBBBB(
			ParallelStep step, ParallelFlow parFlow, UseCase useCase,
			Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(parFlow)) {
			for (ParallelStepToCombinedFragment stepToCombo : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(step,
							ParallelStepToCombinedFragment.class, "source")) {
				CombinedFragment combo = stepToCombo.getTarget();
				if (combo != null) {
					_result.add(new Object[] { combo, step, stepToCombo,
							parFlow, useCase, flow, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_2_3_blackBBBBBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(parFlow)) {
			if (step.getInvokedFlows().contains(parFlow)) {
				if (step.equals(stepToCombo.getSource())) {
					if (combo.equals(stepToCombo.getTarget())) {
						if (useCase.getFlows().contains(flow)) {
							if (useCase.getFlows().contains(parFlow)) {
								if (flow.getSteps().contains(step)) {
									_result.add(new Object[] { combo, step,
											stepToCombo, parFlow, useCase, flow });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_3_greenBBBBBBFFFFFFF(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, ParallelFlow parFlow,
			UseCase useCase, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge step__parFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String step__parFlow____invokedFlows_name_prime = "invokedFlows";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__parFlow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(stepToCombo);
		isApplicableMatch.getAllContextElements().add(parFlow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		step__parFlow____invokedFlows.setSrc(step);
		step__parFlow____invokedFlows.setTrg(parFlow);
		isApplicableMatch.getAllContextElements().add(
				step__parFlow____invokedFlows);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__combo____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__parFlow____flows.setSrc(useCase);
		useCase__parFlow____flows.setTrg(parFlow);
		isApplicableMatch.getAllContextElements()
				.add(useCase__parFlow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		step__parFlow____invokedFlows
				.setName(step__parFlow____invokedFlows_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__parFlow____flows.setName(useCase__parFlow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { combo, step, stepToCombo, parFlow, useCase, flow,
				isApplicableMatch, step__parFlow____invokedFlows,
				stepToCombo__step____source, stepToCombo__combo____target,
				useCase__flow____flows, useCase__parFlow____flows,
				flow__step____steps };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_4_bindingFBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, combo, step, stepToCombo, parFlow, useCase,
				flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, combo, step,
					stepToCombo, parFlow, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_4_bindingAndBlackFBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		Object[] result_pattern_ParallelFlowToOperandRule_2_4_binding = pattern_ParallelFlowToOperandRule_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, combo, step, stepToCombo, parFlow,
				useCase, flow);
		if (result_pattern_ParallelFlowToOperandRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_2_4_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_2_4_black = pattern_ParallelFlowToOperandRule_2_4_blackB(csp);
			if (result_pattern_ParallelFlowToOperandRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, combo,
						step, stepToCombo, parFlow, useCase, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_2_5_expressionFBB(
			ParallelFlowToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelFlowToOperandRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelFlowToOperandRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_1_blackBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		return new Object[] { _this, match, combo, operand, guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_2_bindingFBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, combo,
				operand, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, combo, operand, guard,
					spec };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_2_bindingAndBlackFBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_ParallelFlowToOperandRule_10_2_binding = pattern_ParallelFlowToOperandRule_10_2_bindingFBBBBBB(
				_this, match, combo, operand, guard, spec);
		if (result_pattern_ParallelFlowToOperandRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_10_2_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_10_2_black = pattern_ParallelFlowToOperandRule_10_2_blackB(csp);
			if (result_pattern_ParallelFlowToOperandRule_10_2_black != null) {

				return new Object[] { csp, _this, match, combo, operand, guard,
						spec };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_10_3_expressionFBB(
			ParallelFlowToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_4_blackBBBBB(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		return new Object[] { match, combo, operand, guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_4_greenBBBBBFFF(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(operand);
		match.getToBeTranslatedNodes().add(guard);
		match.getToBeTranslatedNodes().add(spec);
		String combo__operand____operand_name_prime = "operand";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		match.getToBeTranslatedEdges().add(combo__operand____operand);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		match.getToBeTranslatedEdges().add(operand__guard____guard);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		match.getToBeTranslatedEdges().add(guard__spec____specification);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { match, combo, operand, guard, spec,
				combo__operand____operand, operand__guard____guard,
				guard__spec____specification };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_5_blackBBBBB(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		return new Object[] { match, combo, operand, guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_10_5_greenBB(
			Match match, CombinedFragment combo) {
		match.getContextNodes().add(combo);
		return new Object[] { match, combo };
	}

	public static final void pattern_ParallelFlowToOperandRule_10_6_expressionBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		_this.registerObjectsToMatch_BWD(match, combo, operand, guard, spec);

	}

	public static final boolean pattern_ParallelFlowToOperandRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("combo");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("stepToCombo");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("operand");
		EObject _localVariable_6 = isApplicableMatch.getObject("guard");
		EObject _localVariable_7 = isApplicableMatch.getObject("spec");
		EObject tmpCombo = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpStepToCombo = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpOperand = _localVariable_5;
		EObject tmpGuard = _localVariable_6;
		EObject tmpSpec = _localVariable_7;
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpStepToCombo instanceof ParallelStepToCombinedFragment) {
					ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) tmpStepToCombo;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpOperand instanceof InteractionOperand) {
								InteractionOperand operand = (InteractionOperand) tmpOperand;
								if (tmpGuard instanceof InteractionConstraint) {
									InteractionConstraint guard = (InteractionConstraint) tmpGuard;
									if (tmpSpec instanceof LiteralString) {
										LiteralString spec = (LiteralString) tmpSpec;
										return new Object[] { combo, step,
												stepToCombo, useCase, flow,
												operand, guard, spec,
												isApplicableMatch };
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

	public static final Object[] pattern_ParallelFlowToOperandRule_11_1_blackBBBBBBBBFBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { combo, step, stepToCombo, useCase, flow,
						operand, guard, spec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_1_bindingAndBlackFFFFFFFFFBB(
			ParallelFlowToOperandRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelFlowToOperandRule_11_1_binding = pattern_ParallelFlowToOperandRule_11_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelFlowToOperandRule_11_1_binding != null) {
			CombinedFragment combo = (CombinedFragment) result_pattern_ParallelFlowToOperandRule_11_1_binding[0];
			ParallelStep step = (ParallelStep) result_pattern_ParallelFlowToOperandRule_11_1_binding[1];
			ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result_pattern_ParallelFlowToOperandRule_11_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_ParallelFlowToOperandRule_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ParallelFlowToOperandRule_11_1_binding[4];
			InteractionOperand operand = (InteractionOperand) result_pattern_ParallelFlowToOperandRule_11_1_binding[5];
			InteractionConstraint guard = (InteractionConstraint) result_pattern_ParallelFlowToOperandRule_11_1_binding[6];
			LiteralString spec = (LiteralString) result_pattern_ParallelFlowToOperandRule_11_1_binding[7];

			Object[] result_pattern_ParallelFlowToOperandRule_11_1_black = pattern_ParallelFlowToOperandRule_11_1_blackBBBBBBBBFBB(
					combo, step, stepToCombo, useCase, flow, operand, guard,
					spec, _this, isApplicableMatch);
			if (result_pattern_ParallelFlowToOperandRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_11_1_black[8];

				return new Object[] { combo, step, stepToCombo, useCase, flow,
						operand, guard, spec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_1_greenBFBBFB(
			ParallelStep step, UseCase useCase, InteractionOperand operand,
			CSP csp) {
		ParallelFlow parFlow = UseCaseDSLFactory.eINSTANCE.createParallelFlow();
		FlowToInteractionFragment parFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("parFlow", "name");
		step.getInvokedFlows().add(parFlow);
		useCase.getFlows().add(parFlow);
		parFlowToOperand.setSource(parFlow);
		parFlowToOperand.setTarget(operand);
		String parFlow_name_prime = (String) _localVariable_0;
		parFlow.setName(parFlow_name_prime);
		return new Object[] { step, parFlow, useCase, operand,
				parFlowToOperand, csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_2_blackBBBBB(
			ParallelFlow parFlow, InteractionOperand operand,
			FlowToInteractionFragment parFlowToOperand,
			InteractionConstraint guard, LiteralString spec) {
		return new Object[] { parFlow, operand, parFlowToOperand, guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_2_greenFBBBBB(
			ParallelFlow parFlow, InteractionOperand operand,
			FlowToInteractionFragment parFlowToOperand,
			InteractionConstraint guard, LiteralString spec) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(parFlow);
		ruleresult.getTranslatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(parFlowToOperand);
		ruleresult.getTranslatedElements().add(guard);
		ruleresult.getTranslatedElements().add(spec);
		return new Object[] { ruleresult, parFlow, operand, parFlowToOperand,
				guard, spec };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject combo, EObject step,
			EObject stepToCombo, EObject parFlow, EObject useCase,
			EObject flow, EObject operand, EObject parFlowToOperand,
			EObject guard, EObject spec) {
		if (!combo.equals(step)) {
			if (!combo.equals(stepToCombo)) {
				if (!combo.equals(parFlow)) {
					if (!combo.equals(useCase)) {
						if (!combo.equals(flow)) {
							if (!combo.equals(operand)) {
								if (!combo.equals(parFlowToOperand)) {
									if (!combo.equals(guard)) {
										if (!combo.equals(spec)) {
											if (!step.equals(stepToCombo)) {
												if (!step.equals(useCase)) {
													if (!stepToCombo
															.equals(useCase)) {
														if (!parFlow
																.equals(step)) {
															if (!parFlow
																	.equals(stepToCombo)) {
																if (!parFlow
																		.equals(useCase)) {
																	if (!parFlow
																			.equals(parFlowToOperand)) {
																		if (!parFlow
																				.equals(spec)) {
																			if (!flow
																					.equals(step)) {
																				if (!flow
																						.equals(stepToCombo)) {
																					if (!flow
																							.equals(parFlow)) {
																						if (!flow
																								.equals(useCase)) {
																							if (!flow
																									.equals(operand)) {
																								if (!flow
																										.equals(parFlowToOperand)) {
																									if (!flow
																											.equals(guard)) {
																										if (!flow
																												.equals(spec)) {
																											if (!operand
																													.equals(step)) {
																												if (!operand
																														.equals(stepToCombo)) {
																													if (!operand
																															.equals(parFlow)) {
																														if (!operand
																																.equals(useCase)) {
																															if (!operand
																																	.equals(parFlowToOperand)) {
																																if (!operand
																																		.equals(spec)) {
																																	if (!parFlowToOperand
																																			.equals(step)) {
																																		if (!parFlowToOperand
																																				.equals(stepToCombo)) {
																																			if (!parFlowToOperand
																																					.equals(useCase)) {
																																				if (!parFlowToOperand
																																						.equals(spec)) {
																																					if (!guard
																																							.equals(step)) {
																																						if (!guard
																																								.equals(stepToCombo)) {
																																							if (!guard
																																									.equals(parFlow)) {
																																								if (!guard
																																										.equals(useCase)) {
																																									if (!guard
																																											.equals(operand)) {
																																										if (!guard
																																												.equals(parFlowToOperand)) {
																																											if (!guard
																																													.equals(spec)) {
																																												if (!spec
																																														.equals(step)) {
																																													if (!spec
																																															.equals(stepToCombo)) {
																																														if (!spec
																																																.equals(useCase)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	combo,
																																																	step,
																																																	stepToCombo,
																																																	parFlow,
																																																	useCase,
																																																	flow,
																																																	operand,
																																																	parFlowToOperand,
																																																	guard,
																																																	spec };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelFlowToOperandRule_11_3_greenBBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject combo, EObject step,
			EObject parFlow, EObject useCase, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__parFlow____invokedFlows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__parFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parFlowToOperand__parFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelFlowToOperandRule";
		String combo__operand____operand_name_prime = "operand";
		String step__parFlow____invokedFlows_name_prime = "invokedFlows";
		String useCase__parFlow____flows_name_prime = "flows";
		String operand__guard____guard_name_prime = "guard";
		String parFlowToOperand__parFlow____source_name_prime = "source";
		String parFlowToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getTranslatedEdges().add(combo__operand____operand);
		step__parFlow____invokedFlows.setSrc(step);
		step__parFlow____invokedFlows.setTrg(parFlow);
		ruleresult.getCreatedEdges().add(step__parFlow____invokedFlows);
		useCase__parFlow____flows.setSrc(useCase);
		useCase__parFlow____flows.setTrg(parFlow);
		ruleresult.getCreatedEdges().add(useCase__parFlow____flows);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getTranslatedEdges().add(operand__guard____guard);
		parFlowToOperand__parFlow____source.setSrc(parFlowToOperand);
		parFlowToOperand__parFlow____source.setTrg(parFlow);
		ruleresult.getCreatedEdges().add(parFlowToOperand__parFlow____source);
		parFlowToOperand__operand____target.setSrc(parFlowToOperand);
		parFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(parFlowToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getTranslatedEdges().add(guard__spec____specification);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		step__parFlow____invokedFlows
				.setName(step__parFlow____invokedFlows_name_prime);
		useCase__parFlow____flows.setName(useCase__parFlow____flows_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		parFlowToOperand__parFlow____source
				.setName(parFlowToOperand__parFlow____source_name_prime);
		parFlowToOperand__operand____target
				.setName(parFlowToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { ruleresult, combo, step, parFlow, useCase,
				operand, parFlowToOperand, guard, spec,
				combo__operand____operand, step__parFlow____invokedFlows,
				useCase__parFlow____flows, operand__guard____guard,
				parFlowToOperand__parFlow____source,
				parFlowToOperand__operand____target,
				guard__spec____specification };
	}

	public static final void pattern_ParallelFlowToOperandRule_11_5_expressionBBBBBBBBBBBB(
			ParallelFlowToOperandRule _this, PerformRuleResult ruleresult,
			EObject combo, EObject step, EObject stepToCombo, EObject parFlow,
			EObject useCase, EObject flow, EObject operand,
			EObject parFlowToOperand, EObject guard, EObject spec) {
		_this.registerObjects_BWD(ruleresult, combo, step, stepToCombo,
				parFlow, useCase, flow, operand, parFlowToOperand, guard, spec);

	}

	public static final PerformRuleResult pattern_ParallelFlowToOperandRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_1_blackFBB(
			EClass eClass, ParallelFlowToOperandRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_12_1_binding = pattern_ParallelFlowToOperandRule_12_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelFlowToOperandRule_12_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_12_1_black = pattern_ParallelFlowToOperandRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelFlowToOperandRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("combo");
		EObject _localVariable_1 = match.getObject("operand");
		EObject _localVariable_2 = match.getObject("guard");
		EObject _localVariable_3 = match.getObject("spec");
		EObject tmpCombo = _localVariable_0;
		EObject tmpOperand = _localVariable_1;
		EObject tmpGuard = _localVariable_2;
		EObject tmpSpec = _localVariable_3;
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (tmpGuard instanceof InteractionConstraint) {
					InteractionConstraint guard = (InteractionConstraint) tmpGuard;
					if (tmpSpec instanceof LiteralString) {
						LiteralString spec = (LiteralString) tmpSpec;
						return new Object[] { combo, operand, guard, spec,
								match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_12_2_blackBFFBBBB(
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ParallelStepToCombinedFragment stepToCombo : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(combo,
						ParallelStepToCombinedFragment.class, "target")) {
			ParallelStep step = stepToCombo.getSource();
			if (step != null) {
				_result.add(new Object[] { combo, step, stepToCombo, operand,
						guard, spec, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_12_3_blackBBBFFBBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (combo.getOperand().contains(operand)) {
			if (step.equals(stepToCombo.getSource())) {
				if (combo.equals(stepToCombo.getTarget())) {
					if (guard.equals(operand.getGuard())) {
						if (spec.equals(guard.getSpecification())) {
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(step,
											Flow.class, "steps")) {
								for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(flow,
												UseCase.class, "flows")) {
									_result.add(new Object[] { combo, step,
											stepToCombo, useCase, flow,
											operand, guard, spec });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_3_greenBBBBBBBBFFFFFFFF(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String combo__operand____operand_name_prime = "operand";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(stepToCombo);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(guard);
		isApplicableMatch.getAllContextElements().add(spec);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__combo____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		isApplicableMatch.getAllContextElements().add(operand__guard____guard);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		isApplicableMatch.getAllContextElements().add(
				guard__spec____specification);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { combo, step, stepToCombo, useCase, flow, operand,
				guard, spec, isApplicableMatch, combo__operand____operand,
				stepToCombo__step____source, stepToCombo__combo____target,
				useCase__flow____flows, flow__step____steps,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_4_bindingFBBBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			UseCase useCase, Flow flow, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, combo, step, stepToCombo, useCase, flow,
				operand, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, combo, step,
					stepToCombo, useCase, flow, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_4_bindingAndBlackFBBBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			UseCase useCase, Flow flow, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_ParallelFlowToOperandRule_12_4_binding = pattern_ParallelFlowToOperandRule_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, combo, step, stepToCombo, useCase,
				flow, operand, guard, spec);
		if (result_pattern_ParallelFlowToOperandRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_12_4_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_12_4_black = pattern_ParallelFlowToOperandRule_12_4_blackB(csp);
			if (result_pattern_ParallelFlowToOperandRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, combo,
						step, stepToCombo, useCase, flow, operand, guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_12_5_expressionFBB(
			ParallelFlowToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelFlowToOperandRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelFlowToOperandRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_1_blackFBB(
			EClass __eClass, ParallelFlowToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_20_1_binding = pattern_ParallelFlowToOperandRule_20_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelFlowToOperandRule_20_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_20_1_black = pattern_ParallelFlowToOperandRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_479236 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_479236 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_293467 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_293467)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_871205 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_871205)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_20_2_blackFFFFB(
			EMoflonEdge _edge_operand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_operand.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpOperand = _edge_operand.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (combo.getOperand().contains(operand)) {
					InteractionConstraint guard = operand.getGuard();
					if (guard != null) {
						ValueSpecification tmpSpec = guard.getSpecification();
						if (tmpSpec instanceof LiteralString) {
							LiteralString spec = (LiteralString) tmpSpec;
							if (pattern_ParallelFlowToOperandRule_20_2_black_nac_0B(operand) == null) {
								if (pattern_ParallelFlowToOperandRule_20_2_black_nac_1BB(
										operand, combo) == null) {
									if (pattern_ParallelFlowToOperandRule_20_2_black_nac_2BB(
											guard, operand) == null) {
										_result.add(new Object[] { combo,
												operand, guard, spec,
												_edge_operand });
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

	public static final Object[] pattern_ParallelFlowToOperandRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelFlowToOperandRule_20_3_expressionFBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_20_4_expressionFBB(
			ParallelFlowToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelFlowToOperandRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_1_blackFBB(
			EClass __eClass, ParallelFlowToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_21_1_binding = pattern_ParallelFlowToOperandRule_21_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelFlowToOperandRule_21_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_21_1_black = pattern_ParallelFlowToOperandRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_2_black_nac_0BB(
			ParallelFlow parFlow, ParallelStep step) {
		for (ParallelStep __DEC_parFlow_invokedFlows_54916 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(parFlow, ParallelStep.class,
						"invokedFlows")) {
			if (!step.equals(__DEC_parFlow_invokedFlows_54916)) {
				return new Object[] { parFlow, step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_21_2_blackFFFFB(
			EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_invokedFlows.getSrc();
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			EObject tmpParFlow = _edge_invokedFlows.getTrg();
			if (tmpParFlow instanceof ParallelFlow) {
				ParallelFlow parFlow = (ParallelFlow) tmpParFlow;
				if (step.getInvokedFlows().contains(parFlow)) {
					if (pattern_ParallelFlowToOperandRule_21_2_black_nac_0BB(
							parFlow, step) == null) {
						for (Flow flow : org.moflon.util.eMoflonEMFUtil
								.getOppositeReferenceTyped(step, Flow.class,
										"steps")) {
							if (!flow.equals(parFlow)) {
								for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(parFlow,
												UseCase.class, "flows")) {
									if (useCase.getFlows().contains(flow)) {
										_result.add(new Object[] { step,
												parFlow, useCase, flow,
												_edge_invokedFlows });
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

	public static final Object[] pattern_ParallelFlowToOperandRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelFlowToOperandRule_21_3_expressionFBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, step,
				parFlow, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_21_4_expressionFBB(
			ParallelFlowToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelFlowToOperandRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_1_blackFBB(
			EClass __eClass, ParallelFlowToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_22_1_binding = pattern_ParallelFlowToOperandRule_22_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelFlowToOperandRule_22_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_22_1_black = pattern_ParallelFlowToOperandRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_2_black_nac_0BB(
			ParallelFlow parFlow, ParallelStep step) {
		for (ParallelStep __DEC_parFlow_invokedFlows_487433 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(parFlow, ParallelStep.class,
						"invokedFlows")) {
			if (!step.equals(__DEC_parFlow_invokedFlows_487433)) {
				return new Object[] { parFlow, step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_22_2_blackFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpParFlow = _edge_flows.getTrg();
			if (tmpParFlow instanceof ParallelFlow) {
				ParallelFlow parFlow = (ParallelFlow) tmpParFlow;
				if (useCase.getFlows().contains(parFlow)) {
					for (Flow flow : useCase.getFlows()) {
						if (!flow.equals(parFlow)) {
							for (Step tmpStep : flow.getSteps()) {
								if (tmpStep instanceof ParallelStep) {
									ParallelStep step = (ParallelStep) tmpStep;
									if (step.getInvokedFlows()
											.contains(parFlow)) {
										if (pattern_ParallelFlowToOperandRule_22_2_black_nac_0BB(
												parFlow, step) == null) {
											_result.add(new Object[] { step,
													parFlow, useCase, flow,
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

		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelFlowToOperandRule_22_3_expressionFBBBBBB(
			ParallelFlowToOperandRule _this, Match match, ParallelStep step,
			ParallelFlow parFlow, UseCase useCase, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, step,
				parFlow, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_22_4_expressionFBB(
			ParallelFlowToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelFlowToOperandRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_1_blackFBB(
			EClass __eClass, ParallelFlowToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_23_1_binding = pattern_ParallelFlowToOperandRule_23_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelFlowToOperandRule_23_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_23_1_black = pattern_ParallelFlowToOperandRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_580408 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_580408 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_628198 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_628198)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_969535 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_969535)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_23_2_blackFFFFB(
			EMoflonEdge _edge_guard) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_guard.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpGuard = _edge_guard.getTrg();
			if (tmpGuard instanceof InteractionConstraint) {
				InteractionConstraint guard = (InteractionConstraint) tmpGuard;
				if (guard.equals(operand.getGuard())) {
					ValueSpecification tmpSpec = guard.getSpecification();
					if (tmpSpec instanceof LiteralString) {
						LiteralString spec = (LiteralString) tmpSpec;
						if (pattern_ParallelFlowToOperandRule_23_2_black_nac_0B(operand) == null) {
							if (pattern_ParallelFlowToOperandRule_23_2_black_nac_2BB(
									guard, operand) == null) {
								for (CombinedFragment combo : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(operand,
												CombinedFragment.class,
												"operand")) {
									if (pattern_ParallelFlowToOperandRule_23_2_black_nac_1BB(
											operand, combo) == null) {
										_result.add(new Object[] { combo,
												operand, guard, spec,
												_edge_guard });
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

	public static final Object[] pattern_ParallelFlowToOperandRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelFlowToOperandRule_23_3_expressionFBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_23_4_expressionFBB(
			ParallelFlowToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelFlowToOperandRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_1_bindingFB(
			ParallelFlowToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_1_blackFBB(
			EClass __eClass, ParallelFlowToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_1_bindingAndBlackFFB(
			ParallelFlowToOperandRule _this) {
		Object[] result_pattern_ParallelFlowToOperandRule_24_1_binding = pattern_ParallelFlowToOperandRule_24_1_bindingFB(_this);
		if (result_pattern_ParallelFlowToOperandRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelFlowToOperandRule_24_1_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_24_1_black = pattern_ParallelFlowToOperandRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelFlowToOperandRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelFlowToOperandRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_984107 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_984107 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_871478 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_871478)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_156449 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_156449)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_24_2_blackFFFFB(
			EMoflonEdge _edge_specification) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGuard = _edge_specification.getSrc();
		if (tmpGuard instanceof InteractionConstraint) {
			InteractionConstraint guard = (InteractionConstraint) tmpGuard;
			EObject tmpSpec = _edge_specification.getTrg();
			if (tmpSpec instanceof LiteralString) {
				LiteralString spec = (LiteralString) tmpSpec;
				if (spec.equals(guard.getSpecification())) {
					for (InteractionOperand operand : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(guard,
									InteractionOperand.class, "guard")) {
						if (pattern_ParallelFlowToOperandRule_24_2_black_nac_0B(operand) == null) {
							if (pattern_ParallelFlowToOperandRule_24_2_black_nac_2BB(
									guard, operand) == null) {
								for (CombinedFragment combo : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(operand,
												CombinedFragment.class,
												"operand")) {
									if (pattern_ParallelFlowToOperandRule_24_2_black_nac_1BB(
											operand, combo) == null) {
										_result.add(new Object[] { combo,
												operand, guard, spec,
												_edge_specification });
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

	public static final Object[] pattern_ParallelFlowToOperandRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelFlowToOperandRule_24_3_expressionFBBBBBB(
			ParallelFlowToOperandRule _this, Match match,
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_24_4_expressionFBB(
			ParallelFlowToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelFlowToOperandRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_1_blackB(
			ParallelFlowToOperandRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, CombinedFragment combo) {
		if (ruleResult.getTargetObjects().contains(combo)) {
			return new Object[] { ruleResult, combo };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			ParallelStepToCombinedFragment stepToCombo) {
		if (ruleResult.getCorrObjects().contains(stepToCombo)) {
			return new Object[] { ruleResult, stepToCombo };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ParallelStep step) {
		if (ruleResult.getSourceObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelFlowToOperandRule_27_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList stepToComboList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpStepToCombo : stepToComboList.getEntryObjects()) {
				if (tmpStepToCombo instanceof ParallelStepToCombinedFragment) {
					ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) tmpStepToCombo;
					CombinedFragment combo = stepToCombo.getTarget();
					if (combo != null) {
						ParallelStep step = stepToCombo.getSource();
						if (step != null) {
							if (pattern_ParallelFlowToOperandRule_27_2_black_nac_1BB(
									ruleResult, stepToCombo) == null) {
								if (pattern_ParallelFlowToOperandRule_27_2_black_nac_0BB(
										ruleResult, combo) == null) {
									if (pattern_ParallelFlowToOperandRule_27_2_black_nac_2BB(
											ruleResult, step) == null) {
										for (Flow flow : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														step, Flow.class,
														"steps")) {
											if (pattern_ParallelFlowToOperandRule_27_2_black_nac_3BB(
													ruleResult, flow) == null) {
												for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																flow,
																UseCase.class,
																"flows")) {
													if (pattern_ParallelFlowToOperandRule_27_2_black_nac_4BB(
															ruleResult, useCase) == null) {
														_result.add(new Object[] {
																stepToComboList,
																combo,
																stepToCombo,
																step,
																flow,
																useCase,
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
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_3_bindingFBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			UseCase useCase, Flow flow, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, combo, step, stepToCombo, useCase, flow,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, combo, step,
					stepToCombo, useCase, flow, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_3_bindingAndBlackFBBBBBBBB(
			ParallelFlowToOperandRule _this,
			IsApplicableMatch isApplicableMatch, CombinedFragment combo,
			ParallelStep step, ParallelStepToCombinedFragment stepToCombo,
			UseCase useCase, Flow flow, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelFlowToOperandRule_27_3_binding = pattern_ParallelFlowToOperandRule_27_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, combo, step, stepToCombo, useCase,
				flow, ruleResult);
		if (result_pattern_ParallelFlowToOperandRule_27_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelFlowToOperandRule_27_3_binding[0];

			Object[] result_pattern_ParallelFlowToOperandRule_27_3_black = pattern_ParallelFlowToOperandRule_27_3_blackB(csp);
			if (result_pattern_ParallelFlowToOperandRule_27_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, combo,
						step, stepToCombo, useCase, flow, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelFlowToOperandRule_27_4_expressionFBB(
			ParallelFlowToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_5_blackBBBBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow) {
		return new Object[] { combo, step, stepToCombo, useCase, flow };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_6_blackBBBBBB(
			CombinedFragment combo, ParallelStep step,
			ParallelStepToCombinedFragment stepToCombo, UseCase useCase,
			Flow flow, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { combo, step, stepToCombo, useCase, flow,
				ruleResult };
	}

	public static final Object[] pattern_ParallelFlowToOperandRule_27_6_greenBBFBFFFFBB(
			CombinedFragment combo, ParallelStep step, UseCase useCase,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelFlow parFlow = UseCaseDSLFactory.eINSTANCE.createParallelFlow();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		FlowToInteractionFragment parFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		Object _localVariable_0 = csp.getValue("parFlow", "name");
		Object _localVariable_1 = csp.getValue("spec", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		step.getInvokedFlows().add(parFlow);
		useCase.getFlows().add(parFlow);
		ruleResult.getSourceObjects().add(parFlow);
		combo.getOperand().add(operand);
		ruleResult.getTargetObjects().add(operand);
		parFlowToOperand.setSource(parFlow);
		parFlowToOperand.setTarget(operand);
		ruleResult.getCorrObjects().add(parFlowToOperand);
		operand.setGuard(guard);
		ruleResult.getTargetObjects().add(guard);
		guard.setSpecification(spec);
		ruleResult.getTargetObjects().add(spec);
		String parFlow_name_prime = (String) _localVariable_0;
		String spec_value_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		parFlow.setName(parFlow_name_prime);
		spec.setValue(spec_value_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { combo, step, parFlow, useCase, operand,
				parFlowToOperand, guard, spec, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelFlowToOperandRule_27_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelFlowToOperandRuleImpl
