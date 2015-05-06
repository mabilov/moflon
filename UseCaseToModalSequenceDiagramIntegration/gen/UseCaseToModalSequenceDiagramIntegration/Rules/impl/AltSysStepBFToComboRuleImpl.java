/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.InteractionOperatorKind;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
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
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
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
 * An implementation of the model object '<em><b>Alt Sys Step BF To Combo Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AltSysStepBFToComboRuleImpl extends AbstractRuleImpl implements
		AltSysStepBFToComboRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltSysStepBFToComboRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAltSysStepBFToComboRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, BasicFlow flow,
			UseCase useCase, PackageDeclaration packageDeclaration,
			NormalStep step, AlternativeFlowAlternative alt,
			AlternativeFlow altFlow) {
		// initial bindings
		Object[] result1_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_0_1_blackBBBBBBBBB(this,
						match, actor, flow, useCase, packageDeclaration, step,
						alt, altFlow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_0_2_bindingAndBlackFBBBBBBBBB(
						this, match, actor, flow, useCase, packageDeclaration,
						step, alt, altFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_4_blackBBBBBBBB(match,
							actor, flow, useCase, packageDeclaration, step,
							alt, altFlow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_4_greenBBBBBBFFFF(match,
							actor, flow, step, alt, altFlow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[6];
			// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result4_green[7];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[8];
			// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_5_blackBBBBBBBB(match,
							actor, flow, useCase, packageDeclaration, step,
							alt, altFlow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_5_greenBBBBBFFF(match,
							actor, flow, useCase, packageDeclaration);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[7];

			// register objects to match
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_6_expressionBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow);
			return AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_7_expressionF();
		} else {
			return AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		Interaction interaction = (Interaction) result1_bindingAndBlack[2];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[3];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[6];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[7];
		NormalStep step = (NormalStep) result1_bindingAndBlack[8];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[9];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_1_greenBFBFFBBFFFFFBFB(line,
						interaction, step, alt, altFlow, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		CombinedFragment combo = (CombinedFragment) result1_green[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[7];
		InteractionOperand operand = (InteractionOperand) result1_green[8];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[9];
		InteractionConstraint guard = (InteractionConstraint) result1_green[10];
		LiteralString spec = (LiteralString) result1_green[11];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[13];

		// collect translated elements
		Object[] result2_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_2_blackBBBBBBBBBBBB(
						messageSend, combo, messageReceive, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_2_greenFBBBBBBBBBBBB(
						messageSend, combo, messageReceive, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, interaction,
						combo, flowToInteraction, messageReceive, flow,
						useCase, useCaseToInteraction, packageDeclaration,
						step, alt, stepToCombo, operand, alternative1ToOperand,
						guard, spec, altFlow, altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, interaction,
						combo, messageReceive, flow, step, alt, stepToCombo,
						operand, alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[18];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[19];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[20];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[21];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[22];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[23];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[24];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[25];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[26];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[27];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[28];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[29];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[30];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[31];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[32];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[33];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[34];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[35];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[36];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[37];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[38];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[39];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[40];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[41];

		// perform postprocessing story node is empty
		// register objects
		AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend,
						interaction, combo, flowToInteraction, messageReceive,
						flow, useCase, useCaseToInteraction,
						packageDeclaration, step, alt, stepToCombo, operand,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Actor actor = (Actor) result2_binding[0];
		BasicFlow flow = (BasicFlow) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[3];
		NormalStep step = (NormalStep) result2_binding[4];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_binding[5];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[6];
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_2_2_blackBFFBBFBBBBB(actor,
						flow, useCase, packageDeclaration, step, alt, altFlow,
						match)) {
			Interaction interaction = (Interaction) result2_black[1];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[2];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_2_3_blackBFBBBBBBBBB(
							actor, interaction, flowToInteraction, flow,
							useCase, useCaseToInteraction, packageDeclaration,
							step, alt, altFlow)) {
				Lifeline line = (Lifeline) result3_black[1];
				Object[] result3_green = AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
								actor, line, interaction, flowToInteraction,
								flow, useCase, useCaseToInteraction,
								packageDeclaration, step, alt, altFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[14];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[20];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[21];
				// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[22];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[23];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								interaction, flowToInteraction, flow, useCase,
								useCaseToInteraction, packageDeclaration, step,
								alt, altFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		match.registerObject("actor", actor);
		match.registerObject("flow", flow);
		match.registerObject("useCase", useCase);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("step", step);
		match.registerObject("alt", alt);
		match.registerObject("altFlow", altFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ALT");
		literal1.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", true, csp);
		var_step_type.setValue(step.getType());
		var_step_type.setType("UseCaseDSL.StepType");

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal1);
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
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("alt");
		literal0.setType("");

		// Create attribute variables
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", true, csp);
		var_altFlow_name.setValue(altFlow.getName());
		var_altFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");

		// Create unbound variables
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("String");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");
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
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("altFlow", altFlow);
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
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("step")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getNormalStep())
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
	public boolean isAppropriate_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		// initial bindings
		Object[] result1_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_10_1_blackBBBBBBBBBB(this,
						match, line, messageSend, interaction, combo,
						messageReceive, operand, guard, spec);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_10_2_bindingAndBlackFBBBBBBBBBB(
						this, match, line, messageSend, interaction, combo,
						messageReceive, operand, guard, spec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_4_blackBBBBBBBBB(match,
							line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_4_greenBBBBBBBBBFFFFFFFFFFFFFFF(
							match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec);
			// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result4_green[9];
			// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result4_green[10];
			// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result4_green[11];
			// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result4_green[12];
			// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result4_green[13];
			// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result4_green[14];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[15];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[16];
			// EMoflonEdge combo__operand____operand = (EMoflonEdge) result4_green[17];
			// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result4_green[18];
			// EMoflonEdge combo__line____covered = (EMoflonEdge) result4_green[19];
			// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result4_green[20];
			// EMoflonEdge operand__line____covered = (EMoflonEdge) result4_green[21];
			// EMoflonEdge operand__guard____guard = (EMoflonEdge) result4_green[22];
			// EMoflonEdge guard__spec____specification = (EMoflonEdge) result4_green[23];

			// collect context elements
			Object[] result5_black = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_5_blackBBBBBBBBB(match,
							line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_5_greenBBBFF(match,
							line, interaction);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[3];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[4];

			// register objects to match
			AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_6_expressionBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec);
			return AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_7_expressionF();
		} else {
			return AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Lifeline line = (Lifeline) result1_bindingAndBlack[1];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[2];
		Interaction interaction = (Interaction) result1_bindingAndBlack[3];
		CombinedFragment combo = (CombinedFragment) result1_bindingAndBlack[4];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[5];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[6];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[7];
		UseCase useCase = (UseCase) result1_bindingAndBlack[8];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[9];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[10];
		InteractionOperand operand = (InteractionOperand) result1_bindingAndBlack[11];
		InteractionConstraint guard = (InteractionConstraint) result1_bindingAndBlack[12];
		LiteralString spec = (LiteralString) result1_bindingAndBlack[13];
		CSP csp = (CSP) result1_bindingAndBlack[14];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_1_greenBBBFFFBFFFB(actor,
						combo, flow, operand, csp);
		NormalStep step = (NormalStep) result1_green[3];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_green[4];
		NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result1_green[5];
		StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result1_green[7];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[8];
		FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result1_green[9];

		// collect translated elements
		Object[] result2_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_2_blackBBBBBBBBBBBB(
						messageSend, combo, messageReceive, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_2_greenFBBBBBBBBBBBB(
						messageSend, combo, messageReceive, step, alt,
						stepToCombo, operand, alternative1ToOperand, guard,
						spec, altFlow, altFlowToOperand);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, actor, line, messageSend, interaction,
						combo, flowToInteraction, messageReceive, flow,
						useCase, useCaseToInteraction, packageDeclaration,
						step, alt, stepToCombo, operand, alternative1ToOperand,
						guard, spec, altFlow, altFlowToOperand);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, actor, line, messageSend, interaction,
						combo, messageReceive, flow, step, alt, stepToCombo,
						operand, alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[18];
		// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[19];
		// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[20];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[21];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[22];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[23];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[24];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[25];
		// EMoflonEdge step__alt____stepAlternative = (EMoflonEdge) result3_green[26];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[27];
		// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[28];
		// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[29];
		// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[30];
		// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[31];
		// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[32];
		// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[33];
		// EMoflonEdge stepToCombo__step____source = (EMoflonEdge) result3_green[34];
		// EMoflonEdge stepToCombo__combo____target = (EMoflonEdge) result3_green[35];
		// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[36];
		// EMoflonEdge alternative1ToOperand__alt____source = (EMoflonEdge) result3_green[37];
		// EMoflonEdge alternative1ToOperand__operand____target = (EMoflonEdge) result3_green[38];
		// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[39];
		// EMoflonEdge altFlowToOperand__altFlow____source = (EMoflonEdge) result3_green[40];
		// EMoflonEdge altFlowToOperand__operand____target = (EMoflonEdge) result3_green[41];

		// perform postprocessing story node is empty
		// register objects
		AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, line, messageSend,
						interaction, combo, flowToInteraction, messageReceive,
						flow, useCase, useCaseToInteraction,
						packageDeclaration, step, alt, stepToCombo, operand,
						alternative1ToOperand, guard, spec, altFlow,
						altFlowToOperand);
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_12_2_bindingFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		Lifeline line = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		Interaction interaction = (Interaction) result2_binding[2];
		CombinedFragment combo = (CombinedFragment) result2_binding[3];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[4];
		InteractionOperand operand = (InteractionOperand) result2_binding[5];
		InteractionConstraint guard = (InteractionConstraint) result2_binding[6];
		LiteralString spec = (LiteralString) result2_binding[7];
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_12_2_blackBBBBFBFFFBBBB(line,
						messageSend, interaction, combo, messageReceive,
						operand, guard, spec, match)) {
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[4];
			BasicFlow flow = (BasicFlow) result2_black[6];
			UseCase useCase = (UseCase) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_12_3_blackFBBBBBBBBBFBBB(
							line, messageSend, interaction, combo,
							flowToInteraction, messageReceive, flow, useCase,
							useCaseToInteraction, operand, guard, spec)) {
				Actor actor = (Actor) result3_black[0];
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[10];
				Object[] result3_green = AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_12_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
								actor, line, messageSend, interaction, combo,
								flowToInteraction, messageReceive, flow,
								useCase, useCaseToInteraction,
								packageDeclaration, operand, guard, spec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[14];
				// EMoflonEdge line__messageSend____coveredBy = (EMoflonEdge) result3_green[15];
				// EMoflonEdge messageSend__line____covered = (EMoflonEdge) result3_green[16];
				// EMoflonEdge combo__interaction____enclosingInteraction = (EMoflonEdge) result3_green[17];
				// EMoflonEdge interaction__combo____fragment = (EMoflonEdge) result3_green[18];
				// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[19];
				// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[20];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[21];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[22];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[25];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[26];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[27];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[28];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[29];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[30];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[31];
				// EMoflonEdge combo__operand____operand = (EMoflonEdge) result3_green[32];
				// EMoflonEdge line__combo____coveredBy = (EMoflonEdge) result3_green[33];
				// EMoflonEdge combo__line____covered = (EMoflonEdge) result3_green[34];
				// EMoflonEdge line__operand____coveredBy = (EMoflonEdge) result3_green[35];
				// EMoflonEdge operand__line____covered = (EMoflonEdge) result3_green[36];
				// EMoflonEdge operand__guard____guard = (EMoflonEdge) result3_green[37];
				// EMoflonEdge guard__spec____specification = (EMoflonEdge) result3_green[38];

				// solve CSP
				Object[] result4_bindingAndBlack = AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, line,
								messageSend, interaction, combo,
								flowToInteraction, messageReceive, flow,
								useCase, useCaseToInteraction,
								packageDeclaration, operand, guard, spec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		match.registerObject("line", line);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("combo", combo);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("operand", operand);
		match.registerObject("guard", guard);
		match.registerObject("spec", spec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {// Create CSP
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
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ALT");
		literal1.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", true, csp);
		var_guard_name.setValue(guard.getName());
		var_guard_name.setType("String");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", true, csp);
		var_spec_value.setValue(spec.getValue());
		var_spec_value.setType("String");

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal1);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("combo", combo);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("combo", combo);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("stepToCombo", stepToCombo);
		ruleresult.registerObject("operand", operand);
		ruleresult.registerObject("alternative1ToOperand",
				alternative1ToOperand);
		ruleresult.registerObject("guard", guard);
		ruleresult.registerObject("spec", spec);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("altFlowToOperand", altFlowToOperand);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("messageSend")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("combo")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getCombinedFragment())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_155(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_20_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_20_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_156(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_21_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_21_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_157(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_22_2_blackFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_22_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_158(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_23_2_blackFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_23_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_159(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_24_2_blackFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_24_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_160(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_25_2_blackFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_25_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_25_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_25_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_25_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_161(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_26_2_blackFFFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_26_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_26_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_26_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_26_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_162(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_27_2_blackFFFFFFFFB(_edge_fragment)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_27_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_27_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_27_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_27_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_247(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_28_2_blackFFFFFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_28_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_28_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_28_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_28_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_248(
			EMoflonEdge _edge_stepAlternative) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_29_2_blackFFFFFFFB(_edge_stepAlternative)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_29_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_29_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_29_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_29_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_249(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_30_2_blackFFFFFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_30_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_30_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_30_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_30_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_250(
			EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_31_2_blackFFFFFFFB(_edge_ref)) {
			Actor actor = (Actor) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[5];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[6];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_31_3_expressionFBBBBBBBBB(
							this, match, actor, flow, useCase,
							packageDeclaration, step, alt, altFlow)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_31_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_31_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_31_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_163(
			EMoflonEdge _edge_operand) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_32_2_blackFFFFFFFFB(_edge_operand)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_32_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_32_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_32_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_32_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_164(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_33_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_33_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_33_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_33_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_33_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_165(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_34_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_34_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_34_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_34_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_34_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_166(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_35_2_blackFFFFFFFFB(_edge_coveredBy)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_35_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_35_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_35_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_35_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_167(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_36_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_36_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_36_2_blackFFFFFFFFB(_edge_covered)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_36_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_36_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_36_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_36_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_36_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_36_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_168(
			EMoflonEdge _edge_guard) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_37_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_37_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_37_2_blackFFFFFFFFB(_edge_guard)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_37_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_37_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_37_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_37_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_37_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_37_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_169(
			EMoflonEdge _edge_specification) {
		// prepare return value
		Object[] result1_bindingAndBlack = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_38_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_38_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_38_2_blackFFFFFFFFB(_edge_specification)) {
			Lifeline line = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			CombinedFragment combo = (CombinedFragment) result2_black[3];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[4];
			InteractionOperand operand = (InteractionOperand) result2_black[5];
			InteractionConstraint guard = (InteractionConstraint) result2_black[6];
			LiteralString spec = (LiteralString) result2_black[7];
			Object[] result2_green = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_38_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_38_3_expressionFBBBBBBBBBB(
							this, match, line, messageSend, interaction, combo,
							messageReceive, operand, guard, spec)) {
				// Ensure that the correct types of elements are matched
				if (AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_38_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_38_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_38_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_38_6_expressionFB(__result);
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
			FlowToInteractionFragment flowToInteractionParameter) {
		// create result
		Object[] result1_black = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_41_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_41_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_41_2_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList flowToInteractionList = (RuleEntryList) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			BasicFlow flow = (BasicFlow) result2_black[4];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[5];
			Interaction interaction = (Interaction) result2_black[6];
			Lifeline line = (Lifeline) result2_black[7];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_41_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, actor, line, interaction,
							flowToInteraction, flow, useCase,
							useCaseToInteraction, packageDeclaration,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AltSysStepBFToComboRuleImpl
					.pattern_AltSysStepBFToComboRule_41_4_expressionFBB(this,
							csp)) {
				// check nacs
				Object[] result5_black = AltSysStepBFToComboRuleImpl
						.pattern_AltSysStepBFToComboRule_41_5_blackBBBBBBBB(
								actor, line, interaction, flowToInteraction,
								flow, useCase, useCaseToInteraction,
								packageDeclaration);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_41_6_blackBBBBBBBBB(
									actor, line, interaction,
									flowToInteraction, flow, useCase,
									useCaseToInteraction, packageDeclaration,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					AltSysStepBFToComboRuleImpl
							.pattern_AltSysStepBFToComboRule_41_6_greenBBFBFFBFFFFFFFFFBB(
									actor, line, interaction, flow, ruleResult,
									csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// CombinedFragment combo = (CombinedFragment) result6_green[4];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[5];
					// NormalStep step = (NormalStep) result6_green[7];
					// AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result6_green[8];
					// NormalStepToCombinedFragment stepToCombo = (NormalStepToCombinedFragment) result6_green[9];
					// InteractionOperand operand = (InteractionOperand) result6_green[10];
					// StepAlternativeToInteractionOperand alternative1ToOperand = (StepAlternativeToInteractionOperand) result6_green[11];
					// InteractionConstraint guard = (InteractionConstraint) result6_green[12];
					// LiteralString spec = (LiteralString) result6_green[13];
					// AlternativeFlow altFlow = (AlternativeFlow) result6_green[14];
					// FlowToInteractionFragment altFlowToOperand = (FlowToInteractionFragment) result6_green[15];

				} else {
				}

			} else {
			}

		}
		return AltSysStepBFToComboRuleImpl
				.pattern_AltSysStepBFToComboRule_41_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("system");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("ALT");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("alt");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_altFlow_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"altFlow.name", csp);
		var_altFlow_name.setType("String");
		Variable var_guard_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"guard.name", csp);
		var_guard_name.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable(
				"alt.condition", csp);
		var_alt_condition.setType("String");
		Variable var_spec_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"spec.value", csp);
		var_spec_value.setType("String");
		Variable var_combo_interactionOperator = CSPFactoryHelper.eINSTANCE
				.createVariable("combo.interactionOperator", csp);
		var_combo_interactionOperator
				.setType("ModalSequenceDiagram.InteractionOperatorKind");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		EqInterOperKind eqInterOperKind = new EqInterOperKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqInterOperKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal1);
		eqInterOperKind.setRuleName("");
		eqInterOperKind.solve(var_combo_interactionOperator, literal2);
		eq.setRuleName("");
		eq.solve(var_altFlow_name, var_guard_name);
		eq_0.setRuleName("");
		eq_0.solve(var_alt_condition, var_spec_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (BasicFlow) arguments.get(2),
					(UseCase) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(NormalStep) arguments.get(5),
					(AlternativeFlowAlternative) arguments.get(6),
					(AlternativeFlow) arguments.get(7));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(FlowToInteractionFragment) arguments.get(4),
					(BasicFlow) arguments.get(5), (UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(PackageDeclaration) arguments.get(8),
					(NormalStep) arguments.get(9),
					(AlternativeFlowAlternative) arguments.get(10),
					(AlternativeFlow) arguments.get(11));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(CombinedFragment) arguments.get(4),
					(MessageOccurrenceSpecification) arguments.get(5),
					(InteractionOperand) arguments.get(6),
					(InteractionConstraint) arguments.get(7),
					(LiteralString) arguments.get(8));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(MessageOccurrenceSpecification) arguments.get(3),
					(Interaction) arguments.get(4),
					(CombinedFragment) arguments.get(5),
					(FlowToInteractionFragment) arguments.get(6),
					(MessageOccurrenceSpecification) arguments.get(7),
					(BasicFlow) arguments.get(8), (UseCase) arguments.get(9),
					(UseCaseToInteraction) arguments.get(10),
					(PackageDeclaration) arguments.get(11),
					(InteractionOperand) arguments.get(12),
					(InteractionConstraint) arguments.get(13),
					(LiteralString) arguments.get(14));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_155__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_155((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_156__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_156((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_157__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_157((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_158__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_158((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_159__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_159((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_160__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_160((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_161__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_161((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_162__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_162((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_247__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_247((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_248__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_248((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_249__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_249((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_250__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_250((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_163__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_163((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_164__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_164((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_165__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_165((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_166__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_166((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_167__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_167((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_168__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_168((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_169__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_169((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowToInteractionFragment) arguments.get(1));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Lifeline) arguments.get(2),
					(Interaction) arguments.get(3),
					(FlowToInteractionFragment) arguments.get(4),
					(BasicFlow) arguments.get(5), (UseCase) arguments.get(6),
					(UseCaseToInteraction) arguments.get(7),
					(PackageDeclaration) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_1_blackBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		return new Object[] { _this, match, actor, flow, useCase,
				packageDeclaration, step, alt, altFlow };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_2_bindingFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				flow, useCase, packageDeclaration, step, alt, altFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, flow, useCase,
					packageDeclaration, step, alt, altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_2_bindingAndBlackFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		Object[] result_pattern_AltSysStepBFToComboRule_0_2_binding = pattern_AltSysStepBFToComboRule_0_2_bindingFBBBBBBBBB(
				_this, match, actor, flow, useCase, packageDeclaration, step,
				alt, altFlow);
		if (result_pattern_AltSysStepBFToComboRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_0_2_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_0_2_black = pattern_AltSysStepBFToComboRule_0_2_blackB(csp);
			if (result_pattern_AltSysStepBFToComboRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor, flow, useCase,
						packageDeclaration, step, alt, altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_0_3_expressionFBB(
			AltSysStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_4_blackBBBBBBBB(
			Match match, Actor actor, BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		return new Object[] { match, actor, flow, useCase, packageDeclaration,
				step, alt, altFlow };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_4_greenBBBBBBFFFF(
			Match match, Actor actor, BasicFlow flow, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		match.getToBeTranslatedNodes().add(alt);
		match.getToBeTranslatedNodes().add(altFlow);
		String flow__step____steps_name_prime = "steps";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		match.getToBeTranslatedEdges().add(step__alt____stepAlternative);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(step__actor____actor);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(alt__altFlow____ref);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		return new Object[] { match, actor, flow, step, alt, altFlow,
				flow__step____steps, step__alt____stepAlternative,
				step__actor____actor, alt__altFlow____ref };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_5_blackBBBBBBBB(
			Match match, Actor actor, BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		return new Object[] { match, actor, flow, useCase, packageDeclaration,
				step, alt, altFlow };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_0_5_greenBBBBBFFF(
			Match match, Actor actor, BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(actor);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(packageDeclaration);
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
		return new Object[] { match, actor, flow, useCase, packageDeclaration,
				useCase__flow____flows,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors };
	}

	public static final void pattern_AltSysStepBFToComboRule_0_6_expressionBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		_this.registerObjectsToMatch_FWD(match, actor, flow, useCase,
				packageDeclaration, step, alt, altFlow);

	}

	public static final boolean pattern_AltSysStepBFToComboRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("alt");
		EObject _localVariable_10 = isApplicableMatch.getObject("altFlow");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		EObject tmpFlowToInteraction = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpUseCaseToInteraction = _localVariable_6;
		EObject tmpPackageDeclaration = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpAlt = _localVariable_9;
		EObject tmpAltFlow = _localVariable_10;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
						FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
						if (tmpFlow instanceof BasicFlow) {
							BasicFlow flow = (BasicFlow) tmpFlow;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
									UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
									if (tmpPackageDeclaration instanceof PackageDeclaration) {
										PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
										if (tmpStep instanceof NormalStep) {
											NormalStep step = (NormalStep) tmpStep;
											if (tmpAlt instanceof AlternativeFlowAlternative) {
												AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
												if (tmpAltFlow instanceof AlternativeFlow) {
													AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
													return new Object[] {
															actor,
															line,
															interaction,
															flowToInteraction,
															flow,
															useCase,
															useCaseToInteraction,
															packageDeclaration,
															step, alt, altFlow,
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

	public static final Object[] pattern_AltSysStepBFToComboRule_1_1_blackBBBBBBBBBBBFBB(
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow,
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { actor, line, interaction,
						flowToInteraction, flow, useCase, useCaseToInteraction,
						packageDeclaration, step, alt, altFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_1_bindingAndBlackFFFFFFFFFFFFBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltSysStepBFToComboRule_1_1_binding = pattern_AltSysStepBFToComboRule_1_1_bindingFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltSysStepBFToComboRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_AltSysStepBFToComboRule_1_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_AltSysStepBFToComboRule_1_1_binding[1];
			Interaction interaction = (Interaction) result_pattern_AltSysStepBFToComboRule_1_1_binding[2];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_AltSysStepBFToComboRule_1_1_binding[3];
			BasicFlow flow = (BasicFlow) result_pattern_AltSysStepBFToComboRule_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_AltSysStepBFToComboRule_1_1_binding[5];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltSysStepBFToComboRule_1_1_binding[6];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltSysStepBFToComboRule_1_1_binding[7];
			NormalStep step = (NormalStep) result_pattern_AltSysStepBFToComboRule_1_1_binding[8];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_AltSysStepBFToComboRule_1_1_binding[9];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_AltSysStepBFToComboRule_1_1_binding[10];

			Object[] result_pattern_AltSysStepBFToComboRule_1_1_black = pattern_AltSysStepBFToComboRule_1_1_blackBBBBBBBBBBBFBB(
					actor, line, interaction, flowToInteraction, flow, useCase,
					useCaseToInteraction, packageDeclaration, step, alt,
					altFlow, _this, isApplicableMatch);
			if (result_pattern_AltSysStepBFToComboRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_1_1_black[11];

				return new Object[] { actor, line, interaction,
						flowToInteraction, flow, useCase, useCaseToInteraction,
						packageDeclaration, step, alt, altFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_1_greenBFBFFBBFFFFFBFB(
			Lifeline line, Interaction interaction, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		StepAlternativeToInteractionOperand alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		Object _localVariable_1 = csp.getValue("guard", "name");
		Object _localVariable_2 = csp.getValue("spec", "value");
		line.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		messageReceive.setEnclosingInteraction(interaction);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		combo.getOperand().add(operand);
		line.getCoveredBy().add(operand);
		alternative1ToOperand.setSource(alt);
		alternative1ToOperand.setTarget(operand);
		operand.setGuard(guard);
		guard.setSpecification(spec);
		altFlowToOperand.setSource(altFlow);
		altFlowToOperand.setTarget(operand);
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_0;
		String guard_name_prime = (String) _localVariable_1;
		String spec_value_prime = (String) _localVariable_2;
		combo.setInteractionOperator(combo_interactionOperator_prime);
		guard.setName(guard_name_prime);
		spec.setValue(spec_value_prime);
		return new Object[] { line, messageSend, interaction, combo,
				messageReceive, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand,
				csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, combo, messageReceive, step,
					alt, stepToCombo, operand, alternative1ToOperand, guard,
					spec, altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(combo);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getCreatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getCreatedElements().add(guard);
		ruleresult.getCreatedElements().add(spec);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, combo, messageReceive,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_1_3_blackBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject combo,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(interaction)) {
					if (!actor.equals(combo)) {
						if (!actor.equals(flowToInteraction)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(flow)) {
									if (!actor.equals(useCase)) {
										if (!actor.equals(useCaseToInteraction)) {
											if (!actor
													.equals(packageDeclaration)) {
												if (!actor.equals(step)) {
													if (!actor.equals(alt)) {
														if (!actor
																.equals(stepToCombo)) {
															if (!actor
																	.equals(operand)) {
																if (!actor
																		.equals(alternative1ToOperand)) {
																	if (!actor
																			.equals(guard)) {
																		if (!actor
																				.equals(spec)) {
																			if (!actor
																					.equals(altFlow)) {
																				if (!actor
																						.equals(altFlowToOperand)) {
																					if (!line
																							.equals(messageSend)) {
																						if (!line
																								.equals(messageReceive)) {
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
																												if (!line
																														.equals(operand)) {
																													if (!line
																															.equals(spec)) {
																														if (!messageSend
																																.equals(useCase)) {
																															if (!messageSend
																																	.equals(useCaseToInteraction)) {
																																if (!messageSend
																																		.equals(packageDeclaration)) {
																																	if (!messageSend
																																			.equals(step)) {
																																		if (!messageSend
																																				.equals(stepToCombo)) {
																																			if (!messageSend
																																					.equals(operand)) {
																																				if (!messageSend
																																						.equals(spec)) {
																																					if (!interaction
																																							.equals(line)) {
																																						if (!interaction
																																								.equals(messageSend)) {
																																							if (!interaction
																																									.equals(messageReceive)) {
																																								if (!interaction
																																										.equals(useCase)) {
																																									if (!interaction
																																											.equals(useCaseToInteraction)) {
																																										if (!interaction
																																												.equals(packageDeclaration)) {
																																											if (!interaction
																																													.equals(step)) {
																																												if (!interaction
																																														.equals(stepToCombo)) {
																																													if (!interaction
																																															.equals(operand)) {
																																														if (!interaction
																																																.equals(spec)) {
																																															if (!combo
																																																	.equals(line)) {
																																																if (!combo
																																																		.equals(messageSend)) {
																																																	if (!combo
																																																			.equals(interaction)) {
																																																		if (!combo
																																																				.equals(flowToInteraction)) {
																																																			if (!combo
																																																					.equals(messageReceive)) {
																																																				if (!combo
																																																						.equals(flow)) {
																																																					if (!combo
																																																							.equals(useCase)) {
																																																						if (!combo
																																																								.equals(useCaseToInteraction)) {
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
																																																													if (!flowToInteraction
																																																															.equals(line)) {
																																																														if (!flowToInteraction
																																																																.equals(messageSend)) {
																																																															if (!flowToInteraction
																																																																	.equals(interaction)) {
																																																																if (!flowToInteraction
																																																																		.equals(messageReceive)) {
																																																																	if (!flowToInteraction
																																																																			.equals(useCase)) {
																																																																		if (!flowToInteraction
																																																																				.equals(useCaseToInteraction)) {
																																																																			if (!flowToInteraction
																																																																					.equals(packageDeclaration)) {
																																																																				if (!flowToInteraction
																																																																						.equals(step)) {
																																																																					if (!flowToInteraction
																																																																							.equals(stepToCombo)) {
																																																																						if (!flowToInteraction
																																																																								.equals(operand)) {
																																																																							if (!flowToInteraction
																																																																									.equals(guard)) {
																																																																								if (!flowToInteraction
																																																																										.equals(spec)) {
																																																																									if (!messageReceive
																																																																											.equals(messageSend)) {
																																																																										if (!messageReceive
																																																																												.equals(useCase)) {
																																																																											if (!messageReceive
																																																																													.equals(useCaseToInteraction)) {
																																																																												if (!messageReceive
																																																																														.equals(packageDeclaration)) {
																																																																													if (!messageReceive
																																																																															.equals(step)) {
																																																																														if (!messageReceive
																																																																																.equals(stepToCombo)) {
																																																																															if (!messageReceive
																																																																																	.equals(operand)) {
																																																																																if (!messageReceive
																																																																																		.equals(spec)) {
																																																																																	if (!flow
																																																																																			.equals(line)) {
																																																																																		if (!flow
																																																																																				.equals(messageSend)) {
																																																																																			if (!flow
																																																																																					.equals(interaction)) {
																																																																																				if (!flow
																																																																																						.equals(flowToInteraction)) {
																																																																																					if (!flow
																																																																																							.equals(messageReceive)) {
																																																																																						if (!flow
																																																																																								.equals(useCase)) {
																																																																																							if (!flow
																																																																																									.equals(useCaseToInteraction)) {
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
																																																																																														if (!useCase
																																																																																																.equals(useCaseToInteraction)) {
																																																																																															if (!packageDeclaration
																																																																																																	.equals(useCase)) {
																																																																																																if (!packageDeclaration
																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																	if (!packageDeclaration
																																																																																																			.equals(step)) {
																																																																																																		if (!packageDeclaration
																																																																																																				.equals(stepToCombo)) {
																																																																																																			if (!packageDeclaration
																																																																																																					.equals(spec)) {
																																																																																																				if (!step
																																																																																																						.equals(useCase)) {
																																																																																																					if (!step
																																																																																																							.equals(useCaseToInteraction)) {
																																																																																																						if (!step
																																																																																																								.equals(stepToCombo)) {
																																																																																																							if (!alt.equals(line)) {
																																																																																																								if (!alt.equals(messageSend)) {
																																																																																																									if (!alt.equals(interaction)) {
																																																																																																										if (!alt.equals(combo)) {
																																																																																																											if (!alt.equals(flowToInteraction)) {
																																																																																																												if (!alt.equals(messageReceive)) {
																																																																																																													if (!alt.equals(flow)) {
																																																																																																														if (!alt.equals(useCase)) {
																																																																																																															if (!alt.equals(useCaseToInteraction)) {
																																																																																																																if (!alt.equals(packageDeclaration)) {
																																																																																																																	if (!alt.equals(step)) {
																																																																																																																		if (!alt.equals(stepToCombo)) {
																																																																																																																			if (!alt.equals(operand)) {
																																																																																																																				if (!alt.equals(alternative1ToOperand)) {
																																																																																																																					if (!alt.equals(guard)) {
																																																																																																																						if (!alt.equals(spec)) {
																																																																																																																							if (!alt.equals(altFlow)) {
																																																																																																																								if (!alt.equals(altFlowToOperand)) {
																																																																																																																									if (!stepToCombo
																																																																																																																											.equals(useCase)) {
																																																																																																																										if (!stepToCombo
																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																											if (!operand
																																																																																																																													.equals(useCase)) {
																																																																																																																												if (!operand
																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																													if (!operand
																																																																																																																															.equals(packageDeclaration)) {
																																																																																																																														if (!operand
																																																																																																																																.equals(step)) {
																																																																																																																															if (!operand
																																																																																																																																	.equals(stepToCombo)) {
																																																																																																																																if (!operand
																																																																																																																																		.equals(spec)) {
																																																																																																																																	if (!alternative1ToOperand
																																																																																																																																			.equals(line)) {
																																																																																																																																		if (!alternative1ToOperand
																																																																																																																																				.equals(messageSend)) {
																																																																																																																																			if (!alternative1ToOperand
																																																																																																																																					.equals(interaction)) {
																																																																																																																																				if (!alternative1ToOperand
																																																																																																																																						.equals(combo)) {
																																																																																																																																					if (!alternative1ToOperand
																																																																																																																																							.equals(flowToInteraction)) {
																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																								.equals(messageReceive)) {
																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																									.equals(flow)) {
																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																										.equals(useCase)) {
																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																												.equals(packageDeclaration)) {
																																																																																																																																											if (!alternative1ToOperand
																																																																																																																																													.equals(step)) {
																																																																																																																																												if (!alternative1ToOperand
																																																																																																																																														.equals(stepToCombo)) {
																																																																																																																																													if (!alternative1ToOperand
																																																																																																																																															.equals(operand)) {
																																																																																																																																														if (!alternative1ToOperand
																																																																																																																																																.equals(guard)) {
																																																																																																																																															if (!alternative1ToOperand
																																																																																																																																																	.equals(spec)) {
																																																																																																																																																if (!guard
																																																																																																																																																		.equals(line)) {
																																																																																																																																																	if (!guard
																																																																																																																																																			.equals(messageSend)) {
																																																																																																																																																		if (!guard
																																																																																																																																																				.equals(interaction)) {
																																																																																																																																																			if (!guard
																																																																																																																																																					.equals(messageReceive)) {
																																																																																																																																																				if (!guard
																																																																																																																																																						.equals(useCase)) {
																																																																																																																																																					if (!guard
																																																																																																																																																							.equals(useCaseToInteraction)) {
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
																																																																																																																																																											if (!spec
																																																																																																																																																													.equals(useCase)) {
																																																																																																																																																												if (!spec
																																																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																																																													if (!spec
																																																																																																																																																															.equals(step)) {
																																																																																																																																																														if (!spec
																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																															if (!altFlow
																																																																																																																																																																	.equals(line)) {
																																																																																																																																																																if (!altFlow
																																																																																																																																																																		.equals(messageSend)) {
																																																																																																																																																																	if (!altFlow
																																																																																																																																																																			.equals(interaction)) {
																																																																																																																																																																		if (!altFlow
																																																																																																																																																																				.equals(combo)) {
																																																																																																																																																																			if (!altFlow
																																																																																																																																																																					.equals(flowToInteraction)) {
																																																																																																																																																																				if (!altFlow
																																																																																																																																																																						.equals(messageReceive)) {
																																																																																																																																																																					if (!altFlow
																																																																																																																																																																							.equals(flow)) {
																																																																																																																																																																						if (!altFlow
																																																																																																																																																																								.equals(useCase)) {
																																																																																																																																																																							if (!altFlow
																																																																																																																																																																									.equals(useCaseToInteraction)) {
																																																																																																																																																																								if (!altFlow
																																																																																																																																																																										.equals(packageDeclaration)) {
																																																																																																																																																																									if (!altFlow
																																																																																																																																																																											.equals(step)) {
																																																																																																																																																																										if (!altFlow
																																																																																																																																																																												.equals(stepToCombo)) {
																																																																																																																																																																											if (!altFlow
																																																																																																																																																																													.equals(operand)) {
																																																																																																																																																																												if (!altFlow
																																																																																																																																																																														.equals(alternative1ToOperand)) {
																																																																																																																																																																													if (!altFlow
																																																																																																																																																																															.equals(guard)) {
																																																																																																																																																																														if (!altFlow
																																																																																																																																																																																.equals(spec)) {
																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																	.equals(altFlowToOperand)) {
																																																																																																																																																																																if (!altFlowToOperand
																																																																																																																																																																																		.equals(line)) {
																																																																																																																																																																																	if (!altFlowToOperand
																																																																																																																																																																																			.equals(messageSend)) {
																																																																																																																																																																																		if (!altFlowToOperand
																																																																																																																																																																																				.equals(interaction)) {
																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																					.equals(combo)) {
																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																						.equals(flowToInteraction)) {
																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																							.equals(messageReceive)) {
																																																																																																																																																																																						if (!altFlowToOperand
																																																																																																																																																																																								.equals(flow)) {
																																																																																																																																																																																							if (!altFlowToOperand
																																																																																																																																																																																									.equals(useCase)) {
																																																																																																																																																																																								if (!altFlowToOperand
																																																																																																																																																																																										.equals(useCaseToInteraction)) {
																																																																																																																																																																																									if (!altFlowToOperand
																																																																																																																																																																																											.equals(packageDeclaration)) {
																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																												.equals(step)) {
																																																																																																																																																																																											if (!altFlowToOperand
																																																																																																																																																																																													.equals(stepToCombo)) {
																																																																																																																																																																																												if (!altFlowToOperand
																																																																																																																																																																																														.equals(operand)) {
																																																																																																																																																																																													if (!altFlowToOperand
																																																																																																																																																																																															.equals(alternative1ToOperand)) {
																																																																																																																																																																																														if (!altFlowToOperand
																																																																																																																																																																																																.equals(guard)) {
																																																																																																																																																																																															if (!altFlowToOperand
																																																																																																																																																																																																	.equals(spec)) {
																																																																																																																																																																																																return new Object[] {
																																																																																																																																																																																																		ruleresult,
																																																																																																																																																																																																		actor,
																																																																																																																																																																																																		line,
																																																																																																																																																																																																		messageSend,
																																																																																																																																																																																																		interaction,
																																																																																																																																																																																																		combo,
																																																																																																																																																																																																		flowToInteraction,
																																																																																																																																																																																																		messageReceive,
																																																																																																																																																																																																		flow,
																																																																																																																																																																																																		useCase,
																																																																																																																																																																																																		useCaseToInteraction,
																																																																																																																																																																																																		packageDeclaration,
																																																																																																																																																																																																		step,
																																																																																																																																																																																																		alt,
																																																																																																																																																																																																		stepToCombo,
																																																																																																																																																																																																		operand,
																																																																																																																																																																																																		alternative1ToOperand,
																																																																																																																																																																																																		guard,
																																																																																																																																																																																																		spec,
																																																																																																																																																																																																		altFlow,
																																																																																																																																																																																																		altFlowToOperand };
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_1_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject combo,
			EObject messageReceive, EObject flow, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alternative1ToOperand__alt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alternative1ToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__altFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AltSysStepBFToComboRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		String combo__operand____operand_name_prime = "operand";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String operand__guard____guard_name_prime = "guard";
		String alternative1ToOperand__alt____source_name_prime = "source";
		String alternative1ToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		String altFlowToOperand__altFlow____source_name_prime = "source";
		String altFlowToOperand__operand____target_name_prime = "target";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageSend__line____covered);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		ruleresult.getCreatedEdges().add(interaction__combo____fragment);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				interaction__messageReceive____fragment);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		ruleresult.getTranslatedEdges().add(step__alt____stepAlternative);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(step__actor____actor);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(alt__altFlow____ref);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getCreatedEdges().add(combo__operand____operand);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getCreatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(combo__line____covered);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getCreatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(operand__line____covered);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		ruleresult.getCreatedEdges().add(stepToCombo__combo____target);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getCreatedEdges().add(operand__guard____guard);
		alternative1ToOperand__alt____source.setSrc(alternative1ToOperand);
		alternative1ToOperand__alt____source.setTrg(alt);
		ruleresult.getCreatedEdges().add(alternative1ToOperand__alt____source);
		alternative1ToOperand__operand____target.setSrc(alternative1ToOperand);
		alternative1ToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(
				alternative1ToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getCreatedEdges().add(guard__spec____specification);
		altFlowToOperand__altFlow____source.setSrc(altFlowToOperand);
		altFlowToOperand__altFlow____source.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(altFlowToOperand__altFlow____source);
		altFlowToOperand__operand____target.setSrc(altFlowToOperand);
		altFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altFlowToOperand__operand____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		alternative1ToOperand__alt____source
				.setName(alternative1ToOperand__alt____source_name_prime);
		alternative1ToOperand__operand____target
				.setName(alternative1ToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		altFlowToOperand__altFlow____source
				.setName(altFlowToOperand__altFlow____source_name_prime);
		altFlowToOperand__operand____target
				.setName(altFlowToOperand__operand____target_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend,
				interaction, combo, messageReceive, flow, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand, line__messageSend____coveredBy,
				messageSend__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, combo__operand____operand,
				line__combo____coveredBy, combo__line____covered,
				line__operand____coveredBy, operand__line____covered,
				stepToCombo__step____source, stepToCombo__combo____target,
				operand__guard____guard, alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltSysStepBFToComboRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_FWD(ruleresult, actor, line, messageSend,
				interaction, combo, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, packageDeclaration, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltSysStepBFToComboRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_1_blackFBB(
			EClass eClass, AltSysStepBFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_2_1_binding = pattern_AltSysStepBFToComboRule_2_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltSysStepBFToComboRule_2_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_2_1_black = pattern_AltSysStepBFToComboRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltSysStepBFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_2_bindingFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject _localVariable_3 = match.getObject("packageDeclaration");
		EObject _localVariable_4 = match.getObject("step");
		EObject _localVariable_5 = match.getObject("alt");
		EObject _localVariable_6 = match.getObject("altFlow");
		EObject tmpActor = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpPackageDeclaration = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpAlt = _localVariable_5;
		EObject tmpAltFlow = _localVariable_6;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpPackageDeclaration instanceof PackageDeclaration) {
						PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpAlt instanceof AlternativeFlowAlternative) {
								AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
								if (tmpAltFlow instanceof AlternativeFlow) {
									AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
									return new Object[] { actor, flow, useCase,
											packageDeclaration, step, alt,
											altFlow, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_2_2_blackBFFBBFBBBBB(
			Actor actor, BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FlowToInteractionFragment flowToInteraction : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow,
						FlowToInteractionFragment.class, "source")) {
			InteractionFragment tmpInteraction = flowToInteraction.getTarget();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
						.getOppositeReferenceTyped(useCase,
								UseCaseToInteraction.class, "source")) {
					if (interaction.equals(useCaseToInteraction.getTarget())) {
						_result.add(new Object[] { actor, interaction,
								flowToInteraction, flow, useCase,
								useCaseToInteraction, packageDeclaration, step,
								alt, altFlow, match });
					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_2_3_blackBFBBBBBBBBB(
			Actor actor, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.equals(flowToInteraction.getSource())) {
			if (interaction.equals(flowToInteraction.getTarget())) {
				if (useCase.getFlows().contains(flow)) {
					if (useCase.equals(useCaseToInteraction.getSource())) {
						if (interaction
								.equals(useCaseToInteraction.getTarget())) {
							if (flow.getSteps().contains(step)) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									if (packageDeclaration.getActors()
											.contains(actor)) {
										if (step.getStepAlternative().contains(
												alt)) {
											if (actor.equals(step.getActor())) {
												if (altFlow
														.equals(alt.getRef())) {
													for (Lifeline line : interaction
															.getLifeline()) {
														_result.add(new Object[] {
																actor,
																line,
																interaction,
																flowToInteraction,
																flow,
																useCase,
																useCaseToInteraction,
																packageDeclaration,
																step, alt,
																altFlow });
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge flowToInteraction__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(altFlow);
		flowToInteraction__flow____source.setSrc(flowToInteraction);
		flowToInteraction__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__flow____source);
		flowToInteraction__interaction____target.setSrc(flowToInteraction);
		flowToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__interaction____target);
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
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				step__alt____stepAlternative);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(alt__altFlow____ref);
		flowToInteraction__flow____source
				.setName(flowToInteraction__flow____source_name_prime);
		flowToInteraction__interaction____target
				.setName(flowToInteraction__interaction____target_name_prime);
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
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		return new Object[] { actor, line, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, packageDeclaration, step,
				alt, altFlow, isApplicableMatch,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_4_bindingFBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, line, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, packageDeclaration, step,
				alt, altFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					interaction, flowToInteraction, flow, useCase,
					useCaseToInteraction, packageDeclaration, step, alt,
					altFlow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_4_bindingAndBlackFBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		Object[] result_pattern_AltSysStepBFToComboRule_2_4_binding = pattern_AltSysStepBFToComboRule_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, interaction,
				flowToInteraction, flow, useCase, useCaseToInteraction,
				packageDeclaration, step, alt, altFlow);
		if (result_pattern_AltSysStepBFToComboRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_2_4_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_2_4_black = pattern_AltSysStepBFToComboRule_2_4_blackB(csp);
			if (result_pattern_AltSysStepBFToComboRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, interaction, flowToInteraction, flow, useCase,
						useCaseToInteraction, packageDeclaration, step, alt,
						altFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_2_5_expressionFBB(
			AltSysStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltSysStepBFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltSysStepBFToComboRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_1_blackBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { _this, match, line, messageSend, interaction,
					combo, messageReceive, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_2_bindingFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, line, messageSend,
					interaction, combo, messageReceive, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_2_bindingAndBlackFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		Object[] result_pattern_AltSysStepBFToComboRule_10_2_binding = pattern_AltSysStepBFToComboRule_10_2_bindingFBBBBBBBBBB(
				_this, match, line, messageSend, interaction, combo,
				messageReceive, operand, guard, spec);
		if (result_pattern_AltSysStepBFToComboRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_10_2_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_10_2_black = pattern_AltSysStepBFToComboRule_10_2_blackB(csp);
			if (result_pattern_AltSysStepBFToComboRule_10_2_black != null) {

				return new Object[] { csp, _this, match, line, messageSend,
						interaction, combo, messageReceive, operand, guard,
						spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_10_3_expressionFBB(
			AltSysStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_4_blackBBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, interaction, combo,
					messageReceive, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_4_greenBBBBBBBBBFFFFFFFFFFFFFFF(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(messageSend);
		match.getToBeTranslatedNodes().add(combo);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(operand);
		match.getToBeTranslatedNodes().add(guard);
		match.getToBeTranslatedNodes().add(spec);
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String combo__operand____operand_name_prime = "operand";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageSend__line____covered);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		match.getToBeTranslatedEdges().add(interaction__combo____fragment);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		match.getToBeTranslatedEdges()
				.add(interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				interaction__messageReceive____fragment);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		match.getToBeTranslatedEdges().add(combo__operand____operand);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		match.getToBeTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(combo__line____covered);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		match.getToBeTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(operand__line____covered);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		match.getToBeTranslatedEdges().add(operand__guard____guard);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		match.getToBeTranslatedEdges().add(guard__spec____specification);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { match, line, messageSend, interaction, combo,
				messageReceive, operand, guard, spec,
				line__messageSend____coveredBy, messageSend__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				combo__operand____operand, line__combo____coveredBy,
				combo__line____covered, line__operand____coveredBy,
				operand__line____covered, operand__guard____guard,
				guard__spec____specification };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_5_blackBBBBBBBBB(
			Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { match, line, messageSend, interaction, combo,
					messageReceive, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_10_5_greenBBBFF(
			Match match, Lifeline line, Interaction interaction) {
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(line);
		match.getContextNodes().add(interaction);
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
		return new Object[] { match, line, interaction,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_AltSysStepBFToComboRule_10_6_expressionBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		_this.registerObjectsToMatch_BWD(match, line, messageSend, interaction,
				combo, messageReceive, operand, guard, spec);

	}

	public static final boolean pattern_AltSysStepBFToComboRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_1_bindingFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("line");
		EObject _localVariable_2 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_3 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_4 = isApplicableMatch.getObject("combo");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_11 = isApplicableMatch.getObject("operand");
		EObject _localVariable_12 = isApplicableMatch.getObject("guard");
		EObject _localVariable_13 = isApplicableMatch.getObject("spec");
		EObject tmpActor = _localVariable_0;
		EObject tmpLine = _localVariable_1;
		EObject tmpMessageSend = _localVariable_2;
		EObject tmpInteraction = _localVariable_3;
		EObject tmpCombo = _localVariable_4;
		EObject tmpFlowToInteraction = _localVariable_5;
		EObject tmpMessageReceive = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpUseCase = _localVariable_8;
		EObject tmpUseCaseToInteraction = _localVariable_9;
		EObject tmpPackageDeclaration = _localVariable_10;
		EObject tmpOperand = _localVariable_11;
		EObject tmpGuard = _localVariable_12;
		EObject tmpSpec = _localVariable_13;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
					if (tmpInteraction instanceof Interaction) {
						Interaction interaction = (Interaction) tmpInteraction;
						if (tmpCombo instanceof CombinedFragment) {
							CombinedFragment combo = (CombinedFragment) tmpCombo;
							if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
								FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (tmpFlow instanceof BasicFlow) {
										BasicFlow flow = (BasicFlow) tmpFlow;
										if (tmpUseCase instanceof UseCase) {
											UseCase useCase = (UseCase) tmpUseCase;
											if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
												UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
												if (tmpPackageDeclaration instanceof PackageDeclaration) {
													PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
													if (tmpOperand instanceof InteractionOperand) {
														InteractionOperand operand = (InteractionOperand) tmpOperand;
														if (tmpGuard instanceof InteractionConstraint) {
															InteractionConstraint guard = (InteractionConstraint) tmpGuard;
															if (tmpSpec instanceof LiteralString) {
																LiteralString spec = (LiteralString) tmpSpec;
																return new Object[] {
																		actor,
																		line,
																		messageSend,
																		interaction,
																		combo,
																		flowToInteraction,
																		messageReceive,
																		flow,
																		useCase,
																		useCaseToInteraction,
																		packageDeclaration,
																		operand,
																		guard,
																		spec,
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

	public static final Object[] pattern_AltSysStepBFToComboRule_11_1_blackBBBBBBBBBBBBBBFBB(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec,
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		if (!messageReceive.equals(messageSend)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { actor, line, messageSend,
							interaction, combo, flowToInteraction,
							messageReceive, flow, useCase,
							useCaseToInteraction, packageDeclaration, operand,
							guard, spec, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AltSysStepBFToComboRule_11_1_binding = pattern_AltSysStepBFToComboRule_11_1_bindingFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_AltSysStepBFToComboRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_AltSysStepBFToComboRule_11_1_binding[0];
			Lifeline line = (Lifeline) result_pattern_AltSysStepBFToComboRule_11_1_binding[1];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_AltSysStepBFToComboRule_11_1_binding[2];
			Interaction interaction = (Interaction) result_pattern_AltSysStepBFToComboRule_11_1_binding[3];
			CombinedFragment combo = (CombinedFragment) result_pattern_AltSysStepBFToComboRule_11_1_binding[4];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_AltSysStepBFToComboRule_11_1_binding[5];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_AltSysStepBFToComboRule_11_1_binding[6];
			BasicFlow flow = (BasicFlow) result_pattern_AltSysStepBFToComboRule_11_1_binding[7];
			UseCase useCase = (UseCase) result_pattern_AltSysStepBFToComboRule_11_1_binding[8];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_AltSysStepBFToComboRule_11_1_binding[9];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_AltSysStepBFToComboRule_11_1_binding[10];
			InteractionOperand operand = (InteractionOperand) result_pattern_AltSysStepBFToComboRule_11_1_binding[11];
			InteractionConstraint guard = (InteractionConstraint) result_pattern_AltSysStepBFToComboRule_11_1_binding[12];
			LiteralString spec = (LiteralString) result_pattern_AltSysStepBFToComboRule_11_1_binding[13];

			Object[] result_pattern_AltSysStepBFToComboRule_11_1_black = pattern_AltSysStepBFToComboRule_11_1_blackBBBBBBBBBBBBBBFBB(
					actor, line, messageSend, interaction, combo,
					flowToInteraction, messageReceive, flow, useCase,
					useCaseToInteraction, packageDeclaration, operand, guard,
					spec, _this, isApplicableMatch);
			if (result_pattern_AltSysStepBFToComboRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_11_1_black[14];

				return new Object[] { actor, line, messageSend, interaction,
						combo, flowToInteraction, messageReceive, flow,
						useCase, useCaseToInteraction, packageDeclaration,
						operand, guard, spec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_1_greenBBBFFFBFFFB(
			Actor actor, CombinedFragment combo, BasicFlow flow,
			InteractionOperand operand, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		StepAlternativeToInteractionOperand alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		AlternativeFlow altFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("alt", "condition");
		Object _localVariable_2 = csp.getValue("altFlow", "name");
		flow.getSteps().add(step);
		step.setActor(actor);
		step.getStepAlternative().add(alt);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		alternative1ToOperand.setSource(alt);
		alternative1ToOperand.setTarget(operand);
		alt.setRef(altFlow);
		altFlowToOperand.setSource(altFlow);
		altFlowToOperand.setTarget(operand);
		StepType step_type_prime = (StepType) _localVariable_0;
		String alt_condition_prime = (String) _localVariable_1;
		String altFlow_name_prime = (String) _localVariable_2;
		step.setType(step_type_prime);
		alt.setCondition(alt_condition_prime);
		altFlow.setName(altFlow_name_prime);
		return new Object[] { actor, combo, flow, step, alt, stepToCombo,
				operand, alternative1ToOperand, altFlow, altFlowToOperand, csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_2_blackBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, combo, messageReceive, step,
					alt, stepToCombo, operand, alternative1ToOperand, guard,
					spec, altFlow, altFlowToOperand };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_2_greenFBBBBBBBBBBBB(
			MessageOccurrenceSpecification messageSend, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			AlternativeFlowAlternative alt,
			NormalStepToCombinedFragment stepToCombo,
			InteractionOperand operand,
			StepAlternativeToInteractionOperand alternative1ToOperand,
			InteractionConstraint guard, LiteralString spec,
			AlternativeFlow altFlow, FlowToInteractionFragment altFlowToOperand) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(combo);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(stepToCombo);
		ruleresult.getTranslatedElements().add(operand);
		ruleresult.getCreatedLinkElements().add(alternative1ToOperand);
		ruleresult.getTranslatedElements().add(guard);
		ruleresult.getTranslatedElements().add(spec);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedLinkElements().add(altFlowToOperand);
		return new Object[] { ruleresult, messageSend, combo, messageReceive,
				step, alt, stepToCombo, operand, alternative1ToOperand, guard,
				spec, altFlow, altFlowToOperand };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_11_3_blackBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject combo,
			EObject flowToInteraction, EObject messageReceive, EObject flow,
			EObject useCase, EObject useCaseToInteraction,
			EObject packageDeclaration, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		if (!actor.equals(line)) {
			if (!actor.equals(messageSend)) {
				if (!actor.equals(interaction)) {
					if (!actor.equals(combo)) {
						if (!actor.equals(flowToInteraction)) {
							if (!actor.equals(messageReceive)) {
								if (!actor.equals(flow)) {
									if (!actor.equals(useCase)) {
										if (!actor.equals(useCaseToInteraction)) {
											if (!actor
													.equals(packageDeclaration)) {
												if (!actor.equals(step)) {
													if (!actor.equals(alt)) {
														if (!actor
																.equals(stepToCombo)) {
															if (!actor
																	.equals(operand)) {
																if (!actor
																		.equals(alternative1ToOperand)) {
																	if (!actor
																			.equals(guard)) {
																		if (!actor
																				.equals(spec)) {
																			if (!actor
																					.equals(altFlow)) {
																				if (!actor
																						.equals(altFlowToOperand)) {
																					if (!line
																							.equals(messageSend)) {
																						if (!line
																								.equals(messageReceive)) {
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
																												if (!line
																														.equals(operand)) {
																													if (!line
																															.equals(spec)) {
																														if (!messageSend
																																.equals(useCase)) {
																															if (!messageSend
																																	.equals(useCaseToInteraction)) {
																																if (!messageSend
																																		.equals(packageDeclaration)) {
																																	if (!messageSend
																																			.equals(step)) {
																																		if (!messageSend
																																				.equals(stepToCombo)) {
																																			if (!messageSend
																																					.equals(operand)) {
																																				if (!messageSend
																																						.equals(spec)) {
																																					if (!interaction
																																							.equals(line)) {
																																						if (!interaction
																																								.equals(messageSend)) {
																																							if (!interaction
																																									.equals(messageReceive)) {
																																								if (!interaction
																																										.equals(useCase)) {
																																									if (!interaction
																																											.equals(useCaseToInteraction)) {
																																										if (!interaction
																																												.equals(packageDeclaration)) {
																																											if (!interaction
																																													.equals(step)) {
																																												if (!interaction
																																														.equals(stepToCombo)) {
																																													if (!interaction
																																															.equals(operand)) {
																																														if (!interaction
																																																.equals(spec)) {
																																															if (!combo
																																																	.equals(line)) {
																																																if (!combo
																																																		.equals(messageSend)) {
																																																	if (!combo
																																																			.equals(interaction)) {
																																																		if (!combo
																																																				.equals(flowToInteraction)) {
																																																			if (!combo
																																																					.equals(messageReceive)) {
																																																				if (!combo
																																																						.equals(flow)) {
																																																					if (!combo
																																																							.equals(useCase)) {
																																																						if (!combo
																																																								.equals(useCaseToInteraction)) {
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
																																																													if (!flowToInteraction
																																																															.equals(line)) {
																																																														if (!flowToInteraction
																																																																.equals(messageSend)) {
																																																															if (!flowToInteraction
																																																																	.equals(interaction)) {
																																																																if (!flowToInteraction
																																																																		.equals(messageReceive)) {
																																																																	if (!flowToInteraction
																																																																			.equals(useCase)) {
																																																																		if (!flowToInteraction
																																																																				.equals(useCaseToInteraction)) {
																																																																			if (!flowToInteraction
																																																																					.equals(packageDeclaration)) {
																																																																				if (!flowToInteraction
																																																																						.equals(step)) {
																																																																					if (!flowToInteraction
																																																																							.equals(stepToCombo)) {
																																																																						if (!flowToInteraction
																																																																								.equals(operand)) {
																																																																							if (!flowToInteraction
																																																																									.equals(guard)) {
																																																																								if (!flowToInteraction
																																																																										.equals(spec)) {
																																																																									if (!messageReceive
																																																																											.equals(messageSend)) {
																																																																										if (!messageReceive
																																																																												.equals(useCase)) {
																																																																											if (!messageReceive
																																																																													.equals(useCaseToInteraction)) {
																																																																												if (!messageReceive
																																																																														.equals(packageDeclaration)) {
																																																																													if (!messageReceive
																																																																															.equals(step)) {
																																																																														if (!messageReceive
																																																																																.equals(stepToCombo)) {
																																																																															if (!messageReceive
																																																																																	.equals(operand)) {
																																																																																if (!messageReceive
																																																																																		.equals(spec)) {
																																																																																	if (!flow
																																																																																			.equals(line)) {
																																																																																		if (!flow
																																																																																				.equals(messageSend)) {
																																																																																			if (!flow
																																																																																					.equals(interaction)) {
																																																																																				if (!flow
																																																																																						.equals(flowToInteraction)) {
																																																																																					if (!flow
																																																																																							.equals(messageReceive)) {
																																																																																						if (!flow
																																																																																								.equals(useCase)) {
																																																																																							if (!flow
																																																																																									.equals(useCaseToInteraction)) {
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
																																																																																														if (!useCase
																																																																																																.equals(useCaseToInteraction)) {
																																																																																															if (!packageDeclaration
																																																																																																	.equals(useCase)) {
																																																																																																if (!packageDeclaration
																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																	if (!packageDeclaration
																																																																																																			.equals(step)) {
																																																																																																		if (!packageDeclaration
																																																																																																				.equals(stepToCombo)) {
																																																																																																			if (!packageDeclaration
																																																																																																					.equals(spec)) {
																																																																																																				if (!step
																																																																																																						.equals(useCase)) {
																																																																																																					if (!step
																																																																																																							.equals(useCaseToInteraction)) {
																																																																																																						if (!step
																																																																																																								.equals(stepToCombo)) {
																																																																																																							if (!alt.equals(line)) {
																																																																																																								if (!alt.equals(messageSend)) {
																																																																																																									if (!alt.equals(interaction)) {
																																																																																																										if (!alt.equals(combo)) {
																																																																																																											if (!alt.equals(flowToInteraction)) {
																																																																																																												if (!alt.equals(messageReceive)) {
																																																																																																													if (!alt.equals(flow)) {
																																																																																																														if (!alt.equals(useCase)) {
																																																																																																															if (!alt.equals(useCaseToInteraction)) {
																																																																																																																if (!alt.equals(packageDeclaration)) {
																																																																																																																	if (!alt.equals(step)) {
																																																																																																																		if (!alt.equals(stepToCombo)) {
																																																																																																																			if (!alt.equals(operand)) {
																																																																																																																				if (!alt.equals(alternative1ToOperand)) {
																																																																																																																					if (!alt.equals(guard)) {
																																																																																																																						if (!alt.equals(spec)) {
																																																																																																																							if (!alt.equals(altFlow)) {
																																																																																																																								if (!alt.equals(altFlowToOperand)) {
																																																																																																																									if (!stepToCombo
																																																																																																																											.equals(useCase)) {
																																																																																																																										if (!stepToCombo
																																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																																											if (!operand
																																																																																																																													.equals(useCase)) {
																																																																																																																												if (!operand
																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																													if (!operand
																																																																																																																															.equals(packageDeclaration)) {
																																																																																																																														if (!operand
																																																																																																																																.equals(step)) {
																																																																																																																															if (!operand
																																																																																																																																	.equals(stepToCombo)) {
																																																																																																																																if (!operand
																																																																																																																																		.equals(spec)) {
																																																																																																																																	if (!alternative1ToOperand
																																																																																																																																			.equals(line)) {
																																																																																																																																		if (!alternative1ToOperand
																																																																																																																																				.equals(messageSend)) {
																																																																																																																																			if (!alternative1ToOperand
																																																																																																																																					.equals(interaction)) {
																																																																																																																																				if (!alternative1ToOperand
																																																																																																																																						.equals(combo)) {
																																																																																																																																					if (!alternative1ToOperand
																																																																																																																																							.equals(flowToInteraction)) {
																																																																																																																																						if (!alternative1ToOperand
																																																																																																																																								.equals(messageReceive)) {
																																																																																																																																							if (!alternative1ToOperand
																																																																																																																																									.equals(flow)) {
																																																																																																																																								if (!alternative1ToOperand
																																																																																																																																										.equals(useCase)) {
																																																																																																																																									if (!alternative1ToOperand
																																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																																										if (!alternative1ToOperand
																																																																																																																																												.equals(packageDeclaration)) {
																																																																																																																																											if (!alternative1ToOperand
																																																																																																																																													.equals(step)) {
																																																																																																																																												if (!alternative1ToOperand
																																																																																																																																														.equals(stepToCombo)) {
																																																																																																																																													if (!alternative1ToOperand
																																																																																																																																															.equals(operand)) {
																																																																																																																																														if (!alternative1ToOperand
																																																																																																																																																.equals(guard)) {
																																																																																																																																															if (!alternative1ToOperand
																																																																																																																																																	.equals(spec)) {
																																																																																																																																																if (!guard
																																																																																																																																																		.equals(line)) {
																																																																																																																																																	if (!guard
																																																																																																																																																			.equals(messageSend)) {
																																																																																																																																																		if (!guard
																																																																																																																																																				.equals(interaction)) {
																																																																																																																																																			if (!guard
																																																																																																																																																					.equals(messageReceive)) {
																																																																																																																																																				if (!guard
																																																																																																																																																						.equals(useCase)) {
																																																																																																																																																					if (!guard
																																																																																																																																																							.equals(useCaseToInteraction)) {
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
																																																																																																																																																											if (!spec
																																																																																																																																																													.equals(useCase)) {
																																																																																																																																																												if (!spec
																																																																																																																																																														.equals(useCaseToInteraction)) {
																																																																																																																																																													if (!spec
																																																																																																																																																															.equals(step)) {
																																																																																																																																																														if (!spec
																																																																																																																																																																.equals(stepToCombo)) {
																																																																																																																																																															if (!altFlow
																																																																																																																																																																	.equals(line)) {
																																																																																																																																																																if (!altFlow
																																																																																																																																																																		.equals(messageSend)) {
																																																																																																																																																																	if (!altFlow
																																																																																																																																																																			.equals(interaction)) {
																																																																																																																																																																		if (!altFlow
																																																																																																																																																																				.equals(combo)) {
																																																																																																																																																																			if (!altFlow
																																																																																																																																																																					.equals(flowToInteraction)) {
																																																																																																																																																																				if (!altFlow
																																																																																																																																																																						.equals(messageReceive)) {
																																																																																																																																																																					if (!altFlow
																																																																																																																																																																							.equals(flow)) {
																																																																																																																																																																						if (!altFlow
																																																																																																																																																																								.equals(useCase)) {
																																																																																																																																																																							if (!altFlow
																																																																																																																																																																									.equals(useCaseToInteraction)) {
																																																																																																																																																																								if (!altFlow
																																																																																																																																																																										.equals(packageDeclaration)) {
																																																																																																																																																																									if (!altFlow
																																																																																																																																																																											.equals(step)) {
																																																																																																																																																																										if (!altFlow
																																																																																																																																																																												.equals(stepToCombo)) {
																																																																																																																																																																											if (!altFlow
																																																																																																																																																																													.equals(operand)) {
																																																																																																																																																																												if (!altFlow
																																																																																																																																																																														.equals(alternative1ToOperand)) {
																																																																																																																																																																													if (!altFlow
																																																																																																																																																																															.equals(guard)) {
																																																																																																																																																																														if (!altFlow
																																																																																																																																																																																.equals(spec)) {
																																																																																																																																																																															if (!altFlow
																																																																																																																																																																																	.equals(altFlowToOperand)) {
																																																																																																																																																																																if (!altFlowToOperand
																																																																																																																																																																																		.equals(line)) {
																																																																																																																																																																																	if (!altFlowToOperand
																																																																																																																																																																																			.equals(messageSend)) {
																																																																																																																																																																																		if (!altFlowToOperand
																																																																																																																																																																																				.equals(interaction)) {
																																																																																																																																																																																			if (!altFlowToOperand
																																																																																																																																																																																					.equals(combo)) {
																																																																																																																																																																																				if (!altFlowToOperand
																																																																																																																																																																																						.equals(flowToInteraction)) {
																																																																																																																																																																																					if (!altFlowToOperand
																																																																																																																																																																																							.equals(messageReceive)) {
																																																																																																																																																																																						if (!altFlowToOperand
																																																																																																																																																																																								.equals(flow)) {
																																																																																																																																																																																							if (!altFlowToOperand
																																																																																																																																																																																									.equals(useCase)) {
																																																																																																																																																																																								if (!altFlowToOperand
																																																																																																																																																																																										.equals(useCaseToInteraction)) {
																																																																																																																																																																																									if (!altFlowToOperand
																																																																																																																																																																																											.equals(packageDeclaration)) {
																																																																																																																																																																																										if (!altFlowToOperand
																																																																																																																																																																																												.equals(step)) {
																																																																																																																																																																																											if (!altFlowToOperand
																																																																																																																																																																																													.equals(stepToCombo)) {
																																																																																																																																																																																												if (!altFlowToOperand
																																																																																																																																																																																														.equals(operand)) {
																																																																																																																																																																																													if (!altFlowToOperand
																																																																																																																																																																																															.equals(alternative1ToOperand)) {
																																																																																																																																																																																														if (!altFlowToOperand
																																																																																																																																																																																																.equals(guard)) {
																																																																																																																																																																																															if (!altFlowToOperand
																																																																																																																																																																																																	.equals(spec)) {
																																																																																																																																																																																																return new Object[] {
																																																																																																																																																																																																		ruleresult,
																																																																																																																																																																																																		actor,
																																																																																																																																																																																																		line,
																																																																																																																																																																																																		messageSend,
																																																																																																																																																																																																		interaction,
																																																																																																																																																																																																		combo,
																																																																																																																																																																																																		flowToInteraction,
																																																																																																																																																																																																		messageReceive,
																																																																																																																																																																																																		flow,
																																																																																																																																																																																																		useCase,
																																																																																																																																																																																																		useCaseToInteraction,
																																																																																																																																																																																																		packageDeclaration,
																																																																																																																																																																																																		step,
																																																																																																																																																																																																		alt,
																																																																																																																																																																																																		stepToCombo,
																																																																																																																																																																																																		operand,
																																																																																																																																																																																																		alternative1ToOperand,
																																																																																																																																																																																																		guard,
																																																																																																																																																																																																		spec,
																																																																																																																																																																																																		altFlow,
																																																																																																																																																																																																		altFlowToOperand };
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_11_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject line,
			EObject messageSend, EObject interaction, EObject combo,
			EObject messageReceive, EObject flow, EObject step, EObject alt,
			EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__step____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge stepToCombo__combo____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alternative1ToOperand__alt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alternative1ToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__altFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge altFlowToOperand__operand____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AltSysStepBFToComboRule";
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String flow__step____steps_name_prime = "steps";
		String step__alt____stepAlternative_name_prime = "stepAlternative";
		String step__actor____actor_name_prime = "actor";
		String alt__altFlow____ref_name_prime = "ref";
		String combo__operand____operand_name_prime = "operand";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String stepToCombo__step____source_name_prime = "source";
		String stepToCombo__combo____target_name_prime = "target";
		String operand__guard____guard_name_prime = "guard";
		String alternative1ToOperand__alt____source_name_prime = "source";
		String alternative1ToOperand__operand____target_name_prime = "target";
		String guard__spec____specification_name_prime = "specification";
		String altFlowToOperand__altFlow____source_name_prime = "source";
		String altFlowToOperand__operand____target_name_prime = "target";
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageSend__line____covered);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		ruleresult.getTranslatedEdges().add(interaction__combo____fragment);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(
				interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				interaction__messageReceive____fragment);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		step__alt____stepAlternative.setSrc(step);
		step__alt____stepAlternative.setTrg(alt);
		ruleresult.getCreatedEdges().add(step__alt____stepAlternative);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(step__actor____actor);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(alt__altFlow____ref);
		combo__operand____operand.setSrc(combo);
		combo__operand____operand.setTrg(operand);
		ruleresult.getTranslatedEdges().add(combo__operand____operand);
		line__combo____coveredBy.setSrc(line);
		line__combo____coveredBy.setTrg(combo);
		ruleresult.getTranslatedEdges().add(line__combo____coveredBy);
		combo__line____covered.setSrc(combo);
		combo__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(combo__line____covered);
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		ruleresult.getTranslatedEdges().add(line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(operand__line____covered);
		stepToCombo__step____source.setSrc(stepToCombo);
		stepToCombo__step____source.setTrg(step);
		ruleresult.getCreatedEdges().add(stepToCombo__step____source);
		stepToCombo__combo____target.setSrc(stepToCombo);
		stepToCombo__combo____target.setTrg(combo);
		ruleresult.getCreatedEdges().add(stepToCombo__combo____target);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		ruleresult.getTranslatedEdges().add(operand__guard____guard);
		alternative1ToOperand__alt____source.setSrc(alternative1ToOperand);
		alternative1ToOperand__alt____source.setTrg(alt);
		ruleresult.getCreatedEdges().add(alternative1ToOperand__alt____source);
		alternative1ToOperand__operand____target.setSrc(alternative1ToOperand);
		alternative1ToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(
				alternative1ToOperand__operand____target);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		ruleresult.getTranslatedEdges().add(guard__spec____specification);
		altFlowToOperand__altFlow____source.setSrc(altFlowToOperand);
		altFlowToOperand__altFlow____source.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(altFlowToOperand__altFlow____source);
		altFlowToOperand__operand____target.setSrc(altFlowToOperand);
		altFlowToOperand__operand____target.setTrg(operand);
		ruleresult.getCreatedEdges().add(altFlowToOperand__operand____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__alt____stepAlternative
				.setName(step__alt____stepAlternative_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		stepToCombo__step____source
				.setName(stepToCombo__step____source_name_prime);
		stepToCombo__combo____target
				.setName(stepToCombo__combo____target_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		alternative1ToOperand__alt____source
				.setName(alternative1ToOperand__alt____source_name_prime);
		alternative1ToOperand__operand____target
				.setName(alternative1ToOperand__operand____target_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		altFlowToOperand__altFlow____source
				.setName(altFlowToOperand__altFlow____source_name_prime);
		altFlowToOperand__operand____target
				.setName(altFlowToOperand__operand____target_name_prime);
		return new Object[] { ruleresult, actor, line, messageSend,
				interaction, combo, messageReceive, flow, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand, line__messageSend____coveredBy,
				messageSend__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment, flow__step____steps,
				step__alt____stepAlternative, step__actor____actor,
				alt__altFlow____ref, combo__operand____operand,
				line__combo____coveredBy, combo__line____covered,
				line__operand____coveredBy, operand__line____covered,
				stepToCombo__step____source, stepToCombo__combo____target,
				operand__guard____guard, alternative1ToOperand__alt____source,
				alternative1ToOperand__operand____target,
				guard__spec____specification,
				altFlowToOperand__altFlow____source,
				altFlowToOperand__operand____target };
	}

	public static final void pattern_AltSysStepBFToComboRule_11_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject line, EObject messageSend,
			EObject interaction, EObject combo, EObject flowToInteraction,
			EObject messageReceive, EObject flow, EObject useCase,
			EObject useCaseToInteraction, EObject packageDeclaration,
			EObject step, EObject alt, EObject stepToCombo, EObject operand,
			EObject alternative1ToOperand, EObject guard, EObject spec,
			EObject altFlow, EObject altFlowToOperand) {
		_this.registerObjects_BWD(ruleresult, actor, line, messageSend,
				interaction, combo, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, packageDeclaration, step, alt,
				stepToCombo, operand, alternative1ToOperand, guard, spec,
				altFlow, altFlowToOperand);

	}

	public static final PerformRuleResult pattern_AltSysStepBFToComboRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_1_blackFBB(
			EClass eClass, AltSysStepBFToComboRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_12_1_binding = pattern_AltSysStepBFToComboRule_12_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_AltSysStepBFToComboRule_12_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_12_1_black = pattern_AltSysStepBFToComboRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AltSysStepBFToComboRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_2_bindingFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("line");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("interaction");
		EObject _localVariable_3 = match.getObject("combo");
		EObject _localVariable_4 = match.getObject("messageReceive");
		EObject _localVariable_5 = match.getObject("operand");
		EObject _localVariable_6 = match.getObject("guard");
		EObject _localVariable_7 = match.getObject("spec");
		EObject tmpLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		EObject tmpCombo = _localVariable_3;
		EObject tmpMessageReceive = _localVariable_4;
		EObject tmpOperand = _localVariable_5;
		EObject tmpGuard = _localVariable_6;
		EObject tmpSpec = _localVariable_7;
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					if (tmpCombo instanceof CombinedFragment) {
						CombinedFragment combo = (CombinedFragment) tmpCombo;
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (tmpOperand instanceof InteractionOperand) {
								InteractionOperand operand = (InteractionOperand) tmpOperand;
								if (tmpGuard instanceof InteractionConstraint) {
									InteractionConstraint guard = (InteractionConstraint) tmpGuard;
									if (tmpSpec instanceof LiteralString) {
										LiteralString spec = (LiteralString) tmpSpec;
										return new Object[] { line,
												messageSend, interaction,
												combo, messageReceive, operand,
												guard, spec, match };
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

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_12_2_blackBBBBFBFFFBBBB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			for (FlowToInteractionFragment flowToInteraction : org.moflon.util.eMoflonEMFUtil
					.getOppositeReferenceTyped(interaction,
							FlowToInteractionFragment.class, "target")) {
				Flow tmpFlow = flowToInteraction.getSource();
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(interaction,
									UseCaseToInteraction.class, "target")) {
						UseCase useCase = useCaseToInteraction.getSource();
						if (useCase != null) {
							_result.add(new Object[] { line, messageSend,
									interaction, combo, flowToInteraction,
									messageReceive, flow, useCase,
									useCaseToInteraction, operand, guard, spec,
									match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_12_3_blackFBBBBBBBBBFBBB(
			Lifeline line, MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (line.getCoveredBy().contains(messageSend)) {
				if (interaction.equals(combo.getEnclosingInteraction())) {
					if (interaction.equals(messageSend
							.getEnclosingInteraction())) {
						if (interaction.equals(messageReceive
								.getEnclosingInteraction())) {
							if (flow.equals(flowToInteraction.getSource())) {
								if (interaction.equals(flowToInteraction
										.getTarget())) {
									if (interaction.equals(line
											.getInteraction())) {
										if (useCase.getFlows().contains(flow)) {
											if (useCase
													.equals(useCaseToInteraction
															.getSource())) {
												if (interaction
														.equals(useCaseToInteraction
																.getTarget())) {
													if (combo.getOperand()
															.contains(operand)) {
														if (line.getCoveredBy()
																.contains(combo)) {
															if (line.getCoveredBy()
																	.contains(
																			operand)) {
																if (guard
																		.equals(operand
																				.getGuard())) {
																	if (spec.equals(guard
																			.getSpecification())) {
																		for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						useCase,
																						PackageDeclaration.class,
																						"useCases")) {
																			for (Actor actor : packageDeclaration
																					.getActors()) {
																				_result.add(new Object[] {
																						actor,
																						line,
																						messageSend,
																						interaction,
																						combo,
																						flowToInteraction,
																						messageReceive,
																						flow,
																						useCase,
																						useCaseToInteraction,
																						packageDeclaration,
																						operand,
																						guard,
																						spec });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_12_3_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge line__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__combo____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
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
		EMoflonEdge combo__operand____operand = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__combo____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge combo__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__operand____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge operand__guard____guard = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge guard__spec____specification = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String line__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__line____covered_name_prime = "covered";
		String combo__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__combo____fragment_name_prime = "fragment";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCase__flow____flows_name_prime = "flows";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		String packageDeclaration__actor____actors_name_prime = "actors";
		String combo__operand____operand_name_prime = "operand";
		String line__combo____coveredBy_name_prime = "coveredBy";
		String combo__line____covered_name_prime = "covered";
		String line__operand____coveredBy_name_prime = "coveredBy";
		String operand__line____covered_name_prime = "covered";
		String operand__guard____guard_name_prime = "guard";
		String guard__spec____specification_name_prime = "specification";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(combo);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(operand);
		isApplicableMatch.getAllContextElements().add(guard);
		isApplicableMatch.getAllContextElements().add(spec);
		line__messageSend____coveredBy.setSrc(line);
		line__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				line__messageSend____coveredBy);
		messageSend__line____covered.setSrc(messageSend);
		messageSend__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageSend__line____covered);
		combo__interaction____enclosingInteraction.setSrc(combo);
		combo__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				combo__interaction____enclosingInteraction);
		interaction__combo____fragment.setSrc(interaction);
		interaction__combo____fragment.setTrg(combo);
		isApplicableMatch.getAllContextElements().add(
				interaction__combo____fragment);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				interaction__messageReceive____fragment);
		flowToInteraction__flow____source.setSrc(flowToInteraction);
		flowToInteraction__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__flow____source);
		flowToInteraction__interaction____target.setSrc(flowToInteraction);
		flowToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__interaction____target);
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
		line__operand____coveredBy.setSrc(line);
		line__operand____coveredBy.setTrg(operand);
		isApplicableMatch.getAllContextElements().add(
				line__operand____coveredBy);
		operand__line____covered.setSrc(operand);
		operand__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(operand__line____covered);
		operand__guard____guard.setSrc(operand);
		operand__guard____guard.setTrg(guard);
		isApplicableMatch.getAllContextElements().add(operand__guard____guard);
		guard__spec____specification.setSrc(guard);
		guard__spec____specification.setTrg(spec);
		isApplicableMatch.getAllContextElements().add(
				guard__spec____specification);
		line__messageSend____coveredBy
				.setName(line__messageSend____coveredBy_name_prime);
		messageSend__line____covered
				.setName(messageSend__line____covered_name_prime);
		combo__interaction____enclosingInteraction
				.setName(combo__interaction____enclosingInteraction_name_prime);
		interaction__combo____fragment
				.setName(interaction__combo____fragment_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		flowToInteraction__flow____source
				.setName(flowToInteraction__flow____source_name_prime);
		flowToInteraction__interaction____target
				.setName(flowToInteraction__interaction____target_name_prime);
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
		combo__operand____operand.setName(combo__operand____operand_name_prime);
		line__combo____coveredBy.setName(line__combo____coveredBy_name_prime);
		combo__line____covered.setName(combo__line____covered_name_prime);
		line__operand____coveredBy
				.setName(line__operand____coveredBy_name_prime);
		operand__line____covered.setName(operand__line____covered_name_prime);
		operand__guard____guard.setName(operand__guard____guard_name_prime);
		guard__spec____specification
				.setName(guard__spec____specification_name_prime);
		return new Object[] { actor, line, messageSend, interaction, combo,
				flowToInteraction, messageReceive, flow, useCase,
				useCaseToInteraction, packageDeclaration, operand, guard, spec,
				isApplicableMatch, line__messageSend____coveredBy,
				messageSend__line____covered,
				combo__interaction____enclosingInteraction,
				interaction__combo____fragment,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				line__interaction____interaction,
				interaction__line____lifeline, useCase__flow____flows,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				packageDeclaration__useCase____useCases,
				packageDeclaration__actor____actors, combo__operand____operand,
				line__combo____coveredBy, combo__line____covered,
				line__operand____coveredBy, operand__line____covered,
				operand__guard____guard, guard__spec____specification };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, line, messageSend, interaction,
				combo, flowToInteraction, messageReceive, flow, useCase,
				useCaseToInteraction, packageDeclaration, operand, guard, spec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					messageSend, interaction, combo, flowToInteraction,
					messageReceive, flow, useCase, useCaseToInteraction,
					packageDeclaration, operand, guard, spec };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			FlowToInteractionFragment flowToInteraction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration, InteractionOperand operand,
			InteractionConstraint guard, LiteralString spec) {
		Object[] result_pattern_AltSysStepBFToComboRule_12_4_binding = pattern_AltSysStepBFToComboRule_12_4_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, messageSend,
				interaction, combo, flowToInteraction, messageReceive, flow,
				useCase, useCaseToInteraction, packageDeclaration, operand,
				guard, spec);
		if (result_pattern_AltSysStepBFToComboRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_12_4_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_12_4_black = pattern_AltSysStepBFToComboRule_12_4_blackB(csp);
			if (result_pattern_AltSysStepBFToComboRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, messageSend, interaction, combo,
						flowToInteraction, messageReceive, flow, useCase,
						useCaseToInteraction, packageDeclaration, operand,
						guard, spec };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_12_5_expressionFBB(
			AltSysStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AltSysStepBFToComboRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AltSysStepBFToComboRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_20_1_binding = pattern_AltSysStepBFToComboRule_20_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_20_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_20_1_black = pattern_AltSysStepBFToComboRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_622407 = messageSend.getMessage();
		if (__DEC_messageSend_message_622407 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_866878 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_866878 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_327860 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_327860 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_327860)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_909648 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_909648)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_569692 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_569692)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_20_2_blackFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpMessageSend = _edge_coveredBy.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (line.getCoveredBy().contains(messageSend)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						if (interaction.equals(messageSend
								.getEnclosingInteraction())) {
							if (pattern_AltSysStepBFToComboRule_20_2_black_nac_0B(messageSend) == null) {
								for (InteractionFragment tmpCombo : line
										.getCoveredBy()) {
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (interaction.equals(combo
												.getEnclosingInteraction())) {
											for (InteractionFragment tmpOperand : line
													.getCoveredBy()) {
												if (tmpOperand instanceof InteractionOperand) {
													InteractionOperand operand = (InteractionOperand) tmpOperand;
													if (combo.getOperand()
															.contains(operand)) {
														InteractionConstraint guard = operand
																.getGuard();
														if (guard != null) {
															ValueSpecification tmpSpec = guard
																	.getSpecification();
															if (tmpSpec instanceof LiteralString) {
																LiteralString spec = (LiteralString) tmpSpec;
																if (pattern_AltSysStepBFToComboRule_20_2_black_nac_2BB(
																		operand,
																		interaction) == null) {
																	if (pattern_AltSysStepBFToComboRule_20_2_black_nac_3BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltSysStepBFToComboRule_20_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepBFToComboRule_20_2_black_nac_6BB(
																					operand,
																					combo) == null) {
																				if (pattern_AltSysStepBFToComboRule_20_2_black_nac_8BB(
																						operand,
																						interaction) == null) {
																					if (pattern_AltSysStepBFToComboRule_20_2_black_nac_4BB(
																							guard,
																							operand) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_20_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_20_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_20_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_20_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_21_1_binding = pattern_AltSysStepBFToComboRule_21_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_21_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_21_1_black = pattern_AltSysStepBFToComboRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_603132 = messageSend.getMessage();
		if (__DEC_messageSend_message_603132 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_714546 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_714546 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_342795 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_342795 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_342795)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_130192 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_130192)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_432422 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_432422)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_21_2_blackFFFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageSend)) {
					Interaction interaction = messageSend
							.getEnclosingInteraction();
					if (interaction != null) {
						if (interaction.equals(line.getInteraction())) {
							if (pattern_AltSysStepBFToComboRule_21_2_black_nac_0B(messageSend) == null) {
								for (InteractionFragment tmpCombo : line
										.getCoveredBy()) {
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (interaction.equals(combo
												.getEnclosingInteraction())) {
											for (InteractionFragment tmpOperand : line
													.getCoveredBy()) {
												if (tmpOperand instanceof InteractionOperand) {
													InteractionOperand operand = (InteractionOperand) tmpOperand;
													if (combo.getOperand()
															.contains(operand)) {
														InteractionConstraint guard = operand
																.getGuard();
														if (guard != null) {
															ValueSpecification tmpSpec = guard
																	.getSpecification();
															if (tmpSpec instanceof LiteralString) {
																LiteralString spec = (LiteralString) tmpSpec;
																if (pattern_AltSysStepBFToComboRule_21_2_black_nac_2BB(
																		operand,
																		interaction) == null) {
																	if (pattern_AltSysStepBFToComboRule_21_2_black_nac_3BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltSysStepBFToComboRule_21_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepBFToComboRule_21_2_black_nac_6BB(
																					operand,
																					combo) == null) {
																				if (pattern_AltSysStepBFToComboRule_21_2_black_nac_8BB(
																						operand,
																						interaction) == null) {
																					if (pattern_AltSysStepBFToComboRule_21_2_black_nac_4BB(
																							guard,
																							operand) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_21_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_21_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_21_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_21_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_22_1_binding = pattern_AltSysStepBFToComboRule_22_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_22_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_22_1_black = pattern_AltSysStepBFToComboRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_646811 = messageSend.getMessage();
		if (__DEC_messageSend_message_646811 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_292862 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_292862 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_356476 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_356476 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_356476)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_68406 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_68406)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_927471 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_927471)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_22_2_blackFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_enclosingInteraction.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					for (InteractionOperand operand : combo.getOperand()) {
						InteractionConstraint guard = operand.getGuard();
						if (guard != null) {
							ValueSpecification tmpSpec = guard
									.getSpecification();
							if (tmpSpec instanceof LiteralString) {
								LiteralString spec = (LiteralString) tmpSpec;
								if (pattern_AltSysStepBFToComboRule_22_2_black_nac_2BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepBFToComboRule_22_2_black_nac_3BB(
											operand, combo) == null) {
										if (pattern_AltSysStepBFToComboRule_22_2_black_nac_6BB(
												operand, combo) == null) {
											if (pattern_AltSysStepBFToComboRule_22_2_black_nac_8BB(
													operand, interaction) == null) {
												if (pattern_AltSysStepBFToComboRule_22_2_black_nac_4BB(
														guard, operand) == null) {
													for (Lifeline line : combo
															.getCovered()) {
														if (interaction
																.equals(line
																		.getInteraction())) {
															if (line.getCoveredBy()
																	.contains(
																			operand)) {
																for (InteractionFragment tmpMessageSend : interaction
																		.getFragment()) {
																	if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																		if (line.getCoveredBy()
																				.contains(
																						messageSend)) {
																			if (pattern_AltSysStepBFToComboRule_22_2_black_nac_0B(messageSend) == null) {
																				if (pattern_AltSysStepBFToComboRule_22_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					for (InteractionFragment tmpMessageReceive : interaction
																							.getFragment()) {
																						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																							if (!messageReceive
																									.equals(messageSend)) {
																								if (pattern_AltSysStepBFToComboRule_22_2_black_nac_1B(messageReceive) == null) {
																									if (pattern_AltSysStepBFToComboRule_22_2_black_nac_7BB(
																											operand,
																											messageReceive) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
																												_edge_enclosingInteraction });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_22_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_22_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_23_1_binding = pattern_AltSysStepBFToComboRule_23_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_23_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_23_1_black = pattern_AltSysStepBFToComboRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_272314 = messageSend.getMessage();
		if (__DEC_messageSend_message_272314 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_130546 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_130546 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_698685 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_698685 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_698685)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_930315 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_930315)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_992594 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_992594)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_23_2_blackFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpCombo = _edge_fragment.getTrg();
			if (tmpCombo instanceof CombinedFragment) {
				CombinedFragment combo = (CombinedFragment) tmpCombo;
				if (interaction.equals(combo.getEnclosingInteraction())) {
					for (InteractionFragment tmpMessageSend : interaction
							.getFragment()) {
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							if (pattern_AltSysStepBFToComboRule_23_2_black_nac_0B(messageSend) == null) {
								for (InteractionFragment tmpMessageReceive : interaction
										.getFragment()) {
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltSysStepBFToComboRule_23_2_black_nac_1B(messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														if (line.getCoveredBy()
																.contains(combo)) {
															for (InteractionOperand operand : combo
																	.getOperand()) {
																if (line.getCoveredBy()
																		.contains(
																				operand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepBFToComboRule_23_2_black_nac_2BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepBFToComboRule_23_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_23_2_black_nac_5BB(
																							operand,
																							messageSend) == null) {
																						if (pattern_AltSysStepBFToComboRule_23_2_black_nac_6BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltSysStepBFToComboRule_23_2_black_nac_7BB(
																									operand,
																									messageReceive) == null) {
																								if (pattern_AltSysStepBFToComboRule_23_2_black_nac_8BB(
																										operand,
																										interaction) == null) {
																									if (pattern_AltSysStepBFToComboRule_23_2_black_nac_4BB(
																											guard,
																											operand) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
																												_edge_fragment });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_23_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_23_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_24_1_binding = pattern_AltSysStepBFToComboRule_24_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_24_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_24_1_black = pattern_AltSysStepBFToComboRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_846796 = messageSend.getMessage();
		if (__DEC_messageSend_message_846796 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_452650 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_452650 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_419921 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_419921 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_419921)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_139613 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_139613)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_931150 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_931150)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_24_2_blackFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingInteraction.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					if (pattern_AltSysStepBFToComboRule_24_2_black_nac_0B(messageSend) == null) {
						for (Lifeline line : messageSend.getCovered()) {
							if (interaction.equals(line.getInteraction())) {
								for (InteractionFragment tmpCombo : interaction
										.getFragment()) {
									if (tmpCombo instanceof CombinedFragment) {
										CombinedFragment combo = (CombinedFragment) tmpCombo;
										if (line.getCoveredBy().contains(combo)) {
											for (InteractionFragment tmpMessageReceive : interaction
													.getFragment()) {
												if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
													if (!messageReceive
															.equals(messageSend)) {
														if (pattern_AltSysStepBFToComboRule_24_2_black_nac_1B(messageReceive) == null) {
															for (InteractionFragment tmpOperand : line
																	.getCoveredBy()) {
																if (tmpOperand instanceof InteractionOperand) {
																	InteractionOperand operand = (InteractionOperand) tmpOperand;
																	if (combo
																			.getOperand()
																			.contains(
																					operand)) {
																		InteractionConstraint guard = operand
																				.getGuard();
																		if (guard != null) {
																			ValueSpecification tmpSpec = guard
																					.getSpecification();
																			if (tmpSpec instanceof LiteralString) {
																				LiteralString spec = (LiteralString) tmpSpec;
																				if (pattern_AltSysStepBFToComboRule_24_2_black_nac_2BB(
																						operand,
																						interaction) == null) {
																					if (pattern_AltSysStepBFToComboRule_24_2_black_nac_3BB(
																							operand,
																							combo) == null) {
																						if (pattern_AltSysStepBFToComboRule_24_2_black_nac_5BB(
																								operand,
																								messageSend) == null) {
																							if (pattern_AltSysStepBFToComboRule_24_2_black_nac_6BB(
																									operand,
																									combo) == null) {
																								if (pattern_AltSysStepBFToComboRule_24_2_black_nac_7BB(
																										operand,
																										messageReceive) == null) {
																									if (pattern_AltSysStepBFToComboRule_24_2_black_nac_8BB(
																											operand,
																											interaction) == null) {
																										if (pattern_AltSysStepBFToComboRule_24_2_black_nac_4BB(
																												guard,
																												operand) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
																													_edge_enclosingInteraction });
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}

																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_24_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_24_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_25_1_binding = pattern_AltSysStepBFToComboRule_25_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_25_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_25_1_black = pattern_AltSysStepBFToComboRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_255765 = messageSend.getMessage();
		if (__DEC_messageSend_message_255765 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_527629 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_527629 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_143364 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_143364 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_143364)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_809006 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_809006)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_510893 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_510893)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_25_2_blackFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					if (pattern_AltSysStepBFToComboRule_25_2_black_nac_0B(messageSend) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageReceive : interaction
										.getFragment()) {
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltSysStepBFToComboRule_25_2_black_nac_1B(messageReceive) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														if (line.getCoveredBy()
																.contains(combo)) {
															for (InteractionOperand operand : combo
																	.getOperand()) {
																if (line.getCoveredBy()
																		.contains(
																				operand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepBFToComboRule_25_2_black_nac_2BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepBFToComboRule_25_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_25_2_black_nac_5BB(
																							operand,
																							messageSend) == null) {
																						if (pattern_AltSysStepBFToComboRule_25_2_black_nac_6BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltSysStepBFToComboRule_25_2_black_nac_7BB(
																									operand,
																									messageReceive) == null) {
																								if (pattern_AltSysStepBFToComboRule_25_2_black_nac_8BB(
																										operand,
																										interaction) == null) {
																									if (pattern_AltSysStepBFToComboRule_25_2_black_nac_4BB(
																											guard,
																											operand) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
																												_edge_fragment });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_25_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_25_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_26_1_binding = pattern_AltSysStepBFToComboRule_26_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_26_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_26_1_black = pattern_AltSysStepBFToComboRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_123942 = messageSend.getMessage();
		if (__DEC_messageSend_message_123942 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_471450 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_471450 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_998863 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_998863 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_998863)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_824843 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_824843)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_488536 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_488536)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_26_2_blackFFFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_enclosingInteraction.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction
						.equals(messageReceive.getEnclosingInteraction())) {
					if (pattern_AltSysStepBFToComboRule_26_2_black_nac_1B(messageReceive) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageSend : interaction
										.getFragment()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltSysStepBFToComboRule_26_2_black_nac_0B(messageSend) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														if (line.getCoveredBy()
																.contains(combo)) {
															for (InteractionOperand operand : combo
																	.getOperand()) {
																if (line.getCoveredBy()
																		.contains(
																				operand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepBFToComboRule_26_2_black_nac_2BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepBFToComboRule_26_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_26_2_black_nac_5BB(
																							operand,
																							messageSend) == null) {
																						if (pattern_AltSysStepBFToComboRule_26_2_black_nac_6BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltSysStepBFToComboRule_26_2_black_nac_7BB(
																									operand,
																									messageReceive) == null) {
																								if (pattern_AltSysStepBFToComboRule_26_2_black_nac_8BB(
																										operand,
																										interaction) == null) {
																									if (pattern_AltSysStepBFToComboRule_26_2_black_nac_4BB(
																											guard,
																											operand) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
																												_edge_enclosingInteraction });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_26_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_26_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_27_1_binding = pattern_AltSysStepBFToComboRule_27_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_27_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_27_1_black = pattern_AltSysStepBFToComboRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_86896 = messageSend.getMessage();
		if (__DEC_messageSend_message_86896 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_8732 = messageReceive.getMessage();
		if (__DEC_messageReceive_message_8732 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_138958 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_138958 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_138958)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_45013 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_45013)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_60100 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_60100)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_27_2_blackFFFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageReceive = _edge_fragment.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (interaction
						.equals(messageReceive.getEnclosingInteraction())) {
					if (pattern_AltSysStepBFToComboRule_27_2_black_nac_1B(messageReceive) == null) {
						for (InteractionFragment tmpCombo : interaction
								.getFragment()) {
							if (tmpCombo instanceof CombinedFragment) {
								CombinedFragment combo = (CombinedFragment) tmpCombo;
								for (InteractionFragment tmpMessageSend : interaction
										.getFragment()) {
									if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
										if (!messageReceive.equals(messageSend)) {
											if (pattern_AltSysStepBFToComboRule_27_2_black_nac_0B(messageSend) == null) {
												for (Lifeline line : interaction
														.getLifeline()) {
													if (line.getCoveredBy()
															.contains(
																	messageSend)) {
														if (line.getCoveredBy()
																.contains(combo)) {
															for (InteractionOperand operand : combo
																	.getOperand()) {
																if (line.getCoveredBy()
																		.contains(
																				operand)) {
																	InteractionConstraint guard = operand
																			.getGuard();
																	if (guard != null) {
																		ValueSpecification tmpSpec = guard
																				.getSpecification();
																		if (tmpSpec instanceof LiteralString) {
																			LiteralString spec = (LiteralString) tmpSpec;
																			if (pattern_AltSysStepBFToComboRule_27_2_black_nac_2BB(
																					operand,
																					interaction) == null) {
																				if (pattern_AltSysStepBFToComboRule_27_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_27_2_black_nac_5BB(
																							operand,
																							messageSend) == null) {
																						if (pattern_AltSysStepBFToComboRule_27_2_black_nac_6BB(
																								operand,
																								combo) == null) {
																							if (pattern_AltSysStepBFToComboRule_27_2_black_nac_7BB(
																									operand,
																									messageReceive) == null) {
																								if (pattern_AltSysStepBFToComboRule_27_2_black_nac_8BB(
																										operand,
																										interaction) == null) {
																									if (pattern_AltSysStepBFToComboRule_27_2_black_nac_4BB(
																											guard,
																											operand) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
																												_edge_fragment });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_27_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_27_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_28_1_binding = pattern_AltSysStepBFToComboRule_28_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_28_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_28_1_black = pattern_AltSysStepBFToComboRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_28_2_blackFFFFFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					Actor actor = step.getActor();
					if (actor != null) {
						for (StepAlternative tmpAlt : step.getStepAlternative()) {
							if (tmpAlt instanceof AlternativeFlowAlternative) {
								AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
								NamedFlow tmpAltFlow = alt.getRef();
								if (tmpAltFlow instanceof AlternativeFlow) {
									AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
									if (pattern_AltSysStepBFToComboRule_28_2_black_nac_0BB(
											altFlow, step) == null) {
										for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														flow, UseCase.class,
														"flows")) {
											if (pattern_AltSysStepBFToComboRule_28_2_black_nac_1BB(
													useCase, altFlow) == null) {
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
																flow,
																useCase,
																packageDeclaration,
																step, alt,
																altFlow,
																_edge_steps });
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_28_3_expressionFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_28_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_29_1_binding = pattern_AltSysStepBFToComboRule_29_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_29_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_29_1_black = pattern_AltSysStepBFToComboRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_29_2_blackFFFFFFFB(
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
							if (pattern_AltSysStepBFToComboRule_29_2_black_nac_0BB(
									altFlow, step) == null) {
								for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(step,
												Flow.class, "steps")) {
									if (tmpFlow instanceof BasicFlow) {
										BasicFlow flow = (BasicFlow) tmpFlow;
										for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														actor,
														PackageDeclaration.class,
														"actors")) {
											for (UseCase useCase : packageDeclaration
													.getUseCases()) {
												if (useCase.getFlows()
														.contains(flow)) {
													if (pattern_AltSysStepBFToComboRule_29_2_black_nac_1BB(
															useCase, altFlow) == null) {
														_result.add(new Object[] {
																actor,
																flow,
																useCase,
																packageDeclaration,
																step, alt,
																altFlow,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_29_3_expressionFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_29_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_30_1_binding = pattern_AltSysStepBFToComboRule_30_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_30_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_30_1_black = pattern_AltSysStepBFToComboRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_30_2_blackFFFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (StepAlternative tmpAlt : step.getStepAlternative()) {
						if (tmpAlt instanceof AlternativeFlowAlternative) {
							AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
							NamedFlow tmpAltFlow = alt.getRef();
							if (tmpAltFlow instanceof AlternativeFlow) {
								AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
								if (pattern_AltSysStepBFToComboRule_30_2_black_nac_0BB(
										altFlow, step) == null) {
									for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(step,
													Flow.class, "steps")) {
										if (tmpFlow instanceof BasicFlow) {
											BasicFlow flow = (BasicFlow) tmpFlow;
											for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															actor,
															PackageDeclaration.class,
															"actors")) {
												for (UseCase useCase : packageDeclaration
														.getUseCases()) {
													if (useCase.getFlows()
															.contains(flow)) {
														if (pattern_AltSysStepBFToComboRule_30_2_black_nac_1BB(
																useCase,
																altFlow) == null) {
															_result.add(new Object[] {
																	actor,
																	flow,
																	useCase,
																	packageDeclaration,
																	step, alt,
																	altFlow,
																	_edge_actor });
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_30_3_expressionFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_30_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_31_1_binding = pattern_AltSysStepBFToComboRule_31_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_31_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_31_1_black = pattern_AltSysStepBFToComboRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_2_black_nac_0BB(
			AlternativeFlow altFlow, NormalStep step) {
		if (altFlow.getSteps().contains(step)) {
			return new Object[] { altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_2_black_nac_1BB(
			UseCase useCase, AlternativeFlow altFlow) {
		if (useCase.getFlows().contains(altFlow)) {
			return new Object[] { useCase, altFlow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_31_2_blackFFFFFFFB(
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
							if (pattern_AltSysStepBFToComboRule_31_2_black_nac_0BB(
									altFlow, step) == null) {
								for (Flow tmpFlow : org.moflon.util.eMoflonEMFUtil
										.getOppositeReferenceTyped(step,
												Flow.class, "steps")) {
									if (tmpFlow instanceof BasicFlow) {
										BasicFlow flow = (BasicFlow) tmpFlow;
										for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														actor,
														PackageDeclaration.class,
														"actors")) {
											for (UseCase useCase : packageDeclaration
													.getUseCases()) {
												if (useCase.getFlows()
														.contains(flow)) {
													if (pattern_AltSysStepBFToComboRule_31_2_black_nac_1BB(
															useCase, altFlow) == null) {
														_result.add(new Object[] {
																actor,
																flow,
																useCase,
																packageDeclaration,
																step, alt,
																altFlow,
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

		}

		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_31_3_expressionFBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Actor actor,
			BasicFlow flow, UseCase useCase,
			PackageDeclaration packageDeclaration, NormalStep step,
			AlternativeFlowAlternative alt, AlternativeFlow altFlow) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor, flow,
				useCase, packageDeclaration, step, alt, altFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_31_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_32_1_binding = pattern_AltSysStepBFToComboRule_32_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_32_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_32_1_black = pattern_AltSysStepBFToComboRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_878938 = messageSend.getMessage();
		if (__DEC_messageSend_message_878938 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_71465 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_71465 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_166895 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_166895 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_166895)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_368058 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_368058)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_148166 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_148166)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_32_2_blackFFFFFFFFB(
			EMoflonEdge _edge_operand) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCombo = _edge_operand.getSrc();
		if (tmpCombo instanceof CombinedFragment) {
			CombinedFragment combo = (CombinedFragment) tmpCombo;
			EObject tmpOperand = _edge_operand.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (combo.getOperand().contains(operand)) {
					Interaction interaction = combo.getEnclosingInteraction();
					if (interaction != null) {
						InteractionConstraint guard = operand.getGuard();
						if (guard != null) {
							ValueSpecification tmpSpec = guard
									.getSpecification();
							if (tmpSpec instanceof LiteralString) {
								LiteralString spec = (LiteralString) tmpSpec;
								if (pattern_AltSysStepBFToComboRule_32_2_black_nac_3BB(
										operand, combo) == null) {
									if (pattern_AltSysStepBFToComboRule_32_2_black_nac_6BB(
											operand, combo) == null) {
										if (pattern_AltSysStepBFToComboRule_32_2_black_nac_2BB(
												operand, interaction) == null) {
											if (pattern_AltSysStepBFToComboRule_32_2_black_nac_8BB(
													operand, interaction) == null) {
												if (pattern_AltSysStepBFToComboRule_32_2_black_nac_4BB(
														guard, operand) == null) {
													for (Lifeline line : combo
															.getCovered()) {
														if (interaction
																.equals(line
																		.getInteraction())) {
															if (line.getCoveredBy()
																	.contains(
																			operand)) {
																for (InteractionFragment tmpMessageSend : interaction
																		.getFragment()) {
																	if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																		if (line.getCoveredBy()
																				.contains(
																						messageSend)) {
																			if (pattern_AltSysStepBFToComboRule_32_2_black_nac_0B(messageSend) == null) {
																				if (pattern_AltSysStepBFToComboRule_32_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					for (InteractionFragment tmpMessageReceive : interaction
																							.getFragment()) {
																						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																							if (!messageReceive
																									.equals(messageSend)) {
																								if (pattern_AltSysStepBFToComboRule_32_2_black_nac_1B(messageReceive) == null) {
																									if (pattern_AltSysStepBFToComboRule_32_2_black_nac_7BB(
																											operand,
																											messageReceive) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_32_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_32_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_33_1_binding = pattern_AltSysStepBFToComboRule_33_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_33_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_33_1_black = pattern_AltSysStepBFToComboRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_189076 = messageSend.getMessage();
		if (__DEC_messageSend_message_189076 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_338098 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_338098 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_265905 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_265905 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_265905)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_411540 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_411540)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_267314 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_267314)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_33_2_blackFFFFFFFFB(
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
							for (InteractionFragment tmpMessageSend : line
									.getCoveredBy()) {
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (interaction.equals(messageSend
											.getEnclosingInteraction())) {
										if (pattern_AltSysStepBFToComboRule_33_2_black_nac_0B(messageSend) == null) {
											for (InteractionFragment tmpOperand : line
													.getCoveredBy()) {
												if (tmpOperand instanceof InteractionOperand) {
													InteractionOperand operand = (InteractionOperand) tmpOperand;
													if (combo.getOperand()
															.contains(operand)) {
														InteractionConstraint guard = operand
																.getGuard();
														if (guard != null) {
															ValueSpecification tmpSpec = guard
																	.getSpecification();
															if (tmpSpec instanceof LiteralString) {
																LiteralString spec = (LiteralString) tmpSpec;
																if (pattern_AltSysStepBFToComboRule_33_2_black_nac_2BB(
																		operand,
																		interaction) == null) {
																	if (pattern_AltSysStepBFToComboRule_33_2_black_nac_3BB(
																			operand,
																			combo) == null) {
																		if (pattern_AltSysStepBFToComboRule_33_2_black_nac_5BB(
																				operand,
																				messageSend) == null) {
																			if (pattern_AltSysStepBFToComboRule_33_2_black_nac_6BB(
																					operand,
																					combo) == null) {
																				if (pattern_AltSysStepBFToComboRule_33_2_black_nac_8BB(
																						operand,
																						interaction) == null) {
																					if (pattern_AltSysStepBFToComboRule_33_2_black_nac_4BB(
																							guard,
																							operand) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_33_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_33_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_33_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_33_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_34_1_binding = pattern_AltSysStepBFToComboRule_34_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_34_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_34_1_black = pattern_AltSysStepBFToComboRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_454830 = messageSend.getMessage();
		if (__DEC_messageSend_message_454830 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_902054 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_902054 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_178108 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_178108 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_178108)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_729352 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_729352)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_566841 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_566841)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_34_2_blackFFFFFFFFB(
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
							for (InteractionOperand operand : combo
									.getOperand()) {
								if (line.getCoveredBy().contains(operand)) {
									InteractionConstraint guard = operand
											.getGuard();
									if (guard != null) {
										ValueSpecification tmpSpec = guard
												.getSpecification();
										if (tmpSpec instanceof LiteralString) {
											LiteralString spec = (LiteralString) tmpSpec;
											if (pattern_AltSysStepBFToComboRule_34_2_black_nac_2BB(
													operand, interaction) == null) {
												if (pattern_AltSysStepBFToComboRule_34_2_black_nac_3BB(
														operand, combo) == null) {
													if (pattern_AltSysStepBFToComboRule_34_2_black_nac_6BB(
															operand, combo) == null) {
														if (pattern_AltSysStepBFToComboRule_34_2_black_nac_8BB(
																operand,
																interaction) == null) {
															if (pattern_AltSysStepBFToComboRule_34_2_black_nac_4BB(
																	guard,
																	operand) == null) {
																for (InteractionFragment tmpMessageSend : line
																		.getCoveredBy()) {
																	if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
																		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
																		if (interaction
																				.equals(messageSend
																						.getEnclosingInteraction())) {
																			if (pattern_AltSysStepBFToComboRule_34_2_black_nac_0B(messageSend) == null) {
																				if (pattern_AltSysStepBFToComboRule_34_2_black_nac_5BB(
																						operand,
																						messageSend) == null) {
																					for (InteractionFragment tmpMessageReceive : interaction
																							.getFragment()) {
																						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																							if (!messageReceive
																									.equals(messageSend)) {
																								if (pattern_AltSysStepBFToComboRule_34_2_black_nac_1B(messageReceive) == null) {
																									if (pattern_AltSysStepBFToComboRule_34_2_black_nac_7BB(
																											operand,
																											messageReceive) == null) {
																										_result.add(new Object[] {
																												line,
																												messageSend,
																												interaction,
																												combo,
																												messageReceive,
																												operand,
																												guard,
																												spec,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_34_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_34_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_35_1_binding = pattern_AltSysStepBFToComboRule_35_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_35_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_35_1_black = pattern_AltSysStepBFToComboRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_217909 = messageSend.getMessage();
		if (__DEC_messageSend_message_217909 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_444387 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_444387 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_280917 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_280917 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_280917)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_970554 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_970554)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_596868 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_596868)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_35_2_blackFFFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpOperand = _edge_coveredBy.getTrg();
			if (tmpOperand instanceof InteractionOperand) {
				InteractionOperand operand = (InteractionOperand) tmpOperand;
				if (line.getCoveredBy().contains(operand)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						InteractionConstraint guard = operand.getGuard();
						if (guard != null) {
							ValueSpecification tmpSpec = guard
									.getSpecification();
							if (tmpSpec instanceof LiteralString) {
								LiteralString spec = (LiteralString) tmpSpec;
								if (pattern_AltSysStepBFToComboRule_35_2_black_nac_2BB(
										operand, interaction) == null) {
									if (pattern_AltSysStepBFToComboRule_35_2_black_nac_8BB(
											operand, interaction) == null) {
										if (pattern_AltSysStepBFToComboRule_35_2_black_nac_4BB(
												guard, operand) == null) {
											for (InteractionFragment tmpMessageSend : line
													.getCoveredBy()) {
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (pattern_AltSysStepBFToComboRule_35_2_black_nac_0B(messageSend) == null) {
															if (pattern_AltSysStepBFToComboRule_35_2_black_nac_5BB(
																	operand,
																	messageSend) == null) {
																for (InteractionFragment tmpCombo : line
																		.getCoveredBy()) {
																	if (tmpCombo instanceof CombinedFragment) {
																		CombinedFragment combo = (CombinedFragment) tmpCombo;
																		if (interaction
																				.equals(combo
																						.getEnclosingInteraction())) {
																			if (combo
																					.getOperand()
																					.contains(
																							operand)) {
																				if (pattern_AltSysStepBFToComboRule_35_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_35_2_black_nac_6BB(
																							operand,
																							combo) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_35_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_35_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_35_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_35_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_36_1_binding = pattern_AltSysStepBFToComboRule_36_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_36_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_36_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_36_1_black = pattern_AltSysStepBFToComboRule_36_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_36_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_36_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_727097 = messageSend.getMessage();
		if (__DEC_messageSend_message_727097 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_919291 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_919291 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_293224 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_293224 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_293224)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_322096 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_322096)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_490314 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_490314)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_36_2_blackFFFFFFFFB(
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
						Interaction interaction = line.getInteraction();
						if (interaction != null) {
							ValueSpecification tmpSpec = guard
									.getSpecification();
							if (tmpSpec instanceof LiteralString) {
								LiteralString spec = (LiteralString) tmpSpec;
								if (pattern_AltSysStepBFToComboRule_36_2_black_nac_4BB(
										guard, operand) == null) {
									if (pattern_AltSysStepBFToComboRule_36_2_black_nac_2BB(
											operand, interaction) == null) {
										if (pattern_AltSysStepBFToComboRule_36_2_black_nac_8BB(
												operand, interaction) == null) {
											for (InteractionFragment tmpMessageSend : line
													.getCoveredBy()) {
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (pattern_AltSysStepBFToComboRule_36_2_black_nac_0B(messageSend) == null) {
															if (pattern_AltSysStepBFToComboRule_36_2_black_nac_5BB(
																	operand,
																	messageSend) == null) {
																for (InteractionFragment tmpCombo : line
																		.getCoveredBy()) {
																	if (tmpCombo instanceof CombinedFragment) {
																		CombinedFragment combo = (CombinedFragment) tmpCombo;
																		if (interaction
																				.equals(combo
																						.getEnclosingInteraction())) {
																			if (combo
																					.getOperand()
																					.contains(
																							operand)) {
																				if (pattern_AltSysStepBFToComboRule_36_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_36_2_black_nac_6BB(
																							operand,
																							combo) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_36_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_36_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_36_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_36_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_36_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_36_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_36_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_37_1_binding = pattern_AltSysStepBFToComboRule_37_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_37_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_37_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_37_1_black = pattern_AltSysStepBFToComboRule_37_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_37_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_37_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_565362 = messageSend.getMessage();
		if (__DEC_messageSend_message_565362 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_14460 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_14460 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_865641 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_865641 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_865641)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_499696 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_499696)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_893720 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_893720)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_37_2_blackFFFFFFFFB(
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
						if (pattern_AltSysStepBFToComboRule_37_2_black_nac_4BB(
								guard, operand) == null) {
							for (Lifeline line : operand.getCovered()) {
								Interaction interaction = line.getInteraction();
								if (interaction != null) {
									if (pattern_AltSysStepBFToComboRule_37_2_black_nac_2BB(
											operand, interaction) == null) {
										if (pattern_AltSysStepBFToComboRule_37_2_black_nac_8BB(
												operand, interaction) == null) {
											for (InteractionFragment tmpMessageSend : line
													.getCoveredBy()) {
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (pattern_AltSysStepBFToComboRule_37_2_black_nac_0B(messageSend) == null) {
															if (pattern_AltSysStepBFToComboRule_37_2_black_nac_5BB(
																	operand,
																	messageSend) == null) {
																for (InteractionFragment tmpCombo : line
																		.getCoveredBy()) {
																	if (tmpCombo instanceof CombinedFragment) {
																		CombinedFragment combo = (CombinedFragment) tmpCombo;
																		if (interaction
																				.equals(combo
																						.getEnclosingInteraction())) {
																			if (combo
																					.getOperand()
																					.contains(
																							operand)) {
																				if (pattern_AltSysStepBFToComboRule_37_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_37_2_black_nac_6BB(
																							operand,
																							combo) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_37_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_37_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_37_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_37_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_37_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_37_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_37_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_1_bindingFB(
			AltSysStepBFToComboRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_1_blackFBB(
			EClass __eClass, AltSysStepBFToComboRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_1_bindingAndBlackFFB(
			AltSysStepBFToComboRule _this) {
		Object[] result_pattern_AltSysStepBFToComboRule_38_1_binding = pattern_AltSysStepBFToComboRule_38_1_bindingFB(_this);
		if (result_pattern_AltSysStepBFToComboRule_38_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_AltSysStepBFToComboRule_38_1_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_38_1_black = pattern_AltSysStepBFToComboRule_38_1_blackFBB(
					__eClass, _this);
			if (result_pattern_AltSysStepBFToComboRule_38_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AltSysStepBFToComboRule_38_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_0B(
			MessageOccurrenceSpecification messageSend) {
		Message __DEC_messageSend_message_327737 = messageSend.getMessage();
		if (__DEC_messageSend_message_327737 != null) {
			return new Object[] { messageSend };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_1B(
			MessageOccurrenceSpecification messageReceive) {
		Message __DEC_messageReceive_message_568474 = messageReceive
				.getMessage();
		if (__DEC_messageReceive_message_568474 != null) {
			return new Object[] { messageReceive };
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_2BB(
			InteractionOperand operand, Interaction interaction) {
		Interaction __DEC_operand_enclosingInteraction_752765 = operand
				.getEnclosingInteraction();
		if (__DEC_operand_enclosingInteraction_752765 != null) {
			if (!interaction.equals(__DEC_operand_enclosingInteraction_752765)) {
				return new Object[] { operand, interaction };
			}
		}

		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_3BB(
			InteractionOperand operand, CombinedFragment combo) {
		for (CombinedFragment __DEC_operand_operand_851993 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(operand, CombinedFragment.class,
						"operand")) {
			if (!combo.equals(__DEC_operand_operand_851993)) {
				return new Object[] { operand, combo };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_4BB(
			InteractionConstraint guard, InteractionOperand operand) {
		for (InteractionOperand __DEC_guard_guard_823840 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(guard, InteractionOperand.class,
						"guard")) {
			if (!operand.equals(__DEC_guard_guard_823840)) {
				return new Object[] { guard, operand };
			}
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_5BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageSend) {
		if (operand.getFragment().contains(messageSend)) {
			return new Object[] { operand, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_6BB(
			InteractionOperand operand, CombinedFragment combo) {
		if (operand.getFragment().contains(combo)) {
			return new Object[] { operand, combo };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_7BB(
			InteractionOperand operand,
			MessageOccurrenceSpecification messageReceive) {
		if (operand.getFragment().contains(messageReceive)) {
			return new Object[] { operand, messageReceive };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_black_nac_8BB(
			InteractionOperand operand, Interaction interaction) {
		if (interaction.equals(operand.getEnclosingInteraction())) {
			return new Object[] { operand, interaction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_38_2_blackFFFFFFFFB(
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
						if (pattern_AltSysStepBFToComboRule_38_2_black_nac_4BB(
								guard, operand) == null) {
							for (Lifeline line : operand.getCovered()) {
								Interaction interaction = line.getInteraction();
								if (interaction != null) {
									if (pattern_AltSysStepBFToComboRule_38_2_black_nac_2BB(
											operand, interaction) == null) {
										if (pattern_AltSysStepBFToComboRule_38_2_black_nac_8BB(
												operand, interaction) == null) {
											for (InteractionFragment tmpMessageSend : line
													.getCoveredBy()) {
												if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
													MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
													if (interaction
															.equals(messageSend
																	.getEnclosingInteraction())) {
														if (pattern_AltSysStepBFToComboRule_38_2_black_nac_0B(messageSend) == null) {
															if (pattern_AltSysStepBFToComboRule_38_2_black_nac_5BB(
																	operand,
																	messageSend) == null) {
																for (InteractionFragment tmpCombo : line
																		.getCoveredBy()) {
																	if (tmpCombo instanceof CombinedFragment) {
																		CombinedFragment combo = (CombinedFragment) tmpCombo;
																		if (interaction
																				.equals(combo
																						.getEnclosingInteraction())) {
																			if (combo
																					.getOperand()
																					.contains(
																							operand)) {
																				if (pattern_AltSysStepBFToComboRule_38_2_black_nac_3BB(
																						operand,
																						combo) == null) {
																					if (pattern_AltSysStepBFToComboRule_38_2_black_nac_6BB(
																							operand,
																							combo) == null) {
																						for (InteractionFragment tmpMessageReceive : interaction
																								.getFragment()) {
																							if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
																								MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
																								if (!messageReceive
																										.equals(messageSend)) {
																									if (pattern_AltSysStepBFToComboRule_38_2_black_nac_1B(messageReceive) == null) {
																										if (pattern_AltSysStepBFToComboRule_38_2_black_nac_7BB(
																												operand,
																												messageReceive) == null) {
																											_result.add(new Object[] {
																													line,
																													messageSend,
																													interaction,
																													combo,
																													messageReceive,
																													operand,
																													guard,
																													spec,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AltSysStepBFToComboRule_38_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AltSysStepBFToComboRule_38_3_expressionFBBBBBBBBBB(
			AltSysStepBFToComboRule _this, Match match, Lifeline line,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction, CombinedFragment combo,
			MessageOccurrenceSpecification messageReceive,
			InteractionOperand operand, InteractionConstraint guard,
			LiteralString spec) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, line,
				messageSend, interaction, combo, messageReceive, operand,
				guard, spec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_38_4_expressionFBB(
			AltSysStepBFToComboRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_38_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_AltSysStepBFToComboRule_38_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_1_blackB(
			AltSysStepBFToComboRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToInteraction) {
		if (ruleResult.getCorrObjects().contains(flowToInteraction)) {
			return new Object[] { ruleResult, flowToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AltSysStepBFToComboRule_41_2_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList flowToInteractionList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpFlowToInteraction : flowToInteractionList
					.getEntryObjects()) {
				if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
					FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
					Flow tmpFlow = flowToInteraction.getSource();
					if (tmpFlow instanceof BasicFlow) {
						BasicFlow flow = (BasicFlow) tmpFlow;
						InteractionFragment tmpInteraction = flowToInteraction
								.getTarget();
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							if (pattern_AltSysStepBFToComboRule_41_2_black_nac_4BB(
									ruleResult, flowToInteraction) == null) {
								if (pattern_AltSysStepBFToComboRule_41_2_black_nac_3BB(
										ruleResult, flow) == null) {
									if (pattern_AltSysStepBFToComboRule_41_2_black_nac_5BB(
											ruleResult, interaction) == null) {
										for (Lifeline line : interaction
												.getLifeline()) {
											if (pattern_AltSysStepBFToComboRule_41_2_black_nac_6BB(
													ruleResult, line) == null) {
												for (UseCase useCase : org.moflon.util.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																flow,
																UseCase.class,
																"flows")) {
													if (pattern_AltSysStepBFToComboRule_41_2_black_nac_2BB(
															ruleResult, useCase) == null) {
														for (UseCaseToInteraction useCaseToInteraction : org.moflon.util.eMoflonEMFUtil
																.getOppositeReferenceTyped(
																		interaction,
																		UseCaseToInteraction.class,
																		"target")) {
															if (useCase
																	.equals(useCaseToInteraction
																			.getSource())) {
																if (pattern_AltSysStepBFToComboRule_41_2_black_nac_7BB(
																		ruleResult,
																		useCaseToInteraction) == null) {
																	for (PackageDeclaration packageDeclaration : org.moflon.util.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					useCase,
																					PackageDeclaration.class,
																					"useCases")) {
																		if (pattern_AltSysStepBFToComboRule_41_2_black_nac_1BB(
																				ruleResult,
																				packageDeclaration) == null) {
																			for (Actor actor : packageDeclaration
																					.getActors()) {
																				if (pattern_AltSysStepBFToComboRule_41_2_black_nac_0BB(
																						ruleResult,
																						actor) == null) {
																					_result.add(new Object[] {
																							flowToInteractionList,
																							actor,
																							packageDeclaration,
																							useCase,
																							flow,
																							flowToInteraction,
																							interaction,
																							line,
																							useCaseToInteraction,
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

	public static final Object[] pattern_AltSysStepBFToComboRule_41_3_bindingFBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, line, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, packageDeclaration,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor, line,
					interaction, flowToInteraction, flow, useCase,
					useCaseToInteraction, packageDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_3_bindingAndBlackFBBBBBBBBBBB(
			AltSysStepBFToComboRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AltSysStepBFToComboRule_41_3_binding = pattern_AltSysStepBFToComboRule_41_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, actor, line, interaction,
				flowToInteraction, flow, useCase, useCaseToInteraction,
				packageDeclaration, ruleResult);
		if (result_pattern_AltSysStepBFToComboRule_41_3_binding != null) {
			CSP csp = (CSP) result_pattern_AltSysStepBFToComboRule_41_3_binding[0];

			Object[] result_pattern_AltSysStepBFToComboRule_41_3_black = pattern_AltSysStepBFToComboRule_41_3_blackB(csp);
			if (result_pattern_AltSysStepBFToComboRule_41_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						line, interaction, flowToInteraction, flow, useCase,
						useCaseToInteraction, packageDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AltSysStepBFToComboRule_41_4_expressionFBB(
			AltSysStepBFToComboRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_5_blackBBBBBBBB(
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration) {
		return new Object[] { actor, line, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, packageDeclaration };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_6_blackBBBBBBBBB(
			Actor actor, Lifeline line, Interaction interaction,
			FlowToInteractionFragment flowToInteraction, BasicFlow flow,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			PackageDeclaration packageDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { actor, line, interaction, flowToInteraction,
				flow, useCase, useCaseToInteraction, packageDeclaration,
				ruleResult };
	}

	public static final Object[] pattern_AltSysStepBFToComboRule_41_6_greenBBFBFFBFFFFFFFFFBB(
			Actor actor, Lifeline line, Interaction interaction,
			BasicFlow flow, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		CombinedFragment combo = ModalSequenceDiagramFactory.eINSTANCE
				.createCombinedFragment();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		AlternativeFlowAlternative alt = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlowAlternative();
		NormalStepToCombinedFragment stepToCombo = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createNormalStepToCombinedFragment();
		InteractionOperand operand = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionOperand();
		StepAlternativeToInteractionOperand alternative1ToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createStepAlternativeToInteractionOperand();
		InteractionConstraint guard = ModalSequenceDiagramFactory.eINSTANCE
				.createInteractionConstraint();
		LiteralString spec = ModalSequenceDiagramFactory.eINSTANCE
				.createLiteralString();
		AlternativeFlow altFlow = UseCaseDSLFactory.eINSTANCE
				.createAlternativeFlow();
		FlowToInteractionFragment altFlowToOperand = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
				.createFlowToInteractionFragment();
		Object _localVariable_0 = csp.getValue("combo", "interactionOperator");
		Object _localVariable_1 = csp.getValue("step", "type");
		Object _localVariable_2 = csp.getValue("alt", "condition");
		Object _localVariable_3 = csp.getValue("guard", "name");
		Object _localVariable_4 = csp.getValue("spec", "value");
		Object _localVariable_5 = csp.getValue("altFlow", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		line.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(messageSend);
		combo.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(combo);
		ruleResult.getTargetObjects().add(combo);
		messageReceive.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(messageReceive);
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		step.getStepAlternative().add(alt);
		ruleResult.getSourceObjects().add(alt);
		stepToCombo.setSource(step);
		stepToCombo.setTarget(combo);
		ruleResult.getCorrObjects().add(stepToCombo);
		combo.getOperand().add(operand);
		line.getCoveredBy().add(operand);
		ruleResult.getTargetObjects().add(operand);
		alternative1ToOperand.setSource(alt);
		alternative1ToOperand.setTarget(operand);
		ruleResult.getCorrObjects().add(alternative1ToOperand);
		operand.setGuard(guard);
		ruleResult.getTargetObjects().add(guard);
		guard.setSpecification(spec);
		ruleResult.getTargetObjects().add(spec);
		alt.setRef(altFlow);
		ruleResult.getSourceObjects().add(altFlow);
		altFlowToOperand.setSource(altFlow);
		altFlowToOperand.setTarget(operand);
		ruleResult.getCorrObjects().add(altFlowToOperand);
		InteractionOperatorKind combo_interactionOperator_prime = (InteractionOperatorKind) _localVariable_0;
		StepType step_type_prime = (StepType) _localVariable_1;
		String alt_condition_prime = (String) _localVariable_2;
		String guard_name_prime = (String) _localVariable_3;
		String spec_value_prime = (String) _localVariable_4;
		String altFlow_name_prime = (String) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		combo.setInteractionOperator(combo_interactionOperator_prime);
		step.setType(step_type_prime);
		alt.setCondition(alt_condition_prime);
		guard.setName(guard_name_prime);
		spec.setValue(spec_value_prime);
		altFlow.setName(altFlow_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, line, messageSend, interaction, combo,
				messageReceive, flow, step, alt, stepToCombo, operand,
				alternative1ToOperand, guard, spec, altFlow, altFlowToOperand,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AltSysStepBFToComboRule_41_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AltSysStepBFToComboRuleImpl
