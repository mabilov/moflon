/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
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

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
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
 * An implementation of the model object '<em><b>Step Alt To Operand Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StepAltToOperandRuleImpl extends AbstractRuleImpl implements
		StepAltToOperandRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepAltToOperandRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getStepAltToOperandRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		// initial bindings
		Object[] result1_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_0_1_blackBBBBBBBBB(this, match,
						actor, packageDeclaration, step, alt, altFlow, flow,
						useCase);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_0_2_bindingAndBlackFBBBBBBBBB(
						this, match, actor, packageDeclaration, step, alt,
						altFlow, flow, useCase);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_4_blackBBBBBBBB(match,
							actor, packageDeclaration, step, alt, altFlow,
							flow, useCase);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_4_greenBBBBBFFF(match,
							step, alt, altFlow, useCase);
			// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result4_green[5];
			// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[6];
			// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_5_blackBBBBBBBB(match,
							actor, packageDeclaration, step, alt, altFlow,
							flow, useCase);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_5_greenBBBBBBFFFFF(match,
							actor, packageDeclaration, step, flow, useCase);
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[7];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result5_green[8];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[9];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[10];

			// register objects to match
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_6_expressionBBBBBBBBB(this,
							match, actor, packageDeclaration, step, alt,
							altFlow, flow, useCase);
			return StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_7_expressionF();
		} else {
			return StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[1];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[2];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[3];
		NormalStep step = (NormalStep) result1_bindingAndBlack[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_bindingAndBlack[5];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[6];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		UseCase useCase = (UseCase) result1_bindingAndBlack[9];
		Lifeline line = (Lifeline) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_1_greenFBBFFFFBBB(combo, alt,
						altFlow, line, csp);
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[0];
		InteractionOperand operand = (InteractionOperand) result1_green[3];
		StepAlternativeToInteractionOperand altToOperand = (StepAlternativeToInteractionOperand) result1_green[4];
		InteractionConstraint guard = (InteractionConstraint) result1_green[5];
		LiteralString spec = (LiteralString) result1_green[6];

		// collect translated elements
		Object[] result2_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_2_blackBBBBBBB(
						altFlowToOperand, alt, operand, altToOperand, guard,
						spec, altFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_2_greenFBBBBBBB(
						altFlowToOperand, alt, operand, altToOperand, guard,
						spec, altFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, altFlowToOperand, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, alt, operand, altToOperand, guard, spec,
						altFlow, flow, useCase, line);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, altFlowToOperand, combo, step, alt,
						operand, altToOperand, guard, spec, altFlow, useCase,
						line);
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[14];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[15];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[16];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge altToOperand__alt____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge altToOperand__operand____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[22];
		// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, altFlowToOperand, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, alt, operand, altToOperand, guard, spec,
						altFlow, flow, useCase, line);
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[1];
		NormalStep step = (NormalStep) result2_binding[2];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[3];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[4];
		Flow flow = (Flow) result2_binding[5];
		UseCase useCase = (UseCase) result2_binding[6];
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_2_2_blackBBFFBFBBBBFB(actor,
						packageDeclaration, step, alt, altFlow, flow, useCase,
						match)) {
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result2_black[5];
			Lifeline line = (Lifeline) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_2_3_blackBBBBBBBBBBB(actor,
							packageDeclaration, actorToLine, combo, step,
							stepToCombo, alt, altFlow, flow, useCase, line)) {
				Object[] result3_green = StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
								actor, packageDeclaration, actorToLine, combo,
								step, stepToCombo, alt, altFlow, flow, useCase,
								line);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[12];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[13];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[16];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[17];
				// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[18];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[19];
				// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[22];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[23];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[24];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, actor,
								packageDeclaration, actorToLine, combo, step,
								stepToCombo, alt, altFlow, flow, useCase, line);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		match.registerObject("actor", actor);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {// Create CSP
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
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", true, csp);
		var_altFlow_name.setValue(altFlow.getName());
		var_altFlow_name.setType("String");

		// Create unbound variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_alt_condition, var_spec_value);
		eq_0.setRuleName("");
		eq_0.solve(var_altFlow_name, var_guard_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("altFlow", altFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("line", line);
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
			EObject altFlowToOperand, EObject actor,
			EObject packageDeclaration, EObject actorToLine, EObject combo,
			EObject step, EObject stepToCombo, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject flow, EObject useCase, EObject line) {
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("altToOperand", altToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("alt")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlowAlternative())
				&& match.getObject("altFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getAlternativeFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		// initial bindings
		Object[] result1_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_10_1_blackBBBBBBB(this, match,
						combo, operand, guard, spec, line);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_10_2_bindingAndBlackFBBBBBBB(
						this, match, combo, operand, guard, spec, line);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_4_blackBBBBBB(match,
							combo, operand, guard, spec, line);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_4_greenBBBBBBFFFFF(match,
							combo, operand, guard, spec, line);
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result4_green[6];
			// EMoflonEdge operand__guard____guard = (EMoflonEdge) result4_green[7];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[8];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[9];
			// EMoflonEdge guard__spec____specification = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_5_blackBBBBBB(match,
							combo, operand, guard, spec, line);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_5_greenBBBFF(match, combo,
							line);
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result5_green[3];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result5_green[4];

			// register objects to match
			StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_6_expressionBBBBBBB(this,
							match, combo, operand, guard, spec, line);
			return StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_7_expressionF();
		} else {
			return StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[1];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[2];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[3];
		NormalStep step = (NormalStep) result1_bindingAndBlack[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_bindingAndBlack[5];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[6];
		InteractionConstraint guard = (InteractionConstraint) result1_bindingAndBlack[7];
		LiteralString spec = (LiteralString) result1_bindingAndBlack[8];
		Flow flow = (Flow) result1_bindingAndBlack[9];
		UseCase useCase = (UseCase) result1_bindingAndBlack[10];
		Lifeline line = (Lifeline) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_1_greenFBFBFFBB(step, operand,
						useCase, csp);
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[0];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[2];
		StepAlternativeToInteractionOperand altToOperand = (StepAlternativeToInteractionOperand) result1_green[4];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[5];

		// collect translated elements
		Object[] result2_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_2_blackBBBBBBB(
						altFlowToOperand, alt, operand, altToOperand, guard,
						spec, altFlow);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_2_greenFBBBBBBB(
						altFlowToOperand, alt, operand, altToOperand, guard,
						spec, altFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, altFlowToOperand, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, alt, operand, altToOperand, guard, spec,
						altFlow, flow, useCase, line);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, altFlowToOperand, combo, step, alt,
						operand, altToOperand, guard, spec, altFlow, useCase,
						line);
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[14];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[15];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[16];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[17];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[18];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[19];
		// EMoflonEdge altToOperand__alt____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge altToOperand__operand____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[22];
		// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, altFlowToOperand, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, alt, operand, altToOperand, guard, spec,
						altFlow, flow, useCase, line);
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		CombinedFragment combo = (CombinedFragment) result2_binding[0];
		InteractionOperand operand = (InteractionOperand) result2_binding[1];
		InteractionConstraint guard = (InteractionConstraint) result2_binding[2];
		LiteralString spec = (LiteralString) result2_binding[3];
		Lifeline line = (Lifeline) result2_binding[4];
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_12_2_blackFFBFFBBBBB(combo,
						operand, guard, spec, line, match)) {
			Actor actor = (Actor) result2_black[0];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[1];
			NormalStep step = (NormalStep) result2_black[3];
			NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_12_3_blackBFBBBBBBBFFB(actor,
							actorToLine, combo, step, stepToCombo, operand,
							guard, spec, line)) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[1];
				Flow flow = (Flow) result3_black[9];
				UseCase useCase = (UseCase) result3_black[10];
				Object[] result3_green = StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								actor, packageDeclaration, actorToLine, combo,
								step, stepToCombo, operand, guard, spec, flow,
								useCase, line);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[13];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[14];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[17];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[18];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[19];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[20];
				// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[23];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[24];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[25];
				// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[26];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[27];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[28];

				// solve CSP
				Object[] result4_bindingAndBlack = StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor,
								packageDeclaration, actorToLine, combo, step,
								stepToCombo, operand, guard, spec, flow,
								useCase, line);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		match.registerObject("combo", combo);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {// Create CSP
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
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("String");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", true, csp);
		var_guard_name.setValue(guard.getName());
		var_guard_name.setType("String");

		// Create unbound variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_alt_condition, var_spec_value);
		eq_0.setRuleName("");
		eq_0.solve(var_altFlow_name, var_guard_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("operand", operand);
		isApplicableMatch.registerObject("guard", guard);
		isApplicableMatch.registerObject("spec", spec);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("line", line);
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
			EObject altFlowToOperand, EObject actor,
			EObject packageDeclaration, EObject actorToLine, EObject combo,
			EObject step, EObject stepToCombo, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject flow, EObject useCase, EObject line) {
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("altToOperand", altToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("line", line);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_181(
			EMoflonEdge _edge_operand) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_20_2_blackFFFFFB(_edge_operand)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_20_3_expressionFBBBBBBB(this,
							match, combo, operand, guard, spec, line)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_462(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_21_2_blackFFFFFFFB(_edge_stepAlternative)) {
			Actor actor = (Actor) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_21_3_expressionFBBBBBBBBB(
							this, match, actor, packageDeclaration, step, alt,
							altFlow, flow, useCase)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_463(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_22_2_blackFFFFFFFB(_edge_ref)) {
			Actor actor = (Actor) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_22_3_expressionFBBBBBBBBB(
							this, match, actor, packageDeclaration, step, alt,
							altFlow, flow, useCase)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_182(
			EMoflonEdge _edge_guard) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_23_2_blackFFFFFB(_edge_guard)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_23_3_expressionFBBBBBBB(this,
							match, combo, operand, guard, spec, line)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_183(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_24_2_blackFFFFFB(_edge_coveredBy)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_24_3_expressionFBBBBBBB(this,
							match, combo, operand, guard, spec, line)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_184(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_25_2_blackFFFFFB(_edge_covered)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_25_3_expressionFBBBBBBB(this,
							match, combo, operand, guard, spec, line)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_185(
			EMoflonEdge _edge_specification) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_26_2_blackFFFFFB(_edge_specification)) {
			CombinedFragment combo = (CombinedFragment) result2_black[0];
			InteractionOperand operand = (InteractionOperand) result2_black[1];
			InteractionConstraint guard = (InteractionConstraint) result2_black[2];
			LiteralString spec = (LiteralString) result2_black[3];
			Lifeline line = (Lifeline) result2_black[4];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_26_3_expressionFBBBBBBB(this,
							match, combo, operand, guard, spec, line)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_26_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_26_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_464(
			EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_27_2_blackFFFFFFFB(_edge_flows)) {
			Actor actor = (Actor) result2_black[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			Object[] result2_green = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_27_3_expressionFBBBBBBBBB(
							this, match, actor, packageDeclaration, step, alt,
							altFlow, flow, useCase)) {
				// Ensure that the correct types of elements are matched
				if (StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_27_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_27_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_27_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_27_6_expressionFB(__result);
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
			NormalStepToCombinedFragment stepToComboParameter) {
		// create result
		Object[] result1_black = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_30_2_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList stepToComboList = (RuleEntryList) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			NormalStep step = (NormalStep) result2_black[5];
			NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result2_black[6];
			CombinedFragment combo = (CombinedFragment) result2_black[7];
			Lifeline line = (Lifeline) result2_black[8];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_30_3_bindingAndBlackFBBBBBBBBBBBB(
							this, isApplicableMatch, actor, packageDeclaration,
							actorToLine, combo, step, stepToCombo, flow,
							useCase, line, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (StepAltToOperandRuleImpl
					.pattern_StepAltToOperandRule_30_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = StepAltToOperandRuleImpl
						.pattern_StepAltToOperandRule_30_5_blackBBBBBBBBB(
								actor, packageDeclaration, actorToLine, combo,
								step, stepToCombo, flow, useCase, line);
				if (result5_black != null) {

					// perform
					Object[] result6_black = StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_30_6_blackBBBBBBBBBB(
									actor, packageDeclaration, actorToLine,
									combo, step, stepToCombo, flow, useCase,
									line, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					StepAltToOperandRuleImpl
							.pattern_StepAltToOperandRule_30_6_greenFBBFFFFFFBBBB(
									combo, step, useCase, line, ruleResult, csp);
					// FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result6_green[0];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[3];
					// InteractionOperand operand = (InteractionOperand) result6_green[4];
					// StepAlternativeToInteractionOperand altToOperand = (StepAlternativeToInteractionOperand) result6_green[5];
					// InteractionConstraint guard = (InteractionConstraint) result6_green[6];
					// LiteralString spec = (LiteralString) result6_green[7];
					// AlternativeFlow altFlow = (AlternativeFlow) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return StepAltToOperandRuleImpl
				.pattern_StepAltToOperandRule_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			Flow flow, UseCase useCase, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("String");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_alt_condition, var_spec_value);
		eq_0.setRuleName("");
		eq_0.solve(var_altFlow_name, var_guard_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("stepToCombo", stepToCombo);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("line", line);
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
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(Flow) arguments.get(6), (UseCase) arguments.get(7));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(Flow) arguments.get(6), (UseCase) arguments.get(7));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(NormalStep) arguments.get(3),
					(AlternativeFlowAlternative) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(Flow) arguments.get(6), (UseCase) arguments.get(7));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE_LIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(ActorToLifeline) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(NormalStep) arguments.get(5),
					(NormalStepToCombinedFragment) arguments.get(6),
					(AlternativeFlowAlternative) arguments.get(7),
					(AlternativeFlow) arguments.get(8),
					(Flow) arguments.get(9), (UseCase) arguments.get(10),
					(Lifeline) arguments.get(11));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
			return null;
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(CombinedFragment) arguments.get(1),
					(InteractionOperand) arguments.get(2),
					(InteractionConstraint) arguments.get(3),
					(LiteralString) arguments.get(4),
					(Lifeline) arguments.get(5));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_FLOW_USECASE_LIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(ActorToLifeline) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(NormalStep) arguments.get(5),
					(NormalStepToCombinedFragment) arguments.get(6),
					(InteractionOperand) arguments.get(7),
					(InteractionConstraint) arguments.get(8),
					(LiteralString) arguments.get(9), (Flow) arguments.get(10),
					(UseCase) arguments.get(11), (Lifeline) arguments.get(12));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_181__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_181((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_462__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_462((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_463__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_463((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_182__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_182((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_183__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_183((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_184__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_184((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_185__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_185((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_464__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_464((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_NORMALSTEPTOCOMBINEDFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(NormalStepToCombinedFragment) arguments.get(1));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_FLOW_USECASE_LIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(ActorToLifeline) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(NormalStep) arguments.get(5),
					(NormalStepToCombinedFragment) arguments.get(6),
					(Flow) arguments.get(7), (UseCase) arguments.get(8),
					(Lifeline) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_StepAltToOperandRule_0_1_blackBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		if (!altFlow.equals(flow)) {
			return new Object[] { _this, match, actor, packageDeclaration,
					step, alt, altFlow, flow, useCase };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_0_2_bindingFBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				packageDeclaration, step, alt, altFlow, flow, useCase);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, packageDeclaration,
					step, alt, altFlow, flow, useCase };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_0_2_bindingAndBlackFBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		Object[] result_pattern_StepAltToOperandRule_0_2_binding = pattern_StepAltToOperandRule_0_2_bindingFBBBBBBBBB(
				_this, match, actor, packageDeclaration, step, alt, altFlow,
				flow, useCase);
		if (result_pattern_StepAltToOperandRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_StepAltToOperandRule_0_2_binding[0];

			Object[] result_pattern_StepAltToOperandRule_0_2_black = pattern_StepAltToOperandRule_0_2_blackB(csp);
			if (result_pattern_StepAltToOperandRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor,
						packageDeclaration, step, alt, altFlow, flow, useCase };
			}
		}
		return null;
	}

	public static final boolean pattern_StepAltToOperandRule_0_3_expressionFBB(
			StepAltToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_0_4_blackBBBBBBBB(
			Match match, Actor actor, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, Flow flow, UseCase useCase) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, actor, packageDeclaration, step, alt,
					altFlow, flow, useCase };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_0_4_greenBBBBBFFF(
			Match match, NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, UseCase useCase) {
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(alt);
		match.getToBeTranslatedNodes().add(altFlow);
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__altFlow____ref_name_prime = "ref";
		String useCase__altFlow____flows_name_prime = "flows";
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		match.getToBeTranslatedEdges().add(step__alt____stepAlternative);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(alt__altFlow____ref);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(useCase__altFlow____flows);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		return new Object[] { match, step, alt, altFlow, useCase,
				step__alt____stepAlternative, alt__altFlow____ref,
				useCase__altFlow____flows };
	}

	public static final Object[] pattern_StepAltToOperandRule_0_5_blackBBBBBBBB(
			Match match, Actor actor, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, Flow flow, UseCase useCase) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, actor, packageDeclaration, step, alt,
					altFlow, flow, useCase };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_0_5_greenBBBBBBFFFFF(
			Match match, Actor actor, PackageDeclaration packageDeclaration,
			NormalStep step, Flow flow, UseCase useCase) {
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(actor);
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(step);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String step__actor____actor_name_prime = "actor";
		String flow__step____steps_name_prime = "steps";
		String useCase__flow____flows_name_prime = "flows";
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		match.getContextEdges().add(step__actor____actor);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, actor, packageDeclaration, step, flow,
				useCase, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors, step__actor____actor,
				flow__step____steps, useCase__flow____flows };
	}

	public static final void pattern_StepAltToOperandRule_0_6_expressionBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		_this.registerObjectsToMatch_FWD(match, actor, packageDeclaration,
				step, alt, altFlow, flow, useCase);

	}

	public static final boolean pattern_StepAltToOperandRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_3 = isApplicableMatch.getObject("combo");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("stepToCombo");
		EObject _localVariable_6 = isApplicableMatch.getObject("alt");
		EObject _localVariable_7 = isApplicableMatch.getObject("altFlow");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject _localVariable_9 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_10 = isApplicableMatch.getObject("line");
		EObject tmpActor = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpActorToLine = _localVariable_2;
		EObject tmpCombo = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpStepToCombo = _localVariable_5;
		EObject tmpAlt = _localVariable_6;
		EObject tmpAltFlow = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		EObject tmpUseCase = _localVariable_9;
		EObject tmpLine = _localVariable_10;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpActorToLine instanceof ActorToLifeline) {
					ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
					if (tmpCombo instanceof CombinedFragment) {
						CombinedFragment combo = (CombinedFragment) tmpCombo;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpStepToCombo instanceof NormalStepToCombinedFragment) {
								NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) tmpStepToCombo;
								if (tmpAlt instanceof AlternativeFlowAlternative) {
									AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
									if (tmpAltFlow instanceof AlternativeFlow) {
										AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											if (tmpUseCase instanceof UseCase) {
												UseCase useCase = (UseCase) tmpUseCase;
												if (tmpLine instanceof Lifeline) {
													Lifeline line = (Lifeline) tmpLine;
													return new Object[] {
															actor,
															packageDeclaration,
															actorToLine, combo,
															step, stepToCombo,
															alt, altFlow, flow,
															useCase, line,
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

	public static final Object[] pattern_StepAltToOperandRule_1_1_blackBBBBBBBBBBBFBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line, StepAltToOperandRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!altFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { actor, packageDeclaration,
							actorToLine, combo, step, stepToCombo, alt,
							altFlow, flow, useCase, line, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_StepAltToOperandRule_1_1_binding = pattern_StepAltToOperandRule_1_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_StepAltToOperandRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_StepAltToOperandRule_1_1_binding[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_StepAltToOperandRule_1_1_binding[1];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_StepAltToOperandRule_1_1_binding[2];
			CombinedFragment combo = (CombinedFragment) result_pattern_StepAltToOperandRule_1_1_binding[3];
			NormalStep step = (NormalStep) result_pattern_StepAltToOperandRule_1_1_binding[4];
			NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result_pattern_StepAltToOperandRule_1_1_binding[5];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_StepAltToOperandRule_1_1_binding[6];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_StepAltToOperandRule_1_1_binding[7];
			Flow flow = (Flow) result_pattern_StepAltToOperandRule_1_1_binding[8];
			UseCase useCase = (UseCase) result_pattern_StepAltToOperandRule_1_1_binding[9];
			Lifeline line = (Lifeline) result_pattern_StepAltToOperandRule_1_1_binding[10];

			Object[] result_pattern_StepAltToOperandRule_1_1_black = pattern_StepAltToOperandRule_1_1_blackBBBBBBBBBBBFBB(
					actor, packageDeclaration, actorToLine, combo, step,
					stepToCombo, alt, altFlow, flow, useCase, line, _this,
					isApplicableMatch);
			if (result_pattern_StepAltToOperandRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_StepAltToOperandRule_1_1_black[11];

				return new Object[] { actor, packageDeclaration, actorToLine,
						combo, step, stepToCombo, alt, altFlow, flow, useCase,
						line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_1_1_greenFBBFFFFBBB(
			CombinedFragment combo, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, Lifeline line, CSP csp) {
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		StepAlternativeToInteractionOperand altToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		Object _localVariable_0 = csp.getValue("guard", "name");
		Object _localVariable_1 = csp.getValue("spec", "value");
		altFlowToOperand.setSource(altFlow);
		altFlowToOperand.setTarget(operand);
		combo.getOperand().add(operand);
		line.getCoveredBy().add(operand);
		altToOperand.setSource(alt);
		altToOperand.setTarget(operand);
		operand.setGuard(guard);
		guard.setSpecification(spec);
		String guard_name_prime = (String) _localVariable_0;
		String spec_value_prime = (String) _localVariable_1;
		guard.setName(guard_name_prime);
		spec.setValue(spec_value_prime);
		return new Object[] { altFlowToOperand, combo, alt, operand,
				altToOperand, guard, spec, altFlow, line, csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_1_2_blackBBBBBBB(
			FlowToInteractionFragment altFlowToOperand,
			AlternativeFlowAlternative alt, InteractionOperand operand,
			StepAlternativeToInteractionOperand altToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow) {
		return new Object[] { altFlowToOperand, alt, operand, altToOperand,
				guard, spec, altFlow };
	}

	public static final Object[] pattern_StepAltToOperandRule_1_2_greenFBBBBBBB(
			FlowToInteractionFragment altFlowToOperand,
			AlternativeFlowAlternative alt, InteractionOperand operand,
			StepAlternativeToInteractionOperand altToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(altToOperand);
		ruleresult.getCreatedElements().add(guard);
		ruleresult.getCreatedElements().add(spec);
		ruleresult.getTranslatedElements().add(altFlow);
		return new Object[] { ruleresult, altFlowToOperand, alt, operand,
				altToOperand, guard, spec, altFlow };
	}

	public static final Object[] pattern_StepAltToOperandRule_1_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject altFlowToOperand,
			EObject actor, EObject packageDeclaration, EObject actorToLine,
			EObject combo, EObject step, EObject stepToCombo, EObject alt,
			EObject operand, EObject altToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject flow, EObject useCase, EObject line) {
		if (!altFlowToOperand.equals(packageDeclaration)) {
			if (!altFlowToOperand.equals(combo)) {
				if (!altFlowToOperand.equals(step)) {
					if (!altFlowToOperand.equals(stepToCombo)) {
						if (!altFlowToOperand.equals(operand)) {
							if (!altFlowToOperand.equals(altToOperand)) {
								if (!altFlowToOperand.equals(guard)) {
									if (!altFlowToOperand.equals(spec)) {
										if (!altFlowToOperand.equals(flow)) {
											if (!altFlowToOperand
													.equals(useCase)) {
												if (!altFlowToOperand
														.equals(line)) {
													if (!actor
															.equals(altFlowToOperand)) {
														if (!actor
																.equals(packageDeclaration)) {
															if (!actor
																	.equals(actorToLine)) {
																if (!actor
																		.equals(combo)) {
																	if (!actor
																			.equals(step)) {
																		if (!actor
																				.equals(stepToCombo)) {
																			if (!actor
																					.equals(alt)) {
																				if (!actor
																						.equals(operand)) {
																					if (!actor
																							.equals(altToOperand)) {
																						if (!actor
																								.equals(guard)) {
																							if (!actor
																									.equals(spec)) {
																								if (!actor
																										.equals(altFlow)) {
																									if (!actor
																											.equals(flow)) {
																										if (!actor
																												.equals(useCase)) {
																											if (!actor
																													.equals(line)) {
																												if (!packageDeclaration
																														.equals(step)) {
																													if (!packageDeclaration
																															.equals(stepToCombo)) {
																														if (!packageDeclaration
																																.equals(spec)) {
																															if (!packageDeclaration
																																	.equals(useCase)) {
																																if (!actorToLine
																																		.equals(altFlowToOperand)) {
																																	if (!actorToLine
																																			.equals(packageDeclaration)) {
																																		if (!actorToLine
																																				.equals(combo)) {
																																			if (!actorToLine
																																					.equals(step)) {
																																				if (!actorToLine
																																						.equals(stepToCombo)) {
																																					if (!actorToLine
																																							.equals(alt)) {
																																						if (!actorToLine
																																								.equals(operand)) {
																																							if (!actorToLine
																																									.equals(altToOperand)) {
																																								if (!actorToLine
																																										.equals(guard)) {
																																									if (!actorToLine
																																											.equals(spec)) {
																																										if (!actorToLine
																																												.equals(altFlow)) {
																																											if (!actorToLine
																																													.equals(flow)) {
																																												if (!actorToLine
																																														.equals(useCase)) {
																																													if (!actorToLine
																																															.equals(line)) {
																																														if (!combo
																																																.equals(packageDeclaration)) {
																																															if (!combo
																																																	.equals(step)) {
																																																if (!combo
																																																		.equals(stepToCombo)) {
																																																	if (!combo
																																																			.equals(operand)) {
																																																		if (!combo
																																																				.equals(guard)) {
																																																			if (!combo
																																																					.equals(spec)) {
																																																				if (!combo
																																																						.equals(flow)) {
																																																					if (!combo
																																																							.equals(useCase)) {
																																																						if (!combo
																																																								.equals(line)) {
																																																							if (!step
																																																									.equals(stepToCombo)) {
																																																								if (!step
																																																										.equals(useCase)) {
																																																									if (!stepToCombo
																																																											.equals(useCase)) {
																																																										if (!alt.equals(altFlowToOperand)) {
																																																											if (!alt.equals(packageDeclaration)) {
																																																												if (!alt.equals(combo)) {
																																																													if (!alt.equals(step)) {
																																																														if (!alt.equals(stepToCombo)) {
																																																															if (!alt.equals(operand)) {
																																																																if (!alt.equals(altToOperand)) {
																																																																	if (!alt.equals(guard)) {
																																																																		if (!alt.equals(spec)) {
																																																																			if (!alt.equals(altFlow)) {
																																																																				if (!alt.equals(flow)) {
																																																																					if (!alt.equals(useCase)) {
																																																																						if (!alt.equals(line)) {
																																																																							if (!operand
																																																																									.equals(packageDeclaration)) {
																																																																								if (!operand
																																																																										.equals(step)) {
																																																																									if (!operand
																																																																											.equals(stepToCombo)) {
																																																																										if (!operand
																																																																												.equals(spec)) {
																																																																											if (!operand
																																																																													.equals(useCase)) {
																																																																												if (!altToOperand
																																																																														.equals(packageDeclaration)) {
																																																																													if (!altToOperand
																																																																															.equals(combo)) {
																																																																														if (!altToOperand
																																																																																.equals(step)) {
																																																																															if (!altToOperand
																																																																																	.equals(stepToCombo)) {
																																																																																if (!altToOperand
																																																																																		.equals(operand)) {
																																																																																	if (!altToOperand
																																																																																			.equals(guard)) {
																																																																																		if (!altToOperand
																																																																																				.equals(spec)) {
																																																																																			if (!altToOperand
																																																																																					.equals(flow)) {
																																																																																				if (!altToOperand
																																																																																						.equals(useCase)) {
																																																																																					if (!altToOperand
																																																																																							.equals(line)) {
																																																																																						if (!guard
																																																																																								.equals(packageDeclaration)) {
																																																																																							if (!guard
																																																																																									.equals(step)) {
																																																																																								if (!guard
																																																																																										.equals(stepToCombo)) {
																																																																																									if (!guard
																																																																																											.equals(operand)) {
																																																																																										if (!guard
																																																																																												.equals(spec)) {
																																																																																											if (!guard
																																																																																													.equals(useCase)) {
																																																																																												if (!guard
																																																																																														.equals(line)) {
																																																																																													if (!spec
																																																																																															.equals(step)) {
																																																																																														if (!spec
																																																																																																.equals(stepToCombo)) {
																																																																																															if (!spec
																																																																																																	.equals(useCase)) {
																																																																																																if (!altFlow
																																																																																																		.equals(altFlowToOperand)) {
																																																																																																	if (!altFlow
																																																																																																			.equals(packageDeclaration)) {
																																																																																																		if (!altFlow
																																																																																																				.equals(combo)) {
																																																																																																			if (!altFlow
																																																																																																					.equals(step)) {
																																																																																																				if (!altFlow
																																																																																																						.equals(stepToCombo)) {
																																																																																																					if (!altFlow
																																																																																																							.equals(operand)) {
																																																																																																						if (!altFlow
																																																																																																								.equals(altToOperand)) {
																																																																																																							if (!altFlow
																																																																																																									.equals(guard)) {
																																																																																																								if (!altFlow
																																																																																																										.equals(spec)) {
																																																																																																									if (!altFlow
																																																																																																											.equals(flow)) {
																																																																																																										if (!altFlow
																																																																																																												.equals(useCase)) {
																																																																																																											if (!altFlow
																																																																																																													.equals(line)) {
																																																																																																												if (!flow
																																																																																																														.equals(packageDeclaration)) {
																																																																																																													if (!flow
																																																																																																															.equals(step)) {
																																																																																																														if (!flow
																																																																																																																.equals(stepToCombo)) {
																																																																																																															if (!flow
																																																																																																																	.equals(operand)) {
																																																																																																																if (!flow
																																																																																																																		.equals(guard)) {
																																																																																																																	if (!flow
																																																																																																																			.equals(spec)) {
																																																																																																																		if (!flow
																																																																																																																				.equals(useCase)) {
																																																																																																																			if (!flow
																																																																																																																					.equals(line)) {
																																																																																																																				if (!line
																																																																																																																						.equals(packageDeclaration)) {
																																																																																																																					if (!line
																																																																																																																							.equals(step)) {
																																																																																																																						if (!line
																																																																																																																								.equals(stepToCombo)) {
																																																																																																																							if (!line
																																																																																																																									.equals(operand)) {
																																																																																																																								if (!line
																																																																																																																										.equals(spec)) {
																																																																																																																									if (!line
																																																																																																																											.equals(useCase)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												altFlowToOperand,
																																																																																																																												actor,
																																																																																																																												packageDeclaration,
																																																																																																																												actorToLine,
																																																																																																																												combo,
																																																																																																																												step,
																																																																																																																												stepToCombo,
																																																																																																																												alt,
																																																																																																																												operand,
																																																																																																																												altToOperand,
																																																																																																																												guard,
																																																																																																																												spec,
																																																																																																																												altFlow,
																																																																																																																												flow,
																																																																																																																												useCase,
																																																																																																																												line };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject altFlowToOperand,
			EObject combo, EObject step, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject useCase, EObject line) {
		EMoflonEdge altFlowToOperand__altFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altToOperand__alt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "StepAltToOperandRule";
		String altFlowToOperand__altFlow____source_name_prime = "source";
		String altFlowToOperand__operand____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__altFlow____ref_name_prime = "ref";
		String operand__guard____guard_name_prime = "guard";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String altToOperand__alt____source_name_prime = "source";
		String altToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		String useCase__altFlow____flows_name_prime = "flows";
		altFlowToOperand__altFlow____source.setSrc(altFlowToOperand);
		altFlowToOperand__altFlow____source.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(altFlowToOperand__altFlow____source);
		altFlowToOperand__operand____target.setSrc(altFlowToOperand);
		altFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altFlowToOperand__operand____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getCreatedEdges().add(combo__operand____operand);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		ruleresult.getTranslatedEdges().add(step__alt____stepAlternative);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(alt__altFlow____ref);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getCreatedEdges().add(operand__guard____guard);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getCreatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(operand__line____covered);
		altToOperand__alt____source.setSrc(altToOperand);
		altToOperand__alt____source.setTrg(alt);
		ruleresult.getCreatedEdges().add(altToOperand__alt____source);
		altToOperand__operand____target.setSrc(altToOperand);
		altToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getCreatedEdges().add(guard__spec____specification);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(useCase__altFlow____flows);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		altFlowToOperand__altFlow____source
				.setName(altFlowToOperand__altFlow____source_name_prime);
		altFlowToOperand__operand____target
				.setName(altFlowToOperand__operand____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		altToOperand__alt____source
				.setName(altToOperand__alt____source_name_prime);
		altToOperand__operand____target
				.setName(altToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		return new Object[] { ruleresult, altFlowToOperand, combo, step, alt,
				operand, altToOperand, guard, spec, altFlow, useCase, line,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target, combo__operand____operand,
				step__alt____stepAlternative, alt__altFlow____ref,
				operand__guard____guard, line__operand____coveredBy,
				operand__line____covered, altToOperand__alt____source,
				altToOperand__operand____target, guard__spec____specification,
				useCase__altFlow____flows };
	}

	public static final void pattern_StepAltToOperandRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
			StepAltToOperandRule _this, PerformRuleResult ruleresult,
			EObject altFlowToOperand, EObject actor,
			EObject packageDeclaration, EObject actorToLine, EObject combo,
			EObject step, EObject stepToCombo, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject flow, EObject useCase, EObject line) {
		_this.registerObjects_FWD(ruleresult, altFlowToOperand, actor,
				packageDeclaration, actorToLine, combo, step, stepToCombo, alt,
				operand, altToOperand, guard, spec, altFlow, flow, useCase,
				line);

	}

	public static final PerformRuleResult pattern_StepAltToOperandRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_1_blackFBB(
			EClass eClass, StepAltToOperandRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_2_1_binding = pattern_StepAltToOperandRule_2_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_StepAltToOperandRule_2_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_2_1_black = pattern_StepAltToOperandRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_StepAltToOperandRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_StepAltToOperandRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "StepAltToOperandRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_StepAltToOperandRule_2_2_bindingFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("packageDeclaration");
		EObject _localVariable_2 = match.getObject("step");
		EObject _localVariable_3 = match.getObject("alt");
		EObject _localVariable_4 = match.getObject("altFlow");
		EObject _localVariable_5 = match.getObject("flow");
		EObject _localVariable_6 = match.getObject("useCase");
		EObject tmpActor = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpAlt = _localVariable_3;
		EObject tmpAltFlow = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					if (tmpAlt instanceof AlternativeFlowAlternative) {
						AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
						if (tmpAltFlow instanceof AlternativeFlow) {
							AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									return new Object[] { actor,
											packageDeclaration, step, alt,
											altFlow, flow, useCase, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_2_2_blackBBFFBFBBBBFB(
			Actor actor, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow, Flow flow, UseCase useCase, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(actor, ActorToLifeline.class,
							"source")) {
				Lifeline line = actorToLine.getTarget();
				if (line != null) {
					for (NormalStepToCombinedFragment stepToCombo : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(step,
									NormalStepToCombinedFragment.class,
									"source")) {
						CombinedFragment combo = stepToCombo.getTarget();
						if (combo != null) {
							_result.add(new Object[] { actor,
									packageDeclaration, actorToLine, combo,
									step, stepToCombo, alt, altFlow, flow,
									useCase, line, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_2_3_blackBBBBBBBBBBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			if (packageDeclaration.getUseCases().contains(useCase)) {
				if (packageDeclaration.getActors().contains(actor)) {
					if (actor.equals(actorToLine.getSource())) {
						if (line.equals(actorToLine.getTarget())) {
							if (line.getCoveredBy().contains(combo)) {
								if (step.getStepAlternative().contains(alt)) {
									if (actor.equals(step.getActor())) {
										if (step.equals(stepToCombo.getSource())) {
											if (combo.equals(stepToCombo
													.getTarget())) {
												if (altFlow
														.equals(alt.getRef())) {
													if (flow.getSteps()
															.contains(step)) {
														if (useCase.getFlows()
																.contains(flow)) {
															if (useCase
																	.getFlows()
																	.contains(
																			altFlow)) {
																_result.add(new Object[] {
																		actor,
																		packageDeclaration,
																		actorToLine,
																		combo,
																		step,
																		stepToCombo,
																		alt,
																		altFlow,
																		flow,
																		useCase,
																		line });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String alt__altFlow____ref_name_prime = "ref";
		String flow__step____steps_name_prime = "steps";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__altFlow____flows_name_prime = "flows";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(stepToCombo);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(altFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(line);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(combo__line____covered);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				step__alt____stepAlternative);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__combo____target);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(alt__altFlow____ref);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		isApplicableMatch.getAllContextElements()
				.add(useCase__altFlow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		return new Object[] { actor, packageDeclaration, actorToLine, combo,
				step, stepToCombo, alt, altFlow, flow, useCase, line,
				isApplicableMatch, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__combo____coveredBy, combo__line____covered,
				step__alt____stepAlternative, step__actor____actor,
				stepToCombo__step____source, stepToCombo__combo____target,
				alt__altFlow____ref, flow__step____steps,
				useCase__flow____flows, useCase__altFlow____flows };
	}

	public static final Object[] pattern_StepAltToOperandRule_2_4_bindingFBBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, packageDeclaration, actorToLine,
				combo, step, stepToCombo, alt, altFlow, flow, useCase, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					packageDeclaration, actorToLine, combo, step, stepToCombo,
					alt, altFlow, flow, useCase, line };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase, Lifeline line) {
		Object[] result_pattern_StepAltToOperandRule_2_4_binding = pattern_StepAltToOperandRule_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, packageDeclaration,
				actorToLine, combo, step, stepToCombo, alt, altFlow, flow,
				useCase, line);
		if (result_pattern_StepAltToOperandRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_StepAltToOperandRule_2_4_binding[0];

			Object[] result_pattern_StepAltToOperandRule_2_4_black = pattern_StepAltToOperandRule_2_4_blackB(csp);
			if (result_pattern_StepAltToOperandRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, alt, altFlow, flow, useCase, line };
			}
		}
		return null;
	}

	public static final boolean pattern_StepAltToOperandRule_2_5_expressionFBB(
			StepAltToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_StepAltToOperandRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "StepAltToOperandRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_StepAltToOperandRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_10_1_blackBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		return new Object[] { _this, match, combo, operand, guard, spec, line };
	}

	public static final Object[] pattern_StepAltToOperandRule_10_2_bindingFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, combo,
				operand, guard, spec, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, combo, operand, guard,
					spec, line };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_10_2_bindingAndBlackFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		Object[] result_pattern_StepAltToOperandRule_10_2_binding = pattern_StepAltToOperandRule_10_2_bindingFBBBBBBB(
				_this, match, combo, operand, guard, spec, line);
		if (result_pattern_StepAltToOperandRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_StepAltToOperandRule_10_2_binding[0];

			Object[] result_pattern_StepAltToOperandRule_10_2_black = pattern_StepAltToOperandRule_10_2_blackB(csp);
			if (result_pattern_StepAltToOperandRule_10_2_black != null) {

				return new Object[] { csp, _this, match, combo, operand, guard,
						spec, line };
			}
		}
		return null;
	}

	public static final boolean pattern_StepAltToOperandRule_10_3_expressionFBB(
			StepAltToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_10_4_blackBBBBBB(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Lifeline line) {
		return new Object[] { match, combo, operand, guard, spec, line };
	}

	public static final Object[] pattern_StepAltToOperandRule_10_4_greenBBBBBBFFFFF(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Lifeline line) {
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(operand);
		match.getToBeTranslatedNodes().add(guard);
		match.getToBeTranslatedNodes().add(spec);
		String combo__operand____operand_name_prime = "operand";
		String operand__guard____guard_name_prime = "guard";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String guard__spec____specification_name_prime = "specification";
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		match.getToBeTranslatedEdges().add(combo__operand____operand);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		match.getToBeTranslatedEdges().add(operand__guard____guard);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		match.getToBeTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(operand__line____covered);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		match.getToBeTranslatedEdges().add(guard__spec____specification);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { match, combo, operand, guard, spec, line,
				combo__operand____operand, operand__guard____guard,
				line__operand____coveredBy, operand__line____covered,
				guard__spec____specification };
	}

	public static final Object[] pattern_StepAltToOperandRule_10_5_blackBBBBBB(
			Match match, CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Lifeline line) {
		return new Object[] { match, combo, operand, guard, spec, line };
	}

	public static final Object[] pattern_StepAltToOperandRule_10_5_greenBBBFF(
			Match match, CombinedFragment combo, Lifeline line) {
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(combo);
		match.getContextNodes().add(line);
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		match.getContextEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		match.getContextEdges().add(combo__line____covered);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		return new Object[] { match, combo, line, line__combo____coveredBy,
				combo__line____covered };
	}

	public static final void pattern_StepAltToOperandRule_10_6_expressionBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		_this.registerObjectsToMatch_BWD(match, combo, operand, guard, spec,
				line);

	}

	public static final boolean pattern_StepAltToOperandRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_11_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_3 = isApplicableMatch.getObject("combo");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("stepToCombo");
		EObject _localVariable_6 = isApplicableMatch.getObject("operand");
		EObject _localVariable_7 = isApplicableMatch.getObject("guard");
		EObject _localVariable_8 = isApplicableMatch.getObject("spec");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject _localVariable_10 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_11 = isApplicableMatch.getObject("line");
		EObject tmpActor = _localVariable_0;
		EObject tmpPackageDeclaration = _localVariable_1;
		EObject tmpActorToLine = _localVariable_2;
		EObject tmpCombo = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpStepToCombo = _localVariable_5;
		EObject tmpOperand = _localVariable_6;
		EObject tmpGuard = _localVariable_7;
		EObject tmpSpec = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		EObject tmpUseCase = _localVariable_10;
		EObject tmpLine = _localVariable_11;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpPackageDeclaration instanceof PackageDeclaration) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
				if (tmpActorToLine instanceof ActorToLifeline) {
					ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
					if (tmpCombo instanceof CombinedFragment) {
						CombinedFragment combo = (CombinedFragment) tmpCombo;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpStepToCombo instanceof NormalStepToCombinedFragment) {
								NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) tmpStepToCombo;
								if (tmpOperand instanceof InteractionOperand) {
									InteractionOperand operand = (InteractionOperand) tmpOperand;
									if (tmpGuard instanceof InteractionConstraint) {
										InteractionConstraint guard = (InteractionConstraint) tmpGuard;
										if (tmpSpec instanceof LiteralString) {
											LiteralString spec = (LiteralString) tmpSpec;
											if (tmpFlow instanceof Flow) {
												Flow flow = (Flow) tmpFlow;
												if (tmpUseCase instanceof UseCase) {
													UseCase useCase = (UseCase) tmpUseCase;
													if (tmpLine instanceof Lifeline) {
														Lifeline line = (Lifeline) tmpLine;
														return new Object[] {
																actor,
																packageDeclaration,
																actorToLine,
																combo, step,
																stepToCombo,
																operand, guard,
																spec, flow,
																useCase, line,
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

	public static final Object[] pattern_StepAltToOperandRule_11_1_blackBBBBBBBBBBBBFBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line,
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { actor, packageDeclaration, actorToLine,
						combo, step, stepToCombo, operand, guard, spec, flow,
						useCase, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_StepAltToOperandRule_11_1_binding = pattern_StepAltToOperandRule_11_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_StepAltToOperandRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_StepAltToOperandRule_11_1_binding[0];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_StepAltToOperandRule_11_1_binding[1];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_StepAltToOperandRule_11_1_binding[2];
			CombinedFragment combo = (CombinedFragment) result_pattern_StepAltToOperandRule_11_1_binding[3];
			NormalStep step = (NormalStep) result_pattern_StepAltToOperandRule_11_1_binding[4];
			NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result_pattern_StepAltToOperandRule_11_1_binding[5];
			InteractionOperand operand = (InteractionOperand) result_pattern_StepAltToOperandRule_11_1_binding[6];
			InteractionConstraint guard = (InteractionConstraint) result_pattern_StepAltToOperandRule_11_1_binding[7];
			LiteralString spec = (LiteralString) result_pattern_StepAltToOperandRule_11_1_binding[8];
			Flow flow = (Flow) result_pattern_StepAltToOperandRule_11_1_binding[9];
			UseCase useCase = (UseCase) result_pattern_StepAltToOperandRule_11_1_binding[10];
			Lifeline line = (Lifeline) result_pattern_StepAltToOperandRule_11_1_binding[11];

			Object[] result_pattern_StepAltToOperandRule_11_1_black = pattern_StepAltToOperandRule_11_1_blackBBBBBBBBBBBBFBB(
					actor, packageDeclaration, actorToLine, combo, step,
					stepToCombo, operand, guard, spec, flow, useCase, line,
					_this, isApplicableMatch);
			if (result_pattern_StepAltToOperandRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_StepAltToOperandRule_11_1_black[12];

				return new Object[] { actor, packageDeclaration, actorToLine,
						combo, step, stepToCombo, operand, guard, spec, flow,
						useCase, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_11_1_greenFBFBFFBB(
			NormalStep step, InteractionOperand operand, UseCase useCase,
			CSP csp) {
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		StepAlternativeToInteractionOperand altToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		AlternativeFlow altFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("altFlow", "name");
		altFlowToOperand.setTarget(operand);
		step.getStepAlternative().add(alt);
		altToOperand.setSource(alt);
		altToOperand.setTarget(operand);
		altFlowToOperand.setSource(altFlow);
		alt.setRef(altFlow);
		useCase.getFlows().add(altFlow);
		String alt_condition_prime = (String) _localVariable_0;
		String altFlow_name_prime = (String) _localVariable_1;
		alt.setCondition(alt_condition_prime);
		altFlow.setName(altFlow_name_prime);
		return new Object[] { altFlowToOperand, step, alt, operand,
				altToOperand, altFlow, useCase, csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_11_2_blackBBBBBBB(
			FlowToInteractionFragment altFlowToOperand,
			AlternativeFlowAlternative alt, InteractionOperand operand,
			StepAlternativeToInteractionOperand altToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow) {
		return new Object[] { altFlowToOperand, alt, operand, altToOperand,
				guard, spec, altFlow };
	}

	public static final Object[] pattern_StepAltToOperandRule_11_2_greenFBBBBBBB(
			FlowToInteractionFragment altFlowToOperand,
			AlternativeFlowAlternative alt, InteractionOperand operand,
			StepAlternativeToInteractionOperand altToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getTranslatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(altToOperand);
		ruleresult.getTranslatedElements().add(guard);
		ruleresult.getTranslatedElements().add(spec);
		ruleresult.getCreatedElements().add(altFlow);
		return new Object[] { ruleresult, altFlowToOperand, alt, operand,
				altToOperand, guard, spec, altFlow };
	}

	public static final Object[] pattern_StepAltToOperandRule_11_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject altFlowToOperand,
			EObject actor, EObject packageDeclaration, EObject actorToLine,
			EObject combo, EObject step, EObject stepToCombo, EObject alt,
			EObject operand, EObject altToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject flow, EObject useCase, EObject line) {
		if (!altFlowToOperand.equals(packageDeclaration)) {
			if (!altFlowToOperand.equals(combo)) {
				if (!altFlowToOperand.equals(step)) {
					if (!altFlowToOperand.equals(stepToCombo)) {
						if (!altFlowToOperand.equals(operand)) {
							if (!altFlowToOperand.equals(altToOperand)) {
								if (!altFlowToOperand.equals(guard)) {
									if (!altFlowToOperand.equals(spec)) {
										if (!altFlowToOperand.equals(flow)) {
											if (!altFlowToOperand
													.equals(useCase)) {
												if (!altFlowToOperand
														.equals(line)) {
													if (!actor
															.equals(altFlowToOperand)) {
														if (!actor
																.equals(packageDeclaration)) {
															if (!actor
																	.equals(actorToLine)) {
																if (!actor
																		.equals(combo)) {
																	if (!actor
																			.equals(step)) {
																		if (!actor
																				.equals(stepToCombo)) {
																			if (!actor
																					.equals(alt)) {
																				if (!actor
																						.equals(operand)) {
																					if (!actor
																							.equals(altToOperand)) {
																						if (!actor
																								.equals(guard)) {
																							if (!actor
																									.equals(spec)) {
																								if (!actor
																										.equals(altFlow)) {
																									if (!actor
																											.equals(flow)) {
																										if (!actor
																												.equals(useCase)) {
																											if (!actor
																													.equals(line)) {
																												if (!packageDeclaration
																														.equals(step)) {
																													if (!packageDeclaration
																															.equals(stepToCombo)) {
																														if (!packageDeclaration
																																.equals(spec)) {
																															if (!packageDeclaration
																																	.equals(useCase)) {
																																if (!actorToLine
																																		.equals(altFlowToOperand)) {
																																	if (!actorToLine
																																			.equals(packageDeclaration)) {
																																		if (!actorToLine
																																				.equals(combo)) {
																																			if (!actorToLine
																																					.equals(step)) {
																																				if (!actorToLine
																																						.equals(stepToCombo)) {
																																					if (!actorToLine
																																							.equals(alt)) {
																																						if (!actorToLine
																																								.equals(operand)) {
																																							if (!actorToLine
																																									.equals(altToOperand)) {
																																								if (!actorToLine
																																										.equals(guard)) {
																																									if (!actorToLine
																																											.equals(spec)) {
																																										if (!actorToLine
																																												.equals(altFlow)) {
																																											if (!actorToLine
																																													.equals(flow)) {
																																												if (!actorToLine
																																														.equals(useCase)) {
																																													if (!actorToLine
																																															.equals(line)) {
																																														if (!combo
																																																.equals(packageDeclaration)) {
																																															if (!combo
																																																	.equals(step)) {
																																																if (!combo
																																																		.equals(stepToCombo)) {
																																																	if (!combo
																																																			.equals(operand)) {
																																																		if (!combo
																																																				.equals(guard)) {
																																																			if (!combo
																																																					.equals(spec)) {
																																																				if (!combo
																																																						.equals(flow)) {
																																																					if (!combo
																																																							.equals(useCase)) {
																																																						if (!combo
																																																								.equals(line)) {
																																																							if (!step
																																																									.equals(stepToCombo)) {
																																																								if (!step
																																																										.equals(useCase)) {
																																																									if (!stepToCombo
																																																											.equals(useCase)) {
																																																										if (!alt.equals(altFlowToOperand)) {
																																																											if (!alt.equals(packageDeclaration)) {
																																																												if (!alt.equals(combo)) {
																																																													if (!alt.equals(step)) {
																																																														if (!alt.equals(stepToCombo)) {
																																																															if (!alt.equals(operand)) {
																																																																if (!alt.equals(altToOperand)) {
																																																																	if (!alt.equals(guard)) {
																																																																		if (!alt.equals(spec)) {
																																																																			if (!alt.equals(altFlow)) {
																																																																				if (!alt.equals(flow)) {
																																																																					if (!alt.equals(useCase)) {
																																																																						if (!alt.equals(line)) {
																																																																							if (!operand
																																																																									.equals(packageDeclaration)) {
																																																																								if (!operand
																																																																										.equals(step)) {
																																																																									if (!operand
																																																																											.equals(stepToCombo)) {
																																																																										if (!operand
																																																																												.equals(spec)) {
																																																																											if (!operand
																																																																													.equals(useCase)) {
																																																																												if (!altToOperand
																																																																														.equals(packageDeclaration)) {
																																																																													if (!altToOperand
																																																																															.equals(combo)) {
																																																																														if (!altToOperand
																																																																																.equals(step)) {
																																																																															if (!altToOperand
																																																																																	.equals(stepToCombo)) {
																																																																																if (!altToOperand
																																																																																		.equals(operand)) {
																																																																																	if (!altToOperand
																																																																																			.equals(guard)) {
																																																																																		if (!altToOperand
																																																																																				.equals(spec)) {
																																																																																			if (!altToOperand
																																																																																					.equals(flow)) {
																																																																																				if (!altToOperand
																																																																																						.equals(useCase)) {
																																																																																					if (!altToOperand
																																																																																							.equals(line)) {
																																																																																						if (!guard
																																																																																								.equals(packageDeclaration)) {
																																																																																							if (!guard
																																																																																									.equals(step)) {
																																																																																								if (!guard
																																																																																										.equals(stepToCombo)) {
																																																																																									if (!guard
																																																																																											.equals(operand)) {
																																																																																										if (!guard
																																																																																												.equals(spec)) {
																																																																																											if (!guard
																																																																																													.equals(useCase)) {
																																																																																												if (!guard
																																																																																														.equals(line)) {
																																																																																													if (!spec
																																																																																															.equals(step)) {
																																																																																														if (!spec
																																																																																																.equals(stepToCombo)) {
																																																																																															if (!spec
																																																																																																	.equals(useCase)) {
																																																																																																if (!altFlow
																																																																																																		.equals(altFlowToOperand)) {
																																																																																																	if (!altFlow
																																																																																																			.equals(packageDeclaration)) {
																																																																																																		if (!altFlow
																																																																																																				.equals(combo)) {
																																																																																																			if (!altFlow
																																																																																																					.equals(step)) {
																																																																																																				if (!altFlow
																																																																																																						.equals(stepToCombo)) {
																																																																																																					if (!altFlow
																																																																																																							.equals(operand)) {
																																																																																																						if (!altFlow
																																																																																																								.equals(altToOperand)) {
																																																																																																							if (!altFlow
																																																																																																									.equals(guard)) {
																																																																																																								if (!altFlow
																																																																																																										.equals(spec)) {
																																																																																																									if (!altFlow
																																																																																																											.equals(flow)) {
																																																																																																										if (!altFlow
																																																																																																												.equals(useCase)) {
																																																																																																											if (!altFlow
																																																																																																													.equals(line)) {
																																																																																																												if (!flow
																																																																																																														.equals(packageDeclaration)) {
																																																																																																													if (!flow
																																																																																																															.equals(step)) {
																																																																																																														if (!flow
																																																																																																																.equals(stepToCombo)) {
																																																																																																															if (!flow
																																																																																																																	.equals(operand)) {
																																																																																																																if (!flow
																																																																																																																		.equals(guard)) {
																																																																																																																	if (!flow
																																																																																																																			.equals(spec)) {
																																																																																																																		if (!flow
																																																																																																																				.equals(useCase)) {
																																																																																																																			if (!flow
																																																																																																																					.equals(line)) {
																																																																																																																				if (!line
																																																																																																																						.equals(packageDeclaration)) {
																																																																																																																					if (!line
																																																																																																																							.equals(step)) {
																																																																																																																						if (!line
																																																																																																																								.equals(stepToCombo)) {
																																																																																																																							if (!line
																																																																																																																									.equals(operand)) {
																																																																																																																								if (!line
																																																																																																																										.equals(spec)) {
																																																																																																																									if (!line
																																																																																																																											.equals(useCase)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												altFlowToOperand,
																																																																																																																												actor,
																																																																																																																												packageDeclaration,
																																																																																																																												actorToLine,
																																																																																																																												combo,
																																																																																																																												step,
																																																																																																																												stepToCombo,
																																																																																																																												alt,
																																																																																																																												operand,
																																																																																																																												altToOperand,
																																																																																																																												guard,
																																																																																																																												spec,
																																																																																																																												altFlow,
																																																																																																																												flow,
																																																																																																																												useCase,
																																																																																																																												line };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject altFlowToOperand,
			EObject combo, EObject step, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject useCase, EObject line) {
		EMoflonEdge altFlowToOperand__altFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altToOperand__alt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "StepAltToOperandRule";
		String altFlowToOperand__altFlow____source_name_prime = "source";
		String altFlowToOperand__operand____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String alt__altFlow____ref_name_prime = "ref";
		String operand__guard____guard_name_prime = "guard";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String altToOperand__alt____source_name_prime = "source";
		String altToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		String useCase__altFlow____flows_name_prime = "flows";
		altFlowToOperand__altFlow____source.setSrc(altFlowToOperand);
		altFlowToOperand__altFlow____source.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(altFlowToOperand__altFlow____source);
		altFlowToOperand__operand____target.setSrc(altFlowToOperand);
		altFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altFlowToOperand__operand____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getTranslatedEdges().add(combo__operand____operand);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		ruleresult.getCreatedEdges().add(step__alt____stepAlternative);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(alt__altFlow____ref);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getTranslatedEdges().add(operand__guard____guard);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(operand__line____covered);
		altToOperand__alt____source.setSrc(altToOperand);
		altToOperand__alt____source.setTrg(alt);
		ruleresult.getCreatedEdges().add(altToOperand__alt____source);
		altToOperand__operand____target.setSrc(altToOperand);
		altToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getTranslatedEdges().add(guard__spec____specification);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(useCase__altFlow____flows);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		altFlowToOperand__altFlow____source
				.setName(altFlowToOperand__altFlow____source_name_prime);
		altFlowToOperand__operand____target
				.setName(altFlowToOperand__operand____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		altToOperand__alt____source
				.setName(altToOperand__alt____source_name_prime);
		altToOperand__operand____target
				.setName(altToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		return new Object[] { ruleresult, altFlowToOperand, combo, step, alt,
				operand, altToOperand, guard, spec, altFlow, useCase, line,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target, combo__operand____operand,
				step__alt____stepAlternative, alt__altFlow____ref,
				operand__guard____guard, line__operand____coveredBy,
				operand__line____covered, altToOperand__alt____source,
				altToOperand__operand____target, guard__spec____specification,
				useCase__altFlow____flows };
	}

	public static final void pattern_StepAltToOperandRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
			StepAltToOperandRule _this, PerformRuleResult ruleresult,
			EObject altFlowToOperand, EObject actor,
			EObject packageDeclaration, EObject actorToLine, EObject combo,
			EObject step, EObject stepToCombo, EObject alt, EObject operand,
			EObject altToOperand, EObject guard, EObject spec, EObject altFlow,
			EObject flow, EObject useCase, EObject line) {
		_this.registerObjects_BWD(ruleresult, altFlowToOperand, actor,
				packageDeclaration, actorToLine, combo, step, stepToCombo, alt,
				operand, altToOperand, guard, spec, altFlow, flow, useCase,
				line);

	}

	public static final PerformRuleResult pattern_StepAltToOperandRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_1_blackFBB(
			EClass eClass, StepAltToOperandRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_12_1_binding = pattern_StepAltToOperandRule_12_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_StepAltToOperandRule_12_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_12_1_black = pattern_StepAltToOperandRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_StepAltToOperandRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_StepAltToOperandRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "StepAltToOperandRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_StepAltToOperandRule_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("combo");
		EObject _localVariable_1 = match.getObject("operand");
		EObject _localVariable_2 = match.getObject("guard");
		EObject _localVariable_3 = match.getObject("spec");
		EObject _localVariable_4 = match.getObject("line");
		EObject tmpCombo = _localVariable_0;
		EObject tmpOperand = _localVariable_1;
		EObject tmpGuard = _localVariable_2;
		EObject tmpSpec = _localVariable_3;
		EObject tmpLine = _localVariable_4;
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (tmpGuard instanceof InteractionConstraint) {
					InteractionConstraint guard = (InteractionConstraint) tmpGuard;
					if (tmpSpec instanceof LiteralString) {
						LiteralString spec = (LiteralString) tmpSpec;
						if (tmpLine instanceof Lifeline) {
							Lifeline line = (Lifeline) tmpLine;
							return new Object[] { combo, operand, guard, spec,
									line, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_12_2_blackFFBFFBBBBB(
			CombinedFragment combo, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec, Lifeline line,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(line, ActorToLifeline.class,
						"target")) {
			Actor actor = actorToLine.getSource();
			if (actor != null) {
				for (NormalStepToCombinedFragment stepToCombo : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(combo,
								NormalStepToCombinedFragment.class, "target")) {
					NormalStep step = stepToCombo.getSource();
					if (step != null) {
						_result.add(new Object[] { actor, actorToLine, combo,
								step, stepToCombo, operand, guard, spec, line,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_12_3_blackBFBBBBBBBFFB(
			Actor actor, ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (actor.equals(actorToLine.getSource())) {
			if (line.equals(actorToLine.getTarget())) {
				if (combo.getOperand().contains(operand)) {
					if (line.getCoveredBy().contains(combo)) {
						if (actor.equals(step.getActor())) {
							if (step.equals(stepToCombo.getSource())) {
								if (combo.equals(stepToCombo.getTarget())) {
									if (guard.equals(operand.getGuard())) {
										if (line.getCoveredBy().contains(
												operand)) {
											if (spec.equals(guard
													.getSpecification())) {
												for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																actor,
																PackageDeclaration.class,
																"actors")) {
													for (UseCase useCase : packageDeclaration
															.getUseCases()) {
														for (Flow flow : useCase
																.getFlows()) {
															if (flow.getSteps()
																	.contains(
																			step)) {
																_result.add(new Object[] {
																		actor,
																		packageDeclaration,
																		actorToLine,
																		combo,
																		step,
																		stepToCombo,
																		operand,
																		guard,
																		spec,
																		flow,
																		useCase,
																		line });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String combo__operand____operand_name_prime = "operand";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String step__actor____actor_name_prime = "actor";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String operand__guard____guard_name_prime = "guard";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String guard__spec____specification_name_prime = "specification";
		String flow__step____steps_name_prime = "steps";
		String useCase__flow____flows_name_prime = "flows";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(stepToCombo);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(guard);
		isApplicableMatch.getAllContextElements().add(spec);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(line);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		isApplicableMatch.getAllContextElements()
				.add(combo__operand____operand);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(combo__line____covered);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				stepToCombo__combo____target);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		isApplicableMatch.getAllContextElements().add(operand__guard____guard);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(operand__line____covered);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		isApplicableMatch.getAllContextElements().add(
				guard__spec____specification);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { actor, packageDeclaration, actorToLine, combo,
				step, stepToCombo, operand, guard, spec, flow, useCase, line,
				isApplicableMatch, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				combo__operand____operand, line__combo____coveredBy,
				combo__line____covered, step__actor____actor,
				stepToCombo__step____source, stepToCombo__combo____target,
				operand__guard____guard, line__operand____coveredBy,
				operand__line____covered, guard__spec____specification,
				flow__step____steps, useCase__flow____flows };
	}

	public static final Object[] pattern_StepAltToOperandRule_12_4_bindingFBBBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, packageDeclaration, actorToLine,
				combo, step, stepToCombo, operand, guard, spec, flow, useCase,
				line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					packageDeclaration, actorToLine, combo, step, stepToCombo,
					operand, guard, spec, flow, useCase, line };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Flow flow, UseCase useCase, Lifeline line) {
		Object[] result_pattern_StepAltToOperandRule_12_4_binding = pattern_StepAltToOperandRule_12_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, packageDeclaration,
				actorToLine, combo, step, stepToCombo, operand, guard, spec,
				flow, useCase, line);
		if (result_pattern_StepAltToOperandRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_StepAltToOperandRule_12_4_binding[0];

			Object[] result_pattern_StepAltToOperandRule_12_4_black = pattern_StepAltToOperandRule_12_4_blackB(csp);
			if (result_pattern_StepAltToOperandRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, operand, guard, spec, flow, useCase, line };
			}
		}
		return null;
	}

	public static final boolean pattern_StepAltToOperandRule_12_5_expressionFBB(
			StepAltToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_StepAltToOperandRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "StepAltToOperandRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_StepAltToOperandRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_20_1_binding = pattern_StepAltToOperandRule_20_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_20_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_20_1_black = pattern_StepAltToOperandRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_20_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_690486 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_690486 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_145870 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_145870)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_46594 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_46594)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_20_2_blackFFFFFB(
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
							if (pattern_StepAltToOperandRule_20_2_black_nac_0B(operand) == null) {
								if (pattern_StepAltToOperandRule_20_2_black_nac_1BB(
										operand, combo) == null) {
									if (pattern_StepAltToOperandRule_20_2_black_nac_2BB(
											guard, operand) == null) {
										for (Lifeline line : combo.getCovered()) {
											if (line.getCoveredBy().contains(
													operand)) {
												_result.add(new Object[] {
														combo, operand, guard,
														spec, line,
														_edge_operand });
											}
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

	public static final Object[] pattern_StepAltToOperandRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_20_3_expressionFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_20_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_21_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_21_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_21_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_21_1_binding = pattern_StepAltToOperandRule_21_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_21_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_21_1_black = pattern_StepAltToOperandRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_21_2_blackFFFFFFFB(
			EMoflonEdge _edge_stepAlternative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_stepAlternative.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpAlt = _edge_stepAlternative.getTrg();
			if (tmpAlt instanceof AlternativeFlowAlternative) {
				AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
				if (step.getStepAlternative().contains(alt)) {
					Actor actor = step.getActor();
					if (actor != null) {
						NamedFlow tmpAltFlow = alt.getRef();
						if (tmpAltFlow instanceof AlternativeFlow) {
							AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
							for (Flow flow : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(step,
											Flow.class, "steps")) {
								if (!altFlow.equals(flow)) {
									for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(actor,
													PackageDeclaration.class,
													"actors")) {
										for (UseCase useCase : packageDeclaration
												.getUseCases()) {
											if (useCase.getFlows().contains(
													flow)) {
												if (useCase.getFlows()
														.contains(altFlow)) {
													_result.add(new Object[] {
															actor,
															packageDeclaration,
															step, alt, altFlow,
															flow, useCase,
															_edge_stepAlternative });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_21_3_expressionFBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				packageDeclaration, step, alt, altFlow, flow, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_21_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_22_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_22_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_22_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_22_1_binding = pattern_StepAltToOperandRule_22_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_22_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_22_1_black = pattern_StepAltToOperandRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_22_2_blackFFFFFFFB(
			EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof AlternativeFlowAlternative) {
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
			EObject tmpAltFlow = _edge_ref.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (altFlow.equals(alt.getRef())) {
					for (NormalStep step : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(alt, NormalStep.class,
									"stepAlternative")) {
						Actor actor = step.getActor();
						if (actor != null) {
							for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(altFlow,
											UseCase.class, "flows")) {
								for (Flow flow : useCase.getFlows()) {
									if (!altFlow.equals(flow)) {
										if (flow.getSteps().contains(step)) {
											for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															actor,
															PackageDeclaration.class,
															"actors")) {
												if (packageDeclaration
														.getUseCases()
														.contains(useCase)) {
													_result.add(new Object[] {
															actor,
															packageDeclaration,
															step, alt, altFlow,
															flow, useCase,
															_edge_ref });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_22_3_expressionFBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				packageDeclaration, step, alt, altFlow, flow, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_22_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_23_1_binding = pattern_StepAltToOperandRule_23_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_23_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_23_1_black = pattern_StepAltToOperandRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_23_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_159507 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_159507 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_954077 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_954077)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_404313 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_404313)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_23_2_blackFFFFFB(
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
						if (pattern_StepAltToOperandRule_23_2_black_nac_0B(operand) == null) {
							if (pattern_StepAltToOperandRule_23_2_black_nac_2BB(
									guard, operand) == null) {
								for (Lifeline line : operand.getCovered()) {
									for (InteractionFragment tmpCombo : line
											.getCoveredBy()) {
										if (tmpCombo instanceof CombinedFragment) {
											CombinedFragment combo = (CombinedFragment) tmpCombo;
											if (combo.getOperand().contains(
													operand)) {
												if (pattern_StepAltToOperandRule_23_2_black_nac_1BB(
														operand, combo) == null) {
													_result.add(new Object[] {
															combo, operand,
															guard, spec, line,
															_edge_guard });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_23_3_expressionFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_23_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_24_1_binding = pattern_StepAltToOperandRule_24_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_24_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_24_1_black = pattern_StepAltToOperandRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_24_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_689686 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_689686 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_381738 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_381738)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_99170 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_99170)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_24_2_blackFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpOperand = _edge_coveredBy.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (line.getCoveredBy().contains(operand)) {
					InteractionConstraint guard = operand.getGuard();
					if (guard != null) {
						ValueSpecification tmpSpec = guard.getSpecification();
						if (tmpSpec instanceof LiteralString) {
							LiteralString spec = (LiteralString) tmpSpec;
							if (pattern_StepAltToOperandRule_24_2_black_nac_0B(operand) == null) {
								if (pattern_StepAltToOperandRule_24_2_black_nac_2BB(
										guard, operand) == null) {
									for (InteractionFragment tmpCombo : line
											.getCoveredBy()) {
										if (tmpCombo instanceof CombinedFragment) {
											CombinedFragment combo = (CombinedFragment) tmpCombo;
											if (combo.getOperand().contains(
													operand)) {
												if (pattern_StepAltToOperandRule_24_2_black_nac_1BB(
														operand, combo) == null) {
													_result.add(new Object[] {
															combo, operand,
															guard, spec, line,
															_edge_coveredBy });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_24_3_expressionFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_24_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_25_1_binding = pattern_StepAltToOperandRule_25_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_25_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_25_1_black = pattern_StepAltToOperandRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_25_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_455982 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_455982 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_403365 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_403365)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_380493 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_380493)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_25_2_blackFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperand = _edge_covered.getSrc();
		if (tmpOperand instanceof InteractionOperand) {
			InteractionOperand operand = (InteractionOperand) tmpOperand;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(operand)) {
					InteractionConstraint guard = operand.getGuard();
					if (guard != null) {
						ValueSpecification tmpSpec = guard.getSpecification();
						if (tmpSpec instanceof LiteralString) {
							LiteralString spec = (LiteralString) tmpSpec;
							if (pattern_StepAltToOperandRule_25_2_black_nac_0B(operand) == null) {
								if (pattern_StepAltToOperandRule_25_2_black_nac_2BB(
										guard, operand) == null) {
									for (InteractionFragment tmpCombo : line
											.getCoveredBy()) {
										if (tmpCombo instanceof CombinedFragment) {
											CombinedFragment combo = (CombinedFragment) tmpCombo;
											if (combo.getOperand().contains(
													operand)) {
												if (pattern_StepAltToOperandRule_25_2_black_nac_1BB(
														operand, combo) == null) {
													_result.add(new Object[] {
															combo, operand,
															guard, spec, line,
															_edge_covered });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_25_3_expressionFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_25_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_26_1_binding = pattern_StepAltToOperandRule_26_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_26_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_26_1_black = pattern_StepAltToOperandRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_26_2_black_nac_0B(
			InteractionOperand operand) {
		Interaction __DEC_operand_enclosingInteraction_617075 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_617075 != null) {
			return new Object[] { operand };
		}

		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_2_black_nac_1BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_666789 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_666789)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_2_black_nac_2BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_551104 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_551104)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_26_2_blackFFFFFB(
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
						if (pattern_StepAltToOperandRule_26_2_black_nac_0B(operand) == null) {
							if (pattern_StepAltToOperandRule_26_2_black_nac_2BB(
									guard, operand) == null) {
								for (Lifeline line : operand.getCovered()) {
									for (InteractionFragment tmpCombo : line
											.getCoveredBy()) {
										if (tmpCombo instanceof CombinedFragment) {
											CombinedFragment combo = (CombinedFragment) tmpCombo;
											if (combo.getOperand().contains(
													operand)) {
												if (pattern_StepAltToOperandRule_26_2_black_nac_1BB(
														operand, combo) == null) {
													_result.add(new Object[] {
															combo, operand,
															guard, spec, line,
															_edge_specification });
												}
											}
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

	public static final Object[] pattern_StepAltToOperandRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_26_3_expressionFBBBBBBB(
			StepAltToOperandRule _this, Match match, CombinedFragment combo,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, combo,
				operand, guard, spec, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_26_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_1_bindingFB(
			StepAltToOperandRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_1_blackFBB(
			EClass __eClass, StepAltToOperandRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_1_bindingAndBlackFFB(
			StepAltToOperandRule _this) {
		Object[] result_pattern_StepAltToOperandRule_27_1_binding = pattern_StepAltToOperandRule_27_1_bindingFB(_this);
		if (result_pattern_StepAltToOperandRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_StepAltToOperandRule_27_1_binding[0];

			Object[] result_pattern_StepAltToOperandRule_27_1_black = pattern_StepAltToOperandRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_StepAltToOperandRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_StepAltToOperandRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_27_2_blackFFFFFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAltFlow = _edge_flows.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (useCase.getFlows().contains(altFlow)) {
					for (Flow flow : useCase.getFlows()) {
						if (!altFlow.equals(flow)) {
							for (Step tmpStep : flow.getSteps()) {
								if (tmpStep instanceof NormalStep) {
									NormalStep step = (NormalStep) tmpStep;
									Actor actor = step.getActor();
									if (actor != null) {
										for (StepAlternative tmpAlt : step
												.getStepAlternative()) {
											if (tmpAlt instanceof AlternativeFlowAlternative) {
												AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
												if (altFlow
														.equals(alt.getRef())) {
													for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	useCase,
																	PackageDeclaration.class,
																	"useCases")) {
														if (packageDeclaration
																.getActors()
																.contains(actor)) {
															_result.add(new Object[] {
																	actor,
																	packageDeclaration,
																	step, alt,
																	altFlow,
																	flow,
																	useCase,
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
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_StepAltToOperandRule_27_3_expressionFBBBBBBBBB(
			StepAltToOperandRule _this, Match match, Actor actor,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Flow flow,
			UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				packageDeclaration, step, alt, altFlow, flow, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_StepAltToOperandRule_27_4_expressionFBB(
			StepAltToOperandRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_StepAltToOperandRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_StepAltToOperandRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_1_blackB(
			StepAltToOperandRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_StepAltToOperandRule_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, NormalStep step) {
		if (ruleResult.getSourceObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult,
			NormalStepToCombinedFragment stepToCombo) {
		if (ruleResult.getCorrObjects().contains(stepToCombo)) {
			return new Object[] { ruleResult, stepToCombo };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, CombinedFragment combo) {
		if (ruleResult.getTargetObjects().contains(combo)) {
			return new Object[] { ruleResult, combo };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_StepAltToOperandRule_30_2_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList stepToComboList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpStepToCombo : stepToComboList.getEntryObjects()) {
				if (tmpStepToCombo instanceof NormalStepToCombinedFragment) {
					NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) tmpStepToCombo;
					NormalStep step = stepToCombo.getSource();
					if (step != null) {
						CombinedFragment combo = stepToCombo.getTarget();
						if (combo != null) {
							Actor actor = step.getActor();
							if (actor != null) {
								if (pattern_StepAltToOperandRule_30_2_black_nac_5BB(
										ruleResult, stepToCombo) == null) {
									if (pattern_StepAltToOperandRule_30_2_black_nac_4BB(
											ruleResult, step) == null) {
										if (pattern_StepAltToOperandRule_30_2_black_nac_6BB(
												ruleResult, combo) == null) {
											if (pattern_StepAltToOperandRule_30_2_black_nac_0BB(
													ruleResult, actor) == null) {
												for (Lifeline line : combo
														.getCovered()) {
													if (pattern_StepAltToOperandRule_30_2_black_nac_7BB(
															ruleResult, line) == null) {
														for (Flow flow : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		step,
																		Flow.class,
																		"steps")) {
															if (pattern_StepAltToOperandRule_30_2_black_nac_3BB(
																	ruleResult,
																	flow) == null) {
																for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																		.getOppositeReferenceTyped(
																				actor,
																				PackageDeclaration.class,
																				"actors")) {
																	if (pattern_StepAltToOperandRule_30_2_black_nac_1BB(
																			ruleResult,
																			packageDeclaration) == null) {
																		for (UseCase useCase : packageDeclaration
																				.getUseCases()) {
																			if (useCase
																					.getFlows()
																					.contains(
																							flow)) {
																				if (pattern_StepAltToOperandRule_30_2_black_nac_2BB(
																						ruleResult,
																						useCase) == null) {
																					for (ActorToLifeline actorToLine : org.moflon.util.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									actor,
																									ActorToLifeline.class,
																									"source")) {
																						if (line.equals(actorToLine
																								.getTarget())) {
																							if (pattern_StepAltToOperandRule_30_2_black_nac_8BB(
																									ruleResult,
																									actorToLine) == null) {
																								_result.add(new Object[] {
																										stepToComboList,
																										actor,
																										packageDeclaration,
																										useCase,
																										flow,
																										step,
																										stepToCombo,
																										combo,
																										line,
																										actorToLine,
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
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_3_bindingFBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			Flow flow, UseCase useCase, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, packageDeclaration, actorToLine,
				combo, step, stepToCombo, flow, useCase, line, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					packageDeclaration, actorToLine, combo, step, stepToCombo,
					flow, useCase, line, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_StepAltToOperandRule_30_3_bindingAndBlackFBBBBBBBBBBBB(
			StepAltToOperandRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			Flow flow, UseCase useCase, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_StepAltToOperandRule_30_3_binding = pattern_StepAltToOperandRule_30_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, packageDeclaration,
				actorToLine, combo, step, stepToCombo, flow, useCase, line,
				ruleResult);
		if (result_pattern_StepAltToOperandRule_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_StepAltToOperandRule_30_3_binding[0];

			Object[] result_pattern_StepAltToOperandRule_30_3_black = pattern_StepAltToOperandRule_30_3_blackB(csp);
			if (result_pattern_StepAltToOperandRule_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						packageDeclaration, actorToLine, combo, step,
						stepToCombo, flow, useCase, line, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_StepAltToOperandRule_30_4_expressionFBB(
			StepAltToOperandRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_StepAltToOperandRule_30_5_blackBBBBBBBBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			Flow flow, UseCase useCase, Lifeline line) {
		return new Object[] { actor, packageDeclaration, actorToLine, combo,
				step, stepToCombo, flow, useCase, line };
	}

	public static final Object[] pattern_StepAltToOperandRule_30_6_blackBBBBBBBBBB(
			Actor actor, PackageDeclaration packageDeclaration,
			ActorToLifeline actorToLine, CombinedFragment combo,
			NormalStep step, NormalStepToCombinedFragment stepToCombo,
			Flow flow, UseCase useCase, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { actor, packageDeclaration, actorToLine, combo,
				step, stepToCombo, flow, useCase, line, ruleResult };
	}

	public static final Object[] pattern_StepAltToOperandRule_30_6_greenFBBFFFFFFBBBB(
			CombinedFragment combo, NormalStep step, UseCase useCase,
			Lifeline line, ModelgeneratorRuleResult ruleResult, CSP csp) {
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		StepAlternativeToInteractionOperand altToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		AlternativeFlow altFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("guard", "name");
		Object _localVariable_2 = csp.getValue("spec", "value");
		Object _localVariable_3 = csp.getValue("altFlow", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(altFlowToOperand);
		step.getStepAlternative().add(alt);
		ruleResult.getSourceObjects().add(alt);
		altFlowToOperand.setTarget(operand);
		combo.getOperand().add(operand);
		line.getCoveredBy().add(operand);
		ruleResult.getTargetObjects().add(operand);
		altToOperand.setSource(alt);
		altToOperand.setTarget(operand);
		ruleResult.getCorrObjects().add(altToOperand);
		operand.setGuard(guard);
		ruleResult.getTargetObjects().add(guard);
		guard.setSpecification(spec);
		ruleResult.getTargetObjects().add(spec);
		altFlowToOperand.setSource(altFlow);
		alt.setRef(altFlow);
		useCase.getFlows().add(altFlow);
		ruleResult.getSourceObjects().add(altFlow);
		String alt_condition_prime = (String) _localVariable_0;
		String guard_name_prime = (String) _localVariable_1;
		String spec_value_prime = (String) _localVariable_2;
		String altFlow_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		alt.setCondition(alt_condition_prime);
		guard.setName(guard_name_prime);
		spec.setValue(spec_value_prime);
		altFlow.setName(altFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { altFlowToOperand, combo, step, alt, operand,
				altToOperand, guard, spec, altFlow, useCase, line, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_StepAltToOperandRule_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StepAltToOperandRuleImpl
