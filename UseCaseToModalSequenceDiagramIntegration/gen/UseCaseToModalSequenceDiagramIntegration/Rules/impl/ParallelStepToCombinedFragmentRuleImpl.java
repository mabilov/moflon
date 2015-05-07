/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionOperatorKind;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;

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
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
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
 * An implementation of the model object '<em><b>Parallel Step To Combined Fragment Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelStepToCombinedFragmentRuleImpl extends AbstractRuleImpl
		implements ParallelStepToCombinedFragmentRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStepToCombinedFragmentRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelStepToCombinedFragmentRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Flow flow,
			ParallelStep step) {
		// initial bindings
		Object[] result1_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_0_1_blackBBBBB(
						this, match, useCase, flow, step);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_0_2_bindingAndBlackFBBBBB(
						this, match, useCase, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_4_blackBBBB(
							match, useCase, flow, step);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_4_greenBBBF(
							match, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_5_blackBBBB(
							match, useCase, flow, step);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_5_greenBBBF(
							match, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[3];

			// register objects to match
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_6_expressionBBBBB(
							this, match, useCase, flow, step);
			return ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_7_expressionF();
		} else {
			return ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_1_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		Interaction interaction = (Interaction) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[3];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_1_greenBBFFB(
						interaction, step, csp);
		CombinedFragment combo = (CombinedFragment) result1_green[2];
		ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_2_blackBBB(step,
						combo, stepToCombo);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_2_greenFBBB(step,
						combo, stepToCombo);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_3_blackBBBBBBBB(
						ruleresult, useCase, interaction, flow,
						useCaseToInteraction, step, combo, stepToCombo);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_3_greenBBBBBBFFFFF(
						ruleresult, interaction, flow, step, combo, stepToCombo);
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[6];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[7];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_5_expressionBBBBBBBBB(
						this, ruleresult, useCase, interaction, flow,
						useCaseToInteraction, step, combo, stepToCombo);
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		ParallelStep step = (ParallelStep) result2_binding[2];
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_2_2_blackBFBFBB(
						useCase, flow, step, match)) {
			Interaction interaction = (Interaction) result2_black[1];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_2_3_blackBBBBB(
							useCase, interaction, flow, useCaseToInteraction,
							step)) {
				Object[] result3_green = ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_2_3_greenBBBBBFFFFF(
								useCase, interaction, flow,
								useCaseToInteraction, step);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[6];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[7];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_2_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, useCase, interaction,
								flow, useCaseToInteraction, step);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, UseCase useCase,
			Flow flow, ParallelStep step) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Flow flow, ParallelStep step) {// Create CSP
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
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("par");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create constraints
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("step", step);
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
			EObject useCase, EObject interaction, EObject flow,
			EObject useCaseToInteraction, EObject step, EObject combo,
			EObject stepToCombo) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("stepToCombo", stepToCombo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("step")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interaction interaction,
			CombinedFragment combo) {
		// initial bindings
		Object[] result1_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_10_1_blackBBBB(
						this, match, interaction, combo);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_10_2_bindingAndBlackFBBBB(
						this, match, interaction, combo);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_4_blackBBB(
							match, interaction, combo);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_4_greenBBBFF(
							match, interaction, combo);
			// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result4_green[3];
			// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_5_blackBBB(
							match, interaction, combo);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_5_greenBB(
							match, interaction);

			// register objects to match
			ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_6_expressionBBBB(
							this, match, interaction, combo);
			return ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_7_expressionF();
		} else {
			return ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_1_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		Interaction interaction = (Interaction) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[3];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_1_greenBFBF(
						flow, combo);
		ParallelStep step = (ParallelStep) result1_green[1];
		ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_2_blackBBB(step,
						combo, stepToCombo);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_2_greenFBBB(
						step, combo, stepToCombo);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_3_blackBBBBBBBB(
						ruleresult, useCase, interaction, flow,
						useCaseToInteraction, step, combo, stepToCombo);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_3_greenBBBBBBFFFFF(
						ruleresult, interaction, flow, step, combo, stepToCombo);
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[6];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[7];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_5_expressionBBBBBBBBB(
						this, ruleresult, useCase, interaction, flow,
						useCaseToInteraction, step, combo, stepToCombo);
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Interaction interaction = (Interaction) result2_binding[0];
		CombinedFragment combo = (CombinedFragment) result2_binding[1];
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_12_2_blackFBFBB(
						interaction, combo, match)) {
			UseCase useCase = (UseCase) result2_black[0];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_12_3_blackBBFBB(
							useCase, interaction, useCaseToInteraction, combo)) {
				Flow flow = (Flow) result3_black[2];
				Object[] result3_green = ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_12_3_greenBBBBBFFFFFF(
								useCase, interaction, flow,
								useCaseToInteraction, combo);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[6];
				// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[7];
				// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_12_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, useCase, interaction,
								flow, useCaseToInteraction, combo);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			Interaction interaction, CombinedFragment combo) {
		match.registerObject("interaction", interaction);
		match.registerObject("combo", combo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interaction interaction,
			CombinedFragment combo) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("par");
		literal0.setType("");

		// Create attribute variables
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", true, csp);
		var_combo_interactionOperator.setValue(combo.getInteractionOperator());
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create unbound variables

		// Create constraints
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);
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
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("combo", combo);
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
			EObject useCase, EObject interaction, EObject flow,
			EObject useCaseToInteraction, EObject step, EObject combo,
			EObject stepToCombo) {
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("stepToCombo", stepToCombo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("combo")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getCombinedFragment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_328(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_20_2_blackFFB(_edge_enclosingInteraction)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Object[] result2_green = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_20_3_expressionFBBBB(
							this, match, interaction, combo)) {
				// Ensure that the correct types of elements are matched
				if (ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_329(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_21_2_blackFFB(_edge_fragment)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Object[] result2_green = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_21_3_expressionFBBBB(
							this, match, interaction, combo)) {
				// Ensure that the correct types of elements are matched
				if (ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_497(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_22_2_blackFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ParallelStep step = (ParallelStep) result2_black[2];
			Object[] result2_green = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_22_3_expressionFBBBBB(
							this, match, useCase, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_22_6_expressionFB(__result);
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
			UseCaseToInteraction useCaseToInteractionParameter) {
		// create result
		Object[] result1_black = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_25_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_25_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_25_2_blackFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCaseToInteractionList = (RuleEntryList) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[3];
			Interaction interaction = (Interaction) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_25_3_bindingAndBlackFBBBBBBB(
							this, isApplicableMatch, useCase, interaction,
							flow, useCaseToInteraction, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelStepToCombinedFragmentRuleImpl
					.pattern_ParallelStepToCombinedFragmentRule_25_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelStepToCombinedFragmentRuleImpl
						.pattern_ParallelStepToCombinedFragmentRule_25_5_blackBBBB(
								useCase, interaction, flow,
								useCaseToInteraction);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_25_6_blackBBBBB(
									useCase, interaction, flow,
									useCaseToInteraction, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ParallelStepToCombinedFragmentRuleImpl
							.pattern_ParallelStepToCombinedFragmentRule_25_6_greenBBFFFBB(
									interaction, flow, ruleResult, csp);
					// ParallelStep step = (ParallelStep) result6_green[2];
					// CombinedFragment combo = (CombinedFragment) result6_green[3];
					// ParallelStepToCombinedFragment stepToCombo = (ParallelStepToCombinedFragment) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ParallelStepToCombinedFragmentRuleImpl
				.pattern_ParallelStepToCombinedFragmentRule_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("par");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create constraints
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
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
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_PARALLELSTEP:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(ParallelStep) arguments.get(3));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_PARALLELSTEP:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(ParallelStep) arguments.get(3));
			return null;
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(ParallelStep) arguments.get(3));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_PARALLELSTEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1), (Interaction) arguments.get(2),
					(Flow) arguments.get(3),
					(UseCaseToInteraction) arguments.get(4),
					(ParallelStep) arguments.get(5));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2));
			return null;
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_COMBINEDFRAGMENT:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1), (Interaction) arguments.get(2),
					(Flow) arguments.get(3),
					(UseCaseToInteraction) arguments.get(4),
					(CombinedFragment) arguments.get(5));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_328__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_328((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_329__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_329((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_497__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_497((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCase) arguments.get(1), (Interaction) arguments.get(2),
					(Flow) arguments.get(3),
					(UseCaseToInteraction) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_1_blackBBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			UseCase useCase, Flow flow, ParallelStep step) {
		return new Object[] { _this, match, useCase, flow, step };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_2_bindingFBBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			UseCase useCase, Flow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, useCase,
				flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_2_bindingAndBlackFBBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			UseCase useCase, Flow flow, ParallelStep step) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_0_2_binding = pattern_ParallelStepToCombinedFragmentRule_0_2_bindingFBBBBB(
				_this, match, useCase, flow, step);
		if (result_pattern_ParallelStepToCombinedFragmentRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_0_2_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_0_2_black = pattern_ParallelStepToCombinedFragmentRule_0_2_blackB(csp);
			if (result_pattern_ParallelStepToCombinedFragmentRule_0_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_0_3_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_4_blackBBBB(
			Match match, UseCase useCase, Flow flow, ParallelStep step) {
		return new Object[] { match, useCase, flow, step };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_4_greenBBBF(
			Match match, Flow flow, ParallelStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, flow, step, flow__step____steps };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_5_blackBBBB(
			Match match, UseCase useCase, Flow flow, ParallelStep step) {
		return new Object[] { match, useCase, flow, step };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_0_5_greenBBBF(
			Match match, UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, useCase, flow, useCase__flow____flows };
	}

	public static final void pattern_ParallelStepToCombinedFragmentRule_0_6_expressionBBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			UseCase useCase, Flow flow, ParallelStep step) {
		_this.registerObjectsToMatch_FWD(match, useCase, flow, step);

	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpUseCaseToInteraction = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
						UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
						if (tmpStep instanceof ParallelStep) {
							ParallelStep step = (ParallelStep) tmpStep;
							return new Object[] { useCase, interaction, flow,
									useCaseToInteraction, step,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_1_blackBBBBBFBB(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step,
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCase, interaction, flow,
						useCaseToInteraction, step, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_1_bindingAndBlackFFFFFFBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding = pattern_ParallelStepToCombinedFragmentRule_1_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding[0];
			Interaction interaction = (Interaction) result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding[1];
			Flow flow = (Flow) result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding[3];
			ParallelStep step = (ParallelStep) result_pattern_ParallelStepToCombinedFragmentRule_1_1_binding[4];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_1_1_black = pattern_ParallelStepToCombinedFragmentRule_1_1_blackBBBBBFBB(
					useCase, interaction, flow, useCaseToInteraction, step,
					_this, isApplicableMatch);
			if (result_pattern_ParallelStepToCombinedFragmentRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_1_1_black[5];

				return new Object[] { useCase, interaction, flow,
						useCaseToInteraction, step, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_1_greenBBFFB(
			Interaction interaction, ParallelStep step, CSP csp) {
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		ParallelStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createParallelStepToCombinedFragment();
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		combo.setEnclosingInteraction(interaction);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_0;
		combo.setInteractionOperator(combo_interactionOperator_prime);
		return new Object[] { interaction, step, combo, stepToCombo, csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_2_blackBBB(
			ParallelStep step, CombinedFragment combo,
			ParallelStepToCombinedFragment stepToCombo) {
		return new Object[] { step, combo, stepToCombo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_2_greenFBBB(
			ParallelStep step, CombinedFragment combo,
			ParallelStepToCombinedFragment stepToCombo) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(combo);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		return new Object[] { ruleresult, step, combo, stepToCombo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCase, EObject interaction,
			EObject flow, EObject useCaseToInteraction, EObject step,
			EObject combo, EObject stepToCombo) {
		if (!useCase.equals(useCaseToInteraction)) {
			if (!interaction.equals(useCase)) {
				if (!interaction.equals(useCaseToInteraction)) {
					if (!interaction.equals(step)) {
						if (!interaction.equals(stepToCombo)) {
							if (!flow.equals(useCase)) {
								if (!flow.equals(interaction)) {
									if (!flow.equals(useCaseToInteraction)) {
										if (!flow.equals(step)) {
											if (!flow.equals(stepToCombo)) {
												if (!step.equals(useCase)) {
													if (!step
															.equals(useCaseToInteraction)) {
														if (!step
																.equals(stepToCombo)) {
															if (!combo
																	.equals(useCase)) {
																if (!combo
																		.equals(interaction)) {
																	if (!combo
																			.equals(flow)) {
																		if (!combo
																				.equals(useCaseToInteraction)) {
																			if (!combo
																					.equals(step)) {
																				if (!combo
																						.equals(stepToCombo)) {
																					if (!stepToCombo
																							.equals(useCase)) {
																						if (!stepToCombo
																								.equals(useCaseToInteraction)) {
																							return new Object[] {
																									ruleresult,
																									useCase,
																									interaction,
																									flow,
																									useCaseToInteraction,
																									step,
																									combo,
																									stepToCombo };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_1_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject interaction, EObject flow,
			EObject step, EObject combo, EObject stepToCombo) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelStepToCombinedFragmentRule";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		ruleresult.getCreatedEdges().add(interaction__combo____fragment);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		ruleresult.getCreatedEdges().add(stepToCombo__combo____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		return new Object[] { ruleresult, interaction, flow, step, combo,
				stepToCombo, combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				stepToCombo__step____source, stepToCombo__combo____target };
	}

	public static final void pattern_ParallelStepToCombinedFragmentRule_1_5_expressionBBBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			PerformRuleResult ruleresult, EObject useCase, EObject interaction,
			EObject flow, EObject useCaseToInteraction, EObject step,
			EObject combo, EObject stepToCombo) {
		_this.registerObjects_FWD(ruleresult, useCase, interaction, flow,
				useCaseToInteraction, step, combo, stepToCombo);

	}

	public static final PerformRuleResult pattern_ParallelStepToCombinedFragmentRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_1_bindingFB(
			ParallelStepToCombinedFragmentRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_1_blackFBB(
			EClass eClass, ParallelStepToCombinedFragmentRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_1_bindingAndBlackFFB(
			ParallelStepToCombinedFragmentRule _this) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_2_1_binding = pattern_ParallelStepToCombinedFragmentRule_2_1_bindingFB(_this);
		if (result_pattern_ParallelStepToCombinedFragmentRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelStepToCombinedFragmentRule_2_1_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_2_1_black = pattern_ParallelStepToCombinedFragmentRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelStepToCombinedFragmentRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelStepToCombinedFragmentRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelStepToCombinedFragmentRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					return new Object[] { useCase, flow, step, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_2_2_blackBFBFBB(
			UseCase useCase, Flow flow, ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, UseCaseToInteraction.class,
						"source")) {
			Interaction interaction = useCaseToInteraction.getTarget();
			if (interaction != null) {
				_result.add(new Object[] { useCase, interaction, flow,
						useCaseToInteraction, step, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_2_3_blackBBBBB(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.getFlows().contains(flow)) {
			if (flow.getSteps().contains(step)) {
				if (useCase.equals(useCaseToInteraction.getSource())) {
					if (interaction.equals(useCaseToInteraction.getTarget())) {
						_result.add(new Object[] { useCase, interaction, flow,
								useCaseToInteraction, step });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_3_greenBBBBBFFFFF(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(step);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		return new Object[] { useCase, interaction, flow, useCaseToInteraction,
				step, isApplicableMatch, useCase__flow____flows,
				flow__step____steps, useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_4_bindingFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					interaction, flow, useCaseToInteraction, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_4_bindingAndBlackFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, ParallelStep step) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_2_4_binding = pattern_ParallelStepToCombinedFragmentRule_2_4_bindingFBBBBBBB(
				_this, isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, step);
		if (result_pattern_ParallelStepToCombinedFragmentRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_2_4_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_2_4_black = pattern_ParallelStepToCombinedFragmentRule_2_4_blackB(csp);
			if (result_pattern_ParallelStepToCombinedFragmentRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						interaction, flow, useCaseToInteraction, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_2_5_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelStepToCombinedFragmentRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelStepToCombinedFragmentRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_1_blackBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		return new Object[] { _this, match, interaction, combo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_2_bindingFBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				interaction, combo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, interaction, combo };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_2_bindingAndBlackFBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_10_2_binding = pattern_ParallelStepToCombinedFragmentRule_10_2_bindingFBBBB(
				_this, match, interaction, combo);
		if (result_pattern_ParallelStepToCombinedFragmentRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_10_2_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_10_2_black = pattern_ParallelStepToCombinedFragmentRule_10_2_blackB(csp);
			if (result_pattern_ParallelStepToCombinedFragmentRule_10_2_black != null) {

				return new Object[] { csp, _this, match, interaction, combo };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_10_3_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_4_blackBBB(
			Match match, Interaction interaction, CombinedFragment combo) {
		return new Object[] { match, interaction, combo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_4_greenBBBFF(
			Match match, Interaction interaction, CombinedFragment combo) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(combo);
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		match.getToBeTranslatedEdges().add(interaction__combo____fragment);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		return new Object[] { match, interaction, combo,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_5_blackBBB(
			Match match, Interaction interaction, CombinedFragment combo) {
		return new Object[] { match, interaction, combo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_10_5_greenBB(
			Match match, Interaction interaction) {
		match.getContextNodes().add(interaction);
		return new Object[] { match, interaction };
	}

	public static final void pattern_ParallelStepToCombinedFragmentRule_10_6_expressionBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		_this.registerObjectsToMatch_BWD(match, interaction, combo);

	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_4 = isApplicableMatch.getObject("combo");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpInteraction = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpUseCaseToInteraction = _localVariable_3;
		EObject tmpCombo = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
						UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
						if (tmpCombo instanceof CombinedFragment) {
							CombinedFragment combo = (CombinedFragment) tmpCombo;
							return new Object[] { useCase, interaction, flow,
									useCaseToInteraction, combo,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_1_blackBBBBBFBB(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo,
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCase, interaction, flow,
						useCaseToInteraction, combo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_1_bindingAndBlackFFFFFFBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding = pattern_ParallelStepToCombinedFragmentRule_11_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding[0];
			Interaction interaction = (Interaction) result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding[1];
			Flow flow = (Flow) result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding[3];
			CombinedFragment combo = (CombinedFragment) result_pattern_ParallelStepToCombinedFragmentRule_11_1_binding[4];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_11_1_black = pattern_ParallelStepToCombinedFragmentRule_11_1_blackBBBBBFBB(
					useCase, interaction, flow, useCaseToInteraction, combo,
					_this, isApplicableMatch);
			if (result_pattern_ParallelStepToCombinedFragmentRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_11_1_black[5];

				return new Object[] { useCase, interaction, flow,
						useCaseToInteraction, combo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_1_greenBFBF(
			Flow flow, CombinedFragment combo) {
		ParallelStep step = UseCaseDSLFactory.eINSTANCE.createParallelStep();
		ParallelStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createParallelStepToCombinedFragment();
		flow.getSteps().add(step);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		return new Object[] { flow, step, combo, stepToCombo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_2_blackBBB(
			ParallelStep step, CombinedFragment combo,
			ParallelStepToCombinedFragment stepToCombo) {
		return new Object[] { step, combo, stepToCombo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_2_greenFBBB(
			ParallelStep step, CombinedFragment combo,
			ParallelStepToCombinedFragment stepToCombo) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(combo);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		return new Object[] { ruleresult, step, combo, stepToCombo };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject useCase, EObject interaction,
			EObject flow, EObject useCaseToInteraction, EObject step,
			EObject combo, EObject stepToCombo) {
		if (!useCase.equals(useCaseToInteraction)) {
			if (!interaction.equals(useCase)) {
				if (!interaction.equals(useCaseToInteraction)) {
					if (!interaction.equals(step)) {
						if (!interaction.equals(stepToCombo)) {
							if (!flow.equals(useCase)) {
								if (!flow.equals(interaction)) {
									if (!flow.equals(useCaseToInteraction)) {
										if (!flow.equals(step)) {
											if (!flow.equals(stepToCombo)) {
												if (!step.equals(useCase)) {
													if (!step
															.equals(useCaseToInteraction)) {
														if (!step
																.equals(stepToCombo)) {
															if (!combo
																	.equals(useCase)) {
																if (!combo
																		.equals(interaction)) {
																	if (!combo
																			.equals(flow)) {
																		if (!combo
																				.equals(useCaseToInteraction)) {
																			if (!combo
																					.equals(step)) {
																				if (!combo
																						.equals(stepToCombo)) {
																					if (!stepToCombo
																							.equals(useCase)) {
																						if (!stepToCombo
																								.equals(useCaseToInteraction)) {
																							return new Object[] {
																									ruleresult,
																									useCase,
																									interaction,
																									flow,
																									useCaseToInteraction,
																									step,
																									combo,
																									stepToCombo };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_11_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject interaction, EObject flow,
			EObject step, EObject combo, EObject stepToCombo) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelStepToCombinedFragmentRule";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		ruleresult.getTranslatedEdges().add(interaction__combo____fragment);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		ruleresult.getCreatedEdges().add(stepToCombo__combo____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		return new Object[] { ruleresult, interaction, flow, step, combo,
				stepToCombo, combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				stepToCombo__step____source, stepToCombo__combo____target };
	}

	public static final void pattern_ParallelStepToCombinedFragmentRule_11_5_expressionBBBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			PerformRuleResult ruleresult, EObject useCase, EObject interaction,
			EObject flow, EObject useCaseToInteraction, EObject step,
			EObject combo, EObject stepToCombo) {
		_this.registerObjects_BWD(ruleresult, useCase, interaction, flow,
				useCaseToInteraction, step, combo, stepToCombo);

	}

	public static final PerformRuleResult pattern_ParallelStepToCombinedFragmentRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_1_bindingFB(
			ParallelStepToCombinedFragmentRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_1_blackFBB(
			EClass eClass, ParallelStepToCombinedFragmentRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_1_bindingAndBlackFFB(
			ParallelStepToCombinedFragmentRule _this) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_12_1_binding = pattern_ParallelStepToCombinedFragmentRule_12_1_bindingFB(_this);
		if (result_pattern_ParallelStepToCombinedFragmentRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelStepToCombinedFragmentRule_12_1_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_12_1_black = pattern_ParallelStepToCombinedFragmentRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelStepToCombinedFragmentRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelStepToCombinedFragmentRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelStepToCombinedFragmentRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("interaction");
		EObject _localVariable_1 = match.getObject("combo");
		EObject tmpInteraction = _localVariable_0;
		EObject tmpCombo = _localVariable_1;
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				return new Object[] { interaction, combo, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_12_2_blackFBFBB(
			Interaction interaction, CombinedFragment combo, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(interaction,
						UseCaseToInteraction.class, "target")) {
			UseCase useCase = useCaseToInteraction.getSource();
			if (useCase != null) {
				_result.add(new Object[] { useCase, interaction,
						useCaseToInteraction, combo, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_12_3_blackBBFBB(
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (interaction.equals(combo.getEnclosingInteraction())) {
			if (useCase.equals(useCaseToInteraction.getSource())) {
				if (interaction.equals(useCaseToInteraction.getTarget())) {
					for (Flow flow : useCase.getFlows()) {
						_result.add(new Object[] { useCase, interaction, flow,
								useCaseToInteraction, combo });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_3_greenBBBBBFFFFFF(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(combo);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				interaction__combo____fragment);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		return new Object[] { useCase, interaction, flow, useCaseToInteraction,
				combo, isApplicableMatch, useCase__flow____flows,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_4_bindingFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, combo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					interaction, flow, useCaseToInteraction, combo };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_4_bindingAndBlackFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction, CombinedFragment combo) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_12_4_binding = pattern_ParallelStepToCombinedFragmentRule_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, combo);
		if (result_pattern_ParallelStepToCombinedFragmentRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_12_4_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_12_4_black = pattern_ParallelStepToCombinedFragmentRule_12_4_blackB(csp);
			if (result_pattern_ParallelStepToCombinedFragmentRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						interaction, flow, useCaseToInteraction, combo };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_12_5_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelStepToCombinedFragmentRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelStepToCombinedFragmentRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_1_bindingFB(
			ParallelStepToCombinedFragmentRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_1_blackFBB(
			EClass __eClass, ParallelStepToCombinedFragmentRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_1_bindingAndBlackFFB(
			ParallelStepToCombinedFragmentRule _this) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_20_1_binding = pattern_ParallelStepToCombinedFragmentRule_20_1_bindingFB(_this);
		if (result_pattern_ParallelStepToCombinedFragmentRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelStepToCombinedFragmentRule_20_1_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_20_1_black = pattern_ParallelStepToCombinedFragmentRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelStepToCombinedFragmentRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelStepToCombinedFragmentRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_20_2_blackFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingInteraction.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					_result.add(new Object[] { interaction, combo,
							_edge_enclosingInteraction });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_20_3_expressionFBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_20_4_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelStepToCombinedFragmentRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_1_bindingFB(
			ParallelStepToCombinedFragmentRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_1_blackFBB(
			EClass __eClass, ParallelStepToCombinedFragmentRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_1_bindingAndBlackFFB(
			ParallelStepToCombinedFragmentRule _this) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_21_1_binding = pattern_ParallelStepToCombinedFragmentRule_21_1_bindingFB(_this);
		if (result_pattern_ParallelStepToCombinedFragmentRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelStepToCombinedFragmentRule_21_1_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_21_1_black = pattern_ParallelStepToCombinedFragmentRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelStepToCombinedFragmentRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelStepToCombinedFragmentRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_21_2_blackFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpCombo = _edge_fragment.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					_result.add(new Object[] { interaction, combo,
							_edge_fragment });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_21_3_expressionFBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			Interaction interaction, CombinedFragment combo) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_21_4_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelStepToCombinedFragmentRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_1_bindingFB(
			ParallelStepToCombinedFragmentRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_1_blackFBB(
			EClass __eClass, ParallelStepToCombinedFragmentRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_1_bindingAndBlackFFB(
			ParallelStepToCombinedFragmentRule _this) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_22_1_binding = pattern_ParallelStepToCombinedFragmentRule_22_1_bindingFB(_this);
		if (result_pattern_ParallelStepToCombinedFragmentRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelStepToCombinedFragmentRule_22_1_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_22_1_black = pattern_ParallelStepToCombinedFragmentRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelStepToCombinedFragmentRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelStepToCombinedFragmentRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_22_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow, UseCase.class,
									"flows")) {
						_result.add(new Object[] { useCase, flow, step,
								_edge_steps });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_22_3_expressionFBBBBB(
			ParallelStepToCombinedFragmentRule _this, Match match,
			UseCase useCase, Flow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_22_4_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelStepToCombinedFragmentRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_1_blackB(
			ParallelStepToCombinedFragmentRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelStepToCombinedFragmentRule_25_2_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList useCaseToInteractionList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpUseCaseToInteraction : useCaseToInteractionList
					.getEntryObjects()) {
				if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
					UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
					UseCase useCase = useCaseToInteraction.getSource();
					if (useCase != null) {
						Interaction interaction = useCaseToInteraction
								.getTarget();
						if (interaction != null) {
							if (pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_2BB(
									ruleResult, useCaseToInteraction) == null) {
								if (pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_0BB(
										ruleResult, useCase) == null) {
									if (pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_3BB(
											ruleResult, interaction) == null) {
										for (Flow flow : useCase.getFlows()) {
											if (pattern_ParallelStepToCombinedFragmentRule_25_2_black_nac_1BB(
													ruleResult, flow) == null) {
												_result.add(new Object[] {
														useCaseToInteractionList,
														useCase, flow,
														useCaseToInteraction,
														interaction,
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
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_3_bindingFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase,
					interaction, flow, useCaseToInteraction, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_3_bindingAndBlackFBBBBBBB(
			ParallelStepToCombinedFragmentRule _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase,
			Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelStepToCombinedFragmentRule_25_3_binding = pattern_ParallelStepToCombinedFragmentRule_25_3_bindingFBBBBBBB(
				_this, isApplicableMatch, useCase, interaction, flow,
				useCaseToInteraction, ruleResult);
		if (result_pattern_ParallelStepToCombinedFragmentRule_25_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelStepToCombinedFragmentRule_25_3_binding[0];

			Object[] result_pattern_ParallelStepToCombinedFragmentRule_25_3_black = pattern_ParallelStepToCombinedFragmentRule_25_3_blackB(csp);
			if (result_pattern_ParallelStepToCombinedFragmentRule_25_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase,
						interaction, flow, useCaseToInteraction, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelStepToCombinedFragmentRule_25_4_expressionFBB(
			ParallelStepToCombinedFragmentRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_5_blackBBBB(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction) {
		return new Object[] { useCase, interaction, flow, useCaseToInteraction };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_6_blackBBBBB(
			UseCase useCase, Interaction interaction, Flow flow,
			UseCaseToInteraction useCaseToInteraction,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { useCase, interaction, flow, useCaseToInteraction,
				ruleResult };
	}

	public static final Object[] pattern_ParallelStepToCombinedFragmentRule_25_6_greenBBFFFBB(
			Interaction interaction, Flow flow,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelStep step = UseCaseDSLFactory.eINSTANCE.createParallelStep();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		ParallelStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createParallelStepToCombinedFragment();
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		ruleResult.getSourceObjects().add(step);
		combo.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(combo);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		ruleResult.getCorrObjects().add(stepToCombo);
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		combo.setInteractionOperator(combo_interactionOperator_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { interaction, flow, step, combo, stepToCombo,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelStepToCombinedFragmentRule_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelStepToCombinedFragmentRuleImpl
