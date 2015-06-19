/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionOperatorKind;
import ModalSequenceDiagram.Lifeline;
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

import UseCaseDSL.Actor;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule;
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
 * An implementation of the model object '<em><b>Alt Step To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltStepToComboRuleImpl extends AbstractRuleImpl implements
		AltStepToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltStepToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltStepToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		// initial bindings
		Object[] result1_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_0_1_blackBBBBBBB(this, match,
						useCase, flow, packageDeclaration, actor, step);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[useCase] = "
							+ useCase + ", " + "[flow] = " + flow + ", "
							+ "[packageDeclaration] = " + packageDeclaration
							+ ", " + "[actor] = " + actor + ", " + "[step] = "
							+ step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_0_2_bindingAndBlackFBBBBBBB(this,
						match, useCase, flow, packageDeclaration, actor, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[useCase] = "
							+ useCase + ", " + "[flow] = " + flow + ", "
							+ "[packageDeclaration] = " + packageDeclaration
							+ ", " + "[actor] = " + actor + ", " + "[step] = "
							+ step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_4_blackBBBBBB(match, useCase,
							flow, packageDeclaration, actor, step);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCase] = " + useCase + ", " + "[flow] = "
								+ flow + ", " + "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[actor] = "
								+ actor + ", " + "[step] = " + step + ".");
			}
			AltStepToComboRuleImpl.pattern_AltStepToComboRule_0_4_greenBBBBFF(
					match, flow, actor, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_5_blackBBBBBB(match, useCase,
							flow, packageDeclaration, actor, step);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[useCase] = " + useCase + ", " + "[flow] = "
								+ flow + ", " + "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[actor] = "
								+ actor + ", " + "[step] = " + step + ".");
			}
			AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_5_greenBBBBBFFF(match,
							useCase, flow, packageDeclaration, actor);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[7];

			// register objects to match
			AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_6_expressionBBBBBBB(this,
							match, useCase, flow, packageDeclaration, actor,
							step);
			return AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_7_expressionF();
		} else {
			return AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Interaction interaction = (Interaction) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[6];
		NormalStep step = (NormalStep) result1_bindingAndBlack[7];
		Lifeline line = (Lifeline) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_1_greenBBFBFB(interaction, step,
						line, csp);
		CombinedFragment combo = (CombinedFragment) result1_green[2];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[4];

		// collect translated elements
		Object[] result2_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_2_blackBBB(step, combo,
						stepToCombo);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[step] = " + step + ", "
							+ "[combo] = " + combo + ", " + "[stepToCombo] = "
							+ stepToCombo + ".");
		}
		Object[] result2_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_2_greenFBBB(step, combo,
						stepToCombo);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_3_blackBBBBBBBBBBBB(ruleresult,
						interaction, useCase, useCaseToInteraction, flow,
						packageDeclaration, actor, actorToLine, step, combo,
						line, stepToCombo);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[stepToCombo] = " + stepToCombo + ".");
		}
		AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_3_greenBBBBBBBBFFFFFFFF(
						ruleresult, interaction, flow, actor, step, combo,
						line, stepToCombo);
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[8];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[9];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[11];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, interaction, useCase, useCaseToInteraction,
						flow, packageDeclaration, actor, actorToLine, step,
						combo, line, stepToCombo);
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[2];
		Actor actor = (Actor) result2_binding[3];
		NormalStep step = (NormalStep) result2_binding[4];
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_2_2_blackFBFBBBFBFB(useCase, flow,
						packageDeclaration, actor, step, match)) {
			Interaction interaction = (Interaction) result2_black[0];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[2];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[6];
			Lifeline line = (Lifeline) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_2_3_blackBBBBBBBBB(interaction,
							useCase, useCaseToInteraction, flow,
							packageDeclaration, actor, actorToLine, step, line)) {
				Object[] result3_green = AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
								interaction, useCase, useCaseToInteraction,
								flow, packageDeclaration, actor, actorToLine,
								step, line);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[10];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[16];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[17];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, interaction, useCase,
								useCaseToInteraction, flow, packageDeclaration,
								actor, actorToLine, step, line);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[actorToLine] = "
									+ actorToLine
									+ ", "
									+ "[step] = "
									+ step
									+ ", " + "[line] = " + line + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, UseCase useCase,
			Flow flow, PackageDeclaration packageDeclaration, Actor actor,
			NormalStep step) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("actor", actor);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UseCase useCase,
			Flow flow, PackageDeclaration packageDeclaration, Actor actor,
			NormalStep step) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ALT");
		literal0.setType("");

		// Create attribute variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", true, csp);
		var_step_type.setValue(step.getType());
		var_step_type.setType("UseCaseDSL.StepType");

		// Create unbound variables

		// Create constraints
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal0);
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
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("alt");
		literal0.setType("");

		// Create attribute variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", true, csp);
		var_step_name.setValue(step.getName());
		var_step_name.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", true, csp);
		var_step_label.setValue(step.getLabel());
		var_step_label.setType("String");

		// Create unbound variables
		Variable var_combo__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo._id", csp);
		var_combo__id.setType("String");
		Variable var_combo_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo.name", csp);
		var_combo_name.setType("String");
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqInterOperKind);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_step_name, var_combo__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_combo_name);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("step", step);
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
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject flow, EObject packageDeclaration, EObject actor,
			EObject actorToLine, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("stepToCombo", stepToCombo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		// initial bindings
		Object[] result1_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_10_1_blackBBBBB(this, match,
						interaction, combo, line);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[interaction] = "
							+ interaction + ", " + "[combo] = " + combo + ", "
							+ "[line] = " + line + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_10_2_bindingAndBlackFBBBBB(this,
						match, interaction, combo, line);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[interaction] = "
							+ interaction + ", " + "[combo] = " + combo + ", "
							+ "[line] = " + line + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_4_blackBBBB(match,
							interaction, combo, line);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[combo] = " + combo + ", " + "[line] = "
								+ line + ".");
			}
			AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_4_greenBBBBFFFF(match,
							interaction, combo, line);
			// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result4_green[4];
			// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result4_green[5];
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result4_green[6];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_5_blackBBBB(match,
							interaction, combo, line);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[combo] = " + combo + ", " + "[line] = "
								+ line + ".");
			}
			AltStepToComboRuleImpl.pattern_AltStepToComboRule_10_5_greenBBBFF(
					match, interaction, line);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[4];

			// register objects to match
			AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_6_expressionBBBBB(this,
							match, interaction, combo, line);
			return AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_7_expressionF();
		} else {
			return AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Interaction interaction = (Interaction) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[4];
		Actor actor = (Actor) result1_bindingAndBlack[5];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[6];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[7];
		Lifeline line = (Lifeline) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_1_greenBBFBFB(flow, actor,
						combo, csp);
		NormalStep step = (NormalStep) result1_green[2];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[4];

		// collect translated elements
		Object[] result2_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_2_blackBBB(step, combo,
						stepToCombo);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[step] = " + step + ", "
							+ "[combo] = " + combo + ", " + "[stepToCombo] = "
							+ stepToCombo + ".");
		}
		Object[] result2_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_2_greenFBBB(step, combo,
						stepToCombo);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_3_blackBBBBBBBBBBBB(ruleresult,
						interaction, useCase, useCaseToInteraction, flow,
						packageDeclaration, actor, actorToLine, step, combo,
						line, stepToCombo);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[combo] = "
							+ combo
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[stepToCombo] = " + stepToCombo + ".");
		}
		AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_3_greenBBBBBBBBFFFFFFFF(
						ruleresult, interaction, flow, actor, step, combo,
						line, stepToCombo);
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[8];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[9];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[11];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[12];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[13];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, interaction, useCase, useCaseToInteraction,
						flow, packageDeclaration, actor, actorToLine, step,
						combo, line, stepToCombo);
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Interaction interaction = (Interaction) result2_binding[0];
		CombinedFragment combo = (CombinedFragment) result2_binding[1];
		Lifeline line = (Lifeline) result2_binding[2];
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_12_2_blackBFFFFBBB(interaction,
						combo, line, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_12_3_blackBBBFFBBBB(
							interaction, useCase, useCaseToInteraction, actor,
							actorToLine, combo, line)) {
				Flow flow = (Flow) result3_black[3];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[4];
				Object[] result3_green = AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_12_3_greenBBBBBBBBBFFFFFFFFFFFFFF(
								interaction, useCase, useCaseToInteraction,
								flow, packageDeclaration, actor, actorToLine,
								combo, line);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[10];
				// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[11];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[12];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[17];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[18];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[21];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, interaction, useCase,
								useCaseToInteraction, flow, packageDeclaration,
								actor, actorToLine, combo, line);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[actorToLine] = "
									+ actorToLine
									+ ", "
									+ "[combo] = "
									+ combo
									+ ", " + "[line] = " + line + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			Interaction interaction, CombinedFragment combo, Lifeline line) {
		match.registerObject("interaction", interaction);
		match.registerObject("combo", combo);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("alt");
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
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ALT");
		literal0.setType("");

		// Create attribute variables
		Variable var_combo__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo._id", true, csp);
		var_combo__id.setValue(combo.get_id());
		var_combo__id.setType("String");
		Variable var_combo_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo.name", true, csp);
		var_combo_name.setValue(combo.getName());
		var_combo_name.setType("String");

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", csp);
		var_step_label.setType("String");

		// Create constraints
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal0);
		eq.setRuleName("");
		eq.solve(var_step_name, var_combo__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_combo_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
		isApplicableMatch.registerObject("combo", combo);
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
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject flow, EObject packageDeclaration, EObject actor,
			EObject actorToLine, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("actorToLine", actorToLine);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("line", line);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_885(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_20_2_blackFFFB(_edge_enclosingInteraction)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_20_3_expressionFBBBBB(this,
							match, interaction, combo, line)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_886(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_21_2_blackFFFB(_edge_fragment)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_21_3_expressionFBBBBB(this,
							match, interaction, combo, line)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_432(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_22_2_blackFFFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_22_3_expressionFBBBBBBB(this,
							match, useCase, flow, packageDeclaration, actor,
							step)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_433(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_23_2_blackFFFFFB(_edge_actor)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			Actor actor = (Actor) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_23_3_expressionFBBBBBBB(this,
							match, useCase, flow, packageDeclaration, actor,
							step)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_887(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_24_2_blackFFFB(_edge_coveredBy)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_24_3_expressionFBBBBB(this,
							match, interaction, combo, line)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_888(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_25_2_blackFFFB(_edge_covered)) {
			Interaction interaction = (Interaction) result2_black[0];
			CombinedFragment combo = (CombinedFragment) result2_black[1];
			Lifeline line = (Lifeline) result2_black[2];
			Object[] result2_green = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_25_3_expressionFBBBBB(this,
							match, interaction, combo, line)) {
				// Ensure that the correct types of elements are matched
				if (AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_25_6_expressionFB(__result);
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
			UseCaseToInteraction useCaseToInteractionParameter) {
		// create result
		Object[] result1_black = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_28_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_28_2_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList useCaseToInteractionList = (RuleEntryList) result2_black[0];
			Interaction interaction = (Interaction) result2_black[1];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[5];
			Actor actor = (Actor) result2_black[6];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[7];
			Lifeline line = (Lifeline) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_28_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, interaction, useCase,
							useCaseToInteraction, flow, packageDeclaration,
							actor, actorToLine, line, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[interaction] = "
								+ interaction
								+ ", "
								+ "[useCase] = "
								+ useCase
								+ ", "
								+ "[useCaseToInteraction] = "
								+ useCaseToInteraction
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration
								+ ", "
								+ "[actor] = "
								+ actor
								+ ", "
								+ "[actorToLine] = "
								+ actorToLine
								+ ", "
								+ "[line] = "
								+ line
								+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AltStepToComboRuleImpl
					.pattern_AltStepToComboRule_28_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = AltStepToComboRuleImpl
						.pattern_AltStepToComboRule_28_5_blackBBBBBBBB(
								interaction, useCase, useCaseToInteraction,
								flow, packageDeclaration, actor, actorToLine,
								line);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_28_6_blackBBBBBBBBB(
									interaction, useCase, useCaseToInteraction,
									flow, packageDeclaration, actor,
									actorToLine, line, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[interaction] = "
										+ interaction
										+ ", "
										+ "[useCase] = "
										+ useCase
										+ ", "
										+ "[useCaseToInteraction] = "
										+ useCaseToInteraction
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[packageDeclaration] = "
										+ packageDeclaration
										+ ", "
										+ "[actor] = "
										+ actor
										+ ", "
										+ "[actorToLine] = "
										+ actorToLine
										+ ", "
										+ "[line] = "
										+ line
										+ ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					AltStepToComboRuleImpl
							.pattern_AltStepToComboRule_28_6_greenBBBFFBFBB(
									interaction, flow, actor, line, ruleResult,
									csp);
					// NormalStep step = (NormalStep) result6_green[3];
					// CombinedFragment combo = (CombinedFragment) result6_green[4];
					// NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return AltStepToComboRuleImpl
				.pattern_AltStepToComboRule_28_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ALT");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("alt");
		literal1.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
		Variable var_combo__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo._id", csp);
		var_combo__id.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", csp);
		var_step_label.setType("String");
		Variable var_combo_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"combo.name", csp);
		var_combo_name.setType("String");
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create constraints
		EqStepType eqStepType = new EqStepType();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqInterOperKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal0);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_combo__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_combo_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Actor) arguments.get(4), (NormalStep) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Actor) arguments.get(4), (NormalStep) arguments.get(5));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCase) arguments.get(1), (Flow) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Actor) arguments.get(4), (NormalStep) arguments.get(5));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_NORMALSTEP_LIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Interaction) arguments.get(1), (UseCase) arguments.get(2),
					(UseCaseToInteraction) arguments.get(3),
					(Flow) arguments.get(4),
					(PackageDeclaration) arguments.get(5),
					(Actor) arguments.get(6),
					(ActorToLifeline) arguments.get(7),
					(NormalStep) arguments.get(8), (Lifeline) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2),
					(Lifeline) arguments.get(3));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2),
					(Lifeline) arguments.get(3));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Interaction) arguments.get(1),
					(CombinedFragment) arguments.get(2),
					(Lifeline) arguments.get(3));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_COMBINEDFRAGMENT_LIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Interaction) arguments.get(1), (UseCase) arguments.get(2),
					(UseCaseToInteraction) arguments.get(3),
					(Flow) arguments.get(4),
					(PackageDeclaration) arguments.get(5),
					(Actor) arguments.get(6),
					(ActorToLifeline) arguments.get(7),
					(CombinedFragment) arguments.get(8),
					(Lifeline) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_885__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_885((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_886__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_886((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_432__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_432((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_433__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_433((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_887__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_887((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_888__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_888((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(UseCaseToInteraction) arguments.get(1));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_LIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Interaction) arguments.get(1), (UseCase) arguments.get(2),
					(UseCaseToInteraction) arguments.get(3),
					(Flow) arguments.get(4),
					(PackageDeclaration) arguments.get(5),
					(Actor) arguments.get(6),
					(ActorToLifeline) arguments.get(7),
					(Lifeline) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AltStepToComboRule_0_1_blackBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		return new Object[] { _this, match, useCase, flow, packageDeclaration,
				actor, step };
	}

	public static final Object[] pattern_AltStepToComboRule_0_2_bindingFBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, useCase,
				flow, packageDeclaration, actor, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow,
					packageDeclaration, actor, step };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltStepToComboRule_0_2_bindingAndBlackFBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		Object[] result_pattern_AltStepToComboRule_0_2_binding = pattern_AltStepToComboRule_0_2_bindingFBBBBBBB(
				_this, match, useCase, flow, packageDeclaration, actor, step);
		if (result_pattern_AltStepToComboRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltStepToComboRule_0_2_binding[0];

			Object[] result_pattern_AltStepToComboRule_0_2_black = pattern_AltStepToComboRule_0_2_blackB(csp);
			if (result_pattern_AltStepToComboRule_0_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow,
						packageDeclaration, actor, step };
			}
		}
		return null;
	}

	public static final boolean pattern_AltStepToComboRule_0_3_expressionFBB(
			AltStepToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_0_4_blackBBBBBB(
			Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		return new Object[] { match, useCase, flow, packageDeclaration, actor,
				step };
	}

	public static final Object[] pattern_AltStepToComboRule_0_4_greenBBBBFF(
			Match match, Flow flow, Actor actor, NormalStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(step__actor____actor);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { match, flow, actor, step, flow__step____steps,
				step__actor____actor };
	}

	public static final Object[] pattern_AltStepToComboRule_0_5_blackBBBBBB(
			Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		return new Object[] { match, useCase, flow, packageDeclaration, actor,
				step };
	}

	public static final Object[] pattern_AltStepToComboRule_0_5_greenBBBBBFFF(
			Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(actor);
		String useCase__flow____flows_name_prime = "flows";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		return new Object[] { match, useCase, flow, packageDeclaration, actor,
				useCase__flow____flows,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors };
	}

	public static final void pattern_AltStepToComboRule_0_6_expressionBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		_this.registerObjectsToMatch_FWD(match, useCase, flow,
				packageDeclaration, actor, step);

	}

	public static final boolean pattern_AltStepToComboRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("line");
		EObject tmpInteraction = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpUseCaseToInteraction = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpPackageDeclaration = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpActorToLine = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpLine = _localVariable_8;
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
					UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpPackageDeclaration instanceof PackageDeclaration) {
							PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpActorToLine instanceof ActorToLifeline) {
									ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
									if (tmpStep instanceof NormalStep) {
										NormalStep step = (NormalStep) tmpStep;
										if (tmpLine instanceof Lifeline) {
											Lifeline line = (Lifeline) tmpLine;
											return new Object[] { interaction,
													useCase,
													useCaseToInteraction, flow,
													packageDeclaration, actor,
													actorToLine, step, line,
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

	public static final Object[] pattern_AltStepToComboRule_1_1_blackBBBBBBBBBFBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line,
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { interaction, useCase,
						useCaseToInteraction, flow, packageDeclaration, actor,
						actorToLine, step, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltStepToComboRule_1_1_binding = pattern_AltStepToComboRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltStepToComboRule_1_1_binding != null) {
			Interaction interaction = (Interaction) result_pattern_AltStepToComboRule_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_AltStepToComboRule_1_1_binding[1];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltStepToComboRule_1_1_binding[2];
			Flow flow = (Flow) result_pattern_AltStepToComboRule_1_1_binding[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltStepToComboRule_1_1_binding[4];
			Actor actor = (Actor) result_pattern_AltStepToComboRule_1_1_binding[5];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_AltStepToComboRule_1_1_binding[6];
			NormalStep step = (NormalStep) result_pattern_AltStepToComboRule_1_1_binding[7];
			Lifeline line = (Lifeline) result_pattern_AltStepToComboRule_1_1_binding[8];

			Object[] result_pattern_AltStepToComboRule_1_1_black = pattern_AltStepToComboRule_1_1_blackBBBBBBBBBFBB(
					interaction, useCase, useCaseToInteraction, flow,
					packageDeclaration, actor, actorToLine, step, line, _this,
					isApplicableMatch);
			if (result_pattern_AltStepToComboRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_AltStepToComboRule_1_1_black[9];

				return new Object[] { interaction, useCase,
						useCaseToInteraction, flow, packageDeclaration, actor,
						actorToLine, step, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_1_1_greenBBFBFB(
			Interaction interaction, NormalStep step, Lifeline line, CSP csp) {
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		Object _localVariable_0 = csp.getValue("combo", "_id");
		Object _localVariable_1 = csp.getValue("combo", "name");
		Object _localVariable_2 = csp.getValue("combo", "interactionOperator");
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		String combo__id_prime = (String) _localVariable_0;
		String combo_name_prime = (String) _localVariable_1;
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_2;
		combo.set_id(combo__id_prime);
		combo.setName(combo_name_prime);
		combo.setInteractionOperator(combo_interactionOperator_prime);
		return new Object[] { interaction, step, combo, line, stepToCombo, csp };
	}

	public static final Object[] pattern_AltStepToComboRule_1_2_blackBBB(
			NormalStep step, CombinedFragment combo,
			NormalStepToCombinedFragment stepToCombo) {
		return new Object[] { step, combo, stepToCombo };
	}

	public static final Object[] pattern_AltStepToComboRule_1_2_greenFBBB(
			NormalStep step, CombinedFragment combo,
			NormalStepToCombinedFragment stepToCombo) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(combo);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		return new Object[] { ruleresult, step, combo, stepToCombo };
	}

	public static final Object[] pattern_AltStepToComboRule_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject interaction, EObject useCase,
			EObject useCaseToInteraction, EObject flow,
			EObject packageDeclaration, EObject actor, EObject actorToLine,
			EObject step, EObject combo, EObject line, EObject stepToCombo) {
		if (!interaction.equals(useCase)) {
			if (!interaction.equals(useCaseToInteraction)) {
				if (!interaction.equals(packageDeclaration)) {
					if (!interaction.equals(step)) {
						if (!interaction.equals(line)) {
							if (!interaction.equals(stepToCombo)) {
								if (!useCase.equals(useCaseToInteraction)) {
									if (!flow.equals(interaction)) {
										if (!flow.equals(useCase)) {
											if (!flow
													.equals(useCaseToInteraction)) {
												if (!flow
														.equals(packageDeclaration)) {
													if (!flow.equals(step)) {
														if (!flow.equals(line)) {
															if (!flow
																	.equals(stepToCombo)) {
																if (!packageDeclaration
																		.equals(useCase)) {
																	if (!packageDeclaration
																			.equals(useCaseToInteraction)) {
																		if (!packageDeclaration
																				.equals(step)) {
																			if (!packageDeclaration
																					.equals(stepToCombo)) {
																				if (!actor
																						.equals(interaction)) {
																					if (!actor
																							.equals(useCase)) {
																						if (!actor
																								.equals(useCaseToInteraction)) {
																							if (!actor
																									.equals(flow)) {
																								if (!actor
																										.equals(packageDeclaration)) {
																									if (!actor
																											.equals(actorToLine)) {
																										if (!actor
																												.equals(step)) {
																											if (!actor
																													.equals(combo)) {
																												if (!actor
																														.equals(line)) {
																													if (!actor
																															.equals(stepToCombo)) {
																														if (!actorToLine
																																.equals(interaction)) {
																															if (!actorToLine
																																	.equals(useCase)) {
																																if (!actorToLine
																																		.equals(useCaseToInteraction)) {
																																	if (!actorToLine
																																			.equals(flow)) {
																																		if (!actorToLine
																																				.equals(packageDeclaration)) {
																																			if (!actorToLine
																																					.equals(step)) {
																																				if (!actorToLine
																																						.equals(combo)) {
																																					if (!actorToLine
																																							.equals(line)) {
																																						if (!actorToLine
																																								.equals(stepToCombo)) {
																																							if (!step
																																									.equals(useCase)) {
																																								if (!step
																																										.equals(useCaseToInteraction)) {
																																									if (!step
																																											.equals(stepToCombo)) {
																																										if (!combo
																																												.equals(interaction)) {
																																											if (!combo
																																													.equals(useCase)) {
																																												if (!combo
																																														.equals(useCaseToInteraction)) {
																																													if (!combo
																																															.equals(flow)) {
																																														if (!combo
																																																.equals(packageDeclaration)) {
																																															if (!combo
																																																	.equals(step)) {
																																																if (!combo
																																																		.equals(line)) {
																																																	if (!combo
																																																			.equals(stepToCombo)) {
																																																		if (!line
																																																				.equals(useCase)) {
																																																			if (!line
																																																					.equals(useCaseToInteraction)) {
																																																				if (!line
																																																						.equals(packageDeclaration)) {
																																																					if (!line
																																																							.equals(step)) {
																																																						if (!line
																																																								.equals(stepToCombo)) {
																																																							if (!stepToCombo
																																																									.equals(useCase)) {
																																																								if (!stepToCombo
																																																										.equals(useCaseToInteraction)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											interaction,
																																																											useCase,
																																																											useCaseToInteraction,
																																																											flow,
																																																											packageDeclaration,
																																																											actor,
																																																											actorToLine,
																																																											step,
																																																											combo,
																																																											line,
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
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltStepToComboRule_1_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject interaction, EObject flow,
			EObject actor, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AltStepToComboRule";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
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
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(step__actor____actor);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getCreatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(combo__line____covered);
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
		step__actor____actor.setName(step__actor____actor_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		return new Object[] { ruleresult, interaction, flow, actor, step,
				combo, line, stepToCombo,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				step__actor____actor, line__combo____coveredBy,
				combo__line____covered, stepToCombo__step____source,
				stepToCombo__combo____target };
	}

	public static final void pattern_AltStepToComboRule_1_5_expressionBBBBBBBBBBBBB(
			AltStepToComboRule _this, PerformRuleResult ruleresult,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject flow, EObject packageDeclaration, EObject actor,
			EObject actorToLine, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		_this.registerObjects_FWD(ruleresult, interaction, useCase,
				useCaseToInteraction, flow, packageDeclaration, actor,
				actorToLine, step, combo, line, stepToCombo);

	}

	public static final PerformRuleResult pattern_AltStepToComboRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_2_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_2_1_blackFBB(
			EClass eClass, AltStepToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_2_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_2_1_binding = pattern_AltStepToComboRule_2_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltStepToComboRule_2_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_2_1_black = pattern_AltStepToComboRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltStepToComboRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltStepToComboRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltStepToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltStepToComboRule_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("packageDeclaration");
		EObject _localVariable_3 = match.getObject("actor");
		EObject _localVariable_4 = match.getObject("step");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmpActor = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmpActor instanceof Actor) {
						Actor actor = (Actor) tmpActor;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							return new Object[] { useCase, flow,
									packageDeclaration, actor, step, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_2_2_blackFBFBBBFBFB(
			UseCase useCase, Flow flow, PackageDeclaration packageDeclaration,
			Actor actor, NormalStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(useCase, UseCaseToInteraction.class,
						"source")) {
			Interaction interaction = useCaseToInteraction.getTarget();
			if (interaction != null) {
				for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(actor,
								ActorToLifeline.class, "source")) {
					Lifeline line = actorToLine.getTarget();
					if (line != null) {
						_result.add(new Object[] { interaction, useCase,
								useCaseToInteraction, flow, packageDeclaration,
								actor, actorToLine, step, line, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_2_3_blackBBBBBBBBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (interaction.equals(line.getInteraction())) {
			if (useCase.getFlows().contains(flow)) {
				if (useCase.equals(useCaseToInteraction.getSource())) {
					if (interaction.equals(useCaseToInteraction.getTarget())) {
						if (flow.getSteps().contains(step)) {
							if (packageDeclaration.getUseCases().contains(
									useCase)) {
								if (packageDeclaration.getActors().contains(
										actor)) {
									if (actor.equals(actorToLine.getSource())) {
										if (line.equals(actorToLine.getTarget())) {
											if (actor.equals(step.getActor())) {
												_result.add(new Object[] {
														interaction, useCase,
														useCaseToInteraction,
														flow,
														packageDeclaration,
														actor, actorToLine,
														step, line });
											}
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

	public static final Object[] pattern_AltStepToComboRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String step__actor____actor_name_prime = "actor";
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(line);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
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
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { interaction, useCase, useCaseToInteraction, flow,
				packageDeclaration, actor, actorToLine, step, line,
				isApplicableMatch, line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				step__actor____actor };
	}

	public static final Object[] pattern_AltStepToComboRule_2_4_bindingFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, interaction, useCase, useCaseToInteraction,
				flow, packageDeclaration, actor, actorToLine, step, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, interaction,
					useCase, useCaseToInteraction, flow, packageDeclaration,
					actor, actorToLine, step, line };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltStepToComboRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, NormalStep step, Lifeline line) {
		Object[] result_pattern_AltStepToComboRule_2_4_binding = pattern_AltStepToComboRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, interaction, useCase,
				useCaseToInteraction, flow, packageDeclaration, actor,
				actorToLine, step, line);
		if (result_pattern_AltStepToComboRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltStepToComboRule_2_4_binding[0];

			Object[] result_pattern_AltStepToComboRule_2_4_black = pattern_AltStepToComboRule_2_4_blackB(csp);
			if (result_pattern_AltStepToComboRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						interaction, useCase, useCaseToInteraction, flow,
						packageDeclaration, actor, actorToLine, step, line };
			}
		}
		return null;
	}

	public static final boolean pattern_AltStepToComboRule_2_5_expressionFBB(
			AltStepToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltStepToComboRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltStepToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltStepToComboRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_10_1_blackBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		return new Object[] { _this, match, interaction, combo, line };
	}

	public static final Object[] pattern_AltStepToComboRule_10_2_bindingFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				interaction, combo, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, interaction, combo, line };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltStepToComboRule_10_2_bindingAndBlackFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		Object[] result_pattern_AltStepToComboRule_10_2_binding = pattern_AltStepToComboRule_10_2_bindingFBBBBB(
				_this, match, interaction, combo, line);
		if (result_pattern_AltStepToComboRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltStepToComboRule_10_2_binding[0];

			Object[] result_pattern_AltStepToComboRule_10_2_black = pattern_AltStepToComboRule_10_2_blackB(csp);
			if (result_pattern_AltStepToComboRule_10_2_black != null) {

				return new Object[] { csp, _this, match, interaction, combo,
						line };
			}
		}
		return null;
	}

	public static final boolean pattern_AltStepToComboRule_10_3_expressionFBB(
			AltStepToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_10_4_blackBBBB(
			Match match, Interaction interaction, CombinedFragment combo,
			Lifeline line) {
		return new Object[] { match, interaction, combo, line };
	}

	public static final Object[] pattern_AltStepToComboRule_10_4_greenBBBBFFFF(
			Match match, Interaction interaction, CombinedFragment combo,
			Lifeline line) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(combo);
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		match.getToBeTranslatedEdges().add(interaction__combo____fragment);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		match.getToBeTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(combo__line____covered);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		return new Object[] { match, interaction, combo, line,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, line__combo____coveredBy,
				combo__line____covered };
	}

	public static final Object[] pattern_AltStepToComboRule_10_5_blackBBBB(
			Match match, Interaction interaction, CombinedFragment combo,
			Lifeline line) {
		return new Object[] { match, interaction, combo, line };
	}

	public static final Object[] pattern_AltStepToComboRule_10_5_greenBBBFF(
			Match match, Interaction interaction, Lifeline line) {
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(interaction);
		match.getContextNodes().add(line);
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getContextEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getContextEdges().add(interaction__line____lifeline);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { match, interaction, line,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_AltStepToComboRule_10_6_expressionBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		_this.registerObjectsToMatch_BWD(match, interaction, combo, line);

	}

	public static final boolean pattern_AltStepToComboRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("actor");
		EObject _localVariable_6 = isApplicableMatch.getObject("actorToLine");
		EObject _localVariable_7 = isApplicableMatch.getObject("combo");
		EObject _localVariable_8 = isApplicableMatch.getObject("line");
		EObject tmpInteraction = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpUseCaseToInteraction = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpPackageDeclaration = _localVariable_4;
		EObject tmpActor = _localVariable_5;
		EObject tmpActorToLine = _localVariable_6;
		EObject tmpCombo = _localVariable_7;
		EObject tmpLine = _localVariable_8;
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
					UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpPackageDeclaration instanceof PackageDeclaration) {
							PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
							if (tmpActor instanceof Actor) {
								Actor actor = (Actor) tmpActor;
								if (tmpActorToLine instanceof ActorToLifeline) {
									ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (tmpLine instanceof Lifeline) {
											Lifeline line = (Lifeline) tmpLine;
											return new Object[] { interaction,
													useCase,
													useCaseToInteraction, flow,
													packageDeclaration, actor,
													actorToLine, combo, line,
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

	public static final Object[] pattern_AltStepToComboRule_11_1_blackBBBBBBBBBFBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line,
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { interaction, useCase,
						useCaseToInteraction, flow, packageDeclaration, actor,
						actorToLine, combo, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltStepToComboRule_11_1_binding = pattern_AltStepToComboRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltStepToComboRule_11_1_binding != null) {
			Interaction interaction = (Interaction) result_pattern_AltStepToComboRule_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_AltStepToComboRule_11_1_binding[1];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltStepToComboRule_11_1_binding[2];
			Flow flow = (Flow) result_pattern_AltStepToComboRule_11_1_binding[3];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltStepToComboRule_11_1_binding[4];
			Actor actor = (Actor) result_pattern_AltStepToComboRule_11_1_binding[5];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_AltStepToComboRule_11_1_binding[6];
			CombinedFragment combo = (CombinedFragment) result_pattern_AltStepToComboRule_11_1_binding[7];
			Lifeline line = (Lifeline) result_pattern_AltStepToComboRule_11_1_binding[8];

			Object[] result_pattern_AltStepToComboRule_11_1_black = pattern_AltStepToComboRule_11_1_blackBBBBBBBBBFBB(
					interaction, useCase, useCaseToInteraction, flow,
					packageDeclaration, actor, actorToLine, combo, line, _this,
					isApplicableMatch);
			if (result_pattern_AltStepToComboRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_AltStepToComboRule_11_1_black[9];

				return new Object[] { interaction, useCase,
						useCaseToInteraction, flow, packageDeclaration, actor,
						actorToLine, combo, line, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_11_1_greenBBFBFB(
			Flow flow, Actor actor, CombinedFragment combo, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		flow.getSteps().add(step);
		step.setActor(actor);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		return new Object[] { flow, actor, step, combo, stepToCombo, csp };
	}

	public static final Object[] pattern_AltStepToComboRule_11_2_blackBBB(
			NormalStep step, CombinedFragment combo,
			NormalStepToCombinedFragment stepToCombo) {
		return new Object[] { step, combo, stepToCombo };
	}

	public static final Object[] pattern_AltStepToComboRule_11_2_greenFBBB(
			NormalStep step, CombinedFragment combo,
			NormalStepToCombinedFragment stepToCombo) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(combo);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		return new Object[] { ruleresult, step, combo, stepToCombo };
	}

	public static final Object[] pattern_AltStepToComboRule_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject interaction, EObject useCase,
			EObject useCaseToInteraction, EObject flow,
			EObject packageDeclaration, EObject actor, EObject actorToLine,
			EObject step, EObject combo, EObject line, EObject stepToCombo) {
		if (!interaction.equals(useCase)) {
			if (!interaction.equals(useCaseToInteraction)) {
				if (!interaction.equals(packageDeclaration)) {
					if (!interaction.equals(step)) {
						if (!interaction.equals(line)) {
							if (!interaction.equals(stepToCombo)) {
								if (!useCase.equals(useCaseToInteraction)) {
									if (!flow.equals(interaction)) {
										if (!flow.equals(useCase)) {
											if (!flow
													.equals(useCaseToInteraction)) {
												if (!flow
														.equals(packageDeclaration)) {
													if (!flow.equals(step)) {
														if (!flow.equals(line)) {
															if (!flow
																	.equals(stepToCombo)) {
																if (!packageDeclaration
																		.equals(useCase)) {
																	if (!packageDeclaration
																			.equals(useCaseToInteraction)) {
																		if (!packageDeclaration
																				.equals(step)) {
																			if (!packageDeclaration
																					.equals(stepToCombo)) {
																				if (!actor
																						.equals(interaction)) {
																					if (!actor
																							.equals(useCase)) {
																						if (!actor
																								.equals(useCaseToInteraction)) {
																							if (!actor
																									.equals(flow)) {
																								if (!actor
																										.equals(packageDeclaration)) {
																									if (!actor
																											.equals(actorToLine)) {
																										if (!actor
																												.equals(step)) {
																											if (!actor
																													.equals(combo)) {
																												if (!actor
																														.equals(line)) {
																													if (!actor
																															.equals(stepToCombo)) {
																														if (!actorToLine
																																.equals(interaction)) {
																															if (!actorToLine
																																	.equals(useCase)) {
																																if (!actorToLine
																																		.equals(useCaseToInteraction)) {
																																	if (!actorToLine
																																			.equals(flow)) {
																																		if (!actorToLine
																																				.equals(packageDeclaration)) {
																																			if (!actorToLine
																																					.equals(step)) {
																																				if (!actorToLine
																																						.equals(combo)) {
																																					if (!actorToLine
																																							.equals(line)) {
																																						if (!actorToLine
																																								.equals(stepToCombo)) {
																																							if (!step
																																									.equals(useCase)) {
																																								if (!step
																																										.equals(useCaseToInteraction)) {
																																									if (!step
																																											.equals(stepToCombo)) {
																																										if (!combo
																																												.equals(interaction)) {
																																											if (!combo
																																													.equals(useCase)) {
																																												if (!combo
																																														.equals(useCaseToInteraction)) {
																																													if (!combo
																																															.equals(flow)) {
																																														if (!combo
																																																.equals(packageDeclaration)) {
																																															if (!combo
																																																	.equals(step)) {
																																																if (!combo
																																																		.equals(line)) {
																																																	if (!combo
																																																			.equals(stepToCombo)) {
																																																		if (!line
																																																				.equals(useCase)) {
																																																			if (!line
																																																					.equals(useCaseToInteraction)) {
																																																				if (!line
																																																						.equals(packageDeclaration)) {
																																																					if (!line
																																																							.equals(step)) {
																																																						if (!line
																																																								.equals(stepToCombo)) {
																																																							if (!stepToCombo
																																																									.equals(useCase)) {
																																																								if (!stepToCombo
																																																										.equals(useCaseToInteraction)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											interaction,
																																																											useCase,
																																																											useCaseToInteraction,
																																																											flow,
																																																											packageDeclaration,
																																																											actor,
																																																											actorToLine,
																																																											step,
																																																											combo,
																																																											line,
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
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltStepToComboRule_11_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject interaction, EObject flow,
			EObject actor, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AltStepToComboRule";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
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
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(step__actor____actor);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(combo__line____covered);
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
		step__actor____actor.setName(step__actor____actor_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		return new Object[] { ruleresult, interaction, flow, actor, step,
				combo, line, stepToCombo,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment, flow__step____steps,
				step__actor____actor, line__combo____coveredBy,
				combo__line____covered, stepToCombo__step____source,
				stepToCombo__combo____target };
	}

	public static final void pattern_AltStepToComboRule_11_5_expressionBBBBBBBBBBBBB(
			AltStepToComboRule _this, PerformRuleResult ruleresult,
			EObject interaction, EObject useCase, EObject useCaseToInteraction,
			EObject flow, EObject packageDeclaration, EObject actor,
			EObject actorToLine, EObject step, EObject combo, EObject line,
			EObject stepToCombo) {
		_this.registerObjects_BWD(ruleresult, interaction, useCase,
				useCaseToInteraction, flow, packageDeclaration, actor,
				actorToLine, step, combo, line, stepToCombo);

	}

	public static final PerformRuleResult pattern_AltStepToComboRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_12_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_12_1_blackFBB(
			EClass eClass, AltStepToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_12_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_12_1_binding = pattern_AltStepToComboRule_12_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltStepToComboRule_12_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_12_1_black = pattern_AltStepToComboRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltStepToComboRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltStepToComboRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltStepToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltStepToComboRule_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("interaction");
		EObject _localVariable_1 = match.getObject("combo");
		EObject _localVariable_2 = match.getObject("line");
		EObject tmpInteraction = _localVariable_0;
		EObject tmpCombo = _localVariable_1;
		EObject tmpLine = _localVariable_2;
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (tmpLine instanceof Lifeline) {
					Lifeline line = (Lifeline) tmpLine;
					return new Object[] { interaction, combo, line, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_12_2_blackBFFFFBBB(
			Interaction interaction, CombinedFragment combo, Lifeline line,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(interaction,
						UseCaseToInteraction.class, "target")) {
			UseCase useCase = useCaseToInteraction.getSource();
			if (useCase != null) {
				for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(line, ActorToLifeline.class,
								"target")) {
					Actor actor = actorToLine.getSource();
					if (actor != null) {
						_result.add(new Object[] { interaction, useCase,
								useCaseToInteraction, actor, actorToLine,
								combo, line, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_12_3_blackBBBFFBBBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (interaction.equals(combo.getEnclosingInteraction())) {
			if (interaction.equals(line.getInteraction())) {
				if (useCase.equals(useCaseToInteraction.getSource())) {
					if (interaction.equals(useCaseToInteraction.getTarget())) {
						if (actor.equals(actorToLine.getSource())) {
							if (line.equals(actorToLine.getTarget())) {
								if (line.getCoveredBy().contains(combo)) {
									for (Flow flow : useCase.getFlows()) {
										for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														useCase,
														PackageDeclaration.class,
														"useCases")) {
											if (packageDeclaration.getActors()
													.contains(actor)) {
												_result.add(new Object[] {
														interaction, useCase,
														useCaseToInteraction,
														flow,
														packageDeclaration,
														actor, actorToLine,
														combo, line });
											}
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

	public static final Object[] pattern_AltStepToComboRule_12_3_greenBBBBBBBBBFFFFFFFFFFFFFF(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
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
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(line);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				interaction__combo____fragment);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
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
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
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
		return new Object[] { interaction, useCase, useCaseToInteraction, flow,
				packageDeclaration, actor, actorToLine, combo, line,
				isApplicableMatch, combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				actorToLine__actor____source, actorToLine__line____target,
				line__combo____coveredBy, combo__line____covered };
	}

	public static final Object[] pattern_AltStepToComboRule_12_4_bindingFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, interaction, useCase, useCaseToInteraction,
				flow, packageDeclaration, actor, actorToLine, combo, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, interaction,
					useCase, useCaseToInteraction, flow, packageDeclaration,
					actor, actorToLine, combo, line };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltStepToComboRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, CombinedFragment combo, Lifeline line) {
		Object[] result_pattern_AltStepToComboRule_12_4_binding = pattern_AltStepToComboRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, interaction, useCase,
				useCaseToInteraction, flow, packageDeclaration, actor,
				actorToLine, combo, line);
		if (result_pattern_AltStepToComboRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltStepToComboRule_12_4_binding[0];

			Object[] result_pattern_AltStepToComboRule_12_4_black = pattern_AltStepToComboRule_12_4_blackB(csp);
			if (result_pattern_AltStepToComboRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						interaction, useCase, useCaseToInteraction, flow,
						packageDeclaration, actor, actorToLine, combo, line };
			}
		}
		return null;
	}

	public static final boolean pattern_AltStepToComboRule_12_5_expressionFBB(
			AltStepToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltStepToComboRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltStepToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltStepToComboRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_20_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_20_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_20_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_20_1_binding = pattern_AltStepToComboRule_20_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_20_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_20_1_black = pattern_AltStepToComboRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_20_2_blackFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingInteraction.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					for (Lifeline line : combo.getCovered()) {
						if (interaction.equals(line.getInteraction())) {
							_result.add(new Object[] { interaction, combo,
									line, _edge_enclosingInteraction });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_20_3_expressionFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_20_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_21_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_21_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_21_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_21_1_binding = pattern_AltStepToComboRule_21_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_21_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_21_1_black = pattern_AltStepToComboRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_21_2_blackFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpCombo = _edge_fragment.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					for (Lifeline line : interaction.getLifeline()) {
						if (line.getCoveredBy().contains(combo)) {
							_result.add(new Object[] { interaction, combo,
									line, _edge_fragment });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_21_3_expressionFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_21_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_22_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_22_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_22_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_22_1_binding = pattern_AltStepToComboRule_22_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_22_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_22_1_black = pattern_AltStepToComboRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_22_2_blackFFFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					Actor actor = step.getActor();
					if (actor != null) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									_result.add(new Object[] { useCase, flow,
											packageDeclaration, actor, step,
											_edge_steps });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_22_3_expressionFBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				flow, packageDeclaration, actor, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_22_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_23_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_23_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_23_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_23_1_binding = pattern_AltStepToComboRule_23_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_23_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_23_1_black = pattern_AltStepToComboRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_23_2_blackFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Flow.class,
									"steps")) {
						for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(actor,
										PackageDeclaration.class, "actors")) {
							for (UseCase useCase : packageDeclaration
									.getUseCases()) {
								if (useCase.getFlows().contains(flow)) {
									_result.add(new Object[] { useCase, flow,
											packageDeclaration, actor, step,
											_edge_actor });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_23_3_expressionFBBBBBBB(
			AltStepToComboRule _this, Match match, UseCase useCase, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, useCase,
				flow, packageDeclaration, actor, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_23_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_24_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_24_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_24_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_24_1_binding = pattern_AltStepToComboRule_24_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_24_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_24_1_black = pattern_AltStepToComboRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_24_2_blackFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpCombo = _edge_coveredBy.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (line.getCoveredBy().contains(combo)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						if (interaction.equals(combo.getEnclosingInteraction())) {
							_result.add(new Object[] { interaction, combo,
									line, _edge_coveredBy });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_24_3_expressionFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_24_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_25_1_bindingFB(
			AltStepToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_25_1_blackFBB(
			EClass __eClass, AltStepToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_25_1_bindingAndBlackFFB(
			AltStepToComboRule _this) {
		Object[] result_pattern_AltStepToComboRule_25_1_binding = pattern_AltStepToComboRule_25_1_bindingFB(_this);
		if (result_pattern_AltStepToComboRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltStepToComboRule_25_1_binding[0];

			Object[] result_pattern_AltStepToComboRule_25_1_black = pattern_AltStepToComboRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltStepToComboRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltStepToComboRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_25_2_blackFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_covered.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(combo)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						if (interaction.equals(line.getInteraction())) {
							_result.add(new Object[] { interaction, combo,
									line, _edge_covered });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltStepToComboRule_25_3_expressionFBBBBB(
			AltStepToComboRule _this, Match match, Interaction interaction,
			CombinedFragment combo, Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interaction,
				combo, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltStepToComboRule_25_4_expressionFBB(
			AltStepToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltStepToComboRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltStepToComboRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_28_1_blackB(
			AltStepToComboRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AltStepToComboRule_28_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltStepToComboRule_28_2_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList useCaseToInteractionList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpUseCaseToInteraction : useCaseToInteractionList
					.getEntryObjects()) {
				if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
					UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
					Interaction interaction = useCaseToInteraction.getTarget();
					if (interaction != null) {
						UseCase useCase = useCaseToInteraction.getSource();
						if (useCase != null) {
							if (pattern_AltStepToComboRule_28_2_black_nac_1BB(
									ruleResult, useCaseToInteraction) == null) {
								if (pattern_AltStepToComboRule_28_2_black_nac_0BB(
										ruleResult, interaction) == null) {
									if (pattern_AltStepToComboRule_28_2_black_nac_2BB(
											ruleResult, useCase) == null) {
										for (Lifeline line : interaction
												.getLifeline()) {
											if (pattern_AltStepToComboRule_28_2_black_nac_7BB(
													ruleResult, line) == null) {
												for (Flow flow : useCase
														.getFlows()) {
													if (pattern_AltStepToComboRule_28_2_black_nac_3BB(
															ruleResult, flow) == null) {
														for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		useCase,
																		PackageDeclaration.class,
																		"useCases")) {
															if (pattern_AltStepToComboRule_28_2_black_nac_4BB(
																	ruleResult,
																	packageDeclaration) == null) {
																for (Actor actor : packageDeclaration
																		.getActors()) {
																	if (pattern_AltStepToComboRule_28_2_black_nac_5BB(
																			ruleResult,
																			actor) == null) {
																		for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						line,
																						ActorToLifeline.class,
																						"target")) {
																			if (actor
																					.equals(actorToLine
																							.getSource())) {
																				if (pattern_AltStepToComboRule_28_2_black_nac_6BB(
																						ruleResult,
																						actorToLine) == null) {
																					_result.add(new Object[] {
																							useCaseToInteractionList,
																							interaction,
																							useCaseToInteraction,
																							useCase,
																							flow,
																							packageDeclaration,
																							actor,
																							actorToLine,
																							line,
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
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_28_3_bindingFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, interaction, useCase, useCaseToInteraction,
				flow, packageDeclaration, actor, actorToLine, line, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, interaction,
					useCase, useCaseToInteraction, flow, packageDeclaration,
					actor, actorToLine, line, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AltStepToComboRule_28_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltStepToComboRule_28_3_bindingAndBlackFBBBBBBBBBBB(
			AltStepToComboRule _this, IsApplicableMatch isApplicableMatch,
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AltStepToComboRule_28_3_binding = pattern_AltStepToComboRule_28_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, interaction, useCase,
				useCaseToInteraction, flow, packageDeclaration, actor,
				actorToLine, line, ruleResult);
		if (result_pattern_AltStepToComboRule_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_AltStepToComboRule_28_3_binding[0];

			Object[] result_pattern_AltStepToComboRule_28_3_black = pattern_AltStepToComboRule_28_3_blackB(csp);
			if (result_pattern_AltStepToComboRule_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						interaction, useCase, useCaseToInteraction, flow,
						packageDeclaration, actor, actorToLine, line,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AltStepToComboRule_28_4_expressionFBB(
			AltStepToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltStepToComboRule_28_5_blackBBBBBBBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, Lifeline line) {
		return new Object[] { interaction, useCase, useCaseToInteraction, flow,
				packageDeclaration, actor, actorToLine, line };
	}

	public static final Object[] pattern_AltStepToComboRule_28_6_blackBBBBBBBBB(
			Interaction interaction, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction, Flow flow,
			PackageDeclaration packageDeclaration, Actor actor,
			ActorToLifeline actorToLine, Lifeline line,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { interaction, useCase, useCaseToInteraction, flow,
				packageDeclaration, actor, actorToLine, line, ruleResult };
	}

	public static final Object[] pattern_AltStepToComboRule_28_6_greenBBBFFBFBB(
			Interaction interaction, Flow flow, Actor actor, Lifeline line,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		Object _localVariable_3 = csp.getValue("combo", "_id");
		Object _localVariable_4 = csp.getValue("combo", "name");
		Object _localVariable_5 = csp.getValue("combo", "interactionOperator");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		ruleResult.getTargetObjects().add(combo);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		ruleResult.getCorrObjects().add(stepToCombo);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		String combo__id_prime = (String) _localVariable_3;
		String combo_name_prime = (String) _localVariable_4;
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		combo.set_id(combo__id_prime);
		combo.setName(combo_name_prime);
		combo.setInteractionOperator(combo_interactionOperator_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { interaction, flow, actor, step, combo, line,
				stepToCombo, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AltStepToComboRule_28_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltStepToComboRuleImpl
